.class public final Lu1/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu1/z$b;,
        Lu1/z$j;,
        Lu1/z$f;,
        Lu1/z$k;,
        Lu1/z$i;,
        Lu1/z$l;,
        Lu1/z$e;,
        Lu1/z$d;,
        Lu1/z$g;,
        Lu1/z$c;,
        Lu1/z$h;
    }
.end annotation


# static fields
.field public static c0:Z = false


# instance fields
.field private A:I

.field private B:J

.field private C:J

.field private D:J

.field private E:J

.field private F:I

.field private G:Z

.field private H:Z

.field private I:J

.field private J:F

.field private K:[Lu1/g;

.field private L:[Ljava/nio/ByteBuffer;

.field private M:Ljava/nio/ByteBuffer;

.field private N:I

.field private O:Ljava/nio/ByteBuffer;

.field private P:[B

.field private Q:I

.field private R:I

.field private S:Z

.field private T:Z

.field private U:Z

.field private V:Z

.field private W:I

.field private X:Lu1/w;

.field private Y:Z

.field private Z:J

.field private final a:Lu1/f;

.field private a0:Z

.field private final b:Lu1/z$c;

.field private b0:Z

.field private final c:Z

.field private final d:Lu1/y;

.field private final e:Lu1/k0;

.field private final f:[Lu1/g;

.field private final g:[Lu1/g;

.field private final h:Lp3/g;

.field private final i:Lu1/v;

.field private final j:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lu1/z$i;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Z

.field private final l:I

.field private m:Lu1/z$l;

.field private final n:Lu1/z$j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu1/z$j<",
            "Lu1/t$b;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Lu1/z$j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu1/z$j<",
            "Lu1/t$e;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Lu1/z$d;

.field private q:Lt1/t1;

.field private r:Lu1/t$c;

.field private s:Lu1/z$f;

.field private t:Lu1/z$f;

.field private u:Landroid/media/AudioTrack;

.field private v:Lu1/e;

.field private w:Lu1/z$i;

.field private x:Lu1/z$i;

.field private y:Ls1/o2;

.field private z:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lu1/z$e;)V
    .locals 12
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "#1.audioProcessorChain"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lu1/z$e;->a(Lu1/z$e;)Lu1/f;

    move-result-object v0

    iput-object v0, p0, Lu1/z;->a:Lu1/f;

    invoke-static {p1}, Lu1/z$e;->b(Lu1/z$e;)Lu1/z$c;

    move-result-object v0

    iput-object v0, p0, Lu1/z;->b:Lu1/z$c;

    sget v1, Lp3/m0;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/16 v4, 0x15

    if-lt v1, v4, :cond_0

    invoke-static {p1}, Lu1/z$e;->c(Lu1/z$e;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    iput-boolean v4, p0, Lu1/z;->c:Z

    const/16 v4, 0x17

    if-lt v1, v4, :cond_1

    invoke-static {p1}, Lu1/z$e;->d(Lu1/z$e;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    iput-boolean v4, p0, Lu1/z;->k:Z

    const/16 v4, 0x1d

    if-lt v1, v4, :cond_2

    invoke-static {p1}, Lu1/z$e;->e(Lu1/z$e;)I

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    iput v1, p0, Lu1/z;->l:I

    iget-object p1, p1, Lu1/z$e;->f:Lu1/z$d;

    iput-object p1, p0, Lu1/z;->p:Lu1/z$d;

    new-instance p1, Lp3/g;

    sget-object v1, Lp3/d;->a:Lp3/d;

    invoke-direct {p1, v1}, Lp3/g;-><init>(Lp3/d;)V

    iput-object p1, p0, Lu1/z;->h:Lp3/g;

    invoke-virtual {p1}, Lp3/g;->e()Z

    new-instance p1, Lu1/v;

    new-instance v1, Lu1/z$k;

    const/4 v4, 0x0

    invoke-direct {v1, p0, v4}, Lu1/z$k;-><init>(Lu1/z;Lu1/z$a;)V

    invoke-direct {p1, v1}, Lu1/v;-><init>(Lu1/v$a;)V

    iput-object p1, p0, Lu1/z;->i:Lu1/v;

    new-instance p1, Lu1/y;

    invoke-direct {p1}, Lu1/y;-><init>()V

    iput-object p1, p0, Lu1/z;->d:Lu1/y;

    new-instance v1, Lu1/k0;

    invoke-direct {v1}, Lu1/k0;-><init>()V

    iput-object v1, p0, Lu1/z;->e:Lu1/k0;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x3

    new-array v5, v5, [Lu1/x;

    new-instance v6, Lu1/g0;

    invoke-direct {v6}, Lu1/g0;-><init>()V

    aput-object v6, v5, v3

    aput-object p1, v5, v2

    const/4 p1, 0x2

    aput-object v1, v5, p1

    invoke-static {v4, v5}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    invoke-interface {v0}, Lu1/z$c;->d()[Lu1/g;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    new-array p1, v3, [Lu1/g;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lu1/g;

    iput-object p1, p0, Lu1/z;->f:[Lu1/g;

    new-array p1, v2, [Lu1/g;

    new-instance v0, Lu1/c0;

    invoke-direct {v0}, Lu1/c0;-><init>()V

    aput-object v0, p1, v3

    iput-object p1, p0, Lu1/z;->g:[Lu1/g;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lu1/z;->J:F

    sget-object p1, Lu1/e;->t:Lu1/e;

    iput-object p1, p0, Lu1/z;->v:Lu1/e;

    iput v3, p0, Lu1/z;->W:I

    new-instance p1, Lu1/w;

    const/4 v0, 0x0

    invoke-direct {p1, v3, v0}, Lu1/w;-><init>(IF)V

    iput-object p1, p0, Lu1/z;->X:Lu1/w;

    new-instance p1, Lu1/z$i;

    sget-object v0, Ls1/o2;->q:Ls1/o2;

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object v4, p1

    move-object v5, v0

    invoke-direct/range {v4 .. v11}, Lu1/z$i;-><init>(Ls1/o2;ZJJLu1/z$a;)V

    iput-object p1, p0, Lu1/z;->x:Lu1/z$i;

    iput-object v0, p0, Lu1/z;->y:Ls1/o2;

    const/4 p1, -0x1

    iput p1, p0, Lu1/z;->R:I

    new-array p1, v3, [Lu1/g;

    iput-object p1, p0, Lu1/z;->K:[Lu1/g;

    new-array p1, v3, [Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lu1/z;->L:[Ljava/nio/ByteBuffer;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lu1/z;->j:Ljava/util/ArrayDeque;

    new-instance p1, Lu1/z$j;

    const-wide/16 v0, 0x64

    invoke-direct {p1, v0, v1}, Lu1/z$j;-><init>(J)V

    iput-object p1, p0, Lu1/z;->n:Lu1/z$j;

    new-instance p1, Lu1/z$j;

    invoke-direct {p1, v0, v1}, Lu1/z$j;-><init>(J)V

    iput-object p1, p0, Lu1/z;->o:Lu1/z$j;

    return-void
.end method

.method synthetic constructor <init>(Lu1/z$e;Lu1/z$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lu1/z;-><init>(Lu1/z$e;)V

    return-void
.end method

.method static synthetic A(Lu1/z;)J
    .locals 2

    invoke-direct {p0}, Lu1/z;->U()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic B(Lu1/z;)J
    .locals 2

    invoke-direct {p0}, Lu1/z;->V()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic C(Lu1/z;)J
    .locals 2

    iget-wide v0, p0, Lu1/z;->Z:J

    return-wide v0
.end method

.method static synthetic D(III)Landroid/media/AudioFormat;
    .locals 0

    invoke-static {p0, p1, p2}, Lu1/z;->N(III)Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method static synthetic E(Lu1/z;)Lp3/g;
    .locals 0

    iget-object p0, p0, Lu1/z;->h:Lp3/g;

    return-object p0
.end method

.method static synthetic F(Lu1/z;)Landroid/media/AudioTrack;
    .locals 0

    iget-object p0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    return-object p0
.end method

.method private G(J)V
    .locals 11

    invoke-direct {p0}, Lu1/z;->l0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/z;->b:Lu1/z$c;

    invoke-direct {p0}, Lu1/z;->O()Ls1/o2;

    move-result-object v1

    invoke-interface {v0, v1}, Lu1/z$c;->e(Ls1/o2;)Ls1/o2;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ls1/o2;->q:Ls1/o2;

    :goto_0
    move-object v2, v0

    invoke-direct {p0}, Lu1/z;->l0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu1/z;->b:Lu1/z$c;

    invoke-virtual {p0}, Lu1/z;->T()Z

    move-result v1

    invoke-interface {v0, v1}, Lu1/z$c;->b(Z)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iget-object v9, p0, Lu1/z;->j:Ljava/util/ArrayDeque;

    new-instance v10, Lu1/z$i;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iget-object p1, p0, Lu1/z;->t:Lu1/z$f;

    invoke-direct {p0}, Lu1/z;->V()J

    move-result-wide v6

    invoke-virtual {p1, v6, v7}, Lu1/z$f;->h(J)J

    move-result-wide v6

    const/4 v8, 0x0

    move-object v1, v10

    move v3, v0

    invoke-direct/range {v1 .. v8}, Lu1/z$i;-><init>(Ls1/o2;ZJJLu1/z$a;)V

    invoke-virtual {v9, v10}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lu1/z;->k0()V

    iget-object p1, p0, Lu1/z;->r:Lu1/t$c;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0}, Lu1/t$c;->b(Z)V

    :cond_2
    return-void
.end method

.method private H(J)J
    .locals 4

    :goto_0
    iget-object v0, p0, Lu1/z;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu1/z;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/z$i;

    iget-wide v0, v0, Lu1/z$i;->d:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lu1/z;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/z$i;

    iput-object v0, p0, Lu1/z;->x:Lu1/z$i;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu1/z;->x:Lu1/z$i;

    iget-wide v1, v0, Lu1/z$i;->d:J

    sub-long v1, p1, v1

    iget-object v0, v0, Lu1/z$i;->a:Ls1/o2;

    sget-object v3, Ls1/o2;->q:Ls1/o2;

    invoke-virtual {v0, v3}, Ls1/o2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lu1/z;->x:Lu1/z$i;

    iget-wide p1, p1, Lu1/z$i;->c:J

    add-long/2addr p1, v1

    return-wide p1

    :cond_1
    iget-object v0, p0, Lu1/z;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lu1/z;->b:Lu1/z$c;

    invoke-interface {p1, v1, v2}, Lu1/z$c;->c(J)J

    move-result-wide p1

    iget-object v0, p0, Lu1/z;->x:Lu1/z$i;

    iget-wide v0, v0, Lu1/z$i;->c:J

    add-long/2addr v0, p1

    return-wide v0

    :cond_2
    iget-object v0, p0, Lu1/z;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/z$i;

    iget-wide v1, v0, Lu1/z$i;->d:J

    sub-long/2addr v1, p1

    iget-object p1, p0, Lu1/z;->x:Lu1/z$i;

    iget-object p1, p1, Lu1/z$i;->a:Ls1/o2;

    iget p1, p1, Ls1/o2;->n:F

    invoke-static {v1, v2, p1}, Lp3/m0;->Z(JF)J

    move-result-wide p1

    iget-wide v0, v0, Lu1/z$i;->c:J

    sub-long/2addr v0, p1

    return-wide v0
.end method

.method private I(J)J
    .locals 3

    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    iget-object v1, p0, Lu1/z;->b:Lu1/z$c;

    invoke-interface {v1}, Lu1/z$c;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu1/z$f;->h(J)J

    move-result-wide v0

    add-long/2addr p1, v0

    return-wide p1
.end method

.method private J(Lu1/z$f;)Landroid/media/AudioTrack;
    .locals 3

    :try_start_0
    iget-boolean v0, p0, Lu1/z;->Y:Z

    iget-object v1, p0, Lu1/z;->v:Lu1/e;

    iget v2, p0, Lu1/z;->W:I

    invoke-virtual {p1, v0, v1, v2}, Lu1/z$f;->a(ZLu1/e;I)Landroid/media/AudioTrack;

    move-result-object p1
    :try_end_0
    .catch Lu1/t$b; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lu1/z;->r:Lu1/t$c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lu1/t$c;->c(Ljava/lang/Exception;)V

    :cond_0
    throw p1
.end method

.method private K()Landroid/media/AudioTrack;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/z$f;

    invoke-direct {p0, v0}, Lu1/z;->J(Lu1/z$f;)Landroid/media/AudioTrack;

    move-result-object v0
    :try_end_0
    .catch Lu1/t$b; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lu1/z;->t:Lu1/z$f;

    iget v2, v1, Lu1/z$f;->h:I

    const v3, 0xf4240

    if-le v2, v3, :cond_0

    invoke-virtual {v1, v3}, Lu1/z$f;->c(I)Lu1/z$f;

    move-result-object v1

    :try_start_1
    invoke-direct {p0, v1}, Lu1/z;->J(Lu1/z$f;)Landroid/media/AudioTrack;

    move-result-object v2

    iput-object v1, p0, Lu1/z;->t:Lu1/z$f;
    :try_end_1
    .catch Lu1/t$b; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Exception;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    invoke-direct {p0}, Lu1/z;->a0()V

    throw v0
.end method

.method private L()Z
    .locals 9

    iget v0, p0, Lu1/z;->R:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iput v3, p0, Lu1/z;->R:I

    :goto_0
    move v0, v2

    goto :goto_1

    :cond_0
    move v0, v3

    :goto_1
    iget v4, p0, Lu1/z;->R:I

    iget-object v5, p0, Lu1/z;->K:[Lu1/g;

    array-length v6, v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v4, v6, :cond_3

    aget-object v4, v5, v4

    if-eqz v0, :cond_1

    invoke-interface {v4}, Lu1/g;->e()V

    :cond_1
    invoke-direct {p0, v7, v8}, Lu1/z;->c0(J)V

    invoke-interface {v4}, Lu1/g;->b()Z

    move-result v0

    if-nez v0, :cond_2

    return v3

    :cond_2
    iget v0, p0, Lu1/z;->R:I

    add-int/2addr v0, v2

    iput v0, p0, Lu1/z;->R:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lu1/z;->O:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    invoke-direct {p0, v0, v7, v8}, Lu1/z;->o0(Ljava/nio/ByteBuffer;J)V

    iget-object v0, p0, Lu1/z;->O:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    return v3

    :cond_4
    iput v1, p0, Lu1/z;->R:I

    return v2
.end method

.method private M()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lu1/z;->K:[Lu1/g;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-interface {v1}, Lu1/g;->flush()V

    iget-object v2, p0, Lu1/z;->L:[Ljava/nio/ByteBuffer;

    invoke-interface {v1}, Lu1/g;->d()Ljava/nio/ByteBuffer;

    move-result-object v1

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static N(III)Landroid/media/AudioFormat;
    .locals 1

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method private O()Ls1/o2;
    .locals 1

    invoke-direct {p0}, Lu1/z;->R()Lu1/z$i;

    move-result-object v0

    iget-object v0, v0, Lu1/z$i;->a:Ls1/o2;

    return-object v0
.end method

.method private static P(III)I
    .locals 0

    invoke-static {p0, p1, p2}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result p0

    const/4 p1, -0x2

    if-eq p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp3/a;->f(Z)V

    return p0
.end method

.method private static Q(ILjava/nio/ByteBuffer;)I
    .locals 2

    const/16 v0, 0x400

    const/4 v1, -0x1

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected audio encoding: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-static {p1}, Lu1/c;->c(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :pswitch_2
    return v0

    :pswitch_3
    const/16 p0, 0x200

    return p0

    :pswitch_4
    invoke-static {p1}, Lu1/b;->a(Ljava/nio/ByteBuffer;)I

    move-result p0

    if-ne p0, v1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1, p0}, Lu1/b;->h(Ljava/nio/ByteBuffer;I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x10

    :goto_0
    return p0

    :pswitch_5
    const/16 p0, 0x800

    return p0

    :pswitch_6
    return v0

    :pswitch_7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p0

    invoke-static {p1, p0}, Lp3/m0;->I(Ljava/nio/ByteBuffer;I)I

    move-result p0

    invoke-static {p0}, Lu1/e0;->m(I)I

    move-result p0

    if-eq p0, v1, :cond_1

    return p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :pswitch_8
    invoke-static {p1}, Lu1/b0;->e(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :pswitch_9
    invoke-static {p1}, Lu1/b;->d(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_9
    .end packed-switch
.end method

.method private R()Lu1/z$i;
    .locals 1

    iget-object v0, p0, Lu1/z;->w:Lu1/z$i;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu1/z;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lu1/z;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/z$i;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lu1/z;->x:Lu1/z$i;

    :goto_0
    return-object v0
.end method

.method private S(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2}, Landroid/media/AudioManager;->getPlaybackOffloadSupport(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    move-result p1

    return p1

    :cond_0
    invoke-static {p1, p2}, Landroid/media/AudioManager;->isOffloadedPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/16 p1, 0x1e

    if-ne v0, p1, :cond_2

    sget-object p1, Lp3/m0;->d:Ljava/lang/String;

    const-string p2, "Pixel"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private U()J
    .locals 5

    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    iget v1, v0, Lu1/z$f;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lu1/z;->B:J

    iget v0, v0, Lu1/z$f;->b:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lu1/z;->C:J

    :goto_0
    return-wide v1
.end method

.method private V()J
    .locals 5

    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    iget v1, v0, Lu1/z$f;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lu1/z;->D:J

    iget v0, v0, Lu1/z$f;->d:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lu1/z;->E:J

    :goto_0
    return-wide v1
.end method

.method private W()Z
    .locals 9

    iget-object v0, p0, Lu1/z;->h:Lp3/g;

    invoke-virtual {v0}, Lp3/g;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, Lu1/z;->K()Landroid/media/AudioTrack;

    move-result-object v0

    iput-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-static {v0}, Lu1/z;->Z(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-direct {p0, v0}, Lu1/z;->d0(Landroid/media/AudioTrack;)V

    iget v0, p0, Lu1/z;->l:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    iget-object v2, p0, Lu1/z;->t:Lu1/z$f;

    iget-object v2, v2, Lu1/z$f;->a:Ls1/m1;

    iget v3, v2, Ls1/m1;->O:I

    iget v2, v2, Ls1/m1;->P:I

    invoke-virtual {v0, v3, v2}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    :cond_1
    sget v0, Lp3/m0;->a:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_2

    iget-object v0, p0, Lu1/z;->q:Lt1/t1;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-static {v2, v0}, Lu1/z$b;->a(Landroid/media/AudioTrack;Lt1/t1;)V

    :cond_2
    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    iput v0, p0, Lu1/z;->W:I

    iget-object v2, p0, Lu1/z;->i:Lu1/v;

    iget-object v3, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    iget v4, v0, Lu1/z$f;->c:I

    const/4 v5, 0x2

    const/4 v8, 0x1

    if-ne v4, v5, :cond_3

    move v4, v8

    goto :goto_0

    :cond_3
    move v4, v1

    :goto_0
    iget v5, v0, Lu1/z$f;->g:I

    iget v6, v0, Lu1/z$f;->d:I

    iget v7, v0, Lu1/z$f;->h:I

    invoke-virtual/range {v2 .. v7}, Lu1/v;->s(Landroid/media/AudioTrack;ZIII)V

    invoke-direct {p0}, Lu1/z;->h0()V

    iget-object v0, p0, Lu1/z;->X:Lu1/w;

    iget v0, v0, Lu1/w;->a:I

    if-eqz v0, :cond_4

    iget-object v1, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    iget-object v1, p0, Lu1/z;->X:Lu1/w;

    iget v1, v1, Lu1/w;->b:F

    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    :cond_4
    iput-boolean v8, p0, Lu1/z;->H:Z

    return v8
.end method

.method private static X(I)Z
    .locals 2

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, -0x6

    if-eq p0, v0, :cond_1

    :cond_0
    const/16 v0, -0x20

    if-ne p0, v0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private Y()Z
    .locals 1

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static Z(Landroid/media/AudioTrack;)Z
    .locals 2

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private a0()V
    .locals 1

    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    invoke-virtual {v0}, Lu1/z$f;->l()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/z;->a0:Z

    return-void
.end method

.method private b0()V
    .locals 3

    iget-boolean v0, p0, Lu1/z;->T:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/z;->T:Z

    iget-object v0, p0, Lu1/z;->i:Lu1/v;

    invoke-direct {p0}, Lu1/z;->V()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu1/v;->g(J)V

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    const/4 v0, 0x0

    iput v0, p0, Lu1/z;->A:I

    :cond_0
    return-void
.end method

.method private c0(J)V
    .locals 5

    iget-object v0, p0, Lu1/z;->K:[Lu1/g;

    array-length v0, v0

    move v1, v0

    :goto_0
    if-ltz v1, :cond_6

    if-lez v1, :cond_0

    iget-object v2, p0, Lu1/z;->L:[Ljava/nio/ByteBuffer;

    add-int/lit8 v3, v1, -0x1

    aget-object v2, v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lu1/z;->M:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v2, Lu1/g;->a:Ljava/nio/ByteBuffer;

    :goto_1
    if-ne v1, v0, :cond_2

    invoke-direct {p0, v2, p1, p2}, Lu1/z;->o0(Ljava/nio/ByteBuffer;J)V

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lu1/z;->K:[Lu1/g;

    aget-object v3, v3, v1

    iget v4, p0, Lu1/z;->R:I

    if-le v1, v4, :cond_3

    invoke-interface {v3, v2}, Lu1/g;->f(Ljava/nio/ByteBuffer;)V

    :cond_3
    invoke-interface {v3}, Lu1/g;->d()Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Lu1/z;->L:[Ljava/nio/ByteBuffer;

    aput-object v3, v4, v1

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_5

    return-void

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method private d0(Landroid/media/AudioTrack;)V
    .locals 1

    iget-object v0, p0, Lu1/z;->m:Lu1/z$l;

    if-nez v0, :cond_0

    new-instance v0, Lu1/z$l;

    invoke-direct {v0, p0}, Lu1/z$l;-><init>(Lu1/z;)V

    iput-object v0, p0, Lu1/z;->m:Lu1/z$l;

    :cond_0
    iget-object v0, p0, Lu1/z;->m:Lu1/z$l;

    invoke-virtual {v0, p1}, Lu1/z$l;->a(Landroid/media/AudioTrack;)V

    return-void
.end method

.method private e0()V
    .locals 12

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lu1/z;->B:J

    iput-wide v0, p0, Lu1/z;->C:J

    iput-wide v0, p0, Lu1/z;->D:J

    iput-wide v0, p0, Lu1/z;->E:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lu1/z;->b0:Z

    iput v2, p0, Lu1/z;->F:I

    new-instance v11, Lu1/z$i;

    invoke-direct {p0}, Lu1/z;->O()Ls1/o2;

    move-result-object v4

    invoke-virtual {p0}, Lu1/z;->T()Z

    move-result v5

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lu1/z$i;-><init>(Ls1/o2;ZJJLu1/z$a;)V

    iput-object v11, p0, Lu1/z;->x:Lu1/z$i;

    iput-wide v0, p0, Lu1/z;->I:J

    const/4 v0, 0x0

    iput-object v0, p0, Lu1/z;->w:Lu1/z$i;

    iget-object v1, p0, Lu1/z;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    iput-object v0, p0, Lu1/z;->M:Ljava/nio/ByteBuffer;

    iput v2, p0, Lu1/z;->N:I

    iput-object v0, p0, Lu1/z;->O:Ljava/nio/ByteBuffer;

    iput-boolean v2, p0, Lu1/z;->T:Z

    iput-boolean v2, p0, Lu1/z;->S:Z

    const/4 v1, -0x1

    iput v1, p0, Lu1/z;->R:I

    iput-object v0, p0, Lu1/z;->z:Ljava/nio/ByteBuffer;

    iput v2, p0, Lu1/z;->A:I

    iget-object v0, p0, Lu1/z;->e:Lu1/k0;

    invoke-virtual {v0}, Lu1/k0;->o()V

    invoke-direct {p0}, Lu1/z;->M()V

    return-void
.end method

.method private f0(Ls1/o2;Z)V
    .locals 9

    invoke-direct {p0}, Lu1/z;->R()Lu1/z$i;

    move-result-object v0

    iget-object v1, v0, Lu1/z$i;->a:Ls1/o2;

    invoke-virtual {p1, v1}, Ls1/o2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Lu1/z$i;->b:Z

    if-eq p2, v0, :cond_2

    :cond_0
    new-instance v0, Lu1/z$i;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v8}, Lu1/z$i;-><init>(Ls1/o2;ZJJLu1/z$a;)V

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object v0, p0, Lu1/z;->w:Lu1/z$i;

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lu1/z;->x:Lu1/z$i;

    :cond_2
    :goto_0
    return-void
.end method

.method private g0(Ls1/o2;)V
    .locals 2

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/media/PlaybackParams;

    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    move-result-object v0

    iget v1, p1, Ls1/o2;->n:F

    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    move-result-object v0

    iget p1, p1, Ls1/o2;->o:F

    invoke-virtual {v0, p1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "DefaultAudioSink"

    const-string v1, "Failed to set playback params"

    invoke-static {v0, v1, p1}, Lp3/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance p1, Ls1/o2;

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getSpeed()F

    move-result v0

    iget-object v1, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getPitch()F

    move-result v1

    invoke-direct {p1, v0, v1}, Ls1/o2;-><init>(FF)V

    iget-object v0, p0, Lu1/z;->i:Lu1/v;

    iget v1, p1, Ls1/o2;->n:F

    invoke-virtual {v0, v1}, Lu1/v;->t(F)V

    :cond_0
    iput-object p1, p0, Lu1/z;->y:Ls1/o2;

    return-void
.end method

.method private h0()V
    .locals 2

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    iget v1, p0, Lu1/z;->J:F

    invoke-static {v0, v1}, Lu1/z;->i0(Landroid/media/AudioTrack;F)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    iget v1, p0, Lu1/z;->J:F

    invoke-static {v0, v1}, Lu1/z;->j0(Landroid/media/AudioTrack;F)V

    :goto_0
    return-void
.end method

.method private static i0(Landroid/media/AudioTrack;F)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void
.end method

.method private static j0(Landroid/media/AudioTrack;F)V
    .locals 0

    invoke-virtual {p0, p1, p1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    return-void
.end method

.method private k0()V
    .locals 6

    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    iget-object v0, v0, Lu1/z$f;->i:[Lu1/g;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, Lu1/g;->a()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-interface {v4}, Lu1/g;->flush()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v2, v0, [Lu1/g;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lu1/g;

    iput-object v1, p0, Lu1/z;->K:[Lu1/g;

    new-array v0, v0, [Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lu1/z;->L:[Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Lu1/z;->M()V

    return-void
.end method

.method private l0()Z
    .locals 2

    iget-boolean v0, p0, Lu1/z;->Y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    iget-object v0, v0, Lu1/z$f;->a:Ls1/m1;

    iget-object v0, v0, Ls1/m1;->y:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    iget-object v0, v0, Lu1/z$f;->a:Ls1/m1;

    iget v0, v0, Ls1/m1;->N:I

    invoke-direct {p0, v0}, Lu1/z;->m0(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private m0(I)Z
    .locals 1

    iget-boolean v0, p0, Lu1/z;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lp3/m0;->r0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private n0(Ls1/m1;Lu1/e;)Z
    .locals 4

    sget v0, Lp3/m0;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_9

    iget v0, p0, Lu1/z;->l:I

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    iget-object v0, p1, Ls1/m1;->y:Ljava/lang/String;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p1, Ls1/m1;->v:Ljava/lang/String;

    invoke-static {v0, v2}, Lp3/v;->f(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget v2, p1, Ls1/m1;->L:I

    invoke-static {v2}, Lp3/m0;->G(I)I

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v3, p1, Ls1/m1;->M:I

    invoke-static {v3, v2, v0}, Lu1/z;->N(III)Landroid/media/AudioFormat;

    move-result-object v0

    invoke-virtual {p2}, Lu1/e;->b()Lu1/e$d;

    move-result-object p2

    iget-object p2, p2, Lu1/e$d;->a:Landroid/media/AudioAttributes;

    invoke-direct {p0, v0, p2}, Lu1/z;->S(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    move-result p2

    if-eqz p2, :cond_9

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 p1, 0x2

    if-ne p2, p1, :cond_3

    return v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_4
    iget p2, p1, Ls1/m1;->O:I

    if-nez p2, :cond_6

    iget p1, p1, Ls1/m1;->P:I

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    move p1, v1

    goto :goto_1

    :cond_6
    :goto_0
    move p1, v0

    :goto_1
    iget p2, p0, Lu1/z;->l:I

    if-ne p2, v0, :cond_7

    move p2, v0

    goto :goto_2

    :cond_7
    move p2, v1

    :goto_2
    if-eqz p1, :cond_8

    if-nez p2, :cond_9

    :cond_8
    move v1, v0

    :cond_9
    :goto_3
    return v1
.end method

.method private o0(Ljava/nio/ByteBuffer;J)V
    .locals 12

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lu1/z;->O:Ljava/nio/ByteBuffer;

    const/16 v1, 0x15

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-ne v0, p1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    goto :goto_1

    :cond_2
    iput-object p1, p0, Lu1/z;->O:Ljava/nio/ByteBuffer;

    sget v0, Lp3/m0;->a:I

    if-ge v0, v1, :cond_5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    iget-object v4, p0, Lu1/z;->P:[B

    if-eqz v4, :cond_3

    array-length v4, v4

    if-ge v4, v0, :cond_4

    :cond_3
    new-array v4, v0, [B

    iput-object v4, p0, Lu1/z;->P:[B

    :cond_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    iget-object v5, p0, Lu1/z;->P:[B

    invoke-virtual {p1, v5, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput v3, p0, Lu1/z;->Q:I

    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    sget v4, Lp3/m0;->a:I

    if-ge v4, v1, :cond_7

    iget-object p2, p0, Lu1/z;->i:Lu1/v;

    iget-wide v4, p0, Lu1/z;->D:J

    invoke-virtual {p2, v4, v5}, Lu1/v;->c(J)I

    move-result p2

    if-lez p2, :cond_6

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object p3, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    iget-object v1, p0, Lu1/z;->P:[B

    iget v4, p0, Lu1/z;->Q:I

    invoke-virtual {p3, v1, v4, p2}, Landroid/media/AudioTrack;->write([BII)I

    move-result p2

    if-lez p2, :cond_a

    iget p3, p0, Lu1/z;->Q:I

    add-int/2addr p3, p2

    iput p3, p0, Lu1/z;->Q:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_3

    :cond_6
    move p2, v3

    goto :goto_3

    :cond_7
    iget-boolean v1, p0, Lu1/z;->Y:Z

    if-eqz v1, :cond_9

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, p2, v4

    if-eqz v1, :cond_8

    move v1, v2

    goto :goto_2

    :cond_8
    move v1, v3

    :goto_2
    invoke-static {v1}, Lp3/a;->f(Z)V

    iget-object v7, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    move-object v6, p0

    move-object v8, p1

    move v9, v0

    move-wide v10, p2

    invoke-direct/range {v6 .. v11}, Lu1/z;->q0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I

    move-result p2

    goto :goto_3

    :cond_9
    iget-object p2, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-static {p2, p1, v0}, Lu1/z;->p0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result p2

    :cond_a
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, p0, Lu1/z;->Z:J

    if-gez p2, :cond_e

    invoke-static {p2}, Lu1/z;->X(I)Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-direct {p0}, Lu1/z;->a0()V

    :cond_b
    new-instance p3, Lu1/t$e;

    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    iget-object v0, v0, Lu1/z$f;->a:Ls1/m1;

    invoke-direct {p3, p2, v0, p1}, Lu1/t$e;-><init>(ILs1/m1;Z)V

    iget-object p1, p0, Lu1/z;->r:Lu1/t$c;

    if-eqz p1, :cond_c

    invoke-interface {p1, p3}, Lu1/t$c;->c(Ljava/lang/Exception;)V

    :cond_c
    iget-boolean p1, p3, Lu1/t$e;->o:Z

    if-nez p1, :cond_d

    iget-object p1, p0, Lu1/z;->o:Lu1/z$j;

    invoke-virtual {p1, p3}, Lu1/z$j;->b(Ljava/lang/Exception;)V

    return-void

    :cond_d
    throw p3

    :cond_e
    iget-object p3, p0, Lu1/z;->o:Lu1/z$j;

    invoke-virtual {p3}, Lu1/z$j;->a()V

    iget-object p3, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-static {p3}, Lu1/z;->Z(Landroid/media/AudioTrack;)Z

    move-result p3

    if-eqz p3, :cond_10

    iget-wide v4, p0, Lu1/z;->E:J

    const-wide/16 v6, 0x0

    cmp-long p3, v4, v6

    if-lez p3, :cond_f

    iput-boolean v3, p0, Lu1/z;->b0:Z

    :cond_f
    iget-boolean p3, p0, Lu1/z;->U:Z

    if-eqz p3, :cond_10

    iget-object p3, p0, Lu1/z;->r:Lu1/t$c;

    if-eqz p3, :cond_10

    if-ge p2, v0, :cond_10

    iget-boolean v1, p0, Lu1/z;->b0:Z

    if-nez v1, :cond_10

    invoke-interface {p3}, Lu1/t$c;->e()V

    :cond_10
    iget-object p3, p0, Lu1/z;->t:Lu1/z$f;

    iget p3, p3, Lu1/z$f;->c:I

    if-nez p3, :cond_11

    iget-wide v4, p0, Lu1/z;->D:J

    int-to-long v6, p2

    add-long/2addr v4, v6

    iput-wide v4, p0, Lu1/z;->D:J

    :cond_11
    if-ne p2, v0, :cond_14

    if-eqz p3, :cond_13

    iget-object p2, p0, Lu1/z;->M:Ljava/nio/ByteBuffer;

    if-ne p1, p2, :cond_12

    goto :goto_4

    :cond_12
    move v2, v3

    :goto_4
    invoke-static {v2}, Lp3/a;->f(Z)V

    iget-wide p1, p0, Lu1/z;->E:J

    iget p3, p0, Lu1/z;->F:I

    int-to-long v0, p3

    iget p3, p0, Lu1/z;->N:I

    int-to-long v2, p3

    mul-long/2addr v0, v2

    add-long/2addr p1, v0

    iput-wide p1, p0, Lu1/z;->E:J

    :cond_13
    const/4 p1, 0x0

    iput-object p1, p0, Lu1/z;->O:Ljava/nio/ByteBuffer;

    :cond_14
    return-void
.end method

.method private static p0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p0

    return p0
.end method

.method private q0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I
    .locals 10

    sget v0, Lp3/m0;->a:I

    const-wide/16 v1, 0x3e8

    const/16 v3, 0x1a

    if-lt v0, v3, :cond_0

    const/4 v7, 0x1

    mul-long v8, p4, v1

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-virtual/range {v4 .. v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lu1/z;->z:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_1

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lu1/z;->z:Ljava/nio/ByteBuffer;

    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lu1/z;->z:Ljava/nio/ByteBuffer;

    const v3, 0x55550001

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :cond_1
    iget v0, p0, Lu1/z;->A:I

    const/4 v3, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lu1/z;->z:Ljava/nio/ByteBuffer;

    const/4 v4, 0x4

    invoke-virtual {v0, v4, p3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lu1/z;->z:Ljava/nio/ByteBuffer;

    const/16 v4, 0x8

    mul-long/2addr p4, v1

    invoke-virtual {v0, v4, p4, p5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    iget-object p4, p0, Lu1/z;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {p4, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput p3, p0, Lu1/z;->A:I

    :cond_2
    iget-object p4, p0, Lu1/z;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p4

    if-lez p4, :cond_4

    iget-object p5, p0, Lu1/z;->z:Ljava/nio/ByteBuffer;

    const/4 v0, 0x1

    invoke-virtual {p1, p5, p4, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p5

    if-gez p5, :cond_3

    iput v3, p0, Lu1/z;->A:I

    return p5

    :cond_3
    if-ge p5, p4, :cond_4

    return v3

    :cond_4
    invoke-static {p1, p2, p3}, Lu1/z;->p0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result p1

    if-gez p1, :cond_5

    iput v3, p0, Lu1/z;->A:I

    return p1

    :cond_5
    iget p2, p0, Lu1/z;->A:I

    sub-int/2addr p2, p1

    iput p2, p0, Lu1/z;->A:I

    return p1
.end method

.method static synthetic y(Lu1/z;)Lu1/t$c;
    .locals 0

    iget-object p0, p0, Lu1/z;->r:Lu1/t$c;

    return-object p0
.end method

.method static synthetic z(Lu1/z;)Z
    .locals 0

    iget-boolean p0, p0, Lu1/z;->U:Z

    return p0
.end method


# virtual methods
.method public T()Z
    .locals 1

    invoke-direct {p0}, Lu1/z;->R()Lu1/z$i;

    move-result-object v0

    iget-boolean v0, v0, Lu1/z$i;->b:Z

    return v0
.end method

.method public a(Ls1/m1;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lu1/z;->x(Ls1/m1;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()Z
    .locals 1

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu1/z;->S:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu1/z;->k()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public c()V
    .locals 5

    invoke-virtual {p0}, Lu1/z;->flush()V

    iget-object v0, p0, Lu1/z;->f:[Lu1/g;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Lu1/g;->c()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu1/z;->g:[Lu1/g;

    array-length v1, v0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, Lu1/g;->c()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iput-boolean v2, p0, Lu1/z;->U:Z

    iput-boolean v2, p0, Lu1/z;->a0:Z

    return-void
.end method

.method public d(Ls1/o2;)V
    .locals 4

    new-instance v0, Ls1/o2;

    iget v1, p1, Ls1/o2;->n:F

    const v2, 0x3dcccccd    # 0.1f

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v1, v2, v3}, Lp3/m0;->p(FFF)F

    move-result v1

    iget p1, p1, Ls1/o2;->o:F

    invoke-static {p1, v2, v3}, Lp3/m0;->p(FFF)F

    move-result p1

    invoke-direct {v0, v1, p1}, Ls1/o2;-><init>(FF)V

    iget-boolean p1, p0, Lu1/z;->k:Z

    if-eqz p1, :cond_0

    sget p1, Lp3/m0;->a:I

    const/16 v1, 0x17

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v0}, Lu1/z;->g0(Ls1/o2;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lu1/z;->T()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lu1/z;->f0(Ls1/o2;Z)V

    :goto_0
    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu1/z;->U:Z

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/z;->i:Lu1/v;

    invoke-virtual {v0}, Lu1/v;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    return-void
.end method

.method public f(F)V
    .locals 1

    iget v0, p0, Lu1/z;->J:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lu1/z;->J:F

    invoke-direct {p0}, Lu1/z;->h0()V

    :cond_0
    return-void
.end method

.method public flush()V
    .locals 4

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lu1/z;->e0()V

    iget-object v0, p0, Lu1/z;->i:Lu1/v;

    invoke-virtual {v0}, Lu1/v;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-static {v0}, Lu1/z;->Z(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu1/z;->m:Lu1/z$l;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/z$l;

    iget-object v1, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0, v1}, Lu1/z$l;->b(Landroid/media/AudioTrack;)V

    :cond_1
    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    const/4 v1, 0x0

    iput-object v1, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    sget v2, Lp3/m0;->a:I

    const/16 v3, 0x15

    if-ge v2, v3, :cond_2

    iget-boolean v2, p0, Lu1/z;->V:Z

    if-nez v2, :cond_2

    const/4 v2, 0x0

    iput v2, p0, Lu1/z;->W:I

    :cond_2
    iget-object v2, p0, Lu1/z;->s:Lu1/z$f;

    if-eqz v2, :cond_3

    iput-object v2, p0, Lu1/z;->t:Lu1/z$f;

    iput-object v1, p0, Lu1/z;->s:Lu1/z$f;

    :cond_3
    iget-object v1, p0, Lu1/z;->i:Lu1/v;

    invoke-virtual {v1}, Lu1/v;->q()V

    iget-object v1, p0, Lu1/z;->h:Lp3/g;

    invoke-virtual {v1}, Lp3/g;->c()Z

    new-instance v1, Lu1/z$a;

    const-string v2, "ExoPlayer:AudioTrackReleaseThread"

    invoke-direct {v1, p0, v2, v0}, Lu1/z$a;-><init>(Lu1/z;Ljava/lang/String;Landroid/media/AudioTrack;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    :cond_4
    iget-object v0, p0, Lu1/z;->o:Lu1/z$j;

    invoke-virtual {v0}, Lu1/z$j;->a()V

    iget-object v0, p0, Lu1/z;->n:Lu1/z$j;

    invoke-virtual {v0}, Lu1/z$j;->a()V

    return-void
.end method

.method public g(Lu1/t$c;)V
    .locals 0

    iput-object p1, p0, Lu1/z;->r:Lu1/t$c;

    return-void
.end method

.method public h()V
    .locals 3

    sget v0, Lp3/m0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-boolean v0, p0, Lu1/z;->V:Z

    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-boolean v0, p0, Lu1/z;->Y:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lu1/z;->Y:Z

    invoke-virtual {p0}, Lu1/z;->flush()V

    :cond_1
    return-void
.end method

.method public i()V
    .locals 1

    iget-boolean v0, p0, Lu1/z;->S:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lu1/z;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lu1/z;->b0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/z;->S:Z

    :cond_0
    return-void
.end method

.method public j()Ls1/o2;
    .locals 1

    iget-boolean v0, p0, Lu1/z;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/z;->y:Ls1/o2;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lu1/z;->O()Ls1/o2;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public k()Z
    .locals 3

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/z;->i:Lu1/v;

    invoke-direct {p0}, Lu1/z;->V()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu1/v;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l(I)V
    .locals 1

    iget v0, p0, Lu1/z;->W:I

    if-eq v0, p1, :cond_1

    iput p1, p0, Lu1/z;->W:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lu1/z;->V:Z

    invoke-virtual {p0}, Lu1/z;->flush()V

    :cond_1
    return-void
.end method

.method public m(Ls1/m1;I[I)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    iget-object v0, v3, Ls1/m1;->y:Ljava/lang/String;

    const-string v2, "audio/raw"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, -0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_5

    iget v0, v3, Ls1/m1;->N:I

    invoke-static {v0}, Lp3/m0;->s0(I)Z

    move-result v0

    invoke-static {v0}, Lp3/a;->a(Z)V

    iget v0, v3, Ls1/m1;->N:I

    iget v2, v3, Ls1/m1;->L:I

    invoke-static {v0, v2}, Lp3/m0;->d0(II)I

    move-result v0

    iget v2, v3, Ls1/m1;->N:I

    invoke-direct {v1, v2}, Lu1/z;->m0(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Lu1/z;->g:[Lu1/g;

    goto :goto_0

    :cond_0
    iget-object v2, v1, Lu1/z;->f:[Lu1/g;

    :goto_0
    iget-object v5, v1, Lu1/z;->e:Lu1/k0;

    iget v6, v3, Ls1/m1;->O:I

    iget v7, v3, Ls1/m1;->P:I

    invoke-virtual {v5, v6, v7}, Lu1/k0;->p(II)V

    sget v5, Lp3/m0;->a:I

    const/16 v6, 0x15

    if-ge v5, v6, :cond_1

    iget v5, v3, Ls1/m1;->L:I

    const/16 v6, 0x8

    if-ne v5, v6, :cond_1

    if-nez p3, :cond_1

    const/4 v5, 0x6

    new-array v6, v5, [I

    move v7, v4

    :goto_1
    if-ge v7, v5, :cond_2

    aput v7, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :cond_2
    iget-object v5, v1, Lu1/z;->d:Lu1/y;

    invoke-virtual {v5, v6}, Lu1/y;->n([I)V

    new-instance v5, Lu1/g$a;

    iget v6, v3, Ls1/m1;->M:I

    iget v7, v3, Ls1/m1;->L:I

    iget v8, v3, Ls1/m1;->N:I

    invoke-direct {v5, v6, v7, v8}, Lu1/g$a;-><init>(III)V

    array-length v6, v2

    move v7, v4

    :goto_2
    if-ge v7, v6, :cond_4

    aget-object v8, v2, v7

    :try_start_0
    invoke-interface {v8, v5}, Lu1/g;->g(Lu1/g$a;)Lu1/g$a;

    move-result-object v9

    invoke-interface {v8}, Lu1/g;->a()Z

    move-result v8
    :try_end_0
    .catch Lu1/g$b; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v8, :cond_3

    move-object v5, v9

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v2, Lu1/t$a;

    invoke-direct {v2, v0, v3}, Lu1/t$a;-><init>(Ljava/lang/Throwable;Ls1/m1;)V

    throw v2

    :cond_4
    iget v6, v5, Lu1/g$a;->c:I

    iget v7, v5, Lu1/g$a;->a:I

    iget v8, v5, Lu1/g$a;->b:I

    invoke-static {v8}, Lp3/m0;->G(I)I

    move-result v8

    iget v5, v5, Lu1/g$a;->b:I

    invoke-static {v6, v5}, Lp3/m0;->d0(II)I

    move-result v5

    move-object/from16 v16, v2

    move v13, v4

    move v14, v5

    move v11, v6

    move v15, v7

    move v2, v8

    goto :goto_3

    :cond_5
    new-array v0, v4, [Lu1/g;

    iget v5, v3, Ls1/m1;->M:I

    iget-object v6, v1, Lu1/z;->v:Lu1/e;

    invoke-direct {v1, v3, v6}, Lu1/z;->n0(Ls1/m1;Lu1/e;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, v3, Ls1/m1;->y:Ljava/lang/String;

    invoke-static {v6}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    iget-object v7, v3, Ls1/m1;->v:Ljava/lang/String;

    invoke-static {v6, v7}, Lp3/v;->f(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    iget v7, v3, Ls1/m1;->L:I

    invoke-static {v7}, Lp3/m0;->G(I)I

    move-result v7

    const/4 v8, 0x1

    move-object/from16 v16, v0

    move v0, v2

    move v14, v0

    move v15, v5

    move v11, v6

    move v2, v7

    move v13, v8

    goto :goto_3

    :cond_6
    const/4 v6, 0x2

    iget-object v7, v1, Lu1/z;->a:Lu1/f;

    invoke-virtual {v7, v3}, Lu1/f;->f(Ls1/m1;)Landroid/util/Pair;

    move-result-object v7

    if-eqz v7, :cond_c

    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object/from16 v16, v0

    move v0, v2

    move v14, v0

    move v15, v5

    move v13, v6

    move v2, v7

    move v11, v8

    :goto_3
    if-eqz p2, :cond_7

    move/from16 v10, p2

    move/from16 v19, v11

    goto :goto_5

    :cond_7
    iget-object v5, v1, Lu1/z;->p:Lu1/z$d;

    invoke-static {v15, v2, v11}, Lu1/z;->P(III)I

    move-result v6

    iget-boolean v7, v1, Lu1/z;->k:Z

    if-eqz v7, :cond_8

    const-wide/high16 v7, 0x4020000000000000L    # 8.0

    goto :goto_4

    :cond_8
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    :goto_4
    move-wide/from16 v17, v7

    move v7, v11

    move v8, v13

    move v9, v14

    move v10, v15

    move/from16 v19, v11

    move-wide/from16 v11, v17

    invoke-interface/range {v5 .. v12}, Lu1/z$d;->a(IIIIID)I

    move-result v5

    move v10, v5

    :goto_5
    const-string v5, ") for: "

    if-eqz v19, :cond_b

    if-eqz v2, :cond_a

    iput-boolean v4, v1, Lu1/z;->a0:Z

    new-instance v12, Lu1/z$f;

    move v8, v2

    move-object v2, v12

    move-object/from16 v3, p1

    move v4, v0

    move v5, v13

    move v6, v14

    move v7, v15

    move/from16 v9, v19

    move-object/from16 v11, v16

    invoke-direct/range {v2 .. v11}, Lu1/z$f;-><init>(Ls1/m1;IIIIIII[Lu1/g;)V

    invoke-direct/range {p0 .. p0}, Lu1/z;->Y()Z

    move-result v0

    if-eqz v0, :cond_9

    iput-object v12, v1, Lu1/z;->s:Lu1/z$f;

    goto :goto_6

    :cond_9
    iput-object v12, v1, Lu1/z;->t:Lu1/z$f;

    :goto_6
    return-void

    :cond_a
    new-instance v0, Lu1/t$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid output channel config (mode="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lu1/t$a;-><init>(Ljava/lang/String;Ls1/m1;)V

    throw v0

    :cond_b
    new-instance v0, Lu1/t$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid output encoding (mode="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lu1/t$a;-><init>(Ljava/lang/String;Ls1/m1;)V

    throw v0

    :cond_c
    new-instance v0, Lu1/t$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to configure passthrough for: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lu1/t$a;-><init>(Ljava/lang/String;Ls1/m1;)V

    throw v0
.end method

.method public n(Lt1/t1;)V
    .locals 0

    iput-object p1, p0, Lu1/z;->q:Lt1/t1;

    return-void
.end method

.method public o()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/z;->U:Z

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/z;->i:Lu1/v;

    invoke-virtual {v0}, Lu1/v;->u()V

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_0
    return-void
.end method

.method public p(Ljava/nio/ByteBuffer;JI)Z
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    move/from16 v4, p4

    iget-object v5, v1, Lu1/z;->M:Ljava/nio/ByteBuffer;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    if-ne v0, v5, :cond_0

    goto :goto_0

    :cond_0
    move v5, v7

    goto :goto_1

    :cond_1
    :goto_0
    move v5, v6

    :goto_1
    invoke-static {v5}, Lp3/a;->a(Z)V

    iget-object v5, v1, Lu1/z;->s:Lu1/z$f;

    const/4 v8, 0x0

    if-eqz v5, :cond_7

    invoke-direct/range {p0 .. p0}, Lu1/z;->L()Z

    move-result v5

    if-nez v5, :cond_2

    return v7

    :cond_2
    iget-object v5, v1, Lu1/z;->s:Lu1/z$f;

    iget-object v9, v1, Lu1/z;->t:Lu1/z$f;

    invoke-virtual {v5, v9}, Lu1/z$f;->b(Lu1/z$f;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-direct/range {p0 .. p0}, Lu1/z;->b0()V

    invoke-virtual/range {p0 .. p0}, Lu1/z;->k()Z

    move-result v5

    if-eqz v5, :cond_3

    return v7

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lu1/z;->flush()V

    goto :goto_2

    :cond_4
    iget-object v5, v1, Lu1/z;->s:Lu1/z$f;

    iput-object v5, v1, Lu1/z;->t:Lu1/z$f;

    iput-object v8, v1, Lu1/z;->s:Lu1/z$f;

    iget-object v5, v1, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-static {v5}, Lu1/z;->Z(Landroid/media/AudioTrack;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget v5, v1, Lu1/z;->l:I

    const/4 v9, 0x3

    if-eq v5, v9, :cond_6

    iget-object v5, v1, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v5

    if-ne v5, v9, :cond_5

    iget-object v5, v1, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->setOffloadEndOfStream()V

    :cond_5
    iget-object v5, v1, Lu1/z;->u:Landroid/media/AudioTrack;

    iget-object v9, v1, Lu1/z;->t:Lu1/z$f;

    iget-object v9, v9, Lu1/z$f;->a:Ls1/m1;

    iget v10, v9, Ls1/m1;->O:I

    iget v9, v9, Ls1/m1;->P:I

    invoke-virtual {v5, v10, v9}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    iput-boolean v6, v1, Lu1/z;->b0:Z

    :cond_6
    :goto_2
    invoke-direct {v1, v2, v3}, Lu1/z;->G(J)V

    :cond_7
    invoke-direct/range {p0 .. p0}, Lu1/z;->Y()Z

    move-result v5

    if-nez v5, :cond_9

    :try_start_0
    invoke-direct/range {p0 .. p0}, Lu1/z;->W()Z

    move-result v5
    :try_end_0
    .catch Lu1/t$b; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v5, :cond_9

    return v7

    :catch_0
    move-exception v0

    move-object v2, v0

    iget-boolean v0, v2, Lu1/t$b;->o:Z

    if-nez v0, :cond_8

    iget-object v0, v1, Lu1/z;->n:Lu1/z$j;

    invoke-virtual {v0, v2}, Lu1/z$j;->b(Ljava/lang/Exception;)V

    return v7

    :cond_8
    throw v2

    :cond_9
    iget-object v5, v1, Lu1/z;->n:Lu1/z$j;

    invoke-virtual {v5}, Lu1/z$j;->a()V

    iget-boolean v5, v1, Lu1/z;->H:Z

    const-wide/16 v9, 0x0

    if-eqz v5, :cond_b

    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    iput-wide v11, v1, Lu1/z;->I:J

    iput-boolean v7, v1, Lu1/z;->G:Z

    iput-boolean v7, v1, Lu1/z;->H:Z

    iget-boolean v5, v1, Lu1/z;->k:Z

    if-eqz v5, :cond_a

    sget v5, Lp3/m0;->a:I

    const/16 v11, 0x17

    if-lt v5, v11, :cond_a

    iget-object v5, v1, Lu1/z;->y:Ls1/o2;

    invoke-direct {v1, v5}, Lu1/z;->g0(Ls1/o2;)V

    :cond_a
    invoke-direct {v1, v2, v3}, Lu1/z;->G(J)V

    iget-boolean v5, v1, Lu1/z;->U:Z

    if-eqz v5, :cond_b

    invoke-virtual/range {p0 .. p0}, Lu1/z;->o()V

    :cond_b
    iget-object v5, v1, Lu1/z;->i:Lu1/v;

    invoke-direct/range {p0 .. p0}, Lu1/z;->V()J

    move-result-wide v11

    invoke-virtual {v5, v11, v12}, Lu1/v;->k(J)Z

    move-result v5

    if-nez v5, :cond_c

    return v7

    :cond_c
    iget-object v5, v1, Lu1/z;->M:Ljava/nio/ByteBuffer;

    if-nez v5, :cond_16

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v5

    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v5, v11, :cond_d

    move v5, v6

    goto :goto_3

    :cond_d
    move v5, v7

    :goto_3
    invoke-static {v5}, Lp3/a;->a(Z)V

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v5

    if-nez v5, :cond_e

    return v6

    :cond_e
    iget-object v5, v1, Lu1/z;->t:Lu1/z$f;

    iget v11, v5, Lu1/z$f;->c:I

    if-eqz v11, :cond_f

    iget v11, v1, Lu1/z;->F:I

    if-nez v11, :cond_f

    iget v5, v5, Lu1/z$f;->g:I

    invoke-static {v5, v0}, Lu1/z;->Q(ILjava/nio/ByteBuffer;)I

    move-result v5

    iput v5, v1, Lu1/z;->F:I

    if-nez v5, :cond_f

    return v6

    :cond_f
    iget-object v5, v1, Lu1/z;->w:Lu1/z$i;

    if-eqz v5, :cond_11

    invoke-direct/range {p0 .. p0}, Lu1/z;->L()Z

    move-result v5

    if-nez v5, :cond_10

    return v7

    :cond_10
    invoke-direct {v1, v2, v3}, Lu1/z;->G(J)V

    iput-object v8, v1, Lu1/z;->w:Lu1/z$i;

    :cond_11
    iget-wide v11, v1, Lu1/z;->I:J

    iget-object v5, v1, Lu1/z;->t:Lu1/z$f;

    invoke-direct/range {p0 .. p0}, Lu1/z;->U()J

    move-result-wide v13

    iget-object v15, v1, Lu1/z;->e:Lu1/k0;

    invoke-virtual {v15}, Lu1/k0;->n()J

    move-result-wide v15

    sub-long/2addr v13, v15

    invoke-virtual {v5, v13, v14}, Lu1/z$f;->k(J)J

    move-result-wide v13

    add-long/2addr v11, v13

    iget-boolean v5, v1, Lu1/z;->G:Z

    if-nez v5, :cond_12

    sub-long v13, v11, v2

    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v13

    const-wide/32 v15, 0x30d40

    cmp-long v5, v13, v15

    if-lez v5, :cond_12

    iget-object v5, v1, Lu1/z;->r:Lu1/t$c;

    new-instance v13, Lu1/t$d;

    invoke-direct {v13, v2, v3, v11, v12}, Lu1/t$d;-><init>(JJ)V

    invoke-interface {v5, v13}, Lu1/t$c;->c(Ljava/lang/Exception;)V

    iput-boolean v6, v1, Lu1/z;->G:Z

    :cond_12
    iget-boolean v5, v1, Lu1/z;->G:Z

    if-eqz v5, :cond_14

    invoke-direct/range {p0 .. p0}, Lu1/z;->L()Z

    move-result v5

    if-nez v5, :cond_13

    return v7

    :cond_13
    sub-long v11, v2, v11

    iget-wide v13, v1, Lu1/z;->I:J

    add-long/2addr v13, v11

    iput-wide v13, v1, Lu1/z;->I:J

    iput-boolean v7, v1, Lu1/z;->G:Z

    invoke-direct {v1, v2, v3}, Lu1/z;->G(J)V

    iget-object v5, v1, Lu1/z;->r:Lu1/t$c;

    if-eqz v5, :cond_14

    cmp-long v9, v11, v9

    if-eqz v9, :cond_14

    invoke-interface {v5}, Lu1/t$c;->d()V

    :cond_14
    iget-object v5, v1, Lu1/z;->t:Lu1/z$f;

    iget v5, v5, Lu1/z$f;->c:I

    if-nez v5, :cond_15

    iget-wide v9, v1, Lu1/z;->B:J

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    int-to-long v11, v5

    add-long/2addr v9, v11

    iput-wide v9, v1, Lu1/z;->B:J

    goto :goto_4

    :cond_15
    iget-wide v9, v1, Lu1/z;->C:J

    iget v5, v1, Lu1/z;->F:I

    int-to-long v11, v5

    int-to-long v13, v4

    mul-long/2addr v11, v13

    add-long/2addr v9, v11

    iput-wide v9, v1, Lu1/z;->C:J

    :goto_4
    iput-object v0, v1, Lu1/z;->M:Ljava/nio/ByteBuffer;

    iput v4, v1, Lu1/z;->N:I

    :cond_16
    invoke-direct {v1, v2, v3}, Lu1/z;->c0(J)V

    iget-object v0, v1, Lu1/z;->M:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_17

    iput-object v8, v1, Lu1/z;->M:Ljava/nio/ByteBuffer;

    iput v7, v1, Lu1/z;->N:I

    return v6

    :cond_17
    iget-object v0, v1, Lu1/z;->i:Lu1/v;

    invoke-direct/range {p0 .. p0}, Lu1/z;->V()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lu1/v;->j(J)Z

    move-result v0

    if-eqz v0, :cond_18

    const-string v0, "DefaultAudioSink"

    const-string v2, "Resetting stalled audio track"

    invoke-static {v0, v2}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lu1/z;->flush()V

    return v6

    :cond_18
    return v7
.end method

.method public q(Z)J
    .locals 4

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu1/z;->H:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu1/z;->i:Lu1/v;

    invoke-virtual {v0, p1}, Lu1/v;->d(Z)J

    move-result-wide v0

    iget-object p1, p0, Lu1/z;->t:Lu1/z$f;

    invoke-direct {p0}, Lu1/z;->V()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lu1/z$f;->h(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lu1/z;->H(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lu1/z;->I(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method

.method public r(Lu1/w;)V
    .locals 4

    iget-object v0, p0, Lu1/z;->X:Lu1/w;

    invoke-virtual {v0, p1}, Lu1/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lu1/w;->a:I

    iget v1, p1, Lu1/w;->b:F

    iget-object v2, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lu1/z;->X:Lu1/w;

    iget v3, v3, Lu1/w;->a:I

    if-eq v3, v0, :cond_1

    invoke-virtual {v2, v0}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    :cond_1
    if-eqz v0, :cond_2

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    :cond_2
    iput-object p1, p0, Lu1/z;->X:Lu1/w;

    return-void
.end method

.method public s()V
    .locals 1

    iget-boolean v0, p0, Lu1/z;->Y:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu1/z;->Y:Z

    invoke-virtual {p0}, Lu1/z;->flush()V

    :cond_0
    return-void
.end method

.method public t(Lu1/e;)V
    .locals 1

    iget-object v0, p0, Lu1/z;->v:Lu1/e;

    invoke-virtual {v0, p1}, Lu1/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lu1/z;->v:Lu1/e;

    iget-boolean p1, p0, Lu1/z;->Y:Z

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lu1/z;->flush()V

    return-void
.end method

.method public u()V
    .locals 8

    sget v0, Lp3/m0;->a:I

    const/16 v1, 0x19

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Lu1/z;->flush()V

    return-void

    :cond_0
    iget-object v0, p0, Lu1/z;->o:Lu1/z$j;

    invoke-virtual {v0}, Lu1/z$j;->a()V

    iget-object v0, p0, Lu1/z;->n:Lu1/z$j;

    invoke-virtual {v0}, Lu1/z$j;->a()V

    invoke-direct {p0}, Lu1/z;->Y()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Lu1/z;->e0()V

    iget-object v0, p0, Lu1/z;->i:Lu1/v;

    invoke-virtual {v0}, Lu1/v;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_2
    iget-object v0, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    iget-object v0, p0, Lu1/z;->i:Lu1/v;

    invoke-virtual {v0}, Lu1/v;->q()V

    iget-object v1, p0, Lu1/z;->i:Lu1/v;

    iget-object v2, p0, Lu1/z;->u:Landroid/media/AudioTrack;

    iget-object v0, p0, Lu1/z;->t:Lu1/z$f;

    iget v3, v0, Lu1/z$f;->c:I

    const/4 v4, 0x2

    const/4 v7, 0x1

    if-ne v3, v4, :cond_3

    move v3, v7

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    iget v4, v0, Lu1/z$f;->g:I

    iget v5, v0, Lu1/z$f;->d:I

    iget v6, v0, Lu1/z$f;->h:I

    invoke-virtual/range {v1 .. v6}, Lu1/v;->s(Landroid/media/AudioTrack;ZIII)V

    iput-boolean v7, p0, Lu1/z;->H:Z

    return-void
.end method

.method public v(Z)V
    .locals 1

    invoke-direct {p0}, Lu1/z;->O()Ls1/o2;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lu1/z;->f0(Ls1/o2;Z)V

    return-void
.end method

.method public w()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/z;->G:Z

    return-void
.end method

.method public x(Ls1/m1;)I
    .locals 3

    iget-object v0, p1, Ls1/m1;->y:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_3

    iget v0, p1, Ls1/m1;->N:I

    invoke-static {v0}, Lp3/m0;->s0(I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid PCM encoding: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Ls1/m1;->N:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DefaultAudioSink"

    invoke-static {v0, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iget p1, p1, Ls1/m1;->N:I

    if-eq p1, v2, :cond_2

    iget-boolean v0, p0, Lu1/z;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v2

    :cond_3
    iget-boolean v0, p0, Lu1/z;->a0:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lu1/z;->v:Lu1/e;

    invoke-direct {p0, p1, v0}, Lu1/z;->n0(Ls1/m1;Lu1/e;)Z

    move-result v0

    if-eqz v0, :cond_4

    return v2

    :cond_4
    iget-object v0, p0, Lu1/z;->a:Lu1/f;

    invoke-virtual {v0, p1}, Lu1/f;->h(Ls1/m1;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v1
.end method
