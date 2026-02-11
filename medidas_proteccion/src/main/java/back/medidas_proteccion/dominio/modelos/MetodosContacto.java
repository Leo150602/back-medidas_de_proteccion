package back.medidas_proteccion.dominio.modelos;

import back.medidas_proteccion.dominio.Enums.TipoContacto;
import back.medidas_proteccion.dominio.Enums.TipoRelaciones;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class MetodosContacto {
    private UUID id;
    private TipoContacto tipoContacto;
    private String contacto;
    private TipoRelaciones tipoRelacion;
    private UUID idRelacion;
    private String descripcion;
}
