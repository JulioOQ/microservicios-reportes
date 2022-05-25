package com.jvoq.microservicios.reportes.app.utils.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UtilCountDayMonth {

  public static int numeroDeDiasDelMes(int mes) {

    int numeroDias = -1;

    switch (mes) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      numeroDias = 31;
      break;
    case 4:
    case 6:
    case 9:
    case 11:
      numeroDias = 30;
      break;
    case 2:

      Date anioActual = new Date();
      Calendar c = Calendar.getInstance();
      c.setTime(anioActual);
      int year = c.get(Calendar.YEAR);
      if (esBisiesto(1900 + year)) {
        numeroDias = 29;
      } else {
        numeroDias = 28;
      }
      break;

    }

    return numeroDias;
  }

  public static boolean esBisiesto(int anio) {
    GregorianCalendar calendar = new GregorianCalendar();
    boolean esBisiesto = false;
    if (calendar.isLeapYear(anio)) {
      esBisiesto = true;
    }
    return esBisiesto;

  }

}
