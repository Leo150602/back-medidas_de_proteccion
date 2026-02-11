package back.medidas_proteccion.adaptadores.dto.respuestas;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DependienteResponse {

    private UUID idDependencia;
    private UUID idDependiente;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String documento;
    private String tipo;

}
