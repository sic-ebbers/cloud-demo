package de.sic_consult.cloud.data;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sender;
	
	private String title;
	
	private String message;

	public Post() {
		// TODO Auto-generated constructor stub
	}
	
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
