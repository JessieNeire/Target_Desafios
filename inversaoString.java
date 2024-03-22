
import javax.swing.JOptionPane;


public class inversaoString {
   public static void main(String[] args){
   
       String saida= "";
       
       
       String entrada = JOptionPane.showInputDialog("Inverta as letras de um texto/palavra\nDigite aqui:");
       for(int i=entrada.length()-1; i>=0; i--){
       saida+=entrada.charAt(i);
       }
       JOptionPane.showMessageDialog(null,saida);
   } 
   
}
