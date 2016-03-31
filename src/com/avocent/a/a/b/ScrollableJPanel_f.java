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

//Originally f
class ScrollableJPanel_f extends JPanel implements Scrollable {

    private Component component;//Originally a
    private final Dimension dimensions;//Originally b
    private final e c;

    public ScrollableJPanel_f(e c) {
        this.c = c;
        this.dimensions = new Dimension(800, 600);
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.black);
    }

    @Override
    public Component add(Component a) {
        this.component = a;
        return super.add(a);
    }

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        return (this.component == null) ? this.dimensions : this.component.getPreferredSize();
    }

    @Override
    public int getScrollableBlockIncrement(Rectangle rectangle, int n, int n2) {
        return 10;
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        return this.component != null && this.component.getHeight() < this.getHeight();
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        return this.component != null && this.component.getWidth() < this.getWidth();
    }

    @Override
    public int getScrollableUnitIncrement(Rectangle rectangle, int n, int n2) {
        return 10;
    }
}
