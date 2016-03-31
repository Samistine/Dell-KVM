// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.awt.Dimension;
import com.avocent.a.d;
import java.awt.Toolkit;

//Originally named o
class Runnable_o implements Runnable {

    boolean a;
    final i b;
    private static final String[] z;

    Runnable_o(final i b, final boolean a) {
        this.b = b;
        this.a = a;
    }

    @Override
    public void run() {
        final boolean g = i.G;
        if (!this.a) {
            this.b.b().a(Runnable_o.z[5]);
            this.b.l.setVisible(false);
            this.b.k.setVisible(true);
            this.b.k.pack();
            this.b.a(Runnable_o.z[1], (Object) Boolean.FALSE);
            if (!g) {
                return;
            }
        }
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.b.b().a(Runnable_o.z[4] + screenSize.width + "x" + screenSize.height);
        final Dimension preferredSize = this.b.l.getPreferredSize();
        this.b.n.c().getPreferredSize();
        if (preferredSize.width > screenSize.width || preferredSize.height > screenSize.height) {
            this.b.b().a(Runnable_o.z[6] + screenSize.width + "," + screenSize.height + Runnable_o.z[2] + preferredSize.width + "," + preferredSize.height + Runnable_o.z[0]);
            this.b.k.pack();
            this.b.l.setVisible(false);
            this.b.k.setVisible(true);
            this.b.a(Runnable_o.z[1], (Object) Boolean.FALSE);
            this.b.f(d.b(Runnable_o.z[3]));
            if (!g) {
                return;
            }
        }
        this.b.k.setVisible(false);
        this.b.n.c().invalidate();
        this.b.l.setSize(screenSize);
        this.b.l.validate();
        this.b.l.setVisible(true);
        this.b.a(Runnable_o.z[1], (Object) Boolean.TRUE);
    }

    static {
        final String[] z2 = new String[7];
        final int n = 0;
        final char[] charArray = "Vm".toCharArray();
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
                            c2 = '\u007f';
                            break;
                        }
                        case 1: {
                            c2 = 'C';
                            break;
                        }
                        case 2: {
                            c2 = 'Z';
                            break;
                        }
                        case 3: {
                            c2 = '@';
                            break;
                        }
                        default: {
                            c2 = '~';
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
        final char[] charArray2 = "9\u0016\u0016\f-<\u0011\u001f\u00050".toCharArray();
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
                            c4 = '\u007f';
                            break;
                        }
                        case 1: {
                            c4 = 'C';
                            break;
                        }
                        case 2: {
                            c4 = 'Z';
                            break;
                        }
                        case 3: {
                            c4 = '@';
                            break;
                        }
                        default: {
                            c4 = '~';
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
        final char[] charArray3 = "Vozh".toCharArray();
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
                            c6 = '\u007f';
                            break;
                        }
                        case 1: {
                            c6 = 'C';
                            break;
                        }
                        case 2: {
                            c6 = 'Z';
                            break;
                        }
                        case 3: {
                            c6 = '@';
                            break;
                        }
                        default: {
                            c6 = '~';
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
        final char[] charArray4 = "2\"3.)\u0016->/\t \u0007?3\u0015\u000b,*\u0014\u0011\u0010\u00107!\u0012\u0013".toCharArray();
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
                            c8 = '\u007f';
                            break;
                        }
                        case 1: {
                            c8 = 'C';
                            break;
                        }
                        case 2: {
                            c8 = 'Z';
                            break;
                        }
                        case 3: {
                            c8 = '@';
                            break;
                        }
                        default: {
                            c8 = '~';
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
        final char[] charArray5 = "_\u0005/,\u0012_092\u001b\u001a-z3\u0017\u0005&z3\u001b\u000bc./D_".toCharArray();
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
                            c10 = '\u007f';
                            break;
                        }
                        case 1: {
                            c10 = 'C';
                            break;
                        }
                        case 2: {
                            c10 = 'Z';
                            break;
                        }
                        case 3: {
                            c10 = '@';
                            break;
                        }
                        default: {
                            c10 = '~';
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
        final char[] charArray6 = "_\u0010-)\n\u001c+z4\u0011_-52\u0013\u001e/z7\u0017\u0011'57^\u0012,>%P".toCharArray();
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
                            c12 = '\u007f';
                            break;
                        }
                        case 1: {
                            c12 = 'C';
                            break;
                        }
                        case 2: {
                            c12 = 'Z';
                            break;
                        }
                        case 3: {
                            c12 = '@';
                            break;
                        }
                        default: {
                            c12 = '~';
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
        final char[] charArray7 = "<\"4.\u0011\u000bc?.\n\u001a1z&\u000b\u0013/z3\u001d\r&?.D_ 6)\u001b\u00117r".toCharArray();
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
                            c14 = '\u007f';
                            break;
                        }
                        case 1: {
                            c14 = 'C';
                            break;
                        }
                        case 2: {
                            c14 = 'Z';
                            break;
                        }
                        case 3: {
                            c14 = '@';
                            break;
                        }
                        default: {
                            c14 = '~';
                            break;
                        }
                    }
                    charArray7[length7] = (char) (c13 ^ c14);
                    ++n28;
                } while (n26 == 0);
            }
            if (n26 <= n28) {
                z2[n25] = new String(charArray7).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
