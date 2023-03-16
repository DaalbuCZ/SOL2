package com.google.firebase.installations;

import com.google.firebase.installations.g;
import java.util.Objects;
/* loaded from: classes.dex */
final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final String f5393a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5394b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5395c;

    /* loaded from: classes.dex */
    static final class b extends g.a {

        /* renamed from: a  reason: collision with root package name */
        private String f5396a;

        /* renamed from: b  reason: collision with root package name */
        private Long f5397b;

        /* renamed from: c  reason: collision with root package name */
        private Long f5398c;

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f5396a == null) {
                str = " token";
            }
            if (this.f5397b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f5398c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f5396a, this.f5397b.longValue(), this.f5398c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f5396a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j10) {
            this.f5398c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j10) {
            this.f5397b = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, long j10, long j11) {
        this.f5393a = str;
        this.f5394b = j10;
        this.f5395c = j11;
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f5393a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f5395c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f5394b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f5393a.equals(gVar.b()) && this.f5394b == gVar.d() && this.f5395c == gVar.c();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f5394b;
        long j11 = this.f5395c;
        return ((((this.f5393a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f5393a + ", tokenExpirationTimestamp=" + this.f5394b + ", tokenCreationTimestamp=" + this.f5395c + "}";
    }
}
