package edu.udacity.java.nano.chat;

/**
 * Message Model.
 *
 * @author Manmeet Singh
 */
public class Message {
	
	/** The user name. */
	private String userName;
	
	/** The message. */
	private String message;
	
	/** The message type. */
	private String messageType;
	
	/** The online count. */
	private int onlineCount;

	/**
	 * Instantiates a new message.
	 */
	public Message() {
	}

	/**
	 * Instantiates a new message.
	 *
	 * @param userName the user name
	 * @param message the message
	 * @param messageType the message type
	 * @param onlineCount the online count
	 */
	public Message(String userName, String message, String messageType, int onlineCount) {
		this.userName = userName;
		this.message = message;
		this.messageType = messageType;
		this.onlineCount = onlineCount;
	}

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the message type.
	 *
	 * @return the message type
	 */
	public String getMessageType() {
		return messageType;
	}

	/**
	 * Sets the message type.
	 *
	 * @param messageType the new message type
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	/**
	 * Gets the online count.
	 *
	 * @return the online count
	 */
	public int getOnlineCount() {
		return onlineCount;
	}

	/**
	 * Sets the online count.
	 *
	 * @param onlineCount the new online count
	 */
	public void setOnlineCount(int onlineCount) {
		this.onlineCount = onlineCount;
	}

}
