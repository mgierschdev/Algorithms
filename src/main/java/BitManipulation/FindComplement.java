package BitManipulation;

public class FindComplement {
    public int findComplement(int num) {
        String a = Integer.toBinaryString(num);
        int l = a.length();
        String b = Integer.toBinaryString(~num);
        String c = b.substring(b.length() - l);
        return Integer.parseInt(c, 2);
    }
}
