package Enums;

public enum Fontes {
    SOLAR(1.25, "Solar"), EOLICA(1.15, "Eólica"), HIDRICA(1.05, "Hídrica");

    private final double percentual;
    private final String nome;

    Fontes(double percentual, String nome){
        this.percentual = percentual;
        this.nome = nome;
    }

    public double getPercentual(){
        return this.percentual;
    }
    public String getNome(){
        return this.nome;
    }
}
