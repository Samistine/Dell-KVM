package com.avocent.lenovo.kvm;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

public class j extends AbstractAction
{
    a a;
    private static final String[] z;
    
    public j(final a a) {
        super(a.b(j.z[3]));
        this.a = a;
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            if (this.a.a().a(1, j.z[2], null) == 0) {
                return;
            }
        }
        catch (IOException ex) {
            this.a.b().a(j.z[0] + ex.getMessage());
        }
        this.a.a(this.a.b(j.z[1]));
    }
    
    static {
        final String[] z2 = new String[4];
        final int n = 0;
        final char[] charArray = ".P.\"/Q\"9\u0015\u001e\u000er\b\u0004\u0012\u0005\"\u000b\u0005\u0014\u0007g\\\u001e\u0018\u0005f\u0015\u0003\u001aKr\u0013\u001a\u0018\u0019\"\u000f\b\t\u001fk\u0012\n]\u0019g\r\u0018\u0018\u0018vFM".toCharArray();
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
                            c2 = 'k';
                            break;
                        }
                        case 1: {
                            c2 = '\u0002';
                            break;
                        }
                        case 2: {
                            c2 = '|';
                            break;
                        }
                        case 3: {
                            c2 = 'm';
                            break;
                        }
                        default: {
                            c2 = '}';
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
        final char[] charArray2 = ".P.\"/4W2,?'G#924C,=12],\"*.P#>8?V5#:".toCharArray();
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
                            c4 = 'k';
                            break;
                        }
                        case 1: {
                            c4 = '\u0002';
                            break;
                        }
                        case 2: {
                            c4 = '|';
                            break;
                        }
                        case 3: {
                            c4 = 'm';
                            break;
                        }
                        default: {
                            c4 = '}';
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
        final char[] charArray3 = ";m\u000b\b\u000fKM\u001a\u000b".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0329: {
                if (n10 > 1) {
                    break Label_0329;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = 'k';
                            break;
                        }
                        case 1: {
                            c6 = '\u0002';
                            break;
                        }
                        case 2: {
                            c6 = '|';
                            break;
                        }
                        case 3: {
                            c6 = 'm';
                            break;
                        }
                        default: {
                            c6 = '}';
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
        final char[] charArray4 = "&C5#\"&G28\";M+(/4M:+".toCharArray();
        int length4;
        int n15;
        final int n14 = n15 = (length4 = charArray4.length);
        int n16 = 0;
        while (true) {
            Label_0445: {
                if (n14 > 1) {
                    break Label_0445;
                }
                length4 = (n15 = n16);
                do {
                    final char c7 = charArray4[n15];
                    char c8 = '\0';
                    switch (n16 % 5) {
                        case 0: {
                            c8 = 'k';
                            break;
                        }
                        case 1: {
                            c8 = '\u0002';
                            break;
                        }
                        case 2: {
                            c8 = '|';
                            break;
                        }
                        case 3: {
                            c8 = 'm';
                            break;
                        }
                        default: {
                            c8 = '}';
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
