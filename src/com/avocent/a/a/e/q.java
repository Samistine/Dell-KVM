// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import java.io.IOException;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import com.avocent.a.a.i;
import java.beans.PropertyChangeListener;
import javax.swing.JPanel;

public class q extends JPanel implements PropertyChangeListener, k {

    protected i a;
    protected c b;
    protected boolean c;
    protected boolean d;
    protected DefaultComboBoxModel e;
    private JPanel f;
    private JPanel g;
    private JPanel h;
    private JCheckBox i;
    private JLabel j;
    private JComboBox k;
    private JLabel l;
    private static final String[] z;

    public q(final i a, final boolean b) {
        this.c = false;
        this.d = false;
        this.a = a;
        this.g();
        this.a.a((PropertyChangeListener) this);
        if (b) {
            this.g.setVisible(true);
            (this.e = new DefaultComboBoxModel()).addElement(a.b(q.z[1]));
            this.e.addElement(a.b(q.z[3]));
            this.e.addElement(a.b(q.z[0]));
            this.e.addElement(a.b(q.z[4]));
            this.e.addElement(a.b(q.z[2]));
            this.k.setModel(this.e);
            if (com.avocent.a.a.e.c.t == 0) {
                return;
            }
        }
        this.g.setVisible(false);
    }

    private void g() {
        this.h = new JPanel();
        this.i = new JCheckBox();
        this.j = new JLabel();
        this.g = new JPanel();
        this.l = new JLabel();
        this.k = new JComboBox();
        this.f = new JPanel();
        this.setLayout(new GridBagLayout());
        this.h.setLayout(new GridBagLayout());
        this.h.setBorder(BorderFactory.createTitledBorder(this.a.b(q.z[8])));
        this.i.setText(this.a.b(q.z[15]));
        this.i.addActionListener(new d(this));
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets = new Insets(5, 10, 5, 5);
        this.h.add(this.i, gridBagConstraints);
        this.j.setText(this.a.b(q.z[9]));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.insets = new Insets(5, 30, 5, 10);
        this.h.add(this.j, gridBagConstraints2);
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.anchor = 11;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.insets = new Insets(5, 10, 10, 10);
        this.add(this.h, gridBagConstraints3);
        this.g.setLayout(new GridBagLayout());
        this.g.setBorder(BorderFactory.createTitledBorder(this.a.b(q.z[11])));
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.insets = new Insets(5, 10, 5, 5);
        this.g.add(this.l, gridBagConstraints4);
        this.k.setModel(new DefaultComboBoxModel<String>(new String[]{q.z[10], q.z[14], q.z[13], q.z[12]}));
        this.k.addActionListener(new e(this));
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.anchor = 17;
        gridBagConstraints5.weightx = 1.0;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        this.g.add(this.k, gridBagConstraints5);
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridwidth = 0;
        gridBagConstraints6.fill = 2;
        gridBagConstraints6.anchor = 11;
        gridBagConstraints6.weightx = 1.0;
        gridBagConstraints6.insets = new Insets(5, 10, 10, 10);
        this.add(this.g, gridBagConstraints6);
        final GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.fill = 1;
        gridBagConstraints7.weightx = 1.0;
        gridBagConstraints7.weighty = 1.0;
        this.add(this.f, gridBagConstraints7);
    }

    private void a(final ActionEvent actionEvent) {
        this.d = true;
        this.b.n();
    }

    private void b(final ActionEvent actionEvent) {
        this.d = true;
        this.b.n();
    }

    public void h() {
        this.i.setSelected(this.a.a(q.z[7], Boolean.FALSE));
        if (this.g.isVisible()) {
            final Object a = this.a.a().a(q.z[16]);
            if (a != null) {
                this.k.setSelectedIndex((int) a);
            }
        }
    }

    @Override
    public JPanel d() {
        return this;
    }

    @Override
    public String e() {
        return this.a.b(q.z[5]);
    }

    @Override
    public void c() {
        if (this.f() && !this.d) {
            this.h();
        }
        this.i();
    }

