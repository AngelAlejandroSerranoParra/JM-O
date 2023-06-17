package Banco;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setDocumento("Diego");
        diego.setDocumento("1234");
        diego.setSalario(200);
        diego.setTipo(0);
        
        System.out.println("Salario:"+diego.getSalario());

        System.out.println("Bonificacion:"+diego.getBonifiacion());

    }
}
