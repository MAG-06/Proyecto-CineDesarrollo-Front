package api;

import java.util.List;
import java.util.Map;
import modelos.Bill;
import modelos.Car;
import modelos.Food;
import modelos.Ticket;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author sreye
 */
public interface CarritoApiService {
    
    @POST("api/carrito/combos")
    Call<Car> agregarCombo(@Body Map<String, Object> body);

    @HTTP(method = "DELETE", path = "api/carrito/combos", hasBody = true)
    Call<Car> eliminarCombo(@Body Map<String, Object> body);

    @POST("api/carrito/entradas")
    Call<Car> agregarEntrada(@Body Map<String, Object> body);

    @DELETE("api/carrito/entradas")
    Call<Car> eliminarEntrada(@Body Map<String, Object> body);

    @POST("api/carrito/vaciar")
    Call<Void> vaciarCarrito(@Body Car carrito);

    @POST("api/carrito/checkout")
    Call<Bill> agregarCarritoEnFactura(@Body Map<String, Object> body);
    
}
