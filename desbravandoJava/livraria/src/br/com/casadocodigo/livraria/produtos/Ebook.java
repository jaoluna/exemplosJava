package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Promocional;

public class Ebook extends Livro implements Promocional {

    private String waterMark;


    public Ebook(Autor autor){
        super(autor);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override
    public boolean aplicaDesconto(double porcentagem){
        if (porcentagem > 0.15){
            return false;
        }else {
            double desconto = getValor() * porcentagem;
            setValor(getValor() - desconto);
            System.out.println("Aplicando desconto no ebook");
            return true;
        }
    }


}
