package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.i9;
import java.io.IOException;
/* loaded from: classes.dex */
public class f9<MessageType extends i9<MessageType, BuilderType>, BuilderType extends f9<MessageType, BuilderType>> extends p7<MessageType, BuilderType> {

    /* renamed from: n  reason: collision with root package name */
    private final i9 f3848n;

    /* renamed from: o  reason: collision with root package name */
    protected i9 f3849o;

    /* JADX INFO: Access modifiers changed from: protected */
    public f9(MessageType messagetype) {
        this.f3848n = messagetype;
        if (messagetype.x()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f3849o = messagetype.l();
    }

    private static void m(Object obj, Object obj2) {
        wa.a().b(obj.getClass()).c(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final /* bridge */ /* synthetic */ p7 i(byte[] bArr, int i10, int i11) {
        p(bArr, 0, i11, u8.f4236c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final /* bridge */ /* synthetic */ p7 l(byte[] bArr, int i10, int i11, u8 u8Var) {
        p(bArr, 0, i11, u8Var);
        return this;
    }

    public final f9 n(i9 i9Var) {
        if (!this.f3848n.equals(i9Var)) {
            if (!this.f3849o.x()) {
                u();
            }
            m(this.f3849o, i9Var);
        }
        return this;
    }

    public final f9 p(byte[] bArr, int i10, int i11, u8 u8Var) {
        if (!this.f3849o.x()) {
            u();
        }
        try {
            wa.a().b(this.f3849o.getClass()).f(this.f3849o, bArr, 0, i11, new t7(u8Var));
            return this;
        } catch (r9 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw r9.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType q() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.i9 r0 = r5.k()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.D(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.measurement.wa r3 = com.google.android.gms.internal.measurement.wa.a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.za r3 = r3.b(r4)
            boolean r3 = r3.h(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.D(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.qb r1 = new com.google.android.gms.internal.measurement.qb
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.f9.q():com.google.android.gms.internal.measurement.i9");
    }

    @Override // com.google.android.gms.internal.measurement.na
    /* renamed from: s */
    public MessageType k() {
        if (this.f3849o.x()) {
            this.f3849o.t();
            return (MessageType) this.f3849o;
        }
        return (MessageType) this.f3849o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        if (this.f3849o.x()) {
            return;
        }
        u();
    }

    protected void u() {
        i9 l10 = this.f3848n.l();
        m(l10, this.f3849o);
        this.f3849o = l10;
    }

    /* renamed from: v */
    public final f9 clone() {
        f9 f9Var = (f9) this.f3848n.D(5, null, null);
        f9Var.f3849o = k();
        return f9Var;
    }
}
