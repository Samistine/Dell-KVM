package com.avocent.a.a;

import com.avocent.kvm.c.a;
import java.util.prefs.BackingStoreException;
import java.io.Serializable;
import java.util.prefs.Preferences;

public class k
{
    public static final String[][] a;
    protected i b;
    private static final String[] z;
    
    public k(final i b) {
        super();
        this.b = b;
        this.b();
    }
    
    public void a() {
    }
    
    void b() {
        final boolean g = i.G;
        q.a(k.z[3]);
        final Preferences userNodeForPackage = Preferences.userNodeForPackage(k.class);
        int i = 0;
        while (i < k.a.length) {
            final String s = k.a[i][0];
            final String s2 = k.a[i][1];
            final String s3 = k.a[i][2];
            final String s4 = k.a[i][3];
            Serializable s5 = userNodeForPackage.get(s, s2);
            try {
                q.a(k.z[0] + s + "=" + s5);
                if (s3.equalsIgnoreCase(k.z[2])) {
                    s5 = Integer.valueOf(s5.toString().trim());
                }
                else if (s3.equalsIgnoreCase(k.z[8])) {
                    s5 = Boolean.valueOf(s5.toString().trim());
                }
                Label_0221: {
                    if (s4.equalsIgnoreCase(k.z[5])) {
                        this.b.a(s, s5);
                        if (!g) {
                            break Label_0221;
                        }
                    }
                    if (s4.equalsIgnoreCase(k.z[7])) {
                        this.b.a().a(s, s5);
                    }
                }
            }
            catch (Exception ex) {
                q.a(k.z[9] + k.a[i][0] + k.z[1] + k.a[i][0] + k.z[4] + k.a[i][2] + k.z[6] + ex.getMessage());
            }
            ++i;
            if (g) {
                break;
            }
        }
    }
    
    void c() {
        final boolean g = i.G;
        q.a(k.z[10]);
        final Preferences userNodeForPackage = Preferences.userNodeForPackage(k.class);
        int i = 0;
        while (i < k.a.length) {
            final Object c = this.b.c(k.a[i][0]);
            userNodeForPackage.put(k.a[i][0], (c != null) ? c.toString() : "");
            q.a(k.z[0] + k.a[i][0] + "=" + c);
            ++i;
            if (g) {
                break;
            }
        }
        try {
            userNodeForPackage.sync();
        }
        catch (BackingStoreException ex) {
            ex.printStackTrace();
        }
    }
    
    static {
        z = new String[] { z(z("Q4*\u0005\u0016Q4*\u0005\u0016Q4")), z(z("]4|DZ\u0004q7")), z(z("\u0018z~")), z(z("QXeDR\u0018zm\u0005W\u0001dfLU\u0010`cJXQdxJF\u0014f~LS\u0002.")), z(z("]4~\\F\u0014)")), z(z("\u0010dz")), z(z("]4g@E\u0002um@\u000b")), z(z("\u001abg")), z(z("\u0013{eIS\u0010z")), z(z("QQxWY\u00034fJW\u0015}dB\u0016\u0001feUS\u0003`s\u0005X\u0010yo\u0018")), z(z("QGkS_\u001fs*DF\u0001xcFW\u0005}eK\u0016\u0001feUS\u0003`c@EK")) };
        a = new String[][] { { z(z("\u001c{\u007fVS.uiFS\u001d")), a.a.toString(), z(z("\u0002`xLX\u0016")), k.z[5] }, { z(z("7AFie2FO`x")), z(z("\u0017ufVS")), k.z[8], k.z[5] }, { z(z("!UYvb9FEpq9")), z(z("\u0017ufVS")), k.z[8], k.z[5] }, { z(z("3udAA\u0018p~Mb\u0019feQB\u001dq")), "0", k.z[2], k.z[7] }, { z(z("3feRE\u0014fZDB\u0019")), z(z("\u0017}x@P\u001el")), z(z("\u0002`xLX\u0016")), k.z[5] }, { z(z("3feRE\u0014fKWQ\u0002")), z(z("UaxI")), z(z("\u0002`xLX\u0016")), k.z[5] } };
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
        charArray[n] ^= '6';
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
                            c2 = 'q';
                            break;
                        }
                        case 1: {
                            c2 = '\u0014';
                            break;
                        }
                        case 2: {
                            c2 = '\n';
                            break;
                        }
                        case 3: {
                            c2 = '%';
                            break;
                        }
                        default: {
                            c2 = '6';
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
