package com.vistas;

import javax.swing.*;

// Ejecucion cuadro de dialogo para realizar otra operacion
public class ContinuarEjecucion {
  public static void realizarNuevaOperacion() {
    int respuesta = JOptionPane.showConfirmDialog(
            null,
            "Desea realizar otra operacion",
            "Continuar ejecucion",
            JOptionPane.YES_NO_OPTION
    );

    if (respuesta == 0) MenuOperaciones.init();
  }
}
