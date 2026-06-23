package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.UserAPI;
import io.restassured.response.Response;
import models.User;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Epic("API Automation")
@Feature("POJO Mapping")
public class UserPojoTest {
	
	@Test
	@Description("Verify JSON response mapped to User POJO")
	@Severity(SeverityLevel.NORMAL)
	public void verifyUserPojoMapping() {
		
		UserAPI userAPI = new UserAPI();
		
		Response response =
				userAPI.getUser(1);
		
		User user =
				response.as(User.class);
		
		System.out.println(
				"Name : " + user.getName());
		
		System.out.println(
				"Email : " + user.getEmail());
		
		Assert.assertEquals(
				user.getId(), 
				1);
	}

}
