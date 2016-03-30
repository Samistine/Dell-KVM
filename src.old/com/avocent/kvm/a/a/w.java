// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class w extends h {

    int j;
    private static final String z;

    public w(final int j) {
        super(0);
        this.j = j;
        this.e = 16;
    }

    public void c(final int j) {
        this.j = j;
    }

    public void d(final int n) {
        this.j += n;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public byte[] b() {
        return new byte[]{(byte) (this.j & 0xFF), 0, 0, 0, 0, 0, 0, 0};
    }

    @Override
    public String e() {
        return w.z;
    }

    static {
        final char[] charArray = "5~\u0010\u001a<CV\u0017\u0014".toCharArray();
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
                            c2 = 'c';
                            break;
                        }
                        case 1: {
                            c2 = '\u0017';
                            break;
                        }
                        case 2: {
                            c2 = 't';
                            break;
                        }
                        case 3: {
                            c2 = '\u007f';
                            break;
                        }
                        default: {
                            c2 = 'S';
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
