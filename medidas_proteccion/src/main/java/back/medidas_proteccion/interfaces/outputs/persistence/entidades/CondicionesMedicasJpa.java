package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import back.medidas_proteccion.dominio.Enums.EPS;
import back.medidas_proteccion.dominio.Enums.EstadoSalud;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "condiciones_medicas")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CondicionesMedicasJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @OneToOne
    @JoinColumn(name = "id_usuaria", unique = true)
    private UsuariasJpa usuaria;

    @Column
    private String enfermedades;

    @Column
    private String medicamentos;

    @Column
    private String condiciones;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "estado_salud")
    private EstadoSalud estado;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EPS eps;

    @Column(name = "id_eps_relacionada")
    private String idEps;

}
