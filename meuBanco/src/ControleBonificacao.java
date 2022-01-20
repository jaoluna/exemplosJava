public class ControleBonificacao {
    private double bonification;

    //Funcionario é a classe mãe;
    public void registry(Funcionario funcionario){
        bonification = funcionario.getBonification();
    }

    public double getBonification() {
        return bonification;
    }
}
