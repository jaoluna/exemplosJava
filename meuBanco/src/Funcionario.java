public class Funcionario {
    private String name;
    private String cpf;
    private double salary;

    public Funcionario(){

    }

    public double getBonification(){
        return this.salary * 0.1;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showDetail(){
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario: " + this.salary);
        System.out.println("Bonificacão: " + this.getBonification());
        System.out.println("--");
    }
}

