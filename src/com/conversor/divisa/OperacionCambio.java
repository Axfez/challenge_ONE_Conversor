package com.conversor.divisa;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.text.NumberFormat;

public class OperacionCambio {
  public static void pesoADivisa(double valorIngresado, String divisa, @NotNull Divisas divisas) {
    NumberFormat valorFormateado = NumberFormat.getCurrencyInstance();
    String divisaFormateada = valorFormateado.format(valorIngresado);

    JOptionPane.showMessageDialog(null, "Peso Colombiano a " + divisa + " seleccionado");
    double resultado = valorIngresado / divisas.getValorCambio();
    String resultadoFormateado = valorFormateado.format(resultado);
    JOptionPane.showMessageDialog(
            null,
            divisaFormateada + " Pesos Colombianos equivalen a: " + resultadoFormateado + " " + divisa
    );
  }

  public static void divisaAPeso(double valorIngresado, String divisa, @NotNull Divisas divisas) {
    NumberFormat valorFormateado = NumberFormat.getCurrencyInstance();
    String divisaFormateada = valorFormateado.format(valorIngresado);

    JOptionPane.showMessageDialog(null, divisa + " a Peso Colombiano" + " seleccionado");
    double resultado = valorIngresado * divisas.getValorCambio();
    String resultadoFormateado = valorFormateado.format(resultado);
    JOptionPane.showMessageDialog(
            null,
            divisaFormateada + " " + divisa + " equivalen a: " + resultadoFormateado + " " + "Pesos Colombianos"
    );
  }
}
