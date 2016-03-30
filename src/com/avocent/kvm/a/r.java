// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import com.avocent.kvm.b.d.c;
import java.io.OutputStream;
import com.avocent.kvm.b.g;
import java.util.Date;
import java.text.SimpleDateFormat;

class r extends Thread {

    boolean a;
    final l b;
    private static final String[] z;

    r(final l b) {
        super(r.z[0]);
        this.b = b;
        this.a = false;
    }

    @Override
    public void run() {
        final int ab = l.Ab;
        try {
            while (!this.a) {
                c a = null;
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(r.z[5]);
                final Date date = new Date();
                try {
                    System.out.println(r.z[1] + this.b.F.available());
                    if (this.b.F == null) {
                        System.out.println(r.z[6]);
                    }
                    a = this.b.ib.a(this.b.F, g.i ? l.a(this.b) : null, true);
                } catch (Throwable t) {
                    System.out.println(r.z[4] + simpleDateFormat.format(date).toString());
                    System.out.println(r.z[8] + t.toString());
                }
                if (a != null) {
                    System.out.println(r.z[3] + a.d());
                }
                if (a == null) {
                    System.out.println(r.z[10]);
                    System.out.println(r.z[9] + simpleDateFormat.format(date).toString());
                    this.b.f();
                    if (ab == 0) {
                        break;
                    }
                }
                l.b(this.b);
                int i = 0;
                while (i < l.c(this.b).size()) {
                    this.b.a(i).a(a);
                    ++i;
                    if (ab != 0) {
                        break;
                    }
                }
                if (l.d(this.b)) {
                    g.i = false;
                    if (l.e(this.b) != null) {
                        l.f(this.b).close();
                    }
                    l.a(this.b, null);
                    l.a(this.b, false);
                    this.b.a(r.z[2], Boolean.FALSE);
                }
                this.b.hb.a(a);
                if (ab != 0) {
                    break;
                }
            }
        } catch (Throwable t2) {
            System.out.println(r.z[7] + new SimpleDateFormat(r.z[5]).format(new Date()).toString());
            System.out.println(r.z[7] + t2.toString());
            t2.printStackTrace();
            this.b.a(t2);
            this.b.l();
        }
    }

