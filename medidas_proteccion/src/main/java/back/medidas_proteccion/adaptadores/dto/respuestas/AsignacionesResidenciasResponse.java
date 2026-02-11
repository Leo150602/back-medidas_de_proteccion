package back.medidas_proteccion.adaptadores.dto.respuestas;

import lombok.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AsignacionesResidenciasResponse {

    private UUID idResidencia;
    private String nombre;
    private String tipoResidencia;
    private List<MetodosContactoAsignacionResponse> metodosContacto;
    private String direccion;

    public static class MetodosContactoAsignacionResponse{
        String tipoMetodo;
        String contacto;
        String descripcion;
    }

}
