// 
// Decompiled by Procyon v0.5.29
// 
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
import java.awt.Point;
import com.avocent.kvm.b.bb;

public class c extends bb {

    protected boolean c;
    protected Point d;
    protected a e;
    protected com.avocent.kvm.b.e.a f;
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
    private static final String[] z = {"null", "singleCursorTerminationKey", " Disabled", "SingleCursorMode", " Enabled", "Exception: ", " Set to active.", " Set to inactive."};

    public c(final com.avocent.kvm.b.e.a f, final Component k) {
        final int b = NativeKVM.b;
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
        this.i = Toolkit.getDefaultToolkit().createCustomCursor(new BufferedImage(3, 3, 2), new Point(0, 0), com.avocent.kvm.nativekeyboard.c.z[0]);
        Integer a = f.a().a(com.avocent.kvm.nativekeyboard.c.z[1], null);
        if (a == null) {
            a = new Integer(69);
            f.a().a(com.avocent.kvm.nativekeyboard.c.z[1], (Object) a);
        }
        this.p = a;
        f.a().d().a(this.q);
        if (b != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }

    public void a(final boolean g) {
        this.f.b().a(com.avocent.kvm.nativekeyboard.c.z[3], g ? com.avocent.kvm.nativekeyboard.c.z[4] : com.avocent.kvm.nativekeyboard.c.z[2]);
        this.g = g;
        if (!this.g && this.h) {
            this.b(false);
        }
        if (this.g) {
            this.b(true);
        }
    }

    protected void b(final boolean b) {
        this.f.b().a(com.avocent.kvm.nativekeyboard.c.z[3], b ? com.avocent.kvm.nativekeyboard.c.z[6] : com.avocent.kvm.nativekeyboard.c.z[7]);
        if (this.g && b) {
            if (!this.k.isShowing()) {
                break;
            }
            this.h = true;
            this.j = this.k.getCursor();
            this.k.setCursor(this.i);
            this.a();
            try {
                this.a.a();
                break;
            } catch (IOException ex) {
                this.f.b().a(com.avocent.kvm.nativekeyboard.c.z[5] + ex.getMessage());
                if (NativeKVM.b == 0) {
                    break;
                }
            }
        }
        this.k.setCursor(this.j);
        this.h = false;
    }

    @Override
    public void mouseDragged(final MouseEvent mouseEvent) {
        if (this.a != null) {
            if (this.h) {
                this.a(mouseEvent);
                if (NativeKVM.b == 0) {
                    break;
                }
            }
            super.mouseDragged(mouseEvent);
        }
    }

    @Override
    public void mouseMoved(final MouseEvent mouseEvent) {
        if (this.a != null) {
            if (this.h) {
                this.a(mouseEvent);
                if (NativeKVM.b == 0) {
                    break;
                }
            }
            super.mouseMoved(mouseEvent);
        }
    }

    public void a(final MouseEvent mouseEvent) {
        final int[] b = this.b(mouseEvent);
        final int n = b[0];
        final int n2 = b[1];
        Label_0100:
        {
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
            } catch (Exception ex) {
                this.a = null;
            }
        }
        final int x = mouseEvent.getX();
        final int y = mouseEvent.getY();
        final int width = mouseEvent.getComponent().getWidth();
        final int height = mouseEvent.getComponent().getHeight();
        final int n3 = (int) (width * 0.25);
        if (x < n3 || y < n3 || x > width - n3 || y > height - n3) {
            mouseEvent.getComponent().getLocationOnScreen();
            NativeKVM.a(this.k, this.m, this.n);
        }
    }

    @Override
    public void mousePressed(final MouseEvent mouseEvent) {
        if (this.a == null) {
            break;
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
                break;
            } catch (Exception ex) {
                if (NativeKVM.b == 0) {
                    break;
                }
            }
        }
        super.mousePressed(mouseEvent);
    }

    @Override
    public void mouseReleased(final MouseEvent mouseEvent) {
        if (this.a == null) {
            break;
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
                break;
            } catch (Exception ex) {
                if (NativeKVM.b == 0) {
                    break;
                }
            }
        }
        super.mouseReleased(mouseEvent);
    }

    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        if (this.h) {
            this.a();
            NativeKVM.a(this.k, this.m, this.n);
            try {
                this.a.a();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        super.mouseEntered(mouseEvent);
    }

    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        if (this.h) {
            this.b(false);
            if (NativeKVM.b == 0) {
                break;
            }
        }
        super.mouseExited(mouseEvent);
    }

    public int[] b(final MouseEvent mouseEvent) {
        final int[] array = {0, 0};
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
}
