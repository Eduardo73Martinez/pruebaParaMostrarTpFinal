package ar.edu.unq.cuentas;

public class CuentaDeAhorro extends CuentaComun {

	public CuentaDeAhorro(double saldo, double maxNegativ) {
		super(saldo, maxNegativ);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double saldoActual() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double saldoNegativo() {
		//tiene otro codigo!
		return this.getSaldo() - 10; 
	}
	

}
