package modelo;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class UsuarioTableModel implements TableModel {

    private List<Usuario> usuarios;
    private final String[] columnNames = {
            "Nombre",
            "Felicidad",
            "Nutrición",
            "Sueño",
            "Salud",
            "Productividad",
            "Finanzas"
    };

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // Non-editable table
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getNombre();
            case 1:
                return usuario.getContratoFelicidad().cumpleContrato() ? "Alcanzada" : "No alcanzada";
            case 2:
                return usuario.getContratoNutricion().cumpleContrato() ? "Alcanzada" : "No alcanzada";
            case 3:
                return usuario.getContratoSueno().cumpleContrato() ? "Alcanzada" : "No alcanzada";
            case 4:
                return usuario.getContratoSalud().cumpleContrato() ? "Alcanzada" : "No alcanzada";
            case 5:
                return usuario.getContratoProductividad().cumpleContrato() ? "Alcanzada" : "No alcanzada";
            case 6:
                return usuario.getContratoFinanzas().cumpleContrato() ? "Alcanzada" : "No alcanzada";
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // Not editable
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        
    }
}
