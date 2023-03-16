package u2;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o3.l;
import o3.t;
import u2.u;
/* loaded from: classes.dex */
public final class j implements u.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f15246a;

    /* renamed from: b  reason: collision with root package name */
    private l.a f15247b;

    /* renamed from: c  reason: collision with root package name */
    private long f15248c;

    /* renamed from: d  reason: collision with root package name */
    private long f15249d;

    /* renamed from: e  reason: collision with root package name */
    private long f15250e;

    /* renamed from: f  reason: collision with root package name */
    private float f15251f;

    /* renamed from: g  reason: collision with root package name */
    private float f15252g;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final x1.r f15253a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<Integer, a5.o<u.a>> f15254b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Set<Integer> f15255c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Map<Integer, u.a> f15256d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private l.a f15257e;

        public a(x1.r rVar) {
            this.f15253a = rVar;
        }

        public void a(l.a aVar) {
            if (aVar != this.f15257e) {
                this.f15257e = aVar;
                this.f15254b.clear();
                this.f15256d.clear();
            }
        }
    }

    public j(Context context, x1.r rVar) {
        this(new t.a(context), rVar);
    }

    public j(l.a aVar, x1.r rVar) {
        this.f15247b = aVar;
        a aVar2 = new a(rVar);
        this.f15246a = aVar2;
        aVar2.a(aVar);
        this.f15248c = -9223372036854775807L;
        this.f15249d = -9223372036854775807L;
        this.f15250e = -9223372036854775807L;
        this.f15251f = -3.4028235E38f;
        this.f15252g = -3.4028235E38f;
    }
}
