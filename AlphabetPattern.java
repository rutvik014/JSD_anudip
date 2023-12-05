public class AlphabetDiamondPattern {
    public static void main(String[] args) {
        int n = 13;  // You can change the value to control the size of the diamond
        printAlphabetDiamond(n);
    }

    public static void printAlphabetDiamond(int n) {
        char currentChar = 'a';
        int numSpaces = n / 2;
        int numChars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= numChars; j++) {
                System.out.print(currentChar);
                if (j <= numChars / 2) {
                    currentChar++;
                } else {
                    currentChar--;
                }
            }

            System.out.println();

            if (i <= n / 2) {
                numSpaces--;
                numChars += 2;
            } else {
                numSpaces++;
                numChars -= 2;
            }
        }
    }
}
