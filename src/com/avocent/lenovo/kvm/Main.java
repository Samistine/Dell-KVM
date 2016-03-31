// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import com.avocent.kvm.b.f.e;
import com.avocent.a.a.s;
import com.avocent.a.d;
import com.avocent.kvm.b.f.b;

public class Main {

    private static final String z;

    void a(String[] array) throws Exception {
        final e a = b.a();
        final f f = new f();
        final d d = new d();
        d.a(Main.z);
        final c c = new c();
        c.a(a);
        c.a(f, d, array);
        c.f();
    }

    public static void main(String[] array) {
        try {
            new Main().a(array);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }

    static {
        final char[] charArray = "\u0004e26\u0002\u0011e<}\r\u0013$3}\r\b|06\b\u0011gqJ\u0006\u0014".toCharArray();
        int length = charArray.length;
        int n2;
        int n = n2 = length;
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
                            c2 = 'g';
                            break;
                        }
                        case 1: {
                            c2 = '\n';
                            break;
                        }
                        case 2: {
                            c2 = '_';
                            break;
                        }
                        case 3: {
                            c2 = '\u0018';
                            break;
                        }
                        default: {
                            c2 = 'c';
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
        }
    }
}
