package Instagram;
import Instagram.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String input;
		Scanner in = new Scanner(System.in);
		
		
		
		Profile p = new Profile();
		
		while (true) {
			System.out.println("");
			System.out.println("Instagram Profile, Post, Comment System:");
			System.out.println("Would you like to update your profile or view it? Type 'update' or 'view' or 'exit' ");
			input = in.nextLine();
			
			if (input.equalsIgnoreCase("update")) {
				//add data
				System.out.println("");
				System.out.println("What is the handle of the instagram profile?");
				p.setHandle(in.nextLine());
				
				System.out.println("");
				System.out.println("What is the bio of the user?");
				p.setBio(in.nextLine());
				
				while (true) {	//posts
					System.out.println("");
					System.out.println("what was the date of the post? (YYYY-MM-DD)");
					Post newPost = new Post();
					newPost.setDatePosted(in.nextLine());
					
					System.out.println("");
					System.out.println("what was the caption?");
					newPost.setCaption(in.nextLine());
					
					System.out.println("");
					System.out.println("how many likes did it get? Enter an integer");
					newPost.setNumOfLikes(in.nextInt());
					in.nextLine(); //skip a line because scanner does not skip a line for ints
					
					while (true) { //comments
						System.out.println("");
						System.out.println("enter a comment for the post ");
						Comment newComment = new Comment();
						newComment.setText(in.nextLine());
						
						System.out.println("");
						System.out.println("how many replies did it get?");
						newComment.setNumOfReplies(in.nextInt());
						in.nextLine();
						
						newPost.appendComments(newComment);
						System.out.println("");
						System.out.println("Add another comment to the post? 'Yes' or 'No'");
						if (in.nextLine().equalsIgnoreCase("no")) {
							break;
						}
					}
					
					p.appendPosts(newPost);
					System.out.println("");
					System.out.println("Add another post to the profile? 'Yes' or 'No'");
					if (in.nextLine().equalsIgnoreCase("no")) {
						break;
					}
					
				}
			}
			else if (input.equalsIgnoreCase("view")){
				//view data
				System.out.println("");
				System.out.println("Displaying all posts and comments: ");
				System.out.println(p.getHandle() + " has the bio '" + p.getBio() + "'");
				System.out.println("");
				
				p.getPosts();
				
			}
			else {
				break;
			}
		}
	System.out.println("");
	System.out.println("Thank you for using the system. Rerun program to restart.");
	}
}

