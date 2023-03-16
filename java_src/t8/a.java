package t8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l8.j;
import l8.k;
/* loaded from: classes.dex */
class a implements k.c {

    /* renamed from: n  reason: collision with root package name */
    private final SharedPreferences f14809n;

    /* renamed from: o  reason: collision with root package name */
    private final ExecutorService f14810o = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: p  reason: collision with root package name */
    private final Handler f14811p = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0216a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f14812n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ k.d f14813o;

        /* renamed from: t8.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0217a implements Runnable {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ boolean f14815n;

            RunnableC0217a(boolean z10) {
                this.f14815n = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0216a.this.f14813o.a(Boolean.valueOf(this.f14815n));
            }
        }

        RunnableC0216a(SharedPreferences.Editor editor, k.d dVar) {
            this.f14812n = editor;
            this.f14813o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f14811p.post(new RunnableC0217a(this.f14812n.commit()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f14809n = context.getSharedPreferences("FlutterSharedPreferences", 0);
    }

    private void b(SharedPreferences.Editor editor, k.d dVar) {
        this.f14810o.execute(new RunnableC0216a(editor, dVar));
    }

    private List<String> c(String str) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (ClassNotFoundException e10) {
            e = e10;
        }
        try {
            List<String> list = (List) objectInputStream.readObject();
            objectInputStream.close();
            return list;
        } catch (ClassNotFoundException e11) {
            e = e11;
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            throw th;
        }
    }

    private String d(List<String> list) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            objectOutputStream.close();
            return encodeToString;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                objectOutputStream2.close();
            }
            throw th;
        }
    }

    private Map<String, Object> e() {
        Object obj;
        Map<String, ?> all = this.f14809n.getAll();
        HashMap hashMap = new HashMap();
        for (String str : all.keySet()) {
            if (str.startsWith("flutter.")) {
                Object obj2 = all.get(str);
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        obj2 = c(str2.substring(40));
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str2.substring(44), 36);
                        obj2 = obj;
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str2.substring(40));
                    }
                    hashMap.put(str, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        SharedPreferences.Editor remove = this.f14809n.edit().remove(str);
                        obj = arrayList;
                        if (!remove.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + d(arrayList)).commit()) {
                            throw new IOException("Could not migrate set to list");
                        }
                        obj2 = obj;
                    }
                    hashMap.put(str, obj2);
                }
            }
        }
        return hashMap;
    }

    public void f() {
        this.f14811p.removeCallbacksAndMessages(null);
        this.f14810o.shutdown();
    }

    @Override // l8.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        SharedPreferences.Editor putBoolean;
        String str = (String) jVar.a("key");
        try {
            String str2 = jVar.f11211a;
            char c10 = 65535;
            switch (str2.hashCode()) {
                case -1354815177:
                    if (str2.equals("commit")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -1249367445:
                    if (str2.equals("getAll")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -1096934831:
                    if (str2.equals("setStringList")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -934610812:
                    if (str2.equals("remove")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case -905809875:
                    if (str2.equals("setInt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 94746189:
                    if (str2.equals("clear")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 155439827:
                    if (str2.equals("setDouble")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 589412115:
                    if (str2.equals("setString")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1984457324:
                    if (str2.equals("setBool")) {
                        c10 = 0;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    putBoolean = this.f14809n.edit().putBoolean(str, ((Boolean) jVar.a("value")).booleanValue());
                    break;
                case 1:
                    String d10 = Double.toString(((Number) jVar.a("value")).doubleValue());
                    SharedPreferences.Editor edit = this.f14809n.edit();
                    putBoolean = edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d10);
                    break;
                case 2:
                    Number number = (Number) jVar.a("value");
                    if (number instanceof BigInteger) {
                        SharedPreferences.Editor edit2 = this.f14809n.edit();
                        putBoolean = edit2.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy" + ((BigInteger) number).toString(36));
                        break;
                    } else {
                        putBoolean = this.f14809n.edit().putLong(str, number.longValue());
                        break;
                    }
                case 3:
                    String str3 = (String) jVar.a("value");
                    if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") && !str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        putBoolean = this.f14809n.edit().putString(str, str3);
                        break;
                    }
                    dVar.b("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", null);
                    return;
                case 4:
                    SharedPreferences.Editor edit3 = this.f14809n.edit();
                    putBoolean = edit3.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + d((List) jVar.a("value")));
                    break;
                case 5:
                    dVar.a(Boolean.TRUE);
                    return;
                case 6:
                    dVar.a(e());
                    return;
                case 7:
                    putBoolean = this.f14809n.edit().remove(str);
                    break;
                case '\b':
                    Set<String> keySet = e().keySet();
                    SharedPreferences.Editor edit4 = this.f14809n.edit();
                    for (String str4 : keySet) {
                        edit4.remove(str4);
                    }
                    b(edit4, dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
            b(putBoolean, dVar);
        } catch (IOException e10) {
            dVar.b("IOException encountered", jVar.f11211a, e10);
        }
    }
}
