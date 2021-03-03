package LocalTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LocalTestPatch {

	@Test
	public void patch() {
		JSONObject req = new JSONObject();
		req.put("lName", "yaragani");
		baseURI = "http://localhost:3000";
		Response res = given().
			header("Content-Type", "application/json").contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(req.toJSONString()).log().all().
		when().
			patch("/users/3");
		System.out.println(res.getStatusCode());
	}
}
