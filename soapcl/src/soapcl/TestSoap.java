package soapcl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class TestSoap {
	@WebMethod
	@WebResult(name="welcome")
	public String getWelcome(@WebParam(name="entermsg")String msg)
	{
		
		return msg;
	}

}
