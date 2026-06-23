package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.ApiClient;
import io.restassured.response.Response;

public class ApiGetUserTest {
	
	@Test
	public void verifyGetUser() {
		
		Response response =
				ApiClient.get("/users/1");
		
		System.out.println(
				"Status Code : "
				+ response.getStatusCode());
		
		System.out.println(
				response.asPrettyString());
		
		Assert.assertEquals(
				response.getStatusCode(), 
				200);
	}

}
