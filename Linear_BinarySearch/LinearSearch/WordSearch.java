package LinearandBinarySearch.LinearSearch;
public class WordSearch {
    public static String searchWordInSentences(String[] sentences, String targetWord) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(targetWord.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "I love to code in Python",
            "Java is another programming language",
            "Learning to code is fun"
        };
        String targetWord = "Java";

        String result = searchWordInSentences(sentences, targetWord);
        System.out.println("Result: \n" + result);
    }
}