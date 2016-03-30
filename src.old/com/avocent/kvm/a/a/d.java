// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class d extends b {

    boolean i;
    private static final String z;

    public d() {
        super(520);
        this.e = 16;
    }

    public d(final boolean i) {
        super(520);
        this.i = i;
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.i = ((array2[0] & 0xFF) > 0);
    }

    @Override
    public byte[] b() {
        return new byte[]{this.i, 0, 0, 0, 0, 0, 0, 0};
    }

    @Override
    public String e() {
        return d.z;
    }

    static {
        final char[] charArray = "O-QqGJ-\\pFf.".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0093:
            {
                if (n > 1) {
                    break Label_0093;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\t';
                            break;
                        }
                        case 1: {
                            c2 = 'B';
                            break;
                        }
                        case 2: {
                            c2 = '2';
                            break;
                        }
                        case 3: {
                            c2 = '\u0004';
                            break;
                        }
                        default: {
                            c2 = '4';
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
