// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import com.avocent.a.e;
import java.util.HashMap;

public class m {

    static String[][] a;
    static String[][] b;
    protected HashMap c;
    protected HashMap d;
    private static final String[] z;

    public m() {
        final boolean g = i.G;
        this.c = new HashMap();
        this.d = new HashMap();
        int i = 0;
        while (i < m.b.length) {
            this.c.put(m.b[i][0], m.b[i][1]);
            ++i;
            if (g) {
                break;
            }
        }
        int j = 0;
        while (j < m.a.length) {
            this.a(m.a[j][0], m.a[j][1]);
            ++j;
            if (g) {
                break;
            }
        }
    }

    public void a(final String s, final String s2) {
        this.d.put(s.toLowerCase(), s2);
    }

    protected void a(String[] arrstring, e e) {
        boolean bl = i.G;
        this.a(e);
        for (int i = 0; i < arrstring.length; ++i) {
            String string;
            String string2;
            int n = arrstring[i].indexOf("=");
            if (n == -1) {
                continue;
            }
            String[] arrstring2 = new String[]{arrstring[i].substring(0, n), arrstring[i].substring(n + 1)};
            if (arrstring2[0].equalsIgnoreCase(z[10])) {
                this.a(arrstring2[1], e);
                if (!bl) {
                    continue;
                }
            }
            if ((string = (String) this.d.get(arrstring2[0].toLowerCase())) != null) {
                string2 = arrstring2[1].trim();
                if (string2.length() > 1 && string2.charAt(0) == '\"' && string2.charAt(string2.length() - 1) == '\"') {
                    string2 = string2.substring(1, string2.length() - 1);
                }
                q.a(z[9] + string + z[8] + string2 + "'");
                e.a(string, (Object) string2);
                if (!bl) {
                    continue;
                }
            }
            string2 = arrstring2[0];
            String string3 = arrstring2[1].trim();
            if (string3.length() > 1 && string3.charAt(0) == '\"' && string3.charAt(string3.length() - 1) == '\"') {
                string3 = string3.substring(1, string3.length() - 1);
            }
            q.a(z[9] + string2 + z[8] + string3 + "'");
            e.a(string2, (Object) string3);
            if (!bl) {
                continue;
            }
        }
    }

    protected void a(String string, e e) {
        boolean bl = i.G;
        q.a(z[7] + string);
        String[] arrstring = string.split(z[5]);
        for (int i = 0; i < arrstring.length; ++i) {
            String string2;
            String string3;
            String[] arrstring2 = arrstring[i].split(":");
            if (arrstring2.length != 2 || (string3 = (String) this.c.get(string2 = arrstring2[0])) == null) {
                continue;
            }
            q.a(z[6] + string3 + "=" + arrstring2[1]);
            e.a(string3, (Object) arrstring2[1]);
            if (!bl) {
                continue;
            }
        }
    }

    protected void a(final e e) {
        e.a(m.z[4], (Object) m.z[0]);
        e.a(m.z[3], (Object) m.z[2]);
        e.a(m.z[1], (Object) "0");
    }

    static {
        z = new String[]{z(z("V\u0000w}")), z(z("1c\u0004\u001aH4s\u0011")), z(z("\\\u0001xw")), z(z("2`\u000e\u0017]")), z(z("/}\u0011\n[0")), z(z("?\u001ca\u0018")), z(z("Dq%!`\nWa5{\u000b@$7}\u001d\na")), z(z("4Q36`\nWa\u0001ZD@ 1a^\u0010")), z(z("DG(1aDF )|\u0001\u0010f")), z(z("%T%,g\u0003\u001017f\u0014U31p^\u0010")), z(z("\u0014Q5-"))};
        m.a = new String[][]{{z(z("\u0010Y5)l")), z(z("0y\u0015\tL"))}, {z(z("\u0011C$7")), z(z("1c\u0004\u0017G%}\u0004"))}, {z(z("\u0014Q26~\u0000")), z(z("4q\u0012\u0016^+b\u0005"))}, {z(z("\u0012@.7}")), m.z[3]}, {z(z("\u000f]1*{\u0010")), m.z[4]}, {z(z("\u0012U36`\u000b^")), z(z("%f\u0012\u0015V2u\u0013\u0016@+~"))}, {z(z("\fU-5|\u0016\\")), z(z(",u\r\u0015V1b\r"))}, {z(z("\r@")), z(z(",\u007f\u0012\u0011"))}, {z(z("\u0005@\"5")), m.z[1]}, {z(z("\u0017C-3:")), z(z("7c\r\u0013:"))}, {z(z("\u0017U33l\u0016[$<")), z(z("7u\u0013\u0013L6o\n\u0000P"))}, {z(z("\u0016Y1")), z(z("6y\u0011"))}, {z(z("\u0014_31")), z(z("4\u007f\u0013\u0011"))}, {z(z("\u0007X +g\u0001\\")), z(z("'x\u0000\u000bG!|"))}, {z(z("\u0000U#0n")), z(z(" u\u0003\u0010N"))}};
        m.b = new String[][]{{"a", z(z(",\u007f\u0012\u0011"))}, {"p", z(z("4\u007f\u0013\u0011"))}, {"r", z(z("6y\u0011"))}, {"c", z(z("'x\u0000\u000bG!|"))}, {"e", m.z[1]}, {"s", z(z("0q\u0013\u0002L0o\u000f\u0004D!"))}};
    }

    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        int i;
        do {
            i = charArray.length;
            if (i < 2) {
                continue;
            }
            return charArray;
        } while (i == 0);
        final int n = 0;
        charArray[n] ^= '\t';
        return charArray;
    }

    private static String z(final char[] array) {
        int length;
        int n2;
        final int n = n2 = (length = array.length);
        int n3 = 0;
        while (true) {
            Label_0086:
            {
                if (n > 1) {
                    break Label_0086;
                }
                length = (n2 = n3);
                do {
                    final char c = array[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = 'd';
                            break;
                        }
                        case 1: {
                            c2 = '0';
                            break;
                        }
                        case 2: {
                            c2 = 'A';
                            break;
                        }
                        case 3: {
                            c2 = 'E';
                            break;
                        }
                        default: {
                            c2 = '\t';
                            break;
                        }
                    }
                    array[length] = (char) (c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                return new String(array).intern();
            }
            continue;
        }
    }
}
