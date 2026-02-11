package back.medidas_proteccion.dominio.servicios;

import back.medidas_proteccion.adaptadores.dto.peticiones.ResidenciaRequest;

import java.util.UUID;

public interface ResidenciasServicio {

    UUID registrarResidencia(ResidenciaRequest request);
    UUID consultarResidencias(ResidenciaRequest request);

}
