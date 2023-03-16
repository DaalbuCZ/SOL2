package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: b  reason: collision with root package name */
    protected static final AtomicReference f4366b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    protected static final AtomicReference f4367c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    protected static final AtomicReference f4368d = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    private final p4.g f4369a;

    public a3(p4.g gVar) {
        this.f4369a = gVar;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        z3.o.i(strArr);
        z3.o.i(strArr2);
        z3.o.i(atomicReference);
        z3.o.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str3 = strArr[i10];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String b10 = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (b10 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(b10);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (this.f4369a.a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bundle[{");
            for (String str : bundle.keySet()) {
                if (sb.length() != 8) {
                    sb.append(", ");
                }
                sb.append(e(str));
                sb.append("=");
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
            sb.append("}]");
            return sb.toString();
        }
        return bundle.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(v vVar) {
        if (this.f4369a.a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("origin=");
            sb.append(vVar.f5102p);
            sb.append(",name=");
            sb.append(d(vVar.f5100n));
            sb.append(",params=");
            t tVar = vVar.f5101o;
            sb.append(tVar == null ? null : !this.f4369a.a() ? tVar.toString() : b(tVar.v()));
            return sb.toString();
        }
        return vVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f4369a.a() ? str : g(str, p4.q.f12408c, p4.q.f12406a, f4366b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f4369a.a() ? str : g(str, p4.r.f12411b, p4.r.f12410a, f4367c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (this.f4369a.a()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return g(str, p4.s.f12415b, p4.s.f12414a, f4368d);
        }
        return str;
    }
}
