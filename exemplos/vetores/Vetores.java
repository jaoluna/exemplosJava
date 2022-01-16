import java.util.Arrays;

public class Vetores{
    public static void main(String[] args){
        int n[] = {3, 2, 8, 7, 5, 4};

        for (int c = 0; c<n.length; c++){
            System.out.print(n[c] + " ");
        }
        System.out.println(n.length);


        for (int valor: n){
            System.out.println(valor + " ");
        }

        Arrays.sort(n);

        for (int valor: n){
            System.out.println(valor + " ");
        }

        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        int p = Arrays.binarySearch(vet,1);

        System.out.println(p);
    }
}
