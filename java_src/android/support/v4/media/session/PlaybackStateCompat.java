package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    final int f361n;

    /* renamed from: o  reason: collision with root package name */
    final long f362o;

    /* renamed from: p  reason: collision with root package name */
    final long f363p;

    /* renamed from: q  reason: collision with root package name */
    final float f364q;

    /* renamed from: r  reason: collision with root package name */
    final long f365r;

    /* renamed from: s  reason: collision with root package name */
    final int f366s;

    /* renamed from: t  reason: collision with root package name */
    final CharSequence f367t;

    /* renamed from: u  reason: collision with root package name */
    final long f368u;

    /* renamed from: v  reason: collision with root package name */
    List<CustomAction> f369v;

    /* renamed from: w  reason: collision with root package name */
    final long f370w;

    /* renamed from: x  reason: collision with root package name */
    final Bundle f371x;

    /* renamed from: y  reason: collision with root package name */
    private PlaybackState f372y;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: n  reason: collision with root package name */
        private final String f373n;

        /* renamed from: o  reason: collision with root package name */
        private final CharSequence f374o;

        /* renamed from: p  reason: collision with root package name */
        private final int f375p;

        /* renamed from: q  reason: collision with root package name */
        private final Bundle f376q;

        /* renamed from: r  reason: collision with root package name */
        private PlaybackState.CustomAction f377r;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f373n = parcel.readString();
            this.f374o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f375p = parcel.readInt();
            this.f376q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f373n = str;
            this.f374o = charSequence;
            this.f375p = i10;
            this.f376q = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
            customAction2.f377r = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f374o) + ", mIcon=" + this.f375p + ", mExtras=" + this.f376q;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f373n);
            TextUtils.writeToParcel(this.f374o, parcel, i10);
            parcel.writeInt(this.f375p);
            parcel.writeBundle(this.f376q);
        }
    }

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f361n = i10;
        this.f362o = j10;
        this.f363p = j11;
        this.f364q = f10;
        this.f365r = j12;
        this.f366s = i11;
        this.f367t = charSequence;
        this.f368u = j13;
        this.f369v = new ArrayList(list);
        this.f370w = j14;
        this.f371x = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f361n = parcel.readInt();
        this.f362o = parcel.readLong();
        this.f364q = parcel.readFloat();
        this.f368u = parcel.readLong();
        this.f363p = parcel.readLong();
        this.f365r = parcel.readLong();
        this.f367t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f369v = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f370w = parcel.readLong();
        this.f371x = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f366s = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                arrayList2.add(CustomAction.a(customAction));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), Build.VERSION.SDK_INT >= 22 ? playbackState.getExtras() : null);
        playbackStateCompat.f372y = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f361n + ", position=" + this.f362o + ", buffered position=" + this.f363p + ", speed=" + this.f364q + ", updated=" + this.f368u + ", actions=" + this.f365r + ", error code=" + this.f366s + ", error message=" + this.f367t + ", custom actions=" + this.f369v + ", active item id=" + this.f370w + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f361n);
        parcel.writeLong(this.f362o);
        parcel.writeFloat(this.f364q);
        parcel.writeLong(this.f368u);
        parcel.writeLong(this.f363p);
        parcel.writeLong(this.f365r);
        TextUtils.writeToParcel(this.f367t, parcel, i10);
        parcel.writeTypedList(this.f369v);
        parcel.writeLong(this.f370w);
        parcel.writeBundle(this.f371x);
        parcel.writeInt(this.f366s);
    }
}
