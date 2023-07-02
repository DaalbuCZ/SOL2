.class public final Lm2/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/l;


# static fields
.field public static final d:Lc2/r;


# instance fields
.field private final a:Lm2/f;

.field private final b:Lu3/a0;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm2/d;->b:Lm2/d;

    sput-object v0, Lm2/e;->d:Lc2/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm2/f;

    invoke-direct {v0}, Lm2/f;-><init>()V

    iput-object v0, p0, Lm2/e;->a:Lm2/f;

    new-instance v0, Lu3/a0;

    const/16 v1, 0x4000

    invoke-direct {v0, v1}, Lu3/a0;-><init>(I)V

    iput-object v0, p0, Lm2/e;->b:Lu3/a0;

    return-void
.end method

.method public static synthetic d()[Lc2/l;
    .locals 1

    invoke-static {}, Lm2/e;->e()[Lc2/l;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic e()[Lc2/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc2/l;

    new-instance v1, Lm2/e;

    invoke-direct {v1}, Lm2/e;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lm2/e;->c:Z

    iget-object p1, p0, Lm2/e;->a:Lm2/f;

    invoke-virtual {p1}, Lm2/f;->a()V

    return-void
.end method

.method public c(Lc2/n;)V
    .locals 4

    iget-object v0, p0, Lm2/e;->a:Lm2/f;

    new-instance v1, Lm2/i0$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lm2/i0$d;-><init>(II)V

    invoke-virtual {v0, p1, v1}, Lm2/f;->c(Lc2/n;Lm2/i0$d;)V

    invoke-interface {p1}, Lc2/n;->i()V

    new-instance v0, Lc2/b0$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lc2/b0$b;-><init>(J)V

    invoke-interface {p1, v0}, Lc2/n;->p(Lc2/b0;)V

    return-void
.end method

.method public g(Lc2/m;Lc2/a0;)I
    .locals 3

    iget-object p2, p0, Lm2/e;->b:Lu3/a0;

    invoke-virtual {p2}, Lu3/a0;->e()[B

    move-result-object p2

    const/4 v0, 0x0

    const/16 v1, 0x4000

    invoke-interface {p1, p2, v0, v1}, Lc2/m;->b([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-object p2, p0, Lm2/e;->b:Lu3/a0;

    invoke-virtual {p2, v0}, Lu3/a0;->R(I)V

    iget-object p2, p0, Lm2/e;->b:Lu3/a0;

    invoke-virtual {p2, p1}, Lu3/a0;->Q(I)V

    iget-boolean p1, p0, Lm2/e;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lm2/e;->a:Lm2/f;

    const-wide/16 v1, 0x0

    const/4 p2, 0x4

    invoke-virtual {p1, v1, v2, p2}, Lm2/f;->e(JI)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm2/e;->c:Z

    :cond_1
    iget-object p1, p0, Lm2/e;->a:Lm2/f;

    iget-object p2, p0, Lm2/e;->b:Lu3/a0;

    invoke-virtual {p1, p2}, Lm2/f;->b(Lu3/a0;)V

    return v0
.end method

.method public j(Lc2/m;)Z
    .locals 8

    new-instance v0, Lu3/a0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lu3/a0;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v4

    invoke-interface {p1, v4, v2, v1}, Lc2/m;->o([BII)V

    invoke-virtual {v0, v2}, Lu3/a0;->R(I)V

    invoke-virtual {v0}, Lu3/a0;->H()I

    move-result v4

    const v5, 0x494433

    if-eq v4, v5, :cond_4

    invoke-interface {p1}, Lc2/m;->i()V

    invoke-interface {p1, v3}, Lc2/m;->p(I)V

    move v1, v2

    move v4, v3

    :goto_1
    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v5

    const/4 v6, 0x7

    invoke-interface {p1, v5, v2, v6}, Lc2/m;->o([BII)V

    invoke-virtual {v0, v2}, Lu3/a0;->R(I)V

    invoke-virtual {v0}, Lu3/a0;->K()I

    move-result v5

    const v6, 0xac40

    if-eq v5, v6, :cond_1

    const v6, 0xac41

    if-eq v5, v6, :cond_1

    invoke-interface {p1}, Lc2/m;->i()V

    add-int/lit8 v4, v4, 0x1

    sub-int v1, v4, v3

    const/16 v5, 0x2000

    if-lt v1, v5, :cond_0

    return v2

    :cond_0
    invoke-interface {p1, v4}, Lc2/m;->p(I)V

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v6, 0x1

    add-int/2addr v1, v6

    const/4 v7, 0x4

    if-lt v1, v7, :cond_2

    return v6

    :cond_2
    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v6

    invoke-static {v6, v5}, Lz1/c;->e([BI)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_3

    return v2

    :cond_3
    add-int/lit8 v5, v5, -0x7

    invoke-interface {p1, v5}, Lc2/m;->p(I)V

    goto :goto_1

    :cond_4
    const/4 v4, 0x3

    invoke-virtual {v0, v4}, Lu3/a0;->S(I)V

    invoke-virtual {v0}, Lu3/a0;->D()I

    move-result v4

    add-int/lit8 v5, v4, 0xa

    add-int/2addr v3, v5

    invoke-interface {p1, v4}, Lc2/m;->p(I)V

    goto :goto_0
.end method
