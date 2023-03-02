package MyChar;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) != -1;
    }

    public boolean isConsonant() {
        return !isVowel() && isAlphabet();
    }

    public boolean isDigit() {
        if (ch >= 48 && ch <= 57)
            return true;
        return false;
    }

    public boolean isAlphabet() {
        return ((ch >= (int) 'A' && ch <= (int) 'Z') || (ch >= (int) 'a' && ch <= (int) 'z'));
    }

    public static void printLowerCaseAlphabets() {
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            System.out.println(ch);
        }
    }

    public static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            System.out.println(ch);
        }
    }

}
