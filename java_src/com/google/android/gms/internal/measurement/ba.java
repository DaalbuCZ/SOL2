package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class ba extends n {

    /* renamed from: o  reason: collision with root package name */
    private final c f3742o;

    public ba(c cVar) {
        this.f3742o = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.n, com.google.android.gms.internal.measurement.q
    public final q x(String str, z4 z4Var, List list) {
        char c10;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            a6.h("getEventName", 0, list);
            return new u(this.f3742o.b().d());
        } else if (c10 == 1) {
            a6.h("getParamValue", 1, list);
            return b7.b(this.f3742o.b().c(z4Var.b((q) list.get(0)).g()));
        } else if (c10 == 2) {
            a6.h("getParams", 0, list);
            Map e10 = this.f3742o.b().e();
            n nVar = new n();
            for (String str2 : e10.keySet()) {
                nVar.v(str2, b7.b(e10.get(str2)));
            }
            return nVar;
        } else if (c10 == 3) {
            a6.h("getTimestamp", 0, list);
            return new i(Double.valueOf(this.f3742o.b().a()));
        } else if (c10 != 4) {
            if (c10 != 5) {
                return super.x(str, z4Var, list);
            }
            a6.h("setParamValue", 2, list);
            String g10 = z4Var.b((q) list.get(0)).g();
            q b10 = z4Var.b((q) list.get(1));
            this.f3742o.b().g(g10, a6.f(b10));
            return b10;
        } else {
            a6.h("setEventName", 1, list);
            q b11 = z4Var.b((q) list.get(0));
            if (q.f4079c.equals(b11) || q.f4080d.equals(b11)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            this.f3742o.b().f(b11.g());
            return new u(b11.g());
        }
    }
}
