package Entities;

import Enums.Combustiveis;

public class UsinaNaoRenovavel extends Usina {
	private Combustiveis combustivel;

	public UsinaNaoRenovavel(String nome, double producaoMWh, double custoMWh, Combustiveis combustivel){
		super(nome, producaoMWh, custoMWh);
		this.combustivel = combustivel;
	}

	public String geraResumo(){
		return "1," + getNome() + "," + Double.toString(getProducaoMWh()) + "," + Double.toString(getCustoMWh()) + "," + this.combustivel.getNome();
	}
	public double calculaPrecoMWh(){
		return (getProducaoMWh() * (getCustoMWh() * combustivel.getPercentual()));
	}
}
