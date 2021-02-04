import javax.swing.JOptionPane;

public class Ejercicio6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String n= JOptionPane.showInputDialog("Introduce el precio: ");
        final double IVA=0.21;
        double p= Double.parseDouble(n);
        double montoiva= p*IVA;
        double pfinal= p+montoiva;
        JOptionPane.showMessageDialog(null, "El precio con IVA es: " +pfinal);
        
		
	}

}
