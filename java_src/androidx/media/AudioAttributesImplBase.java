package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f2158a;

    /* renamed from: b  reason: collision with root package name */
    public int f2159b;

    /* renamed from: c  reason: collision with root package name */
    public int f2160c;

    /* renamed from: d  reason: collision with root package name */
    public int f2161d;

    /* loaded from: classes.dex */
    static class a implements AudioAttributesImpl.a {

        /* renamed from: a  reason: collision with root package name */
        private int f2162a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f2163b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f2164c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f2165d = -1;

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl a() {
            return new AudioAttributesImplBase(this.f2163b, this.f2164c, this.f2162a, this.f2165d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: c */
        public a b(int i10) {
            if (i10 != 10) {
                this.f2165d = i10;
                return this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplBase() {
        this.f2158a = 0;
        this.f2159b = 0;
        this.f2160c = 0;
        this.f2161d = -1;
    }

    AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f2158a = 0;
        this.f2159b = 0;
        this.f2160c = 0;
        this.f2161d = -1;
        this.f2159b = i10;
        this.f2160c = i11;
        this.f2158a = i12;
        this.f2161d = i13;
    }

    public int a() {
        return this.f2159b;
    }

    public int b() {
        int i10 = this.f2160c;
        int c10 = c();
        if (c10 == 6) {
            i10 |= 4;
        } else if (c10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f2161d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f2160c, this.f2158a);
    }

    public int d() {
        return this.f2158a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            return this.f2159b == audioAttributesImplBase.a() && this.f2160c == audioAttributesImplBase.b() && this.f2158a == audioAttributesImplBase.d() && this.f2161d == audioAttributesImplBase.f2161d;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2159b), Integer.valueOf(this.f2160c), Integer.valueOf(this.f2158a), Integer.valueOf(this.f2161d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2161d != -1) {
            sb.append(" stream=");
            sb.append(this.f2161d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f2158a));
        sb.append(" content=");
        sb.append(this.f2159b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2160c).toUpperCase());
        return sb.toString();
    }
}
