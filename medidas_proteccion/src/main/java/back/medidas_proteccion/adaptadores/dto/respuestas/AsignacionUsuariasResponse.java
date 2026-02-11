package back.medidas_proteccion.adaptadores.dto.respuestas;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AsignacionUsuariasResponse {

    private UUID idAsignacion;
    private UUID idVictima;
    private UUID idProfesional;
    private String nombreProfesional;
    private UUID idResidencia;
    private String nombreResidencia;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinal;
    private String nombre;


}
