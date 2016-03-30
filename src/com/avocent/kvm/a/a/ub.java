package com.avocent.kvm.a.a;

public class ub extends b
{
    int i;
    int j;
    private static final String z;
    
    public ub() {
        super(1043);
        this.e = 16;
    }
    
    public void c(final int i) {
        this.i = i;
    }
    
    public void d(final int j) {
        this.j = j;
    }
    
    public void a(final byte[] array, final byte[] array2) {
    }
    
    public byte[] b() {
        return new byte[] { (byte)(this.j & 0xFF), 0, (byte)(this.i >>> 8 & 0xFF), (byte)(this.i & 0xFF), 0, 0, 0, 0 };
    }
    
    public String e() {
        return ub.z;
    }
    
    static {
        final char[] charArray = "\u0006}\nop;r9xj%z\u0005n|".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0094: {
                if (n > 1) {
                    break Label_0094;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = 'U';
                            break;
                        }
                        case 1: {
                            c2 = '\u0015';
                            break;
                        }
                        case 2: {
                            c2 = 'k';
                            break;
                        }
                        case 3: {
                            c2 = '\u001d';
                            break;
                        }
                        default: {
                            c2 = '\u0019';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
