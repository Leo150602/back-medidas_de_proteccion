package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FiltrosAsignacionVictimasRequest {

    private UUID idVictima;
    private UUID idProfesional;
    private UUID idResidencia;
    private LocalDateTime fecha;

}
