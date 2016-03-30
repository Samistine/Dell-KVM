// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class cb extends y {

    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private static final String z;

    public cb(final int n) {
        super(n);
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public void a(final byte[] array, final byte[] array2, final int n) {
        final byte b = array2[0];
        this.j = ((b & 0x1) > 0);
        this.k = ((b & 0x2) > 0);
        this.l = ((b & 0x4) > 0);
        this.m = ((b & 0x8) > 0);
        this.n = ((b & 0x10) > 0);
    }

    @Override
    public byte[] b() {
        return new byte[8];
    }

    @Override
    public String e() {
        return cb.z;
    }

    static {
        final char[] charArray = "`,OuiJ;R7Jn\r".toCharArray();
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
                            c2 = '+';
                            break;
                        }
                        case 1: {
                            c2 = 'I';
                            break;
                        }
                        case 2: {
                            c2 = '6';
                            break;
                        }
                        case 3: {
                            c2 = '\u0017';
                            break;
                        }
                        default: {
                            c2 = '\u0006';
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
