package back.medidas_proteccion.adaptadores.dto.peticiones;

import back.medidas_proteccion.dominio.modelos.Usuarias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuardarDependientesRequest {

    private UUID victima;
    private UUID dependiente;
    private String parentesco;
    private Boolean ingresado;
}
