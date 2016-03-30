// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a;

import java.util.MissingResourceException;
import com.avocent.kvm.b.f.b;
import java.text.MessageFormat;
import java.util.ResourceBundle;

public class d {

    static ResourceBundle a;
    private static final String[] z;

    public void a(final String s) {
        d.a = ResourceBundle.getBundle(s);
    }

    public static String b(final String s) {
        String s2 = c(s);
        if (s2 == null) {
            s2 = d.z[1] + s + d.z[0];
        }
        return s2;
    }

    public static String a(final String s, final Object[] array) {
        String s2 = c(s);
        if (s2 != null && array != null) {
            s2 = MessageFormat.format(s2, array);
        }
        return s2;
    }

    private static String c(final String s) {
        String string = null;
        if (d.a != null) {
            try {
                string = d.a.getString(s);
            } catch (MissingResourceException ex) {
                b.a().a(d.z[2] + s);
            }
        }
        return string;
    }

    static {
        final String[] z2 = new String[3];
        final int n = 0;
        final char[] charArray = "\u0010@7\u001d".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0097:
            {
                if (n2 > 1) {
                    break Label_0097;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '.';
                            break;
                        }
                        case 1: {
                            c2 = '~';
                            break;
                        }
                        case 2: {
                            c2 = '\t';
                            break;
                        }
                        case 3: {
                            c2 = '#';
                            break;
                        }
                        default: {
                            c2 = '\u0002';
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
        final char[] charArray2 = "\u0012B5\u001f".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0213:
            {
                if (n6 > 1) {
                    break Label_0213;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '.';
                            break;
                        }
                        case 1: {
                            c4 = '~';
                            break;
                        }
                        case 2: {
                            c4 = '\t';
                            break;
                        }
                        case 3: {
                            c4 = '#';
                            break;
                        }
                        default: {
                            c4 = '\u0002';
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
        final char[] charArray3 = "\u000e3`PqG\u0010n\u0003pK\rfVpM\u001b3\u0003".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0329:
            {
                if (n10 > 1) {
                    break Label_0329;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '.';
                            break;
                        }
                        case 1: {
                            c6 = '~';
                            break;
                        }
                        case 2: {
                            c6 = '\t';
                            break;
                        }
                        case 3: {
                            c6 = '#';
                            break;
                        }
                        default: {
                            c6 = '\u0002';
                            break;
                        }
                    }
                    charArray3[length3] = (char) (c5 ^ c6);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 <= n12) {
                z2[n9] = new String(charArray3).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
