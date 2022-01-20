public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setName("Augusto");
        funcionario.setCpf("123.456.789-10");
        funcionario.setSalary(2000.0);

        funcionario.showDetail();

        Funcionario funcionario1 = new Funcionario();

        funcionario1.setName("Accorsi");
        funcionario1.setCpf("123.456.789-10");
        funcionario1.setSalary(10000);

        funcionario1.showDetail();



        //teste gerente

        Gerente gerente = new Gerente();
        gerente.setName("Diogo");
        gerente.setCpf("123.456.789-10");
        gerente.setSalary(15500);
        gerente.setPassword(123456);

        gerente.showDetail();

        //tem tudo o que um gerente teria, mas não consegue setar uma senha pois sua referencia é do tipo Funcionario;
        Funcionario gerente1 = new Gerente();
        System.out.println(gerente1);
        //erro pois o metodo autentica está na classe gerente e quem define os metodos é o tipo da váriavel;
        //gerente1.autentica(2222);
        gerente1.setName("Adriana");
        gerente1.setCpf("123.456.789-10");
        gerente1.setSalary(5000.0);
        gerente1.getBonification();

        gerente1.showDetail();

    }

}
