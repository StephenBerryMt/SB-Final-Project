package com.simply.controller.support;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.simply.entity.*;

public class FetchSetupTestSupport {
	
	protected List<FFSetup> buildExpected() {
		List<FFSetup> list = new LinkedList<>();
		
		
//		@formatter:off
		list.add(FlyRod.builder()
				.rod_model(rod_model.SAGE)
				.rod_weight(5)
				.rod_length("9 foot")
				.build());
		
		list.add(FlyReel.builder()
				.reel_model(reel_model.CHEEKY)
				.reel_weight(5)
				.build());
		
		list.add(FlyLine.builder()
				.line_model(line_model.SAGE)
				.rod_weight(5)
				.build());

//		@formatter:on
		
		Collections.sort(list);
	return list;
	}
	
//	@param error
//	@param status
	
	protected void assertErrorMessageValid(Map<String, Object> error, HttpStatus status) {
		//	    @formatter:off
	    assertThat(error)
	    .containsKey("message")
	    .containsEntry("status code", status.value())
	    .containsEntry("uri", "/fly-fishing-setup")
	    .containsKey("timestamp")
	    .containsEntry("reason", status.getReasonPhrase());
//		@formatter:on
	}

}
