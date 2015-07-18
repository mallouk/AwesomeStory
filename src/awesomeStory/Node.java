package awesomeStory;

public class Node {
	private Node leftChild;
	private Node rightChild;
	private String title;
	private String leftDecisionText;
	private String rightDecisionText;
	
	
	private Node getLeftChild()
	{
		return leftChild;
	}
	
	private Node getRightChild()
	{
		return rightChild;
	}
	
	private String getTitle()
	{
		return title;
	}
	
	private String getLeftDecision()
	{
		return leftDecisionText;
	}
	
	private String getRightDecision()
	{
		return rightDecisionText;
	}
	
	private void setLeftChild(Node node)
	{
		leftChild = node;
	}
	
	private void setRightChild(Node node)
	{
		rightChild = node;
	}
	
	private void setTitleText(String text)
	{
		title = text;
	}
	
	private void setLeftDecisionText(String text)
	{
		leftDecisionText = text;
	}
	
	private void setRightDecisionText(String text)
	{
		rightDecisionText = text;
	}
	
	
}
