package com.mr.flutter.plugin.filepicker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import l8.d;
import l8.k;
import l8.m;
import l8.p;
/* loaded from: classes.dex */
public class b implements m, p {

    /* renamed from: v  reason: collision with root package name */
    private static final int f6271v = (FilePickerPlugin.class.hashCode() + 43) & 65535;

    /* renamed from: n  reason: collision with root package name */
    private final Activity f6272n;

    /* renamed from: o  reason: collision with root package name */
    private final d f6273o;

    /* renamed from: p  reason: collision with root package name */
    private k.d f6274p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6275q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6276r;

    /* renamed from: s  reason: collision with root package name */
    private String f6277s;

    /* renamed from: t  reason: collision with root package name */
    private String[] f6278t;

    /* renamed from: u  reason: collision with root package name */
    private d.b f6279u;

    /* loaded from: classes.dex */
    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f6280a;

        a(Activity activity) {
            this.f6280a = activity;
        }

        @Override // com.mr.flutter.plugin.filepicker.b.d
        public void a(String str, int i10) {
            androidx.core.app.b.s(this.f6280a, new String[]{str}, i10);
        }

        @Override // com.mr.flutter.plugin.filepicker.b.d
        public boolean b(String str) {
            return androidx.core.content.a.a(this.f6280a, str) == 0;
        }
    }

    /* renamed from: com.mr.flutter.plugin.filepicker.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0089b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Intent f6281n;

        RunnableC0089b(Intent intent) {
            this.f6281n = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            String str;
            Uri uri;
            com.mr.flutter.plugin.filepicker.a k10;
            if (this.f6281n != null) {
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                if (this.f6281n.getClipData() != null) {
                    int itemCount = this.f6281n.getClipData().getItemCount();
                    while (i10 < itemCount) {
                        Uri uri2 = this.f6281n.getClipData().getItemAt(i10).getUri();
                        com.mr.flutter.plugin.filepicker.a k11 = com.mr.flutter.plugin.filepicker.c.k(b.this.f6272n, uri2, b.this.f6276r);
                        if (k11 != null) {
                            arrayList.add(k11);
                            Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri2.getPath());
                        }
                        i10++;
                    }
                } else if (this.f6281n.getData() != null) {
                    Uri data = this.f6281n.getData();
                    if (b.this.f6277s.equals("dir") && Build.VERSION.SDK_INT >= 21) {
                        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(data, DocumentsContract.getTreeDocumentId(data));
                        Log.d("FilePickerDelegate", "[SingleFilePick] File URI:" + buildDocumentUriUsingTree.toString());
                        String e10 = com.mr.flutter.plugin.filepicker.c.e(buildDocumentUriUsingTree, b.this.f6272n);
                        if (e10 != null) {
                            b.this.m(e10);
                            return;
                        } else {
                            b.this.l("unknown_path", "Failed to retrieve directory path.");
                            return;
                        }
                    }
                    com.mr.flutter.plugin.filepicker.a k12 = com.mr.flutter.plugin.filepicker.c.k(b.this.f6272n, data, b.this.f6276r);
                    if (k12 != null) {
                        arrayList.add(k12);
                    }
                    if (arrayList.isEmpty()) {
                        bVar = b.this;
                        str = "Failed to retrieve path.";
                        bVar.l("unknown_path", str);
                        return;
                    }
                    Log.d("FilePickerDelegate", "File path:" + arrayList.toString());
                } else if (this.f6281n.getExtras() != null) {
                    Bundle extras = this.f6281n.getExtras();
                    if (!extras.keySet().contains("selectedItems")) {
                        bVar = b.this;
                        str = "Failed to retrieve path from bundle.";
                        bVar.l("unknown_path", str);
                        return;
                    }
                    ArrayList n10 = b.this.n(extras);
                    if (n10 != null) {
                        Iterator it = n10.iterator();
                        while (it.hasNext()) {
                            Parcelable parcelable = (Parcelable) it.next();
                            if ((parcelable instanceof Uri) && (k10 = com.mr.flutter.plugin.filepicker.c.k(b.this.f6272n, (uri = (Uri) parcelable), b.this.f6276r)) != null) {
                                arrayList.add(k10);
                                Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri.getPath());
                            }
                            i10++;
                        }
                    }
                }
                b.this.m(arrayList);
                return;
            }
            b.this.l("unknown_activity", "Unknown activity error, please fill an issue.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Looper looper, boolean z10) {
            super(looper);
            this.f6283a = z10;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b.this.f6279u.a(Boolean.valueOf(this.f6283a));
        }
    }

    /* loaded from: classes.dex */
    interface d {
        void a(String str, int i10);

        boolean b(String str);
    }

    public b(Activity activity) {
        this(activity, null, new a(activity));
    }

    b(Activity activity, k.d dVar, d dVar2) {
        this.f6275q = false;
        this.f6276r = false;
        this.f6272n = activity;
        this.f6274p = dVar;
        this.f6273o = dVar2;
    }

    private void i() {
        this.f6274p = null;
    }

    private void j(boolean z10) {
        if (this.f6279u == null || this.f6277s.equals("dir")) {
            return;
        }
        new c(Looper.getMainLooper(), z10).obtainMessage().sendToTarget();
    }

    private static void k(k.d dVar) {
        dVar.b("already_active", "File picker is already active", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str, String str2) {
        if (this.f6274p == null) {
            return;
        }
        j(false);
        this.f6274p.b(str, str2, null);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Object obj) {
        j(false);
        if (this.f6274p != null) {
            if (obj != null && !(obj instanceof String)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.mr.flutter.plugin.filepicker.a) it.next()).a());
                }
                obj = arrayList;
            }
            this.f6274p.a(obj);
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<Parcelable> n(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("selectedItems", Parcelable.class) : bundle.getParcelableArrayList("selectedItems");
    }

    private boolean p(k.d dVar) {
        if (this.f6274p != null) {
            return false;
        }
        this.f6274p = dVar;
        return true;
    }

    private void q() {
        Intent intent;
        String str = this.f6277s;
        if (str == null) {
            return;
        }
        if (str.equals("dir")) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        } else {
            if (this.f6277s.equals("image/*")) {
                intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            } else {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
            }
            Uri parse = Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator);
            Log.d("FilePickerDelegate", "Selected type " + this.f6277s);
            intent.setDataAndType(parse, this.f6277s);
            intent.setType(this.f6277s);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f6275q);
            intent.putExtra("multi-pick", this.f6275q);
            if (this.f6277s.contains(",")) {
                this.f6278t = this.f6277s.split(",");
            }
            String[] strArr = this.f6278t;
            if (strArr != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
            }
        }
        if (intent.resolveActivity(this.f6272n.getPackageManager()) != null) {
            this.f6272n.startActivityForResult(intent, f6271v);
            return;
        }
        Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
        l("invalid_format_type", "Can't handle the provided file type.");
    }

    @Override // l8.m
    public boolean a(int i10, int i11, Intent intent) {
        if (this.f6277s == null) {
            return false;
        }
        int i12 = f6271v;
        if (i10 == i12 && i11 == -1) {
            j(true);
            new Thread(new RunnableC0089b(intent)).start();
            return true;
        } else if (i10 == i12 && i11 == 0) {
            Log.i("FilePickerDelegate", "User cancelled the picker request");
            m(null);
            return true;
        } else {
            if (i10 == i12) {
                l("unknown_activity", "Unknown activity error, please fill an issue.");
            }
            return false;
        }
    }

    public void o(d.b bVar) {
        this.f6279u = bVar;
    }

    @Override // l8.p
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = false;
        if (f6271v != i10) {
            return false;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            z10 = true;
        }
        if (z10) {
            q();
        } else {
            l("read_external_storage_denied", "User did not allow reading external storage");
        }
        return true;
    }

    public void r(String str, boolean z10, boolean z11, String[] strArr, k.d dVar) {
        if (!p(dVar)) {
            k(dVar);
            return;
        }
        this.f6277s = str;
        this.f6275q = z10;
        this.f6276r = z11;
        this.f6278t = strArr;
        if (Build.VERSION.SDK_INT >= 33 || this.f6273o.b("android.permission.READ_EXTERNAL_STORAGE")) {
            q();
        } else {
            this.f6273o.a("android.permission.READ_EXTERNAL_STORAGE", f6271v);
        }
    }
}
