package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    long f8552a;

    /* renamed from: b  reason: collision with root package name */
    a f8553b;

    /* renamed from: c  reason: collision with root package name */
    long f8554c;

    /* renamed from: d  reason: collision with root package name */
    long f8555d;

    /* renamed from: e  reason: collision with root package name */
    boolean f8556e;

    /* renamed from: f  reason: collision with root package name */
    String f8557f;

    /* loaded from: classes.dex */
    public enum a {
        kDown(0),
        kUp(1),
        kRepeat(2);
        

        /* renamed from: n  reason: collision with root package name */
        private long f8562n;

        a(long j10) {
            this.f8562n = j10;
        }

        public long e() {
            return this.f8562n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer a() {
        try {
            String str = this.f8557f;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 48);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.f8552a);
            allocateDirect.putLong(this.f8553b.e());
            allocateDirect.putLong(this.f8554c);
            allocateDirect.putLong(this.f8555d);
            allocateDirect.putLong(this.f8556e ? 1L : 0L);
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
