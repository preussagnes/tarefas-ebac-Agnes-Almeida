package br.com.ag;

public class Carro {
	private float placa;
	private String tipo;
	public float getPlaca() { //Pega o valor
		return placa;
	}
	public void setPlaca(float placa) { //Adicona o valor
		this.placa = placa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	private String marca;

}
