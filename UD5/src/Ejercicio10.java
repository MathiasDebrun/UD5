import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ventas= JOptionPane.showInputDialog("Introduce el número de ventas: ");
		int nventas= Integer.parseInt(ventas);
		int i=0;
		int contador=1;
		double sumatotal=0;
		while (i<nventas) {
			String venta= JOptionPane.showInputDialog("Introduce la venta nº:" +contador);
			int suma= Integer.parseInt(venta);
			sumatotal=sumatotal+suma;
			i++;
			contador++;
			
			
		}
		
		JOptionPane.showMessageDialog(null, "Las ventas totales suman: " +sumatotal);
		
	}

}
