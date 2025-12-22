import java.util.Scanner;

public class ShortestLongestWord {

    static String[] splitText(String text) {

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        String[] words = new String[count + 1];
        String temp = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                temp = temp + ch;
            } else {
                words[index++] = temp;
                temp = "";
            }
        }

        words[index] = temp;
        return words;
    }

    static int getLength(String word) {

        int len = 0;
        for (char ch : word.toCharArray()) {
            len++;
        }
        return len;
    }

    static String[][] wordWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }

        return result;
    }

    static int[] findShortestLongest(String[][] data) {

        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }

            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = wordWithLength(words);
        int[] result = findShortestLongest(data);

        System.out.println("Shortest word: " + data[result[0]][0]);
        System.out.println("Longest word: " + data[result[1]][0]);

        sc.close();
    }
}
