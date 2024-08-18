package contador;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int firstNumber = terminal.nextInt();

        System.out.print("Digite o segundo número: ");
        int secondNumber = terminal.nextInt();

        try {
            
            contador(firstNumber, secondNumber);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }


        terminal.close();
    }

    public static void contador (int parametroUm, int parametrodois) throws ParametrosInvalidosException  {
        
        if ( parametrodois < parametroUm ) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametrodois - parametroUm;

        for ( int i = 1; i < contagem; i++) {
            System.out.println("Imprimindo o número : " + i);
        }

    }
}