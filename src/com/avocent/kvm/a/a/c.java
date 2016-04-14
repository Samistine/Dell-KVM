// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.a.j;
import com.avocent.kvm.b.d.a;
import java.util.ArrayList;

public class c extends b {

    protected ArrayList i;
    private static final String[] z = {"Method not implemented.", "AvailableServerNames"};

    public c() {
        super(33840);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        final int h = b.h;
        final int b = com.avocent.kvm.b.d.a.b(array2, 0);
        int i = 0;
        while (i < b) {
            final j j = new j();
            int n = 0;
            final int b2 = com.avocent.kvm.b.d.a.b(array2, n);
            n += 2;
            j.a(com.avocent.kvm.b.d.a.a(array2, n, b2));
            int n2 = n + b2;
            j.a(com.avocent.kvm.b.d.a.b(array2, n2));
            n2 += 2;
            j.b(com.avocent.kvm.b.d.a.b(array2, n2));
            n2 += 2;
            final int b3 = com.avocent.kvm.b.d.a.b(array2, n2);
            n2 += 2;
            j.b(com.avocent.kvm.b.d.a.a(array2, n2, b3));
            this.i.add(j);
            ++i;
            if (h != 0) {
                break;
            }
        }
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(c.z[0]);
    }

    @Override
    public String e() {
        return c.z[1];
    }

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "\u0002\\(>\u007f+\u001929doP1&|*T98d*]r".toCharArray();
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
                            c2 = 'O';
                            break;
                        }
                        case 1: {
                            c2 = '9';
                            break;
                        }
                        case 2: {
                            c2 = '\\';
                            break;
                        }
                        case 3: {
                            c2 = 'V';
                            break;
                        }
                        default: {
                            c2 = '\u0010';
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
        final char[] charArray2 = "\u000eO=?|.[03C*K*3b\u0001X13c".toCharArray();
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
                            c4 = 'O';
                            break;
                        }
                        case 1: {
                            c4 = '9';
                            break;
                        }
                        case 2: {
                            c4 = '\\';
                            break;
                        }
                        case 3: {
                            c4 = 'V';
                            break;
                        }
                        default: {
                            c4 = '\u0010';
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
