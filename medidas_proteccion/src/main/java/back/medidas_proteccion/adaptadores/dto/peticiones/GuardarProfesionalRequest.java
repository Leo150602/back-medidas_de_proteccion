package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class GuardarProfesionalRequest {

    private String nombres;
    private String apellidos;
    private Integer edad;
    private String tipoDocumento;
    private String documento;
    private GuardarCondicionMedicaRequest condicionMedica;
    private List<GuardarMetodosContactoRequest> metodosContacto;
    private String contraseña;
    private UUID idProfesion;
}
