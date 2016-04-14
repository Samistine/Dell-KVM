// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.b;

import java.awt.Component;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.avocent.a.g;
import javax.swing.JDialog;

//Originally named b
public class JDialog_b extends JDialog {

    protected g a;
    private JLabel JLabel_b;//Originally named b
    private JPanel JPanel_c;//Originally named c
    private JLabel JLabel_d;//Originally named d
    private JTextArea JTextArea_e;//Originally named e
    private JPanel JPanel_f;//Originally named f
    private JButton JButton_g;//Originally named g
    private JLabel JLabel_h;//Originally named h
    private static final String[] z = {"Panel.background", "control", "AboutDialog_Version", "Dialog_OK", "Center", "AboutDialog_SunCopyright", "South", "AboutDialog_Copyright", "AboutDialog_ProductName"};

    public JDialog_b(g a, boolean modal) {
        super(a.c(), modal);
        this.a = a;
        this.a();
        this.JTextArea_e.setBackground(UIManager.getDefaults().getColor(com.avocent.a.a.b.JDialog_b.z[0]));
        this.JButton_g.addActionListener(new ActionListenerA(this));
    }

    private void a() {
        this.JPanel_f = new JPanel();
        this.JLabel_b = new JLabel();
        this.JLabel_h = new JLabel();
        this.JLabel_d = new JLabel();
        this.JTextArea_e = new JTextArea();
        this.JPanel_c = new JPanel();
        this.JButton_g = new JButton();
        this.setDefaultCloseOperation(2);
        this.JPanel_f.setLayout(new GridBagLayout());
        this.JLabel_b.setText(this.a.b(com.avocent.a.a.b.JDialog_b.z[8]));
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        this.JPanel_f.add(this.JLabel_b, gridBagConstraints);
        this.JLabel_h.setText(this.a.b(com.avocent.a.a.b.JDialog_b.z[2]));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridwidth = 0;
        this.JPanel_f.add(this.JLabel_h, gridBagConstraints2);
        this.JLabel_d.setText(this.a.b(com.avocent.a.a.b.JDialog_b.z[7]));
        final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridwidth = 0;
        gridBagConstraints3.insets = new Insets(10, 10, 10, 10);
        this.JPanel_f.add(this.JLabel_d, gridBagConstraints3);
        this.JTextArea_e.setBackground(UIManager.getDefaults().getColor(com.avocent.a.a.b.JDialog_b.z[1]));
        this.JTextArea_e.setColumns(42);
        this.JTextArea_e.setEditable(false);
        this.JTextArea_e.setLineWrap(true);
        this.JTextArea_e.setRows(5);
        this.JTextArea_e.setText(this.a.b(com.avocent.a.a.b.JDialog_b.z[5]));
        this.JTextArea_e.setWrapStyleWord(true);
        new GridBagConstraints().weightx = 1.0;
        this.getContentPane().add(this.JPanel_f, com.avocent.a.a.b.JDialog_b.z[4]);
        this.JButton_g.setText(this.a.b(com.avocent.a.a.b.JDialog_b.z[3]));
        this.JPanel_c.add(this.JButton_g);
        this.getContentPane().add(this.JPanel_c, com.avocent.a.a.b.JDialog_b.z[6]);
        this.pack();
    }
}
