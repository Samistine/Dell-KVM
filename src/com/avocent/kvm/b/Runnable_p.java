// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.awt.Color;
import java.awt.image.ImageObserver;
import java.awt.Graphics2D;
import com.avocent.kvm.b.f.c;

//Originally named p
class Runnable_p implements Runnable {

    protected c a;
    protected int b;
    protected int c;
    final ob d;

    Runnable_p(ob d) {
        this.d = d;
        this.a = new c();
    }

    @Override
    public void run() {
        try {
            final ob d = this.d;
            ++d.p;
            synchronized (this.d.j) {
                if (this.d.j.a() && !this.d.y) {
                    this.d.B = false;
                    return;
                }
                this.a.a(this.d.j);
                this.d.j.a(this.d.l, this.d.m, 0, 0);
            }
            final int abs = Math.abs(this.a.c - this.a.a);
            final int abs2 = Math.abs(this.a.d - this.a.b);
            if (!this.a.a()) {
                this.d.b(this.a.a, this.a.b, abs, abs2);
            }
            Label_0583:
            {
                if ((this.d.u || this.d.x) && abs > 0 && abs2 > 0 && this.d.v != null) {
                    final Graphics2D graphics2D = (Graphics2D) this.d.v.getGraphics();
                    graphics2D.drawImage(this.d.b, 1, 1, this.d.b.getWidth(this.d), this.d.b.getHeight(this.d), null);
                    if (this.d.u && abs > 0 && abs2 > 0) {
                        graphics2D.setColor(Color.red);
                        final c h = this.d.d.h();
                        graphics2D.drawRect(h.a, h.b, h.b() - 1, h.c() - 1);
                    }
                    if (this.d.x) {
                        graphics2D.translate(1, 1);
                        graphics2D.setColor(Color.red);
                        final int n = this.b - 10;
                        final int n2 = this.b + 10;
                        final int n3 = this.c - 10;
                        final int n4 = this.c + 10;
                        graphics2D.drawLine(n, n3, this.b - 1, this.c - 1);
                        graphics2D.drawLine(n, n4, this.b - 1, this.c + 1);
                        graphics2D.drawLine(n2, n3, this.b + 1, this.c - 1);
                        graphics2D.drawLine(n2, n4, this.b + 1, this.c + 1);
                    }
                    this.d.repaint();
                    if (!g.t) {
                        break Label_0583;
                    }
                }
                if (this.d.y || !this.a.a()) {
                    this.d.repaint((int) (this.a.a * this.d.n), (int) (this.a.b * this.d.n), (int) (abs * this.d.n), (int) (abs2 * this.d.n));
                }
            }
            this.d.y = false;
            this.d.B = false;
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public void a(int b, int c) {
        this.b = b;
        this.c = c;
    }
}
