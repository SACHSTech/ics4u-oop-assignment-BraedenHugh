import java.util.Scanner;
import java.util.ArrayList;

class Post extends Profile{
	private String datePosted,caption;
	private int numOfLikes;
	
	private ArrayList<Comment> commentsOnPost = new ArrayList<Comment>();
	
	public void setDatePosted(String str) {
		this.datePosted = str;
	}
	public String getDatePosted() {
		return datePosted;
	}
	
	public void setCaption(String str) {
		this.caption = str;
	}
	public String getCaption() {
		return caption;
	}
	public void setNumOfLikes(int n) {
		this.numOfLikes = n;
	}
	public String getNumOfLikes() {
		return String.valueOf(numOfLikes);
	}
	
	public void appendComments(Comment comment) {
		commentsOnPost.add(comment);
	}
	
	public void getComments() {
		for (Comment randomComment : commentsOnPost) {
				System.out.println("");
				System.out.println("'" + randomComment.getText() + "'");
				System.out.println(randomComment.getNumOfReplies() + " more replies");
			}
	}
	
}