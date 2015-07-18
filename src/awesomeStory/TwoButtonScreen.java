package awesomeStory;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private static int currIndex = 0;
	
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
			File f = new File("Story.txt");
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


		final StoryStruct f = (StoryStruct) storyStruct.get(currIndex);
		label.setText(f.getStory());
		button1.setText(f.getChoiceText1());
		button2.setText(f.getChoiceText2());

		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clicked it!");
				for (int i = currIndex; i < storyStruct.size(); i++){
					StoryStruct q = (StoryStruct)storyStruct.get(i);
					if (f.getPointerChoice1().equals(q.getStoryPointer())){
						currIndex = i;
						label.setText(q.getStory());
						button1.setText(q.getChoiceText1());
						button2.setText(q.getChoiceText2());
						break;
					}
				}
			}
		});
		
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				for (int i = currIndex; i < storyStruct.size(); i++){
					StoryStruct q = (StoryStruct)storyStruct.get(i);
					if (f.getPointerChoice2().equals(q.getStoryPointer())){
						currIndex = i;
						label.setText(q.getStory());
						button1.setText(q.getChoiceText1());
						button2.setText(q.getChoiceText2());
						break;
					}
				}
			}
		});
		
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}
