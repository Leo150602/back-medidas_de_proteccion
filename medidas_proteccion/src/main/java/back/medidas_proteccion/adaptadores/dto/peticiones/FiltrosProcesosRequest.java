package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FiltrosProcesosRequest {

    private UUID idVictima;
    private UUID idProfesional;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinal;
    private String estado;
    private String tipo;

}
