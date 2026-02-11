package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import back.medidas_proteccion.dominio.Enums.TipoContacto;
import back.medidas_proteccion.dominio.Enums.TipoRelaciones;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "metodos_contacto")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MetodosContactoJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoContacto tipoContacto;

    @Column
    private String contacto;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,name = "tipo_relacionado")
    private TipoRelaciones tipoRelacion;

    @Column(columnDefinition = "UUID", name = "id_relacionado")
    private UUID idRelacion;

    @Column
    private String descripcion;
}
