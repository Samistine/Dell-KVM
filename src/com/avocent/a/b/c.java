package com.avocent.a.b;

import com.avocent.kvm.b.e.a;
import java.awt.event.ActionEvent;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

public class c extends AbstractAction
{
    i a;
    protected a b;
    private static final String z;
    
    public c(final i a) {
        super(a.b(c.z));
        this.a = a;
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        if (this.b == null) {
            this.b = new a(this.a);
        }
        this.b.c();
    }
    
    static {
        final char[] charArray = "xhzi@AhyCZAl`oM\\lxsn".toCharArray();
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
                            c2 = '5';
                            break;
                        }
                        case 1: {
                            c2 = '\r';
                            break;
                        }
                        case 2: {
                            c2 = '\u0014';
                            break;
                        }
                        case 3: {
                            c2 = '\u001c';
                            break;
                        }
                        default: {
                            c2 = '\t';
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
