package Entities;

public abstract class Usina {
	private String nome;
	private double producaoMWh;
	private double custoMWh;

	public Usina(String nome, double producaoMWh, double custoMWh){
		this.nome = nome;
		this.producaoMWh = producaoMWh;
		this.custoMWh = custoMWh;
	}

	public abstract double calculaPrecoMWh();
	public abstract String geraResumo();

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setProducaoMWh(double producaoMWh){
		this.producaoMWh = producaoMWh;
	}
	public void setCustoMWh(double custoMWh){
		this.custoMWh = custoMWh;
	}

	public String getNome(){
		return this.nome;
	}
	public double getProducaoMWh(){
		return this.producaoMWh;
	}
	public double getCustoMWh(){
		return this.custoMWh;
	}
}
