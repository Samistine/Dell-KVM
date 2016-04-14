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
    private static final String[] z = {"IDFF_LINUX","Item 1","IDFF_WINDOWS","Item 3","IDFF_MOUSE_ACCELERATION","Item 2","OptionsDialog_TerminationKey","Item 4","IDFF_NONE","IDFF_MOUSE","singleCursorTerminationKey","mouse_accel"," Exception: "};

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
        this.a(a.a(r.z[11], 0));
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
            if (n.equals(0)) {
                this.i.setSelected(true);
                if (t == 0) {
                    break Label_0078;
                }
            }
            if (n.equals(2)) {
                this.h.setSelected(true);
                if (t == 0) {
                    break Label_0078;
                }
            }
            if (n.equals(1)) {
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
            Integer n = 0;
            Label_0045:
            {
                if (this.h.isSelected()) {
                    n = 2;
                    if (com.avocent.a.a.e.c.t == 0) {
                        break Label_0045;
                    }
                }
                if (this.m.isSelected()) {
                    n = 1;
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
        if (n != null && ((n.equals(0) && !this.i.isSelected()) || (n.equals(2) && !this.h.isSelected()) || (n.equals(1) && !this.m.isSelected()))) {
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

    }
