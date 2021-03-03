package demos;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class TestEx2 {

	@Test
	public void getEx2() {
		baseURI = "https://reqres.in/api";
		given().
			get("/users?page=2").
		then().
			statusCode(200).body("data[3].email", equalTo("byron.fields@reqres.in")).log().all();
		System.out.println("email is validated");
	}
}
