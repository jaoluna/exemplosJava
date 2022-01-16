import java.util.Locale;

public class IdiomaSistema{
    public static void main(String[] args){
        Locale sysLang = Locale.getDefault();
        System.out.print("O idioma do Sistema é: ");
        System.out.println(sysLang.getDisplayLanguage());
    }
}
