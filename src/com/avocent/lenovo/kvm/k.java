// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

public class k extends AbstractAction {

    a a;
    private static final String[] z;

    public k(final a a) {
        super(a.b(k.z[3]));
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            if (this.a.a().a(1, k.z[2], null) == 0) {
                return;
            }
        } catch (IOException ex) {
            this.a.b().a(k.z[1] + ex.getMessage());
        }
        this.a.a(this.a.b(k.z[0]));
    }

    static {
        final String[] z2 = new String[4];
        final int n = 0;
        final char[] charArray = "o7G\"nu0[,~f J9su$E=ps:E\"ko7J>y~1\\#{".toCharArray();
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
                            c2 = '*';
                            break;
                        }
                        case 1: {
                            c2 = 'e';
                            break;
                        }
                        case 2: {
                            c2 = '\u0015';
                            break;
                        }
                        case 3: {
                            c2 = 'm';
                            break;
                        }
                        default: {
                            c2 = '<';
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
        final char[] charArray2 = "o7G\"n\u0010EP\u0015_O\u0015a\u0004SDEb\u0005UF\u00005\u001eYD\u0001|\u0003[\n\u0015z\u001aYXEf\bH^\f{\n\u001cX\u0000d\u0018YY\u0011/M".toCharArray();
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
                            c4 = '*';
                            break;
                        }
                        case 1: {
                            c4 = 'e';
                            break;
                        }
                        case 2: {
                            c4 = '\u0015';
                            break;
                        }
                        case 3: {
                            c4 = 'm';
                            break;
                        }
                        default: {
                            c4 = '<';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 > n8) {
                continue;
            }
            break;
        }
        z2[n5] = new String(charArray2).intern();
        final int n9 = 2;
        final char[] charArray3 = "z\nb\bN\n*{".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0330:
            {
                if (n10 > 1) {
                    break Label_0330;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '*';
                            break;
                        }
                        case 1: {
                            c6 = 'e';
                            break;
                        }
                        case 2: {
                            c6 = '\u0015';
                            break;
                        }
                        case 3: {
                            c6 = 'm';
                            break;
                        }
                        default: {
                            c6 = '<';
                            break;
                        }
                    }
                    charArray3[length3] = (char) (c5 ^ c6);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 > n12) {
                continue;
            }
            break;
        }
        z2[n9] = new String(charArray3).intern();
        final int n13 = 3;
        final char[] charArray4 = "g$\\#cg [8cz*B(nu*[".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0446:
            {
                if (n14 > 1) {
                    break Label_0446;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = '*';
                            break;
                        }
                        case 1: {
                            c8 = 'e';
                            break;
                        }
                        case 2: {
                            c8 = '\u0015';
                            break;
                        }
                        case 3: {
                            c8 = 'm';
                            break;
                        }
                        default: {
                            c8 = '<';
                            break;
                        }
                    }
                    charArray4[length4] = (char) (c7 ^ c8);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 <= n16) {
                z2[n13] = new String(charArray4).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
