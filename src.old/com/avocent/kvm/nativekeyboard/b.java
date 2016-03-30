// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.a.b;

class b extends com.avocent.kvm.b.a.b {

    final c b;
    private static final String[] z;

    b(final c b) {
        this.b = b;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equalsIgnoreCase(com.avocent.kvm.nativekeyboard.b.z[1])) {
            final Object newValue = propertyChangeEvent.getNewValue();
            if (newValue instanceof Integer) {
                this.b.p = (int) newValue;
                if (NativeKVM.b == 0) {
                    break;
                }
            }
            this.b.f.b().a(com.avocent.kvm.nativekeyboard.b.z[0] + newValue);
        }
    }

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "{ R\u0001\u00137\u0000XW\u00012\u0007[\u001b\u0017{\nI\u0005\u00014\u001b\u001c\u0003\u0017)\u0004U\u0019\u0013/\u0000S\u0019R0\fEMR".toCharArray();
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
                            c2 = '[';
                            break;
                        }
                        case 1: {
                            c2 = 'i';
                            break;
                        }
                        case 2: {
                            c2 = '<';
                            break;
                        }
                        case 3: {
                            c2 = 'w';
                            break;
                        }
                        default: {
                            c2 = 'r';
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
        final char[] charArray2 = "(\u0000R\u0010\u001e>*I\u0005\u00014\u001bh\u0012\u00006\u0000R\u0016\u00062\u0006R<\u0017\"".toCharArray();
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
                            c4 = '[';
                            break;
                        }
                        case 1: {
                            c4 = 'i';
                            break;
                        }
                        case 2: {
                            c4 = '<';
                            break;
                        }
                        case 3: {
                            c4 = 'w';
                            break;
                        }
                        default: {
                            c4 = 'r';
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
