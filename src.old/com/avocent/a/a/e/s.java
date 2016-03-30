// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import java.io.IOException;
import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.nb;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import com.avocent.kvm.b.a.a;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import com.avocent.a.a.i;
import java.beans.PropertyChangeListener;
import javax.swing.JPanel;

public class s extends JPanel implements PropertyChangeListener, k {

    protected i a;
    protected c b;
    protected boolean c;
    protected boolean d;
    protected o e;
    private JRadioButton f;
    private JRadioButton g;
    private JSlider h;
    private JLabel i;
    private JLabel j;
    private JPanel k;
    private JPanel l;
    private JPanel m;
    private JPanel n;
    private JPanel o;
    private JSlider p;
    private JLabel q;
    private JTextField r;
    private JLabel s;
    private ButtonGroup t;
    private JLabel u;
    private JTextField v;
    private JLabel w;
    private static final String[] z;

    public s(final i a) {
        this.c = false;
        this.d = false;
        this.e = new o(this);
        this.a = a;
        this.g();
        this.a.a((PropertyChangeListener) this);
        this.a.a().a(this.e);
    }

    private void g() {
        this.t = new ButtonGroup();
        this.k = new JPanel();
        this.f = new JRadioButton();
        this.g = new JRadioButton();
        this.l = new JPanel();
        this.i = new JLabel();
        this.p = new JSlider();
        this.j = new JLabel();
        this.h = new JSlider();
        this.m = new JPanel();
        this.n = new JPanel();
        this.u = new JLabel();
        this.v = new JTextField();
        this.w = new JLabel();
        this.o = new JPanel();
        this.q = new JLabel();
        this.r = new JTextField();
        this.s = new JLabel();
        this.setMinimumSize(new Dimension(304, 185));
        this.setName(com.avocent.a.a.e.s.z[25]);
        this.setLayout(new GridBagLayout());
        this.k.setBorder(BorderFactory.createTitledBorder(com.avocent.a.a.e.s.z[29]));
        this.k.setLayout(new GridBagLayout());
        this.t.add(this.f);
        this.f.setText(com.avocent.a.a.e.s.z[19]);
        this.f.addActionListener(new m(this));
        this.k.add(this.f, new GridBagConstraints());
        this.f.getAccessibleContext().setAccessibleName(com.avocent.a.a.e.s.z[19]);
        this.t.add(this.g);
        this.g.setText(com.avocent.a.a.e.s.z[22]);
        this.g.addActionListener(new n(this));
        this.k.add(this.g, new GridBagConstraints());
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.anchor = 17;
        this.add(this.k, gridBagConstraints);
        this.l.setBorder(BorderFactory.createTitledBorder(com.avocent.a.a.e.s.z[21]));
        this.l.setLayout(new GridBagLayout());
        this.i.setText(com.avocent.a.a.e.s.z[28]);
        this.l.add(this.i, new GridBagConstraints());
        this.p.setMajorTickSpacing(10);
        this.p.setPaintLabels(true);
        this.p.setPaintTicks(true);
        this.p.setSnapToTicks(true);
        this.p.addMouseListener(new com.avocent.a.a.e.a(this));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridwidth = 0;
        this.l.add(this.p, gridBagConstraints2);
        this.j.setText(com.avocent.a.a.e.s.z[23]);
        this.l.add(this.j, new GridBagConstraints());
        this.h.setMajorTickSpacing(10);
        this.h.setPaintLabels(true);
        this.h.setPaintTicks(true);
        this.h.setSnapToTicks(true);
        this.h.addMouseListener(new b(this));
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        this.l.add(this.h, gridBagConstraints3);
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridwidth = 0;
        gridBagConstraints4.gridheight = -1;
        gridBagConstraints4.anchor = 17;
        this.m.setBorder(BorderFactory.createTitledBorder(com.avocent.a.a.e.s.z[20]));
        this.m.setMinimumSize(new Dimension(160, 100));
        this.m.setLayout(new GridBagLayout());
        this.n.setLayout(new GridBagLayout());
        this.u.setText(com.avocent.a.a.e.s.z[26]);
        this.n.add(this.u, new GridBagConstraints());
        this.v.setColumns(10);
        this.v.setEditable(false);
        this.v.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridwidth = -1;
        gridBagConstraints5.gridheight = 0;
        this.n.add(this.v, gridBagConstraints5);
        this.w.setText(com.avocent.a.a.e.s.z[27]);
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridwidth = -1;
        gridBagConstraints6.gridheight = 0;
        this.n.add(this.w, gridBagConstraints6);
        final GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridwidth = 0;
        gridBagConstraints7.gridheight = -1;
        gridBagConstraints7.anchor = 11;
        this.m.add(this.n, gridBagConstraints7);
        this.o.setLayout(new GridBagLayout());
        this.q.setText(com.avocent.a.a.e.s.z[24]);
        final GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridheight = 0;
        this.o.add(this.q, gridBagConstraints8);
        this.r.setColumns(10);
        this.r.setEditable(false);
        this.r.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridheight = 0;
        this.o.add(this.r, gridBagConstraints9);
        this.s.setText(com.avocent.a.a.e.s.z[18]);
        final GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.gridheight = 0;
        gridBagConstraints10.anchor = 17;
        this.o.add(this.s, gridBagConstraints10);
        final GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.gridwidth = 0;
        gridBagConstraints11.gridheight = -1;
        gridBagConstraints11.anchor = 23;
        this.m.add(this.o, gridBagConstraints11);
        final GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.gridwidth = 0;
        gridBagConstraints12.gridheight = 0;
        gridBagConstraints12.anchor = 17;
        this.add(this.m, gridBagConstraints12);
    }

