package com.avocent.kvm.nativekeyboard;

import java.awt.event.WindowEvent;
import com.avocent.kvm.b.d.a;
import javax.swing.SwingUtilities;
import java.awt.Component;
import java.awt.Window;
import com.avocent.kvm.b.f.e;
import java.awt.event.WindowListener;

class e implements WindowListener
{
    protected boolean a;
    protected NativeKeyEventListener b;
    protected Thread c;
    protected long d;
    protected String e;
    protected e f;
    private static final String[] z;
    
    public e(final String e, final e f) {
        super();
        this.a = false;
        this.e = e;
        this.f = f;
    }
    
    protected void a(final Window window) {
        this.f.a(e.z[9], e.z[8] + this.e + e.z[7]);
        if (window.isVisible() && window.isDisplayable()) {
            final int libraryId = NativeKVM.getLibraryId();
            long n = -1L;
            Label_0098: {
                if (libraryId == 1) {
                    n = NativeKVM.a(window);
                    if (NativeKVM.b == 0) {
                        break Label_0098;
                    }
                }
                if (libraryId == 2) {
                    n = NativeKVM.b(window);
                }
            }
            if (n != -1L) {
                this.a(false);
                NativeKVM.unregisterWindowById(n);
            }
        }
    }
    
    public synchronized void a(final boolean a) {
        this.a = a;
        if (this.c != null) {
            NativeKVM.setPassthroughEnabled(this.d, this.a);
        }
    }
    
    public synchronized void a(final int n, final int n2) {
        SwingUtilities.invokeLater(new f(this, n, n2));
    }
    
    public void a(final Window window, final NativeKeyEventListener b) {
        this.b = b;
        window.addWindowListener(this);
        System.out.println(e.z[10] + window.isVisible() + e.z[11] + window.isDisplayable() + e.z[6]);
        if (window != null && window.isVisible() && window.isDisplayable()) {
            this.b(window);
        }
    }
    
    void b(final Window window) {
        int b = NativeKVM.b;
        final int libraryId = NativeKVM.getLibraryId();
        this.d = -1L;
        Label_0047: {
            if (libraryId == 1) {
                this.d = NativeKVM.a(window);
                if (b == 0) {
                    break Label_0047;
                }
            }
            if (libraryId == 2) {
                this.d = NativeKVM.b(window);
            }
        }
        System.out.println(e.z[3] + libraryId + e.z[5] + this.d + e.z[6]);
        if (this.d == -1L) {
            throw new RuntimeException(e.z[2] + libraryId + e.z[4]);
        }
        synchronized (this) {
            NativeKVM.setPassthroughEnabled(this.d, this.a);
            this.c = new l(this);
        }
        this.c.start();
        if (a.c != 0) {
            NativeKVM.b = ++b;
        }
    }
    
    public void windowClosed(final WindowEvent windowEvent) {
        System.out.println(e.z[12]);
        this.a(windowEvent.getWindow());
    }
    
    public void windowOpened(final WindowEvent windowEvent) {
        System.out.println(e.z[13]);
        this.b(windowEvent.getWindow());
    }
    
    public void windowActivated(final WindowEvent windowEvent) {
        System.out.println(e.z[1] + this.a);
        if (this.a) {
            NativeKVM.setPassthroughEnabled(this.d, this.a);
        }
    }
    
    public void windowClosing(final WindowEvent windowEvent) {
        NativeKVM.setPassthroughEnabled(this.d, false);
    }
    
    public void windowDeactivated(final WindowEvent windowEvent) {
        System.out.println(e.z[0] + this.d);
        NativeKVM.setPassthroughEnabled(this.d, false);
    }
    
    public void windowIconified(final WindowEvent windowEvent) {
        NativeKVM.setPassthroughEnabled(this.d, false);
    }
    
    public void windowDeiconified(final WindowEvent windowEvent) {
        if (this.a) {
            NativeKVM.setPassthroughEnabled(this.d, this.a);
        }
    }
    
