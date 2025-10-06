package api;

import java.util.List;
import modelos.Car;
import modelos.Food;
import modelos.Ticket;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author sreye
 */
public interface CarritoApiService {
    
    @GET("api/carrito")
    Call<Car> obtenerCarrito();

    @GET("api/carrito/combos")
    Call<List<Food>> listarCombosDelCarrito();

    @POST("api/carrito/combos/{idCombo}")
    Call<Void> agregarCombo(@Path("idCombo") int idCombo);

    @DELETE("api/carrito/combos/{idCombo}")
    Call<Void> eliminarCombo(@Path("idCombo") int idCombo);

    @DELETE("api/carrito")
    Call<Void> vaciarCarrito();
    
    @GET("api/carrito/entradas")
    Call<List<Ticket>> listarEntradas();

    @POST("api/carrito/entradas/{numSala}/{numSilla}")
    Call<Void> agregarEntrada(@Path("numSala") int numSala, @Path("numSilla") int numSilla);

    @DELETE("api/carrito/entradas/{numEntrada}")
    Call<Void> eliminarEntrada(@Path("numEntrada") int numEntrada);
    
}
