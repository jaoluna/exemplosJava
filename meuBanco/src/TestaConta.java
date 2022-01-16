public class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        conta.setClient(cliente);

        conta.getClient().setName("João Luna");
        conta.getClient().setCpf("222.222.222-22");

        System.out.println(conta.getClient().getName());
        System.out.println(conta.getClient().getCpf());

        conta.deposit(5000);

        System.out.println(conta.getMoney());

    }
}
