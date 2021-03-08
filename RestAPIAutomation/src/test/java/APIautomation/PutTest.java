package APIautomation;

import static io.restassured.RestAssured.baseURI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class PutTest {

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

		String res = 
				given()
					.log().all().header("Content-Type", "application/json")
					.body(APIService.putBody("1", "snoopy")).
				when()
					.post(prop.getProperty("puturl")).
				then()
					.assertThat().statusCode(404).extract().response().asString();

		System.out.println(res);
	}
}
