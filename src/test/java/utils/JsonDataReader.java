package utils;

import java.io.File;

import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

public class JsonDataReader {
	
	private static final ObjectMapper mapper =
			new ObjectMapper();
	
	public static <T> T readJson(
			String filePath,
			Class<T> clazz) {
		try {
			
			return mapper.readValue(
					new File(filePath), 
					clazz);
		} catch(Exception e) {
			throw new RuntimeException(
					"Unable to read JSON file",
					e);
		}
	}

}
