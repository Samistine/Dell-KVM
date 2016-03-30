// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import javax.swing.SwingUtilities;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.VolatileImage;

public class qb extends ob {

    VolatileImage H;
    q I;

    public qb(final String s) {
        super(s);
        this.I = new q(this);
    }

    @Override
    public void paintComponent(final Graphics graphics) {
        if (this.H == null) {
            final Rectangle clipBounds = graphics.getClipBounds();
            final Color color = graphics.getColor();
            graphics.setColor(Color.white);
            graphics.fillRect(clipBounds.x, clipBounds.y, clipBounds.width, clipBounds.height);
            graphics.setColor(color);
            if (!com.avocent.kvm.b.g.t) {
                return;
            }
        }
        final int validate = this.H.validate(this.getGraphicsConfiguration());
        if (validate == 2 || validate == 1) {
            return;
        }
        graphics.drawImage(this.H, 0, 0, (int) (this.d.c() * this.n), (int) (this.d.d() * this.n), this);
    }

    void i() {
        final GraphicsConfiguration graphicsConfiguration = this.getGraphicsConfiguration();
        if (graphicsConfiguration != null) {
            this.H = graphicsConfiguration.createCompatibleVolatileImage(this.d.c(), this.d.d());
        }
    }

    @Override
    public void b() {
        if (this.B) {
            return;
        }
        if (this.H == null) {
            this.i();
        }
        do {
            if (this.H.validate(this.getGraphicsConfiguration()) == 2) {
                this.i();
            }
            final Graphics2D graphics2D = (Graphics2D) this.H.getGraphics();
            this.a.newPixels();
            graphics2D.drawImage(this.b, 0, 0, this);
        } while (this.H.contentsLost());
        this.B = true;
        SwingUtilities.invokeLater(this.I);
    }
}
