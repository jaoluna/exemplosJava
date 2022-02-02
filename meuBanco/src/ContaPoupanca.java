public class ContaPoupanca implements Conta {
    private double money;

    @Override
    public void deposit(double value) {
        this.money = value;
    }

    @Override
    public boolean checkOut(double value) {
        return false;
    }

    @Override
    public boolean transfer(Conta destiny, double value) {
        if (this.money >= 0) {
            destiny.deposit(value);
            this.money -= value;
            return true;
        }else{
            return false;
        }
    }

    public double getMoney() {
        return money;
    }
}
