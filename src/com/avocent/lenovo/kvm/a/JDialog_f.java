// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.a;

import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Component;
import javax.swing.Action;
import java.awt.Frame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JDialog;

//Originally named f
public class JDialog_f extends JDialog {

    protected a a;
    private JPanel b;
    private JButton c;
    private JButton d;
    private JPanel e;
    private ButtonGroup f;
    private JButton g;
    private JPanel h;
    private JPanel i;
    private JPanel j;
    private JTextField k;
    private JTextArea l;
    private JScrollPane m;
    private JLabel n;
    private JLabel o;
    private static final String[] z;

    public JDialog_f(a a, Frame locationRelativeTo) {
        super(locationRelativeTo, false);
        final int o = com.avocent.lenovo.kvm.a.a.o;
        this.a = a;
        this.a();
        this.c.setAction(this.a.k);
        this.g.setAction(this.a.l);
        this.d.setAction(this.a.m);
        this.setLocationRelativeTo(locationRelativeTo);
        if (o != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }

    private void a() {
        this.f = new ButtonGroup();
        this.e = new JPanel();
        this.m = new JScrollPane();
        this.l = new JTextArea();
        this.b = new JPanel();
        this.c = new JButton();
        this.d = new JButton();
        this.h = new JPanel();
        this.i = new JPanel();
        this.n = new JLabel();
        this.o = new JLabel();
        this.j = new JPanel();
        this.k = new JTextField();
        this.g = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle(com.avocent.lenovo.kvm.a.JDialog_f.z[3]);
        this.e.setBorder(BorderFactory.createTitledBorder(com.avocent.lenovo.kvm.a.JDialog_f.z[9]));
        this.e.setLayout(new BorderLayout());
        this.l.setColumns(40);
        this.l.setRows(5);
        this.m.setViewportView(this.l);
        this.e.add(this.m, com.avocent.lenovo.kvm.a.JDialog_f.z[0]);
        this.getContentPane().add(this.e, com.avocent.lenovo.kvm.a.JDialog_f.z[0]);
        this.b.setLayout(new GridBagLayout());
        this.c.setText(com.avocent.lenovo.kvm.a.JDialog_f.z[7]);
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 5, 5, 5);
        this.b.add(this.c, gridBagConstraints);
        this.d.setText(com.avocent.lenovo.kvm.a.JDialog_f.z[5]);
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.anchor = 11;
        gridBagConstraints2.weighty = 1.0;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        this.b.add(this.d, gridBagConstraints2);
        this.getContentPane().add(this.b, com.avocent.lenovo.kvm.a.JDialog_f.z[1]);
        this.h.setLayout(new GridBagLayout());
        this.i.setLayout(new GridBagLayout());
        this.n.setText(com.avocent.lenovo.kvm.a.JDialog_f.z[8]);
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.insets = new Insets(3, 3, 3, 3);
        this.i.add(this.n, gridBagConstraints3);
        this.o.setText(com.avocent.lenovo.kvm.a.JDialog_f.z[2]);
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridwidth = 0;
        gridBagConstraints4.anchor = 17;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.insets = new Insets(3, 3, 3, 3);
        this.i.add(this.o, gridBagConstraints4);
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridwidth = 0;
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.anchor = 17;
        gridBagConstraints5.weightx = 1.0;
        this.h.add(this.i, gridBagConstraints5);
        this.j.setLayout(new GridBagLayout());
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.fill = 2;
        gridBagConstraints6.weightx = 1.0;
        gridBagConstraints6.insets = new Insets(4, 4, 4, 4);
        this.j.add(this.k, gridBagConstraints6);
        this.g.setText(com.avocent.lenovo.kvm.a.JDialog_f.z[6]);
        final GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.anchor = 11;
        gridBagConstraints7.insets = new Insets(5, 0, 5, 5);
        this.j.add(this.g, gridBagConstraints7);
        final GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.fill = 2;
        gridBagConstraints8.weightx = 1.0;
        this.h.add(this.j, gridBagConstraints8);
        this.getContentPane().add(this.h, com.avocent.lenovo.kvm.a.JDialog_f.z[4]);
        this.pack();
    }

    public void a(String text) {
        this.o.setText(text);
    }

