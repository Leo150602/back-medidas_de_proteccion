package back.medidas_proteccion.adaptadores.dto.respuestas;

import back.medidas_proteccion.dominio.Enums.CasosRegistro;
import back.medidas_proteccion.dominio.modelos.Usuarias;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RegistrosResponse {

    private UUID idRegistro;
    private UUID idUsuaria;
    private String nombreUsuaria;
    private LocalDateTime fecha;
    private CasosRegistro caso;
    private UUID idProfesional;
    private String nombreProfesional;
    private String descripcion;

}
