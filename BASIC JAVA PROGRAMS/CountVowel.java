public class CountVowel {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}