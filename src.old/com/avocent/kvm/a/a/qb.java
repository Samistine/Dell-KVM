// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class qb extends b {

    protected String i;
    private static final String z;

    public qb() {
        super(33841);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.i = com.avocent.kvm.b.d.a.a(array2, 2, com.avocent.kvm.b.d.a.b(array2, 0));
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[2 + this.i.length()];
        com.avocent.kvm.b.d.a.a(this.i, array, com.avocent.kvm.b.d.a.a(this.i.length(), array, 0), this.i.length());
        return array;
    }

    @Override
    public String e() {
        return qb.z;
    }

    public String h() {
        return this.i;
    }

    static {
        final char[] charArray = "c!\u000fv(D!\u0007@.B2\u0006a\u001e@ \u0002g.".toCharArray();
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
                            c2 = '0';
                            break;
                        }
                        case 1: {
                            c2 = 'D';
                            break;
                        }
                        case 2: {
                            c2 = 'c';
                            break;
                        }
                        case 3: {
                            c2 = '\u0013';
                            break;
                        }
                        default: {
                            c2 = 'K';
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
