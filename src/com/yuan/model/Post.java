package com.yuan.model;

public class Post {
	
	private int id;
	
	private String title;
	
	private String author;
	
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Post() {
		super();
		
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", author=" + author + ", content=" + content + "]";
	}
	
	

}
