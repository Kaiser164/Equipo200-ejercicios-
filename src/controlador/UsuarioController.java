package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioTableModel;

public class UsuarioController {

    public static final List<Usuario> usuarios = new ArrayList<>();
    public static UsuarioTableModel users = null;

    public static void agregarUsuario(String nombreUsuario) {
        Usuario usuarioExistente = buscarUsuario(nombreUsuario);
        if (usuarioExistente == null) {
            Usuario nuevoUsuario = new Usuario(nombreUsuario);
            usuarios.add(nuevoUsuario);
            JOptionPane.showMessageDialog(null, "Usuario " + nuevoUsuario.getNombre() + " agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Error! Ya existe un usuario con el nombre " + usuarioExistente.getNombre() + ".", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void eliminarUsuario(String nombreUsuario) {
        boolean usuarioEliminado = usuarios.removeIf(usuario -> usuario.getNombre().equals(nombreUsuario));
        if (usuarioEliminado) {
            JOptionPane.showMessageDialog(null, "Usuario " + nombreUsuario + " eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Advertencia! No se encontró ningún usuario con el nombre " + nombreUsuario + ".", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public static Boolean consultarEstadoContrato(String nombreUsuario, String nombreContrato) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                switch (nombreContrato) {
                    case "Felicidad":
                        return usuario.getContratoFelicidad().cumpleContrato();
                    case "Finanzas":
                        return usuario.getContratoFinanzas().cumpleContrato();
                    case "Nutrición":
                        return usuario.getContratoNutricion().cumpleContrato();
                    case "Productividad":
                        return usuario.getContratoProductividad().cumpleContrato();
                    case "Salud":
                        return usuario.getContratoSalud().cumpleContrato();
                    case "Sueño":
                        return usuario.getContratoSueno().cumpleContrato();
                    default:
                        return null;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Listado de Usuarios:\n");

        if (usuarios.isEmpty()) {
            sb.append("No hay usuarios registrados.\n");
        } else {
            for (Usuario usuario : usuarios) {
                sb.append("- ").append(usuario.toString()).append("\n");
            }
        }

        return sb.toString();
    }

    public static UsuarioTableModel verTodos() {
        users = new UsuarioTableModel(usuarios);
        return users;
    }

}
