package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AsignacionVictimaReques {

    private UUID idVictima;
    private UUID idProfesional;
    private UUID idResidencia;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;

}
