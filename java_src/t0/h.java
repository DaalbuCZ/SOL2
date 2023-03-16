package t0;

import androidx.work.WorkerParameters;
/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private l0.i f14443n;

    /* renamed from: o  reason: collision with root package name */
    private String f14444o;

    /* renamed from: p  reason: collision with root package name */
    private WorkerParameters.a f14445p;

    public h(l0.i iVar, String str, WorkerParameters.a aVar) {
        this.f14443n = iVar;
        this.f14444o = str;
        this.f14445p = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f14443n.m().k(this.f14444o, this.f14445p);
    }
}
