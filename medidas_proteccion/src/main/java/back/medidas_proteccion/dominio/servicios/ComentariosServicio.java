package back.medidas_proteccion.dominio.servicios;

import back.medidas_proteccion.adaptadores.dto.peticiones.ComentarioRequest;
import back.medidas_proteccion.adaptadores.dto.peticiones.FiltrosComentariosRequest;
import back.medidas_proteccion.adaptadores.dto.respuestas.ComentarioResponse;

import java.util.List;
import java.util.UUID;

public interface ComentariosServicio {

    List<ComentarioResponse> consultarComentarios(FiltrosComentariosRequest filtros);
    Boolean crearComentario(ComentarioRequest request);
    Boolean eliminarComentario(UUID idComentario);

}
