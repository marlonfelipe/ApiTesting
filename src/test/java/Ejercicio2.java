import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
public class Ejercicio2 {
    @Test
    public void testUnauthorizedAccess() {

        given()
                .when()
                .get("https://dummyjson.com/auth/todos")
                .then()
                .statusCode(401)
                .body("message", equalTo("Unauthorized"));
    }
}
