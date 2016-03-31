// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import java.lang.reflect.InvocationTargetException;
import java.awt.peer.WindowPeer;
import java.awt.Window;
import com.avocent.kvm.b.f.b;
import javax.swing.SwingUtilities;
import java.awt.Component;
import java.util.HashMap;

public class NativeKVM {

    protected static HashMap a;
    public static int b;
    private static final String[] z;

    public static void a(final Component component, final boolean b) throws Exception {
        final Window windowAncestor = SwingUtilities.getWindowAncestor(component);
        e e = NativeKVM.a.get(windowAncestor);
        if (e == null) {
            e = new e("", b.a());
            e.a(windowAncestor, null);
        }
        e.a(b);
    }

    public static void a(final Component component, final int n, final int n2) {
        final Window windowAncestor = SwingUtilities.getWindowAncestor(component);
        e e = NativeKVM.a.get(windowAncestor);
        if (e == null) {
            e = new e("", com.avocent.kvm.b.f.b.a());
            e.a(windowAncestor, null);
        }
        e.a(n, n2);
    }

    public static void a(final Component component, final NativeKeyEventListener nativeKeyEventListener, final String s, final com.avocent.kvm.b.f.e e) throws Exception {
        final Window windowAncestor = SwingUtilities.getWindowAncestor(component);
        if (windowAncestor == null) {
            System.out.println(NativeKVM.z[13]);
            break;
        }
        e e2 = NativeKVM.a.get(windowAncestor);
        if (e2 == null) {
            e2 = new e(s, e);
            NativeKVM.a.put(windowAncestor, e2);
        }
        e2.a(windowAncestor, nativeKeyEventListener);
    }

