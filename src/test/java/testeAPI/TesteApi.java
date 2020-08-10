package testeAPI;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class TesteApi {

    @Test
    public void testeApi() {

        String url = "https://run.mocky.io/v3/294bc66f-d2fc-41ce-be1e-2affd855891d";
        String corpo = "{\"hello\":\"world\"}";

        Response response =
                given().
                contentType("application/json").
                body(corpo).
                when().
                get(url);

        response.
                then().
                body("hello", containsString("world")).
                statusCode(200);

        System.out.println("Response Body: \n" + response.body().asString() + "\n Response statusCode: " + response.statusCode());

    }
}

