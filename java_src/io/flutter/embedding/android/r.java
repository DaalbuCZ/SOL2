package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.n;
import io.flutter.embedding.android.s;
import io.flutter.embedding.android.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import l8.c;
/* loaded from: classes.dex */
public class r implements s.d {

    /* renamed from: a  reason: collision with root package name */
    private final l8.c f8571a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Long, Long> f8572b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Long, t.e> f8573c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final s.b f8574d = new s.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8575a;

        static {
            int[] iArr = new int[n.a.values().length];
            f8575a = iArr;
            try {
                iArr[n.a.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8575a[n.a.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8575a[n.a.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public r(l8.c cVar) {
        t.e[] a10;
        this.f8571a = cVar;
        for (t.e eVar : t.a()) {
            this.f8573c.put(Long.valueOf(eVar.f8595c), eVar);
        }
    }

    private static n.a e(KeyEvent keyEvent) {
        boolean z10 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z10 ? n.a.kRepeat : n.a.kDown;
        } else if (action == 1) {
            return n.a.kUp;
        } else {
            throw new AssertionError("Unexpected event type");
        }
    }

    private Long f(KeyEvent keyEvent) {
        Long l10 = t.f8587b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l10 != null ? l10 : Long.valueOf(i(keyEvent.getKeyCode(), 73014444032L));
    }

    private Long g(KeyEvent keyEvent) {
        int scanCode;
        long scanCode2 = keyEvent.getScanCode();
        if (scanCode2 == 0) {
            scanCode = keyEvent.getKeyCode();
        } else {
            Long l10 = t.f8586a.get(Long.valueOf(scanCode2));
            if (l10 != null) {
                return l10;
            }
            scanCode = keyEvent.getScanCode();
        }
        return Long.valueOf(i(scanCode, 73014444032L));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119 A[LOOP:2: B:55:0x0113->B:57:0x0119, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean h(android.view.KeyEvent r18, io.flutter.embedding.android.s.d.a r19) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.r.h(android.view.KeyEvent, io.flutter.embedding.android.s$d$a):boolean");
    }

    private static long i(long j10, long j11) {
        return (j10 & 4294967295L) | j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(s.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        byteBuffer.rewind();
        if (byteBuffer.capacity() != 0) {
            bool = Boolean.valueOf(byteBuffer.get() != 0);
        }
        aVar.a(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(t.c cVar, long j10, KeyEvent keyEvent) {
        p(false, Long.valueOf(cVar.f8590b), Long.valueOf(j10), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(t.c cVar, KeyEvent keyEvent) {
        p(false, Long.valueOf(cVar.f8590b), Long.valueOf(cVar.f8589a), keyEvent.getEventTime());
    }

    private void m(n nVar, final s.d.a aVar) {
        this.f8571a.h("flutter/keydata", nVar.a(), aVar == null ? null : new c.b() { // from class: io.flutter.embedding.android.q
            @Override // l8.c.b
            public final void a(ByteBuffer byteBuffer) {
                r.j(s.d.a.this, byteBuffer);
            }
        });
    }

    private void p(boolean z10, Long l10, Long l11, long j10) {
        n nVar = new n();
        nVar.f8552a = j10;
        nVar.f8553b = z10 ? n.a.kDown : n.a.kUp;
        nVar.f8555d = l10.longValue();
        nVar.f8554c = l11.longValue();
        nVar.f8557f = null;
        nVar.f8556e = true;
        if (l11.longValue() != 0 && l10.longValue() != 0) {
            if (!z10) {
                l10 = null;
            }
            q(l11, l10);
        }
        m(nVar, null);
    }

    @Override // io.flutter.embedding.android.s.d
    public void a(KeyEvent keyEvent, s.d.a aVar) {
        if (h(keyEvent, aVar)) {
            return;
        }
        p(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    void n(t.d dVar, boolean z10, long j10, final long j11, final KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        t.c[] cVarArr = dVar.f8592b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            t.c[] cVarArr2 = dVar.f8592b;
            boolean z12 = true;
            if (i10 >= cVarArr2.length) {
                break;
            }
            final t.c cVar = cVarArr2[i10];
            zArr[i10] = this.f8572b.containsKey(Long.valueOf(cVar.f8589a));
            if (cVar.f8590b == j10) {
                int i11 = a.f8575a[e(keyEvent).ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    } else if (i11 == 3) {
                        if (!z10) {
                            arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    r.this.l(cVar, keyEvent);
                                }
                            });
                        }
                        boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    }
                    i10++;
                } else {
                    boolArr[i10] = Boolean.FALSE;
                    if (!z10) {
                        arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                r.this.k(cVar, j11, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z11 && !zArr[i10]) {
                z12 = false;
            }
            z11 = z12;
            i10++;
        }
        if (z10) {
            for (int i12 = 0; i12 < dVar.f8592b.length; i12++) {
                if (boolArr[i12] == null) {
                    if (z11) {
                        boolArr[i12] = Boolean.valueOf(zArr[i12]);
                    } else {
                        boolArr[i12] = Boolean.TRUE;
                        z11 = true;
                    }
                }
            }
            if (!z11) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i13 = 0; i13 < dVar.f8592b.length; i13++) {
                if (boolArr[i13] == null) {
                    boolArr[i13] = Boolean.FALSE;
                }
            }
        }
        for (int i14 = 0; i14 < dVar.f8592b.length; i14++) {
            if (zArr[i14] != boolArr[i14].booleanValue()) {
                t.c cVar2 = dVar.f8592b[i14];
                p(boolArr[i14].booleanValue(), Long.valueOf(cVar2.f8590b), Long.valueOf(cVar2.f8589a), keyEvent.getEventTime());
            }
        }
    }

    void o(t.e eVar, boolean z10, long j10, KeyEvent keyEvent) {
        if (eVar.f8595c == j10 || eVar.f8596d == z10) {
            return;
        }
        boolean z11 = !this.f8572b.containsKey(Long.valueOf(eVar.f8594b));
        if (z11) {
            eVar.f8596d = !eVar.f8596d;
        }
        p(z11, Long.valueOf(eVar.f8595c), Long.valueOf(eVar.f8594b), keyEvent.getEventTime());
        if (!z11) {
            eVar.f8596d = !eVar.f8596d;
        }
        p(!z11, Long.valueOf(eVar.f8595c), Long.valueOf(eVar.f8594b), keyEvent.getEventTime());
    }

    void q(Long l10, Long l11) {
        if (l11 != null) {
            if (this.f8572b.put(l10, l11) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.f8572b.remove(l10) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
