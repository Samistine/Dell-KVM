// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public class bb implements MouseListener, MouseMotionListener, MouseWheelListener {

    protected jb a;
    protected Component b;

    public void a(final hb hb, final boolean b) {
        (this.b = hb.c()).addMouseListener(this);
        this.b.addMouseMotionListener(this);
        if (b) {
            this.b.addMouseWheelListener(this);
        }
    }

    public void a(final hb hb) {
        this.a(hb, false);
    }

    public void a(final jb a) {
        this.a = a;
    }

    @Override
    public void mouseClicked(final MouseEvent mouseEvent) {
    }

    @Override
    public void mouseDragged(final MouseEvent mouseEvent) {
        try {
            if (this.a != null) {
                this.a.a(mouseEvent.getX(), mouseEvent.getY());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            this.a = null;
        }
    }

    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {
        try {
            if (this.a != null) {
                this.a.c(mouseEvent.getX(), mouseEvent.getY());
            }
        } catch (Exception ex) {
            this.a = null;
        }
    }

    @Override
    public void mouseExited(final MouseEvent mouseEvent) {
        try {
            if (this.a != null) {
                this.a.d(mouseEvent.getX(), mouseEvent.getY());
            }
        } catch (Exception ex) {
            this.a = null;
        }
    }

    @Override
    public void mouseMoved(final MouseEvent mouseEvent) {
        try {
            mouseEvent.getSource();
            mouseEvent.getPoint();
            if (this.a != null) {
                this.a.a(mouseEvent.getX(), mouseEvent.getY());
            }
        } catch (Exception ex) {
            this.a = null;
        }
    }

    @Override
    public void mousePressed(final MouseEvent mouseEvent) {
        try {
            if (this.a == null) {
                return;
            }
            final int button = mouseEvent.getButton();
            this.a.a(mouseEvent.getX(), mouseEvent.getY(), 0, button == 1, button == 2, button == 3, mouseEvent.getClickCount());
        } catch (Exception ex) {
            ex.printStackTrace();
            this.a = null;
        }
    }

    @Override
    public void mouseReleased(final MouseEvent mouseEvent) {
        try {
            if (this.a == null) {
                return;
            }
            final int button = mouseEvent.getButton();
            this.a.b(mouseEvent.getX(), mouseEvent.getY(), 0, button == 1, button == 2, button == 3, mouseEvent.getClickCount());
        } catch (Exception ex) {
            ex.printStackTrace();
            this.a = null;
        }
    }

    @Override
    public void mouseWheelMoved(final MouseWheelEvent mouseWheelEvent) {
        try {
            if (this.a == null) {
                return;
            }
            final int button = mouseWheelEvent.getButton();
            this.a.a(mouseWheelEvent.getX(), mouseWheelEvent.getY(), -mouseWheelEvent.getWheelRotation(), button == 1, button == 2, button == 3, mouseWheelEvent.getClickCount());
        } catch (Exception ex) {
            ex.printStackTrace();
            this.a = null;
        }
    }
}
