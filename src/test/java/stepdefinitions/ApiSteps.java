package stepdefinitions;

import api.UserCrudFlow;
import io.cucumber.java.id.Ketika;
import io.cucumber.java.id.Maka;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiSteps {

    private final UserCrudFlow userCrudFlow = new UserCrudFlow();
    private Response response;

    /**
     * GET SINGLE USER
     */
    @Ketika("User mengirim request GET user berdasarkan ID")
    public void getSingleUser() {

        response = userCrudFlow.getSingleUser();

    }

    /**
     * GET LIST USER
     */
    @Ketika("User mengirim request GET daftar user")
    public void getListUser() {

        response = userCrudFlow.getListUser();

    }

    /**
     * CREATE USER
     */
    @Ketika("User mengirim request POST create user")
    public void createUser() {

        response = userCrudFlow.createUser();

    }

    /**
     * UPDATE USER
     */
    @Ketika("User mengirim request PUT update user")
    public void updateUser() {

        response = userCrudFlow.updateUser();

    }

    /**
     * DELETE USER
     */
    @Ketika("User mengirim request DELETE user")
    public void deleteUser() {

        response = userCrudFlow.deleteUser();

    }

    /**
     * VERIFY STATUS CODE
     */
    @Maka("Status code harus {int}")
    public void verifyStatusCode(int expectedStatus) {

        assertEquals(expectedStatus, response.getStatusCode());

    }

}