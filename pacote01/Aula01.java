package pacote01;

import java.util.Scanner;

public class Aula01 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println();
        if (n1 > n2){
            System.out.println("O primeiro número é o maior!");
        }
        else{
            System.out.println("O segundo número é o maior!");
        }


    }
    
}
