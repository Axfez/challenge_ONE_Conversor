package com.conversor.temperatura;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MenuTemperatura {
  public static void init(double valorIngresado) {
    double resultado;

    String[] unidades = {
            "Celsius a Fahrenheit",
            "Celsius a Kelvin",
            "Celsius a Rankine",
            "Fahrenheit a Celsius",
            "Fahrenheit a Kelvin",
            "Fahrenheit a Rankine",
            "Kelvin a Celsius",
            "Kelvin a Fahrenheit",
            "Kelvin a Rankine",
            "Rankine a Celcius",
            "Rankine a Fahrenheit",
            "Rankine a Kelvin"
    };


    String unidadesSeleccionadas = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione las unidades con las que desea operar",
            "Menu Unidades",
            JOptionPane.PLAIN_MESSAGE,
            null,
            unidades,
            unidades[0]
    );

    if (unidadesSeleccionadas != null) {
      switch (unidadesSeleccionadas) {
        case "Celsius a Fahrenheit" -> {
          resultado = Unidades.CELSIUSAFAHRENHEIT.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Celsius", "Fahrenheit");
        }
        case "Celsius a Kelvin" -> {
          resultado = Unidades.CELSIUSAKELVIN.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Celsius", "Kelvin");
        }
        case "Celsius a Rankine" -> {
          resultado = Unidades.CELSIUSARANKINE.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Celsius", "Rankine");
        }
        case "Fahrenheit a Celsius" -> {
          resultado = Unidades.FARENHEITACELSIUS.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Fahrenheit", "Celsius");
        }
        case "Fahrenheit a Kelvin" -> {
          resultado = Unidades.FARENHEITAKELVIN.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Fahrenheit", "Kelvin");
        }
        case "Fahrenheit a Rankine" -> {
          resultado = Unidades.FARENHEITARANKINE.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Fahrenheit", "Rankine");
        }
        case "Kelvin a Celsius" -> {
          resultado = Unidades.KELVINACELSIUS.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Kelvin", "Celsius");
        }
        case "Kelvin a Fahrenheit" -> {
          resultado = Unidades.KELVINAFAHRENHEIT.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Kelvin", "Fahrenheit");
        }
        case "Kelvin a Rankine" -> {
          resultado = Unidades.KELVINARANKINE.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Kelvin", "Rankine");
        }
        case "Rankine a Celcius" -> {
          resultado = Unidades.RANKINEACELSIUS.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Rankine", "Celcius");
        }
        case "Rankine a Fahrenheit" -> {
          resultado = Unidades.RANKINEAFAHRENHEIT.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Rankine", "Fahrenheit");
        }
        case "Rankine a Kelvin" -> {
          resultado = Unidades.RANKINEAKELVIN.calculate(valorIngresado);
          imprimeResultado(valorIngresado, resultado, "Rankine", "Kelvin");
        }
      }
    }
  }

  private static void imprimeResultado(double valorIngresado, double resultado, @NotNull String unidadIngresada, String unidadATransformar) {
    if (unidadIngresada.equalsIgnoreCase("Kelvin")) {
      JOptionPane.showMessageDialog(
              null,
              valorIngresado + " " + unidadIngresada + " equivale a: " + String.format("%.2f", resultado) + "° " + unidadATransformar
      );
    } else if (unidadATransformar.equalsIgnoreCase("Kelvin")) {
      JOptionPane.showMessageDialog(
              null,
              valorIngresado + "° " + unidadIngresada + " equivale a: " + String.format("%.2f", resultado) + " " + unidadATransformar
      );
    } else {
      JOptionPane.showMessageDialog(
              null,
              valorIngresado + "° " + unidadIngresada + " equivale a: " + String.format("%.2f", resultado) + "° " + unidadATransformar
      );
    }

  }
}
