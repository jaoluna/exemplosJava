public class MinhaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setName("João");


        Conta conta1 = new ContaCorrente(222, 2223, cliente);
        Conta conta2 = new ContaCorrente(333, 3332, cliente);

        conta1.deposit(500);
       // System.out.println(conta1.money);

        boolean resultadoSaque = conta1.checkOut(100);
       // System.out.println(conta1.money);
        System.out.println(resultadoSaque);

        conta2.deposit(1000);
        //System.out.println(conta2.money);

        conta2.transfer(conta1, 300);

        //System.out.println(conta1.money);

        //conta1.client = new Cliente();
       // conta2.client = new Cliente();

        //conta1.client.name = "Marcelo Zigueira";
        //conta1.client.cpf = "222.222.222-22";

        //System.out.println(conta1.client.name + ", O Senhor recebeu de presente e sua conta uma quantia em " +
       //         " dinheiro e seu novo saldo é" + conta1.money);
    }
}
