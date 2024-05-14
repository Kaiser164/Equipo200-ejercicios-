package modelo;
public class ContratoFelicidad implements Contrato {
    private boolean adoptoPerro;
    private boolean cambioVecindario;

    public ContratoFelicidad() {
        this.adoptoPerro = false;
        this.cambioVecindario = false;
    }

    public void setAdoptoPerro(boolean adoptoPerro) {
        this.adoptoPerro = adoptoPerro;
    }

    public void setCambioVecindario(boolean cambioVecindario) {
        this.cambioVecindario = cambioVecindario;
    }

    @Override
    public boolean cumpleContrato() {
        return adoptoPerro && cambioVecindario;
    }

    @Override
    public String toString() {
        return "ContratoFelicidad{" + "adoptoPerro=" + adoptoPerro + ", cambioVecindario=" + cambioVecindario + '}';
    }
    
    
}
