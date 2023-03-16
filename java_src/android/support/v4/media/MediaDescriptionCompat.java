package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    private final String f319n;

    /* renamed from: o  reason: collision with root package name */
    private final CharSequence f320o;

    /* renamed from: p  reason: collision with root package name */
    private final CharSequence f321p;

    /* renamed from: q  reason: collision with root package name */
    private final CharSequence f322q;

    /* renamed from: r  reason: collision with root package name */
    private final Bitmap f323r;

    /* renamed from: s  reason: collision with root package name */
    private final Uri f324s;

    /* renamed from: t  reason: collision with root package name */
    private final Bundle f325t;

    /* renamed from: u  reason: collision with root package name */
    private final Uri f326u;

    /* renamed from: v  reason: collision with root package name */
    private MediaDescription f327v;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f328a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f329b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f330c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f331d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f332e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f333f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f334g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f335h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f328a, this.f329b, this.f330c, this.f331d, this.f332e, this.f333f, this.f334g, this.f335h);
        }

        public b b(CharSequence charSequence) {
            this.f331d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f334g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f332e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f333f = uri;
            return this;
        }

        public b f(String str) {
            this.f328a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f335h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f330c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f329b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f319n = parcel.readString();
        this.f320o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f321p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f322q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f323r = (Bitmap) parcel.readParcelable(classLoader);
        this.f324s = (Uri) parcel.readParcelable(classLoader);
        this.f325t = parcel.readBundle(classLoader);
        this.f326u = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f319n = str;
        this.f320o = charSequence;
        this.f321p = charSequence2;
        this.f322q = charSequence3;
        this.f323r = bitmap;
        this.f324s = uri;
        this.f325t = bundle;
        this.f326u = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L80
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L80
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = r9.getMediaId()
            r2.f(r3)
            java.lang.CharSequence r3 = r9.getTitle()
            r2.i(r3)
            java.lang.CharSequence r3 = r9.getSubtitle()
            r2.h(r3)
            java.lang.CharSequence r3 = r9.getDescription()
            r2.b(r3)
            android.graphics.Bitmap r3 = r9.getIconBitmap()
            r2.d(r3)
            android.net.Uri r3 = r9.getIconUri()
            r2.e(r3)
            android.os.Bundle r3 = r9.getExtras()
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4c
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L4d
        L4c:
            r5 = r0
        L4d:
            if (r5 == 0) goto L65
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5f
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5f
            goto L66
        L5f:
            r3.remove(r4)
            r3.remove(r6)
        L65:
            r0 = r3
        L66:
            r2.c(r0)
            if (r5 == 0) goto L6f
            r2.g(r5)
            goto L7a
        L6f:
            r0 = 23
            if (r1 < r0) goto L7a
            android.net.Uri r0 = r9.getMediaUri()
            r2.g(r0)
        L7a:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f327v = r9
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        int i10;
        MediaDescription mediaDescription = this.f327v;
        if (mediaDescription != null || (i10 = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f319n);
        builder.setTitle(this.f320o);
        builder.setSubtitle(this.f321p);
        builder.setDescription(this.f322q);
        builder.setIconBitmap(this.f323r);
        builder.setIconUri(this.f324s);
        Bundle bundle = this.f325t;
        if (i10 < 23 && this.f326u != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f326u);
        }
        builder.setExtras(bundle);
        if (i10 >= 23) {
            builder.setMediaUri(this.f326u);
        }
        MediaDescription build = builder.build();
        this.f327v = build;
        return build;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f320o) + ", " + ((Object) this.f321p) + ", " + ((Object) this.f322q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((MediaDescription) b()).writeToParcel(parcel, i10);
            return;
        }
        parcel.writeString(this.f319n);
        TextUtils.writeToParcel(this.f320o, parcel, i10);
        TextUtils.writeToParcel(this.f321p, parcel, i10);
        TextUtils.writeToParcel(this.f322q, parcel, i10);
        parcel.writeParcelable(this.f323r, i10);
        parcel.writeParcelable(this.f324s, i10);
        parcel.writeBundle(this.f325t);
        parcel.writeParcelable(this.f326u, i10);
    }
}
