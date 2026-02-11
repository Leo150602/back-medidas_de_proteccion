package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ResidenciaRequest {
    private String nombre;
    private String direccion;
    private String tipo;
    private List<GuardarMetodosContactoRequest> metodosContacto;
}
