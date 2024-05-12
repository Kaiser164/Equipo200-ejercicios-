package modelo;
public class ContratoProductividad implements Contrato {
    private boolean cancelaSuscripcionEmail;
    private boolean apagaNotificaciones;
    private boolean modoSilencioCelular;
    private boolean filtroCorreoElectronico;
    private boolean eliminaJuegosRedesSociales;

    public ContratoProductividad() {
        this.cancelaSuscripcionEmail = false;
        this.apagaNotificaciones = false;
        this.modoSilencioCelular = false;
        this.filtroCorreoElectronico = false;
        this.eliminaJuegosRedesSociales = false;
    }

    public void setCancelaSuscripcionEmail(boolean cancelaSuscripcionEmail) {
        this.cancelaSuscripcionEmail = cancelaSuscripcionEmail;
    }

    public void setApagaNotificaciones(boolean apagaNotificaciones) {
        this.apagaNotificaciones = apagaNotificaciones;
    }

    public void setModoSilencioCelular(boolean modoSilencioCelular) {
        this.modoSilencioCelular = modoSilencioCelular;
    }

    public void setFiltroCorreoElectronico(boolean filtroCorreoElectronico) {
        this.filtroCorreoElectronico = filtroCorreoElectronico;
    }

    public void setEliminaJuegosRedesSociales(boolean eliminaJuegosRedesSociales) {
        this.eliminaJuegosRedesSociales = eliminaJuegosRedesSociales;
    }

    @Override
    public boolean cumpleContrato() {
        return cancelaSuscripcionEmail && apagaNotificaciones && modoSilencioCelular && filtroCorreoElectronico && eliminaJuegosRedesSociales;
    }

    @Override
    public String toString() {
        return "ContratoProductividad{" + "cancelaSuscripcionEmail=" + cancelaSuscripcionEmail + ", apagaNotificaciones=" + apagaNotificaciones + ", modoSilencioCelular=" + modoSilencioCelular + ", filtroCorreoElectronico=" + filtroCorreoElectronico + ", eliminaJuegosRedesSociales=" + eliminaJuegosRedesSociales + '}';
    }
    
    
}