    private void a(final ActionEvent actionEvent) {
        System.out.println(com.avocent.a.a.e.s.z[32]);
        this.d = true;
        this.b.n();
    }

    private void b(final ActionEvent actionEvent) {
        System.out.println(com.avocent.a.a.e.s.z[31]);
        this.d = true;
        this.b.n();
    }

    private void a(final MouseEvent mouseEvent) {
        System.out.println(com.avocent.a.a.e.s.z[17]);
        this.d = true;
        this.b.n();
    }

    private void b(final MouseEvent mouseEvent) {
        System.out.println(com.avocent.a.a.e.s.z[11]);
        this.d = true;
        this.b.n();
    }

    @Override
    public JPanel d() {
        return this;
    }

    @Override
    public String e() {
        return com.avocent.a.a.e.s.z[33];
    }

    public void h() {
        final int t = com.avocent.a.a.e.c.t;
        String s = "0";
        String s2 = "0";
        String s3 = "0";
        final Object a = this.a.a().a(com.avocent.a.a.e.s.z[1]);
        Label_0078:
        {
            if (a != null) {
                s = (String) a;
                if (t == 0) {
                    break Label_0078;
                }
                int c = com.avocent.kvm.b.d.a.c;
                com.avocent.kvm.b.d.a.c = ++c;
            }
            this.a.a().a(com.avocent.a.a.e.s.z[1], s);
        }
        final Object a2 = this.a.a().a(com.avocent.a.a.e.s.z[6]);
        Label_0130:
        {
            if (a2 != null) {
                s2 = (String) a2;
                if (t == 0) {
                    break Label_0130;
                }
            }
            this.a.a().a(com.avocent.a.a.e.s.z[6], s2);
        }
        final Object a3 = this.a.a().a(com.avocent.a.a.e.s.z[7]);
        Label_0184:
        {
            if (a3 != null) {
                s3 = (String) a3;
                if (t == 0) {
                    break Label_0184;
                }
            }
            this.a.a().a(com.avocent.a.a.e.s.z[7], s3);
        }
        Label_0214:
        {
            if (s.equals("1")) {
                this.f.setSelected(true);
                if (t == 0) {
                    break Label_0214;
                }
            }
            this.g.setSelected(true);
        }
        this.p.setValue(Integer.parseInt(s2) * 10);
        this.h.setValue(Integer.parseInt(s3) * 10);
    }

    @Override
    public void c() {
        if (this.f() && !this.d) {
            this.h();
        }
        this.i();
    }

    public void i() {
        if (this.b != null) {
            final nb o = this.b.o();
            if (o != null) {
                this.v.setText(o.a());
                this.r.setText(o.b());
                if (com.avocent.a.a.e.c.t == 0) {
                    return;
                }
            }
            this.v.setText(" ");
            this.r.setText(" ");
        }
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        final String propertyName = propertyChangeEvent.getPropertyName();
        if (!this.c && !this.d && (propertyName.equalsIgnoreCase(com.avocent.a.a.e.s.z[1]) || propertyName.equalsIgnoreCase(com.avocent.a.a.e.s.z[6]) || propertyName.equalsIgnoreCase(com.avocent.a.a.e.s.z[7]))) {
            this.c();
        }
    }

    @Override
    public void a() {
        System.out.println(com.avocent.a.a.e.s.z[13]);
        if (this.f()) {
            final Integer n = new Integer(6);
            this.c = true;
            this.d = false;
            int n2 = 0;
            if (this.f.isSelected()) {
                n2 = 1;
            }
            this.a.a().a(com.avocent.a.a.e.s.z[1], Integer.toString(n2));
            final int n3 = this.p.getValue() / 10;
            this.a.a().a(com.avocent.a.a.e.s.z[6], Integer.toString(n3));
            final int n4 = this.h.getValue() / 10;
            this.a.a().a(com.avocent.a.a.e.s.z[7], Integer.toString(n4));
            try {
                this.a.a().a(7, n, com.avocent.a.a.e.s.z[15] + Integer.toString(n2) + "," + com.avocent.a.a.e.s.z[16] + Integer.toString(n3) + "," + com.avocent.a.a.e.s.z[12] + Integer.toString(n4));
            } catch (IOException ex) {
                this.a.b().a(com.avocent.a.a.e.s.z[14] + ex.getMessage());
            }
            this.c = false;
            this.b.n();
        }
    }

