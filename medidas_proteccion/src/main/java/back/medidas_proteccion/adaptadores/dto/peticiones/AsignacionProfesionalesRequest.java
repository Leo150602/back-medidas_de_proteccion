package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AsignacionProfesionalesRequest {

    private UUID idProfesional;
    private UUID idResidencia;
    private String tipo;
    private LocalDateTime llegada;
    private LocalDateTime salida;

}
