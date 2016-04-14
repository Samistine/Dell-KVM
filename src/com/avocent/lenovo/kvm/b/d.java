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
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import com.avocent.lenovo.kvm.c;
import javax.swing.JDialog;

public class d extends JDialog {

    protected c a;
    protected int b;
    private ButtonGroup c;
    private JPanel d;
    private JPanel e;
    private JPanel f;
    private JTextArea g;
    private JButton h;
    private JRadioButton i;
    private JRadioButton j;
    private static final String[] z = {"Last", "Center", "SH_answeryes", "Label.background", "SH_answerno", "SH_ask", "OptionsDialog_Title", "OK"};

    public d(final c a, final Frame locationRelativeTo) {
        super(locationRelativeTo, true);
        this.a = a;
        this.a();
        this.setLocationRelativeTo(locationRelativeTo);
    }

    private void a() {
        this.c = new ButtonGroup();
        this.f = new JPanel();
        this.g = new JTextArea();
        this.e = new JPanel();
        this.i = new JRadioButton();
        this.j = new JRadioButton();
        this.d = new JPanel();
        this.h = new JButton();
        this.setDefaultCloseOperation(2);
        this.a.d();
        this.setTitle(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.d.z[6]));
        this.f.setBorder(BorderFactory.createTitledBorder(""));
        this.f.setLayout(new GridBagLayout());
        this.g.setBackground(UIManager.getDefaults().getColor(com.avocent.lenovo.kvm.b.d.z[3]));
        this.g.setColumns(40);
        this.g.setEditable(false);
        this.g.setLineWrap(true);
        final JTextArea g = this.g;
        this.a.d();
        g.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.d.z[5]));
        this.g.setWrapStyleWord(true);
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 0, 10);
        this.f.add(this.g, gridBagConstraints);
        this.e.setLayout(new GridBagLayout());
        this.c.add(this.i);
        final JRadioButton i = this.i;
        this.a.d();
        i.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.d.z[2]));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridwidth = 0;
        gridBagConstraints2.fill = 2;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.insets = new Insets(0, 30, 0, 0);
        this.e.add(this.i, gridBagConstraints2);
        this.c.add(this.j);
        final JRadioButton j = this.j;
        this.a.d();
        j.setText(com.avocent.a.d.b(com.avocent.lenovo.kvm.b.d.z[4]));
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        gridBagConstraints3.fill = 2;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.insets = new Insets(0, 30, 0, 0);
        this.e.add(this.j, gridBagConstraints3);
        final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.fill = 2;
        gridBagConstraints4.insets = new Insets(0, 10, 10, 10);
        this.f.add(this.e, gridBagConstraints4);
        this.getContentPane().add(this.f, com.avocent.lenovo.kvm.b.d.z[1]);
        this.d.setLayout(new GridBagLayout());
        this.h.setText(com.avocent.lenovo.kvm.b.d.z[7]);
        this.h.addActionListener(new ActionListener_a(this));
        final GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        this.d.add(this.h, gridBagConstraints5);
        this.getContentPane().add(this.d, com.avocent.lenovo.kvm.b.d.z[0]);
        this.pack();
    }

    private void a(final ActionEvent actionEvent) {
        this.b = (this.i.isSelected() ? 0 : 1);
        this.setVisible(false);
    }

    public int b() {
        this.b = 1;
        this.setVisible(true);
        return this.b;
    }

    static void a(final d d, final ActionEvent actionEvent) {
        d.a(actionEvent);
    }

    private static class ActionListener_a implements ActionListener {

        final d a;

        ActionListener_a(d a) {
            this.a = a;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            a(this.a, actionEvent);
        }
    }

}
