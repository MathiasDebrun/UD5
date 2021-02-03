import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dia= JOptionPane.showInputDialog("Introduce el día de la semana: ");
		
		switch (dia) {
			case "Lunes":
			    JOptionPane.showMessageDialog(null, "Es un día laboral");
			    break;
			case "Martes":
				JOptionPane.showMessageDialog(null, "Es un día laboral");
				break;
			case "Miercoles":
				JOptionPane.showMessageDialog(null, "Es un día laboral");
				break;
			case "Jueves":
				JOptionPane.showMessageDialog(null, "Es un día laboral");
				break;
			case "Viernes":
				JOptionPane.showMessageDialog(null, "Es un día laboral");
				break;
			case "Sabado":
				JOptionPane.showMessageDialog(null, "No es un día laboral");
				break;
			case "Domingo":
				JOptionPane.showMessageDialog(null, "No es un día laboral");
				break;
			
			default:
				JOptionPane.showMessageDialog(null, "No has introducido un día correcto");
		}
	}

}
