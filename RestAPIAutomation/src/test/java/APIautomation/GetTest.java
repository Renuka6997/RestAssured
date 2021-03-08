package APIautomation;

import java.io.IOException;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class GetTest {

	@Test
	public void get() throws IOException {

		String url = ReadInput.getUrl();
		baseURI = url;

		JsonPath js = new JsonPath(PayLoad.getBody());

		int count=	js.getInt("category.size()");
		System.out.println(count);
		for(int i=0;i<count;i++)
		  {
			  String cat_names=js.get("category["+i+"].name");
			  System.out.println(js.get("category["+i+"].name").toString());
			  System.out.println(cat_names);	
		  }
		given().log().all()
			.queryParam("status", "pending").
			header("Content-Type", "application/json").contentType(ContentType.JSON).
			accept(ContentType.JSON)
		.when()
			.get(APIServiceConstant.getservicename)
		.then()
			.header("server", "nginx").assertThat().log().all().statusCode(404);
	}

}
