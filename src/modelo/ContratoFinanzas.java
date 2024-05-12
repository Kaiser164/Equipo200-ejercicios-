package modelo;
public class ContratoFinanzas implements Contrato {
    private boolean planAhorroAutomatico;
    private boolean pagosAutomaticos;
    private boolean cancelaTvCable;
    private boolean reduceTarifasServicios;

    public ContratoFinanzas() {
        this.planAhorroAutomatico = false;
        this.pagosAutomaticos = false;
        this.cancelaTvCable = false;
        this.reduceTarifasServicios = false;
    }

    public void setPlanAhorroAutomatico(boolean planAhorroAutomatico) {
        this.planAhorroAutomatico = planAhorroAutomatico;
    }

    public void setPagosAutomaticos(boolean pagosAutomaticos) {
        this.pagosAutomaticos = pagosAutomaticos;
    }

    public void setCancelaTvCable(boolean cancelaTvCable) {
        this.cancelaTvCable = cancelaTvCable;
    }

    public void setReduceTarifasServicios(boolean reduceTarifasServicios) {
        this.reduceTarifasServicios = reduceTarifasServicios;
    }

    @Override
    public boolean cumpleContrato() {
        return planAhorroAutomatico && pagosAutomaticos && cancelaTvCable && reduceTarifasServicios;
    }

    @Override
    public String toString() {
        return "ContratoFinanzas{" + "planAhorroAutomatico=" + planAhorroAutomatico + ", pagosAutomaticos=" + pagosAutomaticos + ", cancelaTvCable=" + cancelaTvCable + ", reduceTarifasServicios=" + reduceTarifasServicios + '}';
    }
    
    
}
