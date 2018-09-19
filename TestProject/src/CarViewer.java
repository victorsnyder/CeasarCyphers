import javax.swing.JFrame;

public class CarViewer {

	public static void main(String[] args) 
	{
		
		JFrame frame = new JFrame();
		frame.setSize(200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CarComponent carro = new CarComponent();		
		frame.add(carro);
		frame.setVisible(true);

	}

}
