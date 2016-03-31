// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named h
public class AbstractAction_h extends AbstractAction {

    i a;
    private static final String z;

    public AbstractAction_h(i a) {
        super(d.b(AbstractAction_h.z));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.a(false);
    }

    static {
        final char[] charArray = "X`~.^pob\u001fE|d`\u001f]zsz!\u007fBhy$|b".toCharArray();
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
                            c2 = '\u0015';
                            break;
                        }
                        case 1: {
                            c2 = '\u0001';
                            break;
                        }
                        case 2: {
                            c2 = '\u0017';
                            break;
                        }
                        case 3: {
                            c2 = '@';
                            break;
                        }
                        default: {
                            c2 = '\u0013';
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
