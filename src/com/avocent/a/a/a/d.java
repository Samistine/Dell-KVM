package com.avocent.a.a.a;

import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

public class d extends AbstractAction
{
    i a;
    private static final String z;
    
    public d(final i a) {
        a.d();
        super(d.b(d.z));
        this.a = a;
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            this.a.t();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
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
            Label_0094: {
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
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
