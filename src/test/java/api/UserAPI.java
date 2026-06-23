package api;

import io.restassured.response.Response;

public class UserAPI {
	
	public Response getUser(int userId) {
		
		return ApiClient.get("/users/" + userId);
	}

}
