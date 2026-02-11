package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProcesosRequest {

    private UUID idVictima;
    private UUID idProfesional;
    private String tipo;
    private String titulo;
    private LocalDateTime fechaTentativa;
    private LocalDateTime fechaFinal;
    private String estado;
    private String areaAsignada;

}
