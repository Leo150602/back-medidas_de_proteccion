package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AuthRequest {
    private String documento;
    private String contraseña;
}
