package com.avocent.kvm.b;

class n implements Runnable
{
    final ob a;
    
    n(final ob a) {
        this.a = a;
        super();
    }
    
    public void run() {
        this.a.repaint();
    }
}
