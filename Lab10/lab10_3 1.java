public class lab10_3 {
    public static int wordcount(String word) { 
        if (word == null || word.isEmpty()) { 
            return 0; 
        } 
        int count = 0; 
        char wl[] = new char[word.length()]; 
        for (int i = 0; i < word.length(); i++) { 
            wl[i] = word.charAt(i); 
            if (((i > 0) && (wl[i] != ' ') && (wl[i - 1] == ' ')) || ((wl[0] != ' ') && (i == 0))) { 
                count++; }
        }
             return count;}    
             public static void main(String[] args) {
                 String word="This sentence has too many words in it";
                System.out.println("the string has "+wordcount(word)+" words.");
             }
}
