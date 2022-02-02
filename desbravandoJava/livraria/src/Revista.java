public class Revista implements Produto, Promocional{
    @Override
    public double getValor(){
        return 0;
    }

    @Override
    public boolean aplicaDesconto(double porcentagem) {
        return false;
    }
}
