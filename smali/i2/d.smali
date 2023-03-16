.class final Li2/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li2/d$a;
    }
.end annotation


# direct methods
.method public static a(Lx1/m;)Z
    .locals 4

    new-instance v0, Lp3/a0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    invoke-static {p0, v0}, Li2/d$a;->a(Lx1/m;Lp3/a0;)Li2/d$a;

    move-result-object v1

    iget v1, v1, Li2/d$a;->a:I

    const/4 v2, 0x0

    const v3, 0x52494646

    if-eq v1, v3, :cond_0

    const v3, 0x52463634

    if-eq v1, v3, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Lp3/a0;->d()[B

    move-result-object v1

    const/4 v3, 0x4

    invoke-interface {p0, v1, v2, v3}, Lx1/m;->o([BII)V

    invoke-virtual {v0, v2}, Lp3/a0;->O(I)V

    invoke-virtual {v0}, Lp3/a0;->m()I

    move-result p0

    const v0, 0x57415645

    if-eq p0, v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported form type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "WavHeaderReader"

    invoke-static {v0, p0}, Lp3/r;->c(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static b(Lx1/m;)Li2/c;
    .locals 13

    new-instance v0, Lp3/a0;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    const v2, 0x666d7420

    invoke-static {v2, p0, v0}, Li2/d;->d(ILx1/m;Lp3/a0;)Li2/d$a;

    move-result-object v2

    iget-wide v3, v2, Li2/d$a;->b:J

    const-wide/16 v5, 0x10

    cmp-long v3, v3, v5

    const/4 v4, 0x0

    if-ltz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    invoke-static {v3}, Lp3/a;->f(Z)V

    invoke-virtual {v0}, Lp3/a0;->d()[B

    move-result-object v3

    invoke-interface {p0, v3, v4, v1}, Lx1/m;->o([BII)V

    invoke-virtual {v0, v4}, Lp3/a0;->O(I)V

    invoke-virtual {v0}, Lp3/a0;->u()I

    move-result v6

    invoke-virtual {v0}, Lp3/a0;->u()I

    move-result v7

    invoke-virtual {v0}, Lp3/a0;->t()I

    move-result v8

    invoke-virtual {v0}, Lp3/a0;->t()I

    move-result v9

    invoke-virtual {v0}, Lp3/a0;->u()I

    move-result v10

    invoke-virtual {v0}, Lp3/a0;->u()I

    move-result v11

    iget-wide v2, v2, Li2/d$a;->b:J

    long-to-int v0, v2

    sub-int/2addr v0, v1

    if-lez v0, :cond_1

    new-array v1, v0, [B

    invoke-interface {p0, v1, v4, v0}, Lx1/m;->o([BII)V

    move-object v12, v1

    goto :goto_1

    :cond_1
    sget-object v0, Lp3/m0;->f:[B

    move-object v12, v0

    :goto_1
    invoke-interface {p0}, Lx1/m;->m()J

    move-result-wide v0

    invoke-interface {p0}, Lx1/m;->q()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    invoke-interface {p0, v0}, Lx1/m;->h(I)V

    new-instance p0, Li2/c;

    move-object v5, p0

    invoke-direct/range {v5 .. v12}, Li2/c;-><init>(IIIIII[B)V

    return-object p0
.end method

.method public static c(Lx1/m;)J
    .locals 7

    new-instance v0, Lp3/a0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    invoke-static {p0, v0}, Li2/d$a;->a(Lx1/m;Lp3/a0;)Li2/d$a;

    move-result-object v2

    iget v3, v2, Li2/d$a;->a:I

    const v4, 0x64733634

    if-eq v3, v4, :cond_0

    invoke-interface {p0}, Lx1/m;->g()V

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    invoke-interface {p0, v1}, Lx1/m;->p(I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lp3/a0;->O(I)V

    invoke-virtual {v0}, Lp3/a0;->d()[B

    move-result-object v4

    invoke-interface {p0, v4, v3, v1}, Lx1/m;->o([BII)V

    invoke-virtual {v0}, Lp3/a0;->q()J

    move-result-wide v3

    iget-wide v5, v2, Li2/d$a;->b:J

    long-to-int v0, v5

    add-int/2addr v0, v1

    invoke-interface {p0, v0}, Lx1/m;->h(I)V

    return-wide v3
.end method

.method private static d(ILx1/m;Lp3/a0;)Li2/d$a;
    .locals 5

    :goto_0
    invoke-static {p1, p2}, Li2/d$a;->a(Lx1/m;Lp3/a0;)Li2/d$a;

    move-result-object v0

    iget v1, v0, Li2/d$a;->a:I

    if-eq v1, p0, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring unknown WAV chunk: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Li2/d$a;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WavHeaderReader"

    invoke-static {v2, v1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v1, 0x8

    iget-wide v3, v0, Li2/d$a;->b:J

    add-long/2addr v3, v1

    const-wide/32 v1, 0x7fffffff

    cmp-long v1, v3, v1

    if-gtz v1, :cond_0

    long-to-int v0, v3

    invoke-interface {p1, v0}, Lx1/m;->h(I)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Chunk is too large (~2GB+) to skip; id: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, v0, Li2/d$a;->a:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ls1/h2;->d(Ljava/lang/String;)Ls1/h2;

    move-result-object p0

    throw p0

    :cond_1
    return-object v0
.end method

.method public static e(Lx1/m;)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/m;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lx1/m;->g()V

    new-instance v0, Lp3/a0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    const v2, 0x64617461

    invoke-static {v2, p0, v0}, Li2/d;->d(ILx1/m;Lp3/a0;)Li2/d$a;

    move-result-object v0

    invoke-interface {p0, v1}, Lx1/m;->h(I)V

    invoke-interface {p0}, Lx1/m;->q()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    iget-wide v0, v0, Li2/d$a;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method
