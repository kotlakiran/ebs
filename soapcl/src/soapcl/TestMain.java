package soapcl;

import javax.xml.ws.Endpoint;

public class TestMain {

	public static void main(String[] args) {
	
		TestSoap main=new TestSoap();
		
		Endpoint.publish("http://localhost:8002/ws",main);
		
		
	}

}
