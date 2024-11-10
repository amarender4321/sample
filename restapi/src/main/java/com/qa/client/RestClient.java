package com.qa.client;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
public class RestClient {
	
	//1.Get Method without Headers :
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException, ParseException {
	CloseableHttpClient httpClient = HttpClients.createDefault();
	HttpGet httpget = new HttpGet(url); //http get request
	CloseableHttpResponse closebalHttpResponse = httpClient.execute(httpget);
	
	return closebalHttpResponse;
	}
	
	// Get Method with Headers :
	public CloseableHttpResponse get(String url, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
	CloseableHttpClient httpClient = HttpClients.createDefault();
	HttpGet httpget = new HttpGet(url); //http get request

	for(Map.Entry<String,String> entry : headerMap.entrySet()){
		httpget.addHeader(entry.getKey(), entry.getValue());
	}
	
	CloseableHttpResponse closebaleHttpResponse =  httpClient.execute(httpget); //hit the GET URL
	return closebaleHttpResponse;
	
	}
	
	//2. Post Methods :
	public CloseableHttpResponse post(String url, String entityString,HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
	HttpPost httppost = new HttpPost(url);//http post request
	httppost.setEntity(new StringEntity(entityString));
	
	//for header:
	for(Map.Entry<String, String> entry : headerMap.entrySet()) {
		httppost.addHeader(entry.getKey(),entry.getValue());
		
	}
	CloseableHttpResponse closebaleHttpResponse = httpClient.execute(httppost);
	
	return closebaleHttpResponse;
	}
	
	
	//a/status code
//int statusCode = closebalHttpResponse.getStatusLine().getStatusCode();
//System.out.println("Status Code---->"+ statusCode);
//
////b.Json String
// String responseString = EntityUtils.toString(closebalHttpResponse.getEntity(), "UTF-8");
// 
// JSONObject reponseJson= new JSONObject(responseString);
// System.out.println("Response JSON from API ----> "+reponseJson);
// 
// //c.All Headers
// 
// Header[] headersArray = closebalHttpResponse.getAllHeaders();
// HashMap<String, String> allHeaders = new HashMap<String, String>();
// for(Header header : headersArray) {
//	 
//	 allHeaders.put(header.getName(), header.getValue());
// }
//		System.out.println("Header Array-->"+allHeaders);
//	}

	
}
