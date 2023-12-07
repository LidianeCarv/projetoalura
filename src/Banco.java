import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "Lidiane Siqueira";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;

        //Inicializar dados do cliente
        String mensagemInicial = """
                ******************************************************
                Dados iniciais do cliente:
                                
                Nome:              %s
                Tipo de conta:     %s
                Saldo inicial:     R$ %.2f
                ******************************************************
                """.formatted(nome, tipoDeConta, saldo);
        System.out.println(mensagemInicial);

        Scanner leitura = new Scanner(System.in);

        //Menu de opções
        String menuDeOpcoes = """
                Operações
                                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """;

        //Visualização do saldo //Envia valores //Recebe valores
        String mensagemSaldo = "Saldo atualizado R$ ";
        String mensagemTranferencia = "Informe o valor que deseja tranferir: ";
        String mensagemReceberValor = "Informe o valor a receber: ";

        int opçoesDoMenu = 0;
        double valor = 0;

        while (opçoesDoMenu != 4) {
            System.out.println(menuDeOpcoes);
            opçoesDoMenu = leitura.nextInt();
            switch (opçoesDoMenu) {
                case 1:
                    System.out.println(mensagemSaldo + saldo);
                    break;

                case 2:
                    System.out.print(mensagemReceberValor);
                    valor = leitura.nextInt();
                    saldo += valor;
                    System.out.println(mensagemSaldo + saldo);
                    break;
                case 3:
                    System.out.println(mensagemTranferencia);
                    valor = leitura.nextInt();
                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente! ");
                        break;
                    } else {
                        saldo -= valor;
                        System.out.println(mensagemSaldo + saldo);
                        break;
                    }
                case 4:
                    System.out.println("Obrigado pela preferência! Seu atendimento está sendo encerrado...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
            System.out.println("        ");
        }
    }
}
