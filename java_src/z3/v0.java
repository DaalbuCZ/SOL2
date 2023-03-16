package z3;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import z3.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v0 extends l4.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f17447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(c cVar, Looper looper) {
        super(looper);
        this.f17447a = cVar;
    }

    private static final void a(Message message) {
        w0 w0Var = (w0) message.obj;
        w0Var.b();
        w0Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.a aVar;
        c.a aVar2;
        w3.b bVar;
        w3.b bVar2;
        boolean z10;
        if (this.f17447a.P.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f17447a.t()) || message.what == 5)) && !this.f17447a.i()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f17447a.M = new w3.b(message.arg2);
            if (c.h0(this.f17447a)) {
                c cVar = this.f17447a;
                z10 = cVar.N;
                if (!z10) {
                    cVar.i0(3, null);
                    return;
                }
            }
            c cVar2 = this.f17447a;
            bVar2 = cVar2.M;
            w3.b bVar3 = bVar2 != null ? cVar2.M : new w3.b(8);
            this.f17447a.C.a(bVar3);
            this.f17447a.L(bVar3);
        } else if (i11 == 5) {
            c cVar3 = this.f17447a;
            bVar = cVar3.M;
            w3.b bVar4 = bVar != null ? cVar3.M : new w3.b(8);
            this.f17447a.C.a(bVar4);
            this.f17447a.L(bVar4);
        } else if (i11 == 3) {
            Object obj = message.obj;
            w3.b bVar5 = new w3.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f17447a.C.a(bVar5);
            this.f17447a.L(bVar5);
        } else if (i11 == 6) {
            this.f17447a.i0(5, null);
            c cVar4 = this.f17447a;
            aVar = cVar4.H;
            if (aVar != null) {
                aVar2 = cVar4.H;
                aVar2.a(message.arg2);
            }
            this.f17447a.M(message.arg2);
            c.g0(this.f17447a, 5, 1, null);
        } else if (i11 == 2 && !this.f17447a.a()) {
            a(message);
        } else if (b(message)) {
            ((w0) message.obj).c();
        } else {
            int i12 = message.what;
            Log.wtf("GmsClient", "Don't know how to handle message: " + i12, new Exception());
        }
    }
}
