// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.beans.PropertyChangeEvent;
import com.avocent.kvm.a.d;
import com.avocent.kvm.a.c;

public class l implements c, d {

    protected i h;
    private static final String[] z;

    public l(final i h) {
        this.h = h;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals(l.z[1])) {
            final Object newValue = propertyChangeEvent.getNewValue();
            String s = null;
            if (newValue.equals(l.a)) {
                s = l.z[3];
            } else if (newValue.equals(l.b)) {
                s = l.z[4];
            } else if (newValue.equals(l.c)) {
                s = l.z[0];
            } else if (newValue.equals(l.g)) {
                this.h.o().a((String) null);
                this.h.p().a((String) null);
            }
            if (s != null) {
                this.h.d();
                final String b = com.avocent.a.d.b(s);
                if (b != null && b.length() > 0) {
                    this.h.o().a(b);
                    this.h.p().a(b);
                    if (!i.G) {
                        return;
                    }
                }
                this.h.b().a(l.z[2] + s);
            }
        }
    }

    static {
        final String[] z2 = new String[5];
        final int n = 0;
        final char[] charArray = "\u0011m)BS\u0014p\"WL\"`\u0012hI3K+u])c(".toCharArray();
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
                            c2 = 'G';
                            break;
                        }
                        case 1: {
                            c2 = '\u0004';
                            break;
                        }
                        case 2: {
                            c2 = 'M';
                            break;
                        }
                        case 3: {
                            c2 = '\'';
                            break;
                        }
                        default: {
                            c2 = '<';
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
        final char[] charArray2 = "1m)BS\u0018w9FH\"".toCharArray();
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
                            c4 = 'G';
                            break;
                        }
                        case 1: {
                            c4 = '\u0004';
                            break;
                        }
                        case 2: {
                            c4 = 'M';
                            break;
                        }
                        case 3: {
                            c4 = '\'';
                            break;
                        }
                        default: {
                            c4 = '<';
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
        final char[] charArray3 = "gI$TO.j*\u0007Q\"w>F[\"$+HNgv(TS2v.B\u001c,a4\u001d\u001c".toCharArray();
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
                            c6 = 'G';
                            break;
                        }
                        case 1: {
                            c6 = '\u0004';
                            break;
                        }
                        case 2: {
                            c6 = 'M';
                            break;
                        }
                        case 3: {
                            c6 = '\'';
                            break;
                        }
                        default: {
                            c6 = '<';
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
        final char[] charArray4 = "\u0011m)BS\u0014p\"WL\"`\u0012d]+m/U]3m#@".toCharArray();
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
                            c8 = 'G';
                            break;
                        }
                        case 1: {
                            c8 = '\u0004';
                            break;
                        }
                        case 2: {
                            c8 = 'M';
                            break;
                        }
                        case 3: {
                            c8 = '\'';
                            break;
                        }
                        default: {
                            c8 = '<';
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
        final char[] charArray5 = "\u0011m)BS\u0014p\"WL\"`\u0012iS\u0014m*I]+".toCharArray();
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
                            c10 = 'G';
                            break;
                        }
                        case 1: {
                            c10 = '\u0004';
                            break;
                        }
                        case 2: {
                            c10 = 'M';
                            break;
                        }
                        case 3: {
                            c10 = '\'';
                            break;
                        }
                        default: {
                            c10 = '<';
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
