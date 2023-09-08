import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Earthquakes eq1 = new Earthquakes();
        Scanner scanner = new Scanner(System.in);
        String[] months = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int hour;
        int day = 0;
        String month, locality;
        double value;
        int op;
        boolean isMonth = false;
        Earthquakes eq2 = new Earthquakes(day, null, null);
        String menu = """
                        ---MENU DE TERREMOTOS---
                         1) Ingresar datos generales
                         2) Ingresar un terremoto en día y hora específicos
                         3) Consultar un terremoto en día y hora específicos
                         4) Consultar datos completos
                         5) Salir
                         -> Elija una opcion:\s""";

        do {
            do {
                op = 0;
                try {
                    op = Integer.parseInt(JOptionPane.showInputDialog(menu));
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, " La entrada debe ser numérica", "Dato no valido", JOptionPane.WARNING_MESSAGE);
                }
            } while (op == 0);
            switch (op) {
                case 1 -> {
                    do {
                        day = 0;
                        try {
                            day = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
                            if (day <= 0) {
                                JOptionPane.showMessageDialog(null, "El número del día no puede ser menor a 1", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, " La entrada debe ser numérica", "Dato no válido", JOptionPane.WARNING_MESSAGE);
                        }

                    }while (day <= 0);
                    do {
                        isMonth = false;
                        month = JOptionPane.showInputDialog("Ingrese el mes: ").toLowerCase();
                        if (Arrays.asList(months).contains(month)) {
                            isMonth = true;
                        } else {
                            JOptionPane.showMessageDialog(null, " Ingrese un mes válido", "Dato no válido", JOptionPane.WARNING_MESSAGE);
                        }
                    } while (!isMonth);
                    locality = JOptionPane.showInputDialog("Ingrese la localidad: ");

                    for (int i = 0; i < 24; i++) {
                        do {
                            value = 0.0;
                            try {
                                value = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la hora" + (i+1) + ": "));
                                if (value <= 0) {
                                    JOptionPane.showMessageDialog(null, "El número del día no puede ser menor a 0", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, " La entrada debe ser numérica", "Dato no válido", JOptionPane.WARNING_MESSAGE);
                            }
                        } while (value <= 0.0);
                        eq2.setHour(i, value);
                    }
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, eq2.getDatos(), "Ventas del empleado", JOptionPane.PLAIN_MESSAGE);
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(null, "Gracias!!");
                    System.exit(0);
                }
                default -> System.out.println(" Opción no válida");
            }

        }while (true);

    }
}