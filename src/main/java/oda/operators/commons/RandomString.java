package oda.operators.commons;

public class RandomString { 
    private static final int DEFAULT_STR_LENGTH = 12;

    private RandomString() {}

    /**
     * Generate a random string of lenght n
     * @param n size of randomString
     * @return
     */
    public static String getAlphaNumericString(int n) { 
  
        // chose a Character random from this String 
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
            int index = (int)(alphaNumericString.length() * Math.random()); 
            sb.append(alphaNumericString.charAt(index)); 
        }  
        return sb.toString(); 
    } 

    public static String getAlphaNumericString() {
        return getAlphaNumericString(DEFAULT_STR_LENGTH);
    }
} 