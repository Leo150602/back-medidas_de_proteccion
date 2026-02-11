package back.medidas_proteccion.adaptadores.dto.respuestas;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProcesosResponse {

    private UUID idUsuaria;
    private UUID idProfesional;
    private String titulo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinal;
    private String estado;
    private String descripcion;
    private String tipo;

}
