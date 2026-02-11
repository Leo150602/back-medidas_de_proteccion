package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuardarMetodosContactoRequest {

    private String tipoContacto;
    private String contacto;
    private String  tipoRelacion;
    private UUID idRelacion;
    private String descripcion;
}
