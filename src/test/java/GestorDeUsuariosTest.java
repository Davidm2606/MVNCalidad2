import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GestorDeUsuariosTest {

    @Test
    void agregarUsuario() {
        // Arrange
        GestorDeUsuarios gestor = new GestorDeUsuarios();

        // Act
        gestor.agregarUsuario("Juan Pérez", "juan.perez@example.com");

        // Assert
        assertEquals(1, gestor.obtenerTotalUsuarios());
        Usuario usuario = gestor.obtenerUsuarios().get(0);
        assertEquals("Juan Pérez", usuario.getNombre());
        assertEquals("juan.perez@example.com", usuario.getEmail());
    }
}
