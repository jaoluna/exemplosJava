public interface Conta {

    public void deposit(double value);

    public boolean checkOut(double value);

    public boolean transfer(Conta destiny, double value);


}
