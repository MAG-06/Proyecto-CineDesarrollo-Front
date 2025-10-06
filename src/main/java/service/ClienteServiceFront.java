/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import api.ApiClient;
import api.ClienteApiService;
import java.io.IOException;
import java.util.List;
import modelos.Client;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Nimac
 */
public class ClienteServiceFront {
    
    private final ClienteApiService api; 
    
    public ClienteServiceFront() {
        this.api = ApiClient.getClient().create(ClienteApiService.class);
    }
    
    public List<Client> listarClientes() throws IOException {
        Call<List<Client>> call = api.listarClientes();
        Response<List<Client>> response = call.execute();
        return response.isSuccessful() ? response.body() : null;
    }
    
    public Client buscarCliente(String cedula) throws IOException {
        Call<Client> call = api.obtenerCliente(cedula);
        Response<Client> response = call.execute();
        return response.isSuccessful() ? response.body() : null;
    }
    
    public boolean guardarCliente(Client cliente) throws IOException {
        Call<Client> call = api.crearCliente(cliente);
        Response<Client> response = call.execute();
        return response.isSuccessful();
    }
    
    public boolean editarCliente(String cedula, Client cliente) throws IOException {
        Call<Client> call = api.editarCliente(cedula, cliente);
        Response<Client> response = call.execute();
        return response.isSuccessful();
    }
    
    public boolean eliminarCliente(String cedula) throws IOException {
        Call<Void> call = api.eliminarCliente(cedula);
        Response<Void> response = call.execute();
        return response.isSuccessful();
    }
    
}
