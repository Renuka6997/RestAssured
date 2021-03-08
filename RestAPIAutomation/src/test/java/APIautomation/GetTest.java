package APIautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class GetTest {

	public static Properties prop;

	@Test
	public void get() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("./src/test/java/APIautomation/Baseurl.properties");
			prop.load(file);
		} catch (IOException e) {
			e.getMessage();
		}

		baseURI = prop.getProperty("baseurl");

		JsonPath js = new JsonPath(APIService.getBody());

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
			.get(prop.getProperty("geturl"))
		.then()
			.header("server", "nginx").assertThat().log().all().statusCode(404);
	}
}
