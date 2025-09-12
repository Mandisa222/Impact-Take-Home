package numberrangesummarizer;


public class Main {
    public static void main(String[] args) {
        //Call and run working values
        NumberRangeSummarizerImplemented nrs = new NumberRangeSummarizerImplemented();
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31"; //Sample Input
        String summarized = nrs.summarizeCollection(nrs.collect(input));
        System.out.println(summarized);
    }
}