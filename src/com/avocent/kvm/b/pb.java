// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.awt.Rectangle;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.image.ImageObserver;
import java.awt.Graphics2D;
import java.awt.image.VolatileImage;

public class pb extends ob {

    VolatileImage H;

    public pb(final String s) {
        super(s);
        this.i();
    }

    private int c(final int n, final int n2, final int n3, final int n4) {
        final GraphicsConfiguration graphicsConfiguration = this.getGraphicsConfiguration();
        if (this.H == null) {
            this.i();
        }
        if (this.H == null || graphicsConfiguration == null) {
            return 2;
        }
        if (this.H.validate(graphicsConfiguration) == 2) {
            this.i();
            final int validate = this.H.validate(graphicsConfiguration);
            if (validate == 2) {
                return validate;
            }
        }
        ((Graphics2D) this.H.getGraphics()).drawImage(this.b, n, n2, n + n3, n2 + n4, n, n2, n + n3, n2 + n4, this);
        return 0;
    }

    @Override
    public void paintComponent(final Graphics graphics) {
        final boolean t = com.avocent.kvm.b.g.t;
        final Rectangle clipBounds = graphics.getClipBounds();
        if (this.b == null) {
            final Color color = graphics.getColor();
            graphics.setColor(Color.white);
            graphics.fillRect(clipBounds.x, clipBounds.y, clipBounds.width, clipBounds.height);
            graphics.setColor(color);
            if (!t) {
                return;
            }
        }
        if (this.H == null) {
            this.c(0, 0, this.d.c(), this.d.d());
        }
        do {
            if (this.H.validate(this.getGraphicsConfiguration()) == 2) {
                this.H = null;
                if (this.c(0, 0, this.d.c(), this.d.d()) == 2) {
                    break;
                }
            }
            graphics.drawImage(this.H, clipBounds.x, clipBounds.y, clipBounds.x + clipBounds.width, clipBounds.y + clipBounds.height, clipBounds.x, clipBounds.y, clipBounds.x + clipBounds.width, clipBounds.y + clipBounds.height, this);
        } while (this.H.contentsLost());
    }

    @Override
    void b(final int n, final int n2, final int n3, final int n4) {
        this.a.newPixels(n, n2, n3, n4);
        this.c(n, n2, n3, n4);
    }

    void i() {
        final GraphicsConfiguration graphicsConfiguration = this.getGraphicsConfiguration();
        if (graphicsConfiguration != null) {
            this.H = graphicsConfiguration.createCompatibleVolatileImage(this.d.c(), this.d.d());
        }
    }
}
