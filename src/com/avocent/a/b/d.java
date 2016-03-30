// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.b;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class d extends AbstractAction {

    final a a;
    private static final String z;

    d(final a a) {
        super(d.z);
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        com.avocent.a.b.a.a(this.a).setVisible(false);
        this.a.k.b();
    }

    static {
        final char[] charArray = "\u001e:".toCharArray();
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
                            c2 = 'Q';
                            break;
                        }
                        case 1: {
                            c2 = 'q';
                            break;
                        }
                        case 2: {
                            c2 = '\u0019';
                            break;
                        }
                        case 3: {
                            c2 = 'Q';
                            break;
                        }
                        default: {
                            c2 = 'S';
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
