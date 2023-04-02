
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

public class ApiTesting {
        @Test
        public void testCompletedStatusOfID19 () {

            given()
                    .when()
                    .get("https://dummyjson.com/todos")
                    .then()
                    .statusCode(200)
                    .body("findAll{it.id == 19}.completed", equalTo(true));

        }
    }
