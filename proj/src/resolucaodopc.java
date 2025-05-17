import java.awt.*; // " * " Para incluir todas as classes

public class resolucaodopc {
    public static void main() {
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        System.out.println("A resolução da tela é:");
        System.out.println(screenSize.width + " x " + screenSize.height);
    }
}
