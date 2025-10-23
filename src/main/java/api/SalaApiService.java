/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package api;

import java.util.List;
import java.util.Map;
import modelos.Hall;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 *
 * @author Nimac
 */
public interface SalaApiService {
    
    // 1) Cartelera / Listados
    @GET("api/salas/cartelera/{dia}")
    Call<List<Hall>> carteleraPorDia(@Path("dia") Hall.Dia dia);

    @GET("api/salas/{idSala}/funciones")
    Call<List<Hall>> funcionesPorSalaYDia(@Path("idSala") int idSala,
                                          @Query("dia") Hall.Dia dia);

    @GET("api/salas/funcion")
    Call<Hall> obtenerFuncion(@Query("sala") int sala,
                              @Query("dia") Hall.Dia dia,
                              @Query("horaInicio") String horaInicio /* "HH:mm" */);

    // 2) Sillas / Disponibilidad
    @GET("api/salas/funcion/sillas")
    Call<boolean[]> estadoSillas(@Query("sala") int sala, @Query("dia") Hall.Dia dia, @Query("horaInicio") String horaInicio /* "HH:mm" */);

    // 3) Reservas / Cancelaciones
    @POST("api/salas/funcion/reservar")
    Call<Void> reservar(@Body Map<String, Object> body);

    @POST("api/salas/funcion/cancelar")
    Call<Void> cancelar(@Body Map<String, Object> body);

    // 4) Administración / Limpieza
    @POST("api/salas/funciones/limpiar-vencidas")
    Call<Map<String, Object>> limpiarVencidas();

    // Crear función manual
    @POST("api/salas/funcion")
    Call<Hall> crearFuncion(@Body Map<String, Object> body);

    
}
