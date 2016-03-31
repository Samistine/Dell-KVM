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
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import com.avocent.lenovo.kvm.c;
import javax.swing.JDialog;

public class d extends JDialog {

    protected c a;
    protected int b;
    private ButtonGroup c;
    private JPanel d;
    private JPanel e;
    private JPanel f;
    private JTextArea g;
    private JButton h;
    private JRadioButton i;
    private JRadioButton j;
    private static final String[] z;

    public d(final c a, final Frame locationRelativeTo) {
        super(locationRelativeTo, true);
        this.a = a;
        this.a();
        this.setLocationRelativeTo(locationRelativeTo);
    }

    private void a() {
        this.c = new ButtonGroup();
        this.f = new JPanel();
        this.g = new JTextArea();
        this.e = new JPanel();
        this.i = new JRadioButton();
        this.j = new JRadioButton();
        this.d = new JPanel();
        this.h = new JButton();
        this.setDefaultCloseOperation(2);
        this.a.d();
        this.setTitle(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.d.z[6]));
        this.f.setBorder(BorderFactory.createTitledBorder(""));
        this.f.setLayout(new GridBagLayout());
        this.g.setBackground(UIManager.getDefaults().getColor(com.avocent.lenovo.kvm.b.d.z[3]));
        this.g.setColumns(40);
        this.g.setEditable(false);
        this.g.setLineWrap(true);
        final JTextArea g = this.g;
        this.a.d();
        g.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.d.z[5]));
        this.g.setWrapStyleWord(true);
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 0, 10);
        this.f.add(this.g, gridBagConstraints);
        this.e.setLayout(new GridBagLayout());
        this.c.add(this.i);
        final JRadioButton i = this.i;
        this.a.d();
        i.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.d.z[2]));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridwidth = 0;
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.insets = new Insets(0, 30, 0, 0);
        this.e.add(this.i, gridBagConstraints2);
        this.c.add(this.j);
        final JRadioButton j = this.j;
        this.a.d();
        j.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.d.z[4]));
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.insets = new Insets(0, 30, 0, 0);
        this.e.add(this.j, gridBagConstraints3);
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.insets = new Insets(0, 10, 10, 10);
        this.f.add(this.e, gridBagConstraints4);
        this.getContentPane().add(this.f, com.avocent.lenovo.kvm.b.d.z[1]);
        this.d.setLayout(new GridBagLayout());
        this.h.setText(com.avocent.lenovo.kvm.b.d.z[7]);
        this.h.addActionListener(new ActionListener_a(this));
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        this.d.add(this.h, gridBagConstraints5);
        this.getContentPane().add(this.d, com.avocent.lenovo.kvm.b.d.z[0]);
        this.pack();
    }

    private void a(final ActionEvent actionEvent) {
        this.b = (this.i.isSelected() ? 0 : 1);
        this.setVisible(false);
    }

    public int b() {
        this.b = 1;
        this.setVisible(true);
        return this.b;
    }

    static void a(final d d, final ActionEvent actionEvent) {
        d.a(actionEvent);
    }

    static {
        final String[] z2 = new String[8];
        final int n = 0;
        final char[] charArray = "\u0019Y\fu".toCharArray();
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
                            c2 = 'U';
                            break;
                        }
                        case 1: {
                            c2 = '8';
                            break;
                        }
                        case 2: {
                            c2 = '\u007f';
                            break;
                        }
                        case 3: {
                            c2 = '\u0001';
                            break;
                        }
                        default: {
                            c2 = 'G';
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
        final char[] charArray2 = "\u0016]\u0011u\"'".toCharArray();
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
                            c4 = 'U';
                            break;
                        }
                        case 1: {
                            c4 = '8';
                            break;
                        }
                        case 2: {
                            c4 = '\u007f';
                            break;
                        }
                        case 3: {
                            c4 = '\u0001';
                            break;
                        }
                        default: {
                            c4 = 'G';
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
        final char[] charArray3 = "\u0006p `)&O\u001as>0K".toCharArray();
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
                            c6 = 'U';
                            break;
                        }
                        case 1: {
                            c6 = '8';
                            break;
                        }
                        case 2: {
                            c6 = '\u007f';
                            break;
                        }
                        case 3: {
                            c6 = '\u0001';
                            break;
                        }
                        default: {
                            c6 = 'G';
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
        final char[] charArray4 = "\u0019Y\u001dd+{Z\u001eb,2J\u0010t)1".toCharArray();
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
                            c8 = 'U';
                            break;
                        }
                        case 1: {
                            c8 = '8';
                            break;
                        }
                        case 2: {
                            c8 = '\u007f';
                            break;
                        }
                        case 3: {
                            c8 = '\u0001';
                            break;
                        }
                        default: {
                            c8 = 'G';
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
        final char[] charArray5 = "\u0006p `)&O\u001as):".toCharArray();
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
                            c10 = 'U';
                            break;
                        }
                        case 1: {
                            c10 = '8';
                            break;
                        }
                        case 2: {
                            c10 = '\u007f';
                            break;
                        }
                        case 3: {
                            c10 = '\u0001';
                            break;
                        }
                        default: {
                            c10 = 'G';
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
        final char[] charArray6 = "\u0006p `4>".toCharArray();
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
                            c12 = 'U';
                            break;
                        }
                        case 1: {
                            c12 = '8';
                            break;
                        }
                        case 2: {
                            c12 = '\u007f';
                            break;
                        }
                        case 3: {
                            c12 = '\u0001';
                            break;
                        }
                        default: {
                            c12 = 'G';
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
        final char[] charArray7 = "\u001aH\u000bh(;K;h&9W\u0018^\u0013<L\u0013d".toCharArray();
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
                            c14 = 'U';
                            break;
                        }
                        case 1: {
                            c14 = '8';
                            break;
                        }
                        case 2: {
                            c14 = '\u007f';
                            break;
                        }
                        case 3: {
                            c14 = '\u0001';
                            break;
                        }
                        default: {
                            c14 = 'G';
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
        final char[] charArray8 = "\u001as".toCharArray();
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
                            c16 = 'U';
                            break;
                        }
                        case 1: {
                            c16 = '8';
                            break;
                        }
                        case 2: {
                            c16 = '\u007f';
                            break;
                        }
                        case 3: {
                            c16 = '\u0001';
                            break;
                        }
                        default: {
                            c16 = 'G';
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

    private static class ActionListener_a implements ActionListener {

        final d a;

        ActionListener_a(d a) {
            this.a = a;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            a(this.a, actionEvent);
        }
    }

}