    @Override
    public void b() {
        System.out.println(com.avocent.a.a.e.s.z[30]);
        this.d = false;
        this.h();
    }

    @Override
    public boolean f() {
        final int t = com.avocent.a.a.e.c.t;
        boolean b = false;
        System.out.println(com.avocent.a.a.e.s.z[10]);
        final Object a = this.a.a().a(com.avocent.a.a.e.s.z[1]);
        Label_0122:
        {
            if (a != null) {
                final int int1 = Integer.parseInt((String) a);
                final int selected = this.f.isSelected() ? 1 : 0;
                System.out.println(com.avocent.a.a.e.s.z[4] + int1 + com.avocent.a.a.e.s.z[0] + selected);
                if (int1 == selected) {
                    break Label_0122;
                }
                b = true;
                if (t == 0) {
                    break Label_0122;
                }
            }
            b = true;
        }
        final Object a2 = this.a.a().a(com.avocent.a.a.e.s.z[6]);
        Label_0221:
        {
            if (a2 != null) {
                final int int2 = Integer.parseInt((String) a2);
                final int n = this.p.getValue() / 10;
                System.out.println(com.avocent.a.a.e.s.z[9] + int2 + com.avocent.a.a.e.s.z[0] + n);
                if (int2 == n) {
                    break Label_0221;
                }
                b = true;
                if (t == 0) {
                    break Label_0221;
                }
            }
            b = true;
        }
        final Object a3 = this.a.a().a(com.avocent.a.a.e.s.z[7]);
        Label_0319:
        {
            if (a3 != null) {
                final int int3 = Integer.parseInt((String) a3);
                final int n2 = this.h.getValue() / 10;
                System.out.println(com.avocent.a.a.e.s.z[5] + int3 + com.avocent.a.a.e.s.z[0] + n2);
                if (int3 == n2) {
                    break Label_0319;
                }
                b = true;
                if (t == 0) {
                    break Label_0319;
                }
            }
            b = true;
        }
        System.out.println(com.avocent.a.a.e.s.z[8] + (b ? com.avocent.a.a.e.s.z[3] : com.avocent.a.a.e.s.z[2]));
        return b;
    }

    @Override
    public void a(final c b) {
        this.b = b;
    }

    static void a(final s s, final ActionEvent actionEvent) {
        s.b(actionEvent);
    }

    static void b(final s s, final ActionEvent actionEvent) {
        s.a(actionEvent);
    }

    static void a(final s s, final MouseEvent mouseEvent) {
        s.a(mouseEvent);
    }

    static void b(final s s, final MouseEvent mouseEvent) {
        s.b(mouseEvent);
    }

