// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;
import com.avocent.kvm.a.j;

public class rb extends b {

    protected j i;
    private static final String[] z;

    public rb() {
        super(33842);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        int n = 0;
        final int b = com.avocent.kvm.b.d.a.b(array2, n);
        n += 2;
        this.i.a(com.avocent.kvm.b.d.a.a(array2, n, b));
        int n2 = n + b;
        this.i.a(com.avocent.kvm.b.d.a.b(array2, n2));
        n2 += 2;
        this.i.b(com.avocent.kvm.b.d.a.b(array2, n2));
        n2 += 2;
        final int b2 = com.avocent.kvm.b.d.a.b(array2, n2);
        n2 += 2;
        this.i.b(com.avocent.kvm.b.d.a.a(array2, n2, b2));
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(rb.z[0]);
    }

    @Override
    public String e() {
        return rb.z[1];
    }

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "4\rs\u0001!\u001dHi\u0006:Y\u0001j\u0019\"\u001c\u0005b\u0007:\u001c\f)".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098:
            {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'y';
                            break;
                        }
                        case 1: {
                            c2 = 'h';
                            break;
                        }
                        case 2: {
                            c2 = '\u0007';
                            break;
                        }
                        case 3: {
                            c2 = 'i';
                            break;
                        }
                        default: {
                            c2 = 'N';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
                    ++n4;
                } while (n2 == 0);
            }
            if (n2 > n4) {
                continue;
            }
            break;
        }
        z2[n] = new String(charArray).intern();
        final int n5 = 1;
        final char[] charArray2 = "*\ru\u001f+\u000b;s\b:\f\u001bR\u0019*\u0018\u001cb".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214:
            {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'y';
                            break;
                        }
                        case 1: {
                            c4 = 'h';
                            break;
                        }
                        case 2: {
                            c4 = '\u0007';
                            break;
                        }
                        case 3: {
                            c4 = 'i';
                            break;
                        }
                        default: {
                            c4 = 'N';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
