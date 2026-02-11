package back.medidas_proteccion.dominio.modelos;

import back.medidas_proteccion.dominio.Enums.TipoRelaciones;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Comentarios {
    private UUID id;
    private Usuarias comentadora;
    private String comentario;
    private LocalDateTime fecha;
    private TipoRelaciones tipoRelacion;
    private UUID idRelacion;
}
