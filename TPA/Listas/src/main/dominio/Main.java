package main.dominio;

import main.colecao.IColecao;
import main.lista.ListaEncadeada;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IColecao<Aluno> lista = new ListaEncadeada<>();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;
        while (executando) {
            System.out.println("\n=== Sistema de Gerenciamento de Alunos ===");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Remover Aluno");
            System.out.println("3. Pesquisar Aluno");
            System.out.println("4. Imprimir todos os Alunos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            String entrada = scanner.nextLine();
            int opcao;
            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida! Insira um numero de 1 a 5.");
                continue;
            }
            switch (opcao) {
                case 1:
                    System.out.println("adicionarAluno(scanner, lista)");
                    break;
                case 2:
                    System.out.println("removerAluno(scanner, lista)");
                    break;
                case 3:
                    System.out.println("pesquisarAluno(scanner, lista)");
                    break;
                case 4:
                    System.out.println("imprimirLista(lista)");
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opcao incorreta! Insira um numero de 1 a 5.");
            }
        }
        scanner.close();
    }
}
