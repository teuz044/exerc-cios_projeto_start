package att_01;

import java.util.Scanner;

public class app_matriz {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[5][4];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as notas do aluno " + (i+1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Disciplina " + (j+1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            double media = soma / 4.0;
            System.out.println("Média do aluno " + (i+1) + ": " + media);
        }
    }
}
