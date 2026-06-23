package models;

public class TestUserData {
	
	private int userId;
	private String expectedName;
	private String expectedEmail;
	
	public TestUserData() {
		
	}
	
	public int getUserId() {
		
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getExpectedName() {
		return expectedName;
	}
	
	public void setExpectedName(String expectedName) {
		this.expectedName = expectedName;
	}
	
	public String getExpectedEmail() {
		return expectedEmail;
	}
	
	public void setExpectedEmail(String expectedEmail) {
		this.expectedEmail = expectedEmail;
	}

}
