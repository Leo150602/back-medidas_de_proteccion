package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FiltrosRegistrosRequest {

    private UUID idProfesional;
    private UUID idUsuaria;
    private LocalDateTime fechaCreacion;
    private String caso;

}
