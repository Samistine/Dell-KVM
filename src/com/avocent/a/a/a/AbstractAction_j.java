// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named j
public class AbstractAction_j extends AbstractAction {

    i a;
    private static final String z;

    public AbstractAction_j(i a) {
        super(d.b(AbstractAction_j.z));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.a.a().a();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static {
        final char[] charArray = "0Wrl6\u0018Xn]-\u0014Sl])\u0018Pig\b\u0015".toCharArray();
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
                            c2 = '}';
                            break;
                        }
                        case 1: {
                            c2 = '6';
                            break;
                        }
                        case 2: {
                            c2 = '\u001b';
                            break;
                        }
                        case 3: {
                            c2 = '\u0002';
                            break;
                        }
                        default: {
                            c2 = '{';
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
