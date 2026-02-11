package back.medidas_proteccion.dominio.modelos;

import back.medidas_proteccion.dominio.Enums.CasosRegistro;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Registros {
    private UUID id;
    private Usuarias victima;
    private LocalDateTime fecha;
    private CasosRegistro caso;
    private Usuarias profecional;
    private String descripcion;
}
