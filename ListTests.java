import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

class MyStringChecker implements StringChecker{
    public boolean checkString(String s){
        return s.length() > 2;
    }
}

public class ListTests {
	@Test 
	public void testFilter() {
        MyStringChecker sc = new MyStringChecker();
        List<String> input = new ArrayList<String>();
        input.add("aaaa");

        List<String> filterExpected = new ArrayList<String>();
        filterExpected.add("aaaa");

        assertArrayEquals(filterExpected.toArray(), ListExamples.filter(input, sc).toArray());
	}
}
