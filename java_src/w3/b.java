package w3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import z3.n;
/* loaded from: classes.dex */
public final class b extends a4.a {

    /* renamed from: n  reason: collision with root package name */
    final int f16058n;

    /* renamed from: o  reason: collision with root package name */
    private final int f16059o;

    /* renamed from: p  reason: collision with root package name */
    private final PendingIntent f16060p;

    /* renamed from: q  reason: collision with root package name */
    private final String f16061q;

    /* renamed from: r  reason: collision with root package name */
    public static final b f16057r = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new n();

    public b(int i10) {
        this(i10, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f16058n = i10;
        this.f16059o = i11;
        this.f16060p = pendingIntent;
        this.f16061q = str;
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String D(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case c.j.f3071t3 /* 23 */:
                                return "API_DISABLED";
                            case c.j.f3076u3 /* 24 */:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public boolean C() {
        return this.f16059o == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f16059o == bVar.f16059o && z3.n.a(this.f16060p, bVar.f16060p) && z3.n.a(this.f16061q, bVar.f16061q);
        }
        return false;
    }

    public int hashCode() {
        return z3.n.b(Integer.valueOf(this.f16059o), this.f16060p, this.f16061q);
    }

    public int k() {
        return this.f16059o;
    }

    public String s() {
        return this.f16061q;
    }

    public String toString() {
        n.a c10 = z3.n.c(this);
        c10.a("statusCode", D(this.f16059o));
        c10.a("resolution", this.f16060p);
        c10.a("message", this.f16061q);
        return c10.toString();
    }

    public PendingIntent v() {
        return this.f16060p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, this.f16058n);
        a4.c.i(parcel, 2, k());
        a4.c.m(parcel, 3, v(), i10, false);
        a4.c.n(parcel, 4, s(), false);
        a4.c.b(parcel, a10);
    }

    public boolean x() {
        return (this.f16059o == 0 || this.f16060p == null) ? false : true;
    }
}
