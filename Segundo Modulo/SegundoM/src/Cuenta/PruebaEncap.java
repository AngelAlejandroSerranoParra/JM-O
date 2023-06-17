package Cuenta;

public class PruebaEncap {
    public void name(String[] args) {
        Cuenta cuenta =new Cuenta();
        Clienta clienta = new Clienta();
       
        clienta.setTitular("Diego");
        clienta.setDocumento("OAOAJFIOASF");
        
        cuenta.setTitular(clienta);

        Clienta titular = cuenta.getTitular();

        
        System.out.println(clienta.getTitular());

        System.out.println(cuenta.getTitular().getTitular());
        System.out.println(titular);
        
    }
}
