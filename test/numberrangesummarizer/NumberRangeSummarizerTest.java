//Since test files are in separate folder, NB to import right packages and utils
//Test run using JUnit

package test.numberrangesummarizer;
import numberrangesummarizer.NumberRangeSummarizerImplemented;
import java.util.Collection;
import org.junit.*; //test packages
import static org.junit.Assert.*;

public class NumberRangeSummarizerTest {

    //Test both methods with valid inputs
    @Test
    public void testCollect() {
        NumberRangeSummarizerImplemented nrs = new NumberRangeSummarizerImplemented(); //test instance
        Collection<Integer> result = nrs.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        assertNotNull(result); //check that it is not null
        assertEquals(14, result.size()); //check that size is correct as per input given above
    }

    @Test
    public void testSummarizeCollection() {
        NumberRangeSummarizerImplemented nrs = new NumberRangeSummarizerImplemented();
        Collection<Integer> input = nrs.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        String result = nrs.summarizeCollection(input);
        assertNotNull(result);
        assertEquals("1, 3, 6-8, 12-15, 21-24, 31", result); //check that output matches expected format
    }

}