package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class GuardarVerificacionRequest {
    private String nombres;
    private String apellidos;
    private Integer edad;
    private String tipoDocumento;
    private String documento;
    private String contraseña;
    private String profesion;
}
