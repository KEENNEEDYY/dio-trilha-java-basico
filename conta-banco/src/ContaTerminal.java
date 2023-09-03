import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecher e importar a classe Scanner

        //Exibir as mensagens para o nosso usuario

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome ");
        nomeCliente = inputValue.nextLine();
        System.out.println("Por favor, digite o nome da Agência! ");
        agencia = inputValue.nextLine();
        System.out.println("Por favor, digite o número Agência! ");
        numero = inputValue.nextInt();
        System.out.println("Por favor, digite o depósito inicial! ");
        saldo = inputValue.nextDouble();

        System.out.println();

        System.out.println("Olá "+nomeCliente
                            +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia
                            +" conta "+numero
                            +" e seu saldo "+saldo
                            +" já está disponível para saque");

    }
}
