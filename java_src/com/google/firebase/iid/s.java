package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
class s {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5376a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final Map<Pair<String, String>, t4.i<l>> f5377b = new m.a();

    /* loaded from: classes.dex */
    interface a {
        t4.i<l> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(Executor executor) {
        this.f5376a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public synchronized t4.i<l> a(String str, String str2, a aVar) {
        final Pair pair = new Pair(str, str2);
        t4.i<l> iVar = this.f5377b.get(pair);
        if (iVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(valueOf.length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return iVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        t4.i j10 = aVar.start().j(this.f5376a, new t4.a(this, pair) { // from class: com.google.firebase.iid.r

            /* renamed from: a  reason: collision with root package name */
            private final s f5374a;

            /* renamed from: b  reason: collision with root package name */
            private final Pair f5375b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f5374a = this;
                this.f5375b = pair;
            }

            @Override // t4.a
            public Object a(t4.i iVar2) {
                this.f5374a.b(this.f5375b, iVar2);
                return iVar2;
            }
        });
        this.f5377b.put(pair, j10);
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ t4.i b(Pair pair, t4.i iVar) {
        synchronized (this) {
            this.f5377b.remove(pair);
        }
        return iVar;
    }
}
