package back.medidas_proteccion.adaptadores.dto.peticiones;

import lombok.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class GuardarCondicionMedicaRequest {

    private UUID idUsuaria;
    private List<String> enfermedades;
    private List<Medicamentos> medicamentos;
    private List<String> condiciones;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Builder
    public static class Medicamentos{
        String nombre;
        String frecuencia;
    }
}
