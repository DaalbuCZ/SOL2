.class public final Lh2/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh2/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/n$a;
    }
.end annotation


# static fields
.field private static final q:[D


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lx1/e0;

.field private final c:Lh2/k0;

.field private final d:Lp3/a0;

.field private final e:Lh2/u;

.field private final f:[Z

.field private final g:Lh2/n$a;

.field private h:J

.field private i:Z

.field private j:Z

.field private k:J

.field private l:J

.field private m:J

.field private n:J

.field private o:Z

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [D

    fill-array-data v0, :array_0

    sput-object v0, Lh2/n;->q:[D

    return-void

    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lh2/n;-><init>(Lh2/k0;)V

    return-void
.end method

.method constructor <init>(Lh2/k0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/n;->c:Lh2/k0;

    const/4 v0, 0x4

    new-array v0, v0, [Z

    iput-object v0, p0, Lh2/n;->f:[Z

    new-instance v0, Lh2/n$a;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Lh2/n$a;-><init>(I)V

    iput-object v0, p0, Lh2/n;->g:Lh2/n$a;

    if-eqz p1, :cond_0

    new-instance p1, Lh2/u;

    const/16 v0, 0xb2

    invoke-direct {p1, v0, v1}, Lh2/u;-><init>(II)V

    iput-object p1, p0, Lh2/n;->e:Lh2/u;

    new-instance p1, Lp3/a0;

    invoke-direct {p1}, Lp3/a0;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lh2/n;->e:Lh2/u;

    :goto_0
    iput-object p1, p0, Lh2/n;->d:Lp3/a0;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/n;->l:J

    iput-wide v0, p0, Lh2/n;->n:J

    return-void
.end method

.method private static f(Lh2/n$a;Ljava/lang/String;)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh2/n$a;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ls1/m1;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh2/n$a;->d:[B

    iget v1, p0, Lh2/n$a;->b:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    const/4 v1, 0x4

    aget-byte v2, v0, v1

    and-int/lit16 v2, v2, 0xff

    const/4 v3, 0x5

    aget-byte v4, v0, v3

    and-int/lit16 v4, v4, 0xff

    const/4 v5, 0x6

    aget-byte v5, v0, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/2addr v2, v1

    shr-int/lit8 v6, v4, 0x4

    or-int/2addr v2, v6

    and-int/lit8 v4, v4, 0xf

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v4, v5

    const/4 v5, 0x7

    aget-byte v6, v0, v5

    and-int/lit16 v6, v6, 0xf0

    shr-int/2addr v6, v1

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2

    const/4 v7, 0x3

    if-eq v6, v7, :cond_1

    if-eq v6, v1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_0
    mul-int/lit8 v1, v4, 0x79

    int-to-float v1, v1

    mul-int/lit8 v6, v2, 0x64

    goto :goto_0

    :cond_1
    mul-int/lit8 v1, v4, 0x10

    int-to-float v1, v1

    mul-int/lit8 v6, v2, 0x9

    goto :goto_0

    :cond_2
    mul-int/lit8 v1, v4, 0x4

    int-to-float v1, v1

    mul-int/lit8 v6, v2, 0x3

    :goto_0
    int-to-float v6, v6

    div-float/2addr v1, v6

    :goto_1
    new-instance v6, Ls1/m1$b;

    invoke-direct {v6}, Ls1/m1$b;-><init>()V

    invoke-virtual {v6, p1}, Ls1/m1$b;->S(Ljava/lang/String;)Ls1/m1$b;

    move-result-object p1

    const-string v6, "video/mpeg2"

    invoke-virtual {p1, v6}, Ls1/m1$b;->e0(Ljava/lang/String;)Ls1/m1$b;

    move-result-object p1

    invoke-virtual {p1, v2}, Ls1/m1$b;->j0(I)Ls1/m1$b;

    move-result-object p1

    invoke-virtual {p1, v4}, Ls1/m1$b;->Q(I)Ls1/m1$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Ls1/m1$b;->a0(F)Ls1/m1$b;

    move-result-object p1

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1}, Ls1/m1$b;->T(Ljava/util/List;)Ls1/m1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls1/m1$b;->E()Ls1/m1;

    move-result-object p1

    const-wide/16 v1, 0x0

    aget-byte v4, v0, v5

    and-int/lit8 v4, v4, 0xf

    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_4

    sget-object v5, Lh2/n;->q:[D

    array-length v6, v5

    if-ge v4, v6, :cond_4

    aget-wide v1, v5, v4

    iget p0, p0, Lh2/n$a;->c:I

    add-int/lit8 p0, p0, 0x9

    aget-byte v4, v0, p0

    and-int/lit8 v4, v4, 0x60

    shr-int/lit8 v3, v4, 0x5

    aget-byte p0, v0, p0

    and-int/lit8 p0, p0, 0x1f

    if-eq v3, p0, :cond_3

    int-to-double v3, v3

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    add-double/2addr v3, v5

    add-int/lit8 p0, p0, 0x1

    int-to-double v5, p0

    div-double/2addr v3, v5

    mul-double/2addr v1, v3

    :cond_3
    const-wide v3, 0x412e848000000000L    # 1000000.0

    div-double/2addr v3, v1

    double-to-long v1, v3

    :cond_4
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lp3/a0;)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lh2/n;->b:Lx1/e0;

    invoke-static {v1}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->e()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->f()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->d()[B

    move-result-object v3

    iget-wide v4, v0, Lh2/n;->h:J

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->a()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Lh2/n;->h:J

    iget-object v4, v0, Lh2/n;->b:Lx1/e0;

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->a()I

    move-result v5

    move-object/from16 v6, p1

    invoke-interface {v4, v6, v5}, Lx1/e0;->d(Lp3/a0;I)V

    :goto_0
    iget-object v4, v0, Lh2/n;->f:[Z

    invoke-static {v3, v1, v2, v4}, Lp3/w;->c([BII[Z)I

    move-result v4

    if-ne v4, v2, :cond_2

    iget-boolean v4, v0, Lh2/n;->j:Z

    if-nez v4, :cond_0

    iget-object v4, v0, Lh2/n;->g:Lh2/n$a;

    invoke-virtual {v4, v3, v1, v2}, Lh2/n$a;->a([BII)V

    :cond_0
    iget-object v4, v0, Lh2/n;->e:Lh2/u;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v3, v1, v2}, Lh2/u;->a([BII)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lp3/a0;->d()[B

    move-result-object v5

    add-int/lit8 v7, v4, 0x3

    aget-byte v5, v5, v7

    and-int/lit16 v5, v5, 0xff

    sub-int v8, v4, v1

    iget-boolean v9, v0, Lh2/n;->j:Z

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-nez v9, :cond_5

    if-lez v8, :cond_3

    iget-object v9, v0, Lh2/n;->g:Lh2/n$a;

    invoke-virtual {v9, v3, v1, v4}, Lh2/n$a;->a([BII)V

    :cond_3
    if-gez v8, :cond_4

    neg-int v9, v8

    goto :goto_1

    :cond_4
    move v9, v10

    :goto_1
    iget-object v12, v0, Lh2/n;->g:Lh2/n$a;

    invoke-virtual {v12, v5, v9}, Lh2/n$a;->b(II)Z

    move-result v9

    if-eqz v9, :cond_5

    iget-object v9, v0, Lh2/n;->g:Lh2/n$a;

    iget-object v12, v0, Lh2/n;->a:Ljava/lang/String;

    invoke-static {v12}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v9, v12}, Lh2/n;->f(Lh2/n$a;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v9

    iget-object v12, v0, Lh2/n;->b:Lx1/e0;

    iget-object v13, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v13, Ls1/m1;

    invoke-interface {v12, v13}, Lx1/e0;->e(Ls1/m1;)V

    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iput-wide v12, v0, Lh2/n;->k:J

    iput-boolean v11, v0, Lh2/n;->j:Z

    :cond_5
    iget-object v9, v0, Lh2/n;->e:Lh2/u;

    if-eqz v9, :cond_8

    if-lez v8, :cond_6

    invoke-virtual {v9, v3, v1, v4}, Lh2/u;->a([BII)V

    move v1, v10

    goto :goto_2

    :cond_6
    neg-int v1, v8

    :goto_2
    iget-object v8, v0, Lh2/n;->e:Lh2/u;

    invoke-virtual {v8, v1}, Lh2/u;->b(I)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Lh2/n;->e:Lh2/u;

    iget-object v8, v1, Lh2/u;->d:[B

    iget v1, v1, Lh2/u;->e:I

    invoke-static {v8, v1}, Lp3/w;->q([BI)I

    move-result v1

    iget-object v8, v0, Lh2/n;->d:Lp3/a0;

    invoke-static {v8}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lp3/a0;

    iget-object v9, v0, Lh2/n;->e:Lh2/u;

    iget-object v9, v9, Lh2/u;->d:[B

    invoke-virtual {v8, v9, v1}, Lp3/a0;->M([BI)V

    iget-object v1, v0, Lh2/n;->c:Lh2/k0;

    invoke-static {v1}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/k0;

    iget-wide v8, v0, Lh2/n;->n:J

    iget-object v12, v0, Lh2/n;->d:Lp3/a0;

    invoke-virtual {v1, v8, v9, v12}, Lh2/k0;->a(JLp3/a0;)V

    :cond_7
    const/16 v1, 0xb2

    if-ne v5, v1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lp3/a0;->d()[B

    move-result-object v1

    add-int/lit8 v8, v4, 0x2

    aget-byte v1, v1, v8

    if-ne v1, v11, :cond_8

    iget-object v1, v0, Lh2/n;->e:Lh2/u;

    invoke-virtual {v1, v5}, Lh2/u;->e(I)V

    :cond_8
    if-eqz v5, :cond_a

    const/16 v1, 0xb3

    if-ne v5, v1, :cond_9

    goto :goto_3

    :cond_9
    const/16 v1, 0xb8

    if-ne v5, v1, :cond_11

    iput-boolean v11, v0, Lh2/n;->o:Z

    goto :goto_8

    :cond_a
    :goto_3
    sub-int v1, v2, v4

    iget-boolean v4, v0, Lh2/n;->p:Z

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v4, :cond_b

    iget-boolean v4, v0, Lh2/n;->j:Z

    if-eqz v4, :cond_b

    iget-wide v13, v0, Lh2/n;->n:J

    cmp-long v4, v13, v8

    if-eqz v4, :cond_b

    iget-boolean v15, v0, Lh2/n;->o:Z

    iget-wide v11, v0, Lh2/n;->h:J

    move/from16 v19, v5

    iget-wide v4, v0, Lh2/n;->m:J

    sub-long/2addr v11, v4

    long-to-int v4, v11

    sub-int v16, v4, v1

    iget-object v12, v0, Lh2/n;->b:Lx1/e0;

    const/16 v18, 0x0

    move/from16 v17, v1

    invoke-interface/range {v12 .. v18}, Lx1/e0;->c(JIIILx1/e0$a;)V

    goto :goto_4

    :cond_b
    move/from16 v19, v5

    :goto_4
    iget-boolean v4, v0, Lh2/n;->i:Z

    if-eqz v4, :cond_d

    iget-boolean v4, v0, Lh2/n;->p:Z

    if-eqz v4, :cond_c

    goto :goto_5

    :cond_c
    const/4 v1, 0x1

    goto :goto_7

    :cond_d
    :goto_5
    iget-wide v4, v0, Lh2/n;->h:J

    int-to-long v11, v1

    sub-long/2addr v4, v11

    iput-wide v4, v0, Lh2/n;->m:J

    iget-wide v4, v0, Lh2/n;->l:J

    cmp-long v1, v4, v8

    if-eqz v1, :cond_e

    goto :goto_6

    :cond_e
    iget-wide v4, v0, Lh2/n;->n:J

    cmp-long v1, v4, v8

    if-eqz v1, :cond_f

    iget-wide v11, v0, Lh2/n;->k:J

    add-long/2addr v4, v11

    goto :goto_6

    :cond_f
    move-wide v4, v8

    :goto_6
    iput-wide v4, v0, Lh2/n;->n:J

    iput-boolean v10, v0, Lh2/n;->o:Z

    iput-wide v8, v0, Lh2/n;->l:J

    const/4 v1, 0x1

    iput-boolean v1, v0, Lh2/n;->i:Z

    :goto_7
    if-nez v19, :cond_10

    move v10, v1

    :cond_10
    iput-boolean v10, v0, Lh2/n;->p:Z

    :cond_11
    :goto_8
    move v1, v7

    goto/16 :goto_0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lh2/n;->f:[Z

    invoke-static {v0}, Lp3/w;->a([Z)V

    iget-object v0, p0, Lh2/n;->g:Lh2/n$a;

    invoke-virtual {v0}, Lh2/n$a;->c()V

    iget-object v0, p0, Lh2/n;->e:Lh2/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh2/u;->d()V

    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lh2/n;->h:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh2/n;->i:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/n;->l:J

    iput-wide v0, p0, Lh2/n;->n:J

    return-void
.end method

.method public c(Lx1/n;Lh2/i0$d;)V
    .locals 2

    invoke-virtual {p2}, Lh2/i0$d;->a()V

    invoke-virtual {p2}, Lh2/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh2/n;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lh2/i0$d;->c()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lx1/n;->e(II)Lx1/e0;

    move-result-object v0

    iput-object v0, p0, Lh2/n;->b:Lx1/e0;

    iget-object v0, p0, Lh2/n;->c:Lh2/k0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lh2/k0;->b(Lx1/n;Lh2/i0$d;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(JI)V
    .locals 0

    iput-wide p1, p0, Lh2/n;->l:J

    return-void
.end method
