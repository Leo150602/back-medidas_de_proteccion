package back.medidas_proteccion.dominio.modelos;

import back.medidas_proteccion.dominio.Enums.Areas;
import back.medidas_proteccion.dominio.Enums.EstadoProcesos;
import back.medidas_proteccion.dominio.Enums.TipoProcesos;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Procesos {
    private UUID id;
    private Usuarias victima;
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaInicio;
    private EstadoProcesos estado;
    private Usuarias profecional;
    private LocalDateTime fechaFinal;
    private TipoProcesos tipo;
    private Areas areaAsignada;

}
