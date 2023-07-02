.class public Ll2/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/l;


# static fields
.field public static final d:Lc2/r;


# instance fields
.field private a:Lc2/n;

.field private b:Ll2/i;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ll2/c;->b:Ll2/c;

    sput-object v0, Ll2/d;->d:Lc2/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d()[Lc2/l;
    .locals 1

    invoke-static {}, Ll2/d;->e()[Lc2/l;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic e()[Lc2/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc2/l;

    new-instance v1, Ll2/d;

    invoke-direct {v1}, Ll2/d;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private static f(Lu3/a0;)Lu3/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lu3/a0;->R(I)V

    return-object p0
.end method

.method private h(Lc2/m;)Z
    .locals 5
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "streamReader"
        }
        result = true
    .end annotation

    new-instance v0, Ll2/f;

    invoke-direct {v0}, Ll2/f;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll2/f;->a(Lc2/m;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Ll2/f;->b:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_2

    :cond_0
    iget v0, v0, Ll2/f;->i:I

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v2, Lu3/a0;

    invoke-direct {v2, v0}, Lu3/a0;-><init>(I)V

    invoke-virtual {v2}, Lu3/a0;->e()[B

    move-result-object v4

    invoke-interface {p1, v4, v3, v0}, Lc2/m;->o([BII)V

    invoke-static {v2}, Ll2/d;->f(Lu3/a0;)Lu3/a0;

    move-result-object p1

    invoke-static {p1}, Ll2/b;->p(Lu3/a0;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ll2/b;

    invoke-direct {p1}, Ll2/b;-><init>()V

    :goto_0
    iput-object p1, p0, Ll2/d;->b:Ll2/i;

    goto :goto_1

    :cond_1
    invoke-static {v2}, Ll2/d;->f(Lu3/a0;)Lu3/a0;

    move-result-object p1

    invoke-static {p1}, Ll2/j;->r(Lu3/a0;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Ll2/j;

    invoke-direct {p1}, Ll2/j;-><init>()V

    goto :goto_0

    :cond_2
    invoke-static {v2}, Ll2/d;->f(Lu3/a0;)Lu3/a0;

    move-result-object p1

    invoke-static {p1}, Ll2/h;->o(Lu3/a0;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ll2/h;

    invoke-direct {p1}, Ll2/h;-><init>()V

    goto :goto_0

    :goto_1
    return v1

    :cond_3
    :goto_2
    return v3
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 1

    iget-object v0, p0, Ll2/d;->b:Ll2/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Ll2/i;->m(JJ)V

    :cond_0
    return-void
.end method

.method public c(Lc2/n;)V
    .locals 0

    iput-object p1, p0, Ll2/d;->a:Lc2/n;

    return-void
.end method

.method public g(Lc2/m;Lc2/a0;)I
    .locals 4

    iget-object v0, p0, Ll2/d;->a:Lc2/n;

    invoke-static {v0}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ll2/d;->b:Ll2/i;

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Ll2/d;->h(Lc2/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc2/m;->i()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const-string p2, "Failed to determine bitstream type"

    invoke-static {p2, p1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll2/d;->c:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll2/d;->a:Lc2/n;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lc2/n;->d(II)Lc2/e0;

    move-result-object v0

    iget-object v1, p0, Ll2/d;->a:Lc2/n;

    invoke-interface {v1}, Lc2/n;->i()V

    iget-object v1, p0, Ll2/d;->b:Ll2/i;

    iget-object v3, p0, Ll2/d;->a:Lc2/n;

    invoke-virtual {v1, v3, v0}, Ll2/i;->d(Lc2/n;Lc2/e0;)V

    iput-boolean v2, p0, Ll2/d;->c:Z

    :cond_2
    iget-object v0, p0, Ll2/d;->b:Ll2/i;

    invoke-virtual {v0, p1, p2}, Ll2/i;->g(Lc2/m;Lc2/a0;)I

    move-result p1

    return p1
.end method

.method public j(Lc2/m;)Z
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Ll2/d;->h(Lc2/m;)Z

    move-result p1
    :try_end_0
    .catch Lx1/u2; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
