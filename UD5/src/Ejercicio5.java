import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String n=JOptionPane.showInputDialog("Introduce el número: ");
       int i= Integer.parseInt(n);
       if ((i%2)==0) {
    	   JOptionPane.showMessageDialog(null, "El número es divisible entre 2! ");
       } else {
    	   JOptionPane.showMessageDialog(null, "No es divisible");
       }
	}

}
