// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.awt.image.RenderedImage;
import java.lang.reflect.InvocationTargetException;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.image.ColorModel;
import java.awt.Component;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import javax.swing.SwingUtilities;
import com.avocent.kvm.b.d.a;
import com.avocent.kvm.b.f.c;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.MemoryImageSource;
import javax.swing.JPanel;

public class ob extends JPanel implements hb, cb {

    MemoryImageSource a;
    Image b;
    Dimension dimensions;//Originally named c
    fb d;
    u e;
    o f;
    protected Color color_g;//Originally named g
    protected Color color_h;//Originally named h
    protected Font font;//Originally named i
    c j;
    mb k;
    int l;
    int m;
    double n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    protected boolean u;
    protected Image v;
    protected Color w;
    protected boolean x;
    boolean y;
    protected boolean z;
    protected boolean A;
    protected boolean B;
    protected Runnable_p C;
    protected String D;
    protected boolean E;
    protected Object F;
    protected String name;//Originally named G
    private static final String[] H;

    public ob(String g) {
        final boolean t = com.avocent.kvm.b.g.t;
        this.dimensions = new Dimension(1024, 768);
        this.f = new o(this);
        this.color_g = new Color(36864);
        this.color_h = Color.yellow;
        this.font = new Font(ob.H[0], 1, 32);
        this.j = new c(1024, 768, 0, 0);
        this.n = 1.0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.w = new Color(0, 0, 0, 0);
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = true;
        this.B = false;
        this.C = new Runnable_p(this);
        this.D = "";
        this.F = new Object();
        this.name = g;
        this.setFocusable(true);
        (this.k = new mb(this)).start();
        this.setFocusable(true);
        this.setFocusCycleRoot(true);
        this.setPreferredSize(this.dimensions);
        this.setFocusTraversalKeysEnabled(false);
        if (t) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void a(final fb d) {
        if (this.d != null) {
            this.d.b(this);
        }
        (this.d = d).a(this);
        this.e();
    }

    @Override
    public void a(final boolean z) {
        this.z = z;
    }

    public void e() {
        if (SwingUtilities.isEventDispatchThread()) {
            this.f();
            if (!com.avocent.kvm.b.g.t) {
                return;
            }
        }
        SwingUtilities.invokeLater(new m(this));
    }

    public void f() {
        final boolean t = com.avocent.kvm.b.g.t;
        Label_0411:
        {
            if (this.d == null) {
                this.b = null;
                if (!t) {
                    break Label_0411;
                }
            }
            final fb d = this.d;
            final ColorModel f = d.f();
            this.l = d.c();
            this.m = d.d();
            final Object e = d.e();
            Label_0137:
            {
                if (e instanceof byte[]) {
                    this.a = new MemoryImageSource(this.l, this.m, f, (byte[]) e, 0, this.l);
                    if (!t) {
                        break Label_0137;
                    }
                }
                this.a = new MemoryImageSource(this.l, this.m, f, (int[]) e, 0, this.l);
            }
            int n = (this.l > 320) ? this.l : 320;
            int n2 = (this.m > 320) ? this.m : 320;
            if (this.e.i().a()) {
                this.e.i().a(ob.H[2] + n + "x" + n2 + ob.H[3]);
            }
            if (this.u) {
                n += 2;
                n2 += 2;
            }
            this.setSize(this.dimensions = new Dimension((int) (n * this.n), (int) (n2 * this.n)));
            this.setPreferredSize(this.dimensions);
            Label_0343:
            {
                if (n > 0 && n2 > 0) {
                    this.v = this.createImage(n, n2);
                    if (!t) {
                        break Label_0343;
                    }
                }
                this.v = null;
            }
            this.a.setAnimated(true);
            this.a.setFullBufferUpdates(false);
            this.b = this.createImage(this.a);
            this.j = new c(this.l, this.m, 0, 0);
            this.a.newPixels();
            this.a.requestTopDownLeftRightResend(null);
            this.invalidate();
        }
        final Component root = SwingUtilities.getRoot(this);
        if (root != null) {
            root.validate();
        }
        this.e.a(ob.H[1], null, this.dimensions);
    }

    @Override
    public Dimension getPreferredSize() {
        return this.dimensions;
    }

    @Override
    public Dimension getMaximumSize() {
        return this.dimensions;
    }

    @Override
    public void paintComponent(final Graphics graphics) {
        final boolean t = com.avocent.kvm.b.g.t;
        if (!this.isShowing()) {
            return;
        }
        final Graphics2D graphics2D = (Graphics2D) graphics;
        final Rectangle clipBounds = graphics.getClipBounds();
        Label_0380:
        {
            if ((this.u || this.x) && this.v != null) {
                graphics.drawImage(this.v, 0, 0, (int) (this.v.getWidth(this) * this.n), (int) (this.v.getHeight(this) * this.n), this);
                if (!t) {
                    break Label_0380;
                }
            }
            if (this.b == null) {
                final Color color = graphics.getColor();
                graphics.setColor(Color.black);
                graphics.fillRect(clipBounds.x, clipBounds.y, clipBounds.width, clipBounds.height);
                graphics.setColor(color);
                if (!t) {
                    break Label_0380;
                }
            }
            if (this.D != null && this.D.length() > 0) {
                synchronized (this) {
                    if (this.D != null) {
                        graphics.setFont(this.font);
                        final Rectangle2D stringBounds = graphics.getFontMetrics().getStringBounds(this.D, graphics);
                        final int n = (int) (this.getWidth() - stringBounds.getWidth()) / 2;
                        final int n2 = (int) (this.getHeight() - stringBounds.getHeight()) / 2;
                        graphics.setColor(this.color_g);
                        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
                        graphics.setColor(this.color_h);
                        graphics.drawString(this.D, n, n2);
                    }
                }
                if (!t) {
                    break Label_0380;
                }
            }
            graphics.drawImage(this.b, clipBounds.x, clipBounds.y, clipBounds.x + clipBounds.width, clipBounds.y + clipBounds.height, (int) (clipBounds.x / this.n), (int) (clipBounds.y / this.n), (int) ((clipBounds.x + clipBounds.width) / this.n), (int) ((clipBounds.y + clipBounds.height) / this.n), this);
        }
        ++this.q;
    }

    @Override
    public Component c() {
        return this;
    }

    @Override
    public boolean imageUpdate(final Image image, final int n, final int n2, final int n3, final int n4, final int n5) {
        return (n & 0x20) == 0x0 && (n & 0x80) == 0x0;
    }

    @Override
    public void b() {
        ++this.r;
        this.g();
        if (this.z) {
            this.c(false);
        }
    }

    @Override
    public void a() {
        this.g();
    }

    @Override
    public void a(final int n, final int n2) {
        if (n != 0) {
            if (n2 != 0) {
                this.e();
            }
        }
    }

    @Override
    public void reshape(final int n, final int n2, final int n3, final int n4) {
        super.reshape(n, n2, this.dimensions.width, this.dimensions.height);
    }

    public void c(final boolean b) {
        final boolean t = com.avocent.kvm.b.g.t;
        ++this.o;
        if (this.x && this.d != null) {
            final int g = this.d.g();
            final int c = this.d.c();
            this.C.a(g % c - 1, g / c);
            this.k.a(true);
        }
        if (this.B) {
            ++this.t;
            if (!t) {
                return;
            }
        }
        if (this.E) {
            if (SwingUtilities.isEventDispatchThread()) {
                this.C.run();
                if (!t) {
                    return;
                }
            }
            this.B = true;
            try {
                SwingUtilities.invokeAndWait(this.C);
                return;
            } catch (InterruptedException ex) {
                return;
            } catch (InvocationTargetException ex2) {
                if (!t) {
                    return;
                }
            }
        }
        synchronized (this.k) {
            if (this.isShowing()) {
                this.B = true;
                this.k.a(b);
                this.k.notify();
            }
        }
    }

    @Override
    public void a(final int n, final int n2, final int n3, final int n4) {
        synchronized (this.j) {
            this.j.b(n, n2, n3, n4);
        }
        if (this.A) {
            this.c(false);
        }
    }

    public void g() {
        if (this.d != null) {
            synchronized (this.j) {
                this.j.b(this.d.h());
            }
        }
    }

    @Override
    public RenderedImage d() {
        final Image image = this.createImage(this.d.c(), this.d.d());
        this.paint(image.getGraphics());
        return (RenderedImage) image;
    }

    void b(final int n, final int n2, final int n3, final int n4) {
        if (this.isShowing()) {
            this.a.newPixels(n, n2, n3, n4);
        }
    }

    @Override
    public void a(final String d) {
        synchronized (this) {
            this.D = d;
        }
        this.h();
    }

    @Override
    public void a(final u e) {
        this.e = e;
        if (e == null) {
            this.d = null;
            this.e();
            if (!com.avocent.kvm.b.g.t) {
                return;
            }
        }
        e.a(this.f);
        this.a(e.c());
        if (e.g() != null) {
            e.g().a(e, this);
        }
        if (e.h() != null) {
            e.h().a(this);
        }
    }

    @Override
    public void b(final boolean e) {
        this.E = e;
    }

    public void h() {
        SwingUtilities.invokeLater(new n(this));
    }

    static {
        final String[] h = new String[4];
        final int n = 0;
        final char[] charArray = "ryU2EQ".toCharArray();
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
                            c2 = '6';
                            break;
                        }
                        case 1: {
                            c2 = '\u0010';
                            break;
                        }
                        case 2: {
                            c2 = '4';
                            break;
                        }
                        case 3: {
                            c2 = '^';
                            break;
                        }
                        default: {
                            c2 = '*';
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
        h[n] = new String(charArray).intern();
        final int n5 = 1;
        final char[] charArray2 = "`Yp\u001bei@u\u0010ozOg\u0017psOw\u0016kxWq\u001a".toCharArray();
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
                            c4 = '6';
                            break;
                        }
                        case 1: {
                            c4 = '\u0010';
                            break;
                        }
                        case 2: {
                            c4 = '4';
                            break;
                        }
                        case 3: {
                            c4 = '^';
                            break;
                        }
                        default: {
                            c4 = '*';
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
        h[n5] = new String(charArray2).intern();
        final int n9 = 2;
        final char[] charArray3 = "`yP;EfqZ;F\f0}0CByU2CLyZ9\n@yP;E\u0016`U0OZ0@1\nEyN;\n\u001e0".toCharArray();
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
                            c6 = '6';
                            break;
                        }
                        case 1: {
                            c6 = '\u0010';
                            break;
                        }
                        case 2: {
                            c6 = '4';
                            break;
                        }
                        case 3: {
                            c6 = '^';
                            break;
                        }
                        default: {
                            c6 = '*';
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
        h[n9] = new String(charArray3).intern();
        final int n13 = 3;
        final char[] charArray4 = "\u001f>".toCharArray();
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
                            c8 = '6';
                            break;
                        }
                        case 1: {
                            c8 = '\u0010';
                            break;
                        }
                        case 2: {
                            c8 = '4';
                            break;
                        }
                        case 3: {
                            c8 = '^';
                            break;
                        }
                        default: {
                            c8 = '*';
                            break;
                        }
                    }
                    charArray4[length4] = (char) (c7 ^ c8);
                    ++n16;
                } while (n14 == 0);
            }
            if (n14 <= n16) {
                h[n13] = new String(charArray4).intern();
                H = h;
                break;
            }
            continue;
        }
    }
}
