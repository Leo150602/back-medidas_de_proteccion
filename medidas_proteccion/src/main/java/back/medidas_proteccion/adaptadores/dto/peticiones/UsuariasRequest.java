package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UsuariasRequest {

    private String nombres;
    private String apellidos;
    private Integer edad;
    private String tipoDocumento;
    private String documento;
    private String tipoUsuaria;
    private GuardarCondicionMedicaRequest condicionMedica;
    private List<GuardarMetodosContactoRequest> metodosContacto;
    private List<GuardarDependientesRequest> dependientes;

}
