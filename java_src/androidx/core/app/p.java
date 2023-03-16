package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final String f1310a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f1311b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence[] f1312c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1313d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1314e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f1315f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<String> f1316g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static ClipData a(Intent intent) {
            return intent.getClipData();
        }

        static void b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(p pVar) {
            Set<String> d10;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(pVar.j()).setLabel(pVar.i()).setChoices(pVar.e()).setAllowFreeFormInput(pVar.c()).addExtras(pVar.h());
            if (Build.VERSION.SDK_INT >= 26 && (d10 = pVar.d()) != null) {
                for (String str : d10) {
                    c.d(addExtras, str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.b(addExtras, pVar.g());
            }
            return addExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static void a(p pVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(p.a(pVar), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final String f1317a;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f1320d;

        /* renamed from: e  reason: collision with root package name */
        private CharSequence[] f1321e;

        /* renamed from: b  reason: collision with root package name */
        private final Set<String> f1318b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f1319c = new Bundle();

        /* renamed from: f  reason: collision with root package name */
        private boolean f1322f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f1323g = 0;

        public e(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f1317a = str;
        }

        public p a() {
            return new p(this.f1317a, this.f1320d, this.f1321e, this.f1322f, this.f1323g, this.f1319c, this.f1318b);
        }

        public e b(String str, boolean z10) {
            if (z10) {
                this.f1318b.add(str);
            } else {
                this.f1318b.remove(str);
            }
            return this;
        }

        public e c(boolean z10) {
            this.f1322f = z10;
            return this;
        }

        public e d(CharSequence[] charSequenceArr) {
            this.f1321e = charSequenceArr;
            return this;
        }

        public e e(CharSequence charSequence) {
            this.f1320d = charSequence;
            return this;
        }
    }

    p(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f1310a = str;
        this.f1311b = charSequence;
        this.f1312c = charSequenceArr;
        this.f1313d = z10;
        this.f1314e = i10;
        this.f1315f = bundle;
        this.f1316g = set;
        if (g() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(p pVar) {
        return b.b(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(p[] pVarArr) {
        if (pVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[pVarArr.length];
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            remoteInputArr[i10] = a(pVarArr[i10]);
        }
        return remoteInputArr;
    }

    private static Intent f(Intent intent) {
        ClipData a10 = a.a(intent);
        if (a10 == null) {
            return null;
        }
        ClipDescription description = a10.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return a10.getItemAt(0).getIntent();
        }
        return null;
    }

    public static Bundle k(Intent intent) {
        Intent f10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            return b.c(intent);
        }
        if (i10 < 16 || (f10 = f(intent)) == null) {
            return null;
        }
        return (Bundle) f10.getExtras().getParcelable("android.remoteinput.resultsData");
    }

    public boolean c() {
        return this.f1313d;
    }

    public Set<String> d() {
        return this.f1316g;
    }

    public CharSequence[] e() {
        return this.f1312c;
    }

    public int g() {
        return this.f1314e;
    }

    public Bundle h() {
        return this.f1315f;
    }

    public CharSequence i() {
        return this.f1311b;
    }

    public String j() {
        return this.f1310a;
    }

    public boolean l() {
        return (c() || (e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