    static {
        final String[] z2 = new String[34];
        final int n = 0;
        final char[] charArray = "Cb7<J\fCz".toCharArray();
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
                            c2 = 'c';
                            break;
                        }
                        case 1: {
                            c2 = '-';
                            break;
                        }
                        case 2: {
                            c2 = 'G';
                            break;
                        }
                        case 3: {
                            c2 = 'H';
                            break;
                        }
                        default: {
                            c2 = '#';
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
        final char[] charArray2 = " B*8Q\u0006^4!L\r`(,F".toCharArray();
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
                            c4 = 'c';
                            break;
                        }
                        case 1: {
                            c4 = '-';
                            break;
                        }
                        case 2: {
                            c4 = 'G';
                            break;
                        }
                        case 3: {
                            c4 = 'H';
                            break;
                        }
                        default: {
                            c4 = '#';
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
        final char[] charArray3 = "\u0005L+;F".toCharArray();
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
                            c6 = 'c';
                            break;
                        }
                        case 1: {
                            c6 = '-';
                            break;
                        }
                        case 2: {
                            c6 = 'G';
                            break;
                        }
                        case 3: {
                            c6 = 'H';
                            break;
                        }
                        default: {
                            c6 = '#';
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
        final char[] charArray4 = "\u0017_2-".toCharArray();
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
                            c8 = 'c';
                            break;
                        }
                        case 1: {
                            c8 = '-';
                            break;
                        }
                        case 2: {
                            c8 = 'G';
                            break;
                        }
                        case 3: {
                            c8 = 'H';
                            break;
                        }
                        default: {
                            c8 = '#';
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
        final char[] charArray5 = " B*8Q\u0006^4!L\r`(,FC}5'S\u0006_>u".toCharArray();
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
                            c10 = 'c';
                            break;
                        }
                        case 1: {
                            c10 = '-';
                            break;
                        }
                        case 2: {
                            c10 = 'G';
                            break;
                        }
                        case 3: {
                            c10 = 'H';
                            break;
                        }
                        default: {
                            c10 = '#';
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
        final char[] charArray6 = "6{\u0013)A\u000fHg\u0018Q\f]\":Z^".toCharArray();
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
                            c12 = 'c';
                            break;
                        }
                        case 1: {
                            c12 = '-';
                            break;
                        }
                        case 2: {
                            c12 = 'G';
                            break;
                        }
                        case 3: {
                            c12 = 'H';
                            break;
                        }
                        default: {
                            c12 = '#';
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
        final char[] charArray7 = ":y&*O\u0006".toCharArray();
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
                            c14 = 'c';
                            break;
                        }
                        case 1: {
                            c14 = '-';
                            break;
                        }
                        case 2: {
                            c14 = 'G';
                            break;
                        }
                        case 3: {
                            c14 = 'H';
                            break;
                        }
                        default: {
                            c14 = '#';
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
        final char[] charArray8 = "6{\u0013)A\u000fH".toCharArray();
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
                            c16 = 'c';
                            break;
                        }
                        case 1: {
                            c16 = '-';
                            break;
                        }
                        case 2: {
                            c16 = 'G';
                            break;
                        }
                        case 3: {
                            c16 = 'H';
                            break;
                        }
                        default: {
                            c16 = '#';
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
        final char[] charArray9 = "\u000bL4\u000bK\u0002C -PC_\"<V\u0011C.&DC".toCharArray();
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
                            c18 = 'c';
                            break;
                        }
                        case 1: {
                            c18 = '-';
                            break;
                        }
                        case 2: {
                            c18 = 'G';
                            break;
                        }
                        case 3: {
                            c18 = 'H';
                            break;
                        }
                        default: {
                            c18 = '#';
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
        final char[] charArray10 = ":y&*O\u0006\r\u0017:L\u0013H51\u001e".toCharArray();
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
                            c20 = 'c';
                            break;
                        }
                        case 1: {
                            c20 = '-';
                            break;
                        }
                        case 2: {
                            c20 = 'G';
                            break;
                        }
                        case 3: {
                            c20 = 'H';
                            break;
                        }
                        default: {
                            c20 = '#';
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
        final char[] charArray11 = "\u000bL4\u000bK\u0002C -PCN&$O\u0006I".toCharArray();
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
                            c22 = 'c';
                            break;
                        }
                        case 1: {
                            c22 = '-';
                            break;
                        }
                        case 2: {
                            c22 = 'G';
                            break;
                        }
                        case 3: {
                            c22 = 'H';
                            break;
                        }
                        default: {
                            c22 = '#';
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
        final char[] charArray12 = "\u0000E5'N\nC&&@\u0006~+!G\u0006_\n'V\u0010H\u0015-O\u0006L4-G".toCharArray();
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
                            c24 = 'c';
                            break;
                        }
                        case 1: {
                            c24 = '-';
                            break;
                        }
                        case 2: {
                            c24 = 'G';
                            break;
                        }
                        case 3: {
                            c24 = 'H';
                            break;
                        }
                        default: {
                            c24 = '#';
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
        final char[] charArray13 = "6{\u0014-O\u0006N3'Q^".toCharArray();
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
                            c26 = 'c';
                            break;
                        }
                        case 1: {
                            c26 = '-';
                            break;
                        }
                        case 2: {
                            c26 = 'G';
                            break;
                        }
                        case 3: {
                            c26 = 'H';
                            break;
                        }
                        default: {
                            c26 = '#';
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
        final char[] charArray14 = "\u0002]7$Z3_\";P\u0006Ig+B\u000fA\",".toCharArray();
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
                            c28 = 'c';
                            break;
                        }
                        case 1: {
                            c28 = '-';
                            break;
                        }
                        case 2: {
                            c28 = 'G';
                            break;
                        }
                        case 3: {
                            c28 = 'H';
                            break;
                        }
                        default: {
                            c28 = '#';
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
        final char[] charArray15 = "Ch?+F\u0013Y.'MY\r".toCharArray();
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
                            c30 = 'c';
                            break;
                        }
                        case 1: {
                            c30 = '-';
                            break;
                        }
                        case 2: {
                            c30 = 'G';
                            break;
                        }
                        case 3: {
                            c30 = 'H';
                            break;
                        }
                        default: {
                            c30 = '#';
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
        final char[] charArray16 = "\u0000B*8Q\u0006^4!L\r`(,F^".toCharArray();
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
                            c32 = 'c';
                            break;
                        }
                        case 1: {
                            c32 = '-';
                            break;
                        }
                        case 2: {
                            c32 = 'G';
                            break;
                        }
                        case 3: {
                            c32 = 'H';
                            break;
                        }
                        default: {
                            c32 = '#';
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
        final char[] charArray17 = ":~\"$F\u0000Y(:\u001e".toCharArray();
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
                            c34 = 'c';
                            break;
                        }
                        case 1: {
                            c34 = '-';
                            break;
                        }
                        case 2: {
                            c34 = 'G';
                            break;
                        }
                        case 3: {
                            c34 = 'H';
                            break;
                        }
                        default: {
                            c34 = '#';
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
        final char[] charArray18 = "\u000fX*!M\u0002C$-p\u000fD#-Q.B2;F1H+-B\u0010H#".toCharArray();
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
                            c36 = 'c';
                            break;
                        }
                        case 1: {
                            c36 = '-';
                            break;
                        }
                        case 2: {
                            c36 = 'G';
                            break;
                        }
                        case 3: {
                            c36 = 'H';
                            break;
                        }
                        default: {
                            c36 = '#';
                            break;
                        }
                    }
                    charArray18[length18] = (char) (c35 ^ c36);
                    ++n72;
                } while (n70 == 0);
            }
            if (n70 > n72) {
                continue;
            }
            break;
        }
        z2[n69] = new String(charArray18).intern();
        final int n73 = 18;
        final char[] charArray19 = "C\r\f*\f\u0010H$".toCharArray();
        int length19;
        int n75;
        final int n74 = n75 = (length19 = charArray19.length);
        int n76 = 0;
        while (true) {
            Label_2238:
            {
                if (n74 > 1) {
                    break Label_2238;
                }
                length19 = (n75 = n76);
                do {
                    final char c37 = charArray19[n75];
                    char c38 = '\0';
                    switch (n76 % 5) {
                        case 0: {
                            c38 = 'c';
                            break;
                        }
                        case 1: {
                            c38 = '-';
                            break;
                        }
                        case 2: {
                            c38 = 'G';
                            break;
                        }
                        case 3: {
                            c38 = 'H';
                            break;
                        }
                        default: {
                            c38 = '#';
                            break;
                        }
                    }
                    charArray19[length19] = (char) (c37 ^ c38);
                    ++n76;
                } while (n74 == 0);
            }
            if (n74 > n76) {
                continue;
            }
            break;
        }
        z2[n73] = new String(charArray19).intern();
        final int n77 = 19;
        final char[] charArray20 = "/B0hr\u0016L+!W\u001a\ro|\u0011S\u0004".toCharArray();
        int length20;
        int n79;
        final int n78 = n79 = (length20 = charArray20.length);
        int n80 = 0;
        while (true) {
            Label_2358:
            {
                if (n78 > 1) {
                    break Label_2358;
                }
                length20 = (n79 = n80);
                do {
                    final char c39 = charArray20[n79];
                    char c40 = '\0';
                    switch (n80 % 5) {
                        case 0: {
                            c40 = 'c';
                            break;
                        }
                        case 1: {
                            c40 = '-';
                            break;
                        }
                        case 2: {
                            c40 = 'G';
                            break;
                        }
                        case 3: {
                            c40 = 'H';
                            break;
                        }
                        default: {
                            c40 = '#';
                            break;
                        }
                    }
                    charArray20[length20] = (char) (c39 ^ c40);
                    ++n80;
                } while (n78 == 0);
            }
            if (n78 > n80) {
                continue;
            }
            break;
        }
        z2[n77] = new String(charArray20).intern();
        final int n81 = 20;
        final char[] charArray21 = "-H3?L\u0011Fg\u001bW\u0002Y.;W\nN4".toCharArray();
        int length21;
        int n83;
        final int n82 = n83 = (length21 = charArray21.length);
        int n84 = 0;
        while (true) {
            Label_2478:
            {
                if (n82 > 1) {
                    break Label_2478;
                }
                length21 = (n83 = n84);
                do {
                    final char c41 = charArray21[n83];
                    char c42 = '\0';
                    switch (n84 % 5) {
                        case 0: {
                            c42 = 'c';
                            break;
                        }
                        case 1: {
                            c42 = '-';
                            break;
                        }
                        case 2: {
                            c42 = 'G';
                            break;
                        }
                        case 3: {
                            c42 = 'H';
                            break;
                        }
                        default: {
                            c42 = '#';
                            break;
                        }
                    }
                    charArray21[length21] = (char) (c41 ^ c42);
                    ++n84;
                } while (n82 == 0);
            }
            if (n82 > n84) {
                continue;
            }
            break;
        }
        z2[n81] = new String(charArray21).intern();
        final int n85 = 21;
        final char[] charArray22 = "5D#-LC~\"<W\nC ;".toCharArray();
        int length22;
        int n87;
        final int n86 = n87 = (length22 = charArray22.length);
        int n88 = 0;
        while (true) {
            Label_2598:
            {
                if (n86 > 1) {
                    break Label_2598;
                }
                length22 = (n87 = n88);
                do {
                    final char c43 = charArray22[n87];
                    char c44 = '\0';
                    switch (n88 % 5) {
                        case 0: {
                            c44 = 'c';
                            break;
                        }
                        case 1: {
                            c44 = '-';
                            break;
                        }
                        case 2: {
                            c44 = 'G';
                            break;
                        }
                        case 3: {
                            c44 = 'H';
                            break;
                        }
                        default: {
                            c44 = '#';
                            break;
                        }
                    }
                    charArray22[length22] = (char) (c43 ^ c44);
                    ++n88;
                } while (n86 == 0);
            }
            if (n86 > n88) {
                continue;
            }
            break;
        }
        z2[n85] = new String(charArray22).intern();
        final int n89 = 22;
        final char[] charArray23 = "+D  \u00032X&$J\u0017Tg`\u0017W\u0019n".toCharArray();
        int length23;
        int n91;
        final int n90 = n91 = (length23 = charArray23.length);
        int n92 = 0;
        while (true) {
            Label_2718:
            {
                if (n90 > 1) {
                    break Label_2718;
                }
                length23 = (n91 = n92);
                do {
                    final char c45 = charArray23[n91];
                    char c46 = '\0';
                    switch (n92 % 5) {
                        case 0: {
                            c46 = 'c';
                            break;
                        }
                        case 1: {
                            c46 = '-';
                            break;
                        }
                        case 2: {
                            c46 = 'G';
                            break;
                        }
                        case 3: {
                            c46 = 'H';
                            break;
                        }
                        default: {
                            c46 = '#';
                            break;
                        }
                    }
                    charArray23[length23] = (char) (c45 ^ c46);
                    ++n92;
                } while (n90 == 0);
            }
            if (n90 > n92) {
                continue;
            }
            break;
        }
        z2[n89] = new String(charArray23).intern();
        final int n93 = 23;
        final char[] charArray24 = " E5'N\nC&&@\u0006".toCharArray();
        int length24;
        int n95;
        final int n94 = n95 = (length24 = charArray24.length);
        int n96 = 0;
        while (true) {
            Label_2838:
            {
                if (n94 > 1) {
                    break Label_2838;
                }
                length24 = (n95 = n96);
                do {
                    final char c47 = charArray24[n95];
                    char c48 = '\0';
                    switch (n96 % 5) {
                        case 0: {
                            c48 = 'c';
                            break;
                        }
                        case 1: {
                            c48 = '-';
                            break;
                        }
                        case 2: {
                            c48 = 'G';
                            break;
                        }
                        case 3: {
                            c48 = 'H';
                            break;
                        }
                        default: {
                            c48 = '#';
                            break;
                        }
                    }
                    charArray24[length24] = (char) (c47 ^ c48);
                    ++n96;
                } while (n94 == 0);
            }
            if (n94 > n96) {
                continue;
            }
            break;
        }
        z2[n93] = new String(charArray24).intern();
        final int n97 = 24;
        final char[] charArray25 = "!L),T\nI3 \u0019C\rgh\u0003".toCharArray();
        int length25;
        int n99;
        final int n98 = n99 = (length25 = charArray25.length);
        int n100 = 0;
        while (true) {
            Label_2958:
            {
                if (n98 > 1) {
                    break Label_2958;
                }
                length25 = (n99 = n100);
                do {
                    final char c49 = charArray25[n99];
                    char c50 = '\0';
                    switch (n100 % 5) {
                        case 0: {
                            c50 = 'c';
                            break;
                        }
                        case 1: {
                            c50 = '-';
                            break;
                        }
                        case 2: {
                            c50 = 'G';
                            break;
                        }
                        case 3: {
                            c50 = 'H';
                            break;
                        }
                        default: {
                            c50 = '#';
                            break;
                        }
                    }
                    charArray25[length25] = (char) (c49 ^ c50);
                    ++n100;
                } while (n98 == 0);
            }
            if (n98 > n100) {
                continue;
            }
            break;
        }
        z2[n97] = new String(charArray25).intern();
        final int n101 = 25;
        final char[] charArray26 = "5D#-L2X&$J\u0017T\u0017)M\u0006A".toCharArray();
        int length26;
        int n103;
        final int n102 = n103 = (length26 = charArray26.length);
        int n104 = 0;
        while (true) {
            Label_3078:
            {
                if (n102 > 1) {
                    break Label_3078;
                }
                length26 = (n103 = n104);
                do {
                    final char c51 = charArray26[n103];
                    char c52 = '\0';
                    switch (n104 % 5) {
                        case 0: {
                            c52 = 'c';
                            break;
                        }
                        case 1: {
                            c52 = '-';
                            break;
                        }
                        case 2: {
                            c52 = 'G';
                            break;
                        }
                        case 3: {
                            c52 = 'H';
                            break;
                        }
                        default: {
                            c52 = '#';
                            break;
                        }
                    }
                    charArray26[length26] = (char) (c51 ^ c52);
                    ++n104;
                } while (n102 == 0);
            }
            if (n102 > n104) {
                continue;
            }
            break;
        }
        z2[n101] = new String(charArray26).intern();
        final int n105 = 26;
        final char[] charArray27 = "%_&%FC\u007f&<FY\rgh".toCharArray();
        int length27;
        int n107;
        final int n106 = n107 = (length27 = charArray27.length);
        int n108 = 0;
        while (true) {
            Label_3198:
            {
                if (n106 > 1) {
                    break Label_3198;
                }
                length27 = (n107 = n108);
                do {
                    final char c53 = charArray27[n107];
                    char c54 = '\0';
                    switch (n108 % 5) {
                        case 0: {
                            c54 = 'c';
                            break;
                        }
                        case 1: {
                            c54 = '-';
                            break;
                        }
                        case 2: {
                            c54 = 'G';
                            break;
                        }
                        case 3: {
                            c54 = 'H';
                            break;
                        }
                        default: {
                            c54 = '#';
                            break;
                        }
                    }
                    charArray27[length27] = (char) (c53 ^ c54);
                    ++n108;
                } while (n106 == 0);
            }
            if (n106 > n108) {
                continue;
            }
            break;
        }
        z2[n105] = new String(charArray27).intern();
        final int n109 = 27;
        final char[] charArray28 = "C\r\u0001:B\u000eH4gP\u0006N".toCharArray();
        int length28;
        int n111;
        final int n110 = n111 = (length28 = charArray28.length);
        int n112 = 0;
        while (true) {
            Label_3318:
            {
                if (n110 > 1) {
                    break Label_3318;
                }
                length28 = (n111 = n112);
                do {
                    final char c55 = charArray28[n111];
                    char c56 = '\0';
                    switch (n112 % 5) {
                        case 0: {
                            c56 = 'c';
                            break;
                        }
                        case 1: {
                            c56 = '-';
                            break;
                        }
                        case 2: {
                            c56 = 'G';
                            break;
                        }
                        case 3: {
                            c56 = 'H';
                            break;
                        }
                        default: {
                            c56 = '#';
                            break;
                        }
                    }
                    charArray28[length28] = (char) (c55 ^ c56);
                    ++n112;
                } while (n110 == 0);
            }
            if (n110 > n112) {
                continue;
            }
            break;
        }
        z2[n109] = new String(charArray28).intern();
        final int n113 = 28;
        final char[] charArray29 = "/X*!M\u0002C$-".toCharArray();
        int length29;
        int n115;
        final int n114 = n115 = (length29 = charArray29.length);
        int n116 = 0;
        while (true) {
            Label_3438:
            {
                if (n114 > 1) {
                    break Label_3438;
                }
                length29 = (n115 = n116);
                do {
                    final char c57 = charArray29[n115];
                    char c58 = '\0';
                    switch (n116 % 5) {
                        case 0: {
                            c58 = 'c';
                            break;
                        }
                        case 1: {
                            c58 = '-';
                            break;
                        }
                        case 2: {
                            c58 = 'G';
                            break;
                        }
                        case 3: {
                            c58 = 'H';
                            break;
                        }
                        default: {
                            c58 = '#';
                            break;
                        }
                    }
                    charArray29[length29] = (char) (c57 ^ c58);
                    ++n116;
                } while (n114 == 0);
            }
            if (n114 > n116) {
                continue;
            }
            break;
        }
        z2[n113] = new String(charArray29).intern();
        final int n117 = 29;
        final char[] charArray30 = "5D#-LCn(%S\u0011H4;J\fCg\u0005L\u0007H".toCharArray();
        int length30;
        int n119;
        final int n118 = n119 = (length30 = charArray30.length);
        int n120 = 0;
        while (true) {
            Label_3558:
            {
                if (n118 > 1) {
                    break Label_3558;
                }
                length30 = (n119 = n120);
                do {
                    final char c59 = charArray30[n119];
                    char c60 = '\0';
                    switch (n120 % 5) {
                        case 0: {
                            c60 = 'c';
                            break;
                        }
                        case 1: {
                            c60 = '-';
                            break;
                        }
                        case 2: {
                            c60 = 'G';
                            break;
                        }
                        case 3: {
                            c60 = 'H';
                            break;
                        }
                        default: {
                            c60 = '#';
                            break;
                        }
                    }
                    charArray30[length30] = (char) (c59 ^ c60);
                    ++n120;
                } while (n118 == 0);
            }
            if (n118 > n120) {
                continue;
            }
            break;
        }
        z2[n117] = new String(charArray30).intern();
        final int n121 = 30;
        final char[] charArray31 = "\u0000L)+F\u000f}5-P\u0010H#h@\u0002A+-G".toCharArray();
        int length31;
        int n123;
        final int n122 = n123 = (length31 = charArray31.length);
        int n124 = 0;
        while (true) {
            Label_3678:
            {
                if (n122 > 1) {
                    break Label_3678;
                }
                length31 = (n123 = n124);
                do {
                    final char c61 = charArray31[n123];
                    char c62 = '\0';
                    switch (n124 % 5) {
                        case 0: {
                            c62 = 'c';
                            break;
                        }
                        case 1: {
                            c62 = '-';
                            break;
                        }
                        case 2: {
                            c62 = 'G';
                            break;
                        }
                        case 3: {
                            c62 = 'H';
                            break;
                        }
                        default: {
                            c62 = '#';
                            break;
                        }
                    }
                    charArray31[length31] = (char) (c61 ^ c62);
                    ++n124;
                } while (n122 == 0);
            }
            if (n122 > n124) {
                continue;
            }
            break;
        }
        z2[n121] = new String(charArray31).intern();
        final int n125 = 31;
        final char[] charArray32 = "\u000eB#-\u0017Q\u001d\u0006+W\nB)\u0018F\u0011K(:N\u0006I".toCharArray();
        int length32;
        int n127;
        final int n126 = n127 = (length32 = charArray32.length);
        int n128 = 0;
        while (true) {
            Label_3798:
            {
                if (n126 > 1) {
                    break Label_3798;
                }
                length32 = (n127 = n128);
                do {
                    final char c63 = charArray32[n127];
                    char c64 = '\0';
                    switch (n128 % 5) {
                        case 0: {
                            c64 = 'c';
                            break;
                        }
                        case 1: {
                            c64 = '-';
                            break;
                        }
                        case 2: {
                            c64 = 'G';
                            break;
                        }
                        case 3: {
                            c64 = 'H';
                            break;
                        }
                        default: {
                            c64 = '#';
                            break;
                        }
                    }
                    charArray32[length32] = (char) (c63 ^ c64);
                    ++n128;
                } while (n126 == 0);
            }
            if (n126 > n128) {
                continue;
            }
            break;
        }
        z2[n125] = new String(charArray32).intern();
        final int n129 = 32;
        final char[] charArray33 = "\u000eB#-\u0017W\u0019\u0006+W\nB)\u0018F\u0011K(:N\u0006I".toCharArray();
        int length33;
        int n131;
        final int n130 = n131 = (length33 = charArray33.length);
        int n132 = 0;
        while (true) {
            Label_3918:
            {
                if (n130 > 1) {
                    break Label_3918;
                }
                length33 = (n131 = n132);
                do {
                    final char c65 = charArray33[n131];
                    char c66 = '\0';
                    switch (n132 % 5) {
                        case 0: {
                            c66 = 'c';
                            break;
                        }
                        case 1: {
                            c66 = '-';
                            break;
                        }
                        case 2: {
                            c66 = 'G';
                            break;
                        }
                        case 3: {
                            c66 = 'H';
                            break;
                        }
                        default: {
                            c66 = '#';
                            break;
                        }
                    }
                    charArray33[length33] = (char) (c65 ^ c66);
                    ++n132;
                } while (n130 == 0);
            }
            if (n130 > n132) {
                continue;
            }
            break;
        }
        z2[n129] = new String(charArray33).intern();
        final int n133 = 33;
        final char[] charArray34 = "5D#-LC|2)O\nY>".toCharArray();
        int length34;
        int n135;
        final int n134 = n135 = (length34 = charArray34.length);
        int n136 = 0;
        while (true) {
            Label_4038:
            {
                if (n134 > 1) {
                    break Label_4038;
                }
                length34 = (n135 = n136);
                do {
                    final char c67 = charArray34[n135];
                    char c68 = '\0';
                    switch (n136 % 5) {
                        case 0: {
                            c68 = 'c';
                            break;
                        }
                        case 1: {
                            c68 = '-';
                            break;
                        }
                        case 2: {
                            c68 = 'G';
                            break;
                        }
                        case 3: {
                            c68 = 'H';
                            break;
                        }
                        default: {
                            c68 = '#';
                            break;
                        }
                    }
                    charArray34[length34] = (char) (c67 ^ c68);
                    ++n136;
                } while (n134 == 0);
            }
            if (n134 <= n136) {
                z2[n133] = new String(charArray34).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
