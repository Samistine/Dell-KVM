// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import java.io.IOException;

interface NativeKeyEventListener {

    void keyPressed(int p0, int p1) throws IOException;

    void keyReleased(int p0, int p1) throws IOException;
}
