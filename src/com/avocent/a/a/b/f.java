// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.b;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.Scrollable;
import javax.swing.JPanel;

class f extends JPanel implements Scrollable {

    private Component a;
    private final Dimension b;
    private final e c;

    public f(e c) {
        this.c = c;
        this.b = new Dimension(800, 600);
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.black);
    }

    @Override
    public Component add(Component a) {
        this.a = a;
        return super.add(a);
    }

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        return (this.a == null) ? this.b : this.a.getPreferredSize();
    }

    @Override
    public int getScrollableBlockIncrement(Rectangle rectangle, int n, int n2) {
        return 10;
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        return this.a != null && this.a.getHeight() < this.getHeight();
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        return this.a != null && this.a.getWidth() < this.getWidth();
    }

    @Override
    public int getScrollableUnitIncrement(Rectangle rectangle, int n, int n2) {
        return 10;
    }
}
