package Banco;

public class Gerente extends Funcionario{
    private String Clave;

    public void setClave(String clave){
        this.Clave = clave;


    }

    public boolean iniciarSesion(String clave){
        return clave=="Alura";
        

    }

}
