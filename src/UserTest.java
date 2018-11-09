import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void userTest() {
		User localUser = new User("Jon Smith");
		assertEquals("Jon Smith", localUser.getUsername());
	}

}
