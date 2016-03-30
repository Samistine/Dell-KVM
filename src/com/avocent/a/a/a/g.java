// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

public class g extends AbstractAction {

    i a;
    private static final String[] z;

    public g(final i a) {
        super(d.b(g.z[0]));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.d();
        final String b = d.b(g.z[0]);
        this.a.d();
        JOptionPane.showMessageDialog(this.a.c(), d.b(g.z[1]), b, 1);
    }

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "3=Y!3\u001b2E\u00106\u001b0@\u0010=\u00112D*\u0010\n/q!\u001a72T*\u0006".toCharArray();
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
                            c2 = '~';
                            break;
                        }
                        case 1: {
                            c2 = '\\';
                            break;
                        }
                        case 2: {
                            c2 = '0';
                            break;
                        }
                        case 3: {
                            c2 = 'O';
                            break;
                        }
                        default: {
                            c2 = '~';
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
        final char[] charArray2 = "7\u0018v\t!6\u0019|\u001f!1\u0012o\u001d;:\u0015b\n=*\u0015\u007f\u0001!.\u001dw\n".toCharArray();
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
                            c4 = '~';
                            break;
                        }
                        case 1: {
                            c4 = '\\';
                            break;
                        }
                        case 2: {
                            c4 = '0';
                            break;
                        }
                        case 3: {
                            c4 = 'O';
                            break;
                        }
                        default: {
                            c4 = '~';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
