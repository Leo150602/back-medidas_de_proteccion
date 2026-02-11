package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "verificaciones")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class VerificacionesJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Column(nullable = false, length = 20)
    private String contrasena;

    @Column(name = "esta_activa", nullable = false)
    private Boolean activa;

    @OneToOne
    @JoinColumn(name = "id_usuaria", unique = true)
    private UsuariasJpa usuaria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesion")
    private ProfesionesJpa profesion;
}
