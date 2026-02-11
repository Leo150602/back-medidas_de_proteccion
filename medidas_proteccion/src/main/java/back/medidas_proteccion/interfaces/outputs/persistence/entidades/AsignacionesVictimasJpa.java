package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "asignaciones_victimas")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AsignacionesVictimasJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_victima")
    private UsuariasJpa victima;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_residencia")
    private ResidenciasJpa residenciaVictima;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesional")
    private UsuariasJpa profesional;

    @Column(name = "fecha_entrada")
    private LocalDateTime fechaEntrada;

    @Column(name = "fecha_salida")
    private LocalDateTime fechaSalida;

}
