// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.b;

import java.awt.Component;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.avocent.kvm.b.nb;
import com.avocent.a.j;
import javax.swing.JDialog;

public class e extends JDialog implements j {

    protected a a;
    protected nb b;
    protected Double c;
    private JLabel d;
    private JTextField e;
    private JLabel f;
    private JPanel g;
    private JLabel h;
    private JTextField i;
    private JLabel j;
    private JPanel k;
    private JLabel l;
    private JTextField m;
    private JLabel n;
    private JButton o;
    private JLabel p;
    private JTextField q;
    private JLabel r;
    private static final String[] z;

    public e(final a a, final boolean b) {
        super(a.a().c(), b);
        int n = com.avocent.a.b.a.n;
        this.c = new Double(0.0);
        this.a = a;
        this.b();
        this.o.setAction(a.m);
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.a.b.a.n = ++n;
        }
    }

    public void a(final nb b) {
        this.b = b;
    }

    private void b() {
        this.k = new JPanel();
        this.l = new JLabel();
        this.m = new JTextField();
        this.n = new JLabel();
        this.d = new JLabel();
        this.e = new JTextField();
        this.f = new JLabel();
        this.h = new JLabel();
        this.i = new JTextField();
        this.j = new JLabel();
        this.p = new JLabel();
        this.q = new JTextField();
        this.r = new JLabel();
        this.g = new JPanel();
        this.o = new JButton();
        this.setDefaultCloseOperation(2);
        this.k.setLayout(new GridBagLayout());
        this.k.setBorder(BorderFactory.createCompoundBorder());
        this.l.setText(com.avocent.a.b.e.z[1]);
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = 13;
        gridBagConstraints.insets = new Insets(10, 4, 4, 0);
        this.k.add(this.l, gridBagConstraints);
        this.m.setColumns(10);
        this.m.setEditable(false);
        this.m.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.insets = new Insets(10, 4, 4, 4);
        this.k.add(this.m, gridBagConstraints2);
        this.n.setText(com.avocent.a.b.e.z[3]);
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        gridBagConstraints3.anchor = 17;
        gridBagConstraints3.insets = new Insets(10, 0, 4, 10);
        this.k.add(this.n, gridBagConstraints3);
        this.d.setText(com.avocent.a.b.e.z[9]);
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.anchor = 13;
        gridBagConstraints4.insets = new Insets(4, 4, 4, 0);
        this.k.add(this.d, gridBagConstraints4);
        this.e.setColumns(10);
        this.e.setEditable(false);
        this.e.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.weightx = 1.0;
        gridBagConstraints5.insets = new Insets(4, 4, 4, 4);
        this.k.add(this.e, gridBagConstraints5);
        this.f.setText(com.avocent.a.b.e.z[8]);
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridwidth = 0;
        gridBagConstraints6.anchor = 17;
        gridBagConstraints6.insets = new Insets(4, 0, 4, 10);
        this.k.add(this.f, gridBagConstraints6);
        this.h.setText(com.avocent.a.b.e.z[7]);
        final GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.anchor = 13;
        gridBagConstraints7.insets = new Insets(4, 4, 4, 0);
        this.k.add(this.h, gridBagConstraints7);
        this.i.setColumns(10);
        this.i.setEditable(false);
        this.i.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.fill = 2;
        gridBagConstraints8.weightx = 1.0;
        gridBagConstraints8.insets = new Insets(4, 4, 4, 4);
        this.k.add(this.i, gridBagConstraints8);
        this.j.setText(com.avocent.a.b.e.z[2]);
        final GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridwidth = 0;
        gridBagConstraints9.anchor = 17;
        gridBagConstraints9.insets = new Insets(4, 0, 4, 10);
        this.k.add(this.j, gridBagConstraints9);
        this.p.setText(com.avocent.a.b.e.z[4]);
        final GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.anchor = 13;
        gridBagConstraints10.insets = new Insets(4, 4, 10, 0);
        this.k.add(this.p, gridBagConstraints10);
        this.q.setColumns(10);
        this.q.setEditable(false);
        this.q.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.fill = 2;
        gridBagConstraints11.weightx = 1.0;
        gridBagConstraints11.insets = new Insets(4, 4, 10, 4);
        this.k.add(this.q, gridBagConstraints11);
        this.r.setText(com.avocent.a.b.e.z[6]);
        final GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.gridwidth = 0;
        gridBagConstraints12.anchor = 17;
        gridBagConstraints12.insets = new Insets(4, 0, 10, 10);
        this.k.add(this.r, gridBagConstraints12);
        this.getContentPane().add(this.k, com.avocent.a.b.e.z[0]);
        this.g.add(this.o);
        this.getContentPane().add(this.g, com.avocent.a.b.e.z[5]);
        this.pack();
    }

    @Override
    public void a() {
        if (this.b != null) {
            this.m.setText(this.b.a());
            this.i.setText(this.b.c());
            this.q.setText(this.b.d());
            this.e.setText(this.b.b());
            if (com.avocent.a.b.a.n == 0) {
                return;
            }
        }
        this.m.setText(" ");
        this.i.setText(" ");
        this.q.setText(" ");
        this.e.setText(" ");
    }

    static {
        final String[] z2 = new String[10];
        final int n = 0;
        final char[] charArray = "5<\u00008\f\u0004".toCharArray();
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
                            c2 = 'v';
                            break;
                        }
                        case 1: {
                            c2 = 'Y';
                            break;
                        }
                        case 2: {
                            c2 = 'n';
                            break;
                        }
                        case 3: {
                            c2 = 'L';
                            break;
                        }
                        default: {
                            c2 = 'i';
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
        final char[] charArray2 = "0+\u000f!\fV\u000b\u000f8\fL".toCharArray();
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
                            c4 = 'v';
                            break;
                        }
                        case 1: {
                            c4 = 'Y';
                            break;
                        }
                        case 2: {
                            c4 = 'n';
                            break;
                        }
                        case 3: {
                            c4 = 'L';
                            break;
                        }
                        default: {
                            c4 = 'i';
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
        final char[] charArray3 = "Sy<)\r\u0003:\u001a%\u0006\u0018".toCharArray();
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
                            c6 = 'v';
                            break;
                        }
                        case 1: {
                            c6 = 'Y';
                            break;
                        }
                        case 2: {
                            c6 = 'n';
                            break;
                        }
                        case 3: {
                            c6 = 'L';
                            break;
                        }
                        default: {
                            c6 = 'i';
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
        final char[] charArray4 = "0+\u000f!\f\u0005v\u001d)\n".toCharArray();
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
                            c8 = 'v';
                            break;
                        }
                        case 1: {
                            c8 = 'Y';
                            break;
                        }
                        case 2: {
                            c8 = 'n';
                            break;
                        }
                        case 3: {
                            c8 = 'L';
                            break;
                        }
                        default: {
                            c8 = 'i';
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
        final char[] charArray5 = "&8\r'\f\u0002y<-\u001d\u0013c".toCharArray();
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
                            c10 = 'v';
                            break;
                        }
                        case 1: {
                            c10 = 'Y';
                            break;
                        }
                        case 2: {
                            c10 = 'n';
                            break;
                        }
                        case 3: {
                            c10 = 'L';
                            break;
                        }
                        default: {
                            c10 = 'i';
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
        final char[] charArray6 = "%6\u001b8\u0001".toCharArray();
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
                            c12 = 'v';
                            break;
                        }
                        case 1: {
                            c12 = 'Y';
                            break;
                        }
                        case 2: {
                            c12 = 'n';
                            break;
                        }
                        case 3: {
                            c12 = 'L';
                            break;
                        }
                        default: {
                            c12 = 'i';
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
        final char[] charArray7 = "&8\r'\f\u0002*A?\f\u0015".toCharArray();
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
                            c14 = 'v';
                            break;
                        }
                        case 1: {
                            c14 = 'Y';
                            break;
                        }
                        case 2: {
                            c14 = 'n';
                            break;
                        }
                        case 3: {
                            c14 = 'L';
                            break;
                        }
                        default: {
                            c14 = 'i';
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
        final char[] charArray8 = "56\u0003<\u001b\u0013*\u001d%\u0006\u0018c".toCharArray();
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
                            c16 = 'v';
                            break;
                        }
                        case 1: {
                            c16 = 'Y';
                            break;
                        }
                        case 2: {
                            c16 = 'n';
                            break;
                        }
                        case 3: {
                            c16 = 'L';
                            break;
                        }
                        default: {
                            c16 = 'i';
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
        final char[] charArray9 = "=;A?\f\u0015".toCharArray();
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
                            c18 = 'v';
                            break;
                        }
                        case 1: {
                            c18 = 'Y';
                            break;
                        }
                        case 2: {
                            c18 = 'n';
                            break;
                        }
                        case 3: {
                            c18 = 'L';
                            break;
                        }
                        default: {
                            c18 = 'i';
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
        final char[] charArray10 = "48\u0000(\u001e\u001f=\u001a$S".toCharArray();
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
                            c20 = 'v';
                            break;
                        }
                        case 1: {
                            c20 = 'Y';
                            break;
                        }
                        case 2: {
                            c20 = 'n';
                            break;
                        }
                        case 3: {
                            c20 = 'L';
                            break;
                        }
                        default: {
                            c20 = 'i';
                            break;
                        }
                    }
                    charArray10[length10] = (char) (c19 ^ c20);
                    ++n40;
                } while (n38 == 0);
            }
            if (n38 <= n40) {
                z2[n37] = new String(charArray10).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
