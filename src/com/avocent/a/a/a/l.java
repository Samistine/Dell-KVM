// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import com.avocent.a.d;
import java.io.File;
import javax.swing.filechooser.FileFilter;

public class l extends FileFilter {

    final c a;
    private static final String[] z;

    public l(final c a) {
        this.a = a;
    }

    @Override
    public boolean accept(final File file) {
        final String name = file.getName();
        return file.isDirectory() || name.endsWith(l.z[1]) || name.endsWith(l.z[0]);
    }

    @Override
    public String getDescription() {
        this.a.a.d();
        return d.b(l.z[2]);
    }

    static {
        final String[] z2 = new String[3];
        final int n = 0;
        final char[] charArray = "f\u0013KD ".toCharArray();
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
                            c2 = 'H';
                            break;
                        }
                        case 1: {
                            c2 = 'y';
                            break;
                        }
                        case 2: {
                            c2 = ';';
                            break;
                        }
                        case 3: {
                            c2 = '!';
                            break;
                        }
                        default: {
                            c2 = 'G';
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
        final char[] charArray2 = "f\u0013KF".toCharArray();
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
                            c4 = 'H';
                            break;
                        }
                        case 1: {
                            c4 = 'y';
                            break;
                        }
                        case 2: {
                            c4 = ';';
                            break;
                        }
                        case 3: {
                            c4 = '!';
                            break;
                        }
                        default: {
                            c4 = 'G';
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
        final char[] charArray3 = "\u000b\u0018KU2:\u001c\u007fH&$\u0016\\~\u0001!\u0015^u>8\u001c\u007fD4+\u000bRQ3!\u0016U".toCharArray();
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
                            c6 = 'H';
                            break;
                        }
                        case 1: {
                            c6 = 'y';
                            break;
                        }
                        case 2: {
                            c6 = ';';
                            break;
                        }
                        case 3: {
                            c6 = '!';
                            break;
                        }
                        default: {
                            c6 = 'G';
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
