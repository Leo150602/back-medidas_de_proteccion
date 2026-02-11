package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "dependientes")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class DependientesJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_victima")
    private UsuariasJpa victima;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dependiente")
    private UsuariasJpa dependiente;

    @Column(nullable = false)
    private String parentesco;

    @Column(name = "esta_ingresado", nullable = false)
    private Boolean ingresado;
}
