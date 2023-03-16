package androidx.room;

import android.content.Context;
import androidx.room.h;
import b0.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final c.InterfaceC0057c f2172a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2173b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2174c;

    /* renamed from: d  reason: collision with root package name */
    public final h.d f2175d;

    /* renamed from: e  reason: collision with root package name */
    public final List<h.b> f2176e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2177f;

    /* renamed from: g  reason: collision with root package name */
    public final h.c f2178g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f2179h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f2180i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2181j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2182k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2183l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<Integer> f2184m;

    /* renamed from: n  reason: collision with root package name */
    public final String f2185n;

    /* renamed from: o  reason: collision with root package name */
    public final File f2186o;

    public a(Context context, String str, c.InterfaceC0057c interfaceC0057c, h.d dVar, List<h.b> list, boolean z10, h.c cVar, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this.f2172a = interfaceC0057c;
        this.f2173b = context;
        this.f2174c = str;
        this.f2175d = dVar;
        this.f2176e = list;
        this.f2177f = z10;
        this.f2178g = cVar;
        this.f2179h = executor;
        this.f2180i = executor2;
        this.f2181j = z11;
        this.f2182k = z12;
        this.f2183l = z13;
        this.f2184m = set;
        this.f2185n = str2;
        this.f2186o = file;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        if ((i10 > i11) && this.f2183l) {
            return false;
        }
        return this.f2182k && ((set = this.f2184m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
