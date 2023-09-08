import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double average;
        double sum = 0.0;
        double grade;
        int count = 0;

        double[] array = new double[1000];
        do {
            try {
                System.out.println("Calificación: ");
                grade = scan.nextDouble();
                if (grade == 99) {
                    System.out.println("Gracias!!");
                    break;
                } else if (grade >= 0 && grade <= 10) {
                    array[count] = grade;
                    count++;
                } else {
                    System.out.println("Calificación inválida");
                }
            } catch (Exception e) {
                System.out.println("Solo se aceptan números.");
                scan.nextLine();
            }
        }while (true);

        if (count != 0) {
            System.out.println("Calificaciones guardadas: ");
            for (int i = 0; i < count; i++) {
                System.out.print(array[i] + " ");
                sum += array[i];
            }
            System.out.println();

            average = sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("no hay calif.");
        }
    }
}