package com.api.models.response;

public class LoginResponse {
	private String status;
	private String statusCode;
	private String message;
	private LoginResponseData responseData;

	public LoginResponse(String status, String statusCode, String message, LoginResponseData responseData) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
		this.responseData = responseData;
	}

	public LoginResponse() {
	}

	@Override
	public String toString() {
		return "LoginResponse [status=" + status + ", statusCode=" + statusCode + ", message=" + message
				+ ", responseData=" + responseData + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LoginResponseData getResponseData() {
		return responseData;
	}

	public void setResponseData(LoginResponseData responseData) {
		this.responseData = responseData;
	}
}
