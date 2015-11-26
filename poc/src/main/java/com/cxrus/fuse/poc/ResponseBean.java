package com.cxrus.fuse.poc;


public class ResponseBean {

	public com.cxrus.fuse.poc.model.Response init() {
		com.cxrus.fuse.poc.model.Response response= new com.cxrus.fuse.poc.model.Response();
		
		response.setStatus(javax.ws.rs.core.Response.Status.OK.toString());
		
		return response;
	}
	
}
