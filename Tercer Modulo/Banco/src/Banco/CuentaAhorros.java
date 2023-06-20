package Banco;

public class CuentaAhorros extends Cuenta {
	
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		throw new UnsupportedOperationException("Unimplemented method 'deposita'");
	}

	
	}