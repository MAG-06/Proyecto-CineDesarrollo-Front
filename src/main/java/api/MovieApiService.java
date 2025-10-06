/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package api;

import modelos.Movie; // Asumiendo que esta es la clase del modelo
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.DELETE;
import retrofit2.http.Path;
import retrofit2.http.Body;


public interface MovieApiService {

    // GET - Obtener todos
    @GET("api/movies")
    Call<List<Movie>> listarMovies();

    // GET - Obtener por ID
    @GET("api/movies/{id}")
    Call<Movie> obtenerMovie(@Path("id") String id); // Asumiendo que el ID es un String

    // POST - Crear
    @POST("api/movies")
    Call<Movie> crearMovie(@Body Movie movie);

    // PUT - Editar
    @PUT("api/movies/{id}")
    Call<Movie> editarMovie(@Path("id") String id, @Body Movie movie);

    // DELETE - Eliminar
    @DELETE("api/movies/{id}")
    Call<Void> eliminarMovie(@Path("id") String id);
}
