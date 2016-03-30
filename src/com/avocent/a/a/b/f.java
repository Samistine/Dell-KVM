package com.avocent.a.a.b;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.Scrollable;
import javax.swing.JPanel;

class f extends JPanel implements Scrollable
{
    Component a;
    Dimension b;
    final e c;
    
    f(final e c) {
        this.c = c;
        super();
        this.b = new Dimension(800, 600);
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.black);
    }
    
    public Component add(final Component a) {
        this.a = a;
        return super.add(a);
    }
    
    public Dimension getPreferredScrollableViewportSize() {
        return (this.a == null) ? this.b : this.a.getPreferredSize();
    }
    
    public int getScrollableBlockIncrement(final Rectangle rectangle, final int n, final int n2) {
        return 10;
    }
    
    public boolean getScrollableTracksViewportHeight() {
        return this.a != null && this.a.getHeight() < this.getHeight();
    }
    
    public boolean getScrollableTracksViewportWidth() {
        return this.a != null && this.a.getWidth() < this.getWidth();
    }
    
    public int getScrollableUnitIncrement(final Rectangle rectangle, final int n, final int n2) {
        return 10;
    }
}
