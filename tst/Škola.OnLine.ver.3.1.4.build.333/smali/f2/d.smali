.class public final Lf2/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/l;


# static fields
.field public static final o:Lc2/r;


# instance fields
.field private final a:[B

.field private final b:Lu3/a0;

.field private final c:Z

.field private final d:Lc2/s$a;

.field private e:Lc2/n;

.field private f:Lc2/e0;

.field private g:I

.field private h:Lp2/a;

.field private i:Lc2/v;

.field private j:I

.field private k:I

.field private l:Lf2/b;

.field private m:I

.field private n:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lf2/c;->b:Lf2/c;

    sput-object v0, Lf2/d;->o:Lc2/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lf2/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2a

    new-array v0, v0, [B

    iput-object v0, p0, Lf2/d;->a:[B

    new-instance v0, Lu3/a0;

    const v1, 0x8000

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu3/a0;-><init>([BI)V

    iput-object v0, p0, Lf2/d;->b:Lu3/a0;

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lf2/d;->c:Z

    new-instance p1, Lc2/s$a;

    invoke-direct {p1}, Lc2/s$a;-><init>()V

    iput-object p1, p0, Lf2/d;->d:Lc2/s$a;

    iput v2, p0, Lf2/d;->g:I

    return-void
.end method

.method public static synthetic d()[Lc2/l;
    .locals 1

    invoke-static {}, Lf2/d;->k()[Lc2/l;

    move-result-object v0

    return-object v0
.end method

.method private e(Lu3/a0;Z)J
    .locals 4

    iget-object v0, p0, Lf2/d;->i:Lc2/v;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lu3/a0;->f()I

    move-result v0

    :goto_0
    invoke-virtual {p1}, Lu3/a0;->g()I

    move-result v1

    add-int/lit8 v1, v1, -0x10

    if-gt v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lu3/a0;->R(I)V

    iget-object v1, p0, Lf2/d;->i:Lc2/v;

    iget v2, p0, Lf2/d;->k:I

    iget-object v3, p0, Lf2/d;->d:Lc2/s$a;

    invoke-static {p1, v1, v2, v3}, Lc2/s;->d(Lu3/a0;Lc2/v;ILc2/s$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    invoke-virtual {p1, v0}, Lu3/a0;->R(I)V

    iget-object p1, p0, Lf2/d;->d:Lc2/s$a;

    iget-wide p1, p1, Lc2/s$a;->a:J

    return-wide p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_5

    :goto_2
    invoke-virtual {p1}, Lu3/a0;->g()I

    move-result p2

    iget v1, p0, Lf2/d;->j:I

    sub-int/2addr p2, v1

    if-gt v0, p2, :cond_4

    invoke-virtual {p1, v0}, Lu3/a0;->R(I)V

    const/4 p2, 0x0

    :try_start_0
    iget-object v1, p0, Lf2/d;->i:Lc2/v;

    iget v2, p0, Lf2/d;->k:I

    iget-object v3, p0, Lf2/d;->d:Lc2/s$a;

    invoke-static {p1, v1, v2, v3}, Lc2/s;->d(Lu3/a0;Lc2/v;ILc2/s$a;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move v1, p2

    :goto_3
    invoke-virtual {p1}, Lu3/a0;->f()I

    move-result v2

    invoke-virtual {p1}, Lu3/a0;->g()I

    move-result v3

    if-le v2, v3, :cond_2

    goto :goto_4

    :cond_2
    move p2, v1

    :goto_4
    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lu3/a0;->g()I

    move-result p2

    invoke-virtual {p1, p2}, Lu3/a0;->R(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v0}, Lu3/a0;->R(I)V

    :goto_5
    const-wide/16 p1, -0x1

    return-wide p1
.end method

.method private f(Lc2/m;)V
    .locals 5

    invoke-static {p1}, Lc2/t;->b(Lc2/m;)I

    move-result v0

    iput v0, p0, Lf2/d;->k:I

    iget-object v0, p0, Lf2/d;->e:Lc2/n;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/n;

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v1

    invoke-interface {p1}, Lc2/m;->a()J

    move-result-wide v3

    invoke-direct {p0, v1, v2, v3, v4}, Lf2/d;->h(JJ)Lc2/b0;

    move-result-object p1

    invoke-interface {v0, p1}, Lc2/n;->p(Lc2/b0;)V

    const/4 p1, 0x5

    iput p1, p0, Lf2/d;->g:I

    return-void
.end method

.method private h(JJ)Lc2/b0;
    .locals 8

    iget-object v0, p0, Lf2/d;->i:Lc2/v;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lf2/d;->i:Lc2/v;

    iget-object v0, v2, Lc2/v;->k:Lc2/v$a;

    if-eqz v0, :cond_0

    new-instance p3, Lc2/u;

    invoke-direct {p3, v2, p1, p2}, Lc2/u;-><init>(Lc2/v;J)V

    return-object p3

    :cond_0
    const-wide/16 v0, -0x1

    cmp-long v0, p3, v0

    if-eqz v0, :cond_1

    iget-wide v0, v2, Lc2/v;->j:J

    const-wide/16 v3, 0x0

    cmp-long v0, v0, v3

    if-lez v0, :cond_1

    new-instance v0, Lf2/b;

    iget v3, p0, Lf2/d;->k:I

    move-object v1, v0

    move-wide v4, p1

    move-wide v6, p3

    invoke-direct/range {v1 .. v7}, Lf2/b;-><init>(Lc2/v;IJJ)V

    iput-object v0, p0, Lf2/d;->l:Lf2/b;

    invoke-virtual {v0}, Lc2/a;->b()Lc2/b0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lc2/b0$b;

    invoke-virtual {v2}, Lc2/v;->f()J

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Lc2/b0$b;-><init>(J)V

    return-object p1
.end method

.method private i(Lc2/m;)V
    .locals 3

    iget-object v0, p0, Lf2/d;->a:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lc2/m;->o([BII)V

    invoke-interface {p1}, Lc2/m;->i()V

    const/4 p1, 0x2

    iput p1, p0, Lf2/d;->g:I

    return-void
.end method

.method private static synthetic k()[Lc2/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc2/l;

    new-instance v1, Lf2/d;

    invoke-direct {v1}, Lf2/d;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private l()V
    .locals 11

    iget-wide v0, p0, Lf2/d;->n:J

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    iget-object v2, p0, Lf2/d;->i:Lc2/v;

    invoke-static {v2}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc2/v;

    iget v2, v2, Lc2/v;->e:I

    int-to-long v2, v2

    div-long v5, v0, v2

    iget-object v0, p0, Lf2/d;->f:Lc2/e0;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lc2/e0;

    iget v8, p0, Lf2/d;->m:I

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lc2/e0;->e(JIIILc2/e0$a;)V

    return-void
.end method

.method private m(Lc2/m;Lc2/a0;)I
    .locals 6

    iget-object v0, p0, Lf2/d;->f:Lc2/e0;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lf2/d;->i:Lc2/v;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lf2/d;->l:Lf2/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf2/d;->l:Lf2/b;

    invoke-virtual {v0, p1, p2}, Lc2/a;->c(Lc2/m;Lc2/a0;)I

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, Lf2/d;->n:J

    const-wide/16 v2, -0x1

    cmp-long p2, v0, v2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iget-object p2, p0, Lf2/d;->i:Lc2/v;

    invoke-static {p1, p2}, Lc2/s;->i(Lc2/m;Lc2/v;)J

    move-result-wide p1

    iput-wide p1, p0, Lf2/d;->n:J

    return v0

    :cond_1
    iget-object p2, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {p2}, Lu3/a0;->g()I

    move-result p2

    const v1, 0x8000

    if-ge p2, v1, :cond_4

    iget-object v4, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {v4}, Lu3/a0;->e()[B

    move-result-object v4

    sub-int/2addr v1, p2

    invoke-interface {p1, v4, p2, v1}, Lc2/m;->b([BII)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    move v4, v0

    :goto_0
    if-nez v4, :cond_3

    iget-object v1, p0, Lf2/d;->b:Lu3/a0;

    add-int/2addr p2, p1

    invoke-virtual {v1, p2}, Lu3/a0;->Q(I)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->a()I

    move-result p1

    if-nez p1, :cond_5

    invoke-direct {p0}, Lf2/d;->l()V

    return v1

    :cond_4
    move v4, v0

    :cond_5
    :goto_1
    iget-object p1, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->f()I

    move-result p1

    iget p2, p0, Lf2/d;->m:I

    iget v1, p0, Lf2/d;->j:I

    if-ge p2, v1, :cond_6

    iget-object v5, p0, Lf2/d;->b:Lu3/a0;

    sub-int/2addr v1, p2

    invoke-virtual {v5}, Lu3/a0;->a()I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {v5, p2}, Lu3/a0;->S(I)V

    :cond_6
    iget-object p2, p0, Lf2/d;->b:Lu3/a0;

    invoke-direct {p0, p2, v4}, Lf2/d;->e(Lu3/a0;Z)J

    move-result-wide v4

    iget-object p2, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {p2}, Lu3/a0;->f()I

    move-result p2

    sub-int/2addr p2, p1

    iget-object v1, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {v1, p1}, Lu3/a0;->R(I)V

    iget-object p1, p0, Lf2/d;->f:Lc2/e0;

    iget-object v1, p0, Lf2/d;->b:Lu3/a0;

    invoke-interface {p1, v1, p2}, Lc2/e0;->b(Lu3/a0;I)V

    iget p1, p0, Lf2/d;->m:I

    add-int/2addr p1, p2

    iput p1, p0, Lf2/d;->m:I

    cmp-long p1, v4, v2

    if-eqz p1, :cond_7

    invoke-direct {p0}, Lf2/d;->l()V

    iput v0, p0, Lf2/d;->m:I

    iput-wide v4, p0, Lf2/d;->n:J

    :cond_7
    iget-object p1, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->a()I

    move-result p1

    const/16 p2, 0x10

    if-ge p1, p2, :cond_8

    iget-object p1, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->a()I

    move-result p1

    iget-object p2, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {p2}, Lu3/a0;->e()[B

    move-result-object p2

    iget-object v1, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->f()I

    move-result v1

    iget-object v2, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {v2}, Lu3/a0;->e()[B

    move-result-object v2

    invoke-static {p2, v1, v2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p2, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {p2, v0}, Lu3/a0;->R(I)V

    iget-object p2, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {p2, p1}, Lu3/a0;->Q(I)V

    :cond_8
    return v0
.end method

.method private n(Lc2/m;)V
    .locals 2

    iget-boolean v0, p0, Lf2/d;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {p1, v0}, Lc2/t;->d(Lc2/m;Z)Lp2/a;

    move-result-object p1

    iput-object p1, p0, Lf2/d;->h:Lp2/a;

    iput v1, p0, Lf2/d;->g:I

    return-void
.end method

.method private o(Lc2/m;)V
    .locals 3

    new-instance v0, Lc2/t$a;

    iget-object v1, p0, Lf2/d;->i:Lc2/v;

    invoke-direct {v0, v1}, Lc2/t$a;-><init>(Lc2/v;)V

    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_0

    invoke-static {p1, v0}, Lc2/t;->e(Lc2/m;Lc2/t$a;)Z

    move-result v1

    iget-object v2, v0, Lc2/t$a;->a:Lc2/v;

    invoke-static {v2}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc2/v;

    iput-object v2, p0, Lf2/d;->i:Lc2/v;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lf2/d;->i:Lc2/v;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lf2/d;->i:Lc2/v;

    iget p1, p1, Lc2/v;->c:I

    const/4 v0, 0x6

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lf2/d;->j:I

    iget-object p1, p0, Lf2/d;->f:Lc2/e0;

    invoke-static {p1}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc2/e0;

    iget-object v0, p0, Lf2/d;->i:Lc2/v;

    iget-object v1, p0, Lf2/d;->a:[B

    iget-object v2, p0, Lf2/d;->h:Lp2/a;

    invoke-virtual {v0, v1, v2}, Lc2/v;->g([BLp2/a;)Lx1/n1;

    move-result-object v0

    invoke-interface {p1, v0}, Lc2/e0;->a(Lx1/n1;)V

    const/4 p1, 0x4

    iput p1, p0, Lf2/d;->g:I

    return-void
.end method

.method private p(Lc2/m;)V
    .locals 0

    invoke-static {p1}, Lc2/t;->i(Lc2/m;)V

    const/4 p1, 0x3

    iput p1, p0, Lf2/d;->g:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    const/4 p2, 0x0

    if-nez p1, :cond_0

    iput p2, p0, Lf2/d;->g:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lf2/d;->l:Lf2/b;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p3, p4}, Lc2/a;->h(J)V

    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v0, -0x1

    :goto_1
    iput-wide v0, p0, Lf2/d;->n:J

    iput p2, p0, Lf2/d;->m:I

    iget-object p1, p0, Lf2/d;->b:Lu3/a0;

    invoke-virtual {p1, p2}, Lu3/a0;->N(I)V

    return-void
.end method

.method public c(Lc2/n;)V
    .locals 2

    iput-object p1, p0, Lf2/d;->e:Lc2/n;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lc2/n;->d(II)Lc2/e0;

    move-result-object v0

    iput-object v0, p0, Lf2/d;->f:Lc2/e0;

    invoke-interface {p1}, Lc2/n;->i()V

    return-void
.end method

.method public g(Lc2/m;Lc2/a0;)I
    .locals 3

    iget v0, p0, Lf2/d;->g:I

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1, p2}, Lf2/d;->m(Lc2/m;Lc2/a0;)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p1}, Lf2/d;->f(Lc2/m;)V

    return v1

    :cond_2
    invoke-direct {p0, p1}, Lf2/d;->o(Lc2/m;)V

    return v1

    :cond_3
    invoke-direct {p0, p1}, Lf2/d;->p(Lc2/m;)V

    return v1

    :cond_4
    invoke-direct {p0, p1}, Lf2/d;->i(Lc2/m;)V

    return v1

    :cond_5
    invoke-direct {p0, p1}, Lf2/d;->n(Lc2/m;)V

    return v1
.end method

.method public j(Lc2/m;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lc2/t;->c(Lc2/m;Z)Lp2/a;

    invoke-static {p1}, Lc2/t;->a(Lc2/m;)Z

    move-result p1

    return p1
.end method
