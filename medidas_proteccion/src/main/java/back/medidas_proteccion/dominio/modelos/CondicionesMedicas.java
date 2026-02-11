package back.medidas_proteccion.dominio.modelos;

import back.medidas_proteccion.dominio.Enums.EPS;
import back.medidas_proteccion.dominio.Enums.EstadoSalud;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CondicionesMedicas {
    private UUID id;
    private Usuarias victima;
    private String enfermedades;
    private String medicamentos;
    private String condiciones;
    private EstadoSalud estado;
    private EPS eps;
    private String idEps;
}
