package APIautomation;

import static io.restassured.RestAssured.baseURI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class PostTest {

	public static Properties prop;

	@Test
	public void post() {

		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("./src/test/java/APIautomation/Baseurl.properties");
			prop.load(file);
		} catch (IOException e) {
			e.getMessage();
		}

		baseURI = prop.getProperty("baseurl");

		String response =
				given()
				   	.log().all().header("Content-Type", "application/json")
				   	.body(APIService.postBody(1, "pinky"))
				.when()
					.post(prop.getProperty("posturl")).
			    then()
			    	.assertThat().statusCode(404).header("server", "nginx").extract()
					.response().asString();

		System.out.println(response);

	}
}
