package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.config.ConfigManager;
import com.api.constants.ResponseMessages;
import io.restassured.response.Response;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.LogoutResponse;

@Listeners(com.api.listeners.TestListener.class)

public class LoginAPITest {
	private String token;

	@Test(priority = 1, description = "Verify if login API is working")
	public void loginTest() {
		LoginRequest loginrequest = new LoginRequest(ConfigManager.userEmail(), ConfigManager.userPassword());
		AuthService authservice = new AuthService();
		Response response = authservice.login(loginrequest);
		// when i get the response, i will deserialize the response by calling the as method
		LoginResponse loginresponse = response.as(LoginResponse.class);
		// System.out.println(response.asPrettyString());
		// System.out.println(loginresponse.getResponseData().getAccessToken());
		token = loginresponse.getResponseData().getAccessToken();
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(loginresponse.getMessage(), ResponseMessages.AUTH_SUCCESS);
		Assert.assertNotNull(token);
	}

	@Test(priority = 2, description = "Verify if logout API is working", dependsOnMethods = "loginTest")
	public void logoutTest() {
		AuthService authservice = new AuthService();
		Response response = authservice.logout(token);
		Assert.assertEquals(response.getStatusCode(), 200);
		LogoutResponse logoutResponse = response.as(LogoutResponse.class);
		Assert.assertEquals(logoutResponse.getMessage(), ResponseMessages.LOGOUT_SUCCESS);
	}
}