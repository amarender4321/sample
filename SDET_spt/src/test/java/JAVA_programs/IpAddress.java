package JAVA_programs;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;
public class IpAddress {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the url");
		String	website=scanner.nextLine();

		try {
			InetAddress ip = InetAddress.getByName(website);
			System.out.println("Ip address of the given URL is "+ip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ip address of the given URL invalid");
		}
		scanner.close();
	}

}
