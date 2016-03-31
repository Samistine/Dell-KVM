// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.b;

import java.awt.Insets;
import java.awt.Rectangle;
import com.avocent.kvm.b.d.a;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.SwingUtilities;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import com.avocent.a.d;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import com.avocent.a.a.i;
import javax.swing.JFrame;

public class e extends JFrame {

    protected i a;
    private JScrollPane scroll_pane;//Originally b
    private JPanel jpanel;//Originally c
    ScrollableJPanel_f scollableJPanel;//Originally d
    public static int e;
    private static final String[] z;

    public e(final i a) {
        this.a = a;
        this.scollableJPanel = new ScrollableJPanel_f(this);
        this.a();
        final String s = com.avocent.a.a.b.e.z[1];
        this.a.d();
        this.setTitle(a.b(s, com.avocent.a.d.b(com.avocent.a.a.b.e.z[2])).toString());
        try {
            this.setIconImage(new ImageIcon(i.class.getResource(com.avocent.a.a.b.e.z[0])).getImage());
        } catch (Exception ex) {
        }
        this.scroll_pane.setViewportView(this.scollableJPanel);
        this.scroll_pane.getViewport().setBackground(Color.black);
        this.b().add(a.o().c());
    }

    private void a() {
        this.jpanel = new JPanel();
        this.scroll_pane = new JScrollPane();
        this.jpanel.setLayout(new GridBagLayout());
        this.jpanel.setBackground(new Color(0, 0, 0));
        this.setDefaultCloseOperation(3);
        this.setTitle(com.avocent.a.a.b.e.z[5]);
        this.getContentPane().add(this.scroll_pane, com.avocent.a.a.b.e.z[6]);
        this.pack();
    }

    public JPanel b() {
        return this.scollableJPanel;
    }

