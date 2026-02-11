package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RegistroRequest {

    private UUID idProfesional;
    private UUID idVictima;
    private LocalDateTime fechaCreacion;
    private String caso;
    private String descripcion;

}
