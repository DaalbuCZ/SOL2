.class public final Lh2/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/l;


# static fields
.field public static final d:Lx1/r;


# instance fields
.field private final a:Lh2/f;

.field private final b:Lp3/a0;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lh2/d;->b:Lh2/d;

    sput-object v0, Lh2/e;->d:Lx1/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh2/f;

    invoke-direct {v0}, Lh2/f;-><init>()V

    iput-object v0, p0, Lh2/e;->a:Lh2/f;

    new-instance v0, Lp3/a0;

    const/16 v1, 0x4000

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    iput-object v0, p0, Lh2/e;->b:Lp3/a0;

    return-void
.end method

.method public static synthetic d()[Lx1/l;
    .locals 1

    invoke-static {}, Lh2/e;->e()[Lx1/l;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic e()[Lx1/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx1/l;

    new-instance v1, Lh2/e;

    invoke-direct {v1}, Lh2/e;-><init>()V

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

    iput-boolean p1, p0, Lh2/e;->c:Z

    iget-object p1, p0, Lh2/e;->a:Lh2/f;

    invoke-virtual {p1}, Lh2/f;->b()V

    return-void
.end method

.method public c(Lx1/n;)V
    .locals 4

    iget-object v0, p0, Lh2/e;->a:Lh2/f;

    new-instance v1, Lh2/i0$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lh2/i0$d;-><init>(II)V

    invoke-virtual {v0, p1, v1}, Lh2/f;->c(Lx1/n;Lh2/i0$d;)V

    invoke-interface {p1}, Lx1/n;->i()V

    new-instance v0, Lx1/b0$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lx1/b0$b;-><init>(J)V

    invoke-interface {p1, v0}, Lx1/n;->t(Lx1/b0;)V

    return-void
.end method

.method public i(Lx1/m;Lx1/a0;)I
    .locals 3

    iget-object p2, p0, Lh2/e;->b:Lp3/a0;

    invoke-virtual {p2}, Lp3/a0;->d()[B

    move-result-object p2

    const/4 v0, 0x0

    const/16 v1, 0x4000

    invoke-interface {p1, p2, v0, v1}, Lx1/m;->b([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-object p2, p0, Lh2/e;->b:Lp3/a0;

    invoke-virtual {p2, v0}, Lp3/a0;->O(I)V

    iget-object p2, p0, Lh2/e;->b:Lp3/a0;

    invoke-virtual {p2, p1}, Lp3/a0;->N(I)V

    iget-boolean p1, p0, Lh2/e;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lh2/e;->a:Lh2/f;

    const-wide/16 v1, 0x0

    const/4 p2, 0x4

    invoke-virtual {p1, v1, v2, p2}, Lh2/f;->e(JI)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh2/e;->c:Z

    :cond_1
    iget-object p1, p0, Lh2/e;->a:Lh2/f;

    iget-object p2, p0, Lh2/e;->b:Lp3/a0;

    invoke-virtual {p1, p2}, Lh2/f;->a(Lp3/a0;)V

    return v0
.end method

.method public j(Lx1/m;)Z
    .locals 8

    new-instance v0, Lp3/a0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-virtual {v0}, Lp3/a0;->d()[B

    move-result-object v4

    invoke-interface {p1, v4, v2, v1}, Lx1/m;->o([BII)V

    invoke-virtual {v0, v2}, Lp3/a0;->O(I)V

    invoke-virtual {v0}, Lp3/a0;->F()I

    move-result v4

    const v5, 0x494433

    if-eq v4, v5, :cond_4

    invoke-interface {p1}, Lx1/m;->g()V

    invoke-interface {p1, v3}, Lx1/m;->p(I)V

    move v1, v2

    move v4, v3

    :goto_1
    invoke-virtual {v0}, Lp3/a0;->d()[B

    move-result-object v5

    const/4 v6, 0x7

    invoke-interface {p1, v5, v2, v6}, Lx1/m;->o([BII)V

    invoke-virtual {v0, v2}, Lp3/a0;->O(I)V

    invoke-virtual {v0}, Lp3/a0;->I()I

    move-result v5

    const v6, 0xac40

    if-eq v5, v6, :cond_1

    const v6, 0xac41

    if-eq v5, v6, :cond_1

    invoke-interface {p1}, Lx1/m;->g()V

    add-int/lit8 v4, v4, 0x1

    sub-int v1, v4, v3

    const/16 v5, 0x2000

    if-lt v1, v5, :cond_0

    return v2

    :cond_0
    invoke-interface {p1, v4}, Lx1/m;->p(I)V

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v6, 0x1

    add-int/2addr v1, v6

    const/4 v7, 0x4

    if-lt v1, v7, :cond_2

    return v6

    :cond_2
    invoke-virtual {v0}, Lp3/a0;->d()[B

    move-result-object v6

    invoke-static {v6, v5}, Lu1/c;->e([BI)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_3

    return v2

    :cond_3
    add-int/lit8 v5, v5, -0x7

    invoke-interface {p1, v5}, Lx1/m;->p(I)V

    goto :goto_1

    :cond_4
    const/4 v4, 0x3

    invoke-virtual {v0, v4}, Lp3/a0;->P(I)V

    invoke-virtual {v0}, Lp3/a0;->B()I

    move-result v4

    add-int/lit8 v5, v4, 0xa

    add-int/2addr v3, v5

    invoke-interface {p1, v4}, Lx1/m;->p(I)V

    goto :goto_0
.end method
