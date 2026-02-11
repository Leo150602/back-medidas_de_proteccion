package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import back.medidas_proteccion.dominio.Enums.TipoResidencia;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "residencias")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ResidenciasJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Column(nullable = false)
    private String nombre;

    @Column
    private String direccion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoResidencia tipoResidencia;

    @OneToMany(mappedBy = "residenciaVictima")
    private List<AsignacionesVictimasJpa> residenciaVictima;

    @OneToMany(mappedBy = "residenciaProfesional")
    private List<AsignacionesProfesionalesJpa> residenciaProfesional;
}
