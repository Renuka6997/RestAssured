package LocalTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class LocalTestGet {

	@Test
	public void get() {
		baseURI ="http://localhost:3000";
		Response res=given().
		get("/users");
		System.out.println(res.getStatusCode());
//		then().
//		statusCode(200).log().all();
	}
}
