package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import java.util.ArrayList;
import java.util.List;
import k0.j;
import s0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f2598e = j.f("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f2599a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2600b;

    /* renamed from: c  reason: collision with root package name */
    private final e f2601c;

    /* renamed from: d  reason: collision with root package name */
    private final o0.d f2602d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, int i10, e eVar) {
        this.f2599a = context;
        this.f2600b = i10;
        this.f2601c = eVar;
        this.f2602d = new o0.d(context, eVar.f(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        List<p> r10 = this.f2601c.g().o().B().r();
        ConstraintProxy.a(this.f2599a, r10);
        this.f2602d.d(r10);
        ArrayList<p> arrayList = new ArrayList(r10.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p pVar : r10) {
            String str = pVar.f13231a;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.f2602d.c(str))) {
                arrayList.add(pVar);
            }
        }
        for (p pVar2 : arrayList) {
            String str2 = pVar2.f13231a;
            Intent c10 = b.c(this.f2599a, str2);
            j.c().a(f2598e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f2601c;
            eVar.k(new e.b(eVar, c10, this.f2600b));
        }
        this.f2602d.e();
    }
}
