package s1;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import s1.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f13325a;

    /* renamed from: b  reason: collision with root package name */
    private final a f13326b;

    /* renamed from: c  reason: collision with root package name */
    private b f13327c;

    /* renamed from: d  reason: collision with root package name */
    private u1.e f13328d;

    /* renamed from: f  reason: collision with root package name */
    private int f13330f;

    /* renamed from: h  reason: collision with root package name */
    private AudioFocusRequest f13332h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13333i;

    /* renamed from: g  reason: collision with root package name */
    private float f13331g = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private int f13329e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f13334a;

        public a(Handler handler) {
            this.f13334a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            d.this.h(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f13334a.post(new Runnable() { // from class: s1.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.this.b(i10);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void F(float f10);

        void a(int i10);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f13325a = (AudioManager) p3.a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f13327c = bVar;
        this.f13326b = new a(handler);
    }

    private void a() {
        this.f13325a.abandonAudioFocus(this.f13326b);
    }

    private void b() {
        if (this.f13329e == 0) {
            return;
        }
        if (p3.m0.f12306a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f13332h;
        if (audioFocusRequest != null) {
            this.f13325a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int e(u1.e eVar) {
        if (eVar == null) {
            return 0;
        }
        switch (eVar.f14911p) {
            case 0:
                p3.r.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (eVar.f14909n == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                p3.r.i("AudioFocusManager", "Unidentified audio usage: " + eVar.f14911p);
                return 0;
            case 16:
                return p3.m0.f12306a >= 19 ? 4 : 2;
        }
        return 3;
    }

    private void f(int i10) {
        b bVar = this.f13327c;
        if (bVar != null) {
            bVar.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i10) {
        int i11;
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || q()) {
                f(0);
                i11 = 2;
            } else {
                i11 = 3;
            }
            n(i11);
        } else if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 == 1) {
            n(1);
            f(1);
        } else {
            p3.r.i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private int j() {
        if (this.f13329e == 1) {
            return 1;
        }
        if ((p3.m0.f12306a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f13325a.requestAudioFocus(this.f13326b, p3.m0.f0(((u1.e) p3.a.e(this.f13328d)).f14911p), this.f13330f);
    }

    private int l() {
        AudioFocusRequest audioFocusRequest = this.f13332h;
        if (audioFocusRequest == null || this.f13333i) {
            this.f13332h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f13330f) : new AudioFocusRequest.Builder(this.f13332h)).setAudioAttributes(((u1.e) p3.a.e(this.f13328d)).b().f14915a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f13326b).build();
            this.f13333i = false;
        }
        return this.f13325a.requestAudioFocus(this.f13332h);
    }

    private void n(int i10) {
        if (this.f13329e == i10) {
            return;
        }
        this.f13329e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f13331g == f10) {
            return;
        }
        this.f13331g = f10;
        b bVar = this.f13327c;
        if (bVar != null) {
            bVar.F(f10);
        }
    }

    private boolean o(int i10) {
        return i10 == 1 || this.f13330f != 1;
    }

    private boolean q() {
        u1.e eVar = this.f13328d;
        return eVar != null && eVar.f14909n == 1;
    }

    public float g() {
        return this.f13331g;
    }

    public void i() {
        this.f13327c = null;
        b();
    }

    public void m(u1.e eVar) {
        if (p3.m0.c(this.f13328d, eVar)) {
            return;
        }
        this.f13328d = eVar;
        int e10 = e(eVar);
        this.f13330f = e10;
        boolean z10 = true;
        if (e10 != 1 && e10 != 0) {
            z10 = false;
        }
        p3.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int p(boolean z10, int i10) {
        if (o(i10)) {
            b();
            return z10 ? 1 : -1;
        } else if (z10) {
            return j();
        } else {
            return -1;
        }
    }
}
