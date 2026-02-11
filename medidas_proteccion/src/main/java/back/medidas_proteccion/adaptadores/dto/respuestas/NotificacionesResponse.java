package back.medidas_proteccion.adaptadores.dto.respuestas;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class NotificacionesResponse {

    private UUID idUsuaria;
    private String titulo;
    private String descripcion;
    private String tipoRelacion;
    private String tipoNotificacion;
    private String nombreProfecional;
    private String areaRelacionada;
    private String profesion;

}
