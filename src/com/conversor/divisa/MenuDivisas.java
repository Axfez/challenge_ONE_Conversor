package com.conversor.divisa;

import com.vistas.EntradaValorUsuario;

import javax.swing.*;

public class MenuDivisas {
  public static void init() {
//  Array con lista de divisas disponibles para realizar operaciones
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
//  Captura de valor ingresado por el usuario para realizar la operacion de cambio
    EntradaValorUsuario valorIngresado = new EntradaValorUsuario();
    double valorDivisa = valorIngresado.init();
//  Cuadro de dialogo adicional cuando el usuario ingresa un valor de 0 o negativo
    if (valorDivisa < 0.0) {
      JOptionPane.showMessageDialog(null, "No puedes transformar valores negativos");
      valorIngresado.init();

    } else if (valorDivisa == 0.0) {
      JOptionPane.showMessageDialog(null, "No puedes transformar el valor de 0");
      valorIngresado.init();
    } else {
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
//        TODO: switch para transformar cada divisa
      } catch (NullPointerException e) {
        JOptionPane.showInternalMessageDialog(null, "Gracias por usar el programa");
      }
    }
  }
}
