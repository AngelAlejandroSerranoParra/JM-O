package Banco;

public class Gerente extends Funcionario{
    private String Clave;

    public void setClave(String clave){
        this.Clave = clave;


    }

    public boolean iniciarSesion(String clave){
        return clave=="Alura";


    }

    public double getBonifiacion(){
        return super.getSalario()+this.getSalario()*0.5;
        
            

    }

}
