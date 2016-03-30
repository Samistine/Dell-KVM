package com.avocent.lenovo.kvm;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

public class i extends AbstractAction
{
    a a;
    private static final String[] z;
    
    public i(final a a) {
        super(a.b(i.z[0]));
        this.a = a;
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            if (this.a.a().a(1, i.z[1], null) == 0) {
                return;
            }
        }
        catch (IOException ex) {
            this.a.b().a(i.z[3] + ex.getMessage());
        }
        this.a.a(this.a.b(i.z[2]));
    }
    
    static {
        final String[] z2 = new String[4];
        final int n = 0;
        final char[] charArray = "2\u001a\u001bGB2\u001e\u001c\\B/\u0014\u0005LO \u0018\u000bJQ:".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098: {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '\u007f';
                            break;
                        }
                        case 1: {
                            c2 = '[';
                            break;
                        }
                        case 2: {
                            c2 = 'R';
                            break;
                        }
                        case 3: {
                            c2 = '\t';
                            break;
                        }
                        default: {
                            c2 = '\u001d';
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
        final char[] charArray2 = "/4%lo_\u0018+jq\u001a".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214: {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '\u007f';
                            break;
                        }
                        case 1: {
                            c4 = '[';
                            break;
                        }
                        case 2: {
                            c4 = 'R';
                            break;
                        }
                        case 3: {
                            c4 = '\t';
                            break;
                        }
                        default: {
                            c4 = '\u001d';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
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
        final char[] charArray3 = ":\t\u0000FO \u000e\u001cH_3\u001e\r]R \u001a\u0002YQ&\u0004\u0002FJ:\t\rZX+\u000f\u001bGZ".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0330: {
                if (n10 > 1) {
                    break Label_0330;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '\u007f';
                            break;
                        }
                        case 1: {
                            c6 = '[';
                            break;
                        }
                        case 2: {
                            c6 = 'R';
                            break;
                        }
                        case 3: {
                            c6 = '\t';
                            break;
                        }
                        default: {
                            c6 = '\u001d';
                            break;
                        }
                    }
                    charArray3[length3] = (char)(c5 ^ c6);
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
        final char[] charArray4 = ":\t\u0000FOE{\u0017q~\u001a+&`r\u0011{%at\u0013>rzx\u0011?;gz_+=~x\r{!li\u000b2<n=\r>#|x\f/h)".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0446: {
                if (n14 > 1) {
                    break Label_0446;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = '\u007f';
                            break;
                        }
                        case 1: {
                            c8 = '[';
                            break;
                        }
                        case 2: {
                            c8 = 'R';
                            break;
                        }
                        case 3: {
                            c8 = '\t';
                            break;
                        }
                        default: {
                            c8 = '\u001d';
                            break;
                        }
                    }
                    charArray4[length4] = (char)(c7 ^ c8);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 <= n16) {
                z2[n13] = new String(charArray4).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
