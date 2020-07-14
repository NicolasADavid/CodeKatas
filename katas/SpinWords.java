package codekatas;

/**
 *
 * @author Nico
 */
public class SpinWords {
    
    static public void run(){
        spinWords( "Hey fellow warriors" );
        spinWords( "This is a test" );
        spinWords( "" );
        spinWords( "a" );
        spinWords( "extraextraextra" );
        spinWords( "1 2" );
    }

    static public String spinWords(String sentence) {
        
        int start = 0;
        int end = 0;
        
        while(end<sentence.length()){
            while(end < sentence.length() && sentence.charAt(end) != ' '){
                end++;
            }
            // Found end of a word
            
            // Determine if word needs flipping
            if(end - start > 5){
                // Flip word
                String word = sentence.substring(start, end);
                String flippedWord = reverseWord(word);
                
                // Replace word in sentence
                sentence = makeString(sentence, start, end, flippedWord);
            }
            
            // Move start to beginning of next word
            start = end+1;
            
            // Move end to start
            end = start;
        }
        return sentence;
    }
    
    static public String makeString(String sentence, int start, int end, String word){
        
        sentence = sentence.substring(0, start)  
                + word
                + sentence.substring(end, sentence.length());
        
        return sentence;
    }
    
    static public String reverseWord(String word){
        char[] chars = new  char[word.length()];
        for(int i = word.length()-1; i>=0; i--){
            chars[word.length()-i-1] = word.charAt(i);
        }
        String string = new String(chars);
        return string;
    }
}
