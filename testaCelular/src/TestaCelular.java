public class TestaCelular {
    public static void main(String[] args) {
        Celular celular = new Celular("Apple", "Iphone",  (short) 11, "Smarthpone");

        System.out.println(celular.getTipoAparelho()+ " " + celular.getLinha() + " " +
                celular.getMarca() + " " + celular.getSerie());
    }
}
