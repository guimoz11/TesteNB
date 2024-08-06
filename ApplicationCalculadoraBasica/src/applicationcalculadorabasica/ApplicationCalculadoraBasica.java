package applicationcalculadorabasica;
import javax.swing.JOptionPane;
/* @author guilherme.vcmoz*/
public class ApplicationCalculadoraBasica {
    public static void main(String[] args) {
        Object [] calculadora = {"SOMA", "SUBTRAÇÃO", "MULTIPLICAÇÃO", "DIVISÃO"};
        String calculo = (String) JOptionPane.showInputDialog(null, "Escolha uma operação", "Calculadora", 1,
            null, 
            calculadora,
            calculadora[0]);
        
        String num1 = JOptionPane.showInputDialog(null, "Digite um número inteiro", "NUM 1", 3);
        String num2 = JOptionPane.showInputDialog(null, "Digite um número inteiro", "NUM 2", 3);
        
        int iN1 = Integer.parseInt(num1);
        int iN2 = Integer.parseInt(num2);
        int total = 0;
        
        if(calculo == calculadora[0]){
        total = iN1 + iN2; 
    }   else if(calculo == calculadora[1]){
        total = iN1 - iN2;
    }   else if(calculo == calculadora[2]){
        total = iN1 * iN2;
    }   else if (calculo == calculadora[3]){  
        if (iN2 != 0)
        total = iN1 / iN2;
        else
        JOptionPane.showMessageDialog(null, "Não é possível divisão por 0", "ERRO", 0);
    }           
        
    System.out.print(iN2);
    String resultado = String.valueOf(total);
    JOptionPane.showMessageDialog(null,"Total: " + resultado, "Total", 1);
        
    }
    
}
