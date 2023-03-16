package w6;

import b7.m;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final u6.a f16149b = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final m f16150a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(m mVar) {
        this.f16150a = mVar;
    }

    private boolean g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                e.d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e10) {
                f16149b.j(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(m mVar) {
        return i(mVar, 0);
    }

    private boolean i(m mVar, int i10) {
        u6.a aVar;
        StringBuilder sb;
        String sb2;
        if (mVar == null) {
            return false;
        }
        if (i10 <= 1) {
            for (Map.Entry<String, Long> entry : mVar.j0().entrySet()) {
                if (!l(entry.getKey())) {
                    aVar = f16149b;
                    sb = new StringBuilder();
                    sb.append("invalid CounterId:");
                    sb.append(entry.getKey());
                } else if (!m(entry.getValue())) {
                    aVar = f16149b;
                    sb = new StringBuilder();
                    sb.append("invalid CounterValue:");
                    sb.append(entry.getValue());
                }
                sb2 = sb.toString();
            }
            for (m mVar2 : mVar.r0()) {
                if (!i(mVar2, i10 + 1)) {
                    return false;
                }
            }
            return true;
        }
        aVar = f16149b;
        sb2 = "Exceed MAX_SUBTRACE_DEEP:1";
        aVar.j(sb2);
        return false;
    }

    private boolean j(m mVar) {
        boolean z10;
        if (mVar.i0() > 0) {
            return true;
        }
        for (m mVar2 : mVar.r0()) {
            if (mVar2.i0() > 0) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    private boolean k(m mVar) {
        return mVar.p0().startsWith("_st_");
    }

    private boolean l(String str) {
        u6.a aVar;
        String str2;
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            aVar = f16149b;
            str2 = "counterId is empty";
        } else if (trim.length() <= 100) {
            return true;
        } else {
            aVar = f16149b;
            str2 = "counterId exceeded max length 100";
        }
        aVar.j(str2);
        return false;
    }

    private boolean m(Long l10) {
        return l10 != null;
    }

    private boolean n(m mVar) {
        Long l10 = mVar.j0().get(a7.b.FRAMES_TOTAL.toString());
        return l10 != null && l10.compareTo((Long) 0L) > 0;
    }

    private boolean o(m mVar, int i10) {
        if (mVar == null) {
            f16149b.j("TraceMetric is null");
            return false;
        } else if (i10 > 1) {
            f16149b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!q(mVar.p0())) {
            u6.a aVar = f16149b;
            aVar.j("invalid TraceId:" + mVar.p0());
            return false;
        } else if (!p(mVar)) {
            u6.a aVar2 = f16149b;
            aVar2.j("invalid TraceDuration:" + mVar.m0());
            return false;
        } else if (!mVar.s0()) {
            f16149b.j("clientStartTimeUs is null.");
            return false;
        } else if (k(mVar) && !n(mVar)) {
            u6.a aVar3 = f16149b;
            aVar3.j("non-positive totalFrames in screen trace " + mVar.p0());
            return false;
        } else {
            for (m mVar2 : mVar.r0()) {
                if (!o(mVar2, i10 + 1)) {
                    return false;
                }
            }
            return g(mVar.k0());
        }
    }

    private boolean p(m mVar) {
        return mVar != null && mVar.m0() > 0;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }

    @Override // w6.e
    public boolean c() {
        u6.a aVar;
        StringBuilder sb;
        String str;
        if (!o(this.f16150a, 0)) {
            aVar = f16149b;
            sb = new StringBuilder();
            str = "Invalid Trace:";
        } else if (!j(this.f16150a) || h(this.f16150a)) {
            return true;
        } else {
            aVar = f16149b;
            sb = new StringBuilder();
            str = "Invalid Counters for Trace:";
        }
        sb.append(str);
        sb.append(this.f16150a.p0());
        aVar.j(sb.toString());
        return false;
    }
}
