import java.util.Scanner;

public class AccountBanking {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean session = true;

        double accountValue = 2500.00;

        System.out.printf("""
                ***************************************************
                Dados iniciais do cliente:
                                    
                Nome:               Higor Chagas
                Tipo de conta:      Corrente
                Saldo inicial:      R$: %.2f%n
                ***************************************************
                                    
                """, accountValue);

        while (session) {
            System.out.println("""
                                        
                    Operações
                                        
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                        
                    Digite a operação desejada:""");
            int operation = userInput.nextInt();

            switch (operation) {
                case 1:
                    System.out.printf("Você possui R$ %.2f%n", accountValue);
                    break;
                case 2:
                    System.out.print("Informe o valor a receber: ");
                    double depositValue = userInput.nextDouble();
                    accountValue += depositValue;
                    System.out.printf("Saldo atualizado R$ %.2f%n", accountValue);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido:");
                    double transferValue = userInput.nextDouble();
                    if (accountValue < transferValue) {
                        System.out.println("Você não possui esse valor para transferir");
                    } else {
                        accountValue -= transferValue;
                        System.out.printf("Valor atual R$ %.2f%n", accountValue);
                    }
                    break;
                case 4:
                    System.out.println("Você saiu do sistema");
                    session = false;
                    break;
                default:
                    System.out.println("Operação inválida");
            }

        }

    }
}
