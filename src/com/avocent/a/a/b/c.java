// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.b;

import java.beans.PropertyChangeEvent;
import java.awt.Component;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import com.avocent.a.d;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Frame;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import com.avocent.a.a.h;
import java.beans.PropertyChangeListener;
import javax.swing.JDialog;

public class c extends JDialog implements PropertyChangeListener {

    protected h a;//Originally named a
    private JPanel JPanel_b;//Originally named b
    private JButton JButton_c;//Originally named c
    private JPanel JPanel_d;//Originally named d
    private ButtonGroup ButtonGroup_e;//Originally named e
    private JButton JButton_F;//Originally named f
    private JLabel JLabel_g;//Originally named g
    private static final String[] z = {"PROGRESS_DIALOG_MESSAGE", "North", "Dialog_Cancel", "South", "ConnectionDialog_Message"};

    public c(final h a, final Frame frame) {
        super(frame, false);
        this.a = a;
        this.a();
        this.JButton_c.setAction(this.a.c());
        this.a.a(this);
    }

    private void a() {
        this.ButtonGroup_e = new ButtonGroup();
        this.JButton_F = new JButton();
        this.JPanel_d = new JPanel();
        this.JLabel_g = new JLabel();
        this.JPanel_b = new JPanel();
        this.JButton_c = new JButton();
        this.setDefaultCloseOperation(2);
        this.JPanel_d.setLayout(new GridBagLayout());
        final JLabel g = this.JLabel_g;
        this.a.d();
        g.setText(com.avocent.a.d.b(com.avocent.a.a.b.c.z[4]));
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(20, 20, 10, 20);
        this.JPanel_d.add(this.JLabel_g, gridBagConstraints);
        this.getContentPane().add(this.JPanel_d, com.avocent.a.a.b.c.z[1]);
        this.JPanel_b.setLayout(new GridBagLayout());
        final JButton c = this.JButton_c;
        this.a.d();
        c.setText(com.avocent.a.d.b(com.avocent.a.a.b.c.z[2]));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.insets = new Insets(10, 10, 10, 10);
        this.JPanel_b.add(this.JButton_c, gridBagConstraints2);
        this.getContentPane().add(this.JPanel_b, com.avocent.a.a.b.c.z[3]);
        this.pack();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals(com.avocent.a.a.b.c.z[0])) {
            this.JLabel_g.setText(propertyChangeEvent.getNewValue().toString());
        }
    }
}
