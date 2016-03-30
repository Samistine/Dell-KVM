// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class p extends o {

    private static final String z;

    public p(final int n) {
        super(522, p.z, (byte) (n & 0xFF));
    }

    static {
        final char[] charArray = "\u000e3 r\u000e(%1~\u0002>38".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0094:
            {
                if (n > 1) {
                    break Label_0094;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = ']';
                            break;
                        }
                        case 1: {
                            c2 = 'V';
                            break;
                        }
                        case 2: {
                            c2 = 'T';
                            break;
                        }
                        case 3: {
                            c2 = '?';
                            break;
                        }
                        default: {
                            c2 = 'a';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                break;
            }
            continue;
        }
    }
}
