package back.medidas_proteccion.dominio.servicios;

import back.medidas_proteccion.adaptadores.dto.peticiones.AsignacionVictimaReques;
import back.medidas_proteccion.adaptadores.dto.peticiones.FiltrosAsignacionResidenciasRequest;
import back.medidas_proteccion.adaptadores.dto.peticiones.FiltrosAsignacionVictimasRequest;
import back.medidas_proteccion.adaptadores.dto.respuestas.AsignacionUsuariasResponse;
import back.medidas_proteccion.adaptadores.dto.respuestas.AsignacionesResidenciasResponse;

import java.util.UUID;

public interface AsignacionesVictimasServicio {
    Boolean asignarVictima(AsignacionVictimaReques reques);
    AsignacionUsuariasResponse consultarAsignacionesVictimas(FiltrosAsignacionVictimasRequest request);
    AsignacionesResidenciasResponse consultarResidencias(FiltrosAsignacionResidenciasRequest request);
    Boolean actualizarAsignacionVictima(AsignacionVictimaReques reques);
    Boolean eliminarAsignacionVictima(UUID idAsignacion);
}
