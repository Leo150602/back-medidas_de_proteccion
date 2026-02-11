package back.medidas_proteccion.adaptadores.dto.respuestas;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AuthResponse {

    private String nombres;
    private UUID idUsuaria;
    private String areaAsignada;

}
