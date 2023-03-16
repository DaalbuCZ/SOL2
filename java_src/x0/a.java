package x0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import c8.a;
import d8.c;
import l8.k;
import l8.m;
/* loaded from: classes.dex */
public class a implements c8.a, k.c, d8.a {

    /* renamed from: n  reason: collision with root package name */
    private Context f16159n;

    /* renamed from: o  reason: collision with root package name */
    private Activity f16160o;

    /* renamed from: p  reason: collision with root package name */
    private c f16161p;

    /* renamed from: q  reason: collision with root package name */
    private k.d f16162q;

    /* renamed from: r  reason: collision with root package name */
    private final m f16163r = new C0232a();

    /* renamed from: x0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0232a implements m {
        C0232a() {
        }

        @Override // l8.m
        public boolean a(int i10, int i11, Intent intent) {
            k.d dVar;
            String str;
            if (a.this.f16162q != null) {
                if (i10 == 9564) {
                    if (i11 == -1) {
                        dVar = a.this.f16162q;
                        str = intent.getExtras().getString("result.feedback.url");
                    } else {
                        dVar = a.this.f16162q;
                        str = null;
                    }
                    dVar.a(str);
                    return true;
                }
                return true;
            }
            return false;
        }
    }

    private void b(c cVar) {
        cVar.b(this.f16163r);
        this.f16161p = cVar;
    }

    private void c() {
        this.f16161p.h(this.f16163r);
        this.f16161p = null;
    }

    @Override // d8.a
    public void onAttachedToActivity(c cVar) {
        this.f16160o = cVar.e();
        b(cVar);
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        new k(bVar.b(), "flutter_bugfender").e(this);
        this.f16159n = bVar.a();
    }

    @Override // d8.a
    public void onDetachedFromActivity() {
        this.f16160o = null;
        c();
    }

    @Override // d8.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f16160o = null;
        c();
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f16159n = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021d, code lost:
        if (r9.equals("setDeviceString") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03c0, code lost:
        if (r3.equals("sendIssue") == false) goto L85;
     */
    @Override // l8.k.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(l8.j r22, l8.k.d r23) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.onMethodCall(l8.j, l8.k$d):void");
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        this.f16160o = cVar.e();
        b(cVar);
    }
}
