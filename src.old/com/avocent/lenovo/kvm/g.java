// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.kvm.b.t;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

public class g extends AbstractAction {

    a a;
    protected Integer b;
    protected Integer c;
    private static final String[] z;

    public g(final a a, final Integer b, final Integer c) {
        super(a.b(g.z[7]));
        Object o = null;
        if (b == t.g) {
            if (c.equals(t.i)) {
                o = a.b(g.z[8]);
            } else if (c.equals(t.j)) {
                o = a.b(g.z[5]);
            } else if (c.equals(t.k)) {
                o = a.b(g.z[3]);
            } else if (c.equals(t.l)) {
                o = a.b(g.z[4]);
            }
        } else if (c.equals(t.l)) {
            o = a.b(g.z[0]);
        } else if (c.equals(t.m)) {
            o = a.b(g.z[9]);
        } else if (c.equals(t.n)) {
            o = a.b(g.z[1]);
        } else if (c.equals(t.o)) {
            o = a.b(g.z[6]);
        }
        this.putValue(g.z[2], o);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            if (this.a.a().a(3, this.b, this.c) == 0) {
                return;
            }
        } catch (IOException ex) {
            this.a.b().a(g.z[10] + ex.getMessage());
        }
        this.a.a(this.a.b(g.z[11]));
    }

    static {
        final String[] z2 = new String[12];
        final int n = 0;
        final char[] charArray = "+}0\u0005-\u0003r,(\u000f\ns+/\u0005\u0016h1\\\u0002\u000fh".toCharArray();
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
                            c2 = 'f';
                            break;
                        }
                        case 1: {
                            c2 = '\u001c';
                            break;
                        }
                        case 2: {
                            c2 = 'Y';
                            break;
                        }
                        case 3: {
                            c2 = 'k';
                            break;
                        }
                        default: {
                            c2 = '`';
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
        final char[] charArray2 = "+}0\u0005-\u0003r,(\u000f\ns+/\u0005\u0016h1ZR\u0004u-".toCharArray();
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
                            c4 = 'f';
                            break;
                        }
                        case 1: {
                            c4 = '\u001c';
                            break;
                        }
                        case 2: {
                            c4 = 'Y';
                            break;
                        }
                        case 3: {
                            c4 = 'k';
                            break;
                        }
                        default: {
                            c4 = '`';
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
        final char[] charArray3 = "(}4\u000e".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0330:
            {
                if (n10 > 1) {
                    break Label_0330;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = 'f';
                            break;
                        }
                        case 1: {
                            c6 = '\u001c';
                            break;
                        }
                        case 2: {
                            c6 = 'Y';
                            break;
                        }
                        case 3: {
                            c6 = 'k';
                            break;
                        }
                        default: {
                            c6 = '`';
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
        final char[] charArray4 = "+}0\u0005-\u0003r,,\u0012\u0003eo\t\t\u0012".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0446:
            {
                if (n14 > 1) {
                    break Label_0446;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = 'f';
                            break;
                        }
                        case 1: {
                            c8 = '\u001c';
                            break;
                        }
                        case 2: {
                            c8 = 'Y';
                            break;
                        }
                        case 3: {
                            c8 = 'k';
                            break;
                        }
                        default: {
                            c8 = '`';
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
        final char[] charArray5 = "+}0\u0005-\u0003r,,\u0012\u0003en\t\t\u0012".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0562:
            {
                if (n18 > 1) {
                    break Label_0562;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = 'f';
                            break;
                        }
                        case 1: {
                            c10 = '\u001c';
                            break;
                        }
                        case 2: {
                            c10 = 'Y';
                            break;
                        }
                        case 3: {
                            c10 = 'k';
                            break;
                        }
                        default: {
                            c10 = '`';
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
        final char[] charArray6 = "+}0\u0005-\u0003r,,\u0012\u0003el\t\t\u0012".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0678:
            {
                if (n22 > 1) {
                    break Label_0678;
                }
                length6 = (n23 = n24);
                do {
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = 'f';
                            break;
                        }
                        case 1: {
                            c12 = '\u001c';
                            break;
                        }
                        case 2: {
                            c12 = 'Y';
                            break;
                        }
                        case 3: {
                            c12 = 'k';
                            break;
                        }
                        default: {
                            c12 = '`';
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
        final char[] charArray7 = "+}0\u0005-\u0003r,(\u000f\ns+/\u0005\u0016h1ZU\u0004u-".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0798:
            {
                if (n26 > 1) {
                    break Label_0798;
                }
                length7 = (n27 = n28);
                do {
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = 'f';
                            break;
                        }
                        case 1: {
                            c14 = '\u001c';
                            break;
                        }
                        case 2: {
                            c14 = 'Y';
                            break;
                        }
                        case 3: {
                            c14 = 'k';
                            break;
                        }
                        default: {
                            c14 = '`';
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
        final char[] charArray8 = "+}0\u0005-\u0003r,(\u000f\ns+&\u000f\u0002y".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0918:
            {
                if (n30 > 1) {
                    break Label_0918;
                }
                length8 = (n31 = n32);
                do {
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = 'f';
                            break;
                        }
                        case 1: {
                            c16 = '\u001c';
                            break;
                        }
                        case 2: {
                            c16 = 'Y';
                            break;
                        }
                        case 3: {
                            c16 = 'k';
                            break;
                        }
                        default: {
                            c16 = '`';
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
        final char[] charArray9 = "+}0\u0005-\u0003r,,\u0012\u0003em\t\t\u0012".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1038:
            {
                if (n34 > 1) {
                    break Label_1038;
                }
                length9 = (n35 = n36);
                do {
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = 'f';
                            break;
                        }
                        case 1: {
                            c18 = '\u001c';
                            break;
                        }
                        case 2: {
                            c18 = 'Y';
                            break;
                        }
                        case 3: {
                            c18 = 'k';
                            break;
                        }
                        default: {
                            c18 = '`';
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
        final char[] charArray10 = "+}0\u0005-\u0003r,(\u000f\ns+/\u0005\u0016h1R\u0002\u000fh".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1158:
            {
                if (n38 > 1) {
                    break Label_1158;
                }
                length10 = (n39 = n40);
                do {
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = 'f';
                            break;
                        }
                        case 1: {
                            c20 = '\u001c';
                            break;
                        }
                        case 2: {
                            c20 = 'Y';
                            break;
                        }
                        case 3: {
                            c20 = 'k';
                            break;
                        }
                        default: {
                            c20 = '`';
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
        final char[] charArray11 = "#N\u000b$2\\<\u001c\u0013\u0003\u0003l-\u0002\u000f\b<.\u0003\t\nyy\u0018\u0005\bx0\u0005\u0007F\u007f6\u0007\u000f\u0014<4\u0004\u0004\u0003<*\u000e\u0014\u0012u7\f@\u0014y(\u001e\u0005\u0015hcK".toCharArray();
        int length11;
        int n43;
        final int n42 = n43 = (length11 = charArray11.length);
        int n44 = 0;
        while (true) {
            Label_1278:
            {
                if (n42 > 1) {
                    break Label_1278;
                }
                length11 = (n43 = n44);
                do {
                    final char c21 = charArray11[n43];
                    char c22 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c22 = 'f';
                            break;
                        }
                        case 1: {
                            c22 = '\u001c';
                            break;
                        }
                        case 2: {
                            c22 = 'Y';
                            break;
                        }
                        case 3: {
                            c22 = 'k';
                            break;
                        }
                        default: {
                            c22 = '`';
                            break;
                        }
                    }
                    charArray11[length11] = (char) (c21 ^ c22);
                    ++n44;
                } while (n42 == 0);
            }
            if (n42 > n44) {
                continue;
            }
            break;
        }
        z2[n41] = new String(charArray11).intern();
        final int n45 = 11;
        final char[] charArray12 = "#n+\u0004\u00123r8\t\f\u0003H6*\u0010\u0016p (\u000f\ns+&\u000f\u0002y\n\u000e\u0014\u0012u7\f".toCharArray();
        int length12;
        int n47;
        final int n46 = n47 = (length12 = charArray12.length);
        int n48 = 0;
        while (true) {
            Label_1398:
            {
                if (n46 > 1) {
                    break Label_1398;
                }
                length12 = (n47 = n48);
                do {
                    final char c23 = charArray12[n47];
                    char c24 = '\0';
                    switch (n48 % 5) {
                        case 0: {
                            c24 = 'f';
                            break;
                        }
                        case 1: {
                            c24 = '\u001c';
                            break;
                        }
                        case 2: {
                            c24 = 'Y';
                            break;
                        }
                        case 3: {
                            c24 = 'k';
                            break;
                        }
                        default: {
                            c24 = '`';
                            break;
                        }
                    }
                    charArray12[length12] = (char) (c23 ^ c24);
                    ++n48;
                } while (n46 == 0);
            }
            if (n46 <= n48) {
                z2[n45] = new String(charArray12).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
