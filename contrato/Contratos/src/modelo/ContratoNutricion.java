package modelo;
public class ContratoNutricion implements Contrato {
    private boolean filtroAgua;
    private boolean platosPequenos;

    public ContratoNutricion() {
        this.filtroAgua = false;
        this.platosPequenos = false;
    }

    public void setFiltroAgua(boolean filtroAgua) {
        this.filtroAgua = filtroAgua;
    }

    public void setPlatosPequenos(boolean platosPequenos) {
        this.platosPequenos = platosPequenos;
    }

    @Override
    public boolean cumpleContrato() {
        return filtroAgua && platosPequenos;
    }

    @Override
    public String toString() {
        return "ContratoNutricion{" + "filtroAgua=" + filtroAgua + ", platosPequenos=" + platosPequenos + '}';
    }
    
    
}
