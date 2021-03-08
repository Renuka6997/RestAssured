package APIautomation;

import static io.restassured.RestAssured.baseURI;

import java.io.IOException;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class PutTest {

	@Test
	public void post() throws IOException {

		String url = ReadInput.getUrl();
		baseURI = url;

		String res = 
				given()
					.log().all().header("Content-Type", "application/json")
					.body(PayLoad.putBody("1", "snoopy")).
				when()
					.post(APIServiceConstant.postservicename).
				then()
					.assertThat().statusCode(404).extract().response().asString();

		System.out.println(res);
	}
}
