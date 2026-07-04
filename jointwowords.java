public class JoinStrings {
    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "World";
        
        // Joining without a space: "HelloWorld"
        String result1 = word1 + word2;
        
        // Joining with a space: "Hello World"
        String result2 = word1 + " " + word2;
        
        System.out.println(result2);
    }
}
