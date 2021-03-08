package APIautomation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.IOException;
import org.testng.annotations.Test;

public class DeleteTest {

	@Test
	public void delete() throws IOException {
		
		String url = ReadInput.getUrl();
		baseURI = url;
		
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
