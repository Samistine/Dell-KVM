// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.b.d.c;
import java.io.OutputStream;
import com.avocent.kvm.b.g;
import java.util.Date;
import java.text.SimpleDateFormat;

class s extends Thread {

    boolean a;
    final l b;
    private static final String[] z;

    s(final l b) {
        super(s.z[7]);
        this.b = b;
        this.a = false;
    }

    @Override
    public void run() {
        final int ab = l.Ab;
        try {
            while (!this.a) {
                c a = null;
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(s.z[5]);
                final Date date = new Date();
                try {
                    a = this.b.jb.a(this.b.H, g.i ? l.g(this.b) : null, false);
                } catch (Throwable t) {
                    System.out.println(s.z[3] + simpleDateFormat.format(date).toString());
                    System.out.println(s.z[6] + t.toString());
                }
                if (a == null) {
                    System.out.println(s.z[0]);
                    System.out.println(s.z[2] + simpleDateFormat.format(date).toString());
                    this.b.f();
                    if (ab == 0) {
                        break;
                    }
                }
                l.h(this.b);
                int i = 0;
                while (i < l.i(this.b).size()) {
                    this.b.a(i).a(a);
                    ++i;
                    if (ab != 0) {
                        break;
                    }
                }
                if (l.j(this.b)) {
                    g.i = false;
                    if (l.k(this.b) != null) {
                        l.l(this.b).close();
                    }
                    l.b(this.b, null);
                    l.b(this.b, false);
                    this.b.a(s.z[4], Boolean.FALSE);
                }
                this.b.hb.a(a);
                if (ab != 0) {
                    break;
                }
            }
        } catch (Throwable t2) {
            this.b.i().a(s.z[1] + t2.getMessage());
            t2.printStackTrace();
            this.b.a(t2);
        }
    }

    static {
        final String[] z2 = new String[8];
        final int n = 0;
        final char[] charArray = ">mx9&!jl)=<ln9(\f><\u000e,\u000bau*,\f$}|'\u001dhp|9\tgw9=Hts5'\u001canr".toCharArray();
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
                            c2 = 'h';
                            break;
                        }
                        case 1: {
                            c2 = '\u0004';
                            break;
                        }
                        case 2: {
                            c2 = '\u001c';
                            break;
                        }
                        case 3: {
                            c2 = '\\';
                            break;
                        }
                        default: {
                            c2 = 'I';
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
        final char[] charArray2 = "HEJ\u000f\u0019HOJ\u0011\u001a\rwo5&\u0006$Y.;\u0007v&|".toCharArray();
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
                            c4 = 'h';
                            break;
                        }
                        case 1: {
                            c4 = '\u0004';
                            break;
                        }
                        case 2: {
                            c4 = '\u001c';
                            break;
                        }
                        case 3: {
                            c4 = '\\';
                            break;
                        }
                        default: {
                            c4 = 'I';
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
        final char[] charArray3 = ">mx9&!jl)=<ln9(\f><,iU9<2<\u0004h<|\tH$".toCharArray();
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
                            c6 = 'h';
                            break;
                        }
                        case 1: {
                            c6 = '\u0004';
                            break;
                        }
                        case 2: {
                            c6 = '\u001c';
                            break;
                        }
                        case 3: {
                            c6 = '\\';
                            break;
                        }
                        default: {
                            c6 = 'I';
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
        final char[] charArray4 = ">mx9&!jl)=<ln9(\f><\u000e,\u000bau*,\f$}|9\tgw9=Hts5'\u001can|(\u001c$".toCharArray();
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
                            c8 = 'h';
                            break;
                        }
                        case 1: {
                            c8 = '\u0004';
                            break;
                        }
                        case 2: {
                            c8 = '\u001c';
                            break;
                        }
                        case 3: {
                            c8 = '\\';
                            break;
                        }
                        default: {
                            c8 = 'I';
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
        final char[] charArray5 = ":A_\u0013\u001b,MR\u001b\u0016)GH\u0015\u001f-".toCharArray();
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
                            c10 = 'h';
                            break;
                        }
                        case 1: {
                            c10 = '\u0004';
                            break;
                        }
                        case 2: {
                            c10 = '\u001c';
                            break;
                        }
                        case 3: {
                            c10 = '\\';
                            break;
                        }
                        default: {
                            c10 = 'I';
                            break;
                        }
                    }
                    charArray5[length5] = (char) (c9 ^ c10);
                    ++n20;
                } while (n18 == 0);
            }
            if (n18 > n20) {
                continue;
            }
            break;
        }
        z2[n17] = new String(charArray5).intern();
        final int n21 = 5;
        final char[] charArray6 = "\u0011}e%f%I38-HLTf$\u0005>o/".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0677:
            {
                if (n22 > 1) {
                    break Label_0677;
                }
                length6 = (n23 = n24);
                do {
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = 'h';
                            break;
                        }
                        case 1: {
                            c12 = '\u0004';
                            break;
                        }
                        case 2: {
                            c12 = '\u001c';
                            break;
                        }
                        case 3: {
                            c12 = '\\';
                            break;
                        }
                        default: {
                            c12 = 'I';
                            break;
                        }
                    }
                    charArray6[length6] = (char) (c11 ^ c12);
                    ++n24;
                } while (n22 == 0);
            }
            if (n22 > n24) {
                continue;
            }
            break;
        }
        z2[n21] = new String(charArray6).intern();
        final int n25 = 6;
        final char[] charArray7 = ">mx9&!jl)=<ln9(\f><|$7ru8,\u0007Wh.,\tiL=*\u0003ah\u000e,\u000bau*,\u001a*n9*\rmj9i\rvn3;H/<".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0793:
            {
                if (n26 > 1) {
                    break Label_0793;
                }
                length7 = (n27 = n28);
                do {
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = 'h';
                            break;
                        }
                        case 1: {
                            c14 = '\u0004';
                            break;
                        }
                        case 2: {
                            c14 = '\u001c';
                            break;
                        }
                        case 3: {
                            c14 = '\\';
                            break;
                        }
                        default: {
                            c14 = 'I';
                            break;
                        }
                    }
                    charArray7[length7] = (char) (c13 ^ c14);
                    ++n28;
                } while (n26 == 0);
            }
            if (n26 > n28) {
                continue;
            }
            break;
        }
        z2[n25] = new String(charArray7).intern();
        final int n29 = 7;
        final char[] charArray8 = ")RO\fi>mx9&HMr,<\u001c".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0909:
            {
                if (n30 > 1) {
                    break Label_0909;
                }
                length8 = (n31 = n32);
                do {
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = 'h';
                            break;
                        }
                        case 1: {
                            c16 = '\u0004';
                            break;
                        }
                        case 2: {
                            c16 = '\u001c';
                            break;
                        }
                        case 3: {
                            c16 = '\\';
                            break;
                        }
                        default: {
                            c16 = 'I';
                            break;
                        }
                    }
                    charArray8[length8] = (char) (c15 ^ c16);
                    ++n32;
                } while (n30 == 0);
            }
            if (n30 <= n32) {
                z2[n29] = new String(charArray8).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
