package back.medidas_proteccion.interfaces.outputs.persistence.entidades;

import back.medidas_proteccion.dominio.Enums.TipoDocumento;
import back.medidas_proteccion.dominio.Enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "usuarias")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UsuariasJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    @Column
    private Integer edad;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_documento", nullable = false)
    private TipoDocumento tipoDocumento;

    @Column(nullable = false, unique = true)
    private String documento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario", nullable = false)
    private TipoUsuario tipo;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;

    @OneToOne(mappedBy = "usuaria")
    private VerificacionesJpa verificacion;

    @OneToMany(mappedBy = "victima")
    private List<AsignacionesVictimasJpa> asignacionVictima;

    @OneToMany(mappedBy = "profecional")
    private List<AsignacionesVictimasJpa> asignacionProfesional;

    @OneToMany(mappedBy = "victima")
    private List<ProcesosJpa> procesoVictima;

    @OneToMany(mappedBy = "profesional")
    private List<ProcesosJpa> procesoProfecional;

    @OneToMany(mappedBy = "victima")
    private List<RegistrosJpa> registroVictima;

    @OneToMany(mappedBy = "profesional")
    private List<RegistrosJpa> registroProfesional;

    @OneToMany(mappedBy = "comentadora")
    private List<RegistrosJpa> comentadora;

    @OneToMany(mappedBy = "notificadora")
    private List<NotificacionesJpa> notificadora;

    @OneToMany(mappedBy = "victima")
    private List<DependientesJpa> victimaRelacionada;

    @OneToMany(mappedBy = "dependiente")
    private List<DependientesJpa> dependiente;

    @OneToOne(mappedBy = "usuaria")
    private CondicionesMedicasJpa condicionesMedicas;

}
