public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        return string1.trim().concat(string2.trim());
    }

    public Integer getIndexOrNull(String input, char c) {
    	if(input.indexOf(c) == -1) {
    		return null;
    	}
    	return input.indexOf(c);
    }
    public Integer getIndexOrNull(String input, String sub) {
    	if(input.indexOf(sub) == -1) {
    		return null;
    	}
    	return input.indexOf(sub);
    }

    public String concatSubstring(String input, int idxA, int idxB, String replacement) {
        String substr;
        try{
            substr = input.substring(idxA, idxB);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(String.format("Exception caught: %s", e));
            substr = "whoops!";
        }

        return substr.concat(replacement);
    }
}
Files
04-string-manipulation (Oct 26-Dec 23, 2020 Schedule)	November 12, 2020	
 No file chosen  or 
Add Github Url
Privacy Policy