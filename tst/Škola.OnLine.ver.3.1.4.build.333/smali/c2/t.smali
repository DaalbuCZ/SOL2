.class public final Lc2/t;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc2/t$a;
    }
.end annotation


# direct methods
.method public static a(Lc2/m;)Z
    .locals 6

    new-instance v0, Lu3/a0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lu3/a0;-><init>(I)V

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Lc2/m;->o([BII)V

    invoke-virtual {v0}, Lu3/a0;->G()J

    move-result-wide v0

    const-wide/32 v4, 0x664c6143

    cmp-long p0, v0, v4

    if-nez p0, :cond_0

    const/4 v3, 0x1

    :cond_0
    return v3
.end method

.method public static b(Lc2/m;)I
    .locals 4

    invoke-interface {p0}, Lc2/m;->i()V

    new-instance v0, Lu3/a0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lu3/a0;-><init>(I)V

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Lc2/m;->o([BII)V

    invoke-virtual {v0}, Lu3/a0;->K()I

    move-result v0

    shr-int/lit8 v1, v0, 0x2

    const/16 v2, 0x3ffe

    invoke-interface {p0}, Lc2/m;->i()V

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    const-string v0, "First frame does not start with sync code."

    invoke-static {v0, p0}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p0

    throw p0
.end method

.method public static c(Lc2/m;Z)Lp2/a;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    sget-object p1, Lu2/h;->b:Lu2/h$a;

    :goto_0
    new-instance v1, Lc2/y;

    invoke-direct {v1}, Lc2/y;-><init>()V

    invoke-virtual {v1, p0, p1}, Lc2/y;->a(Lc2/m;Lu2/h$a;)Lp2/a;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static d(Lc2/m;Z)Lp2/a;
    .locals 4

    invoke-interface {p0}, Lc2/m;->i()V

    invoke-interface {p0}, Lc2/m;->n()J

    move-result-wide v0

    invoke-static {p0, p1}, Lc2/t;->c(Lc2/m;Z)Lp2/a;

    move-result-object p1

    invoke-interface {p0}, Lc2/m;->n()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int v0, v2

    invoke-interface {p0, v0}, Lc2/m;->j(I)V

    return-object p1
.end method

.method public static e(Lc2/m;Lc2/t$a;)Z
    .locals 7

    invoke-interface {p0}, Lc2/m;->i()V

    new-instance v0, Lu3/z;

    const/4 v1, 0x4

    new-array v2, v1, [B

    invoke-direct {v0, v2}, Lu3/z;-><init>([B)V

    iget-object v2, v0, Lu3/z;->a:[B

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Lc2/m;->o([BII)V

    invoke-virtual {v0}, Lu3/z;->g()Z

    move-result v2

    const/4 v4, 0x7

    invoke-virtual {v0, v4}, Lu3/z;->h(I)I

    move-result v4

    const/16 v5, 0x18

    invoke-virtual {v0, v5}, Lu3/z;->h(I)I

    move-result v0

    add-int/2addr v0, v1

    if-nez v4, :cond_0

    invoke-static {p0}, Lc2/t;->h(Lc2/m;)Lc2/v;

    move-result-object p0

    :goto_0
    iput-object p0, p1, Lc2/t$a;->a:Lc2/v;

    goto :goto_1

    :cond_0
    iget-object v5, p1, Lc2/t$a;->a:Lc2/v;

    if-eqz v5, :cond_4

    const/4 v6, 0x3

    if-ne v4, v6, :cond_1

    invoke-static {p0, v0}, Lc2/t;->f(Lc2/m;I)Lc2/v$a;

    move-result-object p0

    invoke-virtual {v5, p0}, Lc2/v;->b(Lc2/v$a;)Lc2/v;

    move-result-object p0

    goto :goto_0

    :cond_1
    if-ne v4, v1, :cond_2

    invoke-static {p0, v0}, Lc2/t;->j(Lc2/m;I)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v5, p0}, Lc2/v;->c(Ljava/util/List;)Lc2/v;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 v6, 0x6

    if-ne v4, v6, :cond_3

    new-instance v4, Lu3/a0;

    invoke-direct {v4, v0}, Lu3/a0;-><init>(I)V

    invoke-virtual {v4}, Lu3/a0;->e()[B

    move-result-object v6

    invoke-interface {p0, v6, v3, v0}, Lc2/m;->readFully([BII)V

    invoke-virtual {v4, v1}, Lu3/a0;->S(I)V

    invoke-static {v4}, Ls2/a;->a(Lu3/a0;)Ls2/a;

    move-result-object p0

    invoke-static {p0}, Lg5/q;->K(Ljava/lang/Object;)Lg5/q;

    move-result-object p0

    invoke-virtual {v5, p0}, Lc2/v;->a(Ljava/util/List;)Lc2/v;

    move-result-object p0

    goto :goto_0

    :cond_3
    invoke-interface {p0, v0}, Lc2/m;->j(I)V

    :goto_1
    return v2

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method private static f(Lc2/m;I)Lc2/v$a;
    .locals 3

    new-instance v0, Lu3/a0;

    invoke-direct {v0, p1}, Lu3/a0;-><init>(I)V

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2, p1}, Lc2/m;->readFully([BII)V

    invoke-static {v0}, Lc2/t;->g(Lu3/a0;)Lc2/v$a;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lu3/a0;)Lc2/v$a;
    .locals 10

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lu3/a0;->S(I)V

    invoke-virtual {p0}, Lu3/a0;->H()I

    move-result v0

    invoke-virtual {p0}, Lu3/a0;->f()I

    move-result v1

    int-to-long v1, v1

    int-to-long v3, v0

    add-long/2addr v1, v3

    div-int/lit8 v0, v0, 0x12

    new-array v3, v0, [J

    new-array v4, v0, [J

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_1

    invoke-virtual {p0}, Lu3/a0;->x()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v8, v6, v8

    if-nez v8, :cond_0

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    goto :goto_1

    :cond_0
    aput-wide v6, v3, v5

    invoke-virtual {p0}, Lu3/a0;->x()J

    move-result-wide v6

    aput-wide v6, v4, v5

    const/4 v6, 0x2

    invoke-virtual {p0, v6}, Lu3/a0;->S(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lu3/a0;->f()I

    move-result v0

    int-to-long v5, v0

    sub-long/2addr v1, v5

    long-to-int v0, v1

    invoke-virtual {p0, v0}, Lu3/a0;->S(I)V

    new-instance p0, Lc2/v$a;

    invoke-direct {p0, v3, v4}, Lc2/v$a;-><init>([J[J)V

    return-object p0
.end method

.method private static h(Lc2/m;)Lc2/v;
    .locals 3

    const/16 v0, 0x26

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2, v0}, Lc2/m;->readFully([BII)V

    new-instance p0, Lc2/v;

    const/4 v0, 0x4

    invoke-direct {p0, v1, v0}, Lc2/v;-><init>([BI)V

    return-object p0
.end method

.method public static i(Lc2/m;)V
    .locals 4

    new-instance v0, Lu3/a0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lu3/a0;-><init>(I)V

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Lc2/m;->readFully([BII)V

    invoke-virtual {v0}, Lu3/a0;->G()J

    move-result-wide v0

    const-wide/32 v2, 0x664c6143

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    const-string v0, "Failed to read FLAC stream marker."

    invoke-static {v0, p0}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p0

    throw p0
.end method

.method private static j(Lc2/m;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc2/m;",
            "I)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lu3/a0;

    invoke-direct {v0, p1}, Lu3/a0;-><init>(I)V

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2, p1}, Lc2/m;->readFully([BII)V

    const/4 p0, 0x4

    invoke-virtual {v0, p0}, Lu3/a0;->S(I)V

    invoke-static {v0, v2, v2}, Lc2/h0;->j(Lu3/a0;ZZ)Lc2/h0$b;

    move-result-object p0

    iget-object p0, p0, Lc2/h0$b;->b:[Ljava/lang/String;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
