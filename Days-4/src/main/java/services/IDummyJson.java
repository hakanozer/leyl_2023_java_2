package services;

import models.JwtUser;
import models.Product;
import models.Products;
import models.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IDummyJson {

    @GET("products")
    Call<Products> allProduct();

    @POST("auth/login")
    Call<User> auth(@Body JwtUser jwtUser);

    @GET("products/{pid}")
    Call<Product> single(@Path("pid") int pid);

}
