package Entities;

import Enums.Combustiveis;

public class UsinaNaoRenovavel extends Usina {
	private Combustiveis combustivel;

	public UsinaNaoRenovavel(String nome, double producaoMWh, double custoMWh, Combustiveis combustivel){
		super(nome, producaoMWh, custoMWh);
		this.combustivel = combustivel;
	}

	public String geraResumo(){
		return "2," + getNome() + "," + String.format("%.2f", getProducaoMWh()) + "," + String.format("%.2f", getCustoMWh()) + "," + this.combustivel.getNome() + "\n";
	}
	public double calculaPrecoMWh(){
		return (getCustoMWh() * combustivel.getPercentual());
	}
	public String geraDescricao(){
		return "Nome: " + this.getNome() + "\nFonte: "+ this.combustivel.getNome() + "(Não Renovável)\nProdução: " + String.format("%.2f", this.getProducaoMWh()) + "MWh\nCusto por MWh: R$" + String.format("%.2f", this.getCustoMWh()) +  "\nPreço do MWh: R$" + String.format("%.2f", this.calculaPrecoMWh());
	}
}
