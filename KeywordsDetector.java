public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);

    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
    
        for (int i = 0; i < sentences.length; i++) {
            String real_chek_sentences = sentences[i];
            String chek_sentences = lowerCase(sentences[i]);

            for (int j = 0; j < keywords.length; j++) {
                String check_keywords = lowerCase(keywords[j]);
                
                if (contains(chek_sentences, check_keywords)) {
                    System.out.println(real_chek_sentences);
                    break;
                }
            }
        }
    }

    public static String lowerCase(String str){ 
        String lower_string="";
        char lower_char;
    
        for (int i = 0; i < str.length(); i++) {
            int val_char= str.charAt(i);
                if (65<=val_char && val_char<=90) {
                    int low_val_char = val_char + 32;
                    lower_char= (char)low_val_char;
                }else{
                    lower_char=str.charAt(i);
                }
    
                lower_string += lower_char;
                
        }
            return lower_string;
    
    }



    public static boolean contains(String str1, String str2) {
        if (str1== "") {
            return false;   
        } else if (str2=="") {
            return true;   
        }
    
        if (str2.length()>str1.length()) {
            return false; 
        }        
        
        char sameChar = str2.charAt(0);
        for (int j= 0; j<str1.length()-1; j++){
            if (sameChar == str1.charAt(j)) {
                for (int i = 0; i < str2.length(); i++) {
                    if (str2.charAt(i) != str1.charAt(j)) {
                     
                        break;
                    }
                    j++;
                    if (j==str1.length()) {
                        break;    
                    }
                    if (i==str2.length()-1) {
                        return true;    
                    }
               
                }
    
            }
           
        }  
        return false;       
    }

}