package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
    	  StringBuilder builder = new StringBuilder(str);
       
     String apped = builder.append(characters).toString();
        return apped;
    }
    
    public static String reverse(String str) {
    	 StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }
    
    public static String insert(String str, int index, char newChar) {
    	 StringBuilder builder = new StringBuilder(str);
        return builder.insert(index, newChar).toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	 StringBuilder builder = new StringBuilder(str);
         return builder.delete(startIndex, endIndex).toString();
    }
}