package e6;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i implements b6.g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6798a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6799b = false;

    /* renamed from: c  reason: collision with root package name */
    private b6.c f6800c;

    /* renamed from: d  reason: collision with root package name */
    private final f f6801d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f6801d = fVar;
    }

    private void a() {
        if (this.f6798a) {
            throw new b6.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6798a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(b6.c cVar, boolean z10) {
        this.f6798a = false;
        this.f6800c = cVar;
        this.f6799b = z10;
    }

    @Override // b6.g
    public b6.g d(String str) {
        a();
        this.f6801d.h(this.f6800c, str, this.f6799b);
        return this;
    }

    @Override // b6.g
    public b6.g e(boolean z10) {
        a();
        this.f6801d.n(this.f6800c, z10, this.f6799b);
        return this;
    }
}
