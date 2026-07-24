package api;

import io.restassured.response.Response;
import utils.JsonUtils;

public class UserAPI extends BaseAPI {

    /**
     * GET Single User
     */
    public Response getSingleUser() {

        Response response = request
                .log().all()
                .when()
                .get(UserEndpoint.USERS + "/2");

        response.then().log().all();

        return response;
    }

    /**
     * GET List User
     */
    public Response getListUser() {

        Response response = request
                .log().all()
                .when()
                .get(UserEndpoint.USERS + "?page=2");

        response.then().log().all();

        return response;
    }

    /**
     * CREATE User
     */
    public Response createUser() {

        Response response = request
                .log().all()
                .body(
                        JsonUtils.readJson(
                                "src/test/resources/payload/createUser.json"
                        )
                )
                .when()
                .post(UserEndpoint.USERS);

        response.then().log().all();

        return response;
    }

    /**
     * UPDATE User
     */
    public Response updateUser(String userId) {

        Response response = request
                .log().all()
                .body(
                        JsonUtils.readJson(
                                "src/test/resources/payload/updateUser.json"
                        )
                )
                .when()
                .put(UserEndpoint.USERS + "/" + userId);

        response.then().log().all();

        return response;
    }

    /**
     * DELETE User
     */
    public Response deleteUser(String userId) {

        Response response = request
                .log().all()
                .when()
                .delete(UserEndpoint.USERS + "/" + userId);

        response.then().log().all();

        return response;
    }

}