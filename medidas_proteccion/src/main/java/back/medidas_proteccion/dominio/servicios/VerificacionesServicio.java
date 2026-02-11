package back.medidas_proteccion.dominio.servicios;

import back.medidas_proteccion.adaptadores.dto.peticiones.AuthRequest;
import back.medidas_proteccion.adaptadores.dto.respuestas.AuthResponse;

public interface VerificacionesServicio {
    AuthResponse authenticar(AuthRequest request);
    Boolean cerrarSesion();
    Boolean cambiarContraseña(String contraseña);
    Boolean cambiarEstado(String estado);
}
