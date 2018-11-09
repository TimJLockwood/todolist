import org.junit.Test;
import static org.junit.Assert.*;

public class TodoListItemTest {
	private final User user = new User("Bibek");
    private final TodoListItem item = new TodoListItem("Walk the dog", 3, user);
    
    @Test
    public void testDescription() {
        assertEquals("Walk the dog", item.getDescription());
    }
    
    @Test
    public void testPriority() {
        assertEquals(3, item.getPriority());
    }
    
    @Test
    public void testMarkDone() {
        assertFalse(item.isDone());
        item.markDone();
        assertTrue(item.isDone());
    }
}
