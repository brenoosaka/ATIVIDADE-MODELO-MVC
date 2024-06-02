package view;

import java.util.Scanner;

import controller.AgendaController;
import model.Contato;

public class Main {
    public static void main(String[] args) {
        AgendaController controller = new AgendaController();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nAgenda Eletrônica");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Buscar contato por nome");
            System.out.println("4. Buscar contato por email");
            System.out.println("5. Buscar contato por telefone");
            System.out.println("6. Consultar tamanho da Agenda");
            System.out.println("7. Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir o newline

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    long telefone = scanner.nextLong();
                    controller.adicionarContato(nome, email, telefone);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    boolean removido = controller.removerContato(nomeRemover);
                    if (removido) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("Nome do contato a buscar: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contatoPorNome = controller.buscarContatoPorNome(nomeBuscar);
                    if (contatoPorNome != null) {
                        System.out.println("Contato encontrado: " + contatoPorNome);
                    } else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("Email do contato a buscar: ");
                    String emailBuscar = scanner.nextLine();
                    Contato contatoPorEmail = controller.buscarContatoPorEmail(emailBuscar);
                    if (contatoPorEmail != null) {
                        System.out.println("Contato encontrado: " + contatoPorEmail);
                    } else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;

                case 5:
                    System.out.print("Telefone do contato a buscar: ");
                    long telefoneBuscar = scanner.nextLong();
                    Contato contatoPorTelefone = controller.buscarContatoPorTelefone(telefoneBuscar);
                    if (contatoPorTelefone != null) {
                        System.out.println("Contato encontrado: " + contatoPorTelefone);
                    } else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;

                case 6:
                    int tamanho = controller.consultarTamanhoAgenda();
                    System.out.println("Tamanho da Agenda: " + tamanho + " contatos");
                    break;

                case 7:
                    running = false;
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
