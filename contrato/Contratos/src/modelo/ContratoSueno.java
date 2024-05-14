package modelo;
public class ContratoSueno implements Contrato {
    private boolean buenColchon;
    private boolean cortinasLuz;
    private boolean tvFueraRecamara;

    public ContratoSueno() {
        this.buenColchon = false;
        this.cortinasLuz = false;
        this.tvFueraRecamara = false;
    }

    public void setBuenColchon(boolean buenColchon) {
        this.buenColchon = buenColchon;
    }

    public void setCortinasLuz(boolean cortinasLuz) {
        this.cortinasLuz = cortinasLuz;
    }

    public void setTvFueraRecamara(boolean tvFueraRecamara) {
        this.tvFueraRecamara = tvFueraRecamara;
    }

    @Override
    public boolean cumpleContrato() {
        return buenColchon && cortinasLuz && tvFueraRecamara;
    }

    @Override
    public String toString() {
        return "ContratoSueno{" + "buenColchon=" + buenColchon + ", cortinasLuz=" + cortinasLuz + ", tvFueraRecamara=" + tvFueraRecamara + '}';
    }
}
