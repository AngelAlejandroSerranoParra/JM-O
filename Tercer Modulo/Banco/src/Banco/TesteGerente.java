package Banco;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente=new Gerente();
        // gerente.setSalario(5000);
        // Funcionario gerente= new Funcionario();
        gerente.setSalario(600);
        gerente.setClave("Alura");

        gerente.setTipo(1);

        System.out.println(gerente.getSalario());
        System.out.println(gerente.iniciarSesion("Alura"));

    }
}