    static {
        final String[] z2 = new String[11];
        final int n = 0;
        final char[] charArray = "/TxjK=gXI\u0002\u0001l\u000bh\u000e\rgBL\u000e".toCharArray();
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
                            c2 = 'n';
                            break;
                        }
                        case 1: {
                            c2 = '\u0002';
                            break;
                        }
                        case 2: {
                            c2 = '+';
                            break;
                        }
                        case 3: {
                            c2 = ':';
                            break;
                        }
                        default: {
                            c2 = 'k';
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
        final char[] charArray2 = "dQNI\u0018\u0007mEs\u0005\u001ew_n\u0003\u001cgJ^K\u0003]OS\u00188kO_\u0004@c][\u0002\u0002cIV\u000eT\"".toCharArray();
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
                            c4 = 'n';
                            break;
                        }
                        case 1: {
                            c4 = '\u0002';
                            break;
                        }
                        case 2: {
                            c4 = '+';
                            break;
                        }
                        case 3: {
                            c4 = ':';
                            break;
                        }
                        default: {
                            c4 = 'k';
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
        final char[] charArray3 = "<Ghu9*Ke}4/A\u007fs=+".toCharArray();
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
                            c6 = 'n';
                            break;
                        }
                        case 1: {
                            c6 = '\u0002';
                            break;
                        }
                        case 2: {
                            c6 = '+';
                            break;
                        }
                        case 3: {
                            c6 = ':';
                            break;
                        }
                        default: {
                            c6 = 'k';
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
        final char[] charArray4 = "=gXI\u0002\u0001lbT\u001b\u001bv\u007fR\u0019\u000bcO\u0000K\u001e,L_\u001f>cHQ\u000e\u001aKO\u0012BN".toCharArray();
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
                            c8 = 'n';
                            break;
                        }
                        case 1: {
                            c8 = '\u0002';
                            break;
                        }
                        case 2: {
                            c8 = '+';
                            break;
                        }
                        case 3: {
                            c8 = ':';
                            break;
                        }
                        default: {
                            c8 = 'k';
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
        final char[] charArray5 = "=gXI\u0002\u0001lbT\u001b\u001bv\u007fR\u0019\u000bcO\u0000K<gH_\u0002\u0018gO\u001a\nNrJY\u0000\u000bv\u000bJ\u0004\u0007l__\u0019Nc_\u001a".toCharArray();
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
                            c10 = 'n';
                            break;
                        }
                        case 1: {
                            c10 = '\u0002';
                            break;
                        }
                        case 2: {
                            c10 = '+';
                            break;
                        }
                        case 3: {
                            c10 = ':';
                            break;
                        }
                        default: {
                            c10 = 'k';
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
        final char[] charArray6 = "\u0017{RCD#O\u0004^\u000fNJc\u0000\u0006\u00038XI".toCharArray();
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
                            c12 = 'n';
                            break;
                        }
                        case 1: {
                            c12 = '\u0002';
                            break;
                        }
                        case 2: {
                            c12 = '+';
                            break;
                        }
                        case 3: {
                            c12 = ':';
                            break;
                        }
                        default: {
                            c12 = 'k';
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
        final char[] charArray7 = "=gXI\u0002\u0001lbT\u001b\u001bv\u007fR\u0019\u000bcO\u001aC\u0003]OS\u00188kO_\u0004N?\u0016\u001a\u0005\u001bnG0".toCharArray();
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
                            c14 = 'n';
                            break;
                        }
                        case 1: {
                            c14 = '\u0002';
                            break;
                        }
                        case 2: {
                            c14 = '+';
                            break;
                        }
                        case 3: {
                            c14 = ':';
                            break;
                        }
                        default: {
                            c14 = 'k';
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
        final char[] charArray8 = "=gXI\u0002\u0001lbT\u001b\u001bv\u007fR\u0019\u000bcO\u0000K\u000bpYU\u0019N)\u000b".toCharArray();
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
                            c16 = 'n';
                            break;
                        }
                        case 1: {
                            c16 = '\u0002';
                            break;
                        }
                        case 2: {
                            c16 = '+';
                            break;
                        }
                        case 3: {
                            c16 = ':';
                            break;
                        }
                        default: {
                            c16 = 'k';
                            break;
                        }
                    }
                    charArray8[length8] = (char) (c15 ^ c16);
                    ++n32;
                } while (n30 == 0);
            }
            if (n30 > n32) {
                continue;
            }
            break;
        }
        z2[n29] = new String(charArray8).intern();
        final int n33 = 8;
        final char[] charArray9 = "=gXI\u0002\u0001lbT\u001b\u001bv\u007fR\u0019\u000bcO\u0000KNotL\u0002\ngDi\u001f\u001cgJW;\u000fa@_\u001f<gH_\u0002\u0018gY\u0014\u0019\u000baNS\u001d\u000b\"NH\u0019\u0001p\u000b\u0011K".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1025:
            {
                if (n34 > 1) {
                    break Label_1025;
                }
                length9 = (n35 = n36);
                do {
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = 'n';
                            break;
                        }
                        case 1: {
                            c18 = '\u0002';
                            break;
                        }
                        case 2: {
                            c18 = '+';
                            break;
                        }
                        case 3: {
                            c18 = ':';
                            break;
                        }
                        default: {
                            c18 = 'k';
                            break;
                        }
                    }
                    charArray9[length9] = (char) (c17 ^ c18);
                    ++n36;
                } while (n34 == 0);
            }
            if (n34 > n36) {
                continue;
            }
            break;
        }
        z2[n33] = new String(charArray9).intern();
        final int n37 = 9;
        final char[] charArray10 = "=gXI\u0002\u0001lbT\u001b\u001bv\u007fR\u0019\u000bcO\u0000KNr\u000b\u0007VNl^V\u0007N\"k\u001aK".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1141:
            {
                if (n38 > 1) {
                    break Label_1141;
                }
                length10 = (n39 = n40);
                do {
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = 'n';
                            break;
                        }
                        case 1: {
                            c20 = '\u0002';
                            break;
                        }
                        case 2: {
                            c20 = '+';
                            break;
                        }
                        case 3: {
                            c20 = ':';
                            break;
                        }
                        default: {
                            c20 = 'k';
                            break;
                        }
                    }
                    charArray10[length10] = (char) (c19 ^ c20);
                    ++n40;
                } while (n38 == 0);
            }
            if (n38 > n40) {
                continue;
            }
            break;
        }
        z2[n37] = new String(charArray10).intern();
        final int n41 = 10;
        final char[] charArray11 = "=gXI\u0002\u0001lbT\u001b\u001bv\u007fR\u0019\u000bcO\u0000K<gH_\u0002\u0018gO\u001a\nNl^V\u0007NrJY\u0000\u000bv\u000bJ\u0004\u0007l__\u0019@".toCharArray();
        int length11;
        int n43;
        final int n42 = n43 = (length11 = charArray11.length);
        int n44 = 0;
        while (true) {
            Label_1257:
            {
                if (n42 > 1) {
                    break Label_1257;
                }
                length11 = (n43 = n44);
                do {
                    final char c21 = charArray11[n43];
                    char c22 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c22 = 'n';
                            break;
                        }
                        case 1: {
                            c22 = '\u0002';
                            break;
                        }
                        case 2: {
                            c22 = '+';
                            break;
                        }
                        case 3: {
                            c22 = ':';
                            break;
                        }
                        default: {
                            c22 = 'k';
                            break;
                        }
                    }
                    charArray11[length11] = (char) (c21 ^ c22);
                    ++n44;
                } while (n42 == 0);
            }
            if (n42 <= n44) {
                z2[n41] = new String(charArray11).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
