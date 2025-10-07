package service;

import api.ApiMovie;
import api.MovieApiService;
import modelos.Movie; 
import java.io.IOException;
import java.util.List;
import retrofit2.Call;
import retrofit2.Response;


public class MovieServiceFront {

    private final MovieApiService api;

    public MovieServiceFront() {
        this.api = ApiMovie.getClient().create(MovieApiService.class);
    }

    public List<Movie> listarMovies() throws IOException {
        Call<List<Movie>> call = api.listarMovies();
        Response<List<Movie>> response = call.execute();
        return response.isSuccessful() ? response.body() : null;
    }

    public Movie obtenerMovie(String id) throws IOException {
        Call<Movie> call = api.obtenerMovie(id);
        Response<Movie> response = call.execute();
        return response.isSuccessful() ? response.body() : null;
    }

    public boolean crearMovie(Movie movie) throws IOException {
        Call<Movie> call = api.crearMovie(movie);
        Response<Movie> response = call.execute();
        return response.isSuccessful();
    }

    public boolean editarMovie(String id, Movie movie) throws IOException {
        Call<Movie> call = api.editarMovie(id, movie);
        Response<Movie> response = call.execute();
        return response.isSuccessful();
    }

    public boolean eliminarMovie(String id) throws IOException {
        Call<Void> call = api.eliminarMovie(id);
        Response<Void> response = call.execute();
        return response.isSuccessful();
    }
}
