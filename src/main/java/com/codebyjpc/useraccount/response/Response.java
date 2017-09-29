package com.codebyjpc.useraccount.response;

public class Response {
	
	private Boolean status;
	private Object data;
	
	public Response() {

	}

	public Response(Boolean status, Object data) {
		this.status = status;
		this.data = data;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

}
