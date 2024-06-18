package my.learn.certs;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class CertificateHelper {
    public String getIssuer(X509Certificate x509Certificate) {
        String issuer = x509Certificate.getIssuerX500Principal().toString();
        int startIdx = issuer.indexOf("CN=") + 3;
        int endIdx = issuer.indexOf(',');
        return issuer.substring(startIdx, endIdx);
    }

    public String getCompanyName(X509Certificate x509Certificate) {
        String subject = x509Certificate.getSubjectX500Principal().getName();
        int startIdx = subject.indexOf("CN=") + 3;
        int endIdx = subject.indexOf(':');
        return subject.substring(startIdx, endIdx);
    }

    public X509Certificate transformBytesToCertificate(byte[] bytes, String password) throws
            KeyStoreException,
            IOException,
            NoSuchAlgorithmException,
            CertificateException {
        X509Certificate x509Certificate = null;
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        keyStore.load(new ByteArrayInputStream(bytes), password.toCharArray());

        String alias = keyStore.aliases().nextElement();
        Certificate certificate = keyStore.getCertificate(alias);

        if (certificate instanceof X509Certificate)
            x509Certificate = (X509Certificate) certificate;

        return x509Certificate;
    }
}
