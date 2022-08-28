import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) {

        Interface Forca = new Interface();
        Forca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // centraliza a tela
        Forca.setLocationRelativeTo(null);
        Forca.setVisible(true);
    }
}

