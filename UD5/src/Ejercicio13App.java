import javax.swing.JOptionPane;

public class Ejercicio13App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String num= JOptionPane.showInputDialog("Agrega el primer número");
        String num2= JOptionPane.showInputDialog("Agrega el segundo número");
        String signo= JOptionPane.showInputDialog("Agrega el signo");
        int n1= Integer.parseInt(num);
        int n2= Integer.parseInt(num2);
        
        switch (signo) {
        	case "+":
        		JOptionPane.showMessageDialog(null, "La suma es igual a: " +(n1+n2));
        		break;
        	case "-":
        		JOptionPane.showMessageDialog(null, "La resta es igual a: " +(n1-n2));
        		break;
        	case "*":
        		JOptionPane.showMessageDialog(null, "La multiplicación es igual a: " +(n1*n2));
        		break;
        	case "/":
        		JOptionPane.showMessageDialog(null, "La división es igual a: " +(n1/n2));
        		break;
        	case "^":
        		JOptionPane.showMessageDialog(null, "La potencia es igual a: " +(n1^n2));
        		break;
        	case "%":
        		JOptionPane.showMessageDialog(null, "El módulo es igual a: " +(n1%n2));
        	
        
        
        
        
        
        
        }
	}

}
