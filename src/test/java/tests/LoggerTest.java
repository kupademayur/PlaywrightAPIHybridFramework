package tests;

import org.testng.annotations.Test;

import utils.LogUtil;

public class LoggerTest {
	
	@Test
	public void verifyLogging() {
		
		LogUtil.logger.info("Framework logging working");
	}

}
