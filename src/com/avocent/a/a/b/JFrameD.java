// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.b;

import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import com.avocent.a.a.i;
import javax.swing.JFrame;

//Originally named d
public class JFrameD extends JFrame {

    protected i a;
    private JMenuItem b_JMenuItem;//Originally named b
    private JMenuItem c_JMenuItem;//Originally named c
    private JMenuItem d_JMenuItem;//Originally named d
    private JMenu e_JMenu;//Originally named e
    private JSeparator f_JSeperator;//Originally named f
    private JMenuItem g_JMenuItem;//Originally named g
    private JMenuItem h_JMenuItem;//Originally named h
    private JMenu i_JMenu;//Originally named i
    private JMenu j_JMenu;//Originally named j
    private JMenuBar k_JMenuBar;//Originally named k
    private JMenuItem l_JMenuItem;//Originally named l
    private JMenu m_JMenu;//Originally named m
    private JPanel n_JPanel;//Originally named n
    private JScrollPane o_JScrollPane;//Originally named o
    private JMenuItem p_JMenuItem;//Originally named p
    private JMenu q_JMenu;//Originally named q
    private JMenuItem r_JMenuItem;//Originally named r
    private static final String[] z;

    public JFrameD(i a) {
        this.a = a;
        this.setUndecorated(true);
        this.a();
        this.setExtendedState(6);
        this.o_JScrollPane.setBackground(Color.black);
        try {
            this.setIconImage(new ImageIcon(i.class.getResource(com.avocent.a.a.b.JFrameD.z[14])).getImage());
        } catch (Exception ex) {
        }
        final String s = com.avocent.a.a.b.JFrameD.z[15];
        this.a.d();
        this.setTitle(a.b(s, com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[16])).toString());
        this.getJPanel_n().add(a.p().c());
    }

    private void a() {
        this.o_JScrollPane  = new JScrollPane();
        this.n_JPanel       = new JPanel();
        this.k_JMenuBar     = new JMenuBar();
        this.e_JMenu        = new JMenu();
        this.b_JMenuItem    = new JMenuItem();
        this.c_JMenuItem    = new JMenuItem();
        this.f_JSeperator   = new JSeparator();
        this.d_JMenuItem    = new JMenuItem();
        this.q_JMenu        = new JMenu();
        this.r_JMenuItem    = new JMenuItem();
        this.p_JMenuItem    = new JMenuItem();
        this.j_JMenu        = new JMenu();
        this.m_JMenu        = new JMenu();
        this.l_JMenuItem    = new JMenuItem();
        this.i_JMenu        = new JMenu();
        this.h_JMenuItem    = new JMenuItem();
        this.g_JMenuItem    = new JMenuItem();
        this.setDefaultCloseOperation(3);
        this.o_JScrollPane.setHorizontalScrollBarPolicy(31);
        this.o_JScrollPane.setVerticalScrollBarPolicy(21);
        this.n_JPanel.setLayout(new GridBagLayout());
        this.n_JPanel.setBackground(new Color(0, 0, 0));
        this.o_JScrollPane.setViewportView(this.n_JPanel);
        this.getContentPane().add(this.o_JScrollPane, com.avocent.a.a.b.JFrameD.z[11]);
        final JMenu e = this.e_JMenu;
        //this.a.d();
        e.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[10]));
        //this.a.d();
        this.b_JMenuItem.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[13]));
        this.e_JMenu.add(this.b_JMenuItem);
        //this.a.d();
        this.c_JMenuItem.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[0]));
        this.e_JMenu.add(this.c_JMenuItem);
        this.e_JMenu.add(this.f_JSeperator);
        //this.a.d();
        d_JMenuItem.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[12]));
        this.e_JMenu.add(this.d_JMenuItem);
        this.k_JMenuBar.add(this.e_JMenu);
        //this.a.d();
        this.q_JMenu.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[5]));
        //this.a.d();
        this.r_JMenuItem.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[1]));
        this.q_JMenu.add(this.r_JMenuItem);
        //this.a.d();
        this.p_JMenuItem.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[7]));
        this.q_JMenu.add(this.p_JMenuItem);
        this.k_JMenuBar.add(this.q_JMenu);
        final JMenu j = this.j_JMenu;
        //this.a.d();
        j.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[8]));
        this.k_JMenuBar.add(this.j_JMenu);
        final JMenu m = this.m_JMenu;
        //this.a.d();
        m.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[6]));
        final JMenuItem l = this.l_JMenuItem;
        //this.a.d();
        l.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[2]));
        this.m_JMenu.add(this.l_JMenuItem);
        this.k_JMenuBar.add(this.m_JMenu);
        final JMenu i = this.i_JMenu;
        //this.a.d();
        i.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[4]));
        final JMenuItem h = this.h_JMenuItem;
        //this.a.d();
        h.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[3]));
        this.i_JMenu.add(this.h_JMenuItem);
        final JMenuItem g = this.g_JMenuItem;
        //this.a.d();
        g.setText(com.avocent.a.d.b(com.avocent.a.a.b.JFrameD.z[9]));
        this.i_JMenu.add(this.g_JMenuItem);
        this.k_JMenuBar.add(this.i_JMenu);
        this.setJMenuBar(this.k_JMenuBar);
        this.pack();
    }

    public JPanel getJPanel_n() {
        return this.n_JPanel;
    }

    @Override
    public void setVisible(boolean visible) {
        System.out.println(com.avocent.a.a.b.JFrameD.z[17] + visible);
        super.setVisible(visible);
    }

    static {
        final String[] z2 = new String[18];
        final int n = 0;
        final char[] charArray = "\u007f\u0005wx3W\nkI8[\b{I=S\u0014jc\fW0qP\u0017^\u0001".toCharArray();
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
                            c2 = '2';
                            break;
                        }
                        case 1: {
                            c2 = 'd';
                            break;
                        }
                        case 2: {
                            c2 = '\u001e';
                            break;
                        }
                        case 3: {
                            c2 = '\u0016';
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
        final char[] charArray2 = "\u007f\u0005wx3W\nkI([\u0001iI,W\u0002ls\rZ".toCharArray();
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
                            c4 = '2';
                            break;
                        }
                        case 1: {
                            c4 = 'd';
                            break;
                        }
                        case 2: {
                            c4 = '\u001e';
                            break;
                        }
                        case 3: {
                            c4 = '\u0016';
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
        final char[] charArray3 = "\u007f\u0005wx3W\nkI*]\u000bre!a\u0001me\u0017]\nQf\n[\u000bpe".toCharArray();
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
                            c6 = '2';
                            break;
                        }
                        case 1: {
                            c6 = 'd';
                            break;
                        }
                        case 2: {
                            c6 = '\u001e';
                            break;
                        }
                        case 3: {
                            c6 = '\u0016';
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
        final char[] charArray4 = "\u007f\u0005wx3W\nkI6W\bnI=]\njs\u0010F\u0017_x\u001a{\nzs\u0006".toCharArray();
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
                            c8 = '2';
                            break;
                        }
                        case 1: {
                            c8 = 'd';
                            break;
                        }
                        case 2: {
                            c8 = '\u001e';
                            break;
                        }
                        case 3: {
                            c8 = '\u0016';
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
        final char[] charArray5 = "\u007f\u0005wx3W\nkI6W\bn".toCharArray();
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
                            c10 = '2';
                            break;
                        }
                        case 1: {
                            c10 = 'd';
                            break;
                        }
                        case 2: {
                            c10 = '\u001e';
                            break;
                        }
                        case 3: {
                            c10 = '\u0016';
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
        final char[] charArray6 = "\u007f\u0005wx3W\nkI([\u0001i".toCharArray();
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
                            c12 = '2';
                            break;
                        }
                        case 1: {
                            c12 = 'd';
                            break;
                        }
                        case 2: {
                            c12 = '\u001e';
                            break;
                        }
                        case 3: {
                            c12 = '\u0016';
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
        final char[] charArray7 = "\u007f\u0005wx3W\nkI*]\u000bre".toCharArray();
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
                            c14 = '2';
                            break;
                        }
                        case 1: {
                            c14 = 'd';
                            break;
                        }
                        case 2: {
                            c14 = '\u001e';
                            break;
                        }
                        case 3: {
                            c14 = '\u0016';
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
            if (n26 > n28) {
                continue;
            }
            break;
        }
        z2[n25] = new String(charArray7).intern();
        final int n29 = 7;
        final char[] charArray8 = "\u007f\u0005wx3W\nkI([\u0001iI8G\brE\u001d@\u0001{x".toCharArray();
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
                            c16 = '2';
                            break;
                        }
                        case 1: {
                            c16 = 'd';
                            break;
                        }
                        case 2: {
                            c16 = '\u001e';
                            break;
                        }
                        case 3: {
                            c16 = '\u0016';
                            break;
                        }
                        default: {
                            c16 = '~';
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
        final char[] charArray9 = "\u007f\u0005wx3W\nkI3S\u0007ly\r".toCharArray();
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
                            c18 = '2';
                            break;
                        }
                        case 1: {
                            c18 = 'd';
                            break;
                        }
                        case 2: {
                            c18 = '\u001e';
                            break;
                        }
                        case 3: {
                            c18 = '\u0016';
                            break;
                        }
                        default: {
                            c18 = '~';
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
        final char[] charArray10 = "\u007f\u0005wx3W\nkI6W\bnI?P\u000bkb".toCharArray();
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
                            c20 = '2';
                            break;
                        }
                        case 1: {
                            c20 = 'd';
                            break;
                        }
                        case 2: {
                            c20 = '\u001e';
                            break;
                        }
                        case 3: {
                            c20 = '\u0016';
                            break;
                        }
                        default: {
                            c20 = '~';
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
        final char[] charArray11 = "\u007f\u0005wx3W\nkI8[\b{".toCharArray();
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
                            c22 = '2';
                            break;
                        }
                        case 1: {
                            c22 = 'd';
                            break;
                        }
                        case 2: {
                            c22 = '\u001e';
                            break;
                        }
                        case 3: {
                            c22 = '\u0016';
                            break;
                        }
                        default: {
                            c22 = '~';
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
        final char[] charArray12 = "q\u0001pb\u001b@".toCharArray();
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
                            c24 = '2';
                            break;
                        }
                        case 1: {
                            c24 = 'd';
                            break;
                        }
                        case 2: {
                            c24 = '\u001e';
                            break;
                        }
                        case 3: {
                            c24 = '\u0016';
                            break;
                        }
                        default: {
                            c24 = '~';
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
        final char[] charArray13 = "\u007f\u0005wx3W\nkI8[\b{I;J\rj".toCharArray();
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
                            c26 = '2';
                            break;
                        }
                        case 1: {
                            c26 = 'd';
                            break;
                        }
                        case 2: {
                            c26 = '\u001e';
                            break;
                        }
                        case 3: {
                            c26 = '\u0016';
                            break;
                        }
                        default: {
                            c26 = '~';
                            break;
                        }
                    }
                    charArray13[length13] = (char) (c25 ^ c26);
                    ++n52;
                } while (n50 == 0);
            }
            if (n50 > n52) {
                continue;
            }
            break;
        }
        z2[n49] = new String(charArray13).intern();
        final int n53 = 13;
        final char[] charArray14 = "\u007f\u0005wx3W\nkI8[\b{I=S\u0014jc\fW0qU\u0012[\u0014|y\u001f@\u0000".toCharArray();
        int length14;
        int n55;
        final int n54 = n55 = (length14 = charArray14.length);
        int n56 = 0;
        while (true) {
            Label_1638:
            {
                if (n54 > 1) {
                    break Label_1638;
                }
                length14 = (n55 = n56);
                do {
                    final char c27 = charArray14[n55];
                    char c28 = '\0';
                    switch (n56 % 5) {
                        case 0: {
                            c28 = '2';
                            break;
                        }
                        case 1: {
                            c28 = 'd';
                            break;
                        }
                        case 2: {
                            c28 = '\u001e';
                            break;
                        }
                        case 3: {
                            c28 = '\u0016';
                            break;
                        }
                        default: {
                            c28 = '~';
                            break;
                        }
                    }
                    charArray14[length14] = (char) (c27 ^ c28);
                    ++n56;
                } while (n54 == 0);
            }
            if (n54 > n56) {
                continue;
            }
            break;
        }
        z2[n53] = new String(charArray14).intern();
        final int n57 = 14;
        final char[] charArray15 = "[\t\u007fq\u001bAK}y\u0010\\\u0001}b\b[\u0000{yO\u0004Jy\u007f\u0018".toCharArray();
        int length15;
        int n59;
        final int n58 = n59 = (length15 = charArray15.length);
        int n60 = 0;
        while (true) {
            Label_1758:
            {
                if (n58 > 1) {
                    break Label_1758;
                }
                length15 = (n59 = n60);
                do {
                    final char c29 = charArray15[n59];
                    char c30 = '\0';
                    switch (n60 % 5) {
                        case 0: {
                            c30 = '2';
                            break;
                        }
                        case 1: {
                            c30 = 'd';
                            break;
                        }
                        case 2: {
                            c30 = '\u001e';
                            break;
                        }
                        case 3: {
                            c30 = '\u0016';
                            break;
                        }
                        default: {
                            c30 = '~';
                            break;
                        }
                    }
                    charArray15[length15] = (char) (c29 ^ c30);
                    ++n60;
                } while (n58 == 0);
            }
            if (n58 > n60) {
                continue;
            }
            break;
        }
        z2[n57] = new String(charArray15).intern();
        final int n61 = 15;
        final char[] charArray16 = "f-JZ;".toCharArray();
        int length16;
        int n63;
        final int n62 = n63 = (length16 = charArray16.length);
        int n64 = 0;
        while (true) {
            Label_1878:
            {
                if (n62 > 1) {
                    break Label_1878;
                }
                length16 = (n63 = n64);
                do {
                    final char c31 = charArray16[n63];
                    char c32 = '\0';
                    switch (n64 % 5) {
                        case 0: {
                            c32 = '2';
                            break;
                        }
                        case 1: {
                            c32 = 'd';
                            break;
                        }
                        case 2: {
                            c32 = '\u001e';
                            break;
                        }
                        case 3: {
                            c32 = '\u0016';
                            break;
                        }
                        default: {
                            c32 = '~';
                            break;
                        }
                    }
                    charArray16[length16] = (char) (c31 ^ c32);
                    ++n64;
                } while (n62 == 0);
            }
            if (n62 > n64) {
                continue;
            }
            break;
        }
        z2[n61] = new String(charArray16).intern();
        final int n65 = 16;
        final char[] charArray17 = "\u007f\u0005wx)[\nzy\tm0wb\u0012W".toCharArray();
        int length17;
        int n67;
        final int n66 = n67 = (length17 = charArray17.length);
        int n68 = 0;
        while (true) {
            Label_1998:
            {
                if (n66 > 1) {
                    break Label_1998;
                }
                length17 = (n67 = n68);
                do {
                    final char c33 = charArray17[n67];
                    char c34 = '\0';
                    switch (n68 % 5) {
                        case 0: {
                            c34 = '2';
                            break;
                        }
                        case 1: {
                            c34 = 'd';
                            break;
                        }
                        case 2: {
                            c34 = '\u001e';
                            break;
                        }
                        case 3: {
                            c34 = '\u0016';
                            break;
                        }
                        default: {
                            c34 = '~';
                            break;
                        }
                    }
                    charArray17[length17] = (char) (c33 ^ c34);
                    ++n68;
                } while (n66 == 0);
            }
            if (n66 > n68) {
                continue;
            }
            break;
        }
        z2[n65] = new String(charArray17).intern();
        final int n69 = 17;
        final char[] charArray18 = "\u0012\"kz\u0012A\u0007ls\u001b\\Di\u007f\u0010V\u000bi6\rW\u0010H\u007f\r[\u0006rs^".toCharArray();
        int length18;
        int n71;
        final int n70 = n71 = (length18 = charArray18.length);
        int n72 = 0;
        while (true) {
            Label_2118:
            {
                if (n70 > 1) {
                    break Label_2118;
                }
                length18 = (n71 = n72);
                do {
                    final char c35 = charArray18[n71];
                    char c36 = '\0';
                    switch (n72 % 5) {
                        case 0: {
                            c36 = '2';
                            break;
                        }
                        case 1: {
                            c36 = 'd';
                            break;
                        }
                        case 2: {
                            c36 = '\u001e';
                            break;
                        }
                        case 3: {
                            c36 = '\u0016';
                            break;
                        }
                        default: {
                            c36 = '~';
                            break;
                        }
                    }
                    charArray18[length18] = (char) (c35 ^ c36);
                    ++n72;
                } while (n70 == 0);
            }
            if (n70 <= n72) {
                z2[n69] = new String(charArray18).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
