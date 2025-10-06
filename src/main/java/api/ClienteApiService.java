/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package api;
import modelos.Client;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.*;



/**
 *
 * @author Nimac
 */
public interface ClienteApiService {
    
    @GET("api/clientes")
    Call<List<Client>> listarClientes();
    
    @GET("api/clientes/{cedula}")
    Call<Client> obtenerCliente(@Path("cedula") String cedula);
    
    @POST("api/clientes")
    Call<Client> crearCliente(@Body Client cliente);
    
    @PUT("api/clientes/{cedula}")
    Call<Client> editarCliente(@Path("cedula") String cedula, @Body Client cliente);
    
    @DELETE("api/clientes/{cedula}")
    Call<Void> eliminarCliente(@Path("cedula") String cedula);
    
    @POST("api/clientes/login")
    Call<Client> login(@Body Map<String, String> credenciales);

    
}
