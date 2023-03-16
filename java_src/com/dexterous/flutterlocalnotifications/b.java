package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    public final NotificationDetails f3326n;

    /* renamed from: o  reason: collision with root package name */
    public final int f3327o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<Integer> f3328p;

    public b(NotificationDetails notificationDetails, int i10, ArrayList<Integer> arrayList) {
        this.f3326n = notificationDetails;
        this.f3327o = i10;
        this.f3328p = arrayList;
    }

    public String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f3326n + ", startMode=" + this.f3327o + ", foregroundServiceTypes=" + this.f3328p + '}';
    }
}
