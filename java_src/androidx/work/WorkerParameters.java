package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import k0.f;
import k0.o;
import k0.v;
/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f2521a;

    /* renamed from: b  reason: collision with root package name */
    private b f2522b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f2523c;

    /* renamed from: d  reason: collision with root package name */
    private a f2524d;

    /* renamed from: e  reason: collision with root package name */
    private int f2525e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f2526f;

    /* renamed from: g  reason: collision with root package name */
    private u0.a f2527g;

    /* renamed from: h  reason: collision with root package name */
    private v f2528h;

    /* renamed from: i  reason: collision with root package name */
    private o f2529i;

    /* renamed from: j  reason: collision with root package name */
    private f f2530j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f2531a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f2532b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f2533c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, Executor executor, u0.a aVar2, v vVar, o oVar, f fVar) {
        this.f2521a = uuid;
        this.f2522b = bVar;
        this.f2523c = new HashSet(collection);
        this.f2524d = aVar;
        this.f2525e = i10;
        this.f2526f = executor;
        this.f2527g = aVar2;
        this.f2528h = vVar;
        this.f2529i = oVar;
        this.f2530j = fVar;
    }

    public Executor a() {
        return this.f2526f;
    }

    public f b() {
        return this.f2530j;
    }

    public UUID c() {
        return this.f2521a;
    }

    public b d() {
        return this.f2522b;
    }

    public v e() {
        return this.f2528h;
    }
}
