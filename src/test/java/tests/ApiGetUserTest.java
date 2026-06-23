package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.ApiClient;
import io.restassured.response.Response;


@Epic("API Automation")
@Feature("User API")
public class ApiGetUserTest {
	
	@Test
	@Description("Verify GET User API returns status code 200")
	@Severity(SeverityLevel.CRITICAL)
	public void verifyGetUser() {
		
		// API code
		
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
