// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import javax.swing.UIManager;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import com.avocent.a.d;
import com.avocent.kvm.b.d.a;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.Timer;
import com.avocent.lenovo.kvm.c;
import javax.swing.JDialog;

public class e extends JDialog {

    protected c a;
    protected int b;
    private Timer c;
    private ButtonGroup d;
    private JRadioButton e;
    private JPanel f;
    private JPanel g;
    private JPanel h;
    private JTextArea i;
    private JButton j;
    private JRadioButton k;
    private JRadioButton l;
    public static boolean m;
    private static final String[] z;

    public e(final c a) {
        super(a.c(), true);
        final boolean m = com.avocent.lenovo.kvm.b.e.m;
        this.a = a;
        this.a();
        this.setLocationRelativeTo(a.c());
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.lenovo.kvm.b.e.m = !m;
        }
    }

    private void a() {
        this.d = new ButtonGroup();
        this.h = new JPanel();
        this.i = new JTextArea();
        this.g = new JPanel();
        this.e = new JRadioButton();
        this.k = new JRadioButton();
        this.l = new JRadioButton();
        this.f = new JPanel();
        this.j = new JButton();
        this.setDefaultCloseOperation(2);
        this.a.d();
        this.setTitle(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[3]));
        this.h.setBorder(BorderFactory.createTitledBorder(""));
        this.h.setLayout(new GridBagLayout());
        this.i.setBackground(UIManager.getDefaults().getColor(com.avocent.lenovo.kvm.b.e.z[9]));
        this.i.setColumns(40);
        this.i.setEditable(false);
        this.i.setLineWrap(true);
        this.i.setText(com.avocent.lenovo.kvm.b.e.z[5]);
        this.i.setWrapStyleWord(true);
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 0, 10);
        this.h.add(this.i, gridBagConstraints);
        this.g.setLayout(new GridBagLayout());
        this.d.add(this.e);
        final JRadioButton e = this.e;
        this.a.d();
        e.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[8]));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridwidth = 0;
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.insets = new Insets(0, 30, 0, 0);
        this.g.add(this.e, gridBagConstraints2);
        this.d.add(this.k);
        final JRadioButton k = this.k;
        this.a.d();
        k.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[10]));
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.insets = new Insets(0, 30, 0, 0);
        this.g.add(this.k, gridBagConstraints3);
        this.d.add(this.l);
        final JRadioButton l = this.l;
        this.a.d();
        l.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[7]));
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridwidth = 0;
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.insets = new Insets(0, 30, 0, 0);
        this.g.add(this.l, gridBagConstraints4);
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.insets = new Insets(0, 10, 10, 10);
        this.h.add(this.g, gridBagConstraints5);
        this.getContentPane().add(this.h, com.avocent.lenovo.kvm.b.e.z[6]);
        this.f.setLayout(new GridBagLayout());
        final JButton j = this.j;
        this.a.d();
        j.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[4]));
        this.j.addActionListener(new b(this));
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        this.f.add(this.j, gridBagConstraints6);
        this.getContentPane().add(this.f, com.avocent.lenovo.kvm.b.e.z[11]);
        this.pack();
    }

    private void a(final ActionEvent actionEvent) {
        final boolean m = com.avocent.lenovo.kvm.b.e.m;
        Label_0047:
        {
            if (this.e.isSelected()) {
                this.b = 2;
                if (!m) {
                    break Label_0047;
                }
            }
            if (this.l.isSelected()) {
                this.b = 3;
                if (!m) {
                    break Label_0047;
                }
            }
            this.b = 1;
        }
        System.out.println(com.avocent.lenovo.kvm.b.e.z[12] + this.b + com.avocent.lenovo.kvm.b.e.z[0]);
        this.setVisible(false);
    }

    private void a(final int n) {
        (this.c = new Timer(n * 1000, null)).addActionListener(new com.avocent.lenovo.kvm.b.c(this, this));
        this.c.start();
    }

    public int a(final String s) {
        final boolean m = com.avocent.lenovo.kvm.b.e.m;
        this.a(30);
        final StringBuilder sb = new StringBuilder();
        this.a.d();
        final StringBuilder append = sb.append(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[2])).append(com.avocent.lenovo.kvm.b.e.z[0]);
        this.a.d();
        this.i.setText(append.append(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[1])).toString());
        this.b = 1;
        this.setVisible(true);
        final int b = this.b;
        if (m) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
        return b;
    }

    static void a(final e e, final ActionEvent actionEvent) {
        e.a(actionEvent);
    }

    static {
        final String[] z2 = new String[13];
        final int n = 0;
        final char[] charArray = "\u00182".toCharArray();
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
                            c2 = '\u0012';
                            break;
                        }
                        case 1: {
                            c2 = '8';
                            break;
                        }
                        case 2: {
                            c2 = 't';
                            break;
                        }
                        case 3: {
                            c2 = 'i';
                            break;
                        }
                        default: {
                            c2 = '|';
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
        final char[] charArray2 = "Ap+\u001b\u0019cM\u0011\u001a\b ".toCharArray();
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
                            c4 = '\u0012';
                            break;
                        }
                        case 1: {
                            c4 = '8';
                            break;
                        }
                        case 2: {
                            c4 = 't';
                            break;
                        }
                        case 3: {
                            c4 = 'i';
                            break;
                        }
                        default: {
                            c4 = '|';
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
        final char[] charArray3 = "Ap+\u001b\u0019cM\u0011\u001a\b#".toCharArray();
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
                            c6 = '\u0012';
                            break;
                        }
                        case 1: {
                            c6 = '8';
                            break;
                        }
                        case 2: {
                            c6 = 't';
                            break;
                        }
                        case 3: {
                            c6 = 'i';
                            break;
                        }
                        default: {
                            c6 = '|';
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
        final char[] charArray4 = "]H\u0000\u0000\u0013|K0\u0000\u001d~W\u00136({L\u0018\f".toCharArray();
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
                            c8 = '\u0012';
                            break;
                        }
                        case 1: {
                            c8 = '8';
                            break;
                        }
                        case 2: {
                            c8 = 't';
                            break;
                        }
                        case 3: {
                            c8 = 'i';
                            break;
                        }
                        default: {
                            c8 = '|';
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
        final char[] charArray5 = "Ap+&7".toCharArray();
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
                            c10 = '\u0012';
                            break;
                        }
                        case 1: {
                            c10 = '8';
                            break;
                        }
                        case 2: {
                            c10 = 't';
                            break;
                        }
                        case 3: {
                            c10 = 'i';
                            break;
                        }
                        default: {
                            c10 = '|';
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
        final char[] charArray6 = "S\u0018\u0017\u0006\u0012|]\u0017\u001d\u0015}VT\u001b\u0019cM\u0011\u001a\b2P\u0015\u001a\\p]\u0011\u0007\\`]\u0017\f\u0015d]\u0010I\u001a`W\u0019IM+\nZXJ*\u0016FGM<2~9\u0010wY\u0007\f\\a]\u0018\f\u001ff\u0018\u0000\u0001\u00192Y\u0017\u001d\u0015}VT\u001d\u00132L\u0015\u0002\u0019<".toCharArray();
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
                            c12 = '\u0012';
                            break;
                        }
                        case 1: {
                            c12 = '8';
                            break;
                        }
                        case 2: {
                            c12 = 't';
                            break;
                        }
                        case 3: {
                            c12 = 'i';
                            break;
                        }
                        default: {
                            c12 = '|';
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
        final char[] charArray7 = "Q]\u001a\u001d\u0019`".toCharArray();
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
                            c14 = '\u0012';
                            break;
                        }
                        case 1: {
                            c14 = '8';
                            break;
                        }
                        case 2: {
                            c14 = 't';
                            break;
                        }
                        case 3: {
                            c14 = 'i';
                            break;
                        }
                        default: {
                            c14 = '|';
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
        final char[] charArray8 = "Ap+\b\u0010~W\u0003;\u0019s\\;\u0007\u0010k".toCharArray();
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
                            c16 = '\u0012';
                            break;
                        }
                        case 1: {
                            c16 = '8';
                            break;
                        }
                        case 2: {
                            c16 = 't';
                            break;
                        }
                        case 3: {
                            c16 = 'i';
                            break;
                        }
                        default: {
                            c16 = '|';
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
        final char[] charArray9 = "Ap+\b\fbJ\u001b\u001f\u0019".toCharArray();
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
                            c18 = '\u0012';
                            break;
                        }
                        case 1: {
                            c18 = '8';
                            break;
                        }
                        case 2: {
                            c18 = 't';
                            break;
                        }
                        case 3: {
                            c18 = 'i';
                            break;
                        }
                        default: {
                            c18 = '|';
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
        final char[] charArray10 = "BY\u001a\f\u0010<Z\u0015\n\u0017uJ\u001b\u001c\u0012v".toCharArray();
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
                            c20 = '\u0012';
                            break;
                        }
                        case 1: {
                            c20 = '8';
                            break;
                        }
                        case 2: {
                            c20 = 't';
                            break;
                        }
                        case 3: {
                            c20 = 'i';
                            break;
                        }
                        default: {
                            c20 = '|';
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
        final char[] charArray11 = "Ap+\u001b\u0019x]\u0017\u001d".toCharArray();
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
                            c22 = '\u0012';
                            break;
                        }
                        case 1: {
                            c22 = '8';
                            break;
                        }
                        case 2: {
                            c22 = 't';
                            break;
                        }
                        case 3: {
                            c22 = 'i';
                            break;
                        }
                        default: {
                            c22 = '|';
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
        final char[] charArray12 = "^Y\u0007\u001d".toCharArray();
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
                            c24 = '\u0012';
                            break;
                        }
                        case 1: {
                            c24 = '8';
                            break;
                        }
                        case 2: {
                            c24 = 't';
                            break;
                        }
                        case 3: {
                            c24 = 'i';
                            break;
                        }
                        default: {
                            c24 = '|';
                            break;
                        }
                    }
                    charArray12[length12] = (char) (c23 ^ c24);
                    ++n48;
                } while (n46 == 0);
            }
            if (n46 > n48) {
                continue;
            }
            break;
        }
        z2[n45] = new String(charArray12).intern();
        final int n49 = 12;
        final char[] charArray13 = "\u00182^CV8\u0012T-\u0019pM\u0013IV8\u0012^C\\ZW\u0007\u001d\\b]\u0006\u0004\u0015fKT\u0019\u0019`U\u001d\u001a\u000f{W\u001aS\\".toCharArray();
        int length13;
        int n51;
        final int n50 = n51 = (length13 = charArray13.length);
        int n52 = 0;
        while (true) {
            Label_1518:
            {
                if (n50 > 1) {
                    break Label_1518;
                }
                length13 = (n51 = n52);
                do {
                    final char c25 = charArray13[n51];
                    char c26 = '\0';
                    switch (n52 % 5) {
                        case 0: {
                            c26 = '\u0012';
                            break;
                        }
                        case 1: {
                            c26 = '8';
                            break;
                        }
                        case 2: {
                            c26 = 't';
                            break;
                        }
                        case 3: {
                            c26 = 'i';
                            break;
                        }
                        default: {
                            c26 = '|';
                            break;
                        }
                    }
                    charArray13[length13] = (char) (c25 ^ c26);
                    ++n52;
                } while (n50 == 0);
            }
            if (n50 <= n52) {
                z2[n49] = new String(charArray13).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
