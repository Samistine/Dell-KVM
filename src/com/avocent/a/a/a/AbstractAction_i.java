// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.event.ActionEvent;
import com.avocent.a.d;
import javax.swing.AbstractAction;

//Originally named i
public class AbstractAction_i extends AbstractAction {

    com.avocent.a.a.i a;
    private static final String z;

    public AbstractAction_i(com.avocent.a.a.i a) {
        super(d.b(AbstractAction_i.z));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.n().g();
    }

    static {
        final char[] charArray = "PSd>\u0001x\\x\u000f\u0018r]a#\u0013NW~#%r\\B 8t]c#".toCharArray();
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
                            c2 = '\u001d';
                            break;
                        }
                        case 1: {
                            c2 = '2';
                            break;
                        }
                        case 2: {
                            c2 = '\r';
                            break;
                        }
                        case 3: {
                            c2 = 'P';
                            break;
                        }
                        default: {
                            c2 = 'L';
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
