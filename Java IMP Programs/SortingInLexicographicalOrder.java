public class SortingInLexicographicalOrder {
    public static void main(String[] args) {

        String[] words = { "AI", "C", "Python", "Java" };
        for (int i = 0; i < 3; ++i) {
            for (int j = i + 1; j < 4; ++j) {

                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("In lexicographical order:");

        for (int i = 0; i < 4; i++) {
            System.out.println(words[i]);
        }
    }
}
