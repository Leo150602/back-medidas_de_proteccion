package back.medidas_proteccion.dominio.modelos;

import back.medidas_proteccion.dominio.Enums.TipoResidencia;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Residencias {
    private UUID id;
    private String nombre;
    private String direccion;
    private TipoResidencia tipoResidencia;
}
