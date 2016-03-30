package com.avocent.a.a;

import com.avocent.a.e;
import java.util.HashMap;

public class m
{
    static String[][] a;
    static String[][] b;
    protected HashMap c;
    protected HashMap d;
    private static final String[] z;
    
    public m() {
        final boolean g = i.G;
        super();
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
    
    protected void a(final String[] array, final e e) {
        final boolean g = i.G;
        this.a(e);
        int i = 0;
        while (i < array.length) {
            final int index = array[i].indexOf("=");
            Label_0360: {
                if (index != -1) {
                    final String[] array2 = { array[i].substring(0, index), array[i].substring(index + 1) };
                    if (array2[0].equalsIgnoreCase(m.z[10])) {
                        this.a(array2[1], e);
                        if (!g) {
                            break Label_0360;
                        }
                    }
                    final String s = this.d.get(array2[0].toLowerCase());
                    if (s != null) {
                        String s2 = array2[1].trim();
                        if (s2.length() > 1 && s2.charAt(0) == '\"' && s2.charAt(s2.length() - 1) == '\"') {
                            s2 = s2.substring(1, s2.length() - 1);
                        }
                        q.a(m.z[9] + s + m.z[8] + s2 + "'");
                        e.a(s, (Object)s2);
                        if (!g) {
                            break Label_0360;
                        }
                    }
                    final String s3 = array2[0];
                    String s4 = array2[1].trim();
                    if (s4.length() > 1 && s4.charAt(0) == '\"' && s4.charAt(s4.length() - 1) == '\"') {
                        s4 = s4.substring(1, s4.length() - 1);
                    }
                    q.a(m.z[9] + s3 + m.z[8] + s4 + "'");
                    e.a(s3, (Object)s4);
                }
            }
            ++i;
            if (g) {
                break;
            }
        }
    }
    
    protected void a(final String s, final e e) {
        final boolean g = i.G;
        q.a(m.z[7] + s);
        final String[] split = s.split(m.z[5]);
        int i = 0;
        while (i < split.length) {
            final String[] split2 = split[i].split(":");
            if (split2.length == 2) {
                final String s2 = this.c.get(split2[0]);
                if (s2 != null) {
                    q.a(m.z[6] + s2 + "=" + split2[1]);
                    e.a(s2, (Object)split2[1]);
                }
            }
            ++i;
            if (g) {
                break;
            }
        }
    }
    
    protected void a(final e e) {
        e.a(m.z[4], (Object)m.z[0]);
        e.a(m.z[3], (Object)m.z[2]);
        e.a(m.z[1], (Object)"0");
    }
    
    static {
        z = new String[] { z(z("V\u0000w}")), z(z("1c\u0004\u001aH4s\u0011")), z(z("\\\u0001xw")), z(z("2`\u000e\u0017]")), z(z("/}\u0011\n[0")), z(z("?\u001ca\u0018")), z(z("Dq%!`\nWa5{\u000b@$7}\u001d\na")), z(z("4Q36`\nWa\u0001ZD@ 1a^\u0010")), z(z("DG(1aDF )|\u0001\u0010f")), z(z("%T%,g\u0003\u001017f\u0014U31p^\u0010")), z(z("\u0014Q5-")) };
        m.a = new String[][] { { z(z("\u0010Y5)l")), z(z("0y\u0015\tL")) }, { z(z("\u0011C$7")), z(z("1c\u0004\u0017G%}\u0004")) }, { z(z("\u0014Q26~\u0000")), z(z("4q\u0012\u0016^+b\u0005")) }, { z(z("\u0012@.7}")), m.z[3] }, { z(z("\u000f]1*{\u0010")), m.z[4] }, { z(z("\u0012U36`\u000b^")), z(z("%f\u0012\u0015V2u\u0013\u0016@+~")) }, { z(z("\fU-5|\u0016\\")), z(z(",u\r\u0015V1b\r")) }, { z(z("\r@")), z(z(",\u007f\u0012\u0011")) }, { z(z("\u0005@\"5")), m.z[1] }, { z(z("\u0017C-3:")), z(z("7c\r\u0013:")) }, { z(z("\u0017U33l\u0016[$<")), z(z("7u\u0013\u0013L6o\n\u0000P")) }, { z(z("\u0016Y1")), z(z("6y\u0011")) }, { z(z("\u0014_31")), z(z("4\u007f\u0013\u0011")) }, { z(z("\u0007X +g\u0001\\")), z(z("'x\u0000\u000bG!|")) }, { z(z("\u0000U#0n")), z(z(" u\u0003\u0010N")) } };
        m.b = new String[][] { { "a", z(z(",\u007f\u0012\u0011")) }, { "p", z(z("4\u007f\u0013\u0011")) }, { "r", z(z("6y\u0011")) }, { "c", z(z("'x\u0000\u000bG!|")) }, { "e", m.z[1] }, { "s", z(z("0q\u0013\u0002L0o\u000f\u0004D!")) } };
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
            Label_0086: {
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
                    array[length] = (char)(c ^ c2);
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
