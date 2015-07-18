package awesomeStory;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TwoButtonScreen {

	static TreeObject storyStruct = new TreeObject();
	
	static StoryStruct storyTree = new StoryStruct();
//	static StoryStruct.Story story = storyTree.new Story();
//	static StoryStruct.Choice choice = storyTree.new Choice();

	private static JFrame frame;
	private static JPanel panel;
	private static JLabel label;
	private static JButton button1;
	private static JButton button2;

	public static void main(String[] args){
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel("blahBlah");
		button1 = new JButton();
		button2 = new JButton();
		panel.setLayout(new FlowLayout());

		frame.add(panel);
		panel.add(label);
		panel.add(button1);
		panel.add(button2);



		try {
			File f = new File("Z:/Story.txt");
			BufferedReader bufferedReader= new BufferedReader(new FileReader(f));
			String record1 = bufferedReader.readLine().toString();
			while (record1 != null){
				storyTree = new StoryStruct();
				storyTree.parseLine(record1);
				storyStruct.add(storyTree);
				record1 = bufferedReader.readLine().toString();
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		StoryStruct f = (StoryStruct) storyStruct.get(0);
		label.setText(f.getStory());
		button1.setText(f.getChoiceText1());
		button2.setText(f.getChoiceText2());

		frame.setSize(200,200);
		frame.setVisible(true);
	}
}
