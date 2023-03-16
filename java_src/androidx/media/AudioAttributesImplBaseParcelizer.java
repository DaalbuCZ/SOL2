package androidx.media;
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2158a = aVar.p(audioAttributesImplBase.f2158a, 1);
        audioAttributesImplBase.f2159b = aVar.p(audioAttributesImplBase.f2159b, 2);
        audioAttributesImplBase.f2160c = aVar.p(audioAttributesImplBase.f2160c, 3);
        audioAttributesImplBase.f2161d = aVar.p(audioAttributesImplBase.f2161d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f2158a, 1);
        aVar.F(audioAttributesImplBase.f2159b, 2);
        aVar.F(audioAttributesImplBase.f2160c, 3);
        aVar.F(audioAttributesImplBase.f2161d, 4);
    }
}
