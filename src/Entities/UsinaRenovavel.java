package Entities;

import Enums.Fontes;

public class UsinaRenovavel extends Usina {
	private Fontes fonte;

	public UsinaRenovavel(String nome, double producaoMWh, double custoMHw, Fontes fonte){
		super(nome, producaoMWh, custoMHw);
		this.fonte = fonte;
	}

	public String geraResumo(){
		return "1," + getNome() + "," + String.format("%.2f", getProducaoMWh()) + "," + String.format("%.2f", getCustoMWh()) + "," + this.fonte.getNome();
	}
	public double calculaPrecoMWh(){
		return (getProducaoMWh() * (getCustoMWh() * fonte.getPercentual()));
	}
}
