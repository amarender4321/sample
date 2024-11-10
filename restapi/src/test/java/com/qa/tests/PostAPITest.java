package com.qa.tests;
import java.util.HashMap;
import org.json.JSONObject;
import java.io.*;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.data.Users;

public class PostAPITest extends TestBase{

	public PostAPITest() throws FileNotFoundException {
		super();
	}
	
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closebaleHttpResponse;

	@BeforeMethod
	public void setUp() throws FileNotFoundException {
		testBase = new TestBase();
		serviceUrl=prop.getProperty("URL");
		apiUrl=prop.getProperty("serviceURL");
		url= serviceUrl+apiUrl;	
	}
	
	@Test
	public void postAPITest() throws JsonGenerationException, JsonMappingException, IOException {
		restClient= new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");

		ObjectMapper mapper= new  ObjectMapper();
		Users user= new Users("morpheus","Leader");
		mapper.writeValue(new File("\\Users\\Narender Reddy\\eclipse-workspace\\restapi\\src\\main\\java\\com\\qa\\data\\users.json"), user);

		String userJsonString = mapper.writeValueAsString(user);
		System.out.println(userJsonString);

		closebaleHttpResponse=restClient.post(url, userJsonString, headerMap);
		//1.status code:
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, testBase.RESPONSE_STATUS_CODE_201);

		//2. JsonString:
		String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(),"UTF-8");

		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("The response from API is:"+ responseJson);

		//json to java object:
		Users userResObj = mapper.readValue(userJsonString, Users.class);
		System.out.println(userResObj);

		Assert.assertTrue(user.getName().equals(userResObj.getName()));
		Assert.assertTrue(user.getJob().equals(userResObj.getJob()));

		System.out.println(userResObj.getId());
		System.out.println(userResObj.getCreatedAt());
//		Assert.assertTrue(user.getId().equals(userResObj.getId()));
//		Assert.assertTrue(user.getCreatedAt().equals(userResObj.getCreatedAt()));




	}


}

