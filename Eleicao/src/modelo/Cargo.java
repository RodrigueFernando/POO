package modelo;

import java.util.Objects;

public class Cargo {
    private int idCargo;
    private   String  cargo;

    public Cargo(int idCargo, String cargo) {
        this.idCargo = idCargo;
        this.cargo = cargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void mostrarDadoCArgo(){
        System.out.println("\n\n Cargo\n Id: " + this.getIdCargo() +
                "\n cargo: " + this.getCargo());

    }
}