    public void i() {
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        final String propertyName = propertyChangeEvent.getPropertyName();
        if (propertyName.equals(q.z[7])) {
            Object o = propertyChangeEvent.getNewValue();
            if (!(o instanceof Boolean)) {
                o = Boolean.valueOf(o.toString());
            }
            this.i.setSelected((boolean) o);
            if (com.avocent.a.a.e.c.t == 0) {
                return;
            }
        }
        if (propertyName.equalsIgnoreCase(q.z[16])) {
            final Object a = this.a.a().a(q.z[16]);
            if (a != null) {
                this.k.setSelectedIndex((int) a);
            }
        }
    }

    @Override
    public void a() {
        if (this.f()) {
            this.c = true;
            this.d = false;
            try {
                this.a.a(q.z[7], (Object) (this.i.isSelected() ? Boolean.TRUE : Boolean.FALSE));
                if (this.g.isVisible()) {
                    this.a.a().a(2, new Integer(this.k.getSelectedIndex()), null);
                }
            } catch (IOException ex) {
                this.a.a(this.a.b(q.z[6]));
            } finally {
                this.c = false;
            }
        }
    }

    @Override
    public void b() {
        this.d = false;
        this.h();
    }

    @Override
    public boolean f() {
        boolean b = false;
        final Object b2 = this.a.b(q.z[7], null);
        if (b2 == null || (boolean) b2 != this.i.isSelected()) {
            b = true;
            if (com.avocent.a.a.e.c.t == 0) {
                return b;
            }
        }
        if (this.g.isVisible()) {
            final Object a = this.a.a().a(q.z[16]);
            if (a != null && (int) a != this.k.getSelectedIndex()) {
                b = true;
            }
        }
        return b;
    }

    @Override
    public void a(final c b) {
        this.b = b;
    }

    static void a(final q q, final ActionEvent actionEvent) {
        q.b(actionEvent);
    }

    static void b(final q q, final ActionEvent actionEvent) {
        q.a(actionEvent);
    }

