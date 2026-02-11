package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import back.medidas_proteccion.dominio.Enums.Areas;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "profesiones")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ProfesionesJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Column(nullable = false, unique = true)
    private String profesion;

    @Enumerated(EnumType.STRING)
    @Column
    private Areas area;

    @OneToMany(mappedBy = "profesion")
    private List<VerificacionesJpa> profesionRelacion;
}
