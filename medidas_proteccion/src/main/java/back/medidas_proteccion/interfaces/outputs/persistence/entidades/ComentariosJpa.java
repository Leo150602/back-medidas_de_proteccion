package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import back.medidas_proteccion.dominio.Enums.TipoRelaciones;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "comentarios")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ComentariosJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_comentadora")
    private UsuariasJpa comentadora;

    @Column
    private String comentario;

    @Column(name = "fecha_creacion")
    private LocalDateTime fecha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,name = "tipo_relacionado")
    private TipoRelaciones tipoRelacion;

    @Column(columnDefinition = "UUID", name = "id_relacionado")
    private UUID idRelacion;

}
