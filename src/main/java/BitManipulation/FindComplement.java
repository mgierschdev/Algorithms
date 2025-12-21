package BitManipulation;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


public class FindComplement {
    public int findComplement(int num) {
        String a = Integer.toBinaryString(num);
        int l = a.length();
        String b = Integer.toBinaryString(~num);
        String c = b.substring(b.length() - l);
        return Integer.parseInt(c, 2);
    }
}
