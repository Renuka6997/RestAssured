package demos;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class TestEx3 {

	@Test
	public void getEx3() {
		baseURI = "https://reqres.in/api";
		given().
			get("/users?page=2").
		then().
			statusCode(200).	
			body("data[3].first_name",equalTo("Byron")).
			body("data.first_name",hasItems("George","Rachel"));
		System.out.println("First names got validated");
	}
}
