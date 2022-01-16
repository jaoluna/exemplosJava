import java.awt.Toolkit;
import java.awt.Dimension;

public class DimensaoTela {
    public static void main(String[] args){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();
        System.out.println("A resolução do sistema é: " + dimension.width + "X" + dimension.height);
        
    }
}
