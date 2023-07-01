package com.vistas;

import javax.swing.*;

public class MenuOperaciones {
  public static void main(String[] args) {
    init();
  }

  public static void init() {
//    Definicion opciones del menu selector
    String[] options = {"Convertir divisa", "Convertir temperatura"};
//    Capturar opcion seleccionada por el usuario
    String operacionARealizar = (String) JOptionPane.showInputDialog(
            null,
            "Selecciona lo que deseas hacer",
            "Menu principal",
            JOptionPane.PLAIN_MESSAGE,
            null,
            options,
            options[0]
    );
//    Manejar la opcion escogida por el usuario
    if (operacionARealizar != null) {
      switch (operacionARealizar) {
        case "Convertir divisa":
          JOptionPane.showMessageDialog(null, "Convertir divisas seleccionado");
          break;
        case "Convertir temperatura":
          JOptionPane.showMessageDialog(null, "Convertir temperatura seleccionado");
          break;
      }
    } else {
//      En caso que el usuario no escoja ninguna opcion
      JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
    }

  }
}
