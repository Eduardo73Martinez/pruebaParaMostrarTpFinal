package ar.edu.unq.cuentas;

public abstract class CuentaComun {
	private double saldo;
	private double maxNegativ;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getMaxNegativ() {
		return maxNegativ;
	}
	public void setMaxNegativ(double maxNegativ) {
		this.maxNegativ = maxNegativ;
	}
	
	public abstract double saldoActual();
	
	public CuentaComun(double saldo, double maxNegativ) {
		super();
		this.saldo = saldo;
		this.maxNegativ = maxNegativ;
	}
	
	
}
