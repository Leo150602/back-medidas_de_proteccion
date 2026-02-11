package back.medidas_proteccion.adaptadores.dto.respuestas;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PerfilResponse {

    private UUID idUsuaria;
    private String nombres;
    private String apellidos;
    private String estado;
    private LocalDateTime fechaInscripcion;
    private String profesion;
    private String tipoDocumento;
    private String documento;
    private List<MetodosContactoResponse> metodosContacto;
    private String lugarActual;
    private LocalDateTime fechaCambioLugar;
    private CondicionesMedicasResponse condicionesMedicas;

    public static class MetodosContactoResponse{
        String tipoMetodo;
        String contacto;
        String descripcion;
    }

    public static class CondicionesMedicasResponse{
        List<String> enfermedades;
        List<String> medicamentos;
        List<String> condiciones;
        String eps;
        String idEps;
        String estado;
    }

}
