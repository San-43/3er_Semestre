package pk_employee;

import javax.swing.*;

public class EmployeeMenu {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        int op, mes, noEmp, year;
        String ventaS, menu, opS, noEmpS, yearS, mesS;
        double venta;

        menu = """
                ---MENU DE EMPLEADO---
                 1) Alta de datos generales
                 2) Ingresar una venta
                 3) Consultar una venta
                 4) Consultar datos y ventas
                 5) Salir 
                 -> Elija una opcion:\s""";

        do {
            do {
                op = 0;
                opS = JOptionPane.showInputDialog(menu);
                try {
                    op = Integer.parseInt(opS);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, " La entrada debe ser numérica", "Dato no valido", JOptionPane.WARNING_MESSAGE);
                }
            } while (op == 0);
            switch (op) {
                case 1 -> {
                    do {
                        noEmp = 0;
                        noEmpS = JOptionPane.showInputDialog(null, "Ingrese el ID: ");
                        try {
                            noEmp = Integer.parseInt(noEmpS);
                            if (noEmp <= 0)
                                JOptionPane.showMessageDialog(null, "El número de empleado no puede ser menor a 1", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, " La entrada debe ser numérica", "Dato no válido", JOptionPane.WARNING_MESSAGE);
                        }
                    } while (noEmp <= 0);
                    emp1.setNoEmpleado(noEmp);
                    emp1.setNombre(JOptionPane.showInputDialog(null, "Ingresa el nombre: "));
                    emp1.setDepartamento(JOptionPane.showInputDialog(null, "Ingresa el departamento: "));
                    do {
                        year = 0;
                        yearS = JOptionPane.showInputDialog(null, " Ingresa el año: ");
                        try {
                            year = Integer.parseInt(yearS);
                            if (year < 2000 || year > 2023)
                                JOptionPane.showMessageDialog(null, "El año debe ser válido", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, " La entrada debe ser numérica", "Dato no válido", JOptionPane.WARNING_MESSAGE);
                        }
                    } while (year < 2000 || year > 2023);
                    emp1.setAnio(year);
                }
                case 2 -> {
                    do {
                        mes = 0;
                        mesS = JOptionPane.showInputDialog("Ingresa el mes de la venta: ");
                        try {
                            mes = Integer.parseInt(mesS);
                            if (mes < 1 || mes > 12)
                                JOptionPane.showMessageDialog(null, "El mes debe ser válido", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, " La entrada debe ser numérica", "Dato no válido", JOptionPane.WARNING_MESSAGE);
                        }
                    } while (mes < 1 || mes > 12);
                    do {
                        venta = -1;
                        ventaS = JOptionPane.showInputDialog("Ingresa la venta del mes " + mes + ": ");
                        try {
                            venta = Float.parseFloat(ventaS);
                            if (venta < 0)
                                JOptionPane.showMessageDialog(null, "La venta no puede ser negativa", " Venta no válido", JOptionPane.WARNING_MESSAGE);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, " La entrada debe ser numérica", "Dato no válido", JOptionPane.WARNING_MESSAGE);
                        }
                    } while (venta < 0);
                    emp1.setVentas(venta, mes);
                }
                case 3 -> {
                    do {
                        mes = 0;
                        mesS = JOptionPane.showInputDialog("Ingresa el mes de la venta: ");
                        try {
                            mes = Integer.parseInt(mesS);
                            if (mes < 1 || mes > 12)
                                JOptionPane.showMessageDialog(null, "El mes debe ser válido", "Entrada no válida", JOptionPane.WARNING_MESSAGE);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, " La entrada debe ser numérica", "Dato no válido", JOptionPane.WARNING_MESSAGE);
                        }
                    } while (mes < 1 || mes > 12);
                    if (emp1.getVentas(mes) < 0)
                        JOptionPane.showMessageDialog(null, "No se ha ingresado una venta en el mes " + mes);
                    else
                        JOptionPane.showMessageDialog(null, emp1.getVentasD(mes));
                }
                case 4 ->
                        JOptionPane.showMessageDialog(null, emp1.getDatos(), "Ventas del empleado", JOptionPane.PLAIN_MESSAGE);
                case 5 -> {
                    JOptionPane.showMessageDialog(null, "Gracias!!");
                    System.exit(0);
                }
                default -> System.out.println(" Opción no válida");
            }
        } while (true);
    }
}
