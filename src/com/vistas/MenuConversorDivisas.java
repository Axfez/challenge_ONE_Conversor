package com.vistas;

import com.conversor.divisa.MenuDivisas;

import javax.swing.*;

public class MenuConversorDivisas {
  public static void init() {
    boolean valorValido = false;
    double valorIngresado;

    // loop para validar el valor ingresado
    do {
      try {
        valorIngresado = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Introduce el valor a transformar"
        ));

        if (valorIngresado == 0 || valorIngresado < 0) {
          JOptionPane.showMessageDialog(null, "Valor invalido, intenta de nuevo");
        } else {
          valorValido = true;
          MenuDivisas.init(valorIngresado);
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Valor invalido, intenta de nuevo");
        valorValido = false;
      } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
        break;
      }
    } while (!valorValido);
    ContinuarEjecucion.realizarNuevaOperacion();
  }
}
