public class AcaoCalculadora
{
    // instance variables - replace the example below with your own
    private int display;
    private int registro;
    private char operacao;
    private boolean digitouOperacao;

    /**
     * Constructor for objects of class Calculadora
     */
    public AcaoCalculadora()
    {
        this.zerar();
       
    }
    
    public int getDisplay(){
        return this.display;
    }
    
    public int zero(){
        teclar(0);
        return getDisplay();
    }
    
    public int um(){
        teclar(1);
        return getDisplay();
    }
    
    public int dois(){
        teclar(2);
        return getDisplay();
    }
    
    public int tres(){
        teclar(3);
        return getDisplay();
    }
    
    public int quatro(){
        teclar(4);
        return getDisplay();
    }
    
    public int cinco(){
        teclar(5);
        return getDisplay();
    }
    
    public int seis(){
        teclar(6);
        return getDisplay();
    }
    
    public int sete(){
        teclar(7);
        return getDisplay();
    }
    
    public int oito(){
        teclar(8);
        return getDisplay();
    }
    
    public int nove(){
        teclar(9);
        return getDisplay();
    }
   
    public int zerar(){
        display = registro = 0;
        operacao = 'x';
        digitouOperacao = false;
        return getDisplay();
    }

    protected void teclar(int digito){
        if (this.digitouOperacao){
            this.display=0;           
        }
        this.display = this.display*10+digito;
        this.digitouOperacao = false;
    }
    
    public int mais(){
        operacao('+');
        return getDisplay();
    }
    
    public int menos(){
        operacao('-');
        return getDisplay();
    }
    
    public int vezes(){
        operacao('*');
        return getDisplay();
    }
    
    public int dividir(){
        operacao('/');
        return getDisplay();
    }
    
    public int igual(){
        operacao('=');
        return getDisplay();
    }
    public int porcentagem(){
        operacao('%');
        return getDisplay();
    }
    public int raiz(){
        operacao('√');
        return getDisplay();
    }
    public int potencia(){
         operacao('^');
        return getDisplay();
    }
    public int fatorial(){
        operacao('!');
        return getDisplay();
    }
    protected int operacao(char op){
        if (operacao!='x'){
            calcularResultado();
        }
        this.operacao=op;
        this.registro = this.display;
        this.digitouOperacao = true;
        return getDisplay();
    }
   
    protected int calcularResultado(){
        switch(this.operacao){
            case '+':
                display = display + registro;
                break;
            case '-':
                display = registro - display;
                break;
            case '*':
                display = display * registro;
                break;
            case '/':
                display = registro / display;
                break;
            case '%':
                display = (display * registro)/100;
                break;
            case '√':
                display = (int)Math.round(Math.sqrt(registro));
                break;
            case '^':
                display =  (int)Math.round(Math.pow(registro,display));
                break;
            case '!':
                int fact = 1;
                for(int i = 0; i<registro; i++){
                    fact *= registro-i ;
                }
                display = fact;
        }
        this.operacao='x';
        return display;
    }
   
   

}