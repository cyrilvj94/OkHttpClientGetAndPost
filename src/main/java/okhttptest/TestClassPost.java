package okhttptest;

import com.google.gson.Gson;
import com.squareup.okhttp.*;

import java.io.IOException;

public class TestClassPost {

    public static void main(String[] args) throws IOException {
        RegistrationRequest registrationRequest = new RegistrationRequest();
        registrationRequest.setDeliveryAddress("Test address");
        registrationRequest.setEmail("test@gmail.com");
        registrationRequest.setMobileNo("9495723675");
        registrationRequest.setName("Rahul");
        registrationRequest.setPinCode("686631");
        Gson gson = new Gson();
        String requestString = gson.toJson(registrationRequest);
        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, requestString);
        Request request = new Request.Builder()
                .url("https://partners-staging.safegold.com/v1/users")
                .post(body)
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer 38778d59d5e17cfadc750e87703eb5e2")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }
}
