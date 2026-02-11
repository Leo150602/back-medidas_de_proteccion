package back.medidas_proteccion.dominio.modelos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class AsignacionesProfecionales {
    private UUID id;
    private Usuarias profecional;
    private Residencias residencia;
    private LocalDateTime llegada;
    private LocalDateTime Salida;
}
