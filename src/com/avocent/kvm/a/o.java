// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.a.a.b;
import com.avocent.kvm.b.d.c;
import java.io.OutputStream;
import com.avocent.kvm.b.u;
import com.avocent.kvm.b.d.g;

class o extends g {

    final l g;
    private static final String[] z;

    o(final l g, final u u, final OutputStream outputStream) {
        super(u, outputStream);
        this.g = g;
    }

    @Override
    public void a(final c c) {
        if (this.g.yb != null) {
            this.g.yb.println(o.z[0] + Integer.toHexString(c.d()) + o.z[2] + c.e() + o.z[3] + c.f() + o.z[1]);
        }
        if (c instanceof b && ((b) c).g() == 0) {
            this.g.i().a(o.z[4] + c.e());
        }
        super.a(c);
    }

    static {
        final String[] z2 = new String[5];
        final int n = 0;
        final char[] charArray = "\u0003\u0019voKB;}&\u0018\u001dw$vG@\"ar\u0006W0tc\u000e\u0003y|".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0097:
            {
                if (n2 > 1) {
                    break Label_0097;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '#';
                            break;
                        }
                        case 1: {
                            c2 = 'I';
                            break;
                        }
                        case 2: {
                            c2 = '\u0004';
                            break;
                        }
                        case 3: {
                            c2 = '\u0006';
                            break;
                        }
                        default: {
                            c2 = '&';
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
        final char[] charArray2 = "\ng".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0213:
            {
                if (n6 > 1) {
                    break Label_0213;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '#';
                            break;
                        }
                        case 1: {
                            c4 = 'I';
                            break;
                        }
                        case 2: {
                            c4 = '\u0004';
                            break;
                        }
                        case 3: {
                            c4 = '\u0006';
                            break;
                        }
                        default: {
                            c4 = '&';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 > n8) {
                continue;
            }
            break;
        }
        z2[n5] = new String(charArray2).intern();
        final int n9 = 2;
        final char[] charArray3 = "\nijgKFi,".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0329:
            {
                if (n10 > 1) {
                    break Label_0329;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '#';
                            break;
                        }
                        case 1: {
                            c6 = 'I';
                            break;
                        }
                        case 2: {
                            c6 = '\u0004';
                            break;
                        }
                        case 3: {
                            c6 = '\u0006';
                            break;
                        }
                        default: {
                            c6 = '&';
                            break;
                        }
                    }
                    charArray3[length3] = (char) (c5 ^ c6);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 > n12) {
                continue;
            }
            break;
        }
        z2[n9] = new String(charArray3).intern();
        final int n13 = 3;
        final char[] charArray4 = "\nik`\u0006O,jaRKi,".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0445:
            {
                if (n14 > 1) {
                    break Label_0445;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = '#';
                            break;
                        }
                        case 1: {
                            c8 = 'I';
                            break;
                        }
                        case 2: {
                            c8 = '\u0004';
                            break;
                        }
                        case 3: {
                            c8 = '\u0006';
                            break;
                        }
                        default: {
                            c8 = '&';
                            break;
                        }
                    }
                    charArray4[length4] = (char) (c7 ^ c8);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 > n16) {
                continue;
            }
            break;
        }
        z2[n13] = new String(charArray4).intern();
        final int n17 = 4;
        final char[] charArray5 = "\u0003\u000beb\u0006S(gmCWihcHD=l&@L;>&".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0561:
            {
                if (n18 > 1) {
                    break Label_0561;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = '#';
                            break;
                        }
                        case 1: {
                            c10 = 'I';
                            break;
                        }
                        case 2: {
                            c10 = '\u0004';
                            break;
                        }
                        case 3: {
                            c10 = '\u0006';
                            break;
                        }
                        default: {
                            c10 = '&';
                            break;
                        }
                    }
                    charArray5[length5] = (char) (c9 ^ c10);
                    ++n20;
                } while (n18 == 0);
            }
            if (n18 <= n20) {
                z2[n17] = new String(charArray5).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
