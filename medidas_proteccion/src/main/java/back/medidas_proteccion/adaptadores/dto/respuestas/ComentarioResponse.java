package back.medidas_proteccion.adaptadores.dto.respuestas;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ComentarioResponse {

    private UUID idComentario;
    private UUID idProfesional;
    private String comentario;
    private LocalDateTime fechaCreacion;

}
