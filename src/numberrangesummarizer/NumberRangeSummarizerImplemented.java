package numberrangesummarizer;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

//Implementation class for given interface (NumberRangeSummarizer)
public class NumberRangeSummarizerImplemented implements NumberRangeSummarizer {

    //Method to collect input string and convert to collection of integers
    public Collection<Integer> collect(String input) {

        // Basic input validation in case of null or empty input
        if (input == null || input.isEmpty()) {
            return Collections.emptyList();
        }

        // Split the input string by commas and parse integers
        String[] inputNumbersArray = input.split(",");
        Collection<Integer> result = new ArrayList<>();

        for (String num : inputNumbersArray) {
            num = num.trim(); // Trim whitespace
            if (!num.isEmpty()) {
                int number = Integer.parseInt(num); // Parse to integer
                result.add(number); // Add to collection
            }
        }
        Collections.sort((List<Integer>) result); // Sort the collection
        return result;
    }

    
    public String summarizeCollection(Collection<Integer> input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        List<Integer> sortedList = new ArrayList<>(input); // Convert to list for easier manipulation
        Collections.sort(sortedList); // Ensure the list is sorted

        StringBuilder summarized = new StringBuilder(); // StringBuilder for efficient string concatenation
        int start = sortedList.get(0); // Start of the current range
        int end = start; // End of the current range

        // Iterate through the sorted list to find ranges
        for (int i = 1; i < sortedList.size(); i++) {
            int current = sortedList.get(i);

            if (current == end + 1) {
                // Continue the range because the current number is sequential
                end = current;
            } else {
                // End the current range and start a new one because the current number is not sequential
                if (start == end) {
                    summarized.append(start).append(", ");
                } else {
                    summarized.append(start).append("-").append(end).append(", "); // Use hyphen for range
                }
                start = current; // Start new range
                end = current; 
            }
        }
        // Append the last range or number because the loop ends without appending it
        if (start == end) {
            summarized.append(start);
        } else {
            summarized.append(start).append("-").append(end);
        }
        return summarized.toString(); // Convert StringBuilder to String and return
    }
}