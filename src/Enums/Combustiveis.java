package Enums;

public enum Combustiveis {
    PETROLEO(1.30, "Petróleo"), CARVAO(1.20, "Carvão"), NUCLEAR(1.10, "Nuclear");

    private final double percentual;
    private final String nome;

    Combustiveis(double percentual, String nome){
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
