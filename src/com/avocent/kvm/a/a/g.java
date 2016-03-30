// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import java.io.IOException;

public class g extends b {

    private static final String z;

    public g() {
        super(514);
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) throws IOException {
    }

    @Override
    public byte[] a() {
        return b.a(this.d, 16);
    }

    @Override
    public byte[] b() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 0};
    }

    @Override
    public String e() {
        return g.z;
    }

    static {
        final char[] charArray = "\u0012\u0010jZh\u0010\rvNd1".toCharArray();
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
                            c2 = '_';
                            break;
                        }
                        case 1: {
                            c2 = '\u007f';
                            break;
                        }
                        case 2: {
                            c2 = '\u001f';
                            break;
                        }
                        case 3: {
                            c2 = ')';
                            break;
                        }
                        default: {
                            c2 = '\r';
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
