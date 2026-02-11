package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FiltrosAsignacionResidenciasRequest {

    private String nombre;
    private LocalDateTime dia;
    private String tipo;

}
