import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contraseña= 1234;
		String intento= JOptionPane.showInputDialog("Introduce una contraseña numérica: ");
		int i= Integer.parseInt(intento);
		int contador=3;
		String f;
		if (i==contraseña) {
			JOptionPane.showMessageDialog(null, "Has accedido con éxito");
			}
			else { contador--;
			f= JOptionPane.showInputDialog("Contraseña incorrecta. Te quedan:" +contador+ " intentos. Inténtalo nuevamente");
			int fallo=Integer.parseInt(f);
			  if(fallo!=contraseña || contador>0)  {
				    contador--;
					f= JOptionPane.showInputDialog("Contraseña incorrecta. Te quedan:" +contador+ " intentos. Inténtalo nuevamente");
				    contador--;}
				    else {
				    	JOptionPane.showMessageDialog(null, "Te has quedado sin intentos");
				    	
				    }
			}}
			
			}
			
		

	


