public class Diretor extends Gerente {

    @Override
    public double getBonification(){
        return super.getBonification() + 1000;
    }

}
