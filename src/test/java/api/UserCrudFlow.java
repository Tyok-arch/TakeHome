package api;

import io.restassured.response.Response;

public class UserCrudFlow {

    private final UserAPI userAPI = new UserAPI();

    public Response getSingleUser() {
        return userAPI.getSingleUser();
    }

    public Response getListUser() {
        return userAPI.getListUser();
    }

    public Response createUser() {
        return userAPI.createUser();
    }

    public Response updateUser() {

        Response createResponse = userAPI.createUser();

        String userId = createResponse.jsonPath().getString("id");

        return userAPI.updateUser(userId);
    }

    public Response deleteUser() {

        Response createResponse = userAPI.createUser();

        String userId = createResponse.jsonPath().getString("id");

        return userAPI.deleteUser(userId);
    }

}