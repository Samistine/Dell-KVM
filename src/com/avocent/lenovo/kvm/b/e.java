// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import javax.swing.UIManager;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import com.avocent.a.d;
import com.avocent.kvm.b.d.a;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.Timer;
import com.avocent.lenovo.kvm.c;
import javax.swing.JDialog;

public class e extends JDialog {

    protected c a;
    protected int b;
    private Timer c;
    private ButtonGroup d;
    private JRadioButton e;
    private JPanel f;
    private JPanel g;
    private JPanel h;
    private JTextArea i;
    private JButton j;
    private JRadioButton k;
    private JRadioButton l;
    public static boolean m;
    private static final String[] z = {"\n\n", "SH_request2", "SH_request1", "OptionsDialog_Title", "SH_OK", "A connection request has been received from 192.168.2.1.\n\nPlease select the action to take.", "Center", "SH_allowReadOnly", "SH_approve", "Panel.background", "SH_reject", "Last", "\n\n***** Debug ***** Host permits permission: "};

    public e(final c a) {
        super(a.c(), true);
        final boolean m = com.avocent.lenovo.kvm.b.e.m;
        this.a = a;
        this.a();
        this.setLocationRelativeTo(a.c());
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.lenovo.kvm.b.e.m = !m;
        }
    }

    private void a() {
        this.d = new ButtonGroup();
        this.h = new JPanel();
        this.i = new JTextArea();
        this.g = new JPanel();
        this.e = new JRadioButton();
        this.k = new JRadioButton();
        this.l = new JRadioButton();
        this.f = new JPanel();
        this.j = new JButton();
        this.setDefaultCloseOperation(2);
        this.a.d();
        this.setTitle(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[3]));
        this.h.setBorder(BorderFactory.createTitledBorder(""));
        this.h.setLayout(new GridBagLayout());
        this.i.setBackground(UIManager.getDefaults().getColor(com.avocent.lenovo.kvm.b.e.z[9]));
        this.i.setColumns(40);
        this.i.setEditable(false);
        this.i.setLineWrap(true);
        this.i.setText(com.avocent.lenovo.kvm.b.e.z[5]);
        this.i.setWrapStyleWord(true);
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 0, 10);
        this.h.add(this.i, gridBagConstraints);
        this.g.setLayout(new GridBagLayout());
        this.d.add(this.e);
        final JRadioButton e = this.e;
        this.a.d();
        e.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[8]));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridwidth = 0;
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.insets = new Insets(0, 30, 0, 0);
        this.g.add(this.e, gridBagConstraints2);
        this.d.add(this.k);
        final JRadioButton k = this.k;
        this.a.d();
        k.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[10]));
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.insets = new Insets(0, 30, 0, 0);
        this.g.add(this.k, gridBagConstraints3);
        this.d.add(this.l);
        final JRadioButton l = this.l;
        this.a.d();
        l.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[7]));
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridwidth = 0;
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.weightx = 1.0;
        gridBagConstraints4.insets = new Insets(0, 30, 0, 0);
        this.g.add(this.l, gridBagConstraints4);
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.fill = 2;
        gridBagConstraints5.insets = new Insets(0, 10, 10, 10);
        this.h.add(this.g, gridBagConstraints5);
        this.getContentPane().add(this.h, com.avocent.lenovo.kvm.b.e.z[6]);
        this.f.setLayout(new GridBagLayout());
        final JButton j = this.j;
        this.a.d();
        j.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[4]));
        this.j.addActionListener(new b(this));
        final GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        this.f.add(this.j, gridBagConstraints6);
        this.getContentPane().add(this.f, com.avocent.lenovo.kvm.b.e.z[11]);
        this.pack();
    }

    private void a(final ActionEvent actionEvent) {
        final boolean m = com.avocent.lenovo.kvm.b.e.m;
        Label_0047:
        {
            if (this.e.isSelected()) {
                this.b = 2;
                if (!m) {
                    break Label_0047;
                }
            }
            if (this.l.isSelected()) {
                this.b = 3;
                if (!m) {
                    break Label_0047;
                }
            }
            this.b = 1;
        }
        System.out.println(com.avocent.lenovo.kvm.b.e.z[12] + this.b + com.avocent.lenovo.kvm.b.e.z[0]);
        this.setVisible(false);
    }

    private void a(final int n) {
        (this.c = new Timer(n * 1000, null)).addActionListener(new com.avocent.lenovo.kvm.b.c(this, this));
        this.c.start();
    }

    public int a(final String s) {
        final boolean m = com.avocent.lenovo.kvm.b.e.m;
        this.a(30);
        final StringBuilder sb = new StringBuilder();
        this.a.d();
        final StringBuilder append = sb.append(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[2])).append(com.avocent.lenovo.kvm.b.e.z[0]);
        this.a.d();
        this.i.setText(append.append(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.e.z[1])).toString());
        this.b = 1;
        this.setVisible(true);
        final int b = this.b;
        if (m) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
        return b;
    }

    static void a(final e e, final ActionEvent actionEvent) {
        e.a(actionEvent);
    }

    private static class b implements ActionListener {

        final e a;

        b(e a) {
            this.a = a;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            a(this.a, actionEvent);
        }
    }
}
