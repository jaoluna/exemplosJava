import java.util.Scanner;

public class TiposPrimitivos{
    public static void main(String[] args){
        String nome = "Joao Luna";
        float nota = (float) 8.5;
        System.out.println("Sua nota é " + nota);
        System.out.printf("Sua nota é %.2f \n", nota);
        System.out.printf("A nota de %s é %.3f \n", nome, nota);
        System.out.format("A nota de %s é %.1f \n", nome, nota);

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        String name = teclado.nextLine();
        System.out.print("Digite sua nota: ");
        float numero = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", name, numero);
    }
}
