package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class UsuarioController {

    private final List<Usuario> usuarios;

    public UsuarioController() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(String nombreUsuario) {
        Usuario usuarioExistente = buscarUsuario(nombreUsuario);
        if (usuarioExistente == null) {
            Usuario nuevoUsuario = new Usuario(nombreUsuario);
            usuarios.add(nuevoUsuario);
            JOptionPane.showMessageDialog(null, "Usuario " + nuevoUsuario.getNombre() + " agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Error! Ya existe un usuario con el nombre " + usuarioExistente.getNombre() + ".", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarUsuario(String nombreUsuario) {
        boolean usuarioEliminado = usuarios.removeIf(usuario -> usuario.getNombre().equals(nombreUsuario));
        if (usuarioEliminado) {
            JOptionPane.showMessageDialog(null, "Usuario " + nombreUsuario + " eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Advertencia! No se encontró ningún usuario con el nombre " + nombreUsuario + ".", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public Usuario buscarUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public Boolean consultarEstadoContrato(String nombreUsuario, String nombreContrato) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                if (nombreContrato.equals("Felicidad")) {
                    return usuario.getContratoFelicidad().cumpleContrato();
                }
                if (nombreContrato.equals("Finanzas")) {
                    return usuario.getContratoFinanzas().cumpleContrato();
                }
                if (nombreContrato.equals("Nutrición")) {
                    return usuario.getContratoNutricion().cumpleContrato();
                }
                if (nombreContrato.equals("Productividad")) {
                    return usuario.getContratoProductividad().cumpleContrato();
                }
                if (nombreContrato.equals("Salud")) {
                    return usuario.getContratoSalud().cumpleContrato();
                }
                if (nombreContrato.equals("Sueño")) {
                    return usuario.getContratoSueno().cumpleContrato();
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

}
