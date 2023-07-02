package com.conversor.temperatura;

public enum Unidades {

  CELSIUSAFAHRENHEIT {
    public double calculate(double valorIngresado) {
      return (valorIngresado * 9 / 5) + 32;
    }
  },
  CELSIUSAKELVIN {
    public double calculate(double valorIngresado) {
      return valorIngresado + 273.15;
    }
  },
  CELSIUSARANKINE {
    public double calculate(double valorIngresado) {
      return (valorIngresado * 9 / 5) + 491.67;
    }
  },
  FARENHEITARANKINE {
    public double calculate(double valorIngresado) {
      return valorIngresado + 459.67;
    }
  },
  FARENHEITAKELVIN {
    public double calculate(double valorIngresado) {
      return (valorIngresado - 32) * 5 / 9 + 273.15;
    }
  },
  FARENHEITACELSIUS {
    public double calculate(double valorIngresado) {
      return (valorIngresado - 32) * 5 / 9;
    }
  },
  KELVINARANKINE {
    public double calculate(double valorIngresado) {
      return valorIngresado * 1.8;
    }
  },
  KELVINACELSIUS {
    public double calculate(double valorIngresado) {
      return valorIngresado - 273.15;
    }
  },
  KELVINAFAHRENHEIT {
    public double calculate(double valorIngresado) {
      return (valorIngresado - 273.15) * 9 / 5 + 32;
    }
  },
  RANKINEAKELVIN {
    public double calculate(double valorIngresado) {
      return valorIngresado * 5 / 9;
    }
  },
  RANKINEACELSIUS {
    public double calculate(double valorIngresado) {
      return (valorIngresado - 491.67) * 5 / 9;
    }
  },
  RANKINEAFAHRENHEIT {
    public double calculate(double valorIngresado) {
      return valorIngresado - 459.67;
    }
  };

  public abstract double calculate(double valorIngresado0);
}
