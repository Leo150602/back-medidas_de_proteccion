package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FiltrosComentariosRequest {

    private UUID idVictima;
    private UUID idProfesional;
    private String tipoRelacion;
}
