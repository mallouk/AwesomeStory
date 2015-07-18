package awesomeStory;

public class StoryStruct {
	
	private String storyPointer;
	private String story;
	private String choiceText1;
	private String pointerChoice1;
	private String choiceText2;
	private String pointerChoice2;
	
	public void parseLine(String record){
		String[] parsedData = record.split(":");
		storyPointer = parsedData[1];
		story = parsedData[2];
		
		choiceText1 = parsedData[3];
		pointerChoice1 = parsedData[4];
		
		choiceText2 = parsedData[5];
		pointerChoice2 = parsedData[6];
		
	}
	
	public String getStoryPointer(){
		return storyPointer;
	}
	
	public String getStory(){
		return story;
	}
	
	public String getChoiceText1(){
		return choiceText1;
	}
	
	public String getPointerChoice1(){
		return pointerChoice1;
	}
	
	public String getChoiceText2(){
		return choiceText2;
	}
	
	public String getPointerChoice2(){
		return pointerChoice2;
	}
	
	
	/*public class Story{
		
		TreeObject storyList = new TreeObject();
		private String choicePointer;
		private String story;
		
		public void parseLine(String record){
			String[] parsedData = record.split(":");
			choicePointer = parsedData[1];
			story = parsedData[2];
		}
		
	}
	
	
	class Choice{
		TreeObject choiceList = new TreeObject();

		private String choiceText;
		private String pointerChoice;
		private String typeChoice;
		
		public void parseLine(String record){
			String[] parsedData = record.split("-");
			
			choiceText = parsedData[1];
			pointerChoice = parsedData[2];
			typeChoice = parsedData[3];
		}
	}*/
}