    static {
        final String[] z2 = new String[14];
        final int n = 0;
        final char[] charArray = "NC\u0003aHL\"\u007f\u0006!+>@%\f\u000b\u001ee\"\u001b\u0010\fG.\u001aMI~\"\u0006\u0000\u0006^k\f\u0001\bJ?\u0001\u0012\b].\fJID\u0014\u001f\r\u0007M$\u001f-\r\u0014".toCharArray();
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
                            c2 = 'd';
                            break;
                        }
                        case 1: {
                            c2 = 'i';
                            break;
                        }
                        case 2: {
                            c2 = ')';
                            break;
                        }
                        case 3: {
                            c2 = 'K';
                            break;
                        }
                        default: {
                            c2 = 'h';
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
        final char[] charArray2 = "NC\u0003aHL\"\u007f\u0006!+>@%\f\u000b\u001ee\"\u001b\u0010\fG.\u001aMI~\"\u0006\u0000\u0006^k\t\u0007\u001d@=\t\u0010\fMe\u0005;\u0019H8\u001b\u0010\u0001[$\u001d\u0003\u0001l%\t\u0006\u0005L/U".toCharArray();
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
                            c4 = 'd';
                            break;
                        }
                        case 1: {
                            c4 = 'i';
                            break;
                        }
                        case 2: {
                            c4 = ')';
                            break;
                        }
                        case 3: {
                            c4 = 'K';
                            break;
                        }
                        default: {
                            c4 = 'h';
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
        final char[] charArray3 = "/?dk\u0006\u0005\u001d@=\rD\u001a\\;\u0018\u000b\u001b]k\u0006\u000b\u001d\t*\u001e\u0005\u0000E*\n\b\f\tc'76`\u000fU".toCharArray();
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
                            c6 = 'd';
                            break;
                        }
                        case 1: {
                            c6 = 'i';
                            break;
                        }
                        case 2: {
                            c6 = ')';
                            break;
                        }
                        case 3: {
                            c6 = 'K';
                            break;
                        }
                        default: {
                            c6 = 'h';
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
        final char[] charArray4 = "NC\u0003aHL\"\u007f\u0006!+>@%\f\u000b\u001ee\"\u001b\u0010\fG.\u001aMIZ?\t\u0016\u001dy9\u0007\u0007\fZ8\u0001\n\u000e\t'\u0001\u0006 Mv".toCharArray();
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
                            c8 = 'd';
                            break;
                        }
                        case 1: {
                            c8 = 'i';
                            break;
                        }
                        case 2: {
                            c8 = ')';
                            break;
                        }
                        case 3: {
                            c8 = 'K';
                            break;
                        }
                        default: {
                            c8 = 'h';
                            break;
                        }
                    }
                    charArray4[length4] = (char)(c7 ^ c8);
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
        final char[] charArray5 = "MG".toCharArray();
        int length5;
        int n19;
        final int n18 = n19 = (length5 = charArray5.length);
        int n20 = 0;
        while (true) {
            Label_0562: {
                if (n18 > 1) {
                    break Label_0562;
                }
                length5 = (n19 = n20);
                do {
                    final char c9 = charArray5[n19];
                    char c10 = '\0';
                    switch (n20 % 5) {
                        case 0: {
                            c10 = 'd';
                            break;
                        }
                        case 1: {
                            c10 = 'i';
                            break;
                        }
                        case 2: {
                            c10 = ')';
                            break;
                        }
                        case 3: {
                            c10 = 'K';
                            break;
                        }
                        default: {
                            c10 = 'h';
                            break;
                        }
                    }
                    charArray5[length5] = (char)(c9 ^ c10);
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
        final char[] charArray6 = "HID\u0014\u001f\r\u0007M$\u001f-\r\u0014".toCharArray();
        int length6;
        int n23;
        final int n22 = n23 = (length6 = charArray6.length);
        int n24 = 0;
        while (true) {
            Label_0678: {
                if (n22 > 1) {
                    break Label_0678;
                }
                length6 = (n23 = n24);
                do {
                    final char c11 = charArray6[n23];
                    char c12 = '\0';
                    switch (n24 % 5) {
                        case 0: {
                            c12 = 'd';
                            break;
                        }
                        case 1: {
                            c12 = 'i';
                            break;
                        }
                        case 2: {
                            c12 = ')';
                            break;
                        }
                        case 3: {
                            c12 = 'K';
                            break;
                        }
                        default: {
                            c12 = 'h';
                            break;
                        }
                    }
                    charArray6[length6] = (char)(c11 ^ c12);
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
        final char[] charArray7 = "NC\u0003a".toCharArray();
        int length7;
        int n27;
        final int n26 = n27 = (length7 = charArray7.length);
        int n28 = 0;
        while (true) {
            Label_0798: {
                if (n26 > 1) {
                    break Label_0798;
                }
                length7 = (n27 = n28);
                do {
                    final char c13 = charArray7[n27];
                    char c14 = '\0';
                    switch (n28 % 5) {
                        case 0: {
                            c14 = 'd';
                            break;
                        }
                        case 1: {
                            c14 = 'i';
                            break;
                        }
                        case 2: {
                            c14 = ')';
                            break;
                        }
                        case 3: {
                            c14 = 'K';
                            break;
                        }
                        default: {
                            c14 = 'h';
                            break;
                        }
                    }
                    charArray7[length7] = (char)(c13 ^ c14);
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
        final char[] charArray8 = "D\u000f[$\u0005D\u0007H?\u0001\u0012\f\t.\u001e\u0001\u0007]k\u0000\u0005\u0007M'\r\u0016G".toCharArray();
        int length8;
        int n31;
        final int n30 = n31 = (length8 = charArray8.length);
        int n32 = 0;
        while (true) {
            Label_0918: {
                if (n30 > 1) {
                    break Label_0918;
                }
                length8 = (n31 = n32);
                do {
                    final char c15 = charArray8[n31];
                    char c16 = '\0';
                    switch (n32 % 5) {
                        case 0: {
                            c16 = 'd';
                            break;
                        }
                        case 1: {
                            c16 = 'i';
                            break;
                        }
                        case 2: {
                            c16 = ')';
                            break;
                        }
                        case 3: {
                            c16 = 'K';
                            break;
                        }
                        default: {
                            c16 = 'h';
                            break;
                        }
                    }
                    charArray8[length8] = (char)(c15 ^ c16);
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
        final char[] charArray9 = "'\bE'H\u0010\u0006\t>\u0006\u0016\fN\"\u001b\u0010\f[k\u001f\r\u0007M$\u001fD".toCharArray();
        int length9;
        int n35;
        final int n34 = n35 = (length9 = charArray9.length);
        int n36 = 0;
        while (true) {
            Label_1038: {
                if (n34 > 1) {
                    break Label_1038;
                }
                length9 = (n35 = n36);
                do {
                    final char c17 = charArray9[n35];
                    char c18 = '\0';
                    switch (n36 % 5) {
                        case 0: {
                            c18 = 'd';
                            break;
                        }
                        case 1: {
                            c18 = 'i';
                            break;
                        }
                        case 2: {
                            c18 = ')';
                            break;
                        }
                        case 3: {
                            c18 = 'K';
                            break;
                        }
                        default: {
                            c18 = 'h';
                            break;
                        }
                    }
                    charArray9[length9] = (char)(c17 ^ c18);
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
        final char[] charArray10 = "/?d\u0002'3\u0000G/\u0007\u0013%@8\u001c\u0001\u0007L9".toCharArray();
        int length10;
        int n39;
        final int n38 = n39 = (length10 = charArray10.length);
        int n40 = 0;
        while (true) {
            Label_1158: {
                if (n38 > 1) {
                    break Label_1158;
                }
                length10 = (n39 = n40);
                do {
                    final char c19 = charArray10[n39];
                    char c20 = '\0';
                    switch (n40 % 5) {
                        case 0: {
                            c20 = 'd';
                            break;
                        }
                        case 1: {
                            c20 = 'i';
                            break;
                        }
                        case 2: {
                            c20 = ')';
                            break;
                        }
                        case 3: {
                            c20 = 'K';
                            break;
                        }
                        default: {
                            c20 = 'h';
                            break;
                        }
                    }
                    charArray10[length10] = (char)(c19 ^ c20);
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
        final char[] charArray11 = "NC\u0003aHL\"\u007f\u0006!+>@%\f\u000b\u001ee\"\u001b\u0010\fG.\u001aMIZ.\u001c\u0011\u0019\t<F\r\u001a\u007f\"\u001b\r\u000bE.@MT".toCharArray();
        int length11;
        int n43;
        final int n42 = n43 = (length11 = charArray11.length);
        int n44 = 0;
        while (true) {
            Label_1278: {
                if (n42 > 1) {
                    break Label_1278;
                }
                length11 = (n43 = n44);
                do {
                    final char c21 = charArray11[n43];
                    char c22 = '\0';
                    switch (n44 % 5) {
                        case 0: {
                            c22 = 'd';
                            break;
                        }
                        case 1: {
                            c22 = 'i';
                            break;
                        }
                        case 2: {
                            c22 = ')';
                            break;
                        }
                        case 3: {
                            c22 = 'K';
                            break;
                        }
                        default: {
                            c22 = 'h';
                            break;
                        }
                    }
                    charArray11[length11] = (char)(c21 ^ c22);
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
        final char[] charArray12 = "H\u001e\u0007\"\u001b \u0000Z;\u0004\u0005\u0010H)\u0004\u0001A\u0000v".toCharArray();
        int length12;
        int n47;
        final int n46 = n47 = (length12 = charArray12.length);
        int n48 = 0;
        while (true) {
            Label_1398: {
                if (n46 > 1) {
                    break Label_1398;
                }
                length12 = (n47 = n48);
                do {
                    final char c23 = charArray12[n47];
                    char c24 = '\0';
                    switch (n48 % 5) {
                        case 0: {
                            c24 = 'd';
                            break;
                        }
                        case 1: {
                            c24 = 'i';
                            break;
                        }
                        case 2: {
                            c24 = ')';
                            break;
                        }
                        case 3: {
                            c24 = 'K';
                            break;
                        }
                        default: {
                            c24 = 'h';
                            break;
                        }
                    }
                    charArray12[length12] = (char)(c23 ^ c24);
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
        final char[] charArray13 = "NC\u0003aHL\"\u007f\u0006!+>@%\f\u000b\u001ee\"\u001b\u0010\fG.\u001aMI\t<\u0001\n\rF<+\b\u0006Z.\fJG\u0007".toCharArray();
        int length13;
        int n51;
        final int n50 = n51 = (length13 = charArray13.length);
        int n52 = 0;
        while (true) {
            Label_1518: {
                if (n50 > 1) {
                    break Label_1518;
                }
                length13 = (n51 = n52);
                do {
                    final char c25 = charArray13[n51];
                    char c26 = '\0';
                    switch (n52 % 5) {
                        case 0: {
                            c26 = 'd';
                            break;
                        }
                        case 1: {
                            c26 = 'i';
                            break;
                        }
                        case 2: {
                            c26 = ')';
                            break;
                        }
                        case 3: {
                            c26 = 'K';
                            break;
                        }
                        default: {
                            c26 = 'h';
                            break;
                        }
                    }
                    charArray13[length13] = (char)(c25 ^ c26);
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
        final char[] charArray14 = "NC\u0003aHL\"\u007f\u0006!+>@%\f\u000b\u001ee\"\u001b\u0010\fG.\u001aMI^\"\u0006\u0000\u0006^\u0004\u0018\u0001\u0007L/FJG".toCharArray();
        int length14;
        int n55;
        final int n54 = n55 = (length14 = charArray14.length);
        int n56 = 0;
        while (true) {
            Label_1638: {
                if (n54 > 1) {
                    break Label_1638;
                }
                length14 = (n55 = n56);
                do {
                    final char c27 = charArray14[n55];
                    char c28 = '\0';
                    switch (n56 % 5) {
                        case 0: {
                            c28 = 'd';
                            break;
                        }
                        case 1: {
                            c28 = 'i';
                            break;
                        }
                        case 2: {
                            c28 = ')';
                            break;
                        }
                        case 3: {
                            c28 = 'K';
                            break;
                        }
                        default: {
                            c28 = 'h';
                            break;
                        }
                    }
                    charArray14[length14] = (char)(c27 ^ c28);
                    ++n56;
                } while (n54 == 0);
            }
            if (n54 <= n56) {
                z2[n53] = new String(charArray14).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
