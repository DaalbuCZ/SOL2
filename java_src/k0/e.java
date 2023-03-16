package k0;

import android.app.Notification;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f10494a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10495b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f10496c;

    public e(int i10, Notification notification, int i11) {
        this.f10494a = i10;
        this.f10496c = notification;
        this.f10495b = i11;
    }

    public int a() {
        return this.f10495b;
    }

    public Notification b() {
        return this.f10496c;
    }

    public int c() {
        return this.f10494a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f10494a == eVar.f10494a && this.f10495b == eVar.f10495b) {
            return this.f10496c.equals(eVar.f10496c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f10494a * 31) + this.f10495b) * 31) + this.f10496c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f10494a + ", mForegroundServiceType=" + this.f10495b + ", mNotification=" + this.f10496c + '}';
    }
}
