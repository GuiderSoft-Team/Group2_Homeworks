public class MainApp2 {
    public static void main(String[] args) {
        try {
            System.out.println(splitWord("deniz"));
            System.out.println(splitWord("sümeyye"));
            System.out.println(splitWord(null));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String splitWord(String word) throws Exception {
        if (word == null || word.isBlank()) throw new Exception("kelime boş olamaz");
        int orta = word.length() / 2;
        orta = word.length() % 2 == 0 ? orta : orta + 1;
        return word.substring(0, orta) + "-" + word.substring(orta);
    }
}

