.class public abstract Lj2/o;
.super Ls1/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj2/o$a;,
        Lj2/o$b;
    }
.end annotation


# static fields
.field private static final S0:[B


# instance fields
.field private final A:Lj2/l$b;

.field private A0:Z

.field private final B:Lj2/q;

.field private B0:I

.field private final C:Z

.field private C0:I

.field private final D:F

.field private D0:I

.field private final E:Lv1/g;

.field private E0:Z

.field private final F:Lv1/g;

.field private F0:Z

.field private final G:Lv1/g;

.field private G0:Z

.field private final H:Lj2/h;

.field private H0:J

.field private final I:Lp3/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp3/h0<",
            "Ls1/m1;",
            ">;"
        }
    .end annotation
.end field

.field private I0:J

.field private final J:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private J0:Z

.field private final K:Landroid/media/MediaCodec$BufferInfo;

.field private K0:Z

.field private final L:[J

.field private L0:Z

.field private final M:[J

.field private M0:Z

.field private final N:[J

.field private N0:Ls1/q;

.field private O:Ls1/m1;

.field protected O0:Lv1/e;

.field private P:Ls1/m1;

.field private P0:J

.field private Q:Lw1/o;

.field private Q0:J

.field private R:Lw1/o;

.field private R0:I

.field private S:Landroid/media/MediaCrypto;

.field private T:Z

.field private U:J

.field private V:F

.field private W:F

.field private X:Lj2/l;

.field private Y:Ls1/m1;

.field private Z:Landroid/media/MediaFormat;

.field private a0:Z

.field private b0:F

.field private c0:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lj2/n;",
            ">;"
        }
    .end annotation
.end field

.field private d0:Lj2/o$b;

.field private e0:Lj2/n;

.field private f0:I

.field private g0:Z

.field private h0:Z

.field private i0:Z

.field private j0:Z

.field private k0:Z

.field private l0:Z

.field private m0:Z

.field private n0:Z

.field private o0:Z

.field private p0:Z

.field private q0:Lj2/i;

.field private r0:J

.field private s0:I

.field private t0:I

.field private u0:Ljava/nio/ByteBuffer;

.field private v0:Z

.field private w0:Z

.field private x0:Z

.field private y0:Z

.field private z0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lj2/o;->S0:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILj2/l$b;Lj2/q;ZF)V
    .locals 1

    invoke-direct {p0, p1}, Ls1/f;-><init>(I)V

    iput-object p2, p0, Lj2/o;->A:Lj2/l$b;

    invoke-static {p3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj2/q;

    iput-object p1, p0, Lj2/o;->B:Lj2/q;

    iput-boolean p4, p0, Lj2/o;->C:Z

    iput p5, p0, Lj2/o;->D:F

    invoke-static {}, Lv1/g;->B()Lv1/g;

    move-result-object p1

    iput-object p1, p0, Lj2/o;->E:Lv1/g;

    new-instance p1, Lv1/g;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lv1/g;-><init>(I)V

    iput-object p1, p0, Lj2/o;->F:Lv1/g;

    new-instance p1, Lv1/g;

    const/4 p3, 0x2

    invoke-direct {p1, p3}, Lv1/g;-><init>(I)V

    iput-object p1, p0, Lj2/o;->G:Lv1/g;

    new-instance p1, Lj2/h;

    invoke-direct {p1}, Lj2/h;-><init>()V

    iput-object p1, p0, Lj2/o;->H:Lj2/h;

    new-instance p3, Lp3/h0;

    invoke-direct {p3}, Lp3/h0;-><init>()V

    iput-object p3, p0, Lj2/o;->I:Lp3/h0;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lj2/o;->J:Ljava/util/ArrayList;

    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p3, p0, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, Lj2/o;->V:F

    iput p3, p0, Lj2/o;->W:F

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p3, p0, Lj2/o;->U:J

    const/16 p5, 0xa

    new-array v0, p5, [J

    iput-object v0, p0, Lj2/o;->L:[J

    new-array v0, p5, [J

    iput-object v0, p0, Lj2/o;->M:[J

    new-array p5, p5, [J

    iput-object p5, p0, Lj2/o;->N:[J

    iput-wide p3, p0, Lj2/o;->P0:J

    iput-wide p3, p0, Lj2/o;->Q0:J

    invoke-virtual {p1, p2}, Lv1/g;->y(I)V

    iget-object p1, p1, Lv1/g;->p:Ljava/nio/ByteBuffer;

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lj2/o;->b0:F

    iput p2, p0, Lj2/o;->f0:I

    iput p2, p0, Lj2/o;->B0:I

    const/4 p1, -0x1

    iput p1, p0, Lj2/o;->s0:I

    iput p1, p0, Lj2/o;->t0:I

    iput-wide p3, p0, Lj2/o;->r0:J

    iput-wide p3, p0, Lj2/o;->H0:J

    iput-wide p3, p0, Lj2/o;->I0:J

    iput p2, p0, Lj2/o;->C0:I

    iput p2, p0, Lj2/o;->D0:I

    return-void
.end method

.method private C0()Z
    .locals 1

    iget v0, p0, Lj2/o;->t0:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private D0(Ls1/m1;)V
    .locals 2

    invoke-direct {p0}, Lj2/o;->g0()V

    iget-object p1, p1, Ls1/m1;->y:Ljava/lang/String;

    const-string v0, "audio/mp4a-latm"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const-string v0, "audio/mpeg"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "audio/opus"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lj2/o;->H:Lj2/h;

    invoke-virtual {p1, v1}, Lj2/h;->J(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj2/o;->H:Lj2/h;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Lj2/h;->J(I)V

    :goto_0
    iput-boolean v1, p0, Lj2/o;->x0:Z

    return-void
.end method

.method private E0(Lj2/n;Landroid/media/MediaCrypto;)V
    .locals 12

    iget-object v1, p1, Lj2/n;->a:Ljava/lang/String;

    sget v0, Lp3/m0;->a:I

    const/high16 v2, -0x40800000    # -1.0f

    const/16 v3, 0x17

    if-ge v0, v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    iget v3, p0, Lj2/o;->W:F

    iget-object v4, p0, Lj2/o;->O:Ls1/m1;

    invoke-virtual {p0}, Ls1/f;->H()[Ls1/m1;

    move-result-object v5

    invoke-virtual {p0, v3, v4, v5}, Lj2/o;->u0(FLs1/m1;[Ls1/m1;)F

    move-result v3

    :goto_0
    iget v4, p0, Lj2/o;->D:F

    cmpg-float v4, v3, v4

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-object v5, p0, Lj2/o;->O:Ls1/m1;

    invoke-virtual {p0, p1, v5, p2, v2}, Lj2/o;->y0(Lj2/n;Ls1/m1;Landroid/media/MediaCrypto;F)Lj2/l$a;

    move-result-object p2

    const/16 v5, 0x1f

    if-lt v0, v5, :cond_2

    invoke-virtual {p0}, Ls1/f;->G()Lt1/t1;

    move-result-object v0

    invoke-static {p2, v0}, Lj2/o$a;->a(Lj2/l$a;Lt1/t1;)V

    :cond_2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "createCodec:"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp3/j0;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lj2/o;->A:Lj2/l$b;

    invoke-interface {v0, p2}, Lj2/l$b;->a(Lj2/l$a;)Lj2/l;

    move-result-object v0

    iput-object v0, p0, Lj2/o;->X:Lj2/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lp3/j0;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iput-object p1, p0, Lj2/o;->e0:Lj2/n;

    iput v2, p0, Lj2/o;->b0:F

    iget-object v0, p0, Lj2/o;->O:Ls1/m1;

    iput-object v0, p0, Lj2/o;->Y:Ls1/m1;

    invoke-direct {p0, v1}, Lj2/o;->W(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lj2/o;->f0:I

    iget-object v0, p0, Lj2/o;->Y:Ls1/m1;

    invoke-static {v1, v0}, Lj2/o;->X(Ljava/lang/String;Ls1/m1;)Z

    move-result v0

    iput-boolean v0, p0, Lj2/o;->g0:Z

    invoke-static {v1}, Lj2/o;->c0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lj2/o;->h0:Z

    invoke-static {v1}, Lj2/o;->e0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lj2/o;->i0:Z

    invoke-static {v1}, Lj2/o;->Z(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lj2/o;->j0:Z

    invoke-static {v1}, Lj2/o;->a0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lj2/o;->k0:Z

    invoke-static {v1}, Lj2/o;->Y(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lj2/o;->l0:Z

    iget-object v0, p0, Lj2/o;->Y:Ls1/m1;

    invoke-static {v1, v0}, Lj2/o;->d0(Ljava/lang/String;Ls1/m1;)Z

    move-result v0

    iput-boolean v0, p0, Lj2/o;->m0:Z

    invoke-static {p1}, Lj2/o;->b0(Lj2/n;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v7, 0x1

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lj2/o;->t0()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_3

    :cond_4
    :goto_2
    move v0, v7

    :goto_3
    iput-boolean v0, p0, Lj2/o;->p0:Z

    iget-object v0, p0, Lj2/o;->X:Lj2/l;

    invoke-interface {v0}, Lj2/l;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    iput-boolean v7, p0, Lj2/o;->A0:Z

    iput v7, p0, Lj2/o;->B0:I

    iget v0, p0, Lj2/o;->f0:I

    if-eqz v0, :cond_5

    move v2, v7

    :cond_5
    iput-boolean v2, p0, Lj2/o;->n0:Z

    :cond_6
    iget-object p1, p1, Lj2/n;->a:Ljava/lang/String;

    const-string v0, "c2.android.mp3.decoder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lj2/i;

    invoke-direct {p1}, Lj2/i;-><init>()V

    iput-object p1, p0, Lj2/o;->q0:Lj2/i;

    :cond_7
    invoke-virtual {p0}, Ls1/f;->f()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_8

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    add-long/2addr v8, v10

    iput-wide v8, p0, Lj2/o;->r0:J

    :cond_8
    iget-object p1, p0, Lj2/o;->O0:Lv1/e;

    iget v0, p1, Lv1/e;->a:I

    add-int/2addr v0, v7

    iput v0, p1, Lv1/e;->a:I

    sub-long v7, v5, v3

    move-object v0, p0

    move-object v2, p2

    move-wide v3, v5

    move-wide v5, v7

    invoke-virtual/range {v0 .. v6}, Lj2/o;->M0(Ljava/lang/String;Lj2/l$a;JJ)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lp3/j0;->c()V

    throw p1
.end method

.method private F0(J)Z
    .locals 5

    iget-object v0, p0, Lj2/o;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lj2/o;->J:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v3, v3, p1

    if-nez v3, :cond_0

    iget-object p1, p0, Lj2/o;->J:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private static G0(Ljava/lang/IllegalStateException;)Z
    .locals 3

    sget v0, Lp3/m0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    invoke-static {p0}, Lj2/o;->H0(Ljava/lang/IllegalStateException;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/IllegalStateException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    array-length v0, p0

    const/4 v2, 0x0

    if-lez v0, :cond_1

    aget-object p0, p0, v2

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "android.media.MediaCodec"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    return v1
.end method

.method private static H0(Ljava/lang/IllegalStateException;)Z
    .locals 0

    instance-of p0, p0, Landroid/media/MediaCodec$CodecException;

    return p0
.end method

.method private static I0(Ljava/lang/IllegalStateException;)Z
    .locals 1

    instance-of v0, p0, Landroid/media/MediaCodec$CodecException;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {p0}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private K0(Landroid/media/MediaCrypto;Z)V
    .locals 7

    iget-object v0, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    :try_start_0
    invoke-direct {p0, p2}, Lj2/o;->q0(Z)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v2, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    iget-boolean v3, p0, Lj2/o;->C:Z

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj2/n;

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iput-object v1, p0, Lj2/o;->d0:Lj2/o$b;
    :try_end_0
    .catch Lj2/v$c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v0, Lj2/o$b;

    iget-object v1, p0, Lj2/o;->O:Ls1/m1;

    const v2, -0xc34e

    invoke-direct {v0, v1, p1, p2, v2}, Lj2/o$b;-><init>(Ls1/m1;Ljava/lang/Throwable;ZI)V

    throw v0

    :cond_2
    :goto_1
    iget-object v0, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj2/n;

    :goto_2
    iget-object v2, p0, Lj2/o;->X:Lj2/l;

    if-nez v2, :cond_7

    iget-object v2, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj2/n;

    invoke-virtual {p0, v2}, Lj2/o;->j1(Lj2/n;)Z

    move-result v3

    if-nez v3, :cond_3

    return-void

    :cond_3
    :try_start_1
    invoke-direct {p0, v2, p1}, Lj2/o;->E0(Lj2/n;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v3

    const-string v4, "MediaCodecRenderer"

    if-ne v2, v0, :cond_4

    :try_start_2
    const-string v3, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."

    invoke-static {v4, v3}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v5, 0x32

    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    invoke-direct {p0, v2, p1}, Lj2/o;->E0(Lj2/n;Landroid/media/MediaCrypto;)V

    goto :goto_2

    :cond_4
    throw v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Failed to initialize decoder: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v3}, Lp3/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v4, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    new-instance v4, Lj2/o$b;

    iget-object v5, p0, Lj2/o;->O:Ls1/m1;

    invoke-direct {v4, v5, v3, p2, v2}, Lj2/o$b;-><init>(Ls1/m1;Ljava/lang/Throwable;ZLj2/n;)V

    invoke-virtual {p0, v4}, Lj2/o;->L0(Ljava/lang/Exception;)V

    iget-object v2, p0, Lj2/o;->d0:Lj2/o$b;

    if-nez v2, :cond_5

    iput-object v4, p0, Lj2/o;->d0:Lj2/o$b;

    goto :goto_3

    :cond_5
    invoke-static {v2, v4}, Lj2/o$b;->a(Lj2/o$b;Lj2/o$b;)Lj2/o$b;

    move-result-object v2

    iput-object v2, p0, Lj2/o;->d0:Lj2/o$b;

    :goto_3
    iget-object v2, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lj2/o;->d0:Lj2/o$b;

    throw p1

    :cond_7
    iput-object v1, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    return-void

    :cond_8
    new-instance p1, Lj2/o$b;

    iget-object v0, p0, Lj2/o;->O:Ls1/m1;

    const v2, -0xc34f

    invoke-direct {p1, v0, v1, p2, v2}, Lj2/o$b;-><init>(Ls1/m1;Ljava/lang/Throwable;ZI)V

    throw p1
.end method

.method private T()V
    .locals 5

    iget-boolean v0, p0, Lj2/o;->J0:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp3/a;->f(Z)V

    invoke-virtual {p0}, Ls1/f;->E()Ls1/n1;

    move-result-object v0

    iget-object v2, p0, Lj2/o;->G:Lv1/g;

    invoke-virtual {v2}, Lv1/g;->m()V

    :cond_0
    iget-object v2, p0, Lj2/o;->G:Lv1/g;

    invoke-virtual {v2}, Lv1/g;->m()V

    iget-object v2, p0, Lj2/o;->G:Lv1/g;

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v3}, Ls1/f;->Q(Ls1/n1;Lv1/g;I)I

    move-result v2

    const/4 v4, -0x5

    if-eq v2, v4, :cond_5

    const/4 v4, -0x4

    if-eq v2, v4, :cond_2

    const/4 v0, -0x3

    if-ne v2, v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_2
    iget-object v2, p0, Lj2/o;->G:Lv1/g;

    invoke-virtual {v2}, Lv1/a;->t()Z

    move-result v2

    if-eqz v2, :cond_3

    iput-boolean v1, p0, Lj2/o;->J0:Z

    return-void

    :cond_3
    iget-boolean v2, p0, Lj2/o;->L0:Z

    if-eqz v2, :cond_4

    iget-object v2, p0, Lj2/o;->O:Ls1/m1;

    invoke-static {v2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls1/m1;

    iput-object v2, p0, Lj2/o;->P:Ls1/m1;

    const/4 v4, 0x0

    invoke-virtual {p0, v2, v4}, Lj2/o;->P0(Ls1/m1;Landroid/media/MediaFormat;)V

    iput-boolean v3, p0, Lj2/o;->L0:Z

    :cond_4
    iget-object v2, p0, Lj2/o;->G:Lv1/g;

    invoke-virtual {v2}, Lv1/g;->z()V

    iget-object v2, p0, Lj2/o;->H:Lj2/h;

    iget-object v3, p0, Lj2/o;->G:Lv1/g;

    invoke-virtual {v2, v3}, Lj2/h;->D(Lv1/g;)Z

    move-result v2

    if-nez v2, :cond_0

    iput-boolean v1, p0, Lj2/o;->y0:Z

    return-void

    :cond_5
    invoke-virtual {p0, v0}, Lj2/o;->O0(Ls1/n1;)Lv1/i;

    return-void
.end method

.method private T0()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    iget v0, p0, Lj2/o;->D0:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    iput-boolean v1, p0, Lj2/o;->K0:Z

    invoke-virtual {p0}, Lj2/o;->Z0()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lj2/o;->X0()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lj2/o;->n0()V

    invoke-direct {p0}, Lj2/o;->p1()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lj2/o;->n0()V

    :goto_0
    return-void
.end method

.method private U(JJ)Z
    .locals 18

    move-object/from16 v15, p0

    iget-boolean v0, v15, Lj2/o;->K0:Z

    const/4 v14, 0x1

    xor-int/2addr v0, v14

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, v15, Lj2/o;->H:Lj2/h;

    invoke-virtual {v0}, Lj2/h;->I()Z

    move-result v0

    const/4 v13, 0x0

    if-eqz v0, :cond_1

    const/4 v5, 0x0

    iget-object v0, v15, Lj2/o;->H:Lj2/h;

    iget-object v6, v0, Lv1/g;->p:Ljava/nio/ByteBuffer;

    iget v7, v15, Lj2/o;->t0:I

    const/4 v8, 0x0

    invoke-virtual {v0}, Lj2/h;->H()I

    move-result v9

    iget-object v0, v15, Lj2/o;->H:Lj2/h;

    invoke-virtual {v0}, Lj2/h;->F()J

    move-result-wide v10

    iget-object v0, v15, Lj2/o;->H:Lj2/h;

    invoke-virtual {v0}, Lv1/a;->s()Z

    move-result v12

    iget-object v0, v15, Lj2/o;->H:Lj2/h;

    invoke-virtual {v0}, Lv1/a;->t()Z

    move-result v16

    iget-object v3, v15, Lj2/o;->P:Ls1/m1;

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v17, v3

    move-wide/from16 v3, p3

    move/from16 v13, v16

    move-object/from16 v14, v17

    invoke-virtual/range {v0 .. v14}, Lj2/o;->U0(JJLj2/l;Ljava/nio/ByteBuffer;IIIJZZLs1/m1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v15, Lj2/o;->H:Lj2/h;

    invoke-virtual {v0}, Lj2/h;->G()J

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lj2/o;->Q0(J)V

    iget-object v0, v15, Lj2/o;->H:Lj2/h;

    invoke-virtual {v0}, Lj2/h;->m()V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    move v0, v13

    :goto_0
    iget-boolean v1, v15, Lj2/o;->J0:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, v15, Lj2/o;->K0:Z

    return v0

    :cond_2
    const/4 v1, 0x1

    iget-boolean v2, v15, Lj2/o;->y0:Z

    if-eqz v2, :cond_3

    iget-object v2, v15, Lj2/o;->H:Lj2/h;

    iget-object v3, v15, Lj2/o;->G:Lv1/g;

    invoke-virtual {v2, v3}, Lj2/h;->D(Lv1/g;)Z

    move-result v2

    invoke-static {v2}, Lp3/a;->f(Z)V

    iput-boolean v0, v15, Lj2/o;->y0:Z

    :cond_3
    iget-boolean v2, v15, Lj2/o;->z0:Z

    if-eqz v2, :cond_5

    iget-object v2, v15, Lj2/o;->H:Lj2/h;

    invoke-virtual {v2}, Lj2/h;->I()Z

    move-result v2

    if-eqz v2, :cond_4

    return v1

    :cond_4
    invoke-direct/range {p0 .. p0}, Lj2/o;->g0()V

    iput-boolean v0, v15, Lj2/o;->z0:Z

    invoke-virtual/range {p0 .. p0}, Lj2/o;->J0()V

    iget-boolean v2, v15, Lj2/o;->x0:Z

    if-nez v2, :cond_5

    return v0

    :cond_5
    invoke-direct/range {p0 .. p0}, Lj2/o;->T()V

    iget-object v2, v15, Lj2/o;->H:Lj2/h;

    invoke-virtual {v2}, Lj2/h;->I()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v15, Lj2/o;->H:Lj2/h;

    invoke-virtual {v2}, Lv1/g;->z()V

    :cond_6
    iget-object v2, v15, Lj2/o;->H:Lj2/h;

    invoke-virtual {v2}, Lj2/h;->I()Z

    move-result v2

    if-nez v2, :cond_8

    iget-boolean v2, v15, Lj2/o;->J0:Z

    if-nez v2, :cond_8

    iget-boolean v2, v15, Lj2/o;->z0:Z

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_7
    move v14, v0

    goto :goto_2

    :cond_8
    :goto_1
    move v14, v1

    :goto_2
    return v14
.end method

.method private V0()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj2/o;->G0:Z

    iget-object v1, p0, Lj2/o;->X:Lj2/l;

    invoke-interface {v1}, Lj2/l;->g()Landroid/media/MediaFormat;

    move-result-object v1

    iget v2, p0, Lj2/o;->f0:I

    if-eqz v2, :cond_0

    const-string v2, "width"

    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x20

    if-ne v2, v3, :cond_0

    const-string v2, "height"

    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    if-ne v2, v3, :cond_0

    iput-boolean v0, p0, Lj2/o;->o0:Z

    return-void

    :cond_0
    iget-boolean v2, p0, Lj2/o;->m0:Z

    if-eqz v2, :cond_1

    const-string v2, "channel-count"

    invoke-virtual {v1, v2, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    iput-object v1, p0, Lj2/o;->Z:Landroid/media/MediaFormat;

    iput-boolean v0, p0, Lj2/o;->a0:Z

    return-void
.end method

.method private W(Ljava/lang/String;)I
    .locals 3

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x19

    if-gt v0, v1, :cond_1

    const-string v1, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lp3/m0;->d:Ljava/lang/String;

    const-string v2, "SM-T585"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-A510"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-A520"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-J700"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 p1, 0x2

    return p1

    :cond_1
    const/16 v1, 0x18

    if-ge v0, v1, :cond_4

    const-string v0, "OMX.Nvidia.h264.decode"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Nvidia.h264.decode.secure"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_2
    sget-object p1, Lp3/m0;->b:Ljava/lang/String;

    const-string v0, "flounder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "flounder_lte"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "grouper"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "tilapia"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method private W0(I)Z
    .locals 3

    invoke-virtual {p0}, Ls1/f;->E()Ls1/n1;

    move-result-object v0

    iget-object v1, p0, Lj2/o;->E:Lv1/g;

    invoke-virtual {v1}, Lv1/g;->m()V

    iget-object v1, p0, Lj2/o;->E:Lv1/g;

    or-int/lit8 p1, p1, 0x4

    invoke-virtual {p0, v0, v1, p1}, Ls1/f;->Q(Ls1/n1;Lv1/g;I)I

    move-result p1

    const/4 v1, 0x1

    const/4 v2, -0x5

    if-ne p1, v2, :cond_0

    invoke-virtual {p0, v0}, Lj2/o;->O0(Ls1/n1;)Lv1/i;

    return v1

    :cond_0
    const/4 v0, -0x4

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lj2/o;->E:Lv1/g;

    invoke-virtual {p1}, Lv1/a;->t()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v1, p0, Lj2/o;->J0:Z

    invoke-direct {p0}, Lj2/o;->T0()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private static X(Ljava/lang/String;Ls1/m1;)Z
    .locals 2

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-object p1, p1, Ls1/m1;->A:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "OMX.MTK.VIDEO.DECODER.AVC"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private X0()V
    .locals 0

    invoke-virtual {p0}, Lj2/o;->Y0()V

    invoke-virtual {p0}, Lj2/o;->J0()V

    return-void
.end method

.method private static Y(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.SEC.mp3.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lp3/m0;->c:Ljava/lang/String;

    const-string v0, "samsung"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lp3/m0;->b:Ljava/lang/String;

    const-string v0, "baffin"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "grand"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fortuna"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "gprimelte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "j2y18lte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ms01"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static Z(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_0

    const-string v1, "OMX.google.vorbis.decoder"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const/16 v1, 0x13

    if-gt v0, v1, :cond_3

    sget-object v0, Lp3/m0;->b:Ljava/lang/String;

    const-string v1, "hb2000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "stvm8"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const-string v0, "OMX.amlogic.avc.decoder.awesome"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.amlogic.avc.decoder.awesome.secure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 p0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static a0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_0

    const-string v0, "OMX.google.aac.decoder"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static b0(Lj2/n;)Z
    .locals 3

    iget-object v0, p0, Lj2/n;->a:Ljava/lang/String;

    sget v1, Lp3/m0;->a:I

    const/16 v2, 0x19

    if-gt v1, v2, :cond_0

    const-string v2, "OMX.rk.video_decoder.avc"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_0
    const/16 v2, 0x11

    if-gt v1, v2, :cond_1

    const-string v2, "OMX.allwinner.video.decoder.avc"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_1
    const/16 v2, 0x1d

    if-gt v1, v2, :cond_2

    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    sget-object v0, Lp3/m0;->c:Ljava/lang/String;

    const-string v1, "Amazon"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lp3/m0;->d:Ljava/lang/String;

    const-string v1, "AFTS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean p0, p0, Lj2/n;->g:Z

    if-eqz p0, :cond_4

    :cond_3
    const/4 p0, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static c0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_2

    if-ne v0, v1, :cond_0

    const-string v1, "OMX.SEC.avc.dec"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "OMX.SEC.avc.dec.secure"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const/16 v1, 0x13

    if-ne v0, v1, :cond_1

    sget-object v0, Lp3/m0;->d:Ljava/lang/String;

    const-string v1, "SM-G800"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "OMX.Exynos.avc.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private c1()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lj2/o;->s0:I

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    const/4 v1, 0x0

    iput-object v1, v0, Lv1/g;->p:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private static d0(Ljava/lang/String;Ls1/m1;)Z
    .locals 3

    sget v0, Lp3/m0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x12

    if-gt v0, v2, :cond_0

    iget p1, p1, Ls1/m1;->L:I

    if-ne p1, v1, :cond_0

    const-string p1, "OMX.MTK.AUDIO.DECODER.MP3"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private d1()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lj2/o;->t0:I

    const/4 v0, 0x0

    iput-object v0, p0, Lj2/o;->u0:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private static e0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    const-string v0, "c2.android.aac.decoder"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private e1(Lw1/o;)V
    .locals 1

    iget-object v0, p0, Lj2/o;->Q:Lw1/o;

    invoke-static {v0, p1}, Lw1/n;->a(Lw1/o;Lw1/o;)V

    iput-object p1, p0, Lj2/o;->Q:Lw1/o;

    return-void
.end method

.method private g0()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj2/o;->z0:Z

    iget-object v1, p0, Lj2/o;->H:Lj2/h;

    invoke-virtual {v1}, Lj2/h;->m()V

    iget-object v1, p0, Lj2/o;->G:Lv1/g;

    invoke-virtual {v1}, Lv1/g;->m()V

    iput-boolean v0, p0, Lj2/o;->y0:Z

    iput-boolean v0, p0, Lj2/o;->x0:Z

    return-void
.end method

.method private h0()Z
    .locals 2

    iget-boolean v0, p0, Lj2/o;->E0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iput v1, p0, Lj2/o;->C0:I

    iget-boolean v0, p0, Lj2/o;->h0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lj2/o;->j0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput v1, p0, Lj2/o;->D0:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lj2/o;->D0:I

    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    return v1
.end method

.method private h1(Lw1/o;)V
    .locals 1

    iget-object v0, p0, Lj2/o;->R:Lw1/o;

    invoke-static {v0, p1}, Lw1/n;->a(Lw1/o;Lw1/o;)V

    iput-object p1, p0, Lj2/o;->R:Lw1/o;

    return-void
.end method

.method private i0()V
    .locals 1

    iget-boolean v0, p0, Lj2/o;->E0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lj2/o;->C0:I

    const/4 v0, 0x3

    iput v0, p0, Lj2/o;->D0:I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lj2/o;->X0()V

    :goto_0
    return-void
.end method

.method private i1(J)Z
    .locals 4

    iget-wide v0, p0, Lj2/o;->U:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    iget-wide p1, p0, Lj2/o;->U:J

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private j0()Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    iget-boolean v0, p0, Lj2/o;->E0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iput v1, p0, Lj2/o;->C0:I

    iget-boolean v0, p0, Lj2/o;->h0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lj2/o;->j0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lj2/o;->D0:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lj2/o;->D0:I

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-direct {p0}, Lj2/o;->p1()V

    :goto_1
    return v1
.end method

.method private k0(JJ)Z
    .locals 19

    move-object/from16 v15, p0

    invoke-direct/range {p0 .. p0}, Lj2/o;->C0()Z

    move-result v0

    const/16 v16, 0x1

    const/4 v14, 0x0

    if-nez v0, :cond_b

    iget-boolean v0, v15, Lj2/o;->k0:Z

    if-eqz v0, :cond_1

    iget-boolean v0, v15, Lj2/o;->F0:Z

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, v15, Lj2/o;->X:Lj2/l;

    iget-object v1, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v0, v1}, Lj2/l;->b(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-direct/range {p0 .. p0}, Lj2/o;->T0()V

    iget-boolean v0, v15, Lj2/o;->K0:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lj2/o;->Y0()V

    :cond_0
    return v14

    :cond_1
    iget-object v0, v15, Lj2/o;->X:Lj2/l;

    iget-object v1, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v0, v1}, Lj2/l;->b(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0

    :goto_0
    if-gez v0, :cond_5

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    invoke-direct/range {p0 .. p0}, Lj2/o;->V0()V

    return v16

    :cond_2
    iget-boolean v0, v15, Lj2/o;->p0:Z

    if-eqz v0, :cond_4

    iget-boolean v0, v15, Lj2/o;->J0:Z

    if-nez v0, :cond_3

    iget v0, v15, Lj2/o;->C0:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    :cond_3
    invoke-direct/range {p0 .. p0}, Lj2/o;->T0()V

    :cond_4
    return v14

    :cond_5
    iget-boolean v1, v15, Lj2/o;->o0:Z

    if-eqz v1, :cond_6

    iput-boolean v14, v15, Lj2/o;->o0:Z

    iget-object v1, v15, Lj2/o;->X:Lj2/l;

    invoke-interface {v1, v0, v14}, Lj2/l;->d(IZ)V

    return v16

    :cond_6
    iget-object v1, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-nez v2, :cond_7

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_7

    invoke-direct/range {p0 .. p0}, Lj2/o;->T0()V

    return v14

    :cond_7
    iput v0, v15, Lj2/o;->t0:I

    iget-object v1, v15, Lj2/o;->X:Lj2/l;

    invoke-interface {v1, v0}, Lj2/l;->m(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v15, Lj2/o;->u0:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_8

    iget-object v1, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v15, Lj2/o;->u0:Ljava/nio/ByteBuffer;

    iget-object v1, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_8
    iget-boolean v0, v15, Lj2/o;->l0:Z

    if-eqz v0, :cond_9

    iget-object v0, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_9

    iget v1, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_9

    iget-wide v1, v15, Lj2/o;->H0:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_9

    iput-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    :cond_9
    iget-object v0, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-direct {v15, v0, v1}, Lj2/o;->F0(J)Z

    move-result v0

    iput-boolean v0, v15, Lj2/o;->v0:Z

    iget-wide v0, v15, Lj2/o;->I0:J

    iget-object v2, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_a

    move/from16 v0, v16

    goto :goto_1

    :cond_a
    move v0, v14

    :goto_1
    iput-boolean v0, v15, Lj2/o;->w0:Z

    invoke-virtual {v15, v2, v3}, Lj2/o;->q1(J)V

    :cond_b
    iget-boolean v0, v15, Lj2/o;->k0:Z

    if-eqz v0, :cond_d

    iget-boolean v0, v15, Lj2/o;->F0:Z

    if-eqz v0, :cond_d

    :try_start_1
    iget-object v5, v15, Lj2/o;->X:Lj2/l;

    iget-object v6, v15, Lj2/o;->u0:Ljava/nio/ByteBuffer;

    iget v7, v15, Lj2/o;->t0:I

    iget-object v0, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v9, 0x1

    iget-wide v10, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v15, Lj2/o;->v0:Z

    iget-boolean v13, v15, Lj2/o;->w0:Z

    iget-object v3, v15, Lj2/o;->P:Ls1/m1;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v17, v3

    move-wide/from16 v3, p3

    move/from16 v18, v14

    move-object/from16 v14, v17

    :try_start_2
    invoke-virtual/range {v0 .. v14}, Lj2/o;->U0(JJLj2/l;Ljava/nio/ByteBuffer;IIIJZZLs1/m1;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_1
    move/from16 v18, v14

    :catch_2
    invoke-direct/range {p0 .. p0}, Lj2/o;->T0()V

    iget-boolean v0, v15, Lj2/o;->K0:Z

    if-eqz v0, :cond_c

    invoke-virtual/range {p0 .. p0}, Lj2/o;->Y0()V

    :cond_c
    return v18

    :cond_d
    move/from16 v18, v14

    iget-object v5, v15, Lj2/o;->X:Lj2/l;

    iget-object v6, v15, Lj2/o;->u0:Ljava/nio/ByteBuffer;

    iget v7, v15, Lj2/o;->t0:I

    iget-object v0, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v9, 0x1

    iget-wide v10, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v15, Lj2/o;->v0:Z

    iget-boolean v13, v15, Lj2/o;->w0:Z

    iget-object v14, v15, Lj2/o;->P:Ls1/m1;

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    invoke-virtual/range {v0 .. v14}, Lj2/o;->U0(JJLj2/l;Ljava/nio/ByteBuffer;IIIJZZLs1/m1;)Z

    move-result v0

    :goto_2
    if-eqz v0, :cond_10

    iget-object v0, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v15, v0, v1}, Lj2/o;->Q0(J)V

    iget-object v0, v15, Lj2/o;->K:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_e

    move/from16 v14, v16

    goto :goto_3

    :cond_e
    move/from16 v14, v18

    :goto_3
    invoke-direct/range {p0 .. p0}, Lj2/o;->d1()V

    if-nez v14, :cond_f

    return v16

    :cond_f
    invoke-direct/range {p0 .. p0}, Lj2/o;->T0()V

    :cond_10
    return v18
.end method

.method private l0(Lj2/n;Ls1/m1;Lw1/o;Lw1/o;)Z
    .locals 4

    const/4 v0, 0x0

    if-ne p3, p4, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-eqz p4, :cond_7

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    sget v2, Lp3/m0;->a:I

    const/16 v3, 0x17

    if-ge v2, v3, :cond_2

    return v1

    :cond_2
    sget-object v2, Ls1/i;->e:Ljava/util/UUID;

    invoke-interface {p3}, Lw1/o;->d()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_7

    invoke-interface {p4}, Lw1/o;->d()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_1

    :cond_3
    invoke-direct {p0, p4}, Lj2/o;->x0(Lw1/o;)Lw1/h0;

    move-result-object p3

    if-nez p3, :cond_4

    return v1

    :cond_4
    iget-boolean p3, p3, Lw1/h0;->c:Z

    if-eqz p3, :cond_5

    move p2, v0

    goto :goto_0

    :cond_5
    iget-object p2, p2, Ls1/m1;->y:Ljava/lang/String;

    invoke-interface {p4, p2}, Lw1/o;->g(Ljava/lang/String;)Z

    move-result p2

    :goto_0
    iget-boolean p1, p1, Lj2/n;->g:Z

    if-nez p1, :cond_6

    if-eqz p2, :cond_6

    return v1

    :cond_6
    return v0

    :cond_7
    :goto_1
    return v1
.end method

.method private m0()Z
    .locals 15

    iget-object v0, p0, Lj2/o;->X:Lj2/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_1b

    iget v0, p0, Lj2/o;->C0:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1b

    iget-boolean v3, p0, Lj2/o;->J0:Z

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lj2/o;->k1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lj2/o;->i0()V

    :cond_1
    iget v0, p0, Lj2/o;->s0:I

    if-gez v0, :cond_3

    iget-object v0, p0, Lj2/o;->X:Lj2/l;

    invoke-interface {v0}, Lj2/l;->o()I

    move-result v0

    iput v0, p0, Lj2/o;->s0:I

    if-gez v0, :cond_2

    return v1

    :cond_2
    iget-object v3, p0, Lj2/o;->F:Lv1/g;

    iget-object v4, p0, Lj2/o;->X:Lj2/l;

    invoke-interface {v4, v0}, Lj2/l;->h(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v3, Lv1/g;->p:Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {v0}, Lv1/g;->m()V

    :cond_3
    iget v0, p0, Lj2/o;->C0:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_5

    iget-boolean v0, p0, Lj2/o;->p0:Z

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    iput-boolean v3, p0, Lj2/o;->F0:Z

    iget-object v4, p0, Lj2/o;->X:Lj2/l;

    iget v5, p0, Lj2/o;->s0:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    invoke-interface/range {v4 .. v10}, Lj2/l;->k(IIIJI)V

    invoke-direct {p0}, Lj2/o;->c1()V

    :goto_0
    iput v2, p0, Lj2/o;->C0:I

    return v1

    :cond_5
    iget-boolean v0, p0, Lj2/o;->n0:Z

    if-eqz v0, :cond_6

    iput-boolean v1, p0, Lj2/o;->n0:Z

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    iget-object v0, v0, Lv1/g;->p:Ljava/nio/ByteBuffer;

    sget-object v1, Lj2/o;->S0:[B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v4, p0, Lj2/o;->X:Lj2/l;

    iget v5, p0, Lj2/o;->s0:I

    const/4 v6, 0x0

    array-length v7, v1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lj2/l;->k(IIIJI)V

    invoke-direct {p0}, Lj2/o;->c1()V

    iput-boolean v3, p0, Lj2/o;->E0:Z

    return v3

    :cond_6
    iget v0, p0, Lj2/o;->B0:I

    if-ne v0, v3, :cond_8

    move v0, v1

    :goto_1
    iget-object v4, p0, Lj2/o;->Y:Ls1/m1;

    iget-object v4, v4, Ls1/m1;->A:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_7

    iget-object v4, p0, Lj2/o;->Y:Ls1/m1;

    iget-object v4, v4, Ls1/m1;->A:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    iget-object v5, p0, Lj2/o;->F:Lv1/g;

    iget-object v5, v5, Lv1/g;->p:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    iput v2, p0, Lj2/o;->B0:I

    :cond_8
    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    iget-object v0, v0, Lv1/g;->p:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p0}, Ls1/f;->E()Ls1/n1;

    move-result-object v4

    :try_start_0
    iget-object v5, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {p0, v4, v5, v1}, Ls1/f;->Q(Ls1/n1;Lv1/g;I)I

    move-result v5
    :try_end_0
    .catch Lv1/g$a; {:try_start_0 .. :try_end_0} :catch_2

    invoke-virtual {p0}, Ls1/f;->m()Z

    move-result v6

    if-eqz v6, :cond_9

    iget-wide v6, p0, Lj2/o;->H0:J

    iput-wide v6, p0, Lj2/o;->I0:J

    :cond_9
    const/4 v6, -0x3

    if-ne v5, v6, :cond_a

    return v1

    :cond_a
    const/4 v6, -0x5

    if-ne v5, v6, :cond_c

    iget v0, p0, Lj2/o;->B0:I

    if-ne v0, v2, :cond_b

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {v0}, Lv1/g;->m()V

    iput v3, p0, Lj2/o;->B0:I

    :cond_b
    invoke-virtual {p0, v4}, Lj2/o;->O0(Ls1/n1;)Lv1/i;

    return v3

    :cond_c
    iget-object v4, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {v4}, Lv1/a;->t()Z

    move-result v4

    if-eqz v4, :cond_10

    iget v0, p0, Lj2/o;->B0:I

    if-ne v0, v2, :cond_d

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {v0}, Lv1/g;->m()V

    iput v3, p0, Lj2/o;->B0:I

    :cond_d
    iput-boolean v3, p0, Lj2/o;->J0:Z

    iget-boolean v0, p0, Lj2/o;->E0:Z

    if-nez v0, :cond_e

    invoke-direct {p0}, Lj2/o;->T0()V

    return v1

    :cond_e
    :try_start_1
    iget-boolean v0, p0, Lj2/o;->p0:Z

    if-eqz v0, :cond_f

    goto :goto_2

    :cond_f
    iput-boolean v3, p0, Lj2/o;->F0:Z

    iget-object v4, p0, Lj2/o;->X:Lj2/l;

    iget v5, p0, Lj2/o;->s0:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    invoke-interface/range {v4 .. v10}, Lj2/l;->k(IIIJI)V

    invoke-direct {p0}, Lj2/o;->c1()V
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    return v1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lj2/o;->O:Ls1/m1;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Lp3/m0;->U(I)I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Ls1/f;->B(Ljava/lang/Throwable;Ls1/m1;I)Ls1/q;

    move-result-object v0

    throw v0

    :cond_10
    iget-boolean v4, p0, Lj2/o;->E0:Z

    if-nez v4, :cond_12

    iget-object v4, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {v4}, Lv1/a;->v()Z

    move-result v4

    if-nez v4, :cond_12

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {v0}, Lv1/g;->m()V

    iget v0, p0, Lj2/o;->B0:I

    if-ne v0, v2, :cond_11

    iput v3, p0, Lj2/o;->B0:I

    :cond_11
    return v3

    :cond_12
    iget-object v2, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {v2}, Lv1/g;->A()Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v4, p0, Lj2/o;->F:Lv1/g;

    iget-object v4, v4, Lv1/g;->o:Lv1/c;

    invoke-virtual {v4, v0}, Lv1/c;->b(I)V

    :cond_13
    iget-boolean v0, p0, Lj2/o;->g0:Z

    if-eqz v0, :cond_15

    if-nez v2, :cond_15

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    iget-object v0, v0, Lv1/g;->p:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lp3/w;->b(Ljava/nio/ByteBuffer;)V

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    iget-object v0, v0, Lv1/g;->p:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    if-nez v0, :cond_14

    return v3

    :cond_14
    iput-boolean v1, p0, Lj2/o;->g0:Z

    :cond_15
    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    iget-wide v4, v0, Lv1/g;->r:J

    iget-object v6, p0, Lj2/o;->q0:Lj2/i;

    if-eqz v6, :cond_16

    iget-object v4, p0, Lj2/o;->O:Ls1/m1;

    invoke-virtual {v6, v4, v0}, Lj2/i;->d(Ls1/m1;Lv1/g;)J

    move-result-wide v4

    iget-wide v6, p0, Lj2/o;->H0:J

    iget-object v0, p0, Lj2/o;->q0:Lj2/i;

    iget-object v8, p0, Lj2/o;->O:Ls1/m1;

    invoke-virtual {v0, v8}, Lj2/i;->b(Ls1/m1;)J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iput-wide v6, p0, Lj2/o;->H0:J

    :cond_16
    move-wide v12, v4

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {v0}, Lv1/a;->s()Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object v0, p0, Lj2/o;->J:Ljava/util/ArrayList;

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_17
    iget-boolean v0, p0, Lj2/o;->L0:Z

    if-eqz v0, :cond_18

    iget-object v0, p0, Lj2/o;->I:Lp3/h0;

    iget-object v4, p0, Lj2/o;->O:Ls1/m1;

    invoke-virtual {v0, v12, v13, v4}, Lp3/h0;->a(JLjava/lang/Object;)V

    iput-boolean v1, p0, Lj2/o;->L0:Z

    :cond_18
    iget-wide v4, p0, Lj2/o;->H0:J

    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Lj2/o;->H0:J

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {v0}, Lv1/g;->z()V

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {v0}, Lv1/a;->r()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {p0, v0}, Lj2/o;->B0(Lv1/g;)V

    :cond_19
    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    invoke-virtual {p0, v0}, Lj2/o;->S0(Lv1/g;)V

    if-eqz v2, :cond_1a

    :try_start_2
    iget-object v8, p0, Lj2/o;->X:Lj2/l;

    iget v9, p0, Lj2/o;->s0:I

    const/4 v10, 0x0

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    iget-object v11, v0, Lv1/g;->o:Lv1/c;

    const/4 v14, 0x0

    invoke-interface/range {v8 .. v14}, Lj2/l;->e(IILv1/c;JI)V

    goto :goto_3

    :cond_1a
    iget-object v8, p0, Lj2/o;->X:Lj2/l;

    iget v9, p0, Lj2/o;->s0:I

    const/4 v10, 0x0

    iget-object v0, p0, Lj2/o;->F:Lv1/g;

    iget-object v0, v0, Lv1/g;->p:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v11

    const/4 v14, 0x0

    invoke-interface/range {v8 .. v14}, Lj2/l;->k(IIIJI)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    invoke-direct {p0}, Lj2/o;->c1()V

    iput-boolean v3, p0, Lj2/o;->E0:Z

    iput v1, p0, Lj2/o;->B0:I

    iget-object v0, p0, Lj2/o;->O0:Lv1/e;

    iget v1, v0, Lv1/e;->c:I

    add-int/2addr v1, v3

    iput v1, v0, Lv1/e;->c:I

    return v3

    :catch_1
    move-exception v0

    iget-object v1, p0, Lj2/o;->O:Ls1/m1;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Lp3/m0;->U(I)I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Ls1/f;->B(Ljava/lang/Throwable;Ls1/m1;I)Ls1/q;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    invoke-virtual {p0, v0}, Lj2/o;->L0(Ljava/lang/Exception;)V

    invoke-direct {p0, v1}, Lj2/o;->W0(I)Z

    invoke-direct {p0}, Lj2/o;->n0()V

    return v3

    :cond_1b
    :goto_4
    return v1
.end method

.method private n0()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lj2/o;->X:Lj2/l;

    invoke-interface {v0}, Lj2/l;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lj2/o;->a1()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lj2/o;->a1()V

    throw v0
.end method

.method protected static n1(Ls1/m1;)Z
    .locals 1

    iget p0, p0, Ls1/m1;->R:I

    if-eqz p0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private o1(Ls1/m1;)Z
    .locals 4

    sget v0, Lp3/m0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lj2/o;->X:Lj2/l;

    if-eqz v0, :cond_6

    iget v0, p0, Lj2/o;->D0:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_6

    invoke-virtual {p0}, Ls1/f;->f()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Lj2/o;->W:F

    invoke-virtual {p0}, Ls1/f;->H()[Ls1/m1;

    move-result-object v2

    invoke-virtual {p0, v0, p1, v2}, Lj2/o;->u0(FLs1/m1;[Ls1/m1;)F

    move-result p1

    iget v0, p0, Lj2/o;->b0:F

    cmpl-float v2, v0, p1

    if-nez v2, :cond_2

    return v1

    :cond_2
    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v3, p1, v2

    if-nez v3, :cond_3

    invoke-direct {p0}, Lj2/o;->i0()V

    const/4 p1, 0x0

    return p1

    :cond_3
    cmpl-float v0, v0, v2

    if-nez v0, :cond_5

    iget v0, p0, Lj2/o;->D:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_4

    goto :goto_0

    :cond_4
    return v1

    :cond_5
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "operating-rate"

    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v2, p0, Lj2/o;->X:Lj2/l;

    invoke-interface {v2, v0}, Lj2/l;->l(Landroid/os/Bundle;)V

    iput p1, p0, Lj2/o;->b0:F

    :cond_6
    :goto_1
    return v1
.end method

.method private p1()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lj2/o;->S:Landroid/media/MediaCrypto;

    iget-object v1, p0, Lj2/o;->R:Lw1/o;

    invoke-direct {p0, v1}, Lj2/o;->x0(Lw1/o;)Lw1/h0;

    move-result-object v1

    iget-object v1, v1, Lw1/h0;->b:[B

    invoke-virtual {v0, v1}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lj2/o;->R:Lw1/o;

    invoke-direct {p0, v0}, Lj2/o;->e1(Lw1/o;)V

    const/4 v0, 0x0

    iput v0, p0, Lj2/o;->C0:I

    iput v0, p0, Lj2/o;->D0:I

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lj2/o;->O:Ls1/m1;

    const/16 v2, 0x1776

    invoke-virtual {p0, v0, v1, v2}, Ls1/f;->B(Ljava/lang/Throwable;Ls1/m1;I)Ls1/q;

    move-result-object v0

    throw v0
.end method

.method private q0(Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lj2/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj2/o;->B:Lj2/q;

    iget-object v1, p0, Lj2/o;->O:Ls1/m1;

    invoke-virtual {p0, v0, v1, p1}, Lj2/o;->w0(Lj2/q;Ls1/m1;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lj2/o;->B:Lj2/q;

    iget-object v0, p0, Lj2/o;->O:Ls1/m1;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lj2/o;->w0(Lj2/q;Ls1/m1;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Drm session requires secure decoder for "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj2/o;->O:Ls1/m1;

    iget-object v1, v1, Ls1/m1;->y:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", but no secure decoder available. Trying to proceed with "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "MediaCodecRenderer"

    invoke-static {v1, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method private x0(Lw1/o;)Lw1/h0;
    .locals 3

    invoke-interface {p1}, Lw1/o;->i()Lv1/b;

    move-result-object p1

    if-eqz p1, :cond_1

    instance-of v0, p1, Lw1/h0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expecting FrameworkCryptoConfig but found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lj2/o;->O:Ls1/m1;

    const/16 v1, 0x1771

    invoke-virtual {p0, v0, p1, v1}, Ls1/f;->B(Ljava/lang/Throwable;Ls1/m1;I)Ls1/q;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    check-cast p1, Lw1/h0;

    return-object p1
.end method


# virtual methods
.method public A(FF)V
    .locals 0

    iput p1, p0, Lj2/o;->V:F

    iput p2, p0, Lj2/o;->W:F

    iget-object p1, p0, Lj2/o;->Y:Ls1/m1;

    invoke-direct {p0, p1}, Lj2/o;->o1(Ls1/m1;)Z

    return-void
.end method

.method protected A0()F
    .locals 1

    iget v0, p0, Lj2/o;->V:F

    return v0
.end method

.method protected B0(Lv1/g;)V
    .locals 0

    return-void
.end method

.method protected J()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lj2/o;->O:Ls1/m1;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lj2/o;->P0:J

    iput-wide v0, p0, Lj2/o;->Q0:J

    const/4 v0, 0x0

    iput v0, p0, Lj2/o;->R0:I

    invoke-virtual {p0}, Lj2/o;->p0()Z

    return-void
.end method

.method protected final J0()V
    .locals 6

    iget-object v0, p0, Lj2/o;->X:Lj2/l;

    if-nez v0, :cond_8

    iget-boolean v0, p0, Lj2/o;->x0:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lj2/o;->O:Ls1/m1;

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, Lj2/o;->R:Lw1/o;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lj2/o;->l1(Ls1/m1;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj2/o;->O:Ls1/m1;

    invoke-direct {p0, v0}, Lj2/o;->D0(Ls1/m1;)V

    return-void

    :cond_1
    iget-object v0, p0, Lj2/o;->R:Lw1/o;

    invoke-direct {p0, v0}, Lj2/o;->e1(Lw1/o;)V

    iget-object v0, p0, Lj2/o;->O:Ls1/m1;

    iget-object v0, v0, Ls1/m1;->y:Ljava/lang/String;

    iget-object v1, p0, Lj2/o;->Q:Lw1/o;

    if-eqz v1, :cond_7

    iget-object v2, p0, Lj2/o;->S:Landroid/media/MediaCrypto;

    const/4 v3, 0x1

    if-nez v2, :cond_5

    invoke-direct {p0, v1}, Lj2/o;->x0(Lw1/o;)Lw1/h0;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v0, p0, Lj2/o;->Q:Lw1/o;

    invoke-interface {v0}, Lw1/o;->h()Lw1/o$a;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :try_start_0
    new-instance v2, Landroid/media/MediaCrypto;

    iget-object v4, v1, Lw1/h0;->a:Ljava/util/UUID;

    iget-object v5, v1, Lw1/h0;->b:[B

    invoke-direct {v2, v4, v5}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    iput-object v2, p0, Lj2/o;->S:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    iget-boolean v1, v1, Lw1/h0;->c:Z

    if-nez v1, :cond_4

    invoke-virtual {v2, v0}, Landroid/media/MediaCrypto;->requiresSecureDecoderComponent(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v3

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lj2/o;->T:Z

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lj2/o;->O:Ls1/m1;

    const/16 v2, 0x1776

    invoke-virtual {p0, v0, v1, v2}, Ls1/f;->B(Ljava/lang/Throwable;Ls1/m1;I)Ls1/q;

    move-result-object v0

    throw v0

    :cond_5
    :goto_1
    sget-boolean v0, Lw1/h0;->d:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lj2/o;->Q:Lw1/o;

    invoke-interface {v0}, Lw1/o;->f()I

    move-result v0

    if-eq v0, v3, :cond_6

    const/4 v1, 0x4

    if-eq v0, v1, :cond_7

    return-void

    :cond_6
    iget-object v0, p0, Lj2/o;->Q:Lw1/o;

    invoke-interface {v0}, Lw1/o;->h()Lw1/o$a;

    move-result-object v0

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw1/o$a;

    iget-object v1, p0, Lj2/o;->O:Ls1/m1;

    iget v2, v0, Lw1/o$a;->n:I

    invoke-virtual {p0, v0, v1, v2}, Ls1/f;->B(Ljava/lang/Throwable;Ls1/m1;I)Ls1/q;

    move-result-object v0

    throw v0

    :cond_7
    :try_start_1
    iget-object v0, p0, Lj2/o;->S:Landroid/media/MediaCrypto;

    iget-boolean v1, p0, Lj2/o;->T:Z

    invoke-direct {p0, v0, v1}, Lj2/o;->K0(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch Lj2/o$b; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    iget-object v1, p0, Lj2/o;->O:Ls1/m1;

    const/16 v2, 0xfa1

    invoke-virtual {p0, v0, v1, v2}, Ls1/f;->B(Ljava/lang/Throwable;Ls1/m1;I)Ls1/q;

    move-result-object v0

    throw v0

    :cond_8
    :goto_2
    return-void
.end method

.method protected K(ZZ)V
    .locals 0

    new-instance p1, Lv1/e;

    invoke-direct {p1}, Lv1/e;-><init>()V

    iput-object p1, p0, Lj2/o;->O0:Lv1/e;

    return-void
.end method

.method protected L(JZ)V
    .locals 3

    const/4 p1, 0x0

    iput-boolean p1, p0, Lj2/o;->J0:Z

    iput-boolean p1, p0, Lj2/o;->K0:Z

    iput-boolean p1, p0, Lj2/o;->M0:Z

    iget-boolean p2, p0, Lj2/o;->x0:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lj2/o;->H:Lj2/h;

    invoke-virtual {p2}, Lj2/h;->m()V

    iget-object p2, p0, Lj2/o;->G:Lv1/g;

    invoke-virtual {p2}, Lv1/g;->m()V

    iput-boolean p1, p0, Lj2/o;->y0:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lj2/o;->o0()Z

    :goto_0
    iget-object p2, p0, Lj2/o;->I:Lp3/h0;

    invoke-virtual {p2}, Lp3/h0;->k()I

    move-result p2

    const/4 p3, 0x1

    if-lez p2, :cond_1

    iput-boolean p3, p0, Lj2/o;->L0:Z

    :cond_1
    iget-object p2, p0, Lj2/o;->I:Lp3/h0;

    invoke-virtual {p2}, Lp3/h0;->c()V

    iget p2, p0, Lj2/o;->R0:I

    if-eqz p2, :cond_2

    iget-object v0, p0, Lj2/o;->M:[J

    add-int/lit8 v1, p2, -0x1

    aget-wide v1, v0, v1

    iput-wide v1, p0, Lj2/o;->Q0:J

    iget-object v0, p0, Lj2/o;->L:[J

    sub-int/2addr p2, p3

    aget-wide p2, v0, p2

    iput-wide p2, p0, Lj2/o;->P0:J

    iput p1, p0, Lj2/o;->R0:I

    :cond_2
    return-void
.end method

.method protected abstract L0(Ljava/lang/Exception;)V
.end method

.method protected M()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lj2/o;->g0()V

    invoke-virtual {p0}, Lj2/o;->Y0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0, v0}, Lj2/o;->h1(Lw1/o;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-direct {p0, v0}, Lj2/o;->h1(Lw1/o;)V

    throw v1
.end method

.method protected abstract M0(Ljava/lang/String;Lj2/l$a;JJ)V
.end method

.method protected N()V
    .locals 0

    return-void
.end method

.method protected abstract N0(Ljava/lang/String;)V
.end method

.method protected O()V
    .locals 0

    return-void
.end method

.method protected O0(Ls1/n1;)Lv1/i;
    .locals 11

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj2/o;->L0:Z

    iget-object v1, p1, Ls1/n1;->b:Ls1/m1;

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ls1/m1;

    iget-object v1, v5, Ls1/m1;->y:Ljava/lang/String;

    if-eqz v1, :cond_13

    iget-object p1, p1, Ls1/n1;->a:Lw1/o;

    invoke-direct {p0, p1}, Lj2/o;->h1(Lw1/o;)V

    iput-object v5, p0, Lj2/o;->O:Ls1/m1;

    iget-boolean p1, p0, Lj2/o;->x0:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lj2/o;->z0:Z

    return-object v1

    :cond_0
    iget-object p1, p0, Lj2/o;->X:Lj2/l;

    if-nez p1, :cond_1

    iput-object v1, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Lj2/o;->J0()V

    return-object v1

    :cond_1
    iget-object v1, p0, Lj2/o;->e0:Lj2/n;

    iget-object v4, p0, Lj2/o;->Y:Ls1/m1;

    iget-object v2, p0, Lj2/o;->Q:Lw1/o;

    iget-object v3, p0, Lj2/o;->R:Lw1/o;

    invoke-direct {p0, v1, v5, v2, v3}, Lj2/o;->l0(Lj2/n;Ls1/m1;Lw1/o;Lw1/o;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0}, Lj2/o;->i0()V

    new-instance p1, Lv1/i;

    iget-object v3, v1, Lj2/n;->a:Ljava/lang/String;

    const/4 v6, 0x0

    const/16 v7, 0x80

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lv1/i;-><init>(Ljava/lang/String;Ls1/m1;Ls1/m1;II)V

    return-object p1

    :cond_2
    iget-object v2, p0, Lj2/o;->R:Lw1/o;

    iget-object v3, p0, Lj2/o;->Q:Lw1/o;

    const/4 v6, 0x0

    if-eq v2, v3, :cond_3

    move v2, v0

    goto :goto_0

    :cond_3
    move v2, v6

    :goto_0
    if-eqz v2, :cond_5

    sget v3, Lp3/m0;->a:I

    const/16 v7, 0x17

    if-lt v3, v7, :cond_4

    goto :goto_1

    :cond_4
    move v3, v6

    goto :goto_2

    :cond_5
    :goto_1
    move v3, v0

    :goto_2
    invoke-static {v3}, Lp3/a;->f(Z)V

    invoke-virtual {p0, v1, v4, v5}, Lj2/o;->V(Lj2/n;Ls1/m1;Ls1/m1;)Lv1/i;

    move-result-object v3

    iget v7, v3, Lv1/i;->d:I

    const/4 v8, 0x3

    const/16 v9, 0x10

    const/4 v10, 0x2

    if-eqz v7, :cond_f

    if-eq v7, v0, :cond_c

    if-eq v7, v10, :cond_8

    if-ne v7, v8, :cond_7

    invoke-direct {p0, v5}, Lj2/o;->o1(Ls1/m1;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    iput-object v5, p0, Lj2/o;->Y:Ls1/m1;

    if-eqz v2, :cond_10

    invoke-direct {p0}, Lj2/o;->j0()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_5

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_8
    invoke-direct {p0, v5}, Lj2/o;->o1(Ls1/m1;)Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_4

    :cond_9
    iput-boolean v0, p0, Lj2/o;->A0:Z

    iput v0, p0, Lj2/o;->B0:I

    iget v7, p0, Lj2/o;->f0:I

    if-eq v7, v10, :cond_b

    if-ne v7, v0, :cond_a

    iget v7, v5, Ls1/m1;->D:I

    iget v9, v4, Ls1/m1;->D:I

    if-ne v7, v9, :cond_a

    iget v7, v5, Ls1/m1;->E:I

    iget v9, v4, Ls1/m1;->E:I

    if-ne v7, v9, :cond_a

    goto :goto_3

    :cond_a
    move v0, v6

    :cond_b
    :goto_3
    iput-boolean v0, p0, Lj2/o;->n0:Z

    iput-object v5, p0, Lj2/o;->Y:Ls1/m1;

    if-eqz v2, :cond_10

    invoke-direct {p0}, Lj2/o;->j0()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_5

    :cond_c
    invoke-direct {p0, v5}, Lj2/o;->o1(Ls1/m1;)Z

    move-result v0

    if-nez v0, :cond_d

    :goto_4
    move v7, v9

    goto :goto_6

    :cond_d
    iput-object v5, p0, Lj2/o;->Y:Ls1/m1;

    if-eqz v2, :cond_e

    invoke-direct {p0}, Lj2/o;->j0()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_5

    :cond_e
    invoke-direct {p0}, Lj2/o;->h0()Z

    move-result v0

    if-nez v0, :cond_10

    :goto_5
    move v7, v10

    goto :goto_6

    :cond_f
    invoke-direct {p0}, Lj2/o;->i0()V

    :cond_10
    move v7, v6

    :goto_6
    iget v0, v3, Lv1/i;->d:I

    if-eqz v0, :cond_12

    iget-object v0, p0, Lj2/o;->X:Lj2/l;

    if-ne v0, p1, :cond_11

    iget p1, p0, Lj2/o;->D0:I

    if-ne p1, v8, :cond_12

    :cond_11
    new-instance p1, Lv1/i;

    iget-object v3, v1, Lj2/n;->a:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lv1/i;-><init>(Ljava/lang/String;Ls1/m1;Ls1/m1;II)V

    return-object p1

    :cond_12
    return-object v3

    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    const/16 v0, 0xfa5

    invoke-virtual {p0, p1, v5, v0}, Ls1/f;->B(Ljava/lang/Throwable;Ls1/m1;I)Ls1/q;

    move-result-object p1

    throw p1
.end method

.method protected P([Ls1/m1;JJ)V
    .locals 6

    iget-wide v0, p0, Lj2/o;->Q0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    const/4 v0, 0x1

    if-nez p1, :cond_1

    iget-wide v4, p0, Lj2/o;->P0:J

    cmp-long p1, v4, v2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iput-wide p2, p0, Lj2/o;->P0:J

    iput-wide p4, p0, Lj2/o;->Q0:J

    goto :goto_2

    :cond_1
    iget p1, p0, Lj2/o;->R0:I

    iget-object v1, p0, Lj2/o;->M:[J

    array-length v1, v1

    if-ne p1, v1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Too many stream changes, so dropping offset: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj2/o;->M:[J

    iget v2, p0, Lj2/o;->R0:I

    sub-int/2addr v2, v0

    aget-wide v2, v1, v2

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "MediaCodecRenderer"

    invoke-static {v1, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    add-int/2addr p1, v0

    iput p1, p0, Lj2/o;->R0:I

    :goto_1
    iget-object p1, p0, Lj2/o;->L:[J

    iget v1, p0, Lj2/o;->R0:I

    add-int/lit8 v2, v1, -0x1

    aput-wide p2, p1, v2

    iget-object p1, p0, Lj2/o;->M:[J

    add-int/lit8 p2, v1, -0x1

    aput-wide p4, p1, p2

    iget-object p1, p0, Lj2/o;->N:[J

    sub-int/2addr v1, v0

    iget-wide p2, p0, Lj2/o;->H0:J

    aput-wide p2, p1, v1

    :goto_2
    return-void
.end method

.method protected abstract P0(Ls1/m1;Landroid/media/MediaFormat;)V
.end method

.method protected Q0(J)V
    .locals 6

    :goto_0
    iget v0, p0, Lj2/o;->R0:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lj2/o;->N:[J

    const/4 v2, 0x0

    aget-wide v3, v1, v2

    cmp-long v1, p1, v3

    if-ltz v1, :cond_0

    iget-object v1, p0, Lj2/o;->L:[J

    aget-wide v3, v1, v2

    iput-wide v3, p0, Lj2/o;->P0:J

    iget-object v3, p0, Lj2/o;->M:[J

    aget-wide v4, v3, v2

    iput-wide v4, p0, Lj2/o;->Q0:J

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lj2/o;->R0:I

    const/4 v3, 0x1

    invoke-static {v1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lj2/o;->M:[J

    iget v1, p0, Lj2/o;->R0:I

    invoke-static {v0, v3, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lj2/o;->N:[J

    iget v1, p0, Lj2/o;->R0:I

    invoke-static {v0, v3, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0}, Lj2/o;->R0()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected R0()V
    .locals 0

    return-void
.end method

.method protected abstract S0(Lv1/g;)V
.end method

.method protected abstract U0(JJLj2/l;Ljava/nio/ByteBuffer;IIIJZZLs1/m1;)Z
.end method

.method protected abstract V(Lj2/n;Ls1/m1;Ls1/m1;)Lv1/i;
.end method

.method protected Y0()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lj2/o;->X:Lj2/l;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lj2/l;->a()V

    iget-object v1, p0, Lj2/o;->O0:Lv1/e;

    iget v2, v1, Lv1/e;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lv1/e;->b:I

    iget-object v1, p0, Lj2/o;->e0:Lj2/n;

    iget-object v1, v1, Lj2/n;->a:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lj2/o;->N0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    iput-object v0, p0, Lj2/o;->X:Lj2/l;

    :try_start_1
    iget-object v1, p0, Lj2/o;->S:Landroid/media/MediaCrypto;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    iput-object v0, p0, Lj2/o;->S:Landroid/media/MediaCrypto;

    invoke-direct {p0, v0}, Lj2/o;->e1(Lw1/o;)V

    invoke-virtual {p0}, Lj2/o;->b1()V

    return-void

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lj2/o;->S:Landroid/media/MediaCrypto;

    invoke-direct {p0, v0}, Lj2/o;->e1(Lw1/o;)V

    invoke-virtual {p0}, Lj2/o;->b1()V

    throw v1

    :catchall_1
    move-exception v1

    iput-object v0, p0, Lj2/o;->X:Lj2/l;

    :try_start_2
    iget-object v2, p0, Lj2/o;->S:Landroid/media/MediaCrypto;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_2
    iput-object v0, p0, Lj2/o;->S:Landroid/media/MediaCrypto;

    invoke-direct {p0, v0}, Lj2/o;->e1(Lw1/o;)V

    invoke-virtual {p0}, Lj2/o;->b1()V

    throw v1

    :catchall_2
    move-exception v1

    iput-object v0, p0, Lj2/o;->S:Landroid/media/MediaCrypto;

    invoke-direct {p0, v0}, Lj2/o;->e1(Lw1/o;)V

    invoke-virtual {p0}, Lj2/o;->b1()V

    throw v1
.end method

.method protected Z0()V
    .locals 0

    return-void
.end method

.method public final a(Ls1/m1;)I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lj2/o;->B:Lj2/q;

    invoke-virtual {p0, v0, p1}, Lj2/o;->m1(Lj2/q;Ls1/m1;)I

    move-result p1
    :try_end_0
    .catch Lj2/v$c; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    const/16 v1, 0xfa2

    invoke-virtual {p0, v0, p1, v1}, Ls1/f;->B(Ljava/lang/Throwable;Ls1/m1;I)Ls1/q;

    move-result-object p1

    throw p1
.end method

.method protected a1()V
    .locals 4

    invoke-direct {p0}, Lj2/o;->c1()V

    invoke-direct {p0}, Lj2/o;->d1()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lj2/o;->r0:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lj2/o;->F0:Z

    iput-boolean v2, p0, Lj2/o;->E0:Z

    iput-boolean v2, p0, Lj2/o;->n0:Z

    iput-boolean v2, p0, Lj2/o;->o0:Z

    iput-boolean v2, p0, Lj2/o;->v0:Z

    iput-boolean v2, p0, Lj2/o;->w0:Z

    iget-object v3, p0, Lj2/o;->J:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-wide v0, p0, Lj2/o;->H0:J

    iput-wide v0, p0, Lj2/o;->I0:J

    iget-object v0, p0, Lj2/o;->q0:Lj2/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj2/i;->c()V

    :cond_0
    iput v2, p0, Lj2/o;->C0:I

    iput v2, p0, Lj2/o;->D0:I

    iget-boolean v0, p0, Lj2/o;->A0:Z

    iput v0, p0, Lj2/o;->B0:I

    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lj2/o;->K0:Z

    return v0
.end method

.method protected b1()V
    .locals 2

    invoke-virtual {p0}, Lj2/o;->a1()V

    const/4 v0, 0x0

    iput-object v0, p0, Lj2/o;->N0:Ls1/q;

    iput-object v0, p0, Lj2/o;->q0:Lj2/i;

    iput-object v0, p0, Lj2/o;->c0:Ljava/util/ArrayDeque;

    iput-object v0, p0, Lj2/o;->e0:Lj2/n;

    iput-object v0, p0, Lj2/o;->Y:Ls1/m1;

    iput-object v0, p0, Lj2/o;->Z:Landroid/media/MediaFormat;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj2/o;->a0:Z

    iput-boolean v0, p0, Lj2/o;->G0:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lj2/o;->b0:F

    iput v0, p0, Lj2/o;->f0:I

    iput-boolean v0, p0, Lj2/o;->g0:Z

    iput-boolean v0, p0, Lj2/o;->h0:Z

    iput-boolean v0, p0, Lj2/o;->i0:Z

    iput-boolean v0, p0, Lj2/o;->j0:Z

    iput-boolean v0, p0, Lj2/o;->k0:Z

    iput-boolean v0, p0, Lj2/o;->l0:Z

    iput-boolean v0, p0, Lj2/o;->m0:Z

    iput-boolean v0, p0, Lj2/o;->p0:Z

    iput-boolean v0, p0, Lj2/o;->A0:Z

    iput v0, p0, Lj2/o;->B0:I

    iput-boolean v0, p0, Lj2/o;->T:Z

    return-void
.end method

.method protected f0(Ljava/lang/Throwable;Lj2/n;)Lj2/m;
    .locals 1

    new-instance v0, Lj2/m;

    invoke-direct {v0, p1, p2}, Lj2/m;-><init>(Ljava/lang/Throwable;Lj2/n;)V

    return-object v0
.end method

.method protected final f1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj2/o;->M0:Z

    return-void
.end method

.method protected final g1(Ls1/q;)V
    .locals 0

    iput-object p1, p0, Lj2/o;->N0:Ls1/q;

    return-void
.end method

.method public i()Z
    .locals 4

    iget-object v0, p0, Lj2/o;->O:Ls1/m1;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ls1/f;->I()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lj2/o;->C0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lj2/o;->r0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lj2/o;->r0:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected j1(Lj2/n;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method protected k1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected l1(Ls1/m1;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected abstract m1(Lj2/q;Ls1/m1;)I
.end method

.method public final n()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public o(JJ)V
    .locals 5

    iget-boolean v0, p0, Lj2/o;->M0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lj2/o;->M0:Z

    invoke-direct {p0}, Lj2/o;->T0()V

    :cond_0
    iget-object v0, p0, Lj2/o;->N0:Ls1/q;

    if-nez v0, :cond_a

    const/4 v0, 0x1

    :try_start_0
    iget-boolean v2, p0, Lj2/o;->K0:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lj2/o;->Z0()V

    return-void

    :cond_1
    iget-object v2, p0, Lj2/o;->O:Ls1/m1;

    if-nez v2, :cond_2

    const/4 v2, 0x2

    invoke-direct {p0, v2}, Lj2/o;->W0(I)Z

    move-result v2

    if-nez v2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lj2/o;->J0()V

    iget-boolean v2, p0, Lj2/o;->x0:Z

    if-eqz v2, :cond_4

    const-string v2, "bypassRender"

    invoke-static {v2}, Lp3/j0;->a(Ljava/lang/String;)V

    :goto_0
    invoke-direct {p0, p1, p2, p3, p4}, Lj2/o;->U(JJ)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lp3/j0;->c()V

    goto :goto_3

    :cond_4
    iget-object v2, p0, Lj2/o;->X:Lj2/l;

    if-eqz v2, :cond_6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-string v4, "drainAndFeed"

    invoke-static {v4}, Lp3/j0;->a(Ljava/lang/String;)V

    :goto_1
    invoke-direct {p0, p1, p2, p3, p4}, Lj2/o;->k0(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-direct {p0, v2, v3}, Lj2/o;->i1(J)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    :goto_2
    invoke-direct {p0}, Lj2/o;->m0()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0, v2, v3}, Lj2/o;->i1(J)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_6
    iget-object p3, p0, Lj2/o;->O0:Lv1/e;

    iget p4, p3, Lv1/e;->d:I

    invoke-virtual {p0, p1, p2}, Ls1/f;->S(J)I

    move-result p1

    add-int/2addr p4, p1

    iput p4, p3, Lv1/e;->d:I

    invoke-direct {p0, v0}, Lj2/o;->W0(I)Z

    :goto_3
    iget-object p1, p0, Lj2/o;->O0:Lv1/e;

    invoke-virtual {p1}, Lv1/e;->c()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, Lj2/o;->G0(Ljava/lang/IllegalStateException;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p0, p1}, Lj2/o;->L0(Ljava/lang/Exception;)V

    sget p2, Lp3/m0;->a:I

    const/16 p3, 0x15

    if-lt p2, p3, :cond_7

    invoke-static {p1}, Lj2/o;->I0(Ljava/lang/IllegalStateException;)Z

    move-result p2

    if-eqz p2, :cond_7

    move v1, v0

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lj2/o;->Y0()V

    :cond_8
    invoke-virtual {p0}, Lj2/o;->s0()Lj2/n;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lj2/o;->f0(Ljava/lang/Throwable;Lj2/n;)Lj2/m;

    move-result-object p1

    iget-object p2, p0, Lj2/o;->O:Ls1/m1;

    const/16 p3, 0xfa3

    invoke-virtual {p0, p1, p2, v1, p3}, Ls1/f;->C(Ljava/lang/Throwable;Ls1/m1;ZI)Ls1/q;

    move-result-object p1

    throw p1

    :cond_9
    throw p1

    :cond_a
    const/4 p1, 0x0

    iput-object p1, p0, Lj2/o;->N0:Ls1/q;

    throw v0
.end method

.method protected final o0()Z
    .locals 1

    invoke-virtual {p0}, Lj2/o;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj2/o;->J0()V

    :cond_0
    return v0
.end method

.method protected p0()Z
    .locals 5

    iget-object v0, p0, Lj2/o;->X:Lj2/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lj2/o;->D0:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v0, v2, :cond_5

    iget-boolean v2, p0, Lj2/o;->h0:Z

    if-nez v2, :cond_5

    iget-boolean v2, p0, Lj2/o;->i0:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lj2/o;->G0:Z

    if-eqz v2, :cond_5

    :cond_1
    iget-boolean v2, p0, Lj2/o;->j0:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lj2/o;->F0:Z

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    sget v0, Lp3/m0;->a:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_3

    move v4, v3

    goto :goto_0

    :cond_3
    move v4, v1

    :goto_0
    invoke-static {v4}, Lp3/a;->f(Z)V

    if-lt v0, v2, :cond_4

    :try_start_0
    invoke-direct {p0}, Lj2/o;->p1()V
    :try_end_0
    .catch Ls1/q; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "MediaCodecRenderer"

    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    invoke-static {v1, v2, v0}, Lp3/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lj2/o;->Y0()V

    return v3

    :cond_4
    :goto_1
    invoke-direct {p0}, Lj2/o;->n0()V

    return v1

    :cond_5
    :goto_2
    invoke-virtual {p0}, Lj2/o;->Y0()V

    return v3
.end method

.method protected final q1(J)V
    .locals 1

    iget-object v0, p0, Lj2/o;->I:Lp3/h0;

    invoke-virtual {v0, p1, p2}, Lp3/h0;->i(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls1/m1;

    if-nez p1, :cond_0

    iget-boolean p2, p0, Lj2/o;->a0:Z

    if-eqz p2, :cond_0

    iget-object p1, p0, Lj2/o;->I:Lp3/h0;

    invoke-virtual {p1}, Lp3/h0;->h()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls1/m1;

    :cond_0
    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iput-object p1, p0, Lj2/o;->P:Ls1/m1;

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, p2

    :goto_0
    if-nez p1, :cond_2

    iget-boolean p1, p0, Lj2/o;->a0:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lj2/o;->P:Ls1/m1;

    if-eqz p1, :cond_3

    :cond_2
    iget-object p1, p0, Lj2/o;->P:Ls1/m1;

    iget-object v0, p0, Lj2/o;->Z:Landroid/media/MediaFormat;

    invoke-virtual {p0, p1, v0}, Lj2/o;->P0(Ls1/m1;Landroid/media/MediaFormat;)V

    iput-boolean p2, p0, Lj2/o;->a0:Z

    :cond_3
    return-void
.end method

.method protected final r0()Lj2/l;
    .locals 1

    iget-object v0, p0, Lj2/o;->X:Lj2/l;

    return-object v0
.end method

.method protected final s0()Lj2/n;
    .locals 1

    iget-object v0, p0, Lj2/o;->e0:Lj2/n;

    return-object v0
.end method

.method protected t0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected abstract u0(FLs1/m1;[Ls1/m1;)F
.end method

.method protected final v0()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lj2/o;->Z:Landroid/media/MediaFormat;

    return-object v0
.end method

.method protected abstract w0(Lj2/q;Ls1/m1;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj2/q;",
            "Ls1/m1;",
            "Z)",
            "Ljava/util/List<",
            "Lj2/n;",
            ">;"
        }
    .end annotation
.end method

.method protected abstract y0(Lj2/n;Ls1/m1;Landroid/media/MediaCrypto;F)Lj2/l$a;
.end method

.method protected final z0()J
    .locals 2

    iget-wide v0, p0, Lj2/o;->Q0:J

    return-wide v0
.end method
