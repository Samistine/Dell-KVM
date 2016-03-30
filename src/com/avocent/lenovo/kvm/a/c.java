// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class c extends AbstractAction {

    protected a a;
    private static final String z;

    public c(final a a) {
        super(a.a().b(c.z));
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.a(false);
    }

    static {
        final char[] charArray = "ey@bU@[cHXCGa".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0093:
            {
                if (n > 1) {
                    break Label_0093;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = ',';
                            break;
                        }
                        case 1: {
                            c2 = '4';
                            break;
                        }
                        case 2: {
                            c2 = '\u0004';
                            break;
                        }
                        case 3: {
                            c2 = '\u000b';
                            break;
                        }
                        default: {
                            c2 = '4';
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
