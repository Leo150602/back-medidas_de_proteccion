package back.medidas_proteccion.dominio.modelos;

import back.medidas_proteccion.dominio.Enums.TipoDocumento;
import back.medidas_proteccion.dominio.Enums.TipoUsuario;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Usuarias {
    private UUID id;
    private String nombres;
    private String apellidos;
    private Integer edad;
    private TipoDocumento tipoDocumento;
    private String documento;
    private TipoUsuario tipo;
    private LocalDateTime fechaRegistro;
    private Verificaciones verificacion;

}
