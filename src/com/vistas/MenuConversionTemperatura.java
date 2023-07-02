package com.vistas;

import com.conversor.temperatura.MenuTemperatura;

import javax.swing.*;

public class MenuConversionTemperatura {
  public static void init() {
    boolean valorValido;
    double valorIngresado;

    //loop para validar el valor ingresado
    do {
      try {
        valorIngresado = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Introduce el valor a transformar"
        ));
        valorValido = true;
        MenuTemperatura.init(valorIngresado);
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "valor invalido");
        valorValido = false;
      } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
        break;
      }
    } while (!valorValido);
    ContinuarEjecucion.realizarNuevaOperacion();
  }
}
