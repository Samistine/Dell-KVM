package com.avocent.kvm.a.a;

public class tb extends b
{
    int i;
    int j;
    String k;
    private static final String z;
    
    public tb() {
        super(33793);
        this.e = 16;
    }
    
    public int h() {
        return this.i;
    }
    
    public int i() {
        return this.j;
    }
    
    public String j() {
        return this.k;
    }
    
    public void a(final byte[] array, final byte[] array2) {
        final int n = array[6] << 8 | array[7];
        this.i = (array2[0] << 8 | array2[1]);
        this.j = array2[2];
        this.k = new String(array2, 3, n - 8 - 3);
    }
    
    public byte[] b() {
        return new byte[8];
    }
    
    public String e() {
        return tb.z;
    }
    
    static {
        final char[] charArray = "ub\u0002~EHm1i]So\u0010x".toCharArray();
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
                            c2 = '&';
                            break;
                        }
                        case 1: {
                            c2 = '\n';
                            break;
                        }
                        case 2: {
                            c2 = 'c';
                            break;
                        }
                        case 3: {
                            c2 = '\f';
                            break;
                        }
                        default: {
                            c2 = ',';
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
