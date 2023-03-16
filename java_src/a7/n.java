package a7;

import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final URL f260a;

    public n(URL url) {
        this.f260a = url;
    }

    public URLConnection a() {
        return this.f260a.openConnection();
    }

    public String toString() {
        return this.f260a.toString();
    }
}
