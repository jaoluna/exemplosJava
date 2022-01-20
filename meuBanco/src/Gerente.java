public class Gerente extends Funcionario{
    private int password;

    public boolean autentica(int password){
        if (this.password == password){
            return true;
        }else {
            return false;
        }
    }

    public void setPassword(int password){
        this.password = password;
    }

    @Override
    public double getBonification(){
        return super.getBonification() + 500;
    }


}
