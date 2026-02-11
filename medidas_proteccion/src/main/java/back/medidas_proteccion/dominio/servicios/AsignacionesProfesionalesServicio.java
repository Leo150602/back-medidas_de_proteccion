package back.medidas_proteccion.dominio.servicios;

import back.medidas_proteccion.adaptadores.dto.peticiones.AsignacionProfesionalesRequest;
import back.medidas_proteccion.adaptadores.dto.peticiones.AsignacionVictimaReques;
import back.medidas_proteccion.adaptadores.dto.peticiones.FiltrosAsignacionProfesionalRequest;
import back.medidas_proteccion.adaptadores.dto.respuestas.AsignacionesProfesionalesResponse;

import java.util.UUID;

public interface AsignacionesProfesionalesServicio {
    Boolean asignarHorario(AsignacionProfesionalesRequest reques);
    AsignacionesProfesionalesResponse consultarHorarios(FiltrosAsignacionProfesionalRequest request);
    Boolean actualizarAsignacionProfesional(AsignacionProfesionalesRequest reques);
    Boolean eliminarAsignacionProfesional(UUID idAsignacion);

}
