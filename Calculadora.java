import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame
{
    private AcaoCalculadora calc;
    private JPanel nBotoes;
    private JPanel botoes;
    private JTextField contas;
    private JButton um;
    private JButton dois;
    private JButton tres;
    private JButton quatro;
    private JButton cinco;
    private JButton seis;
    private JButton sete;
    private JButton oito;
    private JButton nove;
    private JButton zero;
    private JButton ac;
    private JButton parenteses;
    private JButton porcentagem;
    private JButton dividir;
    private JButton multiplicar;
    private JButton subtrair;
    private JButton somar;
    private JButton del;
    private JButton igual;
    private JButton virgula;
    private JButton raiz;
    private JButton pi;
    private JButton potencia;
    private JButton fatorial;
    private JButton calcCientific;
    public Calculadora()
    {
        calc = new AcaoCalculadora();
        /*
        nBotoes = new JPanel();
        nBotoes.setLayout(new GridLayout(1,5, 0,0));
         
        raiz = new JButton("√");
        nBotoes.add(raiz);
        pi = new JButton("π");
        nBotoes.add(pi);
        potencia = new JButton("^");
        nBotoes.add(potencia);
        fatorial = new JButton("!");
        nBotoes.add(fatorial);
        calcCientific = new JButton("v");
        nBotoes.add(calcCientific);
        */
        botoes = new JPanel();
        botoes.setLayout(new GridLayout(6,4,0,0));
          
        raiz = new JButton("√");
        botoes.add(raiz);
        pi = new JButton("π");
        botoes.add(pi);
        potencia = new JButton("^");
        botoes.add(potencia);
        fatorial = new JButton("!");
        botoes.add(fatorial);
        
        ac = new JButton("AC");
        botoes.add(ac);
        parenteses = new JButton("()");
        botoes.add(parenteses);
        porcentagem = new JButton("%");
        botoes.add(porcentagem);
        dividir = new JButton("/");
        botoes.add(dividir);
        sete = new JButton("7");
        botoes.add(sete);
        oito = new JButton("8");
        botoes.add(oito);
        nove = new JButton("9");
        botoes.add(nove);
        multiplicar = new JButton("X");
        botoes.add(multiplicar);
        quatro = new JButton("4");
        botoes.add(quatro);
        cinco = new JButton("5");
        botoes.add(cinco);
        seis = new JButton("6");
        botoes.add(seis);
        subtrair = new JButton("-");
        botoes.add(subtrair);
        um = new JButton("1");
        botoes.add(um);
        dois = new JButton("2");
        botoes.add(dois);
        tres = new JButton("3");
        botoes.add(tres);
        somar = new JButton("+");
        botoes.add(somar);
        zero = new JButton("0");
        botoes.add(zero);
        virgula = new JButton(",");
        botoes.add(virgula);
        del = new JButton("del");
        botoes.add(new JButton("del"));
        igual = new JButton("=");
        botoes.add(igual);
       
        contas = new JTextField();
        contas.setEditable(false);
        
        
       // ac.setBackground(Color.GREEN);
       
        try{
            zero.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.zero());
                 }
              }
            );
            um.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.um());
                 }
              }
            );
            dois.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.dois());
                 }
              }
            );
            
            tres.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.tres());
                 }
              }
            );
            quatro.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.quatro());
                 }
              }
            );
             cinco.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.cinco());
                 }
              }
            );
             seis.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.seis());
                 }
              }
            );
             sete.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.sete());
                 }
              }
            );
             oito.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.oito());
                 }
              }
            );
             nove.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.nove());
                 }
              }
            );
             ac.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.zerar());
                 }
              }
            );
            somar.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.mais());
                 }
              }
            );
            multiplicar.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.vezes());
                 }
              }
            );
            subtrair.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.menos());
                 }
              }
            );
            igual.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.calcularResultado());
                 }
              }
            );
            dividir.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.dividir());
                 }
              }
            );
            porcentagem.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.porcentagem());
                 }
              }
            );
            raiz.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.raiz());
                 }
              }
            );
            potencia.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.potencia());
                 }
              }
            );
            fatorial.addActionListener(
              new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    contas.setText(""+calc.fatorial());
                 }
              }
            );
        }catch(Exception e){
            System.out.printf("Error");
        }
        super.getContentPane().add(contas);
         super.getContentPane().add(botoes);
        
    }
    
    
        
    
    
   
    

  
}
