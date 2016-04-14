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
    private static final String[] z = {"IDFF_THROTTLE_LEVEL_3","IDFF_THROTTLE_LEVEL_1","IDFF_THROTTLE_LEVEL_5","IDFF_THROTTLE_LEVEL_2","IDFF_THROTTLE_LEVEL_4","IDFF_GENERAL","ERROR_SENDING_REQUEST","PASSTHROUGH","IDFF_KEYBOARD_PASS_THROUGH_MODE","IDFF_NOTE_IN_FULL_SCREEN","Item 1","IDFF_BANDWIDTH_BORDER","Item 4","Item 3","Item 2","IDFF_PASS_ALL_KEYSTROKES_TO_TARGET","BandwidthThrottle"};

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

    }
