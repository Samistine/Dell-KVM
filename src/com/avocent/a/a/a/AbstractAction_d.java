// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.event.ActionEvent;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named d
public class AbstractAction_d extends AbstractAction {

    i a;
    private static final String z;

    public AbstractAction_d(i a) {
        super(com.avocent.a.d.b(AbstractAction_d.z));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.a.t();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

    static {
        final char[] charArray = "\u0004}y$Z,re\u0015Q pu\u0015R1ud".toCharArray();
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
                            c2 = 'I';
                            break;
                        }
                        case 1: {
                            c2 = '\u001c';
                            break;
                        }
                        case 2: {
                            c2 = '\u0010';
                            break;
                        }
                        case 3: {
                            c2 = 'J';
                            break;
                        }
                        default: {
                            c2 = '\u0017';
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
