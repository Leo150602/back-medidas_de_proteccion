package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class NotificacionesRequest {

    private UUID idProfesional;
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaCreacion;
    private String tipoRelacion;
    private UUID idRelacion;
    private String areaAsignada;
}
