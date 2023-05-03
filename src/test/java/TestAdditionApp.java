import static org.junit.Assert.*;
import org.junit.Test;
public class TestAdditionApp {
	@Test
	public void testaddNumbers() {
		
		AdditionApp app = new AdditionApp();
		int result= app.addNumbers(25, 25);
		assertEquals(50, result);
	}
}
