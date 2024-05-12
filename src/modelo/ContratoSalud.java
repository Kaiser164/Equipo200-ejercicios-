package modelo;
public class ContratoSalud implements Contrato {
    private boolean vacunasAplicadas;
    private boolean zapatosCalidad;
    private boolean sillaSoporteEspalda;

    public ContratoSalud() {
        this.vacunasAplicadas = false;
        this.zapatosCalidad = false;
        this.sillaSoporteEspalda = false;
    }

    public void setVacunasAplicadas(boolean vacunasAplicadas) {
        this.vacunasAplicadas = vacunasAplicadas;
    }

    public void setZapatosCalidad(boolean zapatosCalidad) {
        this.zapatosCalidad = zapatosCalidad;
    }

    public void setSillaSoporteEspalda(boolean sillaSoporteEspalda) {
        this.sillaSoporteEspalda = sillaSoporteEspalda;
    }

    @Override
    public boolean cumpleContrato() {
        return vacunasAplicadas && zapatosCalidad && sillaSoporteEspalda;
    }

    @Override
    public String toString() {
        return "ContratoSalud{" + "vacunasAplicadas=" + vacunasAplicadas + ", zapatosCalidad=" + zapatosCalidad + ", sillaSoporteEspalda=" + sillaSoporteEspalda + '}';
    }
}
