package APIautomation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DeleteTest {

	public static Properties prop;
	@Test
	public void delete() {
		
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
					.log().all().header("Content-Type", "application/json").body(APIService.getBody()).
				when()
					.delete("/#/pet/deletePet/tags.id[1]").
				then()
					.assertThat().statusCode(405).extract().response().asString();

		System.out.println(res);
	}
}
