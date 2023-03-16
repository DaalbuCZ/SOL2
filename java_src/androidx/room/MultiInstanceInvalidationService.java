package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.c;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: n  reason: collision with root package name */
    int f2166n = 0;

    /* renamed from: o  reason: collision with root package name */
    final HashMap<Integer, String> f2167o = new HashMap<>();

    /* renamed from: p  reason: collision with root package name */
    final RemoteCallbackList<androidx.room.b> f2168p = new a();

    /* renamed from: q  reason: collision with root package name */
    private final c.a f2169q = new b();

    /* loaded from: classes.dex */
    class a extends RemoteCallbackList<androidx.room.b> {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(androidx.room.b bVar, Object obj) {
            MultiInstanceInvalidationService.this.f2167o.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    class b extends c.a {
        b() {
        }

        @Override // androidx.room.c
        public int P(androidx.room.b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f2168p) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f2166n + 1;
                multiInstanceInvalidationService.f2166n = i10;
                if (multiInstanceInvalidationService.f2168p.register(bVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f2167o.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f2166n--;
                return 0;
            }
        }

        @Override // androidx.room.c
        public void Z(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f2168p) {
                String str = MultiInstanceInvalidationService.this.f2167o.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f2168p.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f2168p.getBroadcastCookie(i11)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f2167o.get(Integer.valueOf(intValue));
                    if (i10 != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f2168p.getBroadcastItem(i11).E(strArr);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f2168p.finishBroadcast();
            }
        }

        @Override // androidx.room.c
        public void e0(androidx.room.b bVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f2168p) {
                MultiInstanceInvalidationService.this.f2168p.unregister(bVar);
                MultiInstanceInvalidationService.this.f2167o.remove(Integer.valueOf(i10));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2169q;
    }
}
