package back.medidas_proteccion.dominio.modelos;

import back.medidas_proteccion.dominio.Enums.Areas;
import back.medidas_proteccion.dominio.Enums.TipoRelaciones;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Notificaciones {
    private UUID id;
    private String titulo;
    private String descripcion;
    private LocalDateTime fecha;
    private Usuarias notificador;
    private TipoRelaciones tipoRelacion;
    private UUID idRelacion;
    private Areas areaAsignada;
}
