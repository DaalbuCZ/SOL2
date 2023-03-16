package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;
/* loaded from: classes.dex */
class c {
    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    private static String b(Context context, Uri uri) {
        String str;
        try {
            str = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
        } catch (Exception unused) {
            str = null;
        }
        str = (str == null || str.isEmpty()) ? "jpg" : "jpg";
        return "." + str;
    }

    private static String c(Context context, Uri uri) {
        Cursor e10 = e(context, uri);
        if (e10 != null) {
            try {
                if (e10.moveToFirst() && e10.getColumnCount() >= 1) {
                    String string = e10.getString(0);
                    e10.close();
                    return string;
                }
            } catch (Throwable th) {
                try {
                    e10.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (e10 != null) {
            e10.close();
        }
        return null;
    }

    private static Cursor e(Context context, Uri uri) {
        return context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            File file = new File(context.getCacheDir(), UUID.randomUUID().toString());
            file.mkdir();
            file.deleteOnExit();
            String c10 = c(context, uri);
            if (c10 == null) {
                x7.b.g("FileUtils", "Cannot get file name for " + uri);
                c10 = "image_picker" + b(context, uri);
            }
            File file2 = new File(file, c10);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            a(openInputStream, fileOutputStream);
            String path = file2.getPath();
            fileOutputStream.close();
            if (openInputStream != null) {
                openInputStream.close();
            }
            return path;
        } catch (IOException unused) {
            return null;
        }
    }
}
