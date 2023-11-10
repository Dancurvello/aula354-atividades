package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstNumberInput, secondNumberInput, somaTotal,
                decrementoVariavel, resultadoSoma, resultadoMultiplicacao,
                resultadoSubtracao;

        Scanner firstInput = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        firstNumberInput = firstInput.nextInt();


        Scanner secondInput = new Scanner(System.in);
        System.out.println("Digite outro numero: ");
        secondNumberInput = secondInput.nextInt();
        somaTotal = firstNumberInput + secondNumberInput;
        resultadoSoma = firstNumberInput + secondNumberInput;

        System.out.println("A soma do valores é: " + somaTotal);

        somaTotal++;
        System.out.println("O incremento da soma total é: " + somaTotal);

        resultadoMultiplicacao = firstNumberInput * secondNumberInput;
        resultadoSubtracao = firstNumberInput - secondNumberInput;

        decrementoVariavel = somaTotal - 1;
        System.out.println("O decremento da soma total é: " + decrementoVariavel);
        System.out.println("Resultado da soma é: " + resultadoSoma);
        System.out.println("Resultado da multiplicação é: " + resultadoMultiplicacao);
        System.out.println("Resultado da subtração é: " + resultadoSubtracao);




    }
}