    static long a(final Component component) {
        long n = -1L;
        final Window window = (Window) ((component instanceof Window) ? component : SwingUtilities.getWindowAncestor(component));
        final WindowPeer windowPeer = (WindowPeer) window.getPeer();
        final String property = System.getProperty(NativeKVM.z[12]);
        String s = NativeKVM.z[10];
        String s2 = NativeKVM.z[5];
        if (property.startsWith(NativeKVM.z[0]) || property.startsWith(NativeKVM.z[2])) {
            s = NativeKVM.z[8];
            s2 = NativeKVM.z[3];
        }
        System.out.println(NativeKVM.z[1] + property + "]");
        System.out.println(NativeKVM.z[11] + s + "]");
        System.out.println(NativeKVM.z[11] + s2 + "]");
        System.out.println(NativeKVM.z[6] + windowPeer.toString() + "]");
        try {
            final Class<?> forName = Class.forName(s);
            try {
                Thread.sleep(100L);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            Label_0383:
            {
                if (forName != null && forName.isInstance(windowPeer)) {
                    try {
                        n = (long) forName.getMethod(s2, (Class<?>[]) null).invoke(windowPeer, (Object[]) null);
                        break Label_0383;
                    } catch (NoSuchMethodException ex2) {
                        System.out.println(ex2.getMessage());
                        break Label_0383;
                    } catch (IllegalAccessException ex3) {
                        System.out.println(ex3.getMessage());
                        break Label_0383;
                    } catch (InvocationTargetException ex4) {
                        System.out.println(ex4.getMessage());
                        if (NativeKVM.b == 0) {
                            break Label_0383;
                        }
                    }
                }
                System.out.println(NativeKVM.z[9]);
            }
        } catch (ClassNotFoundException ex5) {
            System.out.println(NativeKVM.z[7]);
        }
        if (n < 0L) {
            n = c(window);
        }
        System.out.println(NativeKVM.z[4] + n);
        return n;
    }

    static long b(final Component component) {
        final Window window = (Window) ((component instanceof Window) ? component : SwingUtilities.getWindowAncestor(component));
        window.getPreferredSize();
        final long c = c(window);
        System.out.println(NativeKVM.z[4] + c);
        return c;
    }

    public static long c(final Component component) {
        try {
            final k k = new k(component);
            if (SwingUtilities.isEventDispatchThread()) {
                k.run();
                if (NativeKVM.b == 0) {
                    return k.a();
                }
            }
            SwingUtilities.invokeAndWait(k);
            return k.a();
        } catch (Throwable t) {
            t.printStackTrace();
            return -1L;
        }
    }

    static native int getLibraryId();

    static native long getWindowId(final Component p0);

    static native boolean registerWindowById(final long p0, final NativeKeyEventListener p1);

    static native void unregisterWindowById(final long p0);

    static native void setPassthroughEnabled(final long p0, final boolean p1);

    static native void setCursorLocation(final long p0, final int p1, final int p2);

    static {
        final String[] z2 = new String[14];
        final int n = 0;
        final char[] charArray = "x\u000f<".toCharArray();
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
                            c2 = 'I';
                            break;
                        }
                        case 1: {
                            c2 = '!';
                            break;
                        }
                        case 2: {
                            c2 = '\b';
                            break;
                        }
                        case 3: {
                            c2 = '\u0007';
                            break;
                        }
                        default: {
                            c2 = '\u0013';
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
        final char[] charArray2 = "\u0003@~f3\u001fDztz&O('3iz".toCharArray();
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
                            c4 = 'I';
                            break;
                        }
                        case 1: {
                            c4 = '!';
                            break;
                        }
                        case 2: {
                            c4 = '\b';
                            break;
                        }
                        case 3: {
                            c4 = '\u0007';
                            break;
                        }
                        default: {
                            c4 = '\u0013';
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
        final char[] charArray3 = "x\u000f=".toCharArray();
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
                            c6 = 'I';
                            break;
                        }
                        case 1: {
                            c6 = '!';
                            break;
                        }
                        case 2: {
                            c6 = '\b';
                            break;
                        }
                        case 3: {
                            c6 = '\u0007';
                            break;
                        }
                        default: {
                            c6 = '\u0013';
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
        final char[] charArray4 = ".D|D|'Umig\u001eHfc|>".toCharArray();
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
                            c8 = 'I';
                            break;
                        }
                        case 1: {
                            c8 = '!';
                            break;
                        }
                        case 2: {
                            c8 = '\b';
                            break;
                        }
                        case 3: {
                            c8 = '\u0007';
                            break;
                        }
                        default: {
                            c8 = '\u0013';
                            break;
                        }
                    }
                    charArray4[length4] = (char) (c7 ^ c8);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 > n16) {
                continue;
            }
            break;
        }
        z2[n13] = new String(charArray4).intern();
        final int n17 = 4;
        final char[] charArray5 = "ioisz?D(pz'Egp3\u0000e2'".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0562:
            {
                if (n18 > 1) {
                    break Label_0562;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = 'I';
                            break;
                        }
                        case 1: {
                            c10 = '!';
                            break;
                        }
                        case 2: {
                            c10 = '\b';
                            break;
                        }
                        case 3: {
                            c10 = '\u0007';
                            break;
                        }
                        default: {
                            c10 = '\u0013';
                            break;
                        }
                    }
                    charArray5[length5] = (char) (c9 ^ c10);
                    ++n20;
                } while (n18 == 0);
            }
            if (n18 > n20) {
                continue;
            }
            break;
        }
        z2[n17] = new String(charArray5).intern();
        final int n21 = 5;
        final char[] charArray6 = "1fmsZ'Q}sU&B}t".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0678:
            {
                if (n22 > 1) {
                    break Label_0678;
                }
                length6 = (n23 = n24);
                do {
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = 'I';
                            break;
                        }
                        case 1: {
                            c12 = '!';
                            break;
                        }
                        case 2: {
                            c12 = '\b';
                            break;
                        }
                        case 3: {
                            c12 = '\u0007';
                            break;
                        }
                        default: {
                            c12 = '\u0013';
                            break;
                        }
                    }
                    charArray6[length6] = (char) (c11 ^ c12);
                    ++n24;
                } while (n22 == 0);
            }
            if (n22 > n24) {
                continue;
            }
            break;
        }
        z2[n21] = new String(charArray6).intern();
        final int n25 = 6;
        final char[] charArray7 = "\u001eHfc|>\u0001Xbv;\u0001('3iz".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0798:
            {
                if (n26 > 1) {
                    break Label_0798;
                }
                length7 = (n27 = n28);
                do {
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = 'I';
                            break;
                        }
                        case 1: {
                            c14 = '!';
                            break;
                        }
                        case 2: {
                            c14 = '\b';
                            break;
                        }
                        case 3: {
                            c14 = '\u0007';
                            break;
                        }
                        default: {
                            c14 = '\u0013';
                            break;
                        }
                    }
                    charArray7[length7] = (char) (c13 ^ c14);
                    ++n28;
                } while (n26 == 0);
            }
            if (n26 > n28) {
                continue;
            }
            break;
        }
        z2[n25] = new String(charArray7).intern();
        final int n29 = 7;
        final char[] charArray8 = "\rHl'}&U(az'E(Mr?@(6=|\u0001P6\"iQmbaiBgjc&OmigiBdf`:\u000f".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0918:
            {
                if (n30 > 1) {
                    break Label_0918;
                }
                length8 = (n31 = n32);
                do {
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = 'I';
                            break;
                        }
                        case 1: {
                            c16 = '!';
                            break;
                        }
                        case 2: {
                            c16 = '\b';
                            break;
                        }
                        case 3: {
                            c16 = '\u0007';
                            break;
                        }
                        default: {
                            c16 = '\u0013';
                            break;
                        }
                    }
                    charArray8[length8] = (char) (c15 ^ c16);
                    ++n32;
                } while (n30 == 0);
            }
            if (n30 > n32) {
                continue;
            }
            break;
        }
        z2[n29] = new String(charArray8).intern();
        final int n33 = 8;
        final char[] charArray9 = ":Tf)r>U&_\"xbgjc&Omig\u0019Dmu".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1038:
            {
                if (n34 > 1) {
                    break Label_1038;
                }
                length9 = (n35 = n36);
                do {
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = 'I';
                            break;
                        }
                        case 1: {
                            c18 = '!';
                            break;
                        }
                        case 2: {
                            c18 = '\b';
                            break;
                        }
                        case 3: {
                            c18 = '\u0007';
                            break;
                        }
                        default: {
                            c18 = '\u0013';
                            break;
                        }
                    }
                    charArray9[length9] = (char) (c17 ^ c18);
                    ++n36;
                } while (n34 == 0);
            }
            if (n34 > n36) {
                continue;
            }
            break;
        }
        z2[n33] = new String(charArray9).intern();
        final int n37 = 9;
        final char[] charArray10 = "iqmbaiBgjc&OmigiH{'}&U(f}iHftg(Okb3&G(f3\u0011\u00109D|$Qgiv'UXbv;".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1158:
            {
                if (n38 > 1) {
                    break Label_1158;
                }
                length10 = (n39 = n40);
                do {
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = 'I';
                            break;
                        }
                        case 1: {
                            c20 = '!';
                            break;
                        }
                        case 2: {
                            c20 = '\b';
                            break;
                        }
                        case 3: {
                            c20 = '\u0007';
                            break;
                        }
                        default: {
                            c20 = '\u0013';
                            break;
                        }
                    }
                    charArray10[length10] = (char) (c19 ^ c20);
                    ++n40;
                } while (n38 == 0);
            }
            if (n38 > n40) {
                continue;
            }
            break;
        }
        z2[n37] = new String(charArray10).intern();
        final int n41 = 10;
        final char[] charArray11 = ":Tf)r>U&_\"x\u000fPAa(LmWv,S".toCharArray();
        int length11;
        int n43;
        final int n42 = n43 = (length11 = charArray11.length);
        int n44 = 0;
        while (true) {
            Label_1278:
            {
                if (n42 > 1) {
                    break Label_1278;
                }
                length11 = (n43 = n44);
                do {
                    final char c21 = charArray11[n43];
                    char c22 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c22 = 'I';
                            break;
                        }
                        case 1: {
                            c22 = '!';
                            break;
                        }
                        case 2: {
                            c22 = '\b';
                            break;
                        }
                        case 3: {
                            c22 = '\u0007';
                            break;
                        }
                        default: {
                            c22 = '\u0013';
                            break;
                        }
                    }
                    charArray11[length11] = (char) (c21 ^ c22);
                    ++n44;
                } while (n42 == 0);
            }
            if (n42 > n44) {
                continue;
            }
            break;
        }
        z2[n41] = new String(charArray11).intern();
        final int n45 = 11;
        final char[] charArray12 = "\u0019Dmu3\nMit`ioijviz".toCharArray();
        int length12;
        int n47;
        final int n46 = n47 = (length12 = charArray12.length);
        int n48 = 0;
        while (true) {
            Label_1398:
            {
                if (n46 > 1) {
                    break Label_1398;
                }
                length12 = (n47 = n48);
                do {
                    final char c23 = charArray12[n47];
                    char c24 = '\0';
                    switch (n48 % 5) {
                        case 0: {
                            c24 = 'I';
                            break;
                        }
                        case 1: {
                            c24 = '!';
                            break;
                        }
                        case 2: {
                            c24 = '\b';
                            break;
                        }
                        case 3: {
                            c24 = '\u0007';
                            break;
                        }
                        default: {
                            c24 = '\u0013';
                            break;
                        }
                    }
                    charArray12[length12] = (char) (c23 ^ c24);
                    ++n48;
                } while (n46 == 0);
            }
            if (n46 > n48) {
                continue;
            }
            break;
        }
        z2[n45] = new String(charArray12).intern();
        final int n49 = 12;
        final char[] charArray13 = "#@~f=?Dztz&O".toCharArray();
        int length13;
        int n51;
        final int n50 = n51 = (length13 = charArray13.length);
        int n52 = 0;
        while (true) {
            Label_1518:
            {
                if (n50 > 1) {
                    break Label_1518;
                }
                length13 = (n51 = n52);
                do {
                    final char c25 = charArray13[n51];
                    char c26 = '\0';
                    switch (n52 % 5) {
                        case 0: {
                            c26 = 'I';
                            break;
                        }
                        case 1: {
                            c26 = '!';
                            break;
                        }
                        case 2: {
                            c26 = '\b';
                            break;
                        }
                        case 3: {
                            c26 = '\u0007';
                            break;
                        }
                        default: {
                            c26 = '\u0013';
                            break;
                        }
                    }
                    charArray13[length13] = (char) (c25 ^ c26);
                    ++n52;
                } while (n50 == 0);
            }
            if (n50 > n52) {
                continue;
            }
            break;
        }
        z2[n49] = new String(charArray13).intern();
        final int n53 = 13;
        final char[] charArray14 = "iwacv&qiiv%\u0001ffg Wm'{&Nc'q,Hf`3:D|'q,GguviQiiv%\u0001\u007ff`i@lcv-\u0001|h3(\u0001_n}-N\u007f)".toCharArray();
        int length14;
        int n55;
        final int n54 = n55 = (length14 = charArray14.length);
        int n56 = 0;
        while (true) {
            Label_1638:
            {
                if (n54 > 1) {
                    break Label_1638;
                }
                length14 = (n55 = n56);
                do {
                    final char c27 = charArray14[n55];
                    char c28 = '\0';
                    switch (n56 % 5) {
                        case 0: {
                            c28 = 'I';
                            break;
                        }
                        case 1: {
                            c28 = '!';
                            break;
                        }
                        case 2: {
                            c28 = '\b';
                            break;
                        }
                        case 3: {
                            c28 = '\u0007';
                            break;
                        }
                        default: {
                            c28 = '\u0013';
                            break;
                        }
                    }
                    charArray14[length14] = (char) (c27 ^ c28);
                    ++n56;
                } while (n54 == 0);
            }
            if (n54 <= n56) {
                z2[n53] = new String(charArray14).intern();
                z = z2;
                NativeKVM.a = new HashMap();
                break;
            }
            continue;
        }
    }
}
