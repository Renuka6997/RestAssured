package demos;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPut {

	public static Properties prop;
	@Test
	public void putProp() {
		
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("./src/test/java/demos/Test.properties");
			prop.load(file);
		} catch (IOException e) {
			e.getMessage();
		}
		
		
		JSONObject req = new JSONObject();
		req.put("job", "Doctor");
		req.put("Id", "89");
		System.out.println(req.toJSONString());
		
		baseURI = prop.getProperty("url");
		 
		given().
			header("Content-Type","applicationTest/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(req.toJSONString()).
		when().
			put(prop.getProperty("puturl")).
	    then().
			statusCode(200).log().all();
	}
}
