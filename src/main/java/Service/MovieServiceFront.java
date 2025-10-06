/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import api.ApiMovie;
import api.MovieApiService;
import modelos.Movie; // Asumiendo que esta es la clase del modelo
import java.io.IOException;
import java.util.List;
import retrofit2.Call;
import retrofit2.Response;


public class MovieServiceFront {

    private final MovieApiService api;

    // Constructor: Inicializa la interfaz de la API
    public MovieServiceFront() {
        this.api = ApiMovie.getClient().create(MovieApiService.class);
    }

    /**
      Obtiene una lista de todas las películas.
     */
    public List<Movie> listarMovies() throws IOException {
        Call<List<Movie>> call = api.listarMovies();
        Response<List<Movie>> response = call.execute();
        return response.isSuccessful() ? response.body() : null;
    }

    /**
      Obtiene una película por su ID.
     */
    public Movie obtenerMovie(String id) throws IOException {
        Call<Movie> call = api.obtenerMovie(id);
        Response<Movie> response = call.execute();
        return response.isSuccessful() ? response.body() : null;
    }

    /**
      Crea una nueva película.
     */
    public boolean crearMovie(Movie movie) throws IOException {
        Call<Movie> call = api.crearMovie(movie);
        Response<Movie> response = call.execute();
        return response.isSuccessful();
    }

    /**
      Edita una película existente.
     */
    public boolean editarMovie(String id, Movie movie) throws IOException {
        Call<Movie> call = api.editarMovie(id, movie);
        Response<Movie> response = call.execute();
        return response.isSuccessful();
    }

    /**
      Elimina una película por su ID.
     */
    public boolean eliminarMovie(String id) throws IOException {
        Call<Void> call = api.eliminarMovie(id);
        Response<Void> response = call.execute();
        return response.isSuccessful();
    }
}
