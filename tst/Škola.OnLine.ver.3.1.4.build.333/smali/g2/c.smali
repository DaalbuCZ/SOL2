.class public final Lg2/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/l;


# static fields
.field public static final q:Lc2/r;


# instance fields
.field private final a:Lu3/a0;

.field private final b:Lu3/a0;

.field private final c:Lu3/a0;

.field private final d:Lu3/a0;

.field private final e:Lg2/d;

.field private f:Lc2/n;

.field private g:I

.field private h:Z

.field private i:J

.field private j:I

.field private k:I

.field private l:I

.field private m:J

.field private n:Z

.field private o:Lg2/a;

.field private p:Lg2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lg2/b;->b:Lg2/b;

    sput-object v0, Lg2/c;->q:Lc2/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lu3/a0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lu3/a0;-><init>(I)V

    iput-object v0, p0, Lg2/c;->a:Lu3/a0;

    new-instance v0, Lu3/a0;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lu3/a0;-><init>(I)V

    iput-object v0, p0, Lg2/c;->b:Lu3/a0;

    new-instance v0, Lu3/a0;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lu3/a0;-><init>(I)V

    iput-object v0, p0, Lg2/c;->c:Lu3/a0;

    new-instance v0, Lu3/a0;

    invoke-direct {v0}, Lu3/a0;-><init>()V

    iput-object v0, p0, Lg2/c;->d:Lu3/a0;

    new-instance v0, Lg2/d;

    invoke-direct {v0}, Lg2/d;-><init>()V

    iput-object v0, p0, Lg2/c;->e:Lg2/d;

    const/4 v0, 0x1

    iput v0, p0, Lg2/c;->g:I

    return-void
.end method

