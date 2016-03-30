// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class t implements PropertyChangeListener {

    protected i a;
    private static final String[] z;

    public t(final i a) {
        this.a = a;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        final String propertyName = propertyChangeEvent.getPropertyName();
        if (propertyName.equalsIgnoreCase(t.z[1])) {
            System.out.println(t.z[2] + propertyName + t.z[3] + propertyChangeEvent.getNewValue());
            this.a.a(Boolean.valueOf(propertyChangeEvent.getNewValue().toString().trim()));
            if (!i.G) {
                return;
            }
        }
        if (propertyName.equalsIgnoreCase(t.z[0])) {
            this.a.a().g().a(this.a.o(), (boolean) propertyChangeEvent.getNewValue());
        }
    }

    static {
        final String[] z2 = new String[4];
        final int n = 0;
        final char[] charArray = "&\u0005X\u0017n>\u0016D\u0011}>".toCharArray();
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
                            c2 = 'v';
                            break;
                        }
                        case 1: {
                            c2 = 'D';
                            break;
                        }
                        case 2: {
                            c2 = '\u000b';
                            break;
                        }
                        case 3: {
                            c2 = 'D';
                            break;
                        }
                        default: {
                            c2 = ':';
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
        final char[] charArray2 = "0\u0011G\bi5\u0016N\u0001t".toCharArray();
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
                            c4 = 'v';
                            break;
                        }
                        case 1: {
                            c4 = 'D';
                            break;
                        }
                        case 2: {
                            c4 = '\u000b';
                            break;
                        }
                        case 3: {
                            c4 = 'D';
                            break;
                        }
                        default: {
                            c4 = ':';
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
        final char[] charArray3 = "V\u0014y+J\u00136\u007f=\u001a5,j*]\u0013~".toCharArray();
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
                            c6 = 'v';
                            break;
                        }
                        case 1: {
                            c6 = 'D';
                            break;
                        }
                        case 2: {
                            c6 = '\u000b';
                            break;
                        }
                        case 3: {
                            c6 = 'D';
                            break;
                        }
                        default: {
                            c6 = ':';
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
        final char[] charArray4 = "Zde!MV2j(O\u0013~+".toCharArray();
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
                            c8 = 'v';
                            break;
                        }
                        case 1: {
                            c8 = 'D';
                            break;
                        }
                        case 2: {
                            c8 = '\u000b';
                            break;
                        }
                        case 3: {
                            c8 = 'D';
                            break;
                        }
                        default: {
                            c8 = ':';
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
