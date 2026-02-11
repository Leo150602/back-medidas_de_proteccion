package back.medidas_proteccion.dominio.servicios;

import back.medidas_proteccion.adaptadores.dto.peticiones.FiltrosProcesosRequest;
import back.medidas_proteccion.adaptadores.dto.peticiones.ProcesosRequest;
import back.medidas_proteccion.adaptadores.dto.respuestas.ProcesosResponse;

import java.util.List;
import java.util.UUID;

public interface ProcesosServicio {

    List<ProcesosResponse> consultarProcesos(FiltrosProcesosRequest filtros);
    Boolean guardarProceso(ProcesosRequest request);

}
