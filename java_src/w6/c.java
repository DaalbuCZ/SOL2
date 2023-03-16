package w6;

import a7.m;
import android.content.Context;
import b7.h;
import java.net.URI;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static final u6.a f16146c = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final h f16147a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f16148b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(h hVar, Context context) {
        this.f16148b = context;
        this.f16147a = hVar;
    }

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f16146c.k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    private boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return m.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(String str) {
        return i(str);
    }

    private boolean k(String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    private boolean m(int i10) {
        return i10 > 0;
    }

    private boolean n(long j10) {
        return j10 >= 0;
    }

    private boolean o(int i10) {
        return i10 == -1 || i10 > 0;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    private boolean q(long j10) {
        return j10 >= 0;
    }

    private boolean r(String str) {
        return str == null;
    }

    @Override // w6.e
    public boolean c() {
        if (j(this.f16147a.v0())) {
            u6.a aVar = f16146c;
            aVar.j("URL is missing:" + this.f16147a.v0());
            return false;
        }
        URI g10 = g(this.f16147a.v0());
        if (g10 == null) {
            f16146c.j("URL cannot be parsed");
            return false;
        } else if (!h(g10, this.f16148b)) {
            u6.a aVar2 = f16146c;
            aVar2.j("URL fails allowlist rule: " + g10);
            return false;
        } else if (!k(g10.getHost())) {
            f16146c.j("URL host is null or invalid");
            return false;
        } else if (!p(g10.getScheme())) {
            f16146c.j("URL scheme is null or invalid");
            return false;
        } else if (!r(g10.getUserInfo())) {
            f16146c.j("URL user info is null");
            return false;
        } else if (!o(g10.getPort())) {
            f16146c.j("URL port is less than or equal to 0");
            return false;
        } else {
            if (!l(this.f16147a.x0() ? this.f16147a.l0() : null)) {
                u6.a aVar3 = f16146c;
                aVar3.j("HTTP Method is null or invalid: " + this.f16147a.l0());
                return false;
            } else if (this.f16147a.y0() && !m(this.f16147a.m0())) {
                u6.a aVar4 = f16146c;
                aVar4.j("HTTP ResponseCode is a negative value:" + this.f16147a.m0());
                return false;
            } else if (this.f16147a.z0() && !n(this.f16147a.p0())) {
                u6.a aVar5 = f16146c;
                aVar5.j("Request Payload is a negative value:" + this.f16147a.p0());
                return false;
            } else if (this.f16147a.A0() && !n(this.f16147a.r0())) {
                u6.a aVar6 = f16146c;
                aVar6.j("Response Payload is a negative value:" + this.f16147a.r0());
                return false;
            } else if (!this.f16147a.w0() || this.f16147a.j0() <= 0) {
                u6.a aVar7 = f16146c;
                aVar7.j("Start time of the request is null, or zero, or a negative value:" + this.f16147a.j0());
                return false;
            } else if (this.f16147a.B0() && !q(this.f16147a.s0())) {
                u6.a aVar8 = f16146c;
                aVar8.j("Time to complete the request is a negative value:" + this.f16147a.s0());
                return false;
            } else if (this.f16147a.D0() && !q(this.f16147a.u0())) {
                u6.a aVar9 = f16146c;
                aVar9.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f16147a.u0());
                return false;
            } else if (this.f16147a.C0() && this.f16147a.t0() > 0) {
                if (this.f16147a.y0()) {
                    return true;
                }
                f16146c.j("Did not receive a HTTP Response Code");
                return false;
            } else {
                u6.a aVar10 = f16146c;
                aVar10.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f16147a.t0());
                return false;
            }
        }
    }

    boolean l(h.d dVar) {
        return (dVar == null || dVar == h.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }
}
