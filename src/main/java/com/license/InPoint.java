package com.license;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class InPoint  implements Callable{

	public static void main(String[] args) {
		System.out.println("running success");
	}

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		MuleMessage message = eventContext.getMessage();

		// get file original name
		String fileName = message.getOutboundProperty("originalFilename");
		System.out.println(fileName);
		return null;
	}

}
