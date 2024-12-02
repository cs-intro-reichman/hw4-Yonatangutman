

public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
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

    /** If str1 contains str2, returns true; otherwise returns false. */
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
