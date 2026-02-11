package back.medidas_proteccion.dominio.servicios;

import back.medidas_proteccion.adaptadores.dto.peticiones.FiltrosRegistrosRequest;
import back.medidas_proteccion.adaptadores.dto.peticiones.RegistroRequest;
import back.medidas_proteccion.adaptadores.dto.respuestas.RegistrosResponse;

import java.util.List;

public interface RegistrosServicio {
    Boolean guardarRegistro(RegistroRequest request);
    List<RegistrosResponse> consultarRegistros(FiltrosRegistrosRequest request);

}
