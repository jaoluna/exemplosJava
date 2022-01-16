public class Celular {
    private String marca;
    private String linha;
    private short serie;
    private String tipoAparelho;
    private byte qtdChip;

    public Celular(String marca, String linha, short serie, String tipoAparelho){
        this.marca = marca;
        this.linha = linha;
        this.serie = serie;
        this.tipoAparelho = tipoAparelho;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getLinha(){
        return this.linha;
    }

    public short getSerie(){
        return this.serie;
    }

    public String getTipoAparelho(){
        return this.tipoAparelho;
    }

    public void setQtdChip(byte qtdChip){
        this.qtdChip = qtdChip;
    }

    public byte getQtdChip() {
        return qtdChip;
    }
}
