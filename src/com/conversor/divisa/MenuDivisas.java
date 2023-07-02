package com.conversor.divisa;

import javax.swing.*;

public class MenuDivisas {
  public static void init(double valorIngresado) {
//  Definicion de divisas disponibles para realizar operaciones
    String[] divisas = {
            "Pesos Colombiano a Dolares",
            "Pesos Colombiano a Yenes",
            "Pesos Colombiano a Libras",
            "Pesos Colombiano a Euros",
            "Pesos Colombiano a Wones Coreano",
            "Dolares a Pesos Colombianos",
            "Yenes a Pesos Colombianos",
            "Libras a Pesos Colombianos",
            "Euros a Pesos Colombianos",
            "Wones Coreanos a Pesos Colombianos"
    };
//    Captura de opcion de divisas seleccionadas para realizar operacion
    String divisasSeleccionadas = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona las divisas con las que deseas operar",
            "Menu Divisas",
            JOptionPane.PLAIN_MESSAGE,
            null,
            divisas,
            divisas[0]
    );
    try {
      switch (divisasSeleccionadas) {
        case "Pesos Colombiano a Dolares" -> OperacionCambio.pesoADivisa(valorIngresado, "Dolares", Divisas.PESO_DOLAR);
        case "Pesos Colombiano a Euros" -> OperacionCambio.pesoADivisa(valorIngresado, "Euros", Divisas.PESO_EURO);
        case "Pesos Colombiano a Libras" -> OperacionCambio.pesoADivisa(valorIngresado, "Libras", Divisas.PESO_LIBRA);
        case "Pesos Colombiano a Yenes" -> OperacionCambio.pesoADivisa(valorIngresado, "Yenes", Divisas.PESO_YEN);
        case "Pesos Colombiano a Wones Coreano" ->
                OperacionCambio.pesoADivisa(valorIngresado, "Wones Coreanos", Divisas.PESO_WON);
        case "Wones Coreanos a Pesos Colombianos" ->
                OperacionCambio.divisaAPeso(valorIngresado, "Wones Coreanos", Divisas.PESO_WON);
        case "Euros a Pesos Colombianos" -> OperacionCambio.divisaAPeso(valorIngresado, "Euros", Divisas.PESO_EURO);
        case "Libras a Pesos Colombianos" -> OperacionCambio.divisaAPeso(valorIngresado, "Libras", Divisas.PESO_LIBRA);
        case "Yenes a Pesos Colombianos" -> OperacionCambio.divisaAPeso(valorIngresado, "Yenes", Divisas.PESO_YEN);
        case "Dolares a Pesos Colombianos" ->
                OperacionCambio.divisaAPeso(valorIngresado, "Dolares", Divisas.PESO_DOLAR);
      }
    } catch (NullPointerException e) {
      JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
    }
  }
}
