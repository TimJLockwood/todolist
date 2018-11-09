
public class TodoListItem {

	private String description = "";
	private int priority = 0;
	private boolean isComplete = false;
	private User username = null;
	
	public TodoListItem(String description, int priority, User username) {
		this.description = description;
		this.priority = priority;
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public int getPriority() {
		return priority;
	}

	public boolean isDone() {
		return isComplete;
	}

	public void markDone() {
		isComplete = true;
	}
	
	public User getUser() {
		return username;
	}

}
