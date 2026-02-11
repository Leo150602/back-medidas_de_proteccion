package back.medidas_proteccion.dominio.modelos;

import back.medidas_proteccion.dominio.Enums.Areas;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Profesiones {
    private UUID id;
    private String profesion;
    private Areas area;
}
