package modelo;

public class Usuario {
    private String nombre;
    private ContratoFelicidad contratoFelicidad;
    private ContratoNutricion contratoNutricion;
    private ContratoSueno contratoSueno;
    private ContratoSalud contratoSalud;
    private ContratoProductividad contratoProductividad;
    private ContratoFinanzas contratoFinanzas;

    public Usuario() {
    }
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.contratoFelicidad = new ContratoFelicidad();
        this.contratoNutricion = new ContratoNutricion();
        this.contratoSueno = new ContratoSueno();
        this.contratoSalud = new ContratoSalud();
        this.contratoProductividad = new ContratoProductividad();
        this.contratoFinanzas = new ContratoFinanzas();
    }

    public Usuario(String nombre, ContratoFelicidad contratoFelicidad, ContratoNutricion contratoNutricion, ContratoSueno contratoSueno, ContratoSalud contratoSalud, ContratoProductividad contratoProductividad, ContratoFinanzas contratoFinanzas) {
        this.nombre = nombre;
        this.contratoFelicidad = contratoFelicidad;
        this.contratoNutricion = contratoNutricion;
        this.contratoSueno = contratoSueno;
        this.contratoSalud = contratoSalud;
        this.contratoProductividad = contratoProductividad;
        this.contratoFinanzas = contratoFinanzas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ContratoFelicidad getContratoFelicidad() {
        return contratoFelicidad;
    }

    public void setContratoFelicidad(ContratoFelicidad contratoFelicidad) {
        this.contratoFelicidad = contratoFelicidad;
    }

    public ContratoNutricion getContratoNutricion() {
        return contratoNutricion;
    }

    public void setContratoNutricion(ContratoNutricion contratoNutricion) {
        this.contratoNutricion = contratoNutricion;
    }

    public ContratoSueno getContratoSueno() {
        return contratoSueno;
    }

    public void setContratoSueno(ContratoSueno contratoSueno) {
        this.contratoSueno = contratoSueno;
    }

    public ContratoSalud getContratoSalud() {
        return contratoSalud;
    }

    public void setContratoSalud(ContratoSalud contratoSalud) {
        this.contratoSalud = contratoSalud;
    }

    public ContratoProductividad getContratoProductividad() {
        return contratoProductividad;
    }

    public void setContratoProductividad(ContratoProductividad contratoProductividad) {
        this.contratoProductividad = contratoProductividad;
    }

    public ContratoFinanzas getContratoFinanzas() {
        return contratoFinanzas;
    }

    public void setContratoFinanzas(ContratoFinanzas contratoFinanzas) {
        this.contratoFinanzas = contratoFinanzas;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", contratoFelicidad=" + contratoFelicidad.toString() + ", contratoNutricion=" + contratoNutricion.toString() + ", contratoSueno=" + contratoSueno.toString() + ", contratoSalud=" + contratoSalud.toString() + ", contratoProductividad=" + contratoProductividad.toString() + ", contratoFinanzas=" + contratoFinanzas.toString() + '}';
    }
    
    
    
}
