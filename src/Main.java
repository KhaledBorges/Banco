import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


            sout("""
                
                Para iniciar no seu novo banco, você começará com um saldo de R$1000! É um presente <3
                
                Digite seu nome completo: 
                """);
        String nomeUsuario = leitor.nextLine();

        int saldoUsuario = 1000;

        //Aqui são as variáveis que vão ter valor de 0 e que serão alteradas conforme necessário.-----
       int opcao = 0;
       int valorDeposito = 0;
       int valorTransferencia = 0;
       int investimento = 0;
       //---------------------------------------------------------------------------------------------

        while (opcao != 4) {
            if (opcao > 4 || opcao < 0) {
            sout("\nOpção inválida. Tente novamente");
            opcao = 0;
            }
            switch(opcao) {
                case 0:
                    sout("""
                    -----------------------------------------------------------
                    Bem-vindo ao seu incrível banco!
                    Dados iniciais do cliente:
                    
                    Nome:                      %s
                    Tipo conta:                Corrente
                    Saldo:                     R$%d
                    -----------------------------------------------------------
                    
                    
                    Digite a opção que deseja:
                    
                    1- Depositar valor em conta corrente
                    2- Transferir valor
                    3- Investir
                    4- Sair
                    
                    """.formatted(nomeUsuario, saldoUsuario)); //Usar "%.2f%n" vai fazer mostrar somente duas casas decimais
                    opcao = leitor.nextInt();
                    break;

                case 1:
                        sout("""
                            Digite abaixo qual valor você deseja depositar.
                            Valor mínimo de R$100.
                            """);
                    valorDeposito = leitor.nextInt();
                    if (valorDeposito < 100) {
                        sout("\nO valor mínimo de depósito é de 100 reais.");
                    } else {
                        saldoUsuario += valorDeposito;
                        sout(valorDeposito + " reais foram depositados com sucesso! Seu novo saldo é de: R$ " + saldoUsuario);
                        sout("""
                                -----------------------------------------------
                                Digite 1 para realizar mais um depósito!
                                Ou digite 0 para voltar para o menu principal!
                                -----------------------------------------------
                                """);
                        opcao = leitor.nextInt();
                    }
                    break;

                case 2: sout("""
                            Digite abaixo qual valor você deseja transferir.
                            Valor mínimo de R$100.
                            """);
                    valorTransferencia = leitor.nextInt();
                    if (valorTransferencia < 100) {
                        sout("\nO valor mínimo de transferência é de 100 reais.\n");
                    } else if (valorTransferencia > saldoUsuario) {
                        sout("O valor que você está tentando transferir é maior que o valor que você possui! Tente novamente\n");
                    } else {
                        saldoUsuario -= valorTransferencia;
                        sout(valorTransferencia + " reais foram transferidos com sucesso! Seu novo saldo é de: R$ " + saldoUsuario);
                        sout("""
                                -----------------------------------------------
                                Digite 2 para realizar mais uma transferência!
                                Ou digite 0 para voltar para o menu principal!
                                -----------------------------------------------
                                """);
                        opcao = leitor.nextInt();
                    }
                    break;

                case 3: sout("""
                            ---------------------------------------------------------
                            Bem-vindo à área de investimentos!
                            
                            Você tem somente uma opção de investimento e seu rendimento será de 1 real por dia.
                            
                            Aperte 1 para investir. (Recomendado)
                            Aperte 0 para voltar. (Não recomendado)
                            ---------------------------------------------------------
                            """.formatted(saldoUsuario));
                            int vaiInvestir = leitor.nextInt();
                            if (vaiInvestir == 0) {
                                opcao = 0;
                            } else if (vaiInvestir > 1 || vaiInvestir < 0) {
                                sout("Opção inválida, tente novamente!");
                            } else {
                                sout("Quantos reais deseja investir?\n");
                                investimento = leitor.nextInt();
                                if (investimento < 1) {
                                    sout("Valor inválido. Tente novamente\n");
                                } else if (investimento > saldoUsuario) {
                                    sout("Você não possui esse valor. Tente novamente.\n");
                                } else {
                                    saldoUsuario -= saldoUsuario;
                                    sout("\nParabéns! Seu investimento de %d reais foi feito!\n".formatted(investimento));
                                    sout("Por causa das taxas e inflação, pegamos uma porcentagem do valor, e para cobrir os serviços, mais uma porcentagem\n");
                                    sout("O seu novo saldo é de R$%d\nAliás, também pegamos o valor investido por causa de juros antecipados\n".formatted(saldoUsuario));
                                    sout("Pressione qualquer número para voltar ao menu principal! (Não há mais nada que você possa fazer agora :D)\n");
                                    leitor.nextInt();
                                    opcao = 0;
                                }
                                }
                            break;
                            }
            }
    }

    static void sout(String message) {
            System.out.println(message);
        }
}
