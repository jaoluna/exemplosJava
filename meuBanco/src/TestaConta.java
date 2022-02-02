public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setName("João");;
        ContaCorrente conta = new ContaCorrente(222, 2223, cliente);



        System.out.println(conta.getClient().getName());
        System.out.println(conta.getClient().getCpf());

        conta.deposit(5000);

        System.out.println(conta.getMoney());

        conta.transfer(conta.getPoupanca(), 350 );

        System.out.println(conta.getMoney());
        System.out.println(conta.getPoupanca().getMoney());

        conta.getPoupanca().transfer(conta, 150);

        System.out.println(conta.getMoney());
        System.out.println(conta.getPoupanca().getMoney());




    }
}
