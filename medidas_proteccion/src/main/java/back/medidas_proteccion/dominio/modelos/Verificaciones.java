package back.medidas_proteccion.dominio.modelos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Verificaciones {
    private UUID id;
    private String contrasena;
    private Boolean activa;
    private Profesiones profesion;
}
