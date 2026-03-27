package com.api.base;

import com.api.models.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
//CREATING THE REQUEST
//HANDLING RESPONSE

	private RequestSpecification requestSpecification; // req spec is instance variable

	static {
	    RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
	}

	public BaseService() {
		requestSpecification = RestAssured.given();
	}

	protected void setAuthToken(String token) {
		requestSpecification.header("Authorization", "Bearer " + token);
	}

	protected Response postRequest(String baseUrl, Object payload, String endpoint) {
		return requestSpecification.baseUri(baseUrl).contentType(ContentType.JSON).body(payload).post(endpoint);
	}

	protected Response getRequest(String baseUrl, String endpoint) {
		return requestSpecification.get(baseUrl + endpoint);
	}
}