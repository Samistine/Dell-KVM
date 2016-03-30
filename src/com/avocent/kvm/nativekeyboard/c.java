package com.avocent.kvm.nativekeyboard;

import java.awt.event.MouseEvent;
import java.io.IOException;
import com.avocent.kvm.b.a.d;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Toolkit;
import java.awt.event.ComponentListener;
import java.awt.Component;
import java.awt.Cursor;
import com.avocent.kvm.b.e.a;
import java.awt.Point;
import com.avocent.kvm.b.bb;

public class c extends bb
{
    protected boolean c;
    protected Point d;
    protected a e;
    protected a f;
    protected boolean g;
    protected boolean h;
    protected Cursor i;
    protected Cursor j;
    protected Component k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected j q;
    private static final String[] z;
    
    public c(final a f, final Component k) {
        final int b = NativeKVM.b;
        super();
        this.c = true;
        this.e = new a(this);
        this.g = false;
        this.h = false;
        this.m = 0;
        this.n = 0;
        this.q = new j(this);
        this.f = f;
        f.a().a(new b(this));
        (this.k = k).addComponentListener(this.e);
        this.i = Toolkit.getDefaultToolkit().createCustomCursor(new BufferedImage(3, 3, 2), new Point(0, 0), c.z[0]);
        Integer a = f.a().a(c.z[1], null);
        if (a == null) {
            a = new Integer(69);
            f.a().a(c.z[1], (Object)a);
        }
        this.p = a;
        f.a().d().a(this.q);
        if (b != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }
    
    public void a(final boolean g) {
        this.f.b().a(c.z[3], g ? c.z[4] : c.z[2]);
        this.g = g;
        if (!this.g && this.h) {
            this.b(false);
        }
        if (this.g) {
            this.b(true);
        }
    }
    
    protected void b(final boolean b) {
        this.f.b().a(c.z[3], b ? c.z[6] : c.z[7]);
        if (this.g && b) {
            if (!this.k.isShowing()) {
                return;
            }
            this.h = true;
            this.j = this.k.getCursor();
            this.k.setCursor(this.i);
            this.a();
            try {
                this.a.a();
                return;
            }
            catch (IOException ex) {
                this.f.b().a(c.z[5] + ex.getMessage());
                if (NativeKVM.b == 0) {
                    return;
                }
            }
        }
        this.k.setCursor(this.j);
        this.h = false;
    }
    
    public void mouseDragged(final MouseEvent mouseEvent) {
        if (this.a != null) {
            if (this.h) {
                this.a(mouseEvent);
                if (NativeKVM.b == 0) {
                    return;
                }
            }
            super.mouseDragged(mouseEvent);
        }
    }
    
    public void mouseMoved(final MouseEvent mouseEvent) {
        if (this.a != null) {
            if (this.h) {
                this.a(mouseEvent);
                if (NativeKVM.b == 0) {
                    return;
                }
            }
            super.mouseMoved(mouseEvent);
        }
    }
    
    public void a(final MouseEvent mouseEvent) {
        final int[] b = this.b(mouseEvent);
        final int n = b[0];
        final int n2 = b[1];
        Label_0100: {
            if (n == this.m && n2 == this.n) {
                this.l = n;
                this.o = n2;
                if (NativeKVM.b == 0) {
                    break Label_0100;
                }
            }
            try {
                this.a.b(n - this.l, n2 - this.o);
                this.l = n;
                this.o = n2;
            }
            catch (Exception ex) {
                this.a = null;
            }
        }
        final int x = mouseEvent.getX();
        final int y = mouseEvent.getY();
        final int width = mouseEvent.getComponent().getWidth();
        final int height = mouseEvent.getComponent().getHeight();
        final int n3 = (int)(width * 0.25);
        if (x < n3 || y < n3 || x > width - n3 || y > height - n3) {
            mouseEvent.getComponent().getLocationOnScreen();
            NativeKVM.a(this.k, this.m, this.n);
        }
    }
    
    public void mousePressed(final MouseEvent mouseEvent) {
        if (this.a == null) {
            return;
        }
        if (this.h) {
            try {
                final int button = mouseEvent.getButton();
                final int clickCount = mouseEvent.getClickCount();
                final int[] b = this.b(mouseEvent);
                final boolean b2 = button == 1;
                final boolean b3 = button == 2;
                final boolean b4 = button == 3;
                final int n = b[0] - this.l;
                final int n2 = b[1] - this.o;
                this.l = b[0];
                this.o = b[1];
                this.a.c(n, n2, 0, b2, b3, b4, clickCount);
                return;
            }
            catch (Exception ex) {
                if (NativeKVM.b == 0) {
                    return;
                }
            }
        }
        super.mousePressed(mouseEvent);
    }
    
    public void mouseReleased(final MouseEvent mouseEvent) {
        if (this.a == null) {
            return;
        }
        if (this.h) {
            try {
                final int clickCount = mouseEvent.getClickCount();
                final int[] b = this.b(mouseEvent);
                final int button = mouseEvent.getButton();
                final boolean b2 = button == 1;
                final boolean b3 = button == 2;
                final boolean b4 = button == 3;
                final int n = b[0] - this.l;
                final int n2 = b[1] - this.o;
                this.l = b[0];
                this.o = b[1];
                this.a.d(n, n2, 0, b2, b3, b4, clickCount);
                return;
            }
            catch (Exception ex) {
                if (NativeKVM.b == 0) {
                    return;
                }
            }
        }
        super.mouseReleased(mouseEvent);
    }
    
    public void mouseEntered(final MouseEvent mouseEvent) {
        if (this.h) {
            this.a();
            NativeKVM.a(this.k, this.m, this.n);
            try {
                this.a.a();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        super.mouseEntered(mouseEvent);
    }
    
    public void mouseExited(final MouseEvent mouseEvent) {
        if (this.h) {
            this.b(false);
            if (NativeKVM.b == 0) {
                return;
            }
        }
        super.mouseExited(mouseEvent);
    }
    
    public int[] b(final MouseEvent mouseEvent) {
        final int[] array = { 0, 0 };
        if (this.d == null || this.c) {
            this.d = mouseEvent.getComponent().getLocationOnScreen();
        }
        array[0] = mouseEvent.getX() + this.d.x;
        array[1] = mouseEvent.getY() + this.d.y;
        return array;
    }
    
    private void a() {
        if (this.k.isShowing()) {
            final Point locationOnScreen = this.k.getLocationOnScreen();
            final int width = this.f.c().getWidth();
            final int height = this.f.c().getHeight();
            this.m = locationOnScreen.x + width / 2;
            this.n = locationOnScreen.y + height / 2;
        }
    }
    
    static void a(final c c) {
        c.a();
    }
    
    static {
        final String[] z2 = new String[8];
        final int n = 0;
        final char[] charArray = "X7\u0004L".toCharArray();
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
                            c2 = '6';
                            break;
                        }
                        case 1: {
                            c2 = 'B';
                            break;
                        }
                        case 2: {
                            c2 = 'h';
                            break;
                        }
                        case 3: {
                            c2 = ' ';
                            break;
                        }
                        default: {
                            c2 = 'P';
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
        final char[] charArray2 = "E+\u0006G<S\u0001\u001dR#Y0<E\"[+\u0006A$_-\u0006k5O".toCharArray();
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
                            c4 = '6';
                            break;
                        }
                        case 1: {
                            c4 = 'B';
                            break;
                        }
                        case 2: {
                            c4 = 'h';
                            break;
                        }
                        case 3: {
                            c4 = ' ';
                            break;
                        }
                        default: {
                            c4 = 'P';
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
        final char[] charArray3 = "\u0016\u0006\u0001S1T.\rD".toCharArray();
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
                            c6 = '6';
                            break;
                        }
                        case 1: {
                            c6 = 'B';
                            break;
                        }
                        case 2: {
                            c6 = 'h';
                            break;
                        }
                        case 3: {
                            c6 = ' ';
                            break;
                        }
                        default: {
                            c6 = 'P';
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
        final char[] charArray4 = "e+\u0006G<S\u0001\u001dR#Y0%O4S".toCharArray();
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
                            c8 = '6';
                            break;
                        }
                        case 1: {
                            c8 = 'B';
                            break;
                        }
                        case 2: {
                            c8 = 'h';
                            break;
                        }
                        case 3: {
                            c8 = ' ';
                            break;
                        }
                        default: {
                            c8 = 'P';
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
        final char[] charArray5 = "\u0016\u0007\u0006A2Z'\f".toCharArray();
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
                            c10 = '6';
                            break;
                        }
                        case 1: {
                            c10 = 'B';
                            break;
                        }
                        case 2: {
                            c10 = 'h';
                            break;
                        }
                        case 3: {
                            c10 = ' ';
                            break;
                        }
                        default: {
                            c10 = 'P';
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
        final char[] charArray6 = "s:\u000bE B+\u0007Nj\u0016".toCharArray();
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
                            c12 = '6';
                            break;
                        }
                        case 1: {
                            c12 = 'B';
                            break;
                        }
                        case 2: {
                            c12 = 'h';
                            break;
                        }
                        case 3: {
                            c12 = ' ';
                            break;
                        }
                        default: {
                            c12 = 'P';
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
        final char[] charArray7 = "\u0016\u0011\rTpB-HA3B+\u001eE~".toCharArray();
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
                            c14 = '6';
                            break;
                        }
                        case 1: {
                            c14 = 'B';
                            break;
                        }
                        case 2: {
                            c14 = 'h';
                            break;
                        }
                        case 3: {
                            c14 = ' ';
                            break;
                        }
                        default: {
                            c14 = 'P';
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
        final char[] charArray8 = "\u0016\u0011\rTpB-HI>W!\u001cI&Sl".toCharArray();
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
                            c16 = '6';
                            break;
                        }
                        case 1: {
                            c16 = 'B';
                            break;
                        }
                        case 2: {
                            c16 = 'h';
                            break;
                        }
                        case 3: {
                            c16 = ' ';
                            break;
                        }
                        default: {
                            c16 = 'P';
                            break;
                        }
                    }
                    charArray8[length8] = (char)(c15 ^ c16);
                    ++n32;
                } while (n30 == 0);
            }
            if (n30 <= n32) {
                z2[n29] = new String(charArray8).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
