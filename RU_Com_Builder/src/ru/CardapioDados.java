
package ru;

public class CardapioDados {
    private final String diaSemana;
    private final String prato;
    private final String bebida;
    private final String sobremesa;

    public CardapioDados(String diaSemana, String prato, String bebida, String sobremesa) {
        this.diaSemana = diaSemana;
        this.prato = prato;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getPrato() {
        return prato;
    }

    public String getBebida() {
        return bebida;
    }

    public String getSobremesa() {
        return sobremesa;
    }
}

