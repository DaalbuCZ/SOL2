package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.k;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1258a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f1259b;

    /* renamed from: c  reason: collision with root package name */
    private final k.e f1260c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f1261d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f1262e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f1263f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f1264g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f1265h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f1266i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(k.e eVar) {
        int i10;
        Icon icon;
        List<String> e10;
        Bundle bundle;
        String str;
        this.f1260c = eVar;
        this.f1258a = eVar.f1216a;
        int i11 = Build.VERSION.SDK_INT;
        Context context = eVar.f1216a;
        this.f1259b = i11 >= 26 ? new Notification.Builder(context, eVar.L) : new Notification.Builder(context);
        Notification notification = eVar.T;
        this.f1259b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f1224i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1220e).setContentText(eVar.f1221f).setContentInfo(eVar.f1226k).setContentIntent(eVar.f1222g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1223h, (notification.flags & 128) != 0).setLargeIcon(eVar.f1225j).setNumber(eVar.f1227l).setProgress(eVar.f1236u, eVar.f1237v, eVar.f1238w);
        if (i11 < 21) {
            this.f1259b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i11 >= 16) {
            this.f1259b.setSubText(eVar.f1233r).setUsesChronometer(eVar.f1230o).setPriority(eVar.f1228m);
            Iterator<k.a> it = eVar.f1217b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = eVar.E;
            if (bundle2 != null) {
                this.f1264g.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.A) {
                    this.f1264g.putBoolean("android.support.localOnly", true);
                }
                String str2 = eVar.f1239x;
                if (str2 != null) {
                    this.f1264g.putString("android.support.groupKey", str2);
                    if (eVar.f1240y) {
                        bundle = this.f1264g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f1264g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = eVar.f1241z;
                if (str3 != null) {
                    this.f1264g.putString("android.support.sortKey", str3);
                }
            }
            this.f1261d = eVar.I;
            this.f1262e = eVar.J;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 17) {
            this.f1259b.setShowWhen(eVar.f1229n);
        }
        if (i12 >= 19 && i12 < 21 && (e10 = e(g(eVar.f1218c), eVar.W)) != null && !e10.isEmpty()) {
            this.f1264g.putStringArray("android.people", (String[]) e10.toArray(new String[e10.size()]));
        }
        if (i12 >= 20) {
            this.f1259b.setLocalOnly(eVar.A).setGroup(eVar.f1239x).setGroupSummary(eVar.f1240y).setSortKey(eVar.f1241z);
            this.f1265h = eVar.P;
        }
        if (i12 >= 21) {
            this.f1259b.setCategory(eVar.D).setColor(eVar.F).setVisibility(eVar.G).setPublicVersion(eVar.H).setSound(notification.sound, notification.audioAttributes);
            List<String> e11 = i12 < 28 ? e(g(eVar.f1218c), eVar.W) : eVar.W;
            if (e11 != null && !e11.isEmpty()) {
                for (String str4 : e11) {
                    this.f1259b.addPerson(str4);
                }
            }
            this.f1266i = eVar.K;
            if (eVar.f1219d.size() > 0) {
                Bundle bundle3 = eVar.g().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i13 = 0; i13 < eVar.f1219d.size(); i13++) {
                    bundle5.putBundle(Integer.toString(i13), m.b(eVar.f1219d.get(i13)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.g().putBundle("android.car.EXTENSIONS", bundle3);
                this.f1264g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (icon = eVar.V) != null) {
            this.f1259b.setSmallIcon(icon);
        }
        if (i14 >= 24) {
            this.f1259b.setExtras(eVar.E).setRemoteInputHistory(eVar.f1235t);
            RemoteViews remoteViews = eVar.I;
            if (remoteViews != null) {
                this.f1259b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.J;
            if (remoteViews2 != null) {
                this.f1259b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.K;
            if (remoteViews3 != null) {
                this.f1259b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i14 >= 26) {
            this.f1259b.setBadgeIconType(eVar.M).setSettingsText(eVar.f1234s).setShortcutId(eVar.N).setTimeoutAfter(eVar.O).setGroupAlertBehavior(eVar.P);
            if (eVar.C) {
                this.f1259b.setColorized(eVar.B);
            }
            if (!TextUtils.isEmpty(eVar.L)) {
                this.f1259b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator<o> it2 = eVar.f1218c.iterator();
            while (it2.hasNext()) {
                this.f1259b.addPerson(it2.next().j());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            this.f1259b.setAllowSystemGeneratedContextualActions(eVar.R);
            this.f1259b.setBubbleMetadata(k.d.a(eVar.S));
        }
        if (i15 >= 31 && (i10 = eVar.Q) != 0) {
            this.f1259b.setForegroundServiceBehavior(i10);
        }
        if (eVar.U) {
            if (this.f1260c.f1240y) {
                this.f1265h = 2;
            } else {
                this.f1265h = 1;
            }
            this.f1259b.setVibrate(null);
            this.f1259b.setSound(null);
            int i16 = notification.defaults & (-2);
            notification.defaults = i16;
            int i17 = i16 & (-3);
            notification.defaults = i17;
            this.f1259b.setDefaults(i17);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f1260c.f1239x)) {
                    this.f1259b.setGroup("silent");
                }
                this.f1259b.setGroupAlertBehavior(this.f1265h);
            }
        }
    }

    private void b(k.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 20) {
            if (i10 >= 16) {
                this.f1263f.add(m.f(this.f1259b, aVar));
                return;
            }
            return;
        }
        IconCompat f10 = aVar.f();
        Notification.Action.Builder builder = i10 >= 23 ? new Notification.Action.Builder(f10 != null ? f10.y() : null, aVar.j(), aVar.a()) : new Notification.Action.Builder(f10 != null ? f10.n() : 0, aVar.j(), aVar.a());
        if (aVar.g() != null) {
            for (RemoteInput remoteInput : p.b(aVar.g())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.h());
        if (i11 >= 28) {
            builder.setSemanticAction(aVar.h());
        }
        if (i11 >= 29) {
            builder.setContextual(aVar.l());
        }
        if (i11 >= 31) {
            builder.setAuthenticationRequired(aVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
        builder.addExtras(bundle);
        this.f1259b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        m.b bVar = new m.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<o> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (o oVar : list) {
            arrayList.add(oVar.i());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i10 = notification.defaults & (-2);
        notification.defaults = i10;
        notification.defaults = i10 & (-3);
    }

    @Override // androidx.core.app.j
    public Notification.Builder a() {
        return this.f1259b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews u10;
        RemoteViews s10;
        k.i iVar = this.f1260c.f1232q;
        if (iVar != null) {
            iVar.b(this);
        }
        RemoteViews t10 = iVar != null ? iVar.t(this) : null;
        Notification d10 = d();
        if (t10 != null || (t10 = this.f1260c.I) != null) {
            d10.contentView = t10;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 16 && iVar != null && (s10 = iVar.s(this)) != null) {
            d10.bigContentView = s10;
        }
        if (i10 >= 21 && iVar != null && (u10 = this.f1260c.f1232q.u(this)) != null) {
            d10.headsUpContentView = u10;
        }
        if (i10 >= 16 && iVar != null && (a10 = k.a(d10)) != null) {
            iVar.a(a10);
        }
        return d10;
    }

    protected Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f1259b.build();
        }
        if (i10 >= 24) {
            Notification build = this.f1259b.build();
            if (this.f1265h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f1265h == 2) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f1265h == 1) {
                    h(build);
                }
            }
            return build;
        } else if (i10 >= 21) {
            this.f1259b.setExtras(this.f1264g);
            Notification build2 = this.f1259b.build();
            RemoteViews remoteViews = this.f1261d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1262e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f1266i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f1265h != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f1265h == 2) {
                    h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f1265h == 1) {
                    h(build2);
                }
            }
            return build2;
        } else if (i10 >= 20) {
            this.f1259b.setExtras(this.f1264g);
            Notification build3 = this.f1259b.build();
            RemoteViews remoteViews4 = this.f1261d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1262e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f1265h != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.f1265h == 2) {
                    h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f1265h == 1) {
                    h(build3);
                }
            }
            return build3;
        } else if (i10 >= 19) {
            SparseArray<Bundle> a10 = m.a(this.f1263f);
            if (a10 != null) {
                this.f1264g.putSparseParcelableArray("android.support.actionExtras", a10);
            }
            this.f1259b.setExtras(this.f1264g);
            Notification build4 = this.f1259b.build();
            RemoteViews remoteViews6 = this.f1261d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1262e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i10 >= 16) {
            Notification build5 = this.f1259b.build();
            Bundle a11 = k.a(build5);
            Bundle bundle = new Bundle(this.f1264g);
            for (String str : this.f1264g.keySet()) {
                if (a11.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a11.putAll(bundle);
            SparseArray<Bundle> a12 = m.a(this.f1263f);
            if (a12 != null) {
                k.a(build5).putSparseParcelableArray("android.support.actionExtras", a12);
            }
            RemoteViews remoteViews8 = this.f1261d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f1262e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        } else {
            return this.f1259b.getNotification();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f1258a;
    }
}
