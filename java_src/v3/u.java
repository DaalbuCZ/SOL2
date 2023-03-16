package v3;

import android.os.Bundle;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class u<T> {

    /* renamed from: a  reason: collision with root package name */
    final int f15629a;

    /* renamed from: b  reason: collision with root package name */
    final t4.j<T> f15630b = new t4.j<>();

    /* renamed from: c  reason: collision with root package name */
    final int f15631c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f15632d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(int i10, int i11, Bundle bundle) {
        this.f15629a = i10;
        this.f15631c = i11;
        this.f15632d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(v vVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(vVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f15630b.b(vVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t10);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f15630b.c(t10);
    }

    public final String toString() {
        int i10 = this.f15631c;
        int i11 = this.f15629a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i10);
        sb.append(" id=");
        sb.append(i11);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
