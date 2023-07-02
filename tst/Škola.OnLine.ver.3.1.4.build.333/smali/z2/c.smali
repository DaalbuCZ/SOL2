.class public final Lz2/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/c0;


# instance fields
.field private final a:Lc2/r;

.field private b:Lc2/l;

.field private c:Lc2/m;


# direct methods
.method public constructor <init>(Lc2/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/c;->a:Lc2/r;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lz2/c;->b:Lc2/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc2/l;->a()V

    iput-object v1, p0, Lz2/c;->b:Lc2/l;

    :cond_0
    iput-object v1, p0, Lz2/c;->c:Lc2/m;

    return-void
.end method

.method public b(JJ)V
    .locals 1

    iget-object v0, p0, Lz2/c;->b:Lc2/l;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/l;

    invoke-interface {v0, p1, p2, p3, p4}, Lc2/l;->b(JJ)V

    return-void
.end method

.method public c(Lc2/a0;)I
    .locals 2

    iget-object v0, p0, Lz2/c;->b:Lc2/l;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/l;

    iget-object v1, p0, Lz2/c;->c:Lc2/m;

    invoke-static {v1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc2/m;

    invoke-interface {v0, v1, p1}, Lc2/l;->g(Lc2/m;Lc2/a0;)I

    move-result p1

    return p1
.end method

.method public d()J
    .locals 2

    iget-object v0, p0, Lz2/c;->c:Lc2/m;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc2/m;->q()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lz2/c;->b:Lc2/l;

    instance-of v1, v0, Lj2/f;

    if-eqz v1, :cond_0

    check-cast v0, Lj2/f;

    invoke-virtual {v0}, Lj2/f;->k()V

    :cond_0
    return-void
.end method

.method public f(Lt3/i;Landroid/net/Uri;Ljava/util/Map;JJLc2/n;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/i;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;JJ",
            "Lc2/n;",
            ")V"
        }
    .end annotation

    new-instance v6, Lc2/f;

    move-object v0, v6

    move-object v1, p1

    move-wide v2, p4

    move-wide v4, p6

    invoke-direct/range {v0 .. v5}, Lc2/f;-><init>(Lt3/i;JJ)V

    iput-object v6, p0, Lz2/c;->c:Lc2/m;

    iget-object p1, p0, Lz2/c;->b:Lc2/l;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lz2/c;->a:Lc2/r;

    invoke-interface {p1, p2, p3}, Lc2/r;->b(Landroid/net/Uri;Ljava/util/Map;)[Lc2/l;

    move-result-object p1

    array-length p3, p1

    const/4 p6, 0x0

    const/4 p7, 0x1

    if-ne p3, p7, :cond_1

    aget-object p1, p1, p6

    iput-object p1, p0, Lz2/c;->b:Lc2/l;

    goto :goto_4

    :cond_1
    array-length p3, p1

    move v0, p6

    :goto_0
    if-ge v0, p3, :cond_7

    aget-object v1, p1, v0

    :try_start_0
    invoke-interface {v1, v6}, Lc2/l;->j(Lc2/m;)Z

    move-result v2

    if-eqz v2, :cond_2

    iput-object v1, p0, Lz2/c;->b:Lc2/l;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p7}, Lu3/a;->f(Z)V

    invoke-interface {v6}, Lc2/m;->i()V

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lz2/c;->b:Lc2/l;

    if-nez v1, :cond_6

    invoke-interface {v6}, Lc2/m;->q()J

    move-result-wide v1

    cmp-long v1, v1, p4

    if-nez v1, :cond_5

    goto :goto_1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lz2/c;->b:Lc2/l;

    if-nez p2, :cond_3

    invoke-interface {v6}, Lc2/m;->q()J

    move-result-wide p2

    cmp-long p2, p2, p4

    if-nez p2, :cond_4

    :cond_3
    move p6, p7

    :cond_4
    invoke-static {p6}, Lu3/a;->f(Z)V

    invoke-interface {v6}, Lc2/m;->i()V

    throw p1

    :catch_0
    iget-object v1, p0, Lz2/c;->b:Lc2/l;

    if-nez v1, :cond_6

    invoke-interface {v6}, Lc2/m;->q()J

    move-result-wide v1

    cmp-long v1, v1, p4

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    move v1, p6

    goto :goto_2

    :cond_6
    :goto_1
    move v1, p7

    :goto_2
    invoke-static {v1}, Lu3/a;->f(Z)V

    invoke-interface {v6}, Lc2/m;->i()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    :goto_3
    iget-object p3, p0, Lz2/c;->b:Lc2/l;

    if-eqz p3, :cond_8

    :goto_4
    iget-object p1, p0, Lz2/c;->b:Lc2/l;

    invoke-interface {p1, p8}, Lc2/l;->c(Lc2/n;)V

    return-void

    :cond_8
    new-instance p3, Lz2/w0;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "None of the available extractors ("

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lu3/n0;->M([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") could read the stream."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/net/Uri;

    invoke-direct {p3, p1, p2}, Lz2/w0;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    throw p3
.end method
