public class TestaReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Nico");
        funcionario.setCpf("123.456.789-10");
        funcionario.setSalary(5000);
        funcionario.getBonification();
        funcionario.showDetail();

        Gerente gerente = new Gerente();
        gerente.setName("Guilherme");
        gerente.setCpf("123.456.789-10");
        gerente.setPassword(123456);
        gerente.setSalary(10000);
        gerente.showDetail();

        Diretor diretor = new Diretor();
        diretor.setName("Paulo");
        diretor.setCpf("123.456.789-10");
        diretor.setPassword(1234);
        diretor.setSalary(15000);
        diretor.showDetail();

        ControleBonificacao controleBonificacao = new ControleBonificacao();

        controleBonificacao.registry(funcionario);
        System.out.println(controleBonificacao.getBonification());
        controleBonificacao.registry(gerente);
        System.out.println(controleBonificacao.getBonification());
        controleBonificacao.registry(diretor);
        System.out.println(controleBonificacao.getBonification());
        // registry() recebe parametros do tipo funcionario, mas como gerente e diretor também é um funcionario o Java aceita;
    }
}
