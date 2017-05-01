package helper;

public class StringHelper {
    /**
     * Reduce letter 'a' or 'A' in first half of the string
     * @param str
     * @return String
     */
    public String truncateAInFirstHalf(String str){
        String sub1 = str.substring(0, str.length()/2);
        String sub2 = str.substring(str.length()/2);
        return sub1.replaceAll("[aA]","") + sub2;
    }

    public boolean isHalfIsSame(String str){
        if(str.length()%2!=0) return false;
        String sub1 = str.substring(0, str.length()/2);
        String sub2 = str.substring(str.length()/2);
        return sub1.equals(sub2);
    }


}
