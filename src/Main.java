import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("""
                Para iniciar no seu novo banco, você começará com um saldo de R$1000! É um presente <3
                
                Digite seu nome completo: 
                """);
        String nomeUsuario = leitor.nextLine();

        double saldoUsuario = 1000.00;

        String menuPrincipal = """
                -----------------------------------------------------------
                Bem-vindo ao seu incrível banco!
                Dados iniciais do cliente:
                
                Nome:                      %s
                Tipo conta:                Corrente
                Saldo:                     R$%.2f%n
                -----------------------------------------------------------
                
                
                Digite a opção que deseja:
                
                1- Depositar valor em conta corrente
                2- Transferir valor
                3- Investir
                4- Sair
                
                """.formatted(nomeUsuario, saldoUsuario); //Usar "%.2f%n" vai fazer mostrar somente duas casas decimais

       int opcao = 0;

        while (opcao != 4) {
            if (opcao == 0) {
                System.out.println(menuPrincipal);
                opcao = leitor.nextInt();
            }

            switch(opcao) {
                case 1:
                    System.out.println("""
                            Qual valor você deseja depositar?
                            Caso desista e queira voltar, digite 0.
                            
                            
                            Valor para depósito: 
                            """);
                            int valorDeposito = leitor.nextInt();
                            if (valorDeposito == 0) {
                                opcao -= 1;
                            }

                    break;
        }


        }





    }
}