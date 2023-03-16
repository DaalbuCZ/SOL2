package y2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p3.m0;
/* loaded from: classes.dex */
public class c implements t2.a<c> {

    /* renamed from: a  reason: collision with root package name */
    public final long f16865a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16866b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16867c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16868d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16869e;

    /* renamed from: f  reason: collision with root package name */
    public final long f16870f;

    /* renamed from: g  reason: collision with root package name */
    public final long f16871g;

    /* renamed from: h  reason: collision with root package name */
    public final long f16872h;

    /* renamed from: i  reason: collision with root package name */
    public final o f16873i;

    /* renamed from: j  reason: collision with root package name */
    public final l f16874j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f16875k;

    /* renamed from: l  reason: collision with root package name */
    public final h f16876l;

    /* renamed from: m  reason: collision with root package name */
    private final List<g> f16877m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f16865a = j10;
        this.f16866b = j11;
        this.f16867c = j12;
        this.f16868d = z10;
        this.f16869e = j13;
        this.f16870f = j14;
        this.f16871g = j15;
        this.f16872h = j16;
        this.f16876l = hVar;
        this.f16873i = oVar;
        this.f16875k = uri;
        this.f16874j = lVar;
        this.f16877m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<t2.c> linkedList) {
        t2.c poll = linkedList.poll();
        int i10 = poll.f14709n;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = poll.f14710o;
            a aVar = list.get(i11);
            List<j> list2 = aVar.f16857c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f14711p));
                poll = linkedList.poll();
                if (poll.f14709n != i10) {
                    break;
                }
            } while (poll.f14710o == i11);
            arrayList.add(new a(aVar.f16855a, aVar.f16856b, arrayList2, aVar.f16858d, aVar.f16859e, aVar.f16860f));
        } while (poll.f14709n == i10);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // t2.a
    /* renamed from: b */
    public final c a(List<t2.c> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new t2.c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((t2.c) linkedList.peek()).f14709n != i10) {
                long f10 = f(i10);
                if (f10 != -9223372036854775807L) {
                    j10 += f10;
                }
            } else {
                g d10 = d(i10);
                arrayList.add(new g(d10.f16900a, d10.f16901b - j10, c(d10.f16902c, linkedList), d10.f16903d));
            }
            i10++;
        }
        long j11 = this.f16866b;
        return new c(this.f16865a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f16867c, this.f16868d, this.f16869e, this.f16870f, this.f16871g, this.f16872h, this.f16876l, this.f16873i, this.f16874j, this.f16875k, arrayList);
    }

    public final g d(int i10) {
        return this.f16877m.get(i10);
    }

    public final int e() {
        return this.f16877m.size();
    }

    public final long f(int i10) {
        if (i10 == this.f16877m.size() - 1) {
            long j10 = this.f16866b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j10 - this.f16877m.get(i10).f16901b;
        }
        return this.f16877m.get(i10 + 1).f16901b - this.f16877m.get(i10).f16901b;
    }

    public final long g(int i10) {
        return m0.A0(f(i10));
    }
}
