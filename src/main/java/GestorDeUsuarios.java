import java.util.ArrayList;
import java.util.List;

public class GestorDeUsuarios {
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private int idCounter = 1;

    public void agregarUsuario(String nombre, String email) {
        usuarios.add(new Usuario(idCounter++, nombre, email));
    }

    public int obtenerTotalUsuarios() {
        return usuarios.size();
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }
}
