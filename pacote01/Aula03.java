package pacote01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Listax;

public class Aula03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de produtos: "); // Pergunta quantos produtos o usuário quer inserir
        int n = sc.nextInt();                         // Insira a quantidade de produtos

        List<Listax> list = new ArrayList<Listax>();  
        // Criando uma lista e usando a classe Listax que foi criada em outro pacote.
        

        for (int i = 0; i < n; i++) {                // for para percorrer todas a lista
            System.out.print("Código: ");
            Integer cod = sc.nextInt();				 // Insira o código do produto
            System.out.print("Nome do produto: ");
            String nome = sc.next();				 // Insira o nome do produto
            System.out.print("Valor: ");
            Double valor = sc.nextDouble();			 // Insira o valor do produto
            Listax compras = new Listax(cod, nome, valor); // Gerando a lista com base nos valores inseridos
            list.add(compras);
            System.out.println();
        }

        char resp = 's';       // Verifica a reposta do usuário se quer fazer outra consulta ou não
        while (resp == 's') {
            System.out.print("Digite o código do produto: ");
            int busca = sc.nextInt();    			 // Pega o número do código para buscar o produto
            for (Listax produto : list) {			 // Percorrendo a lista 
                if (produto.getCod().equals(busca)) { // Se o código do produto for igual o número buscado então:
                    System.out.println(produto);	  // mostrar na tela
                    break;
                }
            }
            System.out.println();
            System.out.print("Deseja consultar outro produto(s/n)?: ");
            resp = sc.next().strip().charAt(0);      // pegando a primeira letra da resposta do usuario
        }

        sc.close();
    }

}


