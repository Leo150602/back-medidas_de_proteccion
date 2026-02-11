package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "asignaciones_profesionales")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AsignacionesProfesionalesJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesional")
    private UsuariasJpa profesional;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_residencia")
    private ResidenciasJpa residenciaProfesional;

    @Column(name = "fecha_llegada")
    private LocalDateTime llegada;

    @Column(name = "fecha_salida")
    private LocalDateTime Salida;
}
