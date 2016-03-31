// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.c;

import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class d extends AbstractAction {

    protected b a;
    protected NamedArray b;
    private static final String z;

    public d(final b a, final NamedArray b) {
        super(b.getName());
        this.b = b;
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        final Object source = actionEvent.getSource();
        if (!(source instanceof JMenuItem)) {
            throw new RuntimeException(d.z + ((JMenuItem) source).getClass().getName() + ")");
        }
        final JMenuItem menuItem = (JMenuItem) source;
        this.a.a(this.b);
    }

    static {
        final char[] charArray = "n!J\u0019\u0001@0M\u0003.\u0003-J\u001a/H!@L&Q+IL.L*\u0004!%M1m\u0018%NdG\u0003-S+J\t.We\u0004L\u0003L)T\u0003.F*PL7B7\u0004\r`\u000b".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0094:
            {
                if (n > 1) {
                    break Label_0094;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '#';
                            break;
                        }
                        case 1: {
                            c2 = 'D';
                            break;
                        }
                        case 2: {
                            c2 = '$';
                            break;
                        }
                        case 3: {
                            c2 = 'l';
                            break;
                        }
                        default: {
                            c2 = '@';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                break;
            }
            continue;
        }
    }
}
