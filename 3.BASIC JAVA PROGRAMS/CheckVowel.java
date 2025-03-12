public class CheckVowel {
    public static void main(String[] args) {
        char ch = 'a';
        if ("AEIOUaeiou".indexOf(ch) != -1) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }
    }
}