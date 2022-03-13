package com.simply.controller.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

public class CreateSetupTestSupport extends BaseTest {


	 @Autowired
	  private TestRestTemplate restTemplate;
	  
	  @LocalServerPort
	  private int serverPort;
	  
	public TestRestTemplate getRestTemplate() {
	    
	    return this.restTemplate;
	  }

	private String getBaseUriForSetup() {
	  
	  return String.format("http://localhost:%d/fly-fishing-setup", serverPort);
	}
	
	  protected String createSetupBody() {
	    // @formatter:off
	    return  "{\n"
	              + " \"RodModel\":\"SAGE\",\n"
	              + " \"rodWeight\":\"5\",\n"
	              + " \"trodLength\":\"9 foot\",\n"
	              + " \"ReelModel\"CHEEKY,\n"
	              + " \"reelWeight\":\"5\",\n"
	              + " \"LineModel\":\"RIO\",\n"      
	              + " \"lineWeight\":\"5\",\n"
	              + "}";
	    // @formatter:on
	  }
	
}
