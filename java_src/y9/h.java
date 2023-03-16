package y9;

import java.io.Closeable;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class h implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ long f17121n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ aa.b f17122o;

        a(d dVar, long j10, aa.b bVar) {
            this.f17121n = j10;
            this.f17122o = bVar;
        }

        @Override // y9.h
        public aa.b c() {
            return this.f17122o;
        }
    }

    public static h a(@Nullable d dVar, long j10, aa.b bVar) {
        Objects.requireNonNull(bVar, "source == null");
        return new a(dVar, j10, bVar);
    }

    public static h b(@Nullable d dVar, byte[] bArr) {
        return a(dVar, bArr.length, new aa.a().X(bArr));
    }

    public abstract aa.b c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        z9.a.c(c());
    }
}
