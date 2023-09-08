import javax.swing.*;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student first = new Student();

        first.setCurp(JOptionPane.showInputDialog("Ingrese CURP"));

        first.setName(JOptionPane.showInputDialog("Ingrese nombre"));

        first.setSex(JOptionPane.showInputDialog("Ingrese sexo"));

        first.setNationality(JOptionPane.showInputDialog("Ingrese nacionalidad"));

        first.setAge(Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad")));

        first.setAccount(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuenta")));

        first.setDegree(JOptionPane.showInputDialog("Ingrese carrera"));

        first.setShift(JOptionPane.showInputDialog("Ingrese turno"));

        first.setStatus(JOptionPane.showInputDialog("Ingrese estatus"));

        first.setSemester(Integer.parseInt(JOptionPane.showInputDialog("Ingrese semestre")));

        first.setGroup(Integer.parseInt(JOptionPane.showInputDialog("Ingrese grupo")));

        first.setGradeAverage(Double.parseDouble(JOptionPane.showInputDialog("Ingrese promedio")));


        JOptionPane.showMessageDialog(null, first.getStudent());

        /*while (true) {
            System.out.println("Introduzca el número del mes:");

            try {
                int month = scan.nextInt();

                if (month > 1 && month <= 12) {
                    switch (month) {
                        case 3, 4, 5 -> System.out.println("Estamos en primavera.");
                        case 6, 7, 8 -> System.out.println("Estamos en verano.");
                        case 9, 10, 11 -> System.out.println("Estamos en otoño.");
                        default -> System.out.println("Estamos en invierno.");
                    }

                    System.out.println("Ingrese S para repetir...");
                    String s = scan.next();
                    if (s.equals("S") || s.equals("s")) {
                    } else {
                        System.out.println("Thanks for using..");
                    }
                } else {
                    System.out.println("Ingrese un número válido dentro del rango 1 - 12.");
                }
            } catch (Exception e) {
                System.out.println("Error en la entrada, intente de nuevo...");
            }
        }*/
    }
}