.method public static synthetic d()[Lc2/l;
    .locals 1

    invoke-static {}, Lg2/c;->h()[Lc2/l;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 4
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput"
        }
    .end annotation

    iget-boolean v0, p0, Lg2/c;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lg2/c;->f:Lc2/n;

    new-instance v1, Lc2/b0$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Lc2/b0$b;-><init>(J)V

    invoke-interface {v0, v1}, Lc2/n;->p(Lc2/b0;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg2/c;->n:Z

    :cond_0
    return-void
.end method

.method private f()J
    .locals 4

    iget-boolean v0, p0, Lg2/c;->h:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lg2/c;->i:J

    iget-wide v2, p0, Lg2/c;->m:J

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg2/c;->e:Lg2/d;

    invoke-virtual {v0}, Lg2/d;->d()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lg2/c;->m:J

    :goto_0
    return-wide v0
.end method

.method private static synthetic h()[Lc2/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc2/l;

    new-instance v1, Lg2/c;

    invoke-direct {v1}, Lg2/c;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private i(Lc2/m;)Lu3/a0;
    .locals 4

    iget v0, p0, Lg2/c;->l:I

    iget-object v1, p0, Lg2/c;->d:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->b()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lg2/c;->d:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->b()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    iget v3, p0, Lg2/c;->l:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1, v2}, Lu3/a0;->P([BI)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg2/c;->d:Lu3/a0;

    invoke-virtual {v0, v2}, Lu3/a0;->R(I)V

    :goto_0
    iget-object v0, p0, Lg2/c;->d:Lu3/a0;

    iget v1, p0, Lg2/c;->l:I

    invoke-virtual {v0, v1}, Lu3/a0;->Q(I)V

    iget-object v0, p0, Lg2/c;->d:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    iget v1, p0, Lg2/c;->l:I

    invoke-interface {p1, v0, v2, v1}, Lc2/m;->readFully([BII)V

    iget-object p1, p0, Lg2/c;->d:Lu3/a0;

    return-object p1
.end method

.method private k(Lc2/m;)Z
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput"
        }
    .end annotation

    iget-object v0, p0, Lg2/c;->b:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Lc2/m;->e([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lg2/c;->b:Lu3/a0;

    invoke-virtual {p1, v1}, Lu3/a0;->R(I)V

    iget-object p1, p0, Lg2/c;->b:Lu3/a0;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lu3/a0;->S(I)V

    iget-object p1, p0, Lg2/c;->b:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->E()I

    move-result p1

    and-int/lit8 v4, p1, 0x4

    if-eqz v4, :cond_1

    move v4, v3

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    and-int/2addr p1, v3

    if-eqz p1, :cond_2

    move v1, v3

    :cond_2
    if-eqz v4, :cond_3

    iget-object p1, p0, Lg2/c;->o:Lg2/a;

    if-nez p1, :cond_3

    new-instance p1, Lg2/a;

    iget-object v4, p0, Lg2/c;->f:Lc2/n;

    const/16 v5, 0x8

    invoke-interface {v4, v5, v3}, Lc2/n;->d(II)Lc2/e0;

    move-result-object v4

    invoke-direct {p1, v4}, Lg2/a;-><init>(Lc2/e0;)V

    iput-object p1, p0, Lg2/c;->o:Lg2/a;

    :cond_3
    const/4 p1, 0x2

    if-eqz v1, :cond_4

    iget-object v1, p0, Lg2/c;->p:Lg2/f;

    if-nez v1, :cond_4

    new-instance v1, Lg2/f;

    iget-object v4, p0, Lg2/c;->f:Lc2/n;

    invoke-interface {v4, v2, p1}, Lc2/n;->d(II)Lc2/e0;

    move-result-object v4

    invoke-direct {v1, v4}, Lg2/f;-><init>(Lc2/e0;)V

    iput-object v1, p0, Lg2/c;->p:Lg2/f;

    :cond_4
    iget-object v1, p0, Lg2/c;->f:Lc2/n;

    invoke-interface {v1}, Lc2/n;->i()V

    iget-object v1, p0, Lg2/c;->b:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->n()I

    move-result v1

    sub-int/2addr v1, v2

    add-int/2addr v1, v0

    iput v1, p0, Lg2/c;->j:I

    iput p1, p0, Lg2/c;->g:I

    return v3
.end method

.method private l(Lc2/m;)Z
    .locals 9
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput"
        }
    .end annotation

    invoke-direct {p0}, Lg2/c;->f()J

    move-result-wide v0

    iget v2, p0, Lg2/c;->k:I

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/16 v7, 0x8

    if-ne v2, v7, :cond_1

    iget-object v7, p0, Lg2/c;->o:Lg2/a;

    if-eqz v7, :cond_1

    invoke-direct {p0}, Lg2/c;->e()V

    iget-object v2, p0, Lg2/c;->o:Lg2/a;

    :goto_0
    invoke-direct {p0, p1}, Lg2/c;->i(Lc2/m;)Lu3/a0;

    move-result-object p1

    invoke-virtual {v2, p1, v0, v1}, Lg2/e;->a(Lu3/a0;J)Z

    move-result v5

    :cond_0
    :goto_1
    move p1, v6

    goto :goto_2

    :cond_1
    const/16 v7, 0x9

    if-ne v2, v7, :cond_2

    iget-object v7, p0, Lg2/c;->p:Lg2/f;

    if-eqz v7, :cond_2

    invoke-direct {p0}, Lg2/c;->e()V

    iget-object v2, p0, Lg2/c;->p:Lg2/f;

    goto :goto_0

    :cond_2
    const/16 v7, 0x12

    if-ne v2, v7, :cond_3

    iget-boolean v2, p0, Lg2/c;->n:Z

    if-nez v2, :cond_3

    iget-object v2, p0, Lg2/c;->e:Lg2/d;

    invoke-direct {p0, p1}, Lg2/c;->i(Lc2/m;)Lu3/a0;

    move-result-object p1

    invoke-virtual {v2, p1, v0, v1}, Lg2/e;->a(Lu3/a0;J)Z

    move-result v5

    iget-object p1, p0, Lg2/c;->e:Lg2/d;

    invoke-virtual {p1}, Lg2/d;->d()J

    move-result-wide v0

    cmp-long p1, v0, v3

    if-eqz p1, :cond_0

    iget-object p1, p0, Lg2/c;->f:Lc2/n;

    new-instance v2, Lc2/z;

    iget-object v7, p0, Lg2/c;->e:Lg2/d;

    invoke-virtual {v7}, Lg2/d;->e()[J

    move-result-object v7

    iget-object v8, p0, Lg2/c;->e:Lg2/d;

    invoke-virtual {v8}, Lg2/d;->f()[J

    move-result-object v8

    invoke-direct {v2, v7, v8, v0, v1}, Lc2/z;-><init>([J[JJ)V

    invoke-interface {p1, v2}, Lc2/n;->p(Lc2/b0;)V

    iput-boolean v6, p0, Lg2/c;->n:Z

    goto :goto_1

    :cond_3
    iget v0, p0, Lg2/c;->l:I

    invoke-interface {p1, v0}, Lc2/m;->j(I)V

    move p1, v5

    :goto_2
    iget-boolean v0, p0, Lg2/c;->h:Z

    if-nez v0, :cond_5

    if-eqz v5, :cond_5

    iput-boolean v6, p0, Lg2/c;->h:Z

    iget-object v0, p0, Lg2/c;->e:Lg2/d;

    invoke-virtual {v0}, Lg2/d;->d()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-nez v0, :cond_4

    iget-wide v0, p0, Lg2/c;->m:J

    neg-long v0, v0

    goto :goto_3

    :cond_4
    const-wide/16 v0, 0x0

    :goto_3
    iput-wide v0, p0, Lg2/c;->i:J

    :cond_5
    const/4 v0, 0x4

    iput v0, p0, Lg2/c;->j:I

    const/4 v0, 0x2

    iput v0, p0, Lg2/c;->g:I

    return p1
.end method

.method private m(Lc2/m;)Z
    .locals 6

    iget-object v0, p0, Lg2/c;->c:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xb

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Lc2/m;->e([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lg2/c;->c:Lu3/a0;

    invoke-virtual {p1, v1}, Lu3/a0;->R(I)V

    iget-object p1, p0, Lg2/c;->c:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->E()I

    move-result p1

    iput p1, p0, Lg2/c;->k:I

    iget-object p1, p0, Lg2/c;->c:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->H()I

    move-result p1

    iput p1, p0, Lg2/c;->l:I

    iget-object p1, p0, Lg2/c;->c:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->H()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lg2/c;->m:J

    iget-object p1, p0, Lg2/c;->c:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->E()I

    move-result p1

    shl-int/lit8 p1, p1, 0x18

    int-to-long v0, p1

    iget-wide v4, p0, Lg2/c;->m:J

    or-long/2addr v0, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    iput-wide v0, p0, Lg2/c;->m:J

    iget-object p1, p0, Lg2/c;->c:Lu3/a0;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lu3/a0;->S(I)V

    const/4 p1, 0x4

    iput p1, p0, Lg2/c;->g:I

    return v3
.end method

.method private n(Lc2/m;)V
    .locals 1

    iget v0, p0, Lg2/c;->j:I

    invoke-interface {p1, v0}, Lc2/m;->j(I)V

    const/4 p1, 0x0

    iput p1, p0, Lg2/c;->j:I

    const/4 p1, 0x3

    iput p1, p0, Lg2/c;->g:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 0

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lg2/c;->g:I

    iput-boolean p2, p0, Lg2/c;->h:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    iput p1, p0, Lg2/c;->g:I

    :goto_0
    iput p2, p0, Lg2/c;->j:I

    return-void
.end method

.method public c(Lc2/n;)V
    .locals 0

    iput-object p1, p0, Lg2/c;->f:Lc2/n;

    return-void
.end method

.method public g(Lc2/m;Lc2/a0;)I
    .locals 2

    iget-object p2, p0, Lg2/c;->f:Lc2/n;

    invoke-static {p2}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    iget p2, p0, Lg2/c;->g:I

    const/4 v0, 0x1

    const/4 v1, -0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    invoke-direct {p0, p1}, Lg2/c;->l(Lc2/m;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    invoke-direct {p0, p1}, Lg2/c;->m(Lc2/m;)Z

    move-result p2

    if-nez p2, :cond_0

    return v1

    :cond_3
    invoke-direct {p0, p1}, Lg2/c;->n(Lc2/m;)V

    goto :goto_0

    :cond_4
    invoke-direct {p0, p1}, Lg2/c;->k(Lc2/m;)Z

    move-result p2

    if-nez p2, :cond_0

    return v1
.end method

.method public j(Lc2/m;)Z
    .locals 3

    iget-object v0, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {p1, v0, v1, v2}, Lc2/m;->o([BII)V

    iget-object v0, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {v0, v1}, Lu3/a0;->R(I)V

    iget-object v0, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->H()I

    move-result v0

    const v2, 0x464c56

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x2

    invoke-interface {p1, v0, v1, v2}, Lc2/m;->o([BII)V

    iget-object v0, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {v0, v1}, Lu3/a0;->R(I)V

    iget-object v0, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->K()I

    move-result v0

    and-int/lit16 v0, v0, 0xfa

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Lc2/m;->o([BII)V

    iget-object v0, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {v0, v1}, Lu3/a0;->R(I)V

    iget-object v0, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->n()I

    move-result v0

    invoke-interface {p1}, Lc2/m;->i()V

    invoke-interface {p1, v0}, Lc2/m;->p(I)V

    iget-object v0, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v1, v2}, Lc2/m;->o([BII)V

    iget-object p1, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {p1, v1}, Lu3/a0;->R(I)V

    iget-object p1, p0, Lg2/c;->a:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->n()I

    move-result p1

    if-nez p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method
