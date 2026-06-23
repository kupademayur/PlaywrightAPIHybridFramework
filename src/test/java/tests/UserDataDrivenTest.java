package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.UserAPI;
import io.restassured.response.Response;
import models.TestUserData;
import models.User;
import utils.JsonDataReader;

public class UserDataDrivenTest {
	
	@Test
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
