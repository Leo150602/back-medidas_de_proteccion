package back.medidas_proteccion.adaptadores.dto.respuestas;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AsignacionesProfesionalesResponse {

    private UUID idAsignacion;
    private UUID idProfecionales;
    private String nombre;
    private String profecion;
    private String areaAsignada;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private String residencia;

}
