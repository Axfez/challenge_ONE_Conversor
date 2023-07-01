package com.vistas;

import javax.swing.*;

public class EntradaValorUsuario {
  public double init() {
    boolean valorValido;
    double valorIngresado = 0.0;

//  loop para validar el valor ingresado
    do {
      try {
//      Captura valor ingresado por el usuario
        valorIngresado = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Introduce el valor a transformar"
        ));
        valorValido = true;
//      Tratamiento de errores cuando usuario no ingresa valor o cancela la operacion
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Valor invalido");
        valorValido = false;
      } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
        break;
      }
    } while (!valorValido);
    return valorIngresado;
  }
}
