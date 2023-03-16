package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    final MediaController.Callback f379a;

    /* renamed from: b  reason: collision with root package name */
    android.support.v4.media.session.a f380b;

    /* loaded from: classes.dex */
    private static class a extends MediaController.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f381a;

        a(c cVar) {
            this.f381a = new WeakReference<>(cVar);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            c cVar = this.f381a.get();
            if (cVar != null) {
                cVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f381a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            c cVar = this.f381a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            c cVar = this.f381a.get();
            if (cVar == null || cVar.f380b != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(playbackState));
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            c cVar = this.f381a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            c cVar = this.f381a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            c cVar = this.f381a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f381a.get();
            if (cVar != null) {
                if (cVar.f380b == null || Build.VERSION.SDK_INT >= 23) {
                    cVar.h(str, bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends a.AbstractBinderC0007a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f382a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(c cVar) {
            this.f382a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void I(int i10) {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void J() {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        public void K(Bundle bundle) {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(7, bundle, null);
            }
        }

        public void N(List<MediaSessionCompat.QueueItem> list) {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void a0(boolean z10) {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void f0(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void h(int i10) {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void i(String str, Bundle bundle) {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void j(boolean z10) {
        }

        public void l(CharSequence charSequence) {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(6, charSequence, null);
            }
        }

        public void l0(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f356n, parcelableVolumeInfo.f357o, parcelableVolumeInfo.f358p, parcelableVolumeInfo.f359q, parcelableVolumeInfo.f360r) : null, null);
            }
        }

        public void q() {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(8, null, null);
            }
        }

        public void t(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = this.f382a.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f379a = new a(this);
            return;
        }
        this.f379a = null;
        this.f380b = new b(this);
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i10, Object obj, Bundle bundle) {
    }
}
