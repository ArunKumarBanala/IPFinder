package org.arun;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("you need to pass in IP address");
		}else {
			String ipAddress = args[0];
			stub.getCountryName(ipAddress);
		}
	}

}
