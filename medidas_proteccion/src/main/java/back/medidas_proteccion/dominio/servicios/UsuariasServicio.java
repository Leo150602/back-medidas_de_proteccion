package back.medidas_proteccion.dominio.servicios;

import back.medidas_proteccion.adaptadores.dto.peticiones.FiltrosUsuariasRequest;
import back.medidas_proteccion.adaptadores.dto.peticiones.GuardarProfesionalRequest;
import back.medidas_proteccion.adaptadores.dto.peticiones.UsuariasRequest;
import back.medidas_proteccion.adaptadores.dto.respuestas.DependienteResponse;
import back.medidas_proteccion.adaptadores.dto.respuestas.PerfilResponse;
import back.medidas_proteccion.adaptadores.dto.respuestas.UsuariasResponse;

import java.util.List;
import java.util.UUID;

public interface UsuariasServicio {

    Boolean registrarProfesional(GuardarProfesionalRequest request);
    UUID registrarVictima(UsuariasRequest request);
    PerfilResponse consultarPerfilPorId(UUID idUsuario);
    List<DependienteResponse> consultarDependientes(UUID idUsuaria);
    Boolean eliminarDependiente(UUID idDependencia);
    Boolean actualizarUsuario(UsuariasRequest request);
    List<UsuariasResponse> consultarUsuarias(FiltrosUsuariasRequest request);
}
