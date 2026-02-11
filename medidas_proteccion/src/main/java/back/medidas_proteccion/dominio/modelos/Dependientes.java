package back.medidas_proteccion.dominio.modelos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Dependientes {

    private UUID id;
    private Usuarias victima;
    private Usuarias dependiente;
    private String parentesco;
    private Boolean ingresado;
}
