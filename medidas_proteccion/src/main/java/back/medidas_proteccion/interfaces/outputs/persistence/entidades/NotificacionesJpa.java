package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import back.medidas_proteccion.dominio.Enums.Areas;
import back.medidas_proteccion.dominio.Enums.TipoRelaciones;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "notificaciones")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class NotificacionesJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Column(nullable = false, length = 50)
    private String titulo;

    @Column
    private String descripcion;

    @Column(name = "fecha_creacion")
    private LocalDateTime fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_notificadora")
    private UsuariasJpa notificadora;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,name = "tipo_relacionado")
    private TipoRelaciones tipoRelacion;

    @Column(columnDefinition = "UUID", name = "id_relacionado")
    private UUID idRelacion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Areas areaAsignada;
}
