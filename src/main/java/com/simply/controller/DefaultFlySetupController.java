package com.simply.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class DefaultFlySetupController {
	
	  @Autowired
	  private ;
	  
	  @Override
	  public Setup createSetup(OrderRequest orderRequest) {
	    log.debug("Order={}", orderRequest);
	    return jeepOrderService.createOrder(orderRequest);
	  }

}
