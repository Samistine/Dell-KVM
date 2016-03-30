// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import com.avocent.kvm.b.db;
import com.avocent.kvm.b.u;
import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.a.a;

class j implements a {

    final r a;
    private static final String[] z;

    j(final r a) {
        this.a = a;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        final int t = c.t;
        if (!this.a.c) {
            final String propertyName = propertyChangeEvent.getPropertyName();
            if (propertyName.equals(j.z[0])) {
                final Object newValue = propertyChangeEvent.getNewValue();
                try {
                    Label_0081:
                    {
                        if (newValue instanceof Integer) {
                            this.a.a((Integer) newValue);
                            if (t == 0) {
                                break Label_0081;
                            }
                        }
                        if (newValue instanceof String) {
                            this.a.a(Integer.valueOf((String) newValue));
                        }
                    }
                } catch (NumberFormatException ex) {
                    this.a.a.b().a(j.z[2] + newValue + j.z[3]);
                }
                this.a.a(true);
                this.a.b.n();
                if (t == 0) {
                    return;
                }
            }
            if (!propertyName.equalsIgnoreCase(j.z[1]) || this.a.a.a().a(j.z[1], null) != null) {
            }
        }
    }

    @Override
    public void b(final u u) {
    }

    @Override
    public void a(final u u, final com.avocent.kvm.b.r r, final com.avocent.kvm.b.r r2) {
    }

    @Override
    public void a(final u u) {
    }

    @Override
    public void a(final u u, final db db) {
    }

    static {
        final String[] z2 = new String[4];
        final int n = 0;
        final char[] charArray = "f+x!XT%n1Xg".toCharArray();
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
                            c2 = '\u000b';
                            break;
                        }
                        case 1: {
                            c2 = 'D';
                            break;
                        }
                        case 2: {
                            c2 = '\r';
                            break;
                        }
                        case 3: {
                            c2 = 'R';
                            break;
                        }
                        default: {
                            c2 = '=';
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
        final char[] charArray2 = "x-c5Qn\u0007x Nd6Y7Of-c3Ib+c\u0019Xr".toCharArray();
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
                            c4 = '\u000b';
                            break;
                        }
                        case 1: {
                            c4 = 'D';
                            break;
                        }
                        case 2: {
                            c4 = '\r';
                            break;
                        }
                        case 3: {
                            c4 = 'R';
                            break;
                        }
                        default: {
                            c4 = '=';
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
        final char[] charArray3 = "F+x!XJ'n7Q[%c7Q1dO3Y+)b'Nndl1^n(-$\\g1hr\u0015".toCharArray();
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
                            c6 = '\u000b';
                            break;
                        }
                        case 1: {
                            c6 = 'D';
                            break;
                        }
                        case 2: {
                            c6 = '\r';
                            break;
                        }
                        case 3: {
                            c6 = 'R';
                            break;
                        }
                        default: {
                            c6 = '=';
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
        final char[] charArray4 = "\"j".toCharArray();
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
                            c8 = '\u000b';
                            break;
                        }
                        case 1: {
                            c8 = 'D';
                            break;
                        }
                        case 2: {
                            c8 = '\r';
                            break;
                        }
                        case 3: {
                            c8 = 'R';
                            break;
                        }
                        default: {
                            c8 = '=';
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
