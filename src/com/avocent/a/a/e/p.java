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

public class p extends JDialog implements j
{
    protected c a;
    private JButton b;
    private JPanel c;
    private JButton d;
    private JPanel e;
    private ButtonGroup f;
    private JButton g;
    private JTabbedPane h;
    private static final String[] z;
    
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
    
    public void a() {
        this.a.p();
    }
    
    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "5uz4c".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098: {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'f';
                            break;
                        }
                        case 1: {
                            c2 = '\u001a';
                            break;
                        }
                        case 2: {
                            c2 = '\u000f';
                            break;
                        }
                        case 3: {
                            c2 = '@';
                            break;
                        }
                        default: {
                            c2 = '\u000b';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
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
        final char[] charArray2 = "%\u007fa4n\u0014".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214: {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'f';
                            break;
                        }
                        case 1: {
                            c4 = '\u001a';
                            break;
                        }
                        case 2: {
                            c4 = '\u000f';
                            break;
                        }
                        case 3: {
                            c4 = '@';
                            break;
                        }
                        default: {
                            c4 = '\u000b';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
