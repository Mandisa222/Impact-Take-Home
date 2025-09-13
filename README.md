Welcome! 

This project implements the `NumberRangeSummarizer` interface, which takes in a comma-separated list of numbers and produces a summarized string, grouping sequential numbers into ranges.

**How It Works:**
1. **collect(String input)**
   - Parses the comma-separated input string
   - Converts each value into an integer
   - Returns a sorted collection of integers

2. **summarizeCollection(Collection<Integer> input)**  
   - Iterates through the sorted collection
   - Groups consecutive numbers into ranges through a series of loops
   - Returns the final summarized string

**Example:**
- **Input:** "1,3,6,7,8,12,13,14,15,21,22,23,24,31"
- **Output:** "1, 3, 6-8, 12-15, 21-24, 31"

**Project requirements:**
- Must be Java 8
- Must be in GitHub
- Must implement provided interface
- Must have valid unit tests

**Note:**
- JUnit tests are included under `test/numberrangesummarizer/NumberRangeSummarizerTest.java`
