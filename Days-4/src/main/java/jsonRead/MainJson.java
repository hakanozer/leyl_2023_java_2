package jsonRead;

import configs.Api;
import models.JwtUser;
import models.Product;
import models.Products;
import models.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import services.IDummyJson;

import java.io.IOException;

public class MainJson {
    public static void main(String[] args) throws IOException {

        IDummyJson iDummyJson = Api.client().create(IDummyJson.class);
        iDummyJson.allProduct().enqueue(new Callback<Products>() {
            @Override
            public void onResponse(Call<Products> call, Response<Products> response) {
                if (response.isSuccessful() ) {
                   Products products = response.body();
                   products.getProducts().forEach( item -> {
                       System.out.println( item.getTitle() );
                   });
                }
            }
            @Override
            public void onFailure(Call<Products> call, Throwable throwable) {
                System.err.println( "allProduct Error :" + throwable );
            }
        });

        // auth
        JwtUser jwtUser = new JwtUser();
        jwtUser.setUsername("atuny0");
        jwtUser.setPassword("9uQFF1Lh");
        iDummyJson.auth(jwtUser).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()) {
                    System.out.println( response.body() );
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable throwable) {
                System.err.println( "auth Error :" + throwable );
            }
        });


        Response<Products> productsResponse = iDummyJson.allProduct().execute();
        System.out.println( productsResponse.body() );

        Response<Product> productResponse = iDummyJson.single(10).execute();
        System.out.println( productResponse.body() );

    }
}
