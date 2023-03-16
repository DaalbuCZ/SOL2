package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.k;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* renamed from: b  reason: collision with root package name */
    private static Field f1268b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1269c;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1267a = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f1270d = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle b(k.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat f10 = aVar.f();
        bundle.putInt("icon", f10 != null ? f10.n() : 0);
        bundle.putCharSequence("title", aVar.j());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", e(aVar.g()));
        bundle.putBoolean("showsUserInterface", aVar.i());
        bundle.putInt("semanticAction", aVar.h());
        return bundle;
    }

    public static Bundle c(Notification notification) {
        String str;
        String str2;
        synchronized (f1267a) {
            if (f1269c) {
                return null;
            }
            try {
                if (f1268b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1269c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1268b = declaredField;
                }
                Bundle bundle = (Bundle) f1268b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1268b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e10) {
                e = e10;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1269c = true;
                return null;
            } catch (NoSuchFieldException e11) {
                e = e11;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1269c = true;
                return null;
            }
        }
    }

    private static Bundle d(p pVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", pVar.j());
        bundle.putCharSequence("label", pVar.i());
        bundle.putCharSequenceArray("choices", pVar.e());
        bundle.putBoolean("allowFreeFormInput", pVar.c());
        bundle.putBundle("extras", pVar.h());
        Set<String> d10 = pVar.d();
        if (d10 != null && !d10.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d10.size());
            for (String str : d10) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] e(p[] pVarArr) {
        if (pVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[pVarArr.length];
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            bundleArr[i10] = d(pVarArr[i10]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, k.a aVar) {
        IconCompat f10 = aVar.f();
        builder.addAction(f10 != null ? f10.n() : 0, aVar.j(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.g()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
