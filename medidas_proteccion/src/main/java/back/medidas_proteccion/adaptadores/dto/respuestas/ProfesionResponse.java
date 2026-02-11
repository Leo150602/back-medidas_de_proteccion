package back.medidas_proteccion.adaptadores.dto.respuestas;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProfesionResponse {

    private UUID idProfesion;
    private String profesion;
    private String areaAsignada;

}
