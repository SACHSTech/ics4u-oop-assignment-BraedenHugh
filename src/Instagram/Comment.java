package Instagram;
import Instagram.*;
import java.util.Scanner;
import java.util.ArrayList;

class Comment extends Profile{
	
	private String text;
	private int numOfReplies;
	
	public void setText(String str) {
		this.text = str;
	}
	public String getText() {
		return text;
	}
	public void setNumOfReplies(int n) {
		this.numOfReplies = n;
	}
	public String getNumOfReplies() {
		return String.valueOf(numOfReplies);
	}
}