    static {
        final String[] z2 = new String[17];
        final int n = 0;
        final char[] charArray = "\u0019nCR~\u0004bW[u\u0004f@Km\u0015|@X~c".toCharArray();
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
                            c2 = 'P';
                            break;
                        }
                        case 1: {
                            c2 = '*';
                            break;
                        }
                        case 2: {
                            c2 = '\u0005';
                            break;
                        }
                        case 3: {
                            c2 = '\u0014';
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
        final char[] charArray2 = "\u0019nCR~\u0004bW[u\u0004f@Km\u0015|@X~a".toCharArray();
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
                            c4 = 'P';
                            break;
                        }
                        case 1: {
                            c4 = '*';
                            break;
                        }
                        case 2: {
                            c4 = '\u0005';
                            break;
                        }
                        case 3: {
                            c4 = '\u0014';
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
        final char[] charArray3 = "\u0019nCR~\u0004bW[u\u0004f@Km\u0015|@X~e".toCharArray();
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
                            c6 = 'P';
                            break;
                        }
                        case 1: {
                            c6 = '*';
                            break;
                        }
                        case 2: {
                            c6 = '\u0005';
                            break;
                        }
                        case 3: {
                            c6 = '\u0014';
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
        final char[] charArray4 = "\u0019nCR~\u0004bW[u\u0004f@Km\u0015|@X~b".toCharArray();
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
                            c8 = 'P';
                            break;
                        }
                        case 1: {
                            c8 = '*';
                            break;
                        }
                        case 2: {
                            c8 = '\u0005';
                            break;
                        }
                        case 3: {
                            c8 = '\u0014';
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
        final char[] charArray5 = "\u0019nCR~\u0004bW[u\u0004f@Km\u0015|@X~d".toCharArray();
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
                            c10 = 'P';
                            break;
                        }
                        case 1: {
                            c10 = '*';
                            break;
                        }
                        case 2: {
                            c10 = '\u0005';
                            break;
                        }
                        case 3: {
                            c10 = '\u0014';
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
        final char[] charArray6 = "\u0019nCR~\u0017oKQs\u0011f".toCharArray();
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
                            c12 = 'P';
                            break;
                        }
                        case 1: {
                            c12 = '*';
                            break;
                        }
                        case 2: {
                            c12 = '\u0005';
                            break;
                        }
                        case 3: {
                            c12 = '\u0014';
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
        final char[] charArray7 = "\u0015xW[s\u000fy@Ze\u0019dBKs\u0015{PQr\u0004".toCharArray();
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
                            c14 = 'P';
                            break;
                        }
                        case 1: {
                            c14 = '*';
                            break;
                        }
                        case 2: {
                            c14 = '\u0005';
                            break;
                        }
                        case 3: {
                            c14 = '\u0014';
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
        final char[] charArray8 = "\u0000kVGu\u0018xJAf\u0018".toCharArray();
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
                            c16 = 'P';
                            break;
                        }
                        case 1: {
                            c16 = '*';
                            break;
                        }
                        case 2: {
                            c16 = '\u0005';
                            break;
                        }
                        case 3: {
                            c16 = '\u0014';
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
        final char[] charArray9 = "\u0019nCR~\u001bo\\Vn\u0011xAKq\u0011yVKu\u0018xJAf\u0018uH[e\u0015".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1025:
            {
                if (n34 > 1) {
                    break Label_1025;
                }
                length9 = (n35 = n36);
                do {
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = 'P';
                            break;
                        }
                        case 1: {
                            c18 = '*';
                            break;
                        }
                        case 2: {
                            c18 = '\u0005';
                            break;
                        }
                        case 3: {
                            c18 = '\u0014';
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
            if (n34 > n36) {
                continue;
            }
            break;
        }
        z2[n33] = new String(charArray9).intern();
        final int n37 = 9;
        final char[] charArray10 = "\u0019nCR~\u001eeQQ~\u0019dZRt\u001cfZGb\u0002o@Z".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1141:
            {
                if (n38 > 1) {
                    break Label_1141;
                }
                length10 = (n39 = n40);
                do {
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = 'P';
                            break;
                        }
                        case 1: {
                            c20 = '*';
                            break;
                        }
                        case 2: {
                            c20 = '\u0005';
                            break;
                        }
                        case 3: {
                            c20 = '\u0014';
                            break;
                        }
                        default: {
                            c20 = '!';
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
        final char[] charArray11 = "\u0019^`y\u0001a".toCharArray();
        int length11;
        int n43;
        final int n42 = n43 = (length11 = charArray11.length);
        int n44 = 0;
        while (true) {
            Label_1257:
            {
                if (n42 > 1) {
                    break Label_1257;
                }
                length11 = (n43 = n44);
                do {
                    final char c21 = charArray11[n43];
                    char c22 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c22 = 'P';
                            break;
                        }
                        case 1: {
                            c22 = '*';
                            break;
                        }
                        case 2: {
                            c22 = '\u0005';
                            break;
                        }
                        case 3: {
                            c22 = '\u0014';
                            break;
                        }
                        default: {
                            c22 = '!';
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
        final char[] charArray12 = "\u0019nCR~\u0012kKPv\u0019nQ\\~\u0012eWPd\u0002".toCharArray();
        int length12;
        int n47;
        final int n46 = n47 = (length12 = charArray12.length);
        int n48 = 0;
        while (true) {
            Label_1373:
            {
                if (n46 > 1) {
                    break Label_1373;
                }
                length12 = (n47 = n48);
                do {
                    final char c23 = charArray12[n47];
                    char c24 = '\0';
                    switch (n48 % 5) {
                        case 0: {
                            c24 = 'P';
                            break;
                        }
                        case 1: {
                            c24 = '*';
                            break;
                        }
                        case 2: {
                            c24 = '\u0005';
                            break;
                        }
                        case 3: {
                            c24 = '\u0014';
                            break;
                        }
                        default: {
                            c24 = '!';
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
        final char[] charArray13 = "\u0019^`y\u0001d".toCharArray();
        int length13;
        int n51;
        final int n50 = n51 = (length13 = charArray13.length);
        int n52 = 0;
        while (true) {
            Label_1489:
            {
                if (n50 > 1) {
                    break Label_1489;
                }
                length13 = (n51 = n52);
                do {
                    final char c25 = charArray13[n51];
                    char c26 = '\0';
                    switch (n52 % 5) {
                        case 0: {
                            c26 = 'P';
                            break;
                        }
                        case 1: {
                            c26 = '*';
                            break;
                        }
                        case 2: {
                            c26 = '\u0005';
                            break;
                        }
                        case 3: {
                            c26 = '\u0014';
                            break;
                        }
                        default: {
                            c26 = '!';
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
        final char[] charArray14 = "\u0019^`y\u0001c".toCharArray();
        int length14;
        int n55;
        final int n54 = n55 = (length14 = charArray14.length);
        int n56 = 0;
        while (true) {
            Label_1605:
            {
                if (n54 > 1) {
                    break Label_1605;
                }
                length14 = (n55 = n56);
                do {
                    final char c27 = charArray14[n55];
                    char c28 = '\0';
                    switch (n56 % 5) {
                        case 0: {
                            c28 = 'P';
                            break;
                        }
                        case 1: {
                            c28 = '*';
                            break;
                        }
                        case 2: {
                            c28 = '\u0005';
                            break;
                        }
                        case 3: {
                            c28 = '\u0014';
                            break;
                        }
                        default: {
                            c28 = '!';
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
        final char[] charArray15 = "\u0019^`y\u0001b".toCharArray();
        int length15;
        int n59;
        final int n58 = n59 = (length15 = charArray15.length);
        int n60 = 0;
        while (true) {
            Label_1721:
            {
                if (n58 > 1) {
                    break Label_1721;
                }
                length15 = (n59 = n60);
                do {
                    final char c29 = charArray15[n59];
                    char c30 = '\0';
                    switch (n60 % 5) {
                        case 0: {
                            c30 = 'P';
                            break;
                        }
                        case 1: {
                            c30 = '*';
                            break;
                        }
                        case 2: {
                            c30 = '\u0005';
                            break;
                        }
                        case 3: {
                            c30 = '\u0014';
                            break;
                        }
                        default: {
                            c30 = '!';
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
        final char[] charArray16 = "\u0019nCR~\u0000kVG~\u0011fIKj\u0015sV@s\u001fa@G~\u0004eZ@`\u0002m@@".toCharArray();
        int length16;
        int n63;
        final int n62 = n63 = (length16 = charArray16.length);
        int n64 = 0;
        while (true) {
            Label_1837:
            {
                if (n62 > 1) {
                    break Label_1837;
                }
                length16 = (n63 = n64);
                do {
                    final char c31 = charArray16[n63];
                    char c32 = '\0';
                    switch (n64 % 5) {
                        case 0: {
                            c32 = 'P';
                            break;
                        }
                        case 1: {
                            c32 = '*';
                            break;
                        }
                        case 2: {
                            c32 = '\u0005';
                            break;
                        }
                        case 3: {
                            c32 = '\u0014';
                            break;
                        }
                        default: {
                            c32 = '!';
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
        final char[] charArray17 = "\u0012KkpV9Nq|u8Xj`U<O".toCharArray();
        int length17;
        int n67;
        final int n66 = n67 = (length17 = charArray17.length);
        int n68 = 0;
        while (true) {
            Label_1953:
            {
                if (n66 > 1) {
                    break Label_1953;
                }
                length17 = (n67 = n68);
                do {
                    final char c33 = charArray17[n67];
                    char c34 = '\0';
                    switch (n68 % 5) {
                        case 0: {
                            c34 = 'P';
                            break;
                        }
                        case 1: {
                            c34 = '*';
                            break;
                        }
                        case 2: {
                            c34 = '\u0005';
                            break;
                        }
                        case 3: {
                            c34 = '\u0014';
                            break;
                        }
                        default: {
                            c34 = '!';
                            break;
                        }
                    }
                    charArray17[length17] = (char) (c33 ^ c34);
                    ++n68;
                } while (n66 == 0);
            }
            if (n66 <= n68) {
                z2[n65] = new String(charArray17).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
