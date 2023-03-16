package y9;

import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f17118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ byte[] f17119b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f17120c;

        a(d dVar, int i10, byte[] bArr, int i11) {
            this.f17118a = i10;
            this.f17119b = bArr;
            this.f17120c = i11;
        }
    }

    public static f a(@Nullable d dVar, byte[] bArr) {
        return b(dVar, bArr, 0, bArr.length);
    }

    public static f b(@Nullable d dVar, byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "content == null");
        z9.a.b(bArr.length, i10, i11);
        return new a(dVar, i11, bArr, i10);
    }
}
