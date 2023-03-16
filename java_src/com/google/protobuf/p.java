package com.google.protobuf;

import com.google.protobuf.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class p {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6061b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile p f6062c;

    /* renamed from: d  reason: collision with root package name */
    static final p f6063d = new p(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, y.e<?, ?>> f6064a;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f6065a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6066b;

        a(Object obj, int i10) {
            this.f6065a = obj;
            this.f6066b = i10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f6065a == aVar.f6065a && this.f6066b == aVar.f6066b;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f6065a) * 65535) + this.f6066b;
        }
    }

    p() {
        this.f6064a = new HashMap();
    }

    p(boolean z10) {
        this.f6064a = Collections.emptyMap();
    }

    public static p b() {
        p pVar = f6062c;
        if (pVar == null) {
            synchronized (p.class) {
                pVar = f6062c;
                if (pVar == null) {
                    pVar = f6061b ? o.a() : f6063d;
                    f6062c = pVar;
                }
            }
        }
        return pVar;
    }

    public <ContainingType extends s0> y.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (y.e<ContainingType, ?>) this.f6064a.get(new a(containingtype, i10));
    }
}
