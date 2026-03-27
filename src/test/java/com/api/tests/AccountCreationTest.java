package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.config.ConfigManager;
import com.api.constants.ResponseMessages;
import com.api.models.request.SignUpRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Verify if sign up API is working")
	public void createAccountTest() {
		SignUpRequest signUpRequest = new SignUpRequest.Builder()
				.firstName("Qunoot")
				.lastName("Muzaffar")
				.email("qunootahmed_" + Long.toString(System.currentTimeMillis(), 36) + "_"
						+ (int) (Math.random() * 1000) + "@yopmail.com")
				.password(ConfigManager.userPassword())
				.build();
		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequest);
		//System.out.println(response.asPrettyString());
		LoginResponse loginresponse = response.as(LoginResponse.class);
		Assert.assertEquals(loginresponse.getMessage(), ResponseMessages.AUTH_SUCCESS);
		Assert.assertTrue(loginresponse.getResponseData().getAccessToken() != null);
	}
}