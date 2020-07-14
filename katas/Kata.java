package codekatas;

public class Kata {
    public static void run(){
//        encryptThis("Hello");
//        encryptThis("good");
        encryptThis("hello world");
//        encryptThis("");
//        encryptThis("ab");
//        encryptThis("abc");
//        encryptThis("abcd");
    };
    public static String encryptThis(String text) {

        
        int start = 0;
        int end = 0;
        
        while(end < text.length()){
            while(end < text.length() && text.charAt(end) != ' '){
                end++;
            }
            // End of word
            text = 
                    text.substring(0, start) + 
                    encryptWord(text.substring(start, end)) + 
                    text.substring(end, text.length());           
            
            // Move start to next word
            start = end+1;
            // Move end to start
            end = start;
        }
        
        return text;    
    }
    public static String encryptWord(String word){
        if(word.length() == 0){
            return "";
        }
        
        String first = String.valueOf((int) word.charAt(0));
//        if(text.length()>1){
//            
//        }
        String second = String.valueOf(word.charAt(1));
//        if(text.length()>2){
//            
//        }
        String last = String.valueOf(word.charAt(word.length()-1));
//        text =  + text.substring(1,text.length());
        
//        String ret = first + second + text.substring(1-text.length()-1) + last;
        String ret = 
                first + 
                last + 
                word.substring(2, word.length() - 1 ) +
                second;
        
        System.out.println("out: " + ret);
        
        return ret;
    }
}
