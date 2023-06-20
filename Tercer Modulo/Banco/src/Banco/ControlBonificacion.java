package Banco;

public class ControlBonificacion {
    private double suma ;
    public double registrarsalario(Gerente gerente){
        this.suma=gerente.getBonifiacion()+this.suma;
        System.out.println("Calculo Actual"+this.suma);
        return this.suma;

    }
}

