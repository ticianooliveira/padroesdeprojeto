

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        ContaEspecial contaesp1 = new ContaEspecial();
        ContaInvestimento containvest1 = new ContaInvestimento();

        conta1.numero = 1;
//		conta1.saldo = 10000;
        conta1.depositar(10000);
        conta2.numero = 2;
        conta2.saldo = 20000;

        System.out.println("Número da conta 1: " + conta1.numero);
        System.out.println("Número da saldo 1: " + conta1.saldo);
        System.out.println("Número da conta 2: " + conta2.numero);
        System.out.println("Número da saldo 2: " + conta2.saldo);


    }

}