    @Override
    public void pack() {
        final int e = com.avocent.a.a.b.e.e;
        this.a.b().a(com.avocent.a.a.b.e.z[10]);
        if (!SwingUtilities.isEventDispatchThread()) {
            System.out.println(com.avocent.a.a.b.e.z[11]);
        }
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration());
        final Dimension dimension = new Dimension(screenSize.width - screenInsets.left - screenInsets.right, screenSize.height - screenInsets.top - screenInsets.bottom);
        this.scollableJPanel.invalidate();
        super.pack();
        Dimension preferredSize = this.getPreferredSize();
        Label_0250:
        {
            if (preferredSize.width > dimension.width || preferredSize.height > dimension.height) {
                this.setSize(new Dimension(Math.min(preferredSize.width, dimension.width), Math.min(preferredSize.height, dimension.height)));
                this.scollableJPanel.invalidate();
                this.scroll_pane.getViewport().validate();
                if (e == 0) {
                    break Label_0250;
                }
                int c = com.avocent.kvm.b.d.a.c;
                com.avocent.kvm.b.d.a.c = ++c;
            }
            if (preferredSize.getWidth() < 600.0 || preferredSize.getHeight() < 400.0) {
                preferredSize = new Dimension(600, 400);
            }
            this.setSize(preferredSize);
        }
        this.setMaximizedBounds(new Rectangle(dimension));
        if (this.a.b().a()) {
            this.a(this.a.b(), com.avocent.a.a.b.e.z[9], this);
            this.a(this.a.b(), com.avocent.a.a.b.e.z[7], this.scroll_pane);
            this.a(this.a.b(), com.avocent.a.a.b.e.z[13], this.scroll_pane.getViewport());
            this.a(this.a.b(), com.avocent.a.a.b.e.z[8], this.scollableJPanel);
            if (this.scollableJPanel.getComponentCount() > 0) {
                this.a(this.a.b(), com.avocent.a.a.b.e.z[12], this.scollableJPanel.getComponent(0));
            }
        }
    }

    void a(final com.avocent.kvm.b.f.e e, final String s, final Component component) {
        int n = /*e.*/this.e;
        Dimension preferredSize = component.getPreferredSize();
        e.a(" " + s + /*e.*/z[4] + preferredSize.width + /*e.*/this.z[3] + preferredSize.height);
        if (com.avocent.kvm.b.d.a.c != 0) {
            /*e.*/this.e = ++n;
        }
    }

    @Override
    public void setVisible(final boolean visible) {
        super.setVisible(visible);
    }

    static {
        final String[] z2 = new String[14];
        final int n = 0;
        final char[] charArray = "e[q\u0015R\u007f\u0019s\u001dYbSs\u0006AeRu\u001d\u0006:\u0018w\u001bQ".toCharArray();
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
                            c2 = '\f';
                            break;
                        }
                        case 1: {
                            c2 = '6';
                            break;
                        }
                        case 2: {
                            c2 = '\u0010';
                            break;
                        }
                        case 3: {
                            c2 = 'r';
                            break;
                        }
                        default: {
                            c2 = '7';
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
        final char[] charArray2 = "X\u007fD>r".toCharArray();
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
                            c4 = '\f';
                            break;
                        }
                        case 1: {
                            c4 = '6';
                            break;
                        }
                        case 2: {
                            c4 = '\u0010';
                            break;
                        }
                        case 3: {
                            c4 = 'r';
                            break;
                        }
                        default: {
                            c4 = '7';
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
        final char[] charArray3 = "AWy\u001c`eXt\u001d@Sby\u0006[i".toCharArray();
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
                            c6 = '\f';
                            break;
                        }
                        case 1: {
                            c6 = '6';
                            break;
                        }
                        case 2: {
                            c6 = '\u0010';
                            break;
                        }
                        case 3: {
                            c6 = 'r';
                            break;
                        }
                        default: {
                            c6 = '7';
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
        final char[] charArray4 = " \u0016".toCharArray();
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
                            c8 = '\f';
                            break;
                        }
                        case 1: {
                            c8 = '6';
                            break;
                        }
                        case 2: {
                            c8 = '\u0010';
                            break;
                        }
                        case 3: {
                            c8 = 'r';
                            break;
                        }
                        default: {
                            c8 = '7';
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
        final char[] charArray5 = "6\u0016".toCharArray();
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
                            c10 = '\f';
                            break;
                        }
                        case 1: {
                            c10 = '6';
                            break;
                        }
                        case 2: {
                            c10 = '\u0010';
                            break;
                        }
                        case 3: {
                            c10 = 'r';
                            break;
                        }
                        default: {
                            c10 = '7';
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
        final char[] charArray6 = "Z_t\u0017X,`y\u0017@iD".toCharArray();
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
                            c12 = '\f';
                            break;
                        }
                        case 1: {
                            c12 = '6';
                            break;
                        }
                        case 2: {
                            c12 = '\u0010';
                            break;
                        }
                        case 3: {
                            c12 = 'r';
                            break;
                        }
                        default: {
                            c12 = '7';
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
        final char[] charArray7 = "OS~\u0006R~".toCharArray();
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
                            c14 = '\f';
                            break;
                        }
                        case 1: {
                            c14 = '6';
                            break;
                        }
                        case 2: {
                            c14 = '\u0010';
                            break;
                        }
                        case 3: {
                            c14 = 'r';
                            break;
                        }
                        default: {
                            c14 = '7';
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
        final char[] charArray8 = "_Ub\u001d[`\u0016@\u0013Yi\u0016".toCharArray();
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
                            c16 = '\f';
                            break;
                        }
                        case 1: {
                            c16 = '6';
                            break;
                        }
                        case 2: {
                            c16 = '\u0010';
                            break;
                        }
                        case 3: {
                            c16 = 'r';
                            break;
                        }
                        default: {
                            c16 = '7';
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
        final char[] charArray9 = "OY~\u0006VeXu\u0000\u0017,\u0016".toCharArray();
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
                            c18 = '\f';
                            break;
                        }
                        case 1: {
                            c18 = '6';
                            break;
                        }
                        case 2: {
                            c18 = '\u0010';
                            break;
                        }
                        case 3: {
                            c18 = 'r';
                            break;
                        }
                        default: {
                            c18 = '7';
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
        final char[] charArray10 = "JDq\u001fR,\u00160R\u0017,".toCharArray();
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
                            c20 = '\f';
                            break;
                        }
                        case 1: {
                            c20 = '6';
                            break;
                        }
                        case 2: {
                            c20 = '\u0010';
                            break;
                        }
                        case 3: {
                            c20 = 'r';
                            break;
                        }
                        default: {
                            c20 = '7';
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
        final char[] charArray11 = "G`]Rt`_u\u001cC6\u0016s\u0013[`\u0016d\u001d\u0017aWy\u001c\u0017{_~\u0016X{\u0016`\u0013Tg\u0018".toCharArray();
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
                            c22 = '\f';
                            break;
                        }
                        case 1: {
                            c22 = '6';
                            break;
                        }
                        case 2: {
                            c22 = '\u0010';
                            break;
                        }
                        case 3: {
                            c22 = 'r';
                            break;
                        }
                        default: {
                            c22 = '7';
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
        final char[] charArray12 = ",uq\u001e[,B\u007fREiEy\bR,Pb\u001dZ,Ye\u0006DeRuRRzS~\u0006\u0017x^b\u0017Vh\u0018".toCharArray();
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
                            c24 = '\f';
                            break;
                        }
                        case 1: {
                            c24 = '6';
                            break;
                        }
                        case 2: {
                            c24 = '\u0010';
                            break;
                        }
                        case 3: {
                            c24 = 'r';
                            break;
                        }
                        default: {
                            c24 = '7';
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
        final char[] charArray13 = "Z_t\u0017X,Fq\u001cR`\u0016".toCharArray();
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
                            c26 = '\f';
                            break;
                        }
                        case 1: {
                            c26 = '6';
                            break;
                        }
                        case 2: {
                            c26 = '\u0010';
                            break;
                        }
                        case 3: {
                            c26 = 'r';
                            break;
                        }
                        default: {
                            c26 = '7';
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
        final char[] charArray14 = "Z_u\u0005GcDdR\u0017,\u0016".toCharArray();
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
                            c28 = '\f';
                            break;
                        }
                        case 1: {
                            c28 = '6';
                            break;
                        }
                        case 2: {
                            c28 = '\u0010';
                            break;
                        }
                        case 3: {
                            c28 = 'r';
                            break;
                        }
                        default: {
                            c28 = '7';
                            break;
                        }
                    }
                    charArray14[length14] = (char) (c27 ^ c28);
                    ++n56;
                } while (n54 == 0);
            }
            if (n54 <= n56) {
                z2[n53] = new String(charArray14).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
