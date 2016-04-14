// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import java.awt.event.WindowEvent;
import com.avocent.kvm.b.d.a;
import javax.swing.SwingUtilities;
import java.awt.Component;
import java.awt.Window;
//import com.avocent.kvm.b.f.e;
import java.awt.event.WindowListener;

class e implements WindowListener {

    protected boolean a;
    protected NativeKeyEventListener b;
    protected Thread c;
    protected long d;
    protected String e;
    protected com.avocent.kvm.b.f.e f;
    private static final String[] z = {"**** (KVMIOWindowListener) Window deactivated. m_windowId=", "**** (KVMIOWindowListener) Window activated.m_passthroughEnabled=", "KVM native support not available (OS_ID=", "**** (KVMIOWindowListener) startProcessing libId=", ").", ", m_windowId=", "****", " from native event handler.", "Call to unregister window ", "KVMIOWindowListener", "**** (KVMIOWindowListener) setup w.isVisible()=", ",w.isDisplayable()=", "**** (KVMIOWindowListener)  windowClosed...", "**** (KVMIOWindowListener) windowOpened..."};

    public e(final String e, final com.avocent.kvm.b.f.e f) {
        this.a = false;
        this.e = e;
        this.f = f;
    }

    protected void a(final Window window) {
        this.f.a(com.avocent.kvm.nativekeyboard.e.z[9], com.avocent.kvm.nativekeyboard.e.z[8] + this.e + com.avocent.kvm.nativekeyboard.e.z[7]);
        if (window.isVisible() && window.isDisplayable()) {
            final int libraryId = NativeKVM.getLibraryId();
            long n = -1L;
            Label_0098:
            {
                if (libraryId == 1) {
                    n = NativeKVM.a(window);
                    if (NativeKVM.b == 0) {
                        break Label_0098;
                    }
                }
                if (libraryId == 2) {
                    n = NativeKVM.b(window);
                }
            }
            if (n != -1L) {
                this.a(false);
                NativeKVM.unregisterWindowById(n);
            }
        }
    }

    public synchronized void a(final boolean a) {
        this.a = a;
        if (this.c != null) {
            NativeKVM.setPassthroughEnabled(this.d, this.a);
        }
    }

    public synchronized void a(final int n, final int n2) {
        SwingUtilities.invokeLater(new f(this, n, n2));
    }

    public void a(final Window window, final NativeKeyEventListener b) {
        this.b = b;
        window.addWindowListener(this);
        System.out.println(com.avocent.kvm.nativekeyboard.e.z[10] + window.isVisible() + com.avocent.kvm.nativekeyboard.e.z[11] + window.isDisplayable() + com.avocent.kvm.nativekeyboard.e.z[6]);
        if (window != null && window.isVisible() && window.isDisplayable()) {
            this.b(window);
        }
    }

    void b(final Window window) {
        int b = NativeKVM.b;
        final int libraryId = NativeKVM.getLibraryId();
        this.d = -1L;
        Label_0047:
        {
            if (libraryId == 1) {
                this.d = NativeKVM.a(window);
                if (b == 0) {
                    break Label_0047;
                }
            }
            if (libraryId == 2) {
                this.d = NativeKVM.b(window);
            }
        }
        System.out.println(com.avocent.kvm.nativekeyboard.e.z[3] + libraryId + com.avocent.kvm.nativekeyboard.e.z[5] + this.d + com.avocent.kvm.nativekeyboard.e.z[6]);
        if (this.d == -1L) {
            throw new RuntimeException(com.avocent.kvm.nativekeyboard.e.z[2] + libraryId + com.avocent.kvm.nativekeyboard.e.z[4]);
        }
        synchronized (this) {
            NativeKVM.setPassthroughEnabled(this.d, this.a);
            this.c = new l(this);
        }
        this.c.start();
        if (com.avocent.kvm.b.d.a.c != 0) {
            NativeKVM.b = ++b;
        }
    }

    @Override
    public void windowClosed(final WindowEvent windowEvent) {
        System.out.println(com.avocent.kvm.nativekeyboard.e.z[12]);
        this.a(windowEvent.getWindow());
    }

    @Override
    public void windowOpened(final WindowEvent windowEvent) {
        System.out.println(com.avocent.kvm.nativekeyboard.e.z[13]);
        this.b(windowEvent.getWindow());
    }

    @Override
    public void windowActivated(final WindowEvent windowEvent) {
        System.out.println(com.avocent.kvm.nativekeyboard.e.z[1] + this.a);
        if (this.a) {
            NativeKVM.setPassthroughEnabled(this.d, this.a);
        }
    }

    @Override
    public void windowClosing(final WindowEvent windowEvent) {
        NativeKVM.setPassthroughEnabled(this.d, false);
    }

    @Override
    public void windowDeactivated(final WindowEvent windowEvent) {
        System.out.println(com.avocent.kvm.nativekeyboard.e.z[0] + this.d);
        NativeKVM.setPassthroughEnabled(this.d, false);
    }

    @Override
    public void windowIconified(final WindowEvent windowEvent) {
        NativeKVM.setPassthroughEnabled(this.d, false);
    }

    @Override
    public void windowDeiconified(final WindowEvent windowEvent) {
        if (this.a) {
            NativeKVM.setPassthroughEnabled(this.d, this.a);
        }
    }

}
