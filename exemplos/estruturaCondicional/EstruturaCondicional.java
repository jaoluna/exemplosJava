import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args){
        float nota1, nota2, media;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota 1: ");
        nota1 = scanner.nextFloat();
        System.out.print("Nota 2: ");
        nota2 = scanner.nextFloat();
        media = (nota1 + nota2)/2;
        if(media > 9){
            System.out.println("Parabés");
        }else if (media <= 9 && media > 6){
            System.out.println("Bom");
        }else{
            System.out.println("Triste");
        }
        int pernas = scanner.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bipede";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6,8:
                tipo = "aranha";
                break;
            default:
                tipo = "et";
        }
        System.out.println(tipo);
    }
}
