//instagram posts, likes, comments
import java.util.Scanner;
import java.util.ArrayList;

class Profile {
	private String handle,bio;
		
	//stores our post objects
	private ArrayList<Post> postsOnProfile = new ArrayList<Post>();
	
	Scanner in = new Scanner(System.in);
	
	public void setHandle(String str) {
		this.handle = str;
	}
	public String getHandle() {
		return handle;
	}
	public void setBio(String str) {
		this.bio = str;
	}
	public String getBio() {
		return bio;
	}
	public void appendPosts(Post post) {
		postsOnProfile.add(post);
	}

	
	public void getPosts() {
		for (Post randomPost : postsOnProfile) {
			System.out.println("-----------------");
			System.out.println("Posted on " + randomPost.getDatePosted());
			System.out.println(randomPost.getNumOfLikes() + " like/s");
			System.out.println("Caption '" + randomPost.getCaption() + "'");
			System.out.println("");
			randomPost.getComments();
			System.out.println("-----------------");
			System.out.println("");
		}
	}
	
}//close Profile 