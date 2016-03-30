// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import java.io.IOException;
import com.avocent.kvm.b.u;
import com.avocent.a.c.e;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.event.ItemListener;
import javax.swing.ComboBoxModel;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import com.avocent.kvm.b.e.a;
import javax.swing.JPanel;

public class r extends JPanel implements k {

    protected a a;
    protected c b;
    protected boolean c;
    protected boolean d;
    protected j e;
    protected DefaultComboBoxModel f;
    protected HashMap g;
    private JRadioButton h;
    private JRadioButton i;
    private JPanel j;
    private JComboBox k;
    private JLabel l;
    private JRadioButton m;
    private static final String[] z;

    public r(final a a) {
        this.c = false;
        this.d = false;
        this.e = new j(this);
        this.f = new DefaultComboBoxModel();
        this.g = new HashMap();
        this.a = a;
        this.g();
        this.a.a().a(this.e);
        final ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.i);
        buttonGroup.add(this.h);
        buttonGroup.add(this.m);
        this.i();
        this.k.setModel(this.f);
        this.k.addItemListener(new f(this));
    }

    private void g() {
        this.l = new JLabel();
        this.k = new JComboBox();
        this.j = new JPanel();
        this.m = new JRadioButton();
        this.i = new JRadioButton();
        this.h = new JRadioButton();
        this.setLayout(new GridBagLayout());
        this.l.setText(this.a.b(r.z[6]));
        new GridBagConstraints().insets = new Insets(5, 5, 5, 5);
        this.k.setModel(new DefaultComboBoxModel<String>(new String[]{r.z[1], r.z[5], r.z[3], r.z[7]}));
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = 17;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(5, 0, 5, 5);
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridwidth = 0;
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.anchor = 11;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        this.j.setLayout(new GridBagLayout());
        this.j.setBorder(BorderFactory.createTitledBorder(this.a.b(r.z[4])));
        this.m.setText(this.a.b(r.z[2]));
        this.m.addActionListener(new g(this));
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.insets = new Insets(0, 10, 5, 10);
        this.j.add(this.m, gridBagConstraints3);
        this.i.setText(this.a.b(r.z[8]));
        this.i.addActionListener(new h(this));
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridwidth = 0;
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.insets = new Insets(5, 10, 5, 10);
        this.j.add(this.i, gridBagConstraints4);
        this.h.setText(this.a.b(r.z[0]));
        this.h.addActionListener(new i(this));
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridwidth = 0;
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.anchor = 11;
        gridBagConstraints5.weightx = 1.0;
        gridBagConstraints5.weighty = 1.0;
        gridBagConstraints5.insets = new Insets(0, 10, 5, 10);
        this.j.add(this.h, gridBagConstraints5);
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridwidth = 0;
        gridBagConstraints6.fill = 2;
        gridBagConstraints6.anchor = 11;
        gridBagConstraints6.weightx = 1.0;
        gridBagConstraints6.weighty = 1.0;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        this.add(this.j, gridBagConstraints6);
    }

    private void a(final ActionEvent actionEvent) {
        this.d = true;
        this.b.n();
    }

    private void b(final ActionEvent actionEvent) {
        this.d = true;
        this.b.n();
    }

    private void c(final ActionEvent actionEvent) {
        this.d = true;
        this.b.n();
    }

    public void h() {
        final u a = this.a.a();
        final Object a2 = a.a(r.z[10]);
        if (a2 != null && a2 instanceof Integer) {
            this.f.setSelectedItem(com.avocent.a.c.e.a((int) a2));
        }
        this.a(a.a(r.z[11], com.avocent.kvm.c.a.a));
    }

    protected void i() {
        int t = com.avocent.a.a.e.c.t;
        this.a(com.avocent.a.c.e.a(72), 72);
        this.a(com.avocent.a.c.e.a(58), 58);
        this.a(com.avocent.a.c.e.a(59), 59);
        this.a(com.avocent.a.c.e.a(60), 60);
        this.a(com.avocent.a.c.e.a(61), 61);
        this.a(com.avocent.a.c.e.a(62), 62);
        this.a(com.avocent.a.c.e.a(63), 63);
        this.a(com.avocent.a.c.e.a(64), 64);
        this.a(com.avocent.a.c.e.a(65), 65);
        this.a(com.avocent.a.c.e.a(66), 66);
        this.a(com.avocent.a.c.e.a(67), 67);
        this.a(com.avocent.a.c.e.a(68), 68);
        this.a(com.avocent.a.c.e.a(69), 69);
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.a.a.e.c.t = ++t;
        }
    }

    protected void a(final String s, final int n) {
        this.g.put(s, new Integer(n));
        this.f.addElement(s);
    }

    void a(final Integer n) {
        final int t = com.avocent.a.a.e.c.t;
        Label_0078:
        {
            if (n.equals(com.avocent.kvm.c.a.a)) {
                this.i.setSelected(true);
                if (t == 0) {
                    break Label_0078;
                }
            }
            if (n.equals(com.avocent.kvm.c.a.c)) {
                this.h.setSelected(true);
                if (t == 0) {
                    break Label_0078;
                }
            }
            if (n.equals(com.avocent.kvm.c.a.b)) {
                this.m.setSelected(true);
                if (t == 0) {
                    break Label_0078;
                }
            }
            this.i.setSelected(true);
        }
        this.a(true);
        this.b.n();
    }

    @Override
    public String e() {
        return this.a.b(r.z[9]);
    }

    @Override
    public JPanel d() {
        return this;
    }

    @Override
    public void b() {
        this.d = false;
        this.h();
    }

    @Override
    public void a() {
        if (this.f()) {
            Integer n = com.avocent.kvm.c.a.a;
            Label_0045:
            {
                if (this.h.isSelected()) {
                    n = com.avocent.kvm.c.a.c;
                    if (com.avocent.a.a.e.c.t == 0) {
                        break Label_0045;
                    }
                }
                if (this.m.isSelected()) {
                    n = com.avocent.kvm.c.a.b;
                }
            }
            this.c = true;
            try {
                this.a(false);
                this.b.a(false);
                this.a.a().a(5, n, null);
            } catch (IOException ex) {
                this.a.b().a(r.z[12] + ex.getMessage());
                this.a(true);
                this.b.a(true);
            }
            try {
                final Object value = this.g.get(this.k.getSelectedItem());
                if (value != null) {
                    this.a.a().a(r.z[10], value);
                }
            } catch (Throwable t) {
                this.a.b().a(r.z[12] + t.getMessage());
            }
            this.c = false;
        }
    }

    public void a(final boolean enabled) {
        this.h.setEnabled(enabled);
        this.m.setEnabled(enabled);
        this.i.setEnabled(enabled);
    }

    @Override
    public void c() {
        if (this.f() && !this.d) {
            this.h();
        }
        this.j();
    }

    public void j() {
    }

    @Override
    public boolean f() {
        final Integer n = (Integer) this.a.a().a(r.z[11]);
        if (n != null && ((n.equals(com.avocent.kvm.c.a.a) && !this.i.isSelected()) || (n.equals(com.avocent.kvm.c.a.c) && !this.h.isSelected()) || (n.equals(com.avocent.kvm.c.a.b) && !this.m.isSelected()))) {
            return true;
        }
        final Integer a = this.a.a().a(r.z[10], null);
        final Object selectedItem = this.k.getSelectedItem();
        return selectedItem != null && a != null && !a.equals(this.g.get(selectedItem));
    }

    @Override
    public void a(final c b) {
        this.b = b;
    }

    static void a(final r r, final ActionEvent actionEvent) {
        r.b(actionEvent);
    }

    static void b(final r r, final ActionEvent actionEvent) {
        r.c(actionEvent);
    }

    static void c(final r r, final ActionEvent actionEvent) {
        r.a(actionEvent);
    }

    static {
        final String[] z2 = new String[13];
        final int n = 0;
        final char[] charArray = ".WXe\b+ZPv\u000f".toCharArray();
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
                            c2 = 'g';
                            break;
                        }
                        case 1: {
                            c2 = '\u0013';
                            break;
                        }
                        case 2: {
                            c2 = '\u001e';
                            break;
                        }
                        case 3: {
                            c2 = '#';
                            break;
                        }
                        default: {
                            c2 = 'W';
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
        final char[] charArray2 = ".g{NwV".toCharArray();
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
                            c4 = 'g';
                            break;
                        }
                        case 1: {
                            c4 = '\u0013';
                            break;
                        }
                        case 2: {
                            c4 = '\u001e';
                            break;
                        }
                        case 3: {
                            c4 = '#';
                            break;
                        }
                        default: {
                            c4 = 'W';
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
        final char[] charArray3 = ".WXe\b0ZPg\u00180@".toCharArray();
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
                            c6 = 'g';
                            break;
                        }
                        case 1: {
                            c6 = '\u0013';
                            break;
                        }
                        case 2: {
                            c6 = '\u001e';
                            break;
                        }
                        case 3: {
                            c6 = '#';
                            break;
                        }
                        default: {
                            c6 = 'W';
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
        final char[] charArray4 = ".g{NwT".toCharArray();
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
                            c8 = 'g';
                            break;
                        }
                        case 1: {
                            c8 = '\u0013';
                            break;
                        }
                        case 2: {
                            c8 = '\u001e';
                            break;
                        }
                        case 3: {
                            c8 = '#';
                            break;
                        }
                        default: {
                            c8 = 'W';
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
        final char[] charArray5 = ".WXe\b*\\Kp\u00128R]`\u0012+VLb\u0003.\\P".toCharArray();
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
                            c10 = 'g';
                            break;
                        }
                        case 1: {
                            c10 = '\u0013';
                            break;
                        }
                        case 2: {
                            c10 = '\u001e';
                            break;
                        }
                        case 3: {
                            c10 = '#';
                            break;
                        }
                        default: {
                            c10 = 'W';
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
        final char[] charArray6 = ".g{NwU".toCharArray();
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
                            c12 = 'g';
                            break;
                        }
                        case 1: {
                            c12 = '\u0013';
                            break;
                        }
                        case 2: {
                            c12 = '\u001e';
                            break;
                        }
                        case 3: {
                            c12 = '#';
                            break;
                        }
                        default: {
                            c12 = 'W';
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
        final char[] charArray7 = "(cjJ8\t`ZJ6\u000b|y|\u0003\u0002asJ9\u0006gwL9,vg".toCharArray();
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
                            c14 = 'g';
                            break;
                        }
                        case 1: {
                            c14 = '\u0013';
                            break;
                        }
                        case 2: {
                            c14 = '\u001e';
                            break;
                        }
                        case 3: {
                            c14 = '#';
                            break;
                        }
                        default: {
                            c14 = 'W';
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
        final char[] charArray8 = ".g{NwS".toCharArray();
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
                            c16 = 'g';
                            break;
                        }
                        case 1: {
                            c16 = '\u0013';
                            break;
                        }
                        case 2: {
                            c16 = '\u001e';
                            break;
                        }
                        case 3: {
                            c16 = '#';
                            break;
                        }
                        default: {
                            c16 = 'W';
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
        final char[] charArray9 = ".WXe\b)\\Pf".toCharArray();
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
                            c18 = 'g';
                            break;
                        }
                        case 1: {
                            c18 = '\u0013';
                            break;
                        }
                        case 2: {
                            c18 = '\u001e';
                            break;
                        }
                        case 3: {
                            c18 = '#';
                            break;
                        }
                        default: {
                            c18 = 'W';
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
        final char[] charArray10 = ".WXe\b*\\Kp\u0012".toCharArray();
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
                            c20 = 'g';
                            break;
                        }
                        case 1: {
                            c20 = '\u0013';
                            break;
                        }
                        case 2: {
                            c20 = '\u001e';
                            break;
                        }
                        case 3: {
                            c20 = '#';
                            break;
                        }
                        default: {
                            c20 = 'W';
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
        final char[] charArray11 = "\u0014zpD;\u0002PkQ$\baJF%\nzpB#\u000e|ph2\u001e".toCharArray();
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
                            c22 = 'g';
                            break;
                        }
                        case 1: {
                            c22 = '\u0013';
                            break;
                        }
                        case 2: {
                            c22 = '\u001e';
                            break;
                        }
                        case 3: {
                            c22 = '#';
                            break;
                        }
                        default: {
                            c22 = 'W';
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
        final char[] charArray12 = "\n|kP28r}@2\u000b".toCharArray();
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
                            c24 = 'g';
                            break;
                        }
                        case 1: {
                            c24 = '\u0013';
                            break;
                        }
                        case 2: {
                            c24 = '\u001e';
                            break;
                        }
                        case 3: {
                            c24 = '#';
                            break;
                        }
                        default: {
                            c24 = 'W';
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
        final char[] charArray13 = "GVf@2\u0017gwL9]3".toCharArray();
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
                            c26 = 'g';
                            break;
                        }
                        case 1: {
                            c26 = '\u0013';
                            break;
                        }
                        case 2: {
                            c26 = '\u001e';
                            break;
                        }
                        case 3: {
                            c26 = '#';
                            break;
                        }
                        default: {
                            c26 = 'W';
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
