package com.avocent.kvm.b;

class q implements Runnable
{
    final qb a;
    
    q(final qb a) {
        this.a = a;
        super();
    }
    
    public void run() {
        synchronized (this.a.C) {
            this.a.repaint();
            this.a.B = false;
        }
    }
}
