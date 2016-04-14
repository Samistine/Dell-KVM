// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

class l extends Thread {

    final e a;
    private static final String[] z = {"**** (KVMIOWindowListener) startProcessing ****", "KVMIO"};

    l(final e a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException ex) {
        }
        this.setName(l.z[1]);
        NativeKVM.registerWindowById(this.a.d, this.a.b);
        System.out.println(l.z[0]);
    }

}
