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

    protected h a;
    private JPanel b;
    private JButton c;
    private JPanel d;
    private ButtonGroup e;
    private JButton f;
    private JLabel g;
    private static final String[] z;

    public c(final h a, final Frame frame) {
        super(frame, false);
        this.a = a;
        this.a();
        this.c.setAction(this.a.c());
        this.a.a(this);
    }

    private void a() {
        this.e = new ButtonGroup();
        this.f = new JButton();
        this.d = new JPanel();
        this.g = new JLabel();
        this.b = new JPanel();
        this.c = new JButton();
        this.setDefaultCloseOperation(2);
        this.d.setLayout(new GridBagLayout());
        final JLabel g = this.g;
        this.a.d();
        g.setText(com.avocent.a.d.b(com.avocent.a.a.b.c.z[4]));
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.insets = new Insets(20, 20, 10, 20);
        this.d.add(this.g, gridBagConstraints);
        this.getContentPane().add(this.d, com.avocent.a.a.b.c.z[1]);
        this.b.setLayout(new GridBagLayout());
        final JButton c = this.c;
        this.a.d();
        c.setText(com.avocent.a.d.b(com.avocent.a.a.b.c.z[2]));
        final GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.insets = new Insets(10, 10, 10, 10);
        this.b.add(this.c, gridBagConstraints2);
        this.getContentPane().add(this.b, com.avocent.a.a.b.c.z[3]);
        this.pack();
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals(com.avocent.a.a.b.c.z[0])) {
            this.g.setText(propertyChangeEvent.getNewValue().toString());
        }
    }

    static {
        final String[] z2 = new String[5];
        final int n = 0;
        final char[] charArray = "\u0018\u0018W\u0006<\r\u0019K\u001e*\u0001\u000bT\u000e)\u0017\u0007]\u0012=\t\r]".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098:
            {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'H';
                            break;
                        }
                        case 1: {
                            c2 = 'J';
                            break;
                        }
                        case 2: {
                            c2 = '\u0018';
                            break;
                        }
                        case 3: {
                            c2 = 'A';
                            break;
                        }
                        default: {
                            c2 = 'n';
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
        final char[] charArray2 = "\u0006%j5\u0006".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214:
            {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'H';
                            break;
                        }
                        case 1: {
                            c4 = 'J';
                            break;
                        }
                        case 2: {
                            c4 = '\u0018';
                            break;
                        }
                        case 3: {
                            c4 = 'A';
                            break;
                        }
                        default: {
                            c4 = 'n';
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
        final char[] charArray3 = "\f#y-\u0001/\u0015[ \u0000+/t".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0330:
            {
                if (n10 > 1) {
                    break Label_0330;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = 'H';
                            break;
                        }
                        case 1: {
                            c6 = 'J';
                            break;
                        }
                        case 2: {
                            c6 = '\u0018';
                            break;
                        }
                        case 3: {
                            c6 = 'A';
                            break;
                        }
                        default: {
                            c6 = 'n';
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
        final char[] charArray4 = "\u001b%m5\u0006".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0446:
            {
                if (n14 > 1) {
                    break Label_0446;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = 'H';
                            break;
                        }
                        case 1: {
                            c8 = 'J';
                            break;
                        }
                        case 2: {
                            c8 = '\u0018';
                            break;
                        }
                        case 3: {
                            c8 = 'A';
                            break;
                        }
                        default: {
                            c8 = 'n';
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
        final char[] charArray5 = "\u000b%v/\u000b+>q.\u0000\f#y-\u0001/\u0015U$\u001d;+\u007f$".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0562:
            {
                if (n18 > 1) {
                    break Label_0562;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = 'H';
                            break;
                        }
                        case 1: {
                            c10 = 'J';
                            break;
                        }
                        case 2: {
                            c10 = '\u0018';
                            break;
                        }
                        case 3: {
                            c10 = 'A';
                            break;
                        }
                        default: {
                            c10 = 'n';
                            break;
                        }
                    }
                    charArray5[length5] = (char) (c9 ^ c10);
                    ++n20;
                } while (n18 == 0);
            }
            if (n18 <= n20) {
                z2[n17] = new String(charArray5).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
