// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.a;

import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Component;
import javax.swing.Action;
import java.awt.Frame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JDialog;

//Originally named f
public class JDialog_f extends JDialog {

    protected a a;
    private JPanel b;
    private JButton c;
    private JButton d;
    private JPanel e;
    private ButtonGroup f;
    private JButton g;
    private JPanel h;
    private JPanel i;
    private JPanel j;
    private JTextField k;
    private JTextArea l;
    private JScrollPane m;
    private JLabel n;
    private JLabel o;
    private static final String[] z = {"Center","East","eruano","null","Last","Close","Send","Clear","User:","History"};

    public JDialog_f(a a, Frame locationRelativeTo) {
        super(locationRelativeTo, false);
        final int o = com.avocent.lenovo.kvm.a.a.o;
        this.a = a;
        this.a();
        this.c.setAction(this.a.k);
        this.g.setAction(this.a.l);
        this.d.setAction(this.a.m);
        this.setLocationRelativeTo(locationRelativeTo);
        if (o != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }

    private void a() {
        this.f = new ButtonGroup();
        this.e = new JPanel();
        this.m = new JScrollPane();
        this.l = new JTextArea();
        this.b = new JPanel();
        this.c = new JButton();
        this.d = new JButton();
        this.h = new JPanel();
        this.i = new JPanel();
        this.n = new JLabel();
        this.o = new JLabel();
        this.j = new JPanel();
        this.k = new JTextField();
        this.g = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle(com.avocent.lenovo.kvm.a.JDialog_f.z[3]);
        this.e.setBorder(BorderFactory.createTitledBorder(com.avocent.lenovo.kvm.a.JDialog_f.z[9]));
        this.e.setLayout(new BorderLayout());
        this.l.setColumns(40);
        this.l.setRows(5);
        this.m.setViewportView(this.l);
        this.e.add(this.m, com.avocent.lenovo.kvm.a.JDialog_f.z[0]);
        this.getContentPane().add(this.e, com.avocent.lenovo.kvm.a.JDialog_f.z[0]);
        this.b.setLayout(new GridBagLayout());
        this.c.setText(com.avocent.lenovo.kvm.a.JDialog_f.z[7]);
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 5, 5, 5);
        this.b.add(this.c, gridBagConstraints);
        this.d.setText(com.avocent.lenovo.kvm.a.JDialog_f.z[5]);
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.anchor = 11;
        gridBagConstraints2.weighty = 1.0;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        this.b.add(this.d, gridBagConstraints2);
        this.getContentPane().add(this.b, com.avocent.lenovo.kvm.a.JDialog_f.z[1]);
        this.h.setLayout(new GridBagLayout());
        this.i.setLayout(new GridBagLayout());
        this.n.setText(com.avocent.lenovo.kvm.a.JDialog_f.z[8]);
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.insets = new Insets(3, 3, 3, 3);
        this.i.add(this.n, gridBagConstraints3);
        this.o.setText(com.avocent.lenovo.kvm.a.JDialog_f.z[2]);
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridwidth = 0;
        gridBagConstraints4.anchor = 17;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.insets = new Insets(3, 3, 3, 3);
        this.i.add(this.o, gridBagConstraints4);
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridwidth = 0;
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.anchor = 17;
        gridBagConstraints5.weightx = 1.0;
        this.h.add(this.i, gridBagConstraints5);
        this.j.setLayout(new GridBagLayout());
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.fill = 2;
        gridBagConstraints6.weightx = 1.0;
        gridBagConstraints6.insets = new Insets(4, 4, 4, 4);
        this.j.add(this.k, gridBagConstraints6);
        this.g.setText(com.avocent.lenovo.kvm.a.JDialog_f.z[6]);
        final GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.anchor = 11;
        gridBagConstraints7.insets = new Insets(5, 0, 5, 5);
        this.j.add(this.g, gridBagConstraints7);
        final GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.fill = 2;
        gridBagConstraints8.weightx = 1.0;
        this.h.add(this.j, gridBagConstraints8);
        this.getContentPane().add(this.h, com.avocent.lenovo.kvm.a.JDialog_f.z[4]);
        this.pack();
    }

    public void a(String text) {
        this.o.setText(text);
    }
}
