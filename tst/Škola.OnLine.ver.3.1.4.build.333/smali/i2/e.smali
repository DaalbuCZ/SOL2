.class public Li2/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li2/e$c;,
        Li2/e$b;
    }
.end annotation


# static fields
.field public static final c0:Lc2/r;

.field private static final d0:[B

.field private static final e0:[B

.field private static final f0:[B

.field private static final g0:[B

.field private static final h0:Ljava/util/UUID;

.field private static final i0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:J

.field private B:J

.field private C:Lu3/s;

.field private D:Lu3/s;

.field private E:Z

.field private F:Z

.field private G:I

.field private H:J

.field private I:J

.field private J:I

.field private K:I

.field private L:[I

.field private M:I

.field private N:I

.field private O:I

.field private P:I

.field private Q:Z

.field private R:J

.field private S:I

.field private T:I

.field private U:I

.field private V:Z

.field private W:Z

.field private X:Z

.field private Y:I

.field private Z:B

.field private final a:Li2/c;

.field private a0:Z

.field private final b:Li2/g;

.field private b0:Lc2/n;

.field private final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Li2/e$c;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Z

.field private final e:Lu3/a0;

.field private final f:Lu3/a0;

.field private final g:Lu3/a0;

.field private final h:Lu3/a0;

.field private final i:Lu3/a0;

.field private final j:Lu3/a0;

.field private final k:Lu3/a0;

.field private final l:Lu3/a0;

.field private final m:Lu3/a0;

.field private final n:Lu3/a0;

.field private o:Ljava/nio/ByteBuffer;

.field private p:J

.field private q:J

.field private r:J

.field private s:J

.field private t:J

.field private u:Li2/e$c;

.field private v:Z

.field private w:I

.field private x:J

.field private y:Z

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Li2/d;->b:Li2/d;

    sput-object v0, Li2/e;->c0:Lc2/r;

    const/16 v0, 0x20

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Li2/e;->d0:[B

    const-string v1, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    invoke-static {v1}, Lu3/n0;->l0(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Li2/e;->e0:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Li2/e;->f0:[B

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Li2/e;->g0:[B

    new-instance v0, Ljava/util/UUID;

    const-wide v1, 0x100000000001000L

    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sput-object v0, Li2/e;->h0:Ljava/util/UUID;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "htc_video_rotA-000"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x5a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "htc_video_rotA-090"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0xb4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "htc_video_rotA-180"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x10e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "htc_video_rotA-270"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Li2/e;->i0:Ljava/util/Map;

    return-void

    nop

    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li2/e;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    new-instance v0, Li2/a;

    invoke-direct {v0}, Li2/a;-><init>()V

    invoke-direct {p0, v0, p1}, Li2/e;-><init>(Li2/c;I)V

    return-void
.end method

.method constructor <init>(Li2/c;I)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Li2/e;->q:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, p0, Li2/e;->r:J

    iput-wide v2, p0, Li2/e;->s:J

    iput-wide v2, p0, Li2/e;->t:J

    iput-wide v0, p0, Li2/e;->z:J

    iput-wide v0, p0, Li2/e;->A:J

    iput-wide v2, p0, Li2/e;->B:J

    iput-object p1, p0, Li2/e;->a:Li2/c;

    new-instance v0, Li2/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li2/e$b;-><init>(Li2/e;Li2/e$a;)V

    invoke-interface {p1, v0}, Li2/c;->d(Li2/b;)V

    const/4 p1, 0x1

    and-int/2addr p2, p1

    if-nez p2, :cond_0

    move p2, p1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Li2/e;->d:Z

    new-instance p2, Li2/g;

    invoke-direct {p2}, Li2/g;-><init>()V

    iput-object p2, p0, Li2/e;->b:Li2/g;

    new-instance p2, Landroid/util/SparseArray;

    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    iput-object p2, p0, Li2/e;->c:Landroid/util/SparseArray;

    new-instance p2, Lu3/a0;

    const/4 v0, 0x4

    invoke-direct {p2, v0}, Lu3/a0;-><init>(I)V

    iput-object p2, p0, Li2/e;->g:Lu3/a0;

    new-instance p2, Lu3/a0;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-direct {p2, v1}, Lu3/a0;-><init>([B)V

    iput-object p2, p0, Li2/e;->h:Lu3/a0;

    new-instance p2, Lu3/a0;

    invoke-direct {p2, v0}, Lu3/a0;-><init>(I)V

    iput-object p2, p0, Li2/e;->i:Lu3/a0;

    new-instance p2, Lu3/a0;

    sget-object v1, Lu3/w;->a:[B

    invoke-direct {p2, v1}, Lu3/a0;-><init>([B)V

    iput-object p2, p0, Li2/e;->e:Lu3/a0;

    new-instance p2, Lu3/a0;

    invoke-direct {p2, v0}, Lu3/a0;-><init>(I)V

    iput-object p2, p0, Li2/e;->f:Lu3/a0;

    new-instance p2, Lu3/a0;

    invoke-direct {p2}, Lu3/a0;-><init>()V

    iput-object p2, p0, Li2/e;->j:Lu3/a0;

    new-instance p2, Lu3/a0;

    invoke-direct {p2}, Lu3/a0;-><init>()V

    iput-object p2, p0, Li2/e;->k:Lu3/a0;

    new-instance p2, Lu3/a0;

    const/16 v0, 0x8

    invoke-direct {p2, v0}, Lu3/a0;-><init>(I)V

    iput-object p2, p0, Li2/e;->l:Lu3/a0;

    new-instance p2, Lu3/a0;

    invoke-direct {p2}, Lu3/a0;-><init>()V

    iput-object p2, p0, Li2/e;->m:Lu3/a0;

    new-instance p2, Lu3/a0;

    invoke-direct {p2}, Lu3/a0;-><init>()V

    iput-object p2, p0, Li2/e;->n:Lu3/a0;

    new-array p1, p1, [I

    iput-object p1, p0, Li2/e;->L:[I

    return-void
.end method

.method private static synthetic B()[Lc2/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc2/l;

    new-instance v1, Li2/e;

    invoke-direct {v1}, Li2/e;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private C(Lc2/a0;J)Z
    .locals 5

    iget-boolean v0, p0, Li2/e;->y:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iput-wide p2, p0, Li2/e;->A:J

    iget-wide p2, p0, Li2/e;->z:J

    iput-wide p2, p1, Lc2/a0;->a:J

    iput-boolean v2, p0, Li2/e;->y:Z

    return v1

    :cond_0
    iget-boolean p2, p0, Li2/e;->v:Z

    if-eqz p2, :cond_1

    iget-wide p2, p0, Li2/e;->A:J

    const-wide/16 v3, -0x1

    cmp-long v0, p2, v3

    if-eqz v0, :cond_1

    iput-wide p2, p1, Lc2/a0;->a:J

    iput-wide v3, p0, Li2/e;->A:J

    return v1

    :cond_1
    return v2
.end method

.method private D(Lc2/m;I)V
    .locals 3

    iget-object v0, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->g()I

    move-result v0

    if-lt v0, p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->b()I

    move-result v0

    if-ge v0, p2, :cond_1

    iget-object v0, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->b()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lu3/a0;->c(I)V

    :cond_1
    iget-object v0, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->g()I

    move-result v1

    iget-object v2, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v2}, Lu3/a0;->g()I

    move-result v2

    sub-int v2, p2, v2

    invoke-interface {p1, v0, v1, v2}, Lc2/m;->readFully([BII)V

    iget-object p1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {p1, p2}, Lu3/a0;->Q(I)V

    return-void
.end method

.method private E()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Li2/e;->S:I

    iput v0, p0, Li2/e;->T:I

    iput v0, p0, Li2/e;->U:I

    iput-boolean v0, p0, Li2/e;->V:Z

    iput-boolean v0, p0, Li2/e;->W:Z

    iput-boolean v0, p0, Li2/e;->X:Z

    iput v0, p0, Li2/e;->Y:I

    iput-byte v0, p0, Li2/e;->Z:B

    iput-boolean v0, p0, Li2/e;->a0:Z

    iget-object v1, p0, Li2/e;->j:Lu3/a0;

    invoke-virtual {v1, v0}, Lu3/a0;->N(I)V

    return-void
.end method

.method private F(J)J
    .locals 6

    iget-wide v2, p0, Li2/e;->r:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    const-wide/16 v4, 0x3e8

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, Lu3/n0;->N0(JJJ)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const/4 p1, 0x0

    const-string p2, "Can\'t scale timecode prior to timecodeScale being set."

    invoke-static {p2, p1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1
.end method

.method private static G(Ljava/lang/String;J[B)V
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "S_TEXT/UTF8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "S_TEXT/WEBVTT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "S_TEXT/ASS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    const-wide/16 v3, 0x3e8

    packed-switch v2, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :pswitch_0
    const-string p0, "%02d:%02d:%02d,%03d"

    invoke-static {p1, p2, p0, v3, v4}, Li2/e;->t(JLjava/lang/String;J)[B

    move-result-object p0

    const/16 p1, 0x13

    goto :goto_1

    :pswitch_1
    const-string p0, "%02d:%02d:%02d.%03d"

    invoke-static {p1, p2, p0, v3, v4}, Li2/e;->t(JLjava/lang/String;J)[B

    move-result-object p0

    const/16 p1, 0x19

    goto :goto_1

    :pswitch_2
    const-wide/16 v2, 0x2710

    const-string p0, "%01d:%02d:%02d:%02d"

    invoke-static {p1, p2, p0, v2, v3}, Li2/e;->t(JLjava/lang/String;J)[B

    move-result-object p0

    const/16 p1, 0x15

    :goto_1
    array-length p2, p0

    invoke-static {p0, v1, p3, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private J(Lc2/m;Li2/e$c;IZ)I
    .locals 10
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "#2.output"
        }
    .end annotation

    iget-object v0, p2, Li2/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/UTF8"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Li2/e;->d0:[B

    invoke-direct {p0, p1, p2, p3}, Li2/e;->K(Lc2/m;[BI)V

    :goto_0
    invoke-direct {p0}, Li2/e;->r()I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p2, Li2/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/ASS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, Li2/e;->f0:[B

    invoke-direct {p0, p1, p2, p3}, Li2/e;->K(Lc2/m;[BI)V

    goto :goto_0

    :cond_1
    iget-object v0, p2, Li2/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/WEBVTT"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Li2/e;->g0:[B

    invoke-direct {p0, p1, p2, p3}, Li2/e;->K(Lc2/m;[BI)V

    goto :goto_0

    :cond_2
    iget-object v0, p2, Li2/e$c;->X:Lc2/e0;

    iget-boolean v1, p0, Li2/e;->V:Z

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v1, :cond_12

    iget-boolean v1, p2, Li2/e$c;->h:Z

    if-eqz v1, :cond_f

    iget v1, p0, Li2/e;->O:I

    const v6, -0x40000001    # -1.9999999f

    and-int/2addr v1, v6

    iput v1, p0, Li2/e;->O:I

    iget-boolean v1, p0, Li2/e;->W:Z

    const/16 v6, 0x80

    if-nez v1, :cond_4

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    invoke-interface {p1, v1, v5, v4}, Lc2/m;->readFully([BII)V

    iget v1, p0, Li2/e;->S:I

    add-int/2addr v1, v4

    iput v1, p0, Li2/e;->S:I

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    aget-byte v1, v1, v5

    and-int/2addr v1, v6

    if-eq v1, v6, :cond_3

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    aget-byte v1, v1, v5

    iput-byte v1, p0, Li2/e;->Z:B

    iput-boolean v4, p0, Li2/e;->W:Z

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    const-string p2, "Extension bit is set in signal byte"

    invoke-static {p2, p1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_4
    :goto_1
    iget-byte v1, p0, Li2/e;->Z:B

    and-int/lit8 v7, v1, 0x1

    if-ne v7, v4, :cond_5

    move v7, v4

    goto :goto_2

    :cond_5
    move v7, v5

    :goto_2
    if-eqz v7, :cond_10

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_6

    move v1, v4

    goto :goto_3

    :cond_6
    move v1, v5

    :goto_3
    iget v7, p0, Li2/e;->O:I

    const/high16 v8, 0x40000000    # 2.0f

    or-int/2addr v7, v8

    iput v7, p0, Li2/e;->O:I

    iget-boolean v7, p0, Li2/e;->a0:Z

    if-nez v7, :cond_8

    iget-object v7, p0, Li2/e;->l:Lu3/a0;

    invoke-virtual {v7}, Lu3/a0;->e()[B

    move-result-object v7

    const/16 v8, 0x8

    invoke-interface {p1, v7, v5, v8}, Lc2/m;->readFully([BII)V

    iget v7, p0, Li2/e;->S:I

    add-int/2addr v7, v8

    iput v7, p0, Li2/e;->S:I

    iput-boolean v4, p0, Li2/e;->a0:Z

    iget-object v7, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v7}, Lu3/a0;->e()[B

    move-result-object v7

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    move v6, v5

    :goto_4
    or-int/2addr v6, v8

    int-to-byte v6, v6

    aput-byte v6, v7, v5

    iget-object v6, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v6, v5}, Lu3/a0;->R(I)V

    iget-object v6, p0, Li2/e;->g:Lu3/a0;

    invoke-interface {v0, v6, v4, v4}, Lc2/e0;->f(Lu3/a0;II)V

    iget v6, p0, Li2/e;->T:I

    add-int/2addr v6, v4

    iput v6, p0, Li2/e;->T:I

    iget-object v6, p0, Li2/e;->l:Lu3/a0;

    invoke-virtual {v6, v5}, Lu3/a0;->R(I)V

    iget-object v6, p0, Li2/e;->l:Lu3/a0;

    invoke-interface {v0, v6, v8, v4}, Lc2/e0;->f(Lu3/a0;II)V

    iget v6, p0, Li2/e;->T:I

    add-int/2addr v6, v8

    iput v6, p0, Li2/e;->T:I

    :cond_8
    if-eqz v1, :cond_10

    iget-boolean v1, p0, Li2/e;->X:Z

    if-nez v1, :cond_9

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    invoke-interface {p1, v1, v5, v4}, Lc2/m;->readFully([BII)V

    iget v1, p0, Li2/e;->S:I

    add-int/2addr v1, v4

    iput v1, p0, Li2/e;->S:I

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1, v5}, Lu3/a0;->R(I)V

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->E()I

    move-result v1

    iput v1, p0, Li2/e;->Y:I

    iput-boolean v4, p0, Li2/e;->X:Z

    :cond_9
    iget v1, p0, Li2/e;->Y:I

    mul-int/2addr v1, v2

    iget-object v6, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v6, v1}, Lu3/a0;->N(I)V

    iget-object v6, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v6}, Lu3/a0;->e()[B

    move-result-object v6

    invoke-interface {p1, v6, v5, v1}, Lc2/m;->readFully([BII)V

    iget v6, p0, Li2/e;->S:I

    add-int/2addr v6, v1

    iput v6, p0, Li2/e;->S:I

    iget v1, p0, Li2/e;->Y:I

    div-int/2addr v1, v3

    add-int/2addr v1, v4

    int-to-short v1, v1

    mul-int/lit8 v6, v1, 0x6

    add-int/2addr v6, v3

    iget-object v7, p0, Li2/e;->o:Ljava/nio/ByteBuffer;

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v7

    if-ge v7, v6, :cond_b

    :cond_a
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    iput-object v7, p0, Li2/e;->o:Ljava/nio/ByteBuffer;

    :cond_b
    iget-object v7, p0, Li2/e;->o:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v7, p0, Li2/e;->o:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move v1, v5

    move v7, v1

    :goto_5
    iget v8, p0, Li2/e;->Y:I

    if-ge v1, v8, :cond_d

    iget-object v8, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v8}, Lu3/a0;->I()I

    move-result v8

    rem-int/lit8 v9, v1, 0x2

    if-nez v9, :cond_c

    iget-object v9, p0, Li2/e;->o:Ljava/nio/ByteBuffer;

    sub-int v7, v8, v7

    int-to-short v7, v7

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_6

    :cond_c
    iget-object v9, p0, Li2/e;->o:Ljava/nio/ByteBuffer;

    sub-int v7, v8, v7

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :goto_6
    add-int/lit8 v1, v1, 0x1

    move v7, v8

    goto :goto_5

    :cond_d
    iget v1, p0, Li2/e;->S:I

    sub-int v1, p3, v1

    sub-int/2addr v1, v7

    rem-int/2addr v8, v3

    iget-object v7, p0, Li2/e;->o:Ljava/nio/ByteBuffer;

    if-ne v8, v4, :cond_e

    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_7

    :cond_e
    int-to-short v1, v1

    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Li2/e;->o:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :goto_7
    iget-object v1, p0, Li2/e;->m:Lu3/a0;

    iget-object v7, p0, Li2/e;->o:Ljava/nio/ByteBuffer;

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    invoke-virtual {v1, v7, v6}, Lu3/a0;->P([BI)V

    iget-object v1, p0, Li2/e;->m:Lu3/a0;

    invoke-interface {v0, v1, v6, v4}, Lc2/e0;->f(Lu3/a0;II)V

    iget v1, p0, Li2/e;->T:I

    add-int/2addr v1, v6

    iput v1, p0, Li2/e;->T:I

    goto :goto_8

    :cond_f
    iget-object v1, p2, Li2/e$c;->i:[B

    if-eqz v1, :cond_10

    iget-object v6, p0, Li2/e;->j:Lu3/a0;

    array-length v7, v1

    invoke-virtual {v6, v1, v7}, Lu3/a0;->P([BI)V

    :cond_10
    :goto_8
    invoke-static {p2, p4}, Li2/e$c;->e(Li2/e$c;Z)Z

    move-result p4

    if-eqz p4, :cond_11

    iget p4, p0, Li2/e;->O:I

    const/high16 v1, 0x10000000

    or-int/2addr p4, v1

    iput p4, p0, Li2/e;->O:I

    iget-object p4, p0, Li2/e;->n:Lu3/a0;

    invoke-virtual {p4, v5}, Lu3/a0;->N(I)V

    iget-object p4, p0, Li2/e;->j:Lu3/a0;

    invoke-virtual {p4}, Lu3/a0;->g()I

    move-result p4

    add-int/2addr p4, p3

    iget v1, p0, Li2/e;->S:I

    sub-int/2addr p4, v1

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1, v2}, Lu3/a0;->N(I)V

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    shr-int/lit8 v6, p4, 0x18

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    shr-int/lit8 v6, p4, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v1, v4

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    shr-int/lit8 v6, p4, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v1, v3

    iget-object v1, p0, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    const/4 v6, 0x3

    and-int/lit16 p4, p4, 0xff

    int-to-byte p4, p4

    aput-byte p4, v1, v6

    iget-object p4, p0, Li2/e;->g:Lu3/a0;

    invoke-interface {v0, p4, v2, v3}, Lc2/e0;->f(Lu3/a0;II)V

    iget p4, p0, Li2/e;->T:I

    add-int/2addr p4, v2

    iput p4, p0, Li2/e;->T:I

    :cond_11
    iput-boolean v4, p0, Li2/e;->V:Z

    :cond_12
    iget-object p4, p0, Li2/e;->j:Lu3/a0;

    invoke-virtual {p4}, Lu3/a0;->g()I

    move-result p4

    add-int/2addr p3, p4

    iget-object p4, p2, Li2/e$c;->b:Ljava/lang/String;

    const-string v1, "V_MPEG4/ISO/AVC"

    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_16

    iget-object p4, p2, Li2/e$c;->b:Ljava/lang/String;

    const-string v1, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_13

    goto :goto_b

    :cond_13
    iget-object p4, p2, Li2/e$c;->T:Lc2/f0;

    if-eqz p4, :cond_15

    iget-object p4, p0, Li2/e;->j:Lu3/a0;

    invoke-virtual {p4}, Lu3/a0;->g()I

    move-result p4

    if-nez p4, :cond_14

    goto :goto_9

    :cond_14
    move v4, v5

    :goto_9
    invoke-static {v4}, Lu3/a;->f(Z)V

    iget-object p4, p2, Li2/e$c;->T:Lc2/f0;

    invoke-virtual {p4, p1}, Lc2/f0;->d(Lc2/m;)V

    :cond_15
    :goto_a
    iget p4, p0, Li2/e;->S:I

    if-ge p4, p3, :cond_18

    sub-int p4, p3, p4

    invoke-direct {p0, p1, v0, p4}, Li2/e;->L(Lc2/m;Lc2/e0;I)I

    move-result p4

    iget v1, p0, Li2/e;->S:I

    add-int/2addr v1, p4

    iput v1, p0, Li2/e;->S:I

    iget v1, p0, Li2/e;->T:I

    add-int/2addr v1, p4

    iput v1, p0, Li2/e;->T:I

    goto :goto_a

    :cond_16
    :goto_b
    iget-object p4, p0, Li2/e;->f:Lu3/a0;

    invoke-virtual {p4}, Lu3/a0;->e()[B

    move-result-object p4

    aput-byte v5, p4, v5

    aput-byte v5, p4, v4

    aput-byte v5, p4, v3

    iget v1, p2, Li2/e$c;->Y:I

    rsub-int/lit8 v3, v1, 0x4

    :goto_c
    iget v4, p0, Li2/e;->S:I

    if-ge v4, p3, :cond_18

    iget v4, p0, Li2/e;->U:I

    if-nez v4, :cond_17

    invoke-direct {p0, p1, p4, v3, v1}, Li2/e;->M(Lc2/m;[BII)V

    iget v4, p0, Li2/e;->S:I

    add-int/2addr v4, v1

    iput v4, p0, Li2/e;->S:I

    iget-object v4, p0, Li2/e;->f:Lu3/a0;

    invoke-virtual {v4, v5}, Lu3/a0;->R(I)V

    iget-object v4, p0, Li2/e;->f:Lu3/a0;

    invoke-virtual {v4}, Lu3/a0;->I()I

    move-result v4

    iput v4, p0, Li2/e;->U:I

    iget-object v4, p0, Li2/e;->e:Lu3/a0;

    invoke-virtual {v4, v5}, Lu3/a0;->R(I)V

    iget-object v4, p0, Li2/e;->e:Lu3/a0;

    invoke-interface {v0, v4, v2}, Lc2/e0;->b(Lu3/a0;I)V

    iget v4, p0, Li2/e;->T:I

    add-int/2addr v4, v2

    iput v4, p0, Li2/e;->T:I

    goto :goto_c

    :cond_17
    invoke-direct {p0, p1, v0, v4}, Li2/e;->L(Lc2/m;Lc2/e0;I)I

    move-result v4

    iget v6, p0, Li2/e;->S:I

    add-int/2addr v6, v4

    iput v6, p0, Li2/e;->S:I

    iget v6, p0, Li2/e;->T:I

    add-int/2addr v6, v4

    iput v6, p0, Li2/e;->T:I

    iget v6, p0, Li2/e;->U:I

    sub-int/2addr v6, v4

    iput v6, p0, Li2/e;->U:I

    goto :goto_c

    :cond_18
    iget-object p1, p2, Li2/e$c;->b:Ljava/lang/String;

    const-string p2, "A_VORBIS"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    iget-object p1, p0, Li2/e;->h:Lu3/a0;

    invoke-virtual {p1, v5}, Lu3/a0;->R(I)V

    iget-object p1, p0, Li2/e;->h:Lu3/a0;

    invoke-interface {v0, p1, v2}, Lc2/e0;->b(Lu3/a0;I)V

    iget p1, p0, Li2/e;->T:I

    add-int/2addr p1, v2

    iput p1, p0, Li2/e;->T:I

    :cond_19
    invoke-direct {p0}, Li2/e;->r()I

    move-result p1

    return p1
.end method

.method private K(Lc2/m;[BI)V
    .locals 4

    array-length v0, p2

    add-int/2addr v0, p3

    iget-object v1, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->b()I

    move-result v1

    const/4 v2, 0x0

    if-ge v1, v0, :cond_0

    iget-object v1, p0, Li2/e;->k:Lu3/a0;

    add-int v3, v0, p3

    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lu3/a0;->O([B)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    array-length v3, p2

    invoke-static {p2, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    iget-object v1, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    array-length p2, p2

    invoke-interface {p1, v1, p2, p3}, Lc2/m;->readFully([BII)V

    iget-object p1, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {p1, v2}, Lu3/a0;->R(I)V

    iget-object p1, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {p1, v0}, Lu3/a0;->Q(I)V

    return-void
.end method

.method private L(Lc2/m;Lc2/e0;I)I
    .locals 1

    iget-object v0, p0, Li2/e;->j:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->a()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget-object p3, p0, Li2/e;->j:Lu3/a0;

    invoke-interface {p2, p3, p1}, Lc2/e0;->b(Lu3/a0;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p2, p1, p3, v0}, Lc2/e0;->d(Lt3/i;IZ)I

    move-result p1

    :goto_0
    return p1
.end method

.method private M(Lc2/m;[BII)V
    .locals 2

    iget-object v0, p0, Li2/e;->j:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->a()I

    move-result v0

    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int v1, p3, v0

    sub-int/2addr p4, v0

    invoke-interface {p1, p2, v1, p4}, Lc2/m;->readFully([BII)V

    if-lez v0, :cond_0

    iget-object p1, p0, Li2/e;->j:Lu3/a0;

    invoke-virtual {p1, p2, p3, v0}, Lu3/a0;->j([BII)V

    :cond_0
    return-void
.end method

.method public static synthetic d()[Lc2/l;
    .locals 1

    invoke-static {}, Li2/e;->B()[Lc2/l;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e()[B
    .locals 1

    sget-object v0, Li2/e;->e0:[B

    return-object v0
.end method

.method static synthetic f()Ljava/util/Map;
    .locals 1

    sget-object v0, Li2/e;->i0:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic h()Ljava/util/UUID;
    .locals 1

    sget-object v0, Li2/e;->h0:Ljava/util/UUID;

    return-object v0
.end method

.method private i(I)V
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "cueTimesUs",
            "cueClusterPositions"
        }
    .end annotation

    iget-object v0, p0, Li2/e;->C:Lu3/s;

    if-eqz v0, :cond_0

    iget-object v0, p0, Li2/e;->D:Lu3/s;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Element "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in a Cues"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1
.end method

.method private k(I)V
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "currentTrack"
        }
    .end annotation

    iget-object v0, p0, Li2/e;->u:Li2/e$c;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Element "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in a TrackEntry"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1
.end method

.method private l()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "extractorOutput"
        }
    .end annotation

    iget-object v0, p0, Li2/e;->b0:Lc2/n;

    invoke-static {v0}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private n(Lu3/s;Lu3/s;)Lc2/b0;
    .locals 11

    iget-wide v0, p0, Li2/e;->q:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_4

    iget-wide v0, p0, Li2/e;->t:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lu3/s;->c()I

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lu3/s;->c()I

    move-result v0

    invoke-virtual {p1}, Lu3/s;->c()I

    move-result v1

    if-eq v0, v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Lu3/s;->c()I

    move-result v0

    new-array v1, v0, [I

    new-array v2, v0, [J

    new-array v3, v0, [J

    new-array v4, v0, [J

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v0, :cond_1

    invoke-virtual {p1, v6}, Lu3/s;->b(I)J

    move-result-wide v7

    aput-wide v7, v4, v6

    iget-wide v7, p0, Li2/e;->q:J

    invoke-virtual {p2, v6}, Lu3/s;->b(I)J

    move-result-wide v9

    add-long/2addr v7, v9

    aput-wide v7, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/lit8 p1, v0, -0x1

    if-ge v5, p1, :cond_2

    add-int/lit8 p1, v5, 0x1

    aget-wide v6, v2, p1

    aget-wide v8, v2, v5

    sub-long/2addr v6, v8

    long-to-int p2, v6

    aput p2, v1, v5

    aget-wide v6, v4, p1

    aget-wide v8, v4, v5

    sub-long/2addr v6, v8

    aput-wide v6, v3, v5

    move v5, p1

    goto :goto_1

    :cond_2
    iget-wide v5, p0, Li2/e;->q:J

    iget-wide v7, p0, Li2/e;->p:J

    add-long/2addr v5, v7

    aget-wide v7, v2, p1

    sub-long/2addr v5, v7

    long-to-int p2, v5

    aput p2, v1, p1

    iget-wide v5, p0, Li2/e;->t:J

    aget-wide v7, v4, p1

    sub-long/2addr v5, v7

    aput-wide v5, v3, p1

    aget-wide v5, v3, p1

    const-wide/16 v7, 0x0

    cmp-long p2, v5, v7

    if-gtz p2, :cond_3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Discarding last cue point with unexpected duration: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "MatroskaExtractor"

    invoke-static {v0, p2}, Lu3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    invoke-static {v2, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    invoke-static {v3, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    invoke-static {v4, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    :cond_3
    new-instance p1, Lc2/d;

    invoke-direct {p1, v1, v2, v3, v4}, Lc2/d;-><init>([I[J[J[J)V

    return-object p1

    :cond_4
    :goto_2
    new-instance p1, Lc2/b0$b;

    iget-wide v0, p0, Li2/e;->t:J

    invoke-direct {p1, v0, v1}, Lc2/b0$b;-><init>(J)V

    return-object p1
.end method

.method private o(Li2/e$c;JIII)V
    .locals 9
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "#1.output"
        }
    .end annotation

    iget-object v0, p1, Li2/e$c;->T:Lc2/f0;

    const/4 v8, 0x1

    if-eqz v0, :cond_0

    iget-object v1, p1, Li2/e$c;->X:Lc2/e0;

    iget-object v7, p1, Li2/e$c;->j:Lc2/e0$a;

    move-wide v2, p2

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v7}, Lc2/f0;->c(Lc2/e0;JIIILc2/e0$a;)V

    goto/16 :goto_5

    :cond_0
    iget-object v0, p1, Li2/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/UTF8"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Li2/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/ASS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Li2/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/WEBVTT"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_1
    iget v0, p0, Li2/e;->K:I

    const-string v1, "MatroskaExtractor"

    if-le v0, v8, :cond_2

    const-string v0, "Skipping subtitle sample in laced block."

    :goto_0
    invoke-static {v1, v0}, Lu3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    iget-wide v2, p0, Li2/e;->I:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-nez v0, :cond_3

    const-string v0, "Skipping subtitle sample with no duration."

    goto :goto_0

    :cond_3
    iget-object v0, p1, Li2/e$c;->b:Ljava/lang/String;

    iget-object v1, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    invoke-static {v0, v2, v3, v1}, Li2/e;->G(Ljava/lang/String;J[B)V

    iget-object v0, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->f()I

    move-result v0

    :goto_1
    iget-object v1, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->g()I

    move-result v1

    if-ge v0, v1, :cond_5

    iget-object v1, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    aget-byte v1, v1, v0

    if-nez v1, :cond_4

    iget-object v1, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {v1, v0}, Lu3/a0;->Q(I)V

    goto :goto_2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    iget-object v0, p1, Li2/e$c;->X:Lc2/e0;

    iget-object v1, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->g()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lc2/e0;->b(Lu3/a0;I)V

    iget-object v0, p0, Li2/e;->k:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->g()I

    move-result v0

    add-int/2addr p5, v0

    :cond_6
    :goto_3
    const/high16 v0, 0x10000000

    and-int/2addr v0, p4

    if-eqz v0, :cond_8

    iget v0, p0, Li2/e;->K:I

    if-le v0, v8, :cond_7

    iget-object v0, p0, Li2/e;->n:Lu3/a0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lu3/a0;->N(I)V

    goto :goto_4

    :cond_7
    iget-object v0, p0, Li2/e;->n:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->g()I

    move-result v0

    iget-object v1, p1, Li2/e$c;->X:Lc2/e0;

    iget-object v2, p0, Li2/e;->n:Lu3/a0;

    const/4 v3, 0x2

    invoke-interface {v1, v2, v0, v3}, Lc2/e0;->f(Lu3/a0;II)V

    add-int/2addr p5, v0

    :cond_8
    :goto_4
    move v4, p5

    iget-object v0, p1, Li2/e$c;->X:Lc2/e0;

    iget-object v6, p1, Li2/e$c;->j:Lc2/e0$a;

    move-wide v1, p2

    move v3, p4

    move v5, p6

    invoke-interface/range {v0 .. v6}, Lc2/e0;->e(JIIILc2/e0$a;)V

    :goto_5
    iput-boolean v8, p0, Li2/e;->F:Z

    return-void
.end method

.method private static q([II)[I
    .locals 1

    if-nez p0, :cond_0

    new-array p0, p1, [I

    return-object p0

    :cond_0
    array-length v0, p0

    if-lt v0, p1, :cond_1

    return-object p0

    :cond_1
    array-length p0, p0

    mul-int/lit8 p0, p0, 0x2

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    new-array p0, p0, [I

    return-object p0
.end method

.method private r()I
    .locals 1

    iget v0, p0, Li2/e;->T:I

    invoke-direct {p0}, Li2/e;->E()V

    return v0
.end method

.method private static t(JLjava/lang/String;J)[B
    .locals 11

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p0, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lu3/a;->a(Z)V

    const-wide v3, 0xd693a400L

    div-long v3, p0, v3

    long-to-int v0, v3

    int-to-long v3, v0

    const-wide/16 v5, 0xe10

    mul-long/2addr v3, v5

    const-wide/32 v5, 0xf4240

    mul-long/2addr v3, v5

    sub-long/2addr p0, v3

    const-wide/32 v3, 0x3938700

    div-long v3, p0, v3

    long-to-int v3, v3

    int-to-long v7, v3

    const-wide/16 v9, 0x3c

    mul-long/2addr v7, v9

    mul-long/2addr v7, v5

    sub-long/2addr p0, v7

    div-long v7, p0, v5

    long-to-int v4, v7

    int-to-long v7, v4

    mul-long/2addr v7, v5

    sub-long/2addr p0, v7

    div-long/2addr p0, p3

    long-to-int p0, p0

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 p3, 0x4

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, p3, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, p3, v1

    const/4 p4, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p3, p4

    const/4 p4, 0x3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, p3, p4

    invoke-static {p1, p2, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lu3/n0;->l0(Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method private static z(Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "A_OPUS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x20

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "A_FLAC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x1f

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "A_EAC3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x1e

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "V_MPEG2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x1d

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "S_TEXT/UTF8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0x1c

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "S_TEXT/WEBVTT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0x1b

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "V_MPEGH/ISO/HEVC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0x1a

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "S_TEXT/ASS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0x19

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "A_PCM/INT/LIT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0x18

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "A_PCM/INT/BIG"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0x17

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "A_PCM/FLOAT/IEEE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0x16

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "A_DTS/EXPRESS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0x15

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "V_THEORA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0x14

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "S_HDMV/PGS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v3, 0x13

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "V_VP9"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "V_VP8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "V_AV1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "A_DTS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "A_AC3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "A_AAC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_14
    const-string v0, "A_DTS/LOSSLESS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "S_VOBSUB"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_16
    const-string v0, "V_MPEG4/ISO/AVC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_17
    const-string v0, "V_MPEG4/ISO/ASP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_18
    const-string v0, "S_DVBSUB"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_19
    const-string v0, "V_MS/VFW/FOURCC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto :goto_0

    :cond_19
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_1a
    const-string v0, "A_MPEG/L3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    goto :goto_0

    :cond_1a
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_1b
    const-string v0, "A_MPEG/L2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1b

    goto :goto_0

    :cond_1b
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_1c
    const-string v0, "A_VORBIS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    goto :goto_0

    :cond_1c
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_1d
    const-string v0, "A_TRUEHD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1d

    goto :goto_0

    :cond_1d
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1e
    const-string v0, "A_MS/ACM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    goto :goto_0

    :cond_1e
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_1f
    const-string v0, "V_MPEG4/ISO/SP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1f

    goto :goto_0

    :cond_1f
    move v3, v1

    goto :goto_0

    :sswitch_20
    const-string v0, "V_MPEG4/ISO/AP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    goto :goto_0

    :cond_20
    move v3, v2

    :goto_0
    packed-switch v3, :pswitch_data_0

    return v2

    :pswitch_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_20
        -0x7ce7f3b0 -> :sswitch_1f
        -0x76567dc0 -> :sswitch_1e
        -0x6a615338 -> :sswitch_1d
        -0x672350af -> :sswitch_1c
        -0x585f4fce -> :sswitch_1b
        -0x585f4fcd -> :sswitch_1a
        -0x51dc40b2 -> :sswitch_19
        -0x37a9c464 -> :sswitch_18
        -0x2016c535 -> :sswitch_17
        -0x2016c4e5 -> :sswitch_16
        -0x19552dbd -> :sswitch_15
        -0x1538b2ba -> :sswitch_14
        0x3c02325 -> :sswitch_13
        0x3c02353 -> :sswitch_12
        0x3c030c5 -> :sswitch_11
        0x4e81333 -> :sswitch_10
        0x4e86155 -> :sswitch_f
        0x4e86156 -> :sswitch_e
        0x5e8da3e -> :sswitch_d
        0x1a8350d6 -> :sswitch_c
        0x2056f406 -> :sswitch_b
        0x25e26ee2 -> :sswitch_a
        0x2b45174d -> :sswitch_9
        0x2b453ce4 -> :sswitch_8
        0x2c0618eb -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected A(I)Z
    .locals 1

    const v0, 0x1549a966

    if-eq p1, v0, :cond_1

    const v0, 0x1f43b675

    if-eq p1, v0, :cond_1

    const v0, 0x1c53bb6b

    if-eq p1, v0, :cond_1

    const v0, 0x1654ae6b

    if-ne p1, v0, :cond_0

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

.method protected H(IJJ)V
    .locals 5

    invoke-direct {p0}, Li2/e;->l()V

    const/16 v0, 0xa0

    const/4 v1, 0x0

    if-eq p1, v0, :cond_b

    const/16 v0, 0xae

    if-eq p1, v0, :cond_a

    const/16 v0, 0xbb

    if-eq p1, v0, :cond_9

    const/16 v0, 0x4dbb

    const-wide/16 v1, -0x1

    if-eq p1, v0, :cond_8

    const/16 v0, 0x5035

    const/4 v3, 0x1

    if-eq p1, v0, :cond_7

    const/16 v0, 0x55d0

    if-eq p1, v0, :cond_6

    const v0, 0x18538067

    if-eq p1, v0, :cond_3

    const p2, 0x1c53bb6b

    if-eq p1, p2, :cond_2

    const p2, 0x1f43b675

    if-eq p1, p2, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-boolean p1, p0, Li2/e;->v:Z

    if-nez p1, :cond_c

    iget-boolean p1, p0, Li2/e;->d:Z

    if-eqz p1, :cond_1

    iget-wide p1, p0, Li2/e;->z:J

    cmp-long p1, p1, v1

    if-eqz p1, :cond_1

    iput-boolean v3, p0, Li2/e;->y:Z

    goto :goto_1

    :cond_1
    iget-object p1, p0, Li2/e;->b0:Lc2/n;

    new-instance p2, Lc2/b0$b;

    iget-wide p3, p0, Li2/e;->t:J

    invoke-direct {p2, p3, p4}, Lc2/b0$b;-><init>(J)V

    invoke-interface {p1, p2}, Lc2/n;->p(Lc2/b0;)V

    iput-boolean v3, p0, Li2/e;->v:Z

    goto :goto_1

    :cond_2
    new-instance p1, Lu3/s;

    invoke-direct {p1}, Lu3/s;-><init>()V

    iput-object p1, p0, Li2/e;->C:Lu3/s;

    new-instance p1, Lu3/s;

    invoke-direct {p1}, Lu3/s;-><init>()V

    iput-object p1, p0, Li2/e;->D:Lu3/s;

    goto :goto_1

    :cond_3
    iget-wide v3, p0, Li2/e;->q:J

    cmp-long p1, v3, v1

    if-eqz p1, :cond_5

    cmp-long p1, v3, p2

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    const-string p2, "Multiple Segment elements not supported"

    invoke-static {p2, p1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_5
    :goto_0
    iput-wide p2, p0, Li2/e;->q:J

    iput-wide p4, p0, Li2/e;->p:J

    goto :goto_1

    :cond_6
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    iput-boolean v3, p1, Li2/e$c;->x:Z

    goto :goto_1

    :cond_7
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    iput-boolean v3, p1, Li2/e$c;->h:Z

    goto :goto_1

    :cond_8
    const/4 p1, -0x1

    iput p1, p0, Li2/e;->w:I

    iput-wide v1, p0, Li2/e;->x:J

    goto :goto_1

    :cond_9
    iput-boolean v1, p0, Li2/e;->E:Z

    goto :goto_1

    :cond_a
    new-instance p1, Li2/e$c;

    invoke-direct {p1}, Li2/e$c;-><init>()V

    iput-object p1, p0, Li2/e;->u:Li2/e$c;

    goto :goto_1

    :cond_b
    iput-boolean v1, p0, Li2/e;->Q:Z

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Li2/e;->R:J

    :cond_c
    :goto_1
    return-void
.end method

.method protected I(ILjava/lang/String;)V
    .locals 1

    const/16 v0, 0x86

    if-eq p1, v0, :cond_4

    const/16 v0, 0x4282

    if-eq p1, v0, :cond_2

    const/16 v0, 0x536e

    if-eq p1, v0, :cond_1

    const v0, 0x22b59c

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    invoke-static {p1, p2}, Li2/e$c;->d(Li2/e$c;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    iput-object p2, p1, Li2/e$c;->a:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string p1, "webm"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "matroska"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DocType "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " not supported"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_4
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    iput-object p2, p1, Li2/e$c;->b:Ljava/lang/String;

    :cond_5
    :goto_0
    return-void
.end method

.method public final a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Li2/e;->B:J

    const/4 p1, 0x0

    iput p1, p0, Li2/e;->G:I

    iget-object p2, p0, Li2/e;->a:Li2/c;

    invoke-interface {p2}, Li2/c;->c()V

    iget-object p2, p0, Li2/e;->b:Li2/g;

    invoke-virtual {p2}, Li2/g;->e()V

    invoke-direct {p0}, Li2/e;->E()V

    :goto_0
    iget-object p2, p0, Li2/e;->c:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result p2

    if-ge p1, p2, :cond_0

    iget-object p2, p0, Li2/e;->c:Landroid/util/SparseArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li2/e$c;

    invoke-virtual {p2}, Li2/e$c;->n()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(Lc2/n;)V
    .locals 0

    iput-object p1, p0, Li2/e;->b0:Lc2/n;

    return-void
.end method

.method public final g(Lc2/m;Lc2/a0;)I
    .locals 5

    const/4 v0, 0x0

    iput-boolean v0, p0, Li2/e;->F:Z

    const/4 v1, 0x1

    move v2, v1

    :cond_0
    if-eqz v2, :cond_1

    iget-boolean v3, p0, Li2/e;->F:Z

    if-nez v3, :cond_1

    iget-object v2, p0, Li2/e;->a:Li2/c;

    invoke-interface {v2, p1}, Li2/c;->b(Lc2/m;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v3

    invoke-direct {p0, p2, v3, v4}, Li2/e;->C(Lc2/a0;J)Z

    move-result v3

    if-eqz v3, :cond_0

    return v1

    :cond_1
    if-nez v2, :cond_3

    :goto_0
    iget-object p1, p0, Li2/e;->c:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Li2/e;->c:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li2/e$c;

    invoke-static {p1}, Li2/e$c;->a(Li2/e$c;)V

    invoke-virtual {p1}, Li2/e$c;->j()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1

    :cond_3
    return v0
.end method

.method public final j(Lc2/m;)Z
    .locals 1

    new-instance v0, Li2/f;

    invoke-direct {v0}, Li2/f;-><init>()V

    invoke-virtual {v0, p1}, Li2/f;->b(Lc2/m;)Z

    move-result p1

    return p1
.end method

.method protected m(IILc2/m;)V
    .locals 21

    move-object/from16 v7, p0

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v8, p3

    const/16 v2, 0xa1

    const/16 v3, 0xa3

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v0, v2, :cond_8

    if-eq v0, v3, :cond_8

    const/16 v2, 0xa5

    if-eq v0, v2, :cond_6

    const/16 v2, 0x41ed

    if-eq v0, v2, :cond_5

    const/16 v2, 0x4255

    if-eq v0, v2, :cond_4

    const/16 v2, 0x47e2

    if-eq v0, v2, :cond_3

    const/16 v2, 0x53ab

    if-eq v0, v2, :cond_2

    const/16 v2, 0x63a2

    if-eq v0, v2, :cond_1

    const/16 v2, 0x7672

    if-ne v0, v2, :cond_0

    invoke-direct/range {p0 .. p1}, Li2/e;->k(I)V

    iget-object v0, v7, Li2/e;->u:Li2/e$c;

    new-array v2, v1, [B

    iput-object v2, v0, Li2/e$c;->v:[B

    invoke-interface {v8, v2, v9, v1}, Lc2/m;->readFully([BII)V

    goto/16 :goto_d

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object v0

    throw v0

    :cond_1
    invoke-direct/range {p0 .. p1}, Li2/e;->k(I)V

    iget-object v0, v7, Li2/e;->u:Li2/e$c;

    new-array v2, v1, [B

    iput-object v2, v0, Li2/e$c;->k:[B

    invoke-interface {v8, v2, v9, v1}, Lc2/m;->readFully([BII)V

    goto/16 :goto_d

    :cond_2
    iget-object v0, v7, Li2/e;->i:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    invoke-static {v0, v9}, Ljava/util/Arrays;->fill([BB)V

    iget-object v0, v7, Li2/e;->i:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    rsub-int/lit8 v2, v1, 0x4

    invoke-interface {v8, v0, v2, v1}, Lc2/m;->readFully([BII)V

    iget-object v0, v7, Li2/e;->i:Lu3/a0;

    invoke-virtual {v0, v9}, Lu3/a0;->R(I)V

    iget-object v0, v7, Li2/e;->i:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->G()J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, v7, Li2/e;->w:I

    goto/16 :goto_d

    :cond_3
    new-array v2, v1, [B

    invoke-interface {v8, v2, v9, v1}, Lc2/m;->readFully([BII)V

    invoke-virtual/range {p0 .. p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object v0

    new-instance v1, Lc2/e0$a;

    invoke-direct {v1, v10, v2, v9, v9}, Lc2/e0$a;-><init>(I[BII)V

    iput-object v1, v0, Li2/e$c;->j:Lc2/e0$a;

    goto/16 :goto_d

    :cond_4
    invoke-direct/range {p0 .. p1}, Li2/e;->k(I)V

    iget-object v0, v7, Li2/e;->u:Li2/e$c;

    new-array v2, v1, [B

    iput-object v2, v0, Li2/e$c;->i:[B

    invoke-interface {v8, v2, v9, v1}, Lc2/m;->readFully([BII)V

    goto/16 :goto_d

    :cond_5
    invoke-virtual/range {p0 .. p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object v0

    invoke-virtual {v7, v0, v8, v1}, Li2/e;->w(Li2/e$c;Lc2/m;I)V

    goto/16 :goto_d

    :cond_6
    iget v0, v7, Li2/e;->G:I

    if-eq v0, v5, :cond_7

    return-void

    :cond_7
    iget-object v0, v7, Li2/e;->c:Landroid/util/SparseArray;

    iget v2, v7, Li2/e;->M:I

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/e$c;

    iget v2, v7, Li2/e;->P:I

    invoke-virtual {v7, v0, v2, v8, v1}, Li2/e;->x(Li2/e$c;ILc2/m;I)V

    goto/16 :goto_d

    :cond_8
    iget v2, v7, Li2/e;->G:I

    const/16 v6, 0x8

    if-nez v2, :cond_9

    iget-object v2, v7, Li2/e;->b:Li2/g;

    invoke-virtual {v2, v8, v9, v10, v6}, Li2/g;->d(Lc2/m;ZZI)J

    move-result-wide v11

    long-to-int v2, v11

    iput v2, v7, Li2/e;->M:I

    iget-object v2, v7, Li2/e;->b:Li2/g;

    invoke-virtual {v2}, Li2/g;->b()I

    move-result v2

    iput v2, v7, Li2/e;->N:I

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v11, v7, Li2/e;->I:J

    iput v10, v7, Li2/e;->G:I

    iget-object v2, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v2, v9}, Lu3/a0;->N(I)V

    :cond_9
    iget-object v2, v7, Li2/e;->c:Landroid/util/SparseArray;

    iget v11, v7, Li2/e;->M:I

    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Li2/e$c;

    if-nez v11, :cond_a

    iget v0, v7, Li2/e;->N:I

    sub-int v0, v1, v0

    invoke-interface {v8, v0}, Lc2/m;->j(I)V

    iput v9, v7, Li2/e;->G:I

    return-void

    :cond_a
    invoke-static {v11}, Li2/e$c;->a(Li2/e$c;)V

    iget v2, v7, Li2/e;->G:I

    if-ne v2, v10, :cond_1b

    const/4 v2, 0x3

    invoke-direct {v7, v8, v2}, Li2/e;->D(Lc2/m;I)V

    iget-object v12, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v12}, Lu3/a0;->e()[B

    move-result-object v12

    aget-byte v12, v12, v5

    and-int/lit8 v12, v12, 0x6

    shr-int/2addr v12, v10

    const/16 v13, 0xff

    if-nez v12, :cond_b

    iput v10, v7, Li2/e;->K:I

    iget-object v4, v7, Li2/e;->L:[I

    invoke-static {v4, v10}, Li2/e;->q([II)[I

    move-result-object v4

    iput-object v4, v7, Li2/e;->L:[I

    iget v12, v7, Li2/e;->N:I

    sub-int/2addr v1, v12

    sub-int/2addr v1, v2

    aput v1, v4, v9

    :goto_0
    move-object/from16 v19, v11

    goto/16 :goto_7

    :cond_b
    const/4 v14, 0x4

    invoke-direct {v7, v8, v14}, Li2/e;->D(Lc2/m;I)V

    iget-object v15, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v15}, Lu3/a0;->e()[B

    move-result-object v15

    aget-byte v15, v15, v2

    and-int/2addr v15, v13

    add-int/2addr v15, v10

    iput v15, v7, Li2/e;->K:I

    iget-object v3, v7, Li2/e;->L:[I

    invoke-static {v3, v15}, Li2/e;->q([II)[I

    move-result-object v3

    iput-object v3, v7, Li2/e;->L:[I

    if-ne v12, v5, :cond_c

    iget v2, v7, Li2/e;->N:I

    sub-int/2addr v1, v2

    sub-int/2addr v1, v14

    iget v2, v7, Li2/e;->K:I

    div-int/2addr v1, v2

    invoke-static {v3, v9, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    goto :goto_0

    :cond_c
    if-ne v12, v10, :cond_f

    move v2, v9

    move v3, v2

    :goto_1
    iget v4, v7, Li2/e;->K:I

    add-int/lit8 v12, v4, -0x1

    if-ge v2, v12, :cond_e

    iget-object v4, v7, Li2/e;->L:[I

    aput v9, v4, v2

    :cond_d
    add-int/2addr v14, v10

    invoke-direct {v7, v8, v14}, Li2/e;->D(Lc2/m;I)V

    iget-object v4, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v4}, Lu3/a0;->e()[B

    move-result-object v4

    add-int/lit8 v12, v14, -0x1

    aget-byte v4, v4, v12

    and-int/2addr v4, v13

    iget-object v12, v7, Li2/e;->L:[I

    aget v15, v12, v2

    add-int/2addr v15, v4

    aput v15, v12, v2

    if-eq v4, v13, :cond_d

    aget v4, v12, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_e
    iget-object v2, v7, Li2/e;->L:[I

    sub-int/2addr v4, v10

    iget v12, v7, Li2/e;->N:I

    sub-int/2addr v1, v12

    sub-int/2addr v1, v14

    sub-int/2addr v1, v3

    aput v1, v2, v4

    goto :goto_0

    :cond_f
    if-ne v12, v2, :cond_1a

    move v2, v9

    move v3, v2

    :goto_2
    iget v12, v7, Li2/e;->K:I

    add-int/lit8 v15, v12, -0x1

    if-ge v2, v15, :cond_17

    iget-object v12, v7, Li2/e;->L:[I

    aput v9, v12, v2

    add-int/lit8 v14, v14, 0x1

    invoke-direct {v7, v8, v14}, Li2/e;->D(Lc2/m;I)V

    iget-object v12, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v12}, Lu3/a0;->e()[B

    move-result-object v12

    add-int/lit8 v15, v14, -0x1

    aget-byte v12, v12, v15

    if-eqz v12, :cond_16

    const-wide/16 v16, 0x0

    move v12, v9

    :goto_3
    if-ge v12, v6, :cond_13

    rsub-int/lit8 v18, v12, 0x7

    shl-int v5, v10, v18

    iget-object v9, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v9}, Lu3/a0;->e()[B

    move-result-object v9

    aget-byte v9, v9, v15

    and-int/2addr v9, v5

    if-eqz v9, :cond_12

    add-int/2addr v14, v12

    invoke-direct {v7, v8, v14}, Li2/e;->D(Lc2/m;I)V

    iget-object v9, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v9}, Lu3/a0;->e()[B

    move-result-object v9

    add-int/lit8 v16, v15, 0x1

    aget-byte v9, v9, v15

    and-int/2addr v9, v13

    not-int v5, v5

    and-int/2addr v5, v9

    move-object/from16 v19, v11

    int-to-long v10, v5

    move/from16 v5, v16

    :goto_4
    move-wide/from16 v16, v10

    if-ge v5, v14, :cond_10

    shl-long v10, v16, v6

    iget-object v15, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v15}, Lu3/a0;->e()[B

    move-result-object v15

    add-int/lit8 v16, v5, 0x1

    aget-byte v5, v15, v5

    and-int/2addr v5, v13

    move/from16 v20, v14

    int-to-long v13, v5

    or-long/2addr v10, v13

    move/from16 v5, v16

    move/from16 v14, v20

    const/16 v13, 0xff

    goto :goto_4

    :cond_10
    move/from16 v20, v14

    if-lez v2, :cond_11

    mul-int/lit8 v12, v12, 0x7

    add-int/lit8 v12, v12, 0x6

    const-wide/16 v10, 0x1

    shl-long v12, v10, v12

    sub-long/2addr v12, v10

    sub-long v16, v16, v12

    :cond_11
    move-wide/from16 v10, v16

    move/from16 v14, v20

    goto :goto_5

    :cond_12
    move-object/from16 v19, v11

    add-int/lit8 v12, v12, 0x1

    const/4 v5, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/16 v13, 0xff

    goto :goto_3

    :cond_13
    move-object/from16 v19, v11

    move-wide/from16 v10, v16

    :goto_5
    const-wide/32 v12, -0x80000000

    cmp-long v5, v10, v12

    if-ltz v5, :cond_15

    const-wide/32 v12, 0x7fffffff

    cmp-long v5, v10, v12

    if-gtz v5, :cond_15

    long-to-int v5, v10

    iget-object v10, v7, Li2/e;->L:[I

    if-nez v2, :cond_14

    goto :goto_6

    :cond_14
    add-int/lit8 v11, v2, -0x1

    aget v11, v10, v11

    add-int/2addr v5, v11

    :goto_6
    aput v5, v10, v2

    aget v5, v10, v2

    add-int/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v11, v19

    const/4 v5, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/16 v13, 0xff

    goto/16 :goto_2

    :cond_15
    const-string v0, "EBML lacing sample size out of range."

    invoke-static {v0, v4}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object v0

    throw v0

    :cond_16
    const-string v0, "No valid varint length mask found"

    invoke-static {v0, v4}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object v0

    throw v0

    :cond_17
    move-object/from16 v19, v11

    iget-object v2, v7, Li2/e;->L:[I

    const/4 v4, 0x1

    sub-int/2addr v12, v4

    iget v4, v7, Li2/e;->N:I

    sub-int/2addr v1, v4

    sub-int/2addr v1, v14

    sub-int/2addr v1, v3

    aput v1, v2, v12

    :goto_7
    iget-object v1, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    const/4 v2, 0x0

    aget-byte v1, v1, v2

    shl-int/2addr v1, v6

    iget-object v2, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v2}, Lu3/a0;->e()[B

    move-result-object v2

    const/4 v3, 0x1

    aget-byte v2, v2, v3

    const/16 v3, 0xff

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    iget-wide v2, v7, Li2/e;->B:J

    int-to-long v4, v1

    invoke-direct {v7, v4, v5}, Li2/e;->F(J)J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, v7, Li2/e;->H:J

    move-object/from16 v10, v19

    iget v1, v10, Li2/e$c;->d:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_19

    const/16 v1, 0xa3

    if-ne v0, v1, :cond_18

    iget-object v1, v7, Li2/e;->g:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    aget-byte v1, v1, v2

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_18

    goto :goto_8

    :cond_18
    const/4 v1, 0x0

    goto :goto_9

    :cond_19
    :goto_8
    const/4 v1, 0x1

    :goto_9
    iput v1, v7, Li2/e;->O:I

    const/4 v1, 0x2

    iput v1, v7, Li2/e;->G:I

    const/4 v1, 0x0

    iput v1, v7, Li2/e;->J:I

    const/16 v1, 0xa3

    goto :goto_a

    :cond_1a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected lacing value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object v0

    throw v0

    :cond_1b
    move-object v10, v11

    move v1, v3

    :goto_a
    if-ne v0, v1, :cond_1d

    :goto_b
    iget v0, v7, Li2/e;->J:I

    iget v1, v7, Li2/e;->K:I

    if-ge v0, v1, :cond_1c

    iget-object v1, v7, Li2/e;->L:[I

    aget v0, v1, v0

    const/4 v1, 0x0

    invoke-direct {v7, v8, v10, v0, v1}, Li2/e;->J(Lc2/m;Li2/e$c;IZ)I

    move-result v5

    iget-wide v0, v7, Li2/e;->H:J

    iget v2, v7, Li2/e;->J:I

    iget v3, v10, Li2/e$c;->e:I

    mul-int/2addr v2, v3

    div-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    add-long/2addr v2, v0

    iget v4, v7, Li2/e;->O:I

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object v1, v10

    invoke-direct/range {v0 .. v6}, Li2/e;->o(Li2/e$c;JIII)V

    iget v0, v7, Li2/e;->J:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, v7, Li2/e;->J:I

    goto :goto_b

    :cond_1c
    const/4 v0, 0x0

    iput v0, v7, Li2/e;->G:I

    goto :goto_d

    :cond_1d
    const/4 v1, 0x1

    :goto_c
    iget v0, v7, Li2/e;->J:I

    iget v2, v7, Li2/e;->K:I

    if-ge v0, v2, :cond_1e

    iget-object v2, v7, Li2/e;->L:[I

    aget v3, v2, v0

    invoke-direct {v7, v8, v10, v3, v1}, Li2/e;->J(Lc2/m;Li2/e$c;IZ)I

    move-result v3

    aput v3, v2, v0

    iget v0, v7, Li2/e;->J:I

    add-int/2addr v0, v1

    iput v0, v7, Li2/e;->J:I

    goto :goto_c

    :cond_1e
    :goto_d
    return-void
.end method

.method protected p(I)V
    .locals 10

    invoke-direct {p0}, Li2/e;->l()V

    const/16 v0, 0xa0

    const/4 v1, 0x0

    if-eq p1, v0, :cond_f

    const/16 v0, 0xae

    const/4 v2, 0x0

    if-eq p1, v0, :cond_c

    const/16 v0, 0x4dbb

    const v3, 0x1c53bb6b

    if-eq p1, v0, :cond_a

    const/16 v0, 0x6240

    const/4 v4, 0x1

    if-eq p1, v0, :cond_8

    const/16 v0, 0x6d80

    if-eq p1, v0, :cond_6

    const v0, 0x1549a966

    if-eq p1, v0, :cond_4

    const v0, 0x1654ae6b

    if-eq p1, v0, :cond_2

    if-eq p1, v3, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-boolean p1, p0, Li2/e;->v:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Li2/e;->b0:Lc2/n;

    iget-object v0, p0, Li2/e;->C:Lu3/s;

    iget-object v1, p0, Li2/e;->D:Lu3/s;

    invoke-direct {p0, v0, v1}, Li2/e;->n(Lu3/s;Lu3/s;)Lc2/b0;

    move-result-object v0

    invoke-interface {p1, v0}, Lc2/n;->p(Lc2/b0;)V

    iput-boolean v4, p0, Li2/e;->v:Z

    :cond_1
    iput-object v2, p0, Li2/e;->C:Lu3/s;

    iput-object v2, p0, Li2/e;->D:Lu3/s;

    goto/16 :goto_2

    :cond_2
    iget-object p1, p0, Li2/e;->c:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Li2/e;->b0:Lc2/n;

    invoke-interface {p1}, Lc2/n;->i()V

    goto/16 :goto_2

    :cond_3
    const-string p1, "No valid tracks were found"

    invoke-static {p1, v2}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_4
    iget-wide v0, p0, Li2/e;->r:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-nez p1, :cond_5

    const-wide/32 v0, 0xf4240

    iput-wide v0, p0, Li2/e;->r:J

    :cond_5
    iget-wide v0, p0, Li2/e;->s:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_15

    invoke-direct {p0, v0, v1}, Li2/e;->F(J)J

    move-result-wide v0

    iput-wide v0, p0, Li2/e;->t:J

    goto/16 :goto_2

    :cond_6
    invoke-direct {p0, p1}, Li2/e;->k(I)V

    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iget-boolean v0, p1, Li2/e$c;->h:Z

    if-eqz v0, :cond_15

    iget-object p1, p1, Li2/e$c;->i:[B

    if-nez p1, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string p1, "Combining encryption and compression is not supported"

    invoke-static {p1, v2}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_8
    invoke-direct {p0, p1}, Li2/e;->k(I)V

    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iget-boolean v0, p1, Li2/e$c;->h:Z

    if-eqz v0, :cond_15

    iget-object v0, p1, Li2/e$c;->j:Lc2/e0$a;

    if-eqz v0, :cond_9

    new-instance v0, Lb2/m;

    new-array v2, v4, [Lb2/m$b;

    new-instance v3, Lb2/m$b;

    sget-object v4, Lx1/i;->a:Ljava/util/UUID;

    iget-object v5, p0, Li2/e;->u:Li2/e$c;

    iget-object v5, v5, Li2/e$c;->j:Lc2/e0$a;

    iget-object v5, v5, Lc2/e0$a;->b:[B

    const-string v6, "video/webm"

    invoke-direct {v3, v4, v6, v5}, Lb2/m$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    aput-object v3, v2, v1

    invoke-direct {v0, v2}, Lb2/m;-><init>([Lb2/m$b;)V

    iput-object v0, p1, Li2/e$c;->l:Lb2/m;

    goto/16 :goto_2

    :cond_9
    const-string p1, "Encrypted Track found but ContentEncKeyID was not found"

    invoke-static {p1, v2}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_a
    iget p1, p0, Li2/e;->w:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_b

    iget-wide v0, p0, Li2/e;->x:J

    const-wide/16 v4, -0x1

    cmp-long v4, v0, v4

    if-eqz v4, :cond_b

    if-ne p1, v3, :cond_15

    iput-wide v0, p0, Li2/e;->z:J

    goto/16 :goto_2

    :cond_b
    const-string p1, "Mandatory element SeekID or SeekPosition not found"

    invoke-static {p1, v2}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_c
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    invoke-static {p1}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li2/e$c;

    iget-object v0, p1, Li2/e$c;->b:Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-static {v0}, Li2/e;->z(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Li2/e;->b0:Lc2/n;

    iget v1, p1, Li2/e$c;->c:I

    invoke-virtual {p1, v0, v1}, Li2/e$c;->i(Lc2/n;I)V

    iget-object v0, p0, Li2/e;->c:Landroid/util/SparseArray;

    iget v1, p1, Li2/e$c;->c:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_d
    iput-object v2, p0, Li2/e;->u:Li2/e$c;

    goto/16 :goto_2

    :cond_e
    const-string p1, "CodecId is missing in TrackEntry element"

    invoke-static {p1, v2}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_f
    iget p1, p0, Li2/e;->G:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_10

    return-void

    :cond_10
    iget-object p1, p0, Li2/e;->c:Landroid/util/SparseArray;

    iget v0, p0, Li2/e;->M:I

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li2/e$c;

    invoke-static {p1}, Li2/e$c;->a(Li2/e$c;)V

    iget-wide v2, p0, Li2/e;->R:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_11

    iget-object v0, p1, Li2/e$c;->b:Ljava/lang/String;

    const-string v2, "A_OPUS"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Li2/e;->n:Lu3/a0;

    const/16 v2, 0x8

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-wide v3, p0, Li2/e;->R:J

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Lu3/a0;->O([B)V

    :cond_11
    move v0, v1

    move v2, v0

    :goto_0
    iget v3, p0, Li2/e;->K:I

    if-ge v0, v3, :cond_12

    iget-object v3, p0, Li2/e;->L:[I

    aget v3, v3, v0

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_12
    move v0, v1

    :goto_1
    iget v3, p0, Li2/e;->K:I

    if-ge v0, v3, :cond_14

    iget-wide v3, p0, Li2/e;->H:J

    iget v5, p1, Li2/e$c;->e:I

    mul-int/2addr v5, v0

    div-int/lit16 v5, v5, 0x3e8

    int-to-long v5, v5

    add-long v4, v3, v5

    iget v3, p0, Li2/e;->O:I

    if-nez v0, :cond_13

    iget-boolean v6, p0, Li2/e;->Q:Z

    if-nez v6, :cond_13

    or-int/lit8 v3, v3, 0x1

    :cond_13
    move v6, v3

    iget-object v3, p0, Li2/e;->L:[I

    aget v7, v3, v0

    sub-int v9, v2, v7

    move-object v2, p0

    move-object v3, p1

    move v8, v9

    invoke-direct/range {v2 .. v8}, Li2/e;->o(Li2/e$c;JIII)V

    add-int/lit8 v0, v0, 0x1

    move v2, v9

    goto :goto_1

    :cond_14
    iput v1, p0, Li2/e;->G:I

    :cond_15
    :goto_2
    return-void
.end method

.method protected s(ID)V
    .locals 1

    const/16 v0, 0xb5

    if-eq p1, v0, :cond_1

    const/16 v0, 0x4489

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_0
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->u:F

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->t:F

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->s:F

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->M:F

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->L:F

    goto :goto_0

    :pswitch_5
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->K:F

    goto :goto_0

    :pswitch_6
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->J:F

    goto :goto_0

    :pswitch_7
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->I:F

    goto :goto_0

    :pswitch_8
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->H:F

    goto :goto_0

    :pswitch_9
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->G:F

    goto :goto_0

    :pswitch_a
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->F:F

    goto :goto_0

    :pswitch_b
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->E:F

    goto :goto_0

    :pswitch_c
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-float p2, p2

    iput p2, p1, Li2/e$c;->D:F

    goto :goto_0

    :cond_0
    double-to-long p1, p2

    iput-wide p1, p0, Li2/e;->s:J

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    double-to-int p2, p2

    iput p2, p1, Li2/e$c;->Q:I

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x55d1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7673
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected u(I)Li2/e$c;
    .locals 0

    invoke-direct {p0, p1}, Li2/e;->k(I)V

    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    return-object p1
.end method

.method protected v(I)I
    .locals 0

    sparse-switch p1, :sswitch_data_0

    const/4 p1, 0x0

    return p1

    :sswitch_0
    const/4 p1, 0x5

    return p1

    :sswitch_1
    const/4 p1, 0x4

    return p1

    :sswitch_2
    const/4 p1, 0x1

    return p1

    :sswitch_3
    const/4 p1, 0x3

    return p1

    :sswitch_4
    const/4 p1, 0x2

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_4
        0x86 -> :sswitch_3
        0x88 -> :sswitch_4
        0x9b -> :sswitch_4
        0x9f -> :sswitch_4
        0xa0 -> :sswitch_2
        0xa1 -> :sswitch_1
        0xa3 -> :sswitch_1
        0xa5 -> :sswitch_1
        0xa6 -> :sswitch_2
        0xae -> :sswitch_2
        0xb0 -> :sswitch_4
        0xb3 -> :sswitch_4
        0xb5 -> :sswitch_0
        0xb7 -> :sswitch_2
        0xba -> :sswitch_4
        0xbb -> :sswitch_2
        0xd7 -> :sswitch_4
        0xe0 -> :sswitch_2
        0xe1 -> :sswitch_2
        0xe7 -> :sswitch_4
        0xee -> :sswitch_4
        0xf1 -> :sswitch_4
        0xfb -> :sswitch_4
        0x41e4 -> :sswitch_2
        0x41e7 -> :sswitch_4
        0x41ed -> :sswitch_1
        0x4254 -> :sswitch_4
        0x4255 -> :sswitch_1
        0x4282 -> :sswitch_3
        0x4285 -> :sswitch_4
        0x42f7 -> :sswitch_4
        0x4489 -> :sswitch_0
        0x47e1 -> :sswitch_4
        0x47e2 -> :sswitch_1
        0x47e7 -> :sswitch_2
        0x47e8 -> :sswitch_4
        0x4dbb -> :sswitch_2
        0x5031 -> :sswitch_4
        0x5032 -> :sswitch_4
        0x5034 -> :sswitch_2
        0x5035 -> :sswitch_2
        0x536e -> :sswitch_3
        0x53ab -> :sswitch_1
        0x53ac -> :sswitch_4
        0x53b8 -> :sswitch_4
        0x54b0 -> :sswitch_4
        0x54b2 -> :sswitch_4
        0x54ba -> :sswitch_4
        0x55aa -> :sswitch_4
        0x55b0 -> :sswitch_2
        0x55b9 -> :sswitch_4
        0x55ba -> :sswitch_4
        0x55bb -> :sswitch_4
        0x55bc -> :sswitch_4
        0x55bd -> :sswitch_4
        0x55d0 -> :sswitch_2
        0x55d1 -> :sswitch_0
        0x55d2 -> :sswitch_0
        0x55d3 -> :sswitch_0
        0x55d4 -> :sswitch_0
        0x55d5 -> :sswitch_0
        0x55d6 -> :sswitch_0
        0x55d7 -> :sswitch_0
        0x55d8 -> :sswitch_0
        0x55d9 -> :sswitch_0
        0x55da -> :sswitch_0
        0x55ee -> :sswitch_4
        0x56aa -> :sswitch_4
        0x56bb -> :sswitch_4
        0x6240 -> :sswitch_2
        0x6264 -> :sswitch_4
        0x63a2 -> :sswitch_1
        0x6d80 -> :sswitch_2
        0x75a1 -> :sswitch_2
        0x75a2 -> :sswitch_4
        0x7670 -> :sswitch_2
        0x7671 -> :sswitch_4
        0x7672 -> :sswitch_1
        0x7673 -> :sswitch_0
        0x7674 -> :sswitch_0
        0x7675 -> :sswitch_0
        0x22b59c -> :sswitch_3
        0x23e383 -> :sswitch_4
        0x2ad7b1 -> :sswitch_4
        0x114d9b74 -> :sswitch_2
        0x1549a966 -> :sswitch_2
        0x1654ae6b -> :sswitch_2
        0x18538067 -> :sswitch_2
        0x1a45dfa3 -> :sswitch_2
        0x1c53bb6b -> :sswitch_2
        0x1f43b675 -> :sswitch_2
    .end sparse-switch
.end method

.method protected w(Li2/e$c;Lc2/m;I)V
    .locals 2

    invoke-static {p1}, Li2/e$c;->b(Li2/e$c;)I

    move-result v0

    const v1, 0x64767643

    if-eq v0, v1, :cond_1

    invoke-static {p1}, Li2/e$c;->b(Li2/e$c;)I

    move-result v0

    const v1, 0x64766343

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, Lc2/m;->j(I)V

    goto :goto_1

    :cond_1
    :goto_0
    new-array v0, p3, [B

    iput-object v0, p1, Li2/e$c;->N:[B

    const/4 p1, 0x0

    invoke-interface {p2, v0, p1, p3}, Lc2/m;->readFully([BII)V

    :goto_1
    return-void
.end method

.method protected x(Li2/e$c;ILc2/m;I)V
    .locals 1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    iget-object p1, p1, Li2/e$c;->b:Ljava/lang/String;

    const-string p2, "V_VP9"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Li2/e;->n:Lu3/a0;

    invoke-virtual {p1, p4}, Lu3/a0;->N(I)V

    iget-object p1, p0, Li2/e;->n:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->e()[B

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p3, p1, p2, p4}, Lc2/m;->readFully([BII)V

    goto :goto_0

    :cond_0
    invoke-interface {p3, p4}, Lc2/m;->j(I)V

    :goto_0
    return-void
.end method

.method protected y(IJ)V
    .locals 8

    const/16 v0, 0x5031

    const/4 v1, 0x0

    const-string v2, " not supported"

    if-eq p1, v0, :cond_13

    const/16 v0, 0x5032

    const-wide/16 v3, 0x1

    if-eq p1, v0, :cond_11

    const/4 v0, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    sparse-switch p1, :sswitch_data_0

    const/4 v0, -0x1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->C:I

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->B:I

    goto/16 :goto_0

    :pswitch_2
    invoke-direct {p0, p1}, Li2/e;->k(I)V

    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput-boolean v7, p1, Li2/e$c;->x:Z

    long-to-int p1, p2

    invoke-static {p1}, Lv3/c;->b(I)I

    move-result p1

    if-eq p1, v0, :cond_14

    iget-object p2, p0, Li2/e;->u:Li2/e$c;

    iput p1, p2, Li2/e$c;->y:I

    goto/16 :goto_0

    :pswitch_3
    invoke-direct {p0, p1}, Li2/e;->k(I)V

    long-to-int p1, p2

    invoke-static {p1}, Lv3/c;->c(I)I

    move-result p1

    if-eq p1, v0, :cond_14

    iget-object p2, p0, Li2/e;->u:Li2/e$c;

    iput p1, p2, Li2/e$c;->z:I

    goto/16 :goto_0

    :pswitch_4
    invoke-direct {p0, p1}, Li2/e;->k(I)V

    long-to-int p1, p2

    if-eq p1, v7, :cond_1

    if-eq p1, v6, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput v7, p1, Li2/e$c;->A:I

    goto/16 :goto_0

    :cond_1
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput v6, p1, Li2/e$c;->A:I

    goto/16 :goto_0

    :sswitch_0
    iput-wide p2, p0, Li2/e;->r:J

    goto/16 :goto_0

    :sswitch_1
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->e:I

    goto/16 :goto_0

    :sswitch_2
    invoke-direct {p0, p1}, Li2/e;->k(I)V

    long-to-int p1, p2

    if-eqz p1, :cond_5

    if-eq p1, v7, :cond_4

    if-eq p1, v6, :cond_3

    if-eq p1, v5, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput v5, p1, Li2/e$c;->r:I

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput v6, p1, Li2/e$c;->r:I

    goto/16 :goto_0

    :cond_4
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput v7, p1, Li2/e$c;->r:I

    goto/16 :goto_0

    :cond_5
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput v0, p1, Li2/e$c;->r:I

    goto/16 :goto_0

    :sswitch_3
    iput-wide p2, p0, Li2/e;->R:J

    goto/16 :goto_0

    :sswitch_4
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->P:I

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    iput-wide p2, p1, Li2/e$c;->S:J

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    iput-wide p2, p1, Li2/e$c;->R:J

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->f:I

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    cmp-long p2, p2, v3

    if-nez p2, :cond_6

    move v0, v7

    :cond_6
    iput-boolean v0, p1, Li2/e$c;->U:Z

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->p:I

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->q:I

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->o:I

    goto/16 :goto_0

    :sswitch_c
    long-to-int p2, p2

    invoke-direct {p0, p1}, Li2/e;->k(I)V

    if-eqz p2, :cond_a

    if-eq p2, v7, :cond_9

    if-eq p2, v5, :cond_8

    const/16 p1, 0xf

    if-eq p2, p1, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput v5, p1, Li2/e$c;->w:I

    goto/16 :goto_0

    :cond_8
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput v7, p1, Li2/e$c;->w:I

    goto/16 :goto_0

    :cond_9
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput v6, p1, Li2/e$c;->w:I

    goto/16 :goto_0

    :cond_a
    iget-object p1, p0, Li2/e;->u:Li2/e$c;

    iput v0, p1, Li2/e$c;->w:I

    goto/16 :goto_0

    :sswitch_d
    iget-wide v0, p0, Li2/e;->q:J

    add-long/2addr p2, v0

    iput-wide p2, p0, Li2/e;->x:J

    goto/16 :goto_0

    :sswitch_e
    cmp-long p1, p2, v3

    if-nez p1, :cond_b

    goto/16 :goto_0

    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "AESSettingsCipherMode "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :sswitch_f
    const-wide/16 v3, 0x5

    cmp-long p1, p2, v3

    if-nez p1, :cond_c

    goto/16 :goto_0

    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ContentEncAlgo "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :sswitch_10
    cmp-long p1, p2, v3

    if-nez p1, :cond_d

    goto/16 :goto_0

    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "EBMLReadVersion "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :sswitch_11
    cmp-long p1, p2, v3

    if-ltz p1, :cond_e

    const-wide/16 v3, 0x2

    cmp-long p1, p2, v3

    if-gtz p1, :cond_e

    goto/16 :goto_0

    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DocTypeReadVersion "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :sswitch_12
    const-wide/16 v3, 0x3

    cmp-long p1, p2, v3

    if-nez p1, :cond_f

    goto/16 :goto_0

    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ContentCompAlgo "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :sswitch_13
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    invoke-static {p1, p2}, Li2/e$c;->c(Li2/e$c;I)I

    goto/16 :goto_0

    :sswitch_14
    iput-boolean v7, p0, Li2/e;->Q:Z

    goto/16 :goto_0

    :sswitch_15
    iget-boolean v0, p0, Li2/e;->E:Z

    if-nez v0, :cond_14

    invoke-direct {p0, p1}, Li2/e;->i(I)V

    iget-object p1, p0, Li2/e;->D:Lu3/s;

    invoke-virtual {p1, p2, p3}, Lu3/s;->a(J)V

    iput-boolean v7, p0, Li2/e;->E:Z

    goto/16 :goto_0

    :sswitch_16
    long-to-int p1, p2

    iput p1, p0, Li2/e;->P:I

    goto/16 :goto_0

    :sswitch_17
    invoke-direct {p0, p2, p3}, Li2/e;->F(J)J

    move-result-wide p1

    iput-wide p1, p0, Li2/e;->B:J

    goto/16 :goto_0

    :sswitch_18
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->c:I

    goto :goto_0

    :sswitch_19
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->n:I

    goto :goto_0

    :sswitch_1a
    invoke-direct {p0, p1}, Li2/e;->i(I)V

    iget-object p1, p0, Li2/e;->C:Lu3/s;

    invoke-direct {p0, p2, p3}, Li2/e;->F(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lu3/s;->a(J)V

    goto :goto_0

    :sswitch_1b
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->m:I

    goto :goto_0

    :sswitch_1c
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->O:I

    goto :goto_0

    :sswitch_1d
    invoke-direct {p0, p2, p3}, Li2/e;->F(J)J

    move-result-wide p1

    iput-wide p1, p0, Li2/e;->I:J

    goto :goto_0

    :sswitch_1e
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    cmp-long p2, p2, v3

    if-nez p2, :cond_10

    move v0, v7

    :cond_10
    iput-boolean v0, p1, Li2/e$c;->V:Z

    goto :goto_0

    :sswitch_1f
    invoke-virtual {p0, p1}, Li2/e;->u(I)Li2/e$c;

    move-result-object p1

    long-to-int p2, p2

    iput p2, p1, Li2/e$c;->d:I

    goto :goto_0

    :cond_11
    cmp-long p1, p2, v3

    if-nez p1, :cond_12

    goto :goto_0

    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ContentEncodingScope "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_13
    const-wide/16 v3, 0x0

    cmp-long p1, p2, v3

    if-nez p1, :cond_15

    :cond_14
    :goto_0
    return-void

    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ContentEncodingOrder "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_1f
        0x88 -> :sswitch_1e
        0x9b -> :sswitch_1d
        0x9f -> :sswitch_1c
        0xb0 -> :sswitch_1b
        0xb3 -> :sswitch_1a
        0xba -> :sswitch_19
        0xd7 -> :sswitch_18
        0xe7 -> :sswitch_17
        0xee -> :sswitch_16
        0xf1 -> :sswitch_15
        0xfb -> :sswitch_14
        0x41e7 -> :sswitch_13
        0x4254 -> :sswitch_12
        0x4285 -> :sswitch_11
        0x42f7 -> :sswitch_10
        0x47e1 -> :sswitch_f
        0x47e8 -> :sswitch_e
        0x53ac -> :sswitch_d
        0x53b8 -> :sswitch_c
        0x54b0 -> :sswitch_b
        0x54b2 -> :sswitch_a
        0x54ba -> :sswitch_9
        0x55aa -> :sswitch_8
        0x55ee -> :sswitch_7
        0x56aa -> :sswitch_6
        0x56bb -> :sswitch_5
        0x6264 -> :sswitch_4
        0x75a2 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
