package com.avocent.a.a.e;

import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.a.b;

class o extends b
{
    s b;
    private static final String z;
    
    public o(final s b) {
        super();
        this.b = b;
    }
    
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        System.out.println(o.z + propertyChangeEvent.getPropertyName());
        if (this.b != null) {
            this.b.propertyChange(propertyChangeEvent);
        }
    }
    
    static {
        final char[] charArray = "L#Gf\fu\u001az#\u000es\fI.\u001di\u0012of\u001ah\u0007*".toCharArray();
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
                            c2 = '\u0007';
                            break;
                        }
                        case 1: {
                            c2 = 'u';
                            break;
                        }
                        case 2: {
                            c2 = '\n';
                            break;
                        }
                        case 3: {
                            c2 = 'F';
                            break;
                        }
                        default: {
                            c2 = '|';
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
