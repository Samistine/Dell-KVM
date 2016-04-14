// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.b;

import java.awt.Component;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.avocent.kvm.b.nb;
import com.avocent.a.j;
import javax.swing.JDialog;

public class e extends JDialog implements j {

    protected a a;
    protected nb b;
    protected Double c;
    private JLabel d;
    private JTextField e;
    private JLabel f;
    private JPanel g;
    private JLabel h;
    private JTextField i;
    private JLabel j;
    private JPanel k;
    private JLabel l;
    private JTextField m;
    private JLabel n;
    private JButton o;
    private JLabel p;
    private JTextField q;
    private JLabel r;
    private static final String[] z = {"Center", "Frame Rate:", "% Reduction", "Frames/sec", "Packet Rate:", "South", "Packets/sec", "Compression:", "Kb/sec", "Bandwidth:"};

    public e(final a a, final boolean b) {
        super(a.a().c(), b);
        int n = com.avocent.a.b.a.n;
        this.c = new Double(0.0);
        this.a = a;
        this.b();
        this.o.setAction(a.m);
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.a.b.a.n = ++n;
        }
    }

    public void a(final nb b) {
        this.b = b;
    }

    private void b() {
        this.k = new JPanel();
        this.l = new JLabel();
        this.m = new JTextField();
        this.n = new JLabel();
        this.d = new JLabel();
        this.e = new JTextField();
        this.f = new JLabel();
        this.h = new JLabel();
        this.i = new JTextField();
        this.j = new JLabel();
        this.p = new JLabel();
        this.q = new JTextField();
        this.r = new JLabel();
        this.g = new JPanel();
        this.o = new JButton();
        this.setDefaultCloseOperation(2);
        this.k.setLayout(new GridBagLayout());
        this.k.setBorder(BorderFactory.createCompoundBorder());
        this.l.setText(com.avocent.a.b.e.z[1]);
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = 13;
        gridBagConstraints.insets = new Insets(10, 4, 4, 0);
        this.k.add(this.l, gridBagConstraints);
        this.m.setColumns(10);
        this.m.setEditable(false);
        this.m.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.insets = new Insets(10, 4, 4, 4);
        this.k.add(this.m, gridBagConstraints2);
        this.n.setText(com.avocent.a.b.e.z[3]);
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        gridBagConstraints3.anchor = 17;
        gridBagConstraints3.insets = new Insets(10, 0, 4, 10);
        this.k.add(this.n, gridBagConstraints3);
        this.d.setText(com.avocent.a.b.e.z[9]);
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.anchor = 13;
        gridBagConstraints4.insets = new Insets(4, 4, 4, 0);
        this.k.add(this.d, gridBagConstraints4);
        this.e.setColumns(10);
        this.e.setEditable(false);
        this.e.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.weightx = 1.0;
        gridBagConstraints5.insets = new Insets(4, 4, 4, 4);
        this.k.add(this.e, gridBagConstraints5);
        this.f.setText(com.avocent.a.b.e.z[8]);
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridwidth = 0;
        gridBagConstraints6.anchor = 17;
        gridBagConstraints6.insets = new Insets(4, 0, 4, 10);
        this.k.add(this.f, gridBagConstraints6);
        this.h.setText(com.avocent.a.b.e.z[7]);
        final GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.anchor = 13;
        gridBagConstraints7.insets = new Insets(4, 4, 4, 0);
        this.k.add(this.h, gridBagConstraints7);
        this.i.setColumns(10);
        this.i.setEditable(false);
        this.i.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.fill = 2;
        gridBagConstraints8.weightx = 1.0;
        gridBagConstraints8.insets = new Insets(4, 4, 4, 4);
        this.k.add(this.i, gridBagConstraints8);
        this.j.setText(com.avocent.a.b.e.z[2]);
        final GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridwidth = 0;
        gridBagConstraints9.anchor = 17;
        gridBagConstraints9.insets = new Insets(4, 0, 4, 10);
        this.k.add(this.j, gridBagConstraints9);
        this.p.setText(com.avocent.a.b.e.z[4]);
        final GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.anchor = 13;
        gridBagConstraints10.insets = new Insets(4, 4, 10, 0);
        this.k.add(this.p, gridBagConstraints10);
        this.q.setColumns(10);
        this.q.setEditable(false);
        this.q.setHorizontalAlignment(4);
        final GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.fill = 2;
        gridBagConstraints11.weightx = 1.0;
        gridBagConstraints11.insets = new Insets(4, 4, 10, 4);
        this.k.add(this.q, gridBagConstraints11);
        this.r.setText(com.avocent.a.b.e.z[6]);
        final GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.gridwidth = 0;
        gridBagConstraints12.anchor = 17;
        gridBagConstraints12.insets = new Insets(4, 0, 10, 10);
        this.k.add(this.r, gridBagConstraints12);
        this.getContentPane().add(this.k, com.avocent.a.b.e.z[0]);
        this.g.add(this.o);
        this.getContentPane().add(this.g, com.avocent.a.b.e.z[5]);
        this.pack();
    }

    @Override
    public void a() {
        if (this.b != null) {
            this.m.setText(this.b.a());
            this.i.setText(this.b.c());
            this.q.setText(this.b.d());
            this.e.setText(this.b.b());
            if (com.avocent.a.b.a.n == 0) {
                return;
            }
        }
        this.m.setText(" ");
        this.i.setText(" ");
        this.q.setText(" ");
        this.e.setText(" ");
    }
}
