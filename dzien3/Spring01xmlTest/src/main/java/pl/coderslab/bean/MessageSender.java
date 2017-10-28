package pl.coderslab.bean;

public class MessageSender {
	private MessageService messageService;
	private String message;

	public MessageSender() {
	}

	public MessageSender(MessageService messageService) {
		this.messageService = messageService;
	}

	// gettery i settery pola message zostały pominięte.
	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public void sendMessage() {
		messageService.send(message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
