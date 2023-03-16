package e6;

import e6.d;
import java.lang.annotation.Annotation;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f6770a;

    /* renamed from: b  reason: collision with root package name */
    private d.a f6771b = d.a.DEFAULT;

    /* renamed from: e6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0098a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f6772a;

        /* renamed from: b  reason: collision with root package name */
        private final d.a f6773b;

        C0098a(int i10, d.a aVar) {
            this.f6772a = i10;
            this.f6773b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f6772a == dVar.tag() && this.f6773b.equals(dVar.intEncoding());
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f6772a ^ 14552422) + (this.f6773b.hashCode() ^ 2041407134);
        }

        @Override // e6.d
        public d.a intEncoding() {
            return this.f6773b;
        }

        @Override // e6.d
        public int tag() {
            return this.f6772a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f6772a + "intEncoding=" + this.f6773b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0098a(this.f6770a, this.f6771b);
    }

    public a c(int i10) {
        this.f6770a = i10;
        return this;
    }
}
