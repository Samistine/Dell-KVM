// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import java.awt.Insets;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Frame;
import javax.swing.JTabbedPane;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JButton;
import com.avocent.a.j;
import javax.swing.JDialog;

public class p extends JDialog implements j {

    protected c a;
    private JButton b;
    private JPanel c;
    private JButton d;
    private JPanel e;
    private ButtonGroup f;
    private JButton g;
    private JTabbedPane h;
    private static final String[] z = {"South","Center"};

    public p(final c a, final Frame frame, final boolean b) {
        super(frame, b);
        this.a = a;
        this.b();
        this.g.setAction(this.a.a());
        this.d.setAction(this.a.c());
        this.b.setAction(this.a.f());
        this.getRootPane().setDefaultButton(this.g);
    }

    private void b() {
        this.f = new ButtonGroup();
        this.e = new JPanel();
        this.h = new JTabbedPane();
        this.c = new JPanel();
        this.g = new JButton();
        this.b = new JButton();
        this.d = new JButton();
        this.setDefaultCloseOperation(2);
        this.e.setLayout(new GridBagLayout());
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.e.add(this.h, gridBagConstraints);
        this.getContentPane().add(this.e, p.z[1]);
        this.c.setLayout(new GridBagLayout());
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.anchor = 13;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        this.c.add(this.g, gridBagConstraints2);
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        this.c.add(this.d, gridBagConstraints3);
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        this.c.add(this.b, gridBagConstraints4);
        this.getContentPane().add(this.c, p.z[0]);
        this.pack();
    }

    public void a(final k k) {
        this.h.add(k.d(), k.e());
    }

    @Override
    public void a() {
        this.a.p();
    }

    }
