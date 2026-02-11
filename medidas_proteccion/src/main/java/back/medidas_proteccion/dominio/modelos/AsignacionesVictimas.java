package back.medidas_proteccion.dominio.modelos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class AsignacionesVictimas {
    private UUID id;
    private Usuarias victima;
    private Residencias residencia;
    private Usuarias profecional;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;
}
