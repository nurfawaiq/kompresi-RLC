/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runlength;

/**
 *
 * @author Faiq Noor
 */
public class RunLength {
    
    public static String encode(String source) {
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
            while (i+1 < source.length() && source.charAt(i) == source.charAt(i+1)) {
                runLength++;
                i++;
            }
            dest.append("@");
            dest.append(source.charAt(i));
            dest.append(runLength);
        }
        return dest.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String example = "eeeeeeetnnnnnnnn";
        System.out.println(encode(example));
    }
    
}
