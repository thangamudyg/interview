package prep.interview.string;

public class MergeString {
    public static void main(String[] args) {
        String S1 = "geeks";
        String S2 =  "forgeeks";
        StringBuilder finalString = new StringBuilder();
        for(int i = 0; i < S1.length() || i < S2.length() ; i++) {
            if(i < S1.length()){
                finalString.append(S1.charAt(i));
            }
            if(i < S2.length()){
                finalString.append(S2.charAt(i));
            }
        }
        System.out.println(finalString);
    }
}
