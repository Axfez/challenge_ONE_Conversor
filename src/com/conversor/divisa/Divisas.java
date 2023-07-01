package com.conversor.divisa;

public enum Divisas {
  //  Definicion constantes con valores de divisa al cambio de peso colombiano
  PESO_DOLAR(4155.22),
  PESO_EURO(4536.01),
  PESO_YEN(28.79),
  PESO_LIBRA(5279.82),
  PESO_WON(3.16),
  ;

  private final double valorCambio;

  Divisas(double valorCambio) {
    this.valorCambio = valorCambio;
  }

  public double getValorCambio() {
    return valorCambio;
  }
}
