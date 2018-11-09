import java.util.ArrayList;
import java.util.List;

public class TodoList {
	
	private List<TodoListItem> todoList = new ArrayList<>();
	
    /*
     * Add a new item to the list, given a description and priority.
     */
    public void addItem(String description, int priority, User user) {
    	TodoListItem localTodoItem = new TodoListItem(description, priority, user);
    	todoList.add(localTodoItem);
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
        return todoList.get(i);
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        return todoList.size();
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        for(TodoListItem item : todoList) {
        	if (item.isDone() == false) {
        		return item;
        	}
        }
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
    	int highestPriority = 0;
    	TodoListItem heighestItem = null;
    	
        for(TodoListItem item : todoList) {
        	if (item.isDone() == false) {
        		if (item.getPriority() > highestPriority) {
        			heighestItem = item;
        		}
        	}
        }
        return heighestItem;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
       List<String> descriptionList = new ArrayList<>();
       
    	 for(TodoListItem item : todoList) {
         	if (item.getDescription().contains(text)) {
         		descriptionList.add(item.getDescription());
         		}
         	}
         
         return descriptionList;
     }
     
    
    /*
     * Search for items whose username contains the given text.
     * The tasks are returned in a list.
     */
    /*
    public List<String> searchUser(User user) {
       List<String> taskList = new ArrayList<>();
       
    	 for(TodoListItem item : todoList) {
         	if (item.getUser().getUsername().contains(user.getUsername())) {
         		taskList.add(item));
         		}
         	}
         
         return descriptionList;
     }
     */
}
