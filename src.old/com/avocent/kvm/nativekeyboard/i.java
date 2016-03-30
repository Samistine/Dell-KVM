// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import java.io.IOException;

class i implements NativeKeyEventListener {

    final g a;
    private static final String[] z;

    i(final g a) {
        this.a = a;
    }

    @Override
    public void keyPressed(final int n, final int n2) throws IOException {
        System.out.println(i.z[1] + this.a.a);
        if (this.a.a) {
            final int a = d.a(n);
            System.out.println(i.z[0] + a);
            this.a.c.d().a(a);
        }
    }

    @Override
    public void keyReleased(final int n, final int n2) throws IOException {
        if (this.a.a) {
            this.a.c.d().b(d.a(n));
        }
    }

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "\u0019&_g\u0019Pr\u0014L3Ab.@\u000bP~\fL\nmv\u0012EVO~\u001by\nAh\u0011L\u001c\b;\u0017Z\u001ao~\u001b\u0014".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098:
            {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '$';
                            break;
                        }
                        case 1: {
                            c2 = '\u001b';
                            break;
                        }
                        case 2: {
                            c2 = 'b';
                            break;
                        }
                        case 3: {
                            c2 = ')';
                            break;
                        }
                        default: {
                            c2 = 'x';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
                    ++n4;
                } while (n2 == 0);
            }
            if (n2 > n4) {
                continue;
            }
            break;
        }
        z2[n] = new String(charArray).intern();
        final int n5 = 1;
        final char[] charArray2 = "\u0019&_g\u0019Pr\u0014L3Ab.@\u000bP~\fL\nmv\u0012EVO~\u001by\nAh\u0011L\u001c\b;\u000fv\u001dJz\u0000E\u001d@&".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214:
            {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '$';
                            break;
                        }
                        case 1: {
                            c4 = '\u001b';
                            break;
                        }
                        case 2: {
                            c4 = 'b';
                            break;
                        }
                        case 3: {
                            c4 = ')';
                            break;
                        }
                        default: {
                            c4 = 'x';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
