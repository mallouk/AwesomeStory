package awesomeStory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoButtonScreen {
	
	private static JFrame frame;
	private static JPanel panel;
	private static JButton button1;
	
	public static void main(String[] args){
		frame = new JFrame();
		panel = new JPanel();
		
		button1 = new JButton();
		button1.setText("");
	}
}
