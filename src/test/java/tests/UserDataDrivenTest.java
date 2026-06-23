package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.UserAPI;
import io.restassured.response.Response;
import models.TestUserData;
import models.User;
import utils.JsonDataReader;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Epic("API Automation")
@Feature("Data Driven Testing")
public class UserDataDrivenTest {
	
	@Test
	@Description("Verify user data using JSON driven test")
	@Severity(SeverityLevel.CRITICAL)
	public void verifyUserUsingJsonData() {
		
		TestUserData testData =
				JsonDataReader.readJson("src/test/resources/testdata/userData.json", 
						TestUserData.class);
		
		UserAPI userAPI = new UserAPI();
		
		Response response =
				userAPI.getUser(
						testData.getUserId());
		
		User user =
				response.as(User.class);
		
		Assert.assertEquals(
				user.getName(),
				testData.getExpectedName());
		
		Assert.assertEquals(
				user.getEmail(),
				testData.getExpectedEmail());
		
		System.out.println(
				"User validation successful");
	}

}
