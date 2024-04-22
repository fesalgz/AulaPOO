package poo;

import poo.entidade.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y; // instanciando = pesquisar sobre
        x = new Triangulo(); //usando a classe triangulo
        y = new Triangulo();

        System.out.println("Insira as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Insira as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

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
