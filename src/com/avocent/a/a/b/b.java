// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.b;

import java.awt.Component;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.avocent.a.g;
import javax.swing.JDialog;

public class b extends JDialog {

    protected g a;
    private JLabel b;
    private JPanel c;
    private JLabel d;
    private JTextArea e;
    private JPanel f;
    private JButton g;
    private JLabel h;
    private static final String[] z;

    public b(final g a, final boolean b) {
        super(a.c(), b);
        this.a = a;
        this.a();
        this.e.setBackground(UIManager.getDefaults().getColor(com.avocent.a.a.b.b.z[0]));
        this.g.addActionListener(new a(this));
    }

    private void a() {
        this.f = new JPanel();
        this.b = new JLabel();
        this.h = new JLabel();
        this.d = new JLabel();
        this.e = new JTextArea();
        this.c = new JPanel();
        this.g = new JButton();
        this.setDefaultCloseOperation(2);
        this.f.setLayout(new GridBagLayout());
        this.b.setText(this.a.b(com.avocent.a.a.b.b.z[8]));
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        this.f.add(this.b, gridBagConstraints);
        this.h.setText(this.a.b(com.avocent.a.a.b.b.z[2]));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridwidth = 0;
        this.f.add(this.h, gridBagConstraints2);
        this.d.setText(this.a.b(com.avocent.a.a.b.b.z[7]));
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        gridBagConstraints3.insets = new Insets(10, 10, 10, 10);
        this.f.add(this.d, gridBagConstraints3);
        this.e.setBackground(UIManager.getDefaults().getColor(com.avocent.a.a.b.b.z[1]));
        this.e.setColumns(42);
        this.e.setEditable(false);
        this.e.setLineWrap(true);
        this.e.setRows(5);
        this.e.setText(this.a.b(com.avocent.a.a.b.b.z[5]));
        this.e.setWrapStyleWord(true);
        new GridBagConstraints().weightx = 1.0;
        this.getContentPane().add(this.f, com.avocent.a.a.b.b.z[4]);
        this.g.setText(this.a.b(com.avocent.a.a.b.b.z[3]));
        this.c.add(this.g);
        this.getContentPane().add(this.c, com.avocent.a.a.b.b.z[6]);
        this.pack();
    }

    static {
        final String[] z2 = new String[9];
        final int n = 0;
        final char[] charArray = "E\u0018p~M;\u001b\u007fxJr\u000bqnOq".toCharArray();
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
                            c2 = '\u0015';
                            break;
                        }
                        case 1: {
                            c2 = 'y';
                            break;
                        }
                        case 2: {
                            c2 = '\u001e';
                            break;
                        }
                        case 3: {
                            c2 = '\u001b';
                            break;
                        }
                        default: {
                            c2 = '!';
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
        final char[] charArray2 = "v\u0016poSz\u0015".toCharArray();
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
                            c4 = '\u0015';
                            break;
                        }
                        case 1: {
                            c4 = 'y';
                            break;
                        }
                        case 2: {
                            c4 = '\u001e';
                            break;
                        }
                        case 3: {
                            c4 = '\u001b';
                            break;
                        }
                        default: {
                            c4 = '!';
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
        final char[] charArray3 = "T\u001bqnUQ\u0010\u007fwNr&H~Sf\u0010qu".toCharArray();
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
                            c6 = '\u0015';
                            break;
                        }
                        case 1: {
                            c6 = 'y';
                            break;
                        }
                        case 2: {
                            c6 = '\u001e';
                            break;
                        }
                        case 3: {
                            c6 = '\u001b';
                            break;
                        }
                        default: {
                            c6 = '!';
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
        final char[] charArray4 = "Q\u0010\u007fwNr&QP".toCharArray();
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
                            c8 = '\u0015';
                            break;
                        }
                        case 1: {
                            c8 = 'y';
                            break;
                        }
                        case 2: {
                            c8 = '\u001e';
                            break;
                        }
                        case 3: {
                            c8 = '\u001b';
                            break;
                        }
                        default: {
                            c8 = '!';
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
        final char[] charArray5 = "V\u001cpoDg".toCharArray();
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
                            c10 = '\u0015';
                            break;
                        }
                        case 1: {
                            c10 = 'y';
                            break;
                        }
                        case 2: {
                            c10 = '\u001e';
                            break;
                        }
                        case 3: {
                            c10 = '\u001b';
                            break;
                        }
                        default: {
                            c10 = '!';
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
        final char[] charArray6 = "T\u001bqnUQ\u0010\u007fwNr&MnOV\u0016nbS|\u001evo".toCharArray();
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
                            c12 = '\u0015';
                            break;
                        }
                        case 1: {
                            c12 = 'y';
                            break;
                        }
                        case 2: {
                            c12 = '\u001e';
                            break;
                        }
                        case 3: {
                            c12 = '\u001b';
                            break;
                        }
                        default: {
                            c12 = '!';
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
        final char[] charArray7 = "F\u0016koI".toCharArray();
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
                            c14 = '\u0015';
                            break;
                        }
                        case 1: {
                            c14 = 'y';
                            break;
                        }
                        case 2: {
                            c14 = '\u001e';
                            break;
                        }
                        case 3: {
                            c14 = '\u001b';
                            break;
                        }
                        default: {
                            c14 = '!';
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
        final char[] charArray8 = "T\u001bqnUQ\u0010\u007fwNr&]tQl\u000bw|Ia".toCharArray();
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
                            c16 = '\u0015';
                            break;
                        }
                        case 1: {
                            c16 = 'y';
                            break;
                        }
                        case 2: {
                            c16 = '\u001e';
                            break;
                        }
                        case 3: {
                            c16 = '\u001b';
                            break;
                        }
                        default: {
                            c16 = '!';
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
        final char[] charArray9 = "T\u001bqnUQ\u0010\u007fwNr&NiNq\f}oot\u0014{".toCharArray();
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
                            c18 = '\u0015';
                            break;
                        }
                        case 1: {
                            c18 = 'y';
                            break;
                        }
                        case 2: {
                            c18 = '\u001e';
                            break;
                        }
                        case 3: {
                            c18 = '\u001b';
                            break;
                        }
                        default: {
                            c18 = '!';
                            break;
                        }
                    }
                    charArray9[length9] = (char) (c17 ^ c18);
                    ++n36;
                } while (n34 == 0);
            }
            if (n34 <= n36) {
                z2[n33] = new String(charArray9).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
