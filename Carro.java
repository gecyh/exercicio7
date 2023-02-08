package br.com.gecieli.exercicio;

import java.util.Date;

public class Carro {
	
	private String cor;
	private String modelo;
	private String portas;
	private String tipoDeCombustivel;
	private Date fabricacao;
	
	public Carro() {
		
	}
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPortas() {
		return portas;
	}
	public void setPortas(String portas) {
		this.portas = portas;
	}
	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}
	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	public Date getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}
	
	public void cadastrarCor(String cor) {
		setCor(cor);
	}

	/**
	 * Metodo que retorna a cor do carro.
	 */
	public void imprimirCor() {
		System.out.println(this.cor);
	}

	
	public static void main(String[] args) {
		System.out.println("teste");
	}

}
