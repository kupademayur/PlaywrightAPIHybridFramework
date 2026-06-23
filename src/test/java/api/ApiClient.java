package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.ConfigReader;

public class ApiClient {
	
	static {
		
		RestAssured.baseURI = 
				ConfigReader.getProperty("apiUrl");
	}
	
	public static Response get(String endpoint) {
		
		return RestAssured
				.given()
				.when()
				.get(endpoint)
				.then()
				.extract()
				.response();
	}

}
