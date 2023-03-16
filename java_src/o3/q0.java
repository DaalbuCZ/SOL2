package o3;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public final class q0 extends g {

    /* renamed from: e  reason: collision with root package name */
    private final int f12062e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f12063f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f12064g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f12065h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f12066i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f12067j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f12068k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12069l;

    /* renamed from: m  reason: collision with root package name */
    private int f12070m;

    /* loaded from: classes.dex */
    public static final class a extends m {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public q0() {
        this(2000);
    }

    public q0(int i10) {
        this(i10, 8000);
    }

    public q0(int i10, int i11) {
        super(true);
        this.f12062e = i11;
        byte[] bArr = new byte[i10];
        this.f12063f = bArr;
        this.f12064g = new DatagramPacket(bArr, 0, i10);
    }

    @Override // o3.i
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f12070m == 0) {
            try {
                ((DatagramSocket) p3.a.e(this.f12066i)).receive(this.f12064g);
                int length = this.f12064g.getLength();
                this.f12070m = length;
                r(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f12064g.getLength();
        int i12 = this.f12070m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f12063f, length2 - i12, bArr, i10, min);
        this.f12070m -= min;
        return min;
    }

    @Override // o3.l
    public void close() {
        this.f12065h = null;
        MulticastSocket multicastSocket = this.f12067j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) p3.a.e(this.f12068k));
            } catch (IOException unused) {
            }
            this.f12067j = null;
        }
        DatagramSocket datagramSocket = this.f12066i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f12066i = null;
        }
        this.f12068k = null;
        this.f12070m = 0;
        if (this.f12069l) {
            this.f12069l = false;
            s();
        }
    }

    @Override // o3.l
    public Uri k() {
        return this.f12065h;
    }

    @Override // o3.l
    public long n(p pVar) {
        Uri uri = pVar.f12034a;
        this.f12065h = uri;
        String str = (String) p3.a.e(uri.getHost());
        int port = this.f12065h.getPort();
        t(pVar);
        try {
            this.f12068k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f12068k, port);
            if (this.f12068k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f12067j = multicastSocket;
                multicastSocket.joinGroup(this.f12068k);
                this.f12066i = this.f12067j;
            } else {
                this.f12066i = new DatagramSocket(inetSocketAddress);
            }
            this.f12066i.setSoTimeout(this.f12062e);
            this.f12069l = true;
            u(pVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }
}
