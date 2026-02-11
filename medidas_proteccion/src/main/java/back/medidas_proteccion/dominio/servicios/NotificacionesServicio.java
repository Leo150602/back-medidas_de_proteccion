package back.medidas_proteccion.dominio.servicios;

import back.medidas_proteccion.adaptadores.dto.peticiones.NotificacionesRequest;
import back.medidas_proteccion.adaptadores.dto.respuestas.NotificacionesResponse;

import java.util.List;

public interface NotificacionesServicio {
    List<NotificacionesResponse> ConsultarNotificaciones(NotificacionesRequest request);
    Boolean guardarNotificacion(NotificacionesRequest request);
}
