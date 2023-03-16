package com.google.firebase.perf.network;

import a7.l;
import androidx.annotation.Keep;
import java.io.IOException;
import v6.h;
import x6.d;
import x6.e;
import y9.g;
import z6.k;
/* loaded from: classes.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    static void a(g gVar, h hVar, long j10, long j11) {
        throw null;
    }

    @Keep
    public static void enqueue(y9.a aVar, y9.b bVar) {
        l lVar = new l();
        aVar.y(new d(bVar, k.k(), lVar, lVar.e()));
    }

    @Keep
    public static g execute(y9.a aVar) {
        h c10 = h.c(k.k());
        l lVar = new l();
        long e10 = lVar.e();
        try {
            g b10 = aVar.b();
            a(b10, c10, e10, lVar.c());
            return b10;
        } catch (IOException e11) {
            aVar.r();
            c10.t(e10);
            c10.x(lVar.c());
            e.d(c10);
            throw e11;
        }
    }
}
