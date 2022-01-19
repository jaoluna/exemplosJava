public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double livroJava8 = 59.90;
        double livroTDD = 59.90;

        double soma = livroJava8 + livroTDD;
/*
        double subtracao = livroJava8 - livroTDD;
        double multiplicacao = livroJava8 * livroTDD;
        double divisao = livroJava8 / livroTDD;
        double resto = livroJava8 % livroTDD;
*/

        System.out.println("O total em estoque é " + soma);
/*
        System.out.println("O total em estoque é " + subtracao);
        System.out.println("O total em estoque é " + multiplicacao);
        System.out.println("O total em estoque é " + divisao);
        System.out.println("O total em estoque é " + resto);

        int novoNumero = (int) livroJava8;
        float pontoFlutuante = (float) livroJava8;
        System.out.println("número transformado em intero via casting " + novoNumero);
*/
        int contador = 0;

/*        while (contador < 35){
            double valorDoLivro = 59.90;
            soma += valorDoLivro;
            contador++;
        }
*/

        for (int i = 0; i < 35; i++){
            soma += 59.90;
        }
/*
        //operadores
        soma += valor;
        subtracao -= valor;
        multiplicacao *= valor;
        divisao /= valor;
        resto %= valor;
*/

        System.out.println("O total em estoque é " + soma);


        if (soma < 150){
            System.out.println("Seu estoque está muito baixo");
        }else if(soma >= 2000){
            System.out.println("Seu estoque está muito alto");
        } else {
            System.out.println("Seu estoque está bom");
        }


/*
        if (v1 > v2) {
            valor = 100;
        }else {
            valor = 0;
        }
        // operador ternario
        double valor = v1 > v2 ? 100 : 0;
*/

/*
        // continua o programa e não aparece o numero 7 por causa do continue;
        for (int i = 0; i <= 10; i++){
            if (i == 7){
                continue;
            }
            System.out.println(i);
        }*/
/*
        // para o programa quando atinge o numero 7
        for (int i = 0; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }        */



    }
}
