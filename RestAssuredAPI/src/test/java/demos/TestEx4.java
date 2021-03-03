package demos;

//import java.util.HashMap;
//import java.util.Map;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestEx4 {

	@Test
	public void postEx() {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "Renu");
//		map.put("job", "Engineer");
//		System.out.println(map);
//		JSONObject request = new JSONObject(map);
//		System.out.println(request);
//		System.out.println(request.toString());
		JSONObject request = new JSONObject();
		request.put("name", "renu");
		request.put("job", "teacher");
		System.out.println(request.toString());
		System.out.println(request.toJSONString());
		baseURI = "https://reqres.in/api";
//		given().
//		body(request.toJSONString()).
		given().
			header("Content-Type", "application/json").contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201).log().all();	
		System.out.println("post got validated");
	}
}