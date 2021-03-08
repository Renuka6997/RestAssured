package APIautomation;

import static io.restassured.RestAssured.baseURI;

import java.io.IOException;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class PostTest {

	@Test
	public void post() throws IOException {

		String url = ReadInput.getUrl();
		baseURI = url;

		String response =
				given()
				   	.log().all().header("Content-Type", "application/json")
				   	.body(PayLoad.postBody(1, "pinky"))
				.when()
					.post(APIServiceConstant.postservicename).
			    then()
			    	.assertThat().statusCode(404).header("server", "nginx").extract()
					.response().asString();

		System.out.println(response);

	}
}
