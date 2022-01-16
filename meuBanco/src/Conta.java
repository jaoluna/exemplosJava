public class Conta {
   private int agency;
   private int account;
   private double money;
   private Cliente client;


    public void deposit(double value){
        this.money += value;
    }

    public boolean checkOut(double value){
        if (this.money < value){
            return false;
        }else {
            this.money -= value;
            return true;
        }
    }

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

    public void setAgency(int agency){
       this.agency = agency;
    }

    public int getAccount(){
       return this.account;
    }

    public void setAccount(int account){
        this.account = account;
    }

    public double getMoney(){
        return this.money;
    }

    public Cliente getClient(){
        return this.client;
    }

    public void setClient(Cliente client){
        this.client = client;
    }


}
