package v1;

import p3.m0;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f15523a;

    /* renamed from: b  reason: collision with root package name */
    public int f15524b;

    /* renamed from: c  reason: collision with root package name */
    public int f15525c;

    /* renamed from: d  reason: collision with root package name */
    public int f15526d;

    /* renamed from: e  reason: collision with root package name */
    public int f15527e;

    /* renamed from: f  reason: collision with root package name */
    public int f15528f;

    /* renamed from: g  reason: collision with root package name */
    public int f15529g;

    /* renamed from: h  reason: collision with root package name */
    public int f15530h;

    /* renamed from: i  reason: collision with root package name */
    public int f15531i;

    /* renamed from: j  reason: collision with root package name */
    public int f15532j;

    /* renamed from: k  reason: collision with root package name */
    public long f15533k;

    /* renamed from: l  reason: collision with root package name */
    public int f15534l;

    private void b(long j10, int i10) {
        this.f15533k += j10;
        this.f15534l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return m0.C("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f15523a), Integer.valueOf(this.f15524b), Integer.valueOf(this.f15525c), Integer.valueOf(this.f15526d), Integer.valueOf(this.f15527e), Integer.valueOf(this.f15528f), Integer.valueOf(this.f15529g), Integer.valueOf(this.f15530h), Integer.valueOf(this.f15531i), Integer.valueOf(this.f15532j), Long.valueOf(this.f15533k), Integer.valueOf(this.f15534l));
    }
}
