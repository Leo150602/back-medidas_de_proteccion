package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import back.medidas_proteccion.dominio.Enums.Areas;
import back.medidas_proteccion.dominio.Enums.EstadoProcesos;
import back.medidas_proteccion.dominio.Enums.TipoProcesos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "procesos")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ProcesosJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_victima")
    private UsuariasJpa victima;

    @Column(length = 50, nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descripcion;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDateTime fechaInicio;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoProcesos estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesional", nullable = false)
    private UsuariasJpa profesional;

    @Column(name = "fecha_final")
    private LocalDateTime fechaFinal;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_proceso", nullable = false)
    private TipoProcesos tipo;

    @Enumerated(EnumType.STRING)
    @Column(name = "area_asignada", nullable = false)
    private Areas areaAsignada;

}
