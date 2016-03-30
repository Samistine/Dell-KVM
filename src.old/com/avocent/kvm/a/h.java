// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class h implements X509TrustManager {

    final g a;

    h(final g a) {
        this.a = a;
    }

    @Override
    public void checkClientTrusted(final X509Certificate[] array, final String s) throws CertificateException {
    }

    @Override
    public void checkServerTrusted(final X509Certificate[] array, final String s) throws CertificateException {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
