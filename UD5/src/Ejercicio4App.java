import javax.swing.JOptionPane;

public class Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String radio=JOptionPane.showInputDialog("Introduce el radio: ");
        Double r= Double.parseDouble(radio);
        double a= Math.PI*(r*2);
        JOptionPane.showMessageDialog(null, "El área es: " +a);
		
        
        
	}

}
