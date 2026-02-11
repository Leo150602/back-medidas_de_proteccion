package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FiltrosNotificacionesRequest {

    private String titulo;
    private UUID idProfesional;
    private String areaAsignada;
}
