package Banco;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente( int agencia , int numero ){

                    super(agencia,numero);



    }


    @Override
    public void deposita(double valor) {
        throw new UnsupportedOperationException("Unimplemented method 'deposita'");
    }

}
