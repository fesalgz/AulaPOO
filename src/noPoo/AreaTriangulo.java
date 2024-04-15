package noPoo;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Insira as medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Insira as medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pX = (xA + xB +xC)/2;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

        double pY = (yA + yB +yC)/2;
        double areaY = Math.sqrt(pY * (pY- yA) * (pY - yB) * (pY - yC));

        System.out.printf("A área do Triângulo X é: %.2f %n", areaX);
        System.out.printf("A área do Triângulo Y é: %.2f %n", areaY);

        if (areaX > areaY){
            System.out.println("A maior área é: X");
        } else {
            System.out.println("A maior área é: Y");
        }

        sc.close();
    }
}
