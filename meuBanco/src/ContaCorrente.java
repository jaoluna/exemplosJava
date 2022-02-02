public class ContaCorrente implements Conta{

    private int agency;
    private int account;
    private double money;
    private Cliente client;
    private ContaPoupanca poupanca;

    public ContaCorrente(int agency, int account, Cliente cliente){
        this.poupanca = new ContaPoupanca();
        this.agency = agency;
        this.account = account;
        this.client = cliente;
    }

    @Override
    public void deposit(double value){
        this.money += value;
    }

    @Override
    public boolean checkOut(double value){
        if (this.money < value){
            return false;
        }else {
            this.money -= value;
            return true;
        }
    }
    @Override
    public boolean transfer(Conta destiny, double value){
        if (this.checkOut(value)){
            destiny.deposit(value);
            return true;
        }else {
            return false;
        }
    }

    public int getAgency() {
        return agency;
    }

    public int getAccount() {
        return account;
    }


    public double getMoney() {
        return money;
    }


    public Cliente getClient() {
        return client;
    }


    public ContaPoupanca getPoupanca() {
        return poupanca;
    }
}
