package okhttptest;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.google.gson.Gson;

import javax.crypto.spec.PSource;
import java.io.IOException;

public class TestClass {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();

        Request request = new Request.Builder()
                .url("https://partners-staging.safegold.com/v1/users/276758")
                .get()
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer 38778d59d5e17cfadc750e87703eb5e2")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        String responseString = response.body().string();

        FetchBalanceResponse fetchBalanceResponse
                = gson.fromJson(responseString,
                FetchBalanceResponse.class);
        System.out.println(fetchBalanceResponse);

    }
}
