import java.util.*;
public class WordCount {
    Scanner sc = new Scanner(System.in);

    public void count() {
        System.out.println("Enter sentence separated  by white space : ");
        String sentence = sc.nextLine();
        String[] arr = sentence.split(" ");
        System.out.println("Sentence : " + Arrays.toString(arr));


        boolean[] checked = new boolean[arr.length];

        System.out.println("Word count : ");
        for (int i = 0; i < arr.length; i++) {
            if (checked[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    count++;
                    checked[j] = true;
                }
            }
            System.out.println(arr[i] + " = " + count);
        }
    }
}
