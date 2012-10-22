package de.sic_consult.cloud.data;

import java.util.ArrayList;
import java.util.List;

public class PostModel {

	private static PostModel instance;
	
	private List<Post> posts;
	
	public PostModel() {
		posts = new ArrayList<Post>();
	}
	
	public synchronized void putPost(Post post) {
		posts.add(post);
	}
	
	public synchronized List<Post> getAll() {
		return posts;
	}
	
	public synchronized static PostModel getInstance() {
		if(instance == null) {
			instance = new PostModel();
		}
		return instance;
	}
}
