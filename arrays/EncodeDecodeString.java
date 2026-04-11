/*
Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network 
and is decoded back to the original list of strings.

Example 1:
Input: dummy_input = ["Hello","World"]
Output: ["Hello","World"]
*/
import java.util.ArrayList;
import java.util.List;

class EncodeDecodeString {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()) {
            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            j++;

            result.add(str.substring(j, j + length));

            i = j + length;
        }
        return result;
    }

    public static void main(String[] args) {
        EncodeDecodeString eds = new EncodeDecodeString();
        List<String> strs = new ArrayList<>();
        strs.add("Hello");
        strs.add("World");
        String encoded = eds.encode(strs);
        System.out.println("Encoded: " + encoded);
        List<String> decoded = eds.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
    
}
