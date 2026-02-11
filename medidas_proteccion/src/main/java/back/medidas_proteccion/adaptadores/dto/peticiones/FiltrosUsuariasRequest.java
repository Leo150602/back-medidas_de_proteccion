package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FiltrosUsuariasRequest {
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String documento;
    private String tipo;
}
