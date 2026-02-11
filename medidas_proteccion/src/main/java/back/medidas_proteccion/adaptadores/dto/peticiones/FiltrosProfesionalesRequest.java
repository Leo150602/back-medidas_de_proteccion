package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FiltrosProfesionalesRequest {

    private String nombre;
    private String tipoDocumento;
    private String documento;
    private String areaAsignada;

}

