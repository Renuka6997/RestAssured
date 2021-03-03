package LocalTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
//import io.restassured.response.Response;

public class LocalTestPut {

	@Test
	public void put() {
		JSONObject req = new JSONObject();
		req.put("firstName", "urmi");
		req.put("lName", "y");
		req.put("subject", "3");
		req.put("id", "3");
		baseURI = "http://localhost:3000";
		given().
			header("Content-Type", "application/json").contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(req.toJSONString()).
		when().
			put("/users/3").
//		System.out.println(res.getStatusCode());
		then().statusCode(200).log().all();
	}
}