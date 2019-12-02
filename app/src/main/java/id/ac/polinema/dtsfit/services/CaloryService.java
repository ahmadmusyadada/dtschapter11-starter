package id.ac.polinema.dtsfit.services;

import java.util.List;

import id.ac.polinema.dtsfit.models.Calory;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CaloryService {
    // TODO: Definisikan service getCalories()
    @GET("/ahmadmusyadada/db-dtschapter11/calories")
    Call<List<Calory>> getCalories();

    // TODO: Definisikan service addCalory()
    @POST("/ahmadmusyadada/db-dtschapter11/calories")
    Call<Calory> addCalory(@Body Calory calory);

    // TODO: Definisikan service editCalory()
    @PUT("/ahmadmusyadada/db-dtschapter11/calories/{id}")
    Call<Calory> editCalory(@Path("id") int id, @Body Calory calory);


}
