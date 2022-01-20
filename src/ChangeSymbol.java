import java.util.Scanner;

public class ChangeSymbol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        word = word.toLowerCase();

        String code = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            code += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }

        System.out.println(code);

    }
}