    static {
        final String[] z2 = new String[10];
        final int n = 0;
        final char[] charArray = "I\u001d9ugx".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0096:
            {
                if (n2 > 1) {
                    break Label_0096;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '\n';
                            break;
                        }
                        case 1: {
                            c2 = 'x';
                            break;
                        }
                        case 2: {
                            c2 = 'W';
                            break;
                        }
                        case 3: {
                            c2 = '\u0001';
                            break;
                        }
                        default: {
                            c2 = '\u0002';
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
        final char[] charArray2 = "O\u0019$u".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0212:
            {
                if (n6 > 1) {
                    break Label_0212;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '\n';
                            break;
                        }
                        case 1: {
                            c4 = 'x';
                            break;
                        }
                        case 2: {
                            c4 = 'W';
                            break;
                        }
                        case 3: {
                            c4 = '\u0001';
                            break;
                        }
                        default: {
                            c4 = '\u0002';
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
        final char[] charArray3 = "o\n\"`le".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0328:
            {
                if (n10 > 1) {
                    break Label_0328;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '\n';
                            break;
                        }
                        case 1: {
                            c6 = 'x';
                            break;
                        }
                        case 2: {
                            c6 = 'W';
                            break;
                        }
                        case 3: {
                            c6 = '\u0001';
                            break;
                        }
                        default: {
                            c6 = '\u0002';
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
        final char[] charArray4 = "d\r;m".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0444:
            {
                if (n14 > 1) {
                    break Label_0444;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = '\n';
                            break;
                        }
                        case 1: {
                            c8 = 'x';
                            break;
                        }
                        case 2: {
                            c8 = 'W';
                            break;
                        }
                        case 3: {
                            c8 = '\u0001';
                            break;
                        }
                        default: {
                            c8 = '\u0002';
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
        final char[] charArray5 = "F\u0019$u".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0560:
            {
                if (n18 > 1) {
                    break Label_0560;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = '\n';
                            break;
                        }
                        case 1: {
                            c10 = 'x';
                            break;
                        }
                        case 2: {
                            c10 = 'W';
                            break;
                        }
                        case 3: {
                            c10 = '\u0001';
                            break;
                        }
                        default: {
                            c10 = '\u0002';
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
        final char[] charArray6 = "I\u00148rg".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0676:
            {
                if (n22 > 1) {
                    break Label_0676;
                }
                length6 = (n23 = n24);
                do {
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = '\n';
                            break;
                        }
                        case 1: {
                            c12 = 'x';
                            break;
                        }
                        case 2: {
                            c12 = 'W';
                            break;
                        }
                        case 3: {
                            c12 = '\u0001';
                            break;
                        }
                        default: {
                            c12 = '\u0002';
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
        final char[] charArray7 = "Y\u001d9e".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0792:
            {
                if (n26 > 1) {
                    break Label_0792;
                }
                length7 = (n27 = n28);
                do {
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = '\n';
                            break;
                        }
                        case 1: {
                            c14 = 'x';
                            break;
                        }
                        case 2: {
                            c14 = 'W';
                            break;
                        }
                        case 3: {
                            c14 = '\u0001';
                            break;
                        }
                        default: {
                            c14 = '\u0002';
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
        final char[] charArray8 = "I\u00142`p".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0908:
            {
                if (n30 > 1) {
                    break Label_0908;
                }
                length8 = (n31 = n32);
                do {
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = '\n';
                            break;
                        }
                        case 1: {
                            c16 = 'x';
                            break;
                        }
                        case 2: {
                            c16 = 'W';
                            break;
                        }
                        case 3: {
                            c16 = '\u0001';
                            break;
                        }
                        default: {
                            c16 = '\u0002';
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
        final char[] charArray9 = "_\u000b2s8".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1024:
            {
                if (n34 > 1) {
                    break Label_1024;
                }
                length9 = (n35 = n36);
                do {
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = '\n';
                            break;
                        }
                        case 1: {
                            c18 = 'x';
                            break;
                        }
                        case 2: {
                            c18 = 'W';
                            break;
                        }
                        case 3: {
                            c18 = '\u0001';
                            break;
                        }
                        default: {
                            c18 = '\u0002';
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
        final char[] charArray10 = "B\u0011$umx\u0001".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1140:
            {
                if (n38 > 1) {
                    break Label_1140;
                }
                length10 = (n39 = n40);
                do {
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = '\n';
                            break;
                        }
                        case 1: {
                            c20 = 'x';
                            break;
                        }
                        case 2: {
                            c20 = 'W';
                            break;
                        }
                        case 3: {
                            c20 = '\u0001';
                            break;
                        }
                        default: {
                            c20 = '\u0002';
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
