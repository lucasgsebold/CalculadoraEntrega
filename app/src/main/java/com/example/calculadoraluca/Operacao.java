
package com.example.calculadoraluca;

public enum Operacao {

    ADICAO(" + "),
    SUBTRACAO(" - "),
    MULTIPLICACAO(" × "),
    DIVISAO(" ÷ "),
    PORCENTAGEM(" % ");

    private String texto = "";

    private Operacao(String texto) {
        this.texto = texto;
    }

    public String toString() {
        return this.texto;
    }
}