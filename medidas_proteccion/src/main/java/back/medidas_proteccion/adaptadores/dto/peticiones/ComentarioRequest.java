package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ComentarioRequest {

    private UUID idProfesional;
    private String tipoRelacion;
    private UUID idRelacion;
    private String comentario;
    private LocalDateTime fechaCreacion;

}
