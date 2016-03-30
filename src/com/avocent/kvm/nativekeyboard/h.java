package com.avocent.kvm.nativekeyboard;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class h implements FocusListener
{
    final g a;
    private static final String[] z;
    
    h(final g a) {
        this.a = a;
        super();
    }
    
    public void focusLost(final FocusEvent focusEvent) {
        System.out.println(h.z[0]);
        if (this.a.a(focusEvent.getComponent())) {
            final Component component = focusEvent.getComponent();
            try {
                NativeKVM.a(component, false);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        this.a.c.a(false);
    }
    
    public void focusGained(final FocusEvent focusEvent) {
        System.out.println(h.z[1]);
        if (this.a.a(focusEvent.getComponent())) {
            final Component component = focusEvent.getComponent();
            try {
                NativeKVM.a(component, true);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        this.a.c.a(true);
    }
    
    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "\u0003G\u0006_NP!\u0005SHW/".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0097: {
                if (n2 > 1) {
                    break Label_0097;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '#';
                            break;
                        }
                        case 1: {
                            c2 = '\u0001';
                            break;
                        }
                        case 2: {
                            c2 = 'i';
                            break;
                        }
                        case 3: {
                            c2 = '<';
                            break;
                        }
                        default: {
                            c2 = ';';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
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
        final char[] charArray2 = "\u0003G\u0006_NP!.]RMd\r\u0012".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0213: {
                if (n6 > 1) {
                    break Label_0213;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '#';
                            break;
                        }
                        case 1: {
                            c4 = '\u0001';
                            break;
                        }
                        case 2: {
                            c4 = 'i';
                            break;
                        }
                        case 3: {
                            c4 = '<';
                            break;
                        }
                        default: {
                            c4 = ';';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
