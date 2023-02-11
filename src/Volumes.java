import java.util.Scanner;
import static java.lang.Math.*;
public class Volumes {
    public static void main(String[] args) {
        System.out.println("Введите название фигуры");
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine().toLowerCase();
        switch (figure) {
            case "куб" -> {
                System.out.println("Введите длину ребра");
                double a = sc.nextDouble();
                double v = pow(a, 3);
                System.out.println("Объём куба: " + v);
            }
            case "прямоугольный параллелепипед" -> {
                System.out.println("Введите длину, ширину и высоту");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double v = a * b * c;
                System.out.println("Объём прямоугольного параллелепипеда: " + v);
            }
            case "шар" -> {
                System.out.println("Введите радиус");
                double r = sc.nextDouble();
                double v = (4.0 / 3.0) * PI * pow(r, 3);
                System.out.println("Объём шара: " + v);
            }
            case "цилиндр" -> {
                System.out.println("Введите радиус");
                double r =  sc.nextDouble();
                System.out.println("Введите высоту");
                double h = sc.nextDouble();
                double v = PI * pow(r, 2) * h;
                System.out.println("Объём цилиндра: " + v);
            }
            case "конус" -> {
                System.out.println("Введите радиус");
                double r =  sc.nextDouble();
                System.out.println("Введите высоту");
                double h = sc.nextDouble();
                double v = (1.0 / 3.0) * PI * pow(r, 2) * h;
                System.out.println("Объём конуса: " + v);
            }
            case "пирамида" -> {
                System.out.println("Введите площадь основания");
                double s = sc.nextDouble();
                System.out.println("Введите высоту");
                double h = sc.nextDouble();
                double v = (1.0 / 3.0) * s * h;
                System.out.println("Объём пирамиды: " + v);
            }
            case "призма" -> {
                System.out.println("Введите площадь основания");
                double s = sc.nextDouble();
                System.out.println("Введите высоту");
                double h = sc.nextDouble();
                double v = s * h;
                System.out.println("Объём призмы: " + v);
            }
            case "усечённый конус" -> {
                System.out.println("Введите первый радиус");
                double r1 = sc.nextDouble();
                System.out.println("Введите второй радиус");
                double r2 = sc.nextDouble();
                System.out.println("Введите высоту");
                double h = sc.nextDouble();
                double v = (1.0 / 3.0) * PI * h * (pow(r1, 2) + pow(r2, 2) + r1 * r2);
                System.out.println("Объём усечённого конуса: " + v);
            }
            case "усечённая пирамида" -> {
                System.out.println("Введите площадь первого основания");
                double s1 = sc.nextDouble();
                System.out.println("Введите площадь второго основания");
                double s2 = sc.nextDouble();
                System.out.println("Введите высоту");
                double h = sc.nextDouble();
                double v = (1.0 / 3.0) * h * (s1 + s2 + sqrt(s1 * s2));
                System.out.println("Объём усечённой пирамиды: " + v);
            }
            default -> throw new IllegalArgumentException("Невозможно найти объём");
        }
    }

}