import java.awt.*;


public class Main
{
    
    public static void main(String[]args){
        Calculadora tela = new Calculadora();
        tela.setTitle("Calculadora");
        tela.setLayout(new GridLayout(2,1));
        tela.setSize(230,400);
        tela.setResizable(false);
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }
}
