package service;

import api.ApiCarrito;
import api.CarritoApiService;
import modelos.Car;
import modelos.Food;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sreye
 */
public class CarritoServiceFront {
    
    private final CarritoApiService api;

    public CarritoServiceFront() {
        this.api = ApiCarrito.getCarrito().create(CarritoApiService.class);
    }

    public Car obtenerCarrito() throws IOException {
        Call<Car> call = api.obtenerCarrito();
        Response<Car> resp = call.execute();
        return resp.isSuccessful() ? resp.body() : null;
    }

    public List<Food> listarCombosDelCarrito() throws IOException {
        Call<List<Food>> call = api.listarCombosDelCarrito();
        Response<List<Food>> resp = call.execute();
        return resp.isSuccessful() && resp.body()!=null ? resp.body() : Collections.emptyList();
    }

    public boolean agregarCombo(int idCombo) throws IOException {
        Call<Void> call = api.agregarCombo(idCombo);   
        Response<Void> resp = call.execute();
        return resp.isSuccessful();
    }

    public boolean eliminarCombo(int idCombo) throws IOException {
        Call<Void> call = api.eliminarCombo(idCombo);  
        Response<Void> resp = call.execute();
        return resp.isSuccessful();
    }

    public boolean vaciarCarrito() throws IOException {
        Call<Void> call = api.vaciarCarrito();         
        Response<Void> resp = call.execute();
        return resp.isSuccessful();
    }
    
}
