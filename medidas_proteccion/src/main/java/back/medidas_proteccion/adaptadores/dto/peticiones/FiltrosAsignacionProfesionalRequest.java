package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FiltrosAsignacionProfesionalRequest {

    private String nombre;
    private LocalDateTime dia;
    private String tipoDocumento;
    private String documento;
    private String areaAsignada;

}
