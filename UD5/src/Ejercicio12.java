import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contraseña= "1234";
		String intento= JOptionPane.showInputDialog("Introduce la contraseña: ");
		int contador=3;
		String fallo="hola";
		if (intento==contraseña) {
			JOptionPane.showMessageDialog(null, "Has accedido con éxito");
			}
			else  for(;fallo!=contraseña; ;(contador>=0); ;contador--);{
				
				 fallo= JOptionPane.showInputDialog("Contraseña incorrecta. Te quedan:" +contador+ " intentos. Inténtalo nuevamente");
				
				
				
			}
			
			}
			
		}

	


