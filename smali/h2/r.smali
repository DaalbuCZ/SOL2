.class public final Lh2/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh2/m;


# instance fields
.field private final a:Lp3/a0;

.field private b:Lx1/e0;

.field private c:Z

.field private d:J

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp3/a0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    iput-object v0, p0, Lh2/r;->a:Lp3/a0;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/r;->d:J

    return-void
.end method


# virtual methods
.method public a(Lp3/a0;)V
    .locals 7

    iget-object v0, p0, Lh2/r;->b:Lx1/e0;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lh2/r;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v0

    iget v1, p0, Lh2/r;->f:I

    const/16 v2, 0xa

    if-ge v1, v2, :cond_3

    rsub-int/lit8 v1, v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p1}, Lp3/a0;->d()[B

    move-result-object v3

    invoke-virtual {p1}, Lp3/a0;->e()I

    move-result v4

    iget-object v5, p0, Lh2/r;->a:Lp3/a0;

    invoke-virtual {v5}, Lp3/a0;->d()[B

    move-result-object v5

    iget v6, p0, Lh2/r;->f:I

    invoke-static {v3, v4, v5, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v3, p0, Lh2/r;->f:I

    add-int/2addr v3, v1

    if-ne v3, v2, :cond_3

    iget-object v1, p0, Lh2/r;->a:Lp3/a0;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp3/a0;->O(I)V

    const/16 v1, 0x49

    iget-object v4, p0, Lh2/r;->a:Lp3/a0;

    invoke-virtual {v4}, Lp3/a0;->C()I

    move-result v4

    if-ne v1, v4, :cond_2

    const/16 v1, 0x44

    iget-object v4, p0, Lh2/r;->a:Lp3/a0;

    invoke-virtual {v4}, Lp3/a0;->C()I

    move-result v4

    if-ne v1, v4, :cond_2

    const/16 v1, 0x33

    iget-object v4, p0, Lh2/r;->a:Lp3/a0;

    invoke-virtual {v4}, Lp3/a0;->C()I

    move-result v4

    if-eq v1, v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lh2/r;->a:Lp3/a0;

    const/4 v3, 0x3

    invoke-virtual {v1, v3}, Lp3/a0;->P(I)V

    iget-object v1, p0, Lh2/r;->a:Lp3/a0;

    invoke-virtual {v1}, Lp3/a0;->B()I

    move-result v1

    add-int/2addr v1, v2

    iput v1, p0, Lh2/r;->e:I

    goto :goto_1

    :cond_2
    :goto_0
    const-string p1, "Id3Reader"

    const-string v0, "Discarding invalid ID3 tag"

    invoke-static {p1, v0}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v3, p0, Lh2/r;->c:Z

    return-void

    :cond_3
    :goto_1
    iget v1, p0, Lh2/r;->e:I

    iget v2, p0, Lh2/r;->f:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lh2/r;->b:Lx1/e0;

    invoke-interface {v1, p1, v0}, Lx1/e0;->d(Lp3/a0;I)V

    iget p1, p0, Lh2/r;->f:I

    add-int/2addr p1, v0

    iput p1, p0, Lh2/r;->f:I

    return-void
.end method

.method public b()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh2/r;->c:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh2/r;->d:J

    return-void
.end method

.method public c(Lx1/n;Lh2/i0$d;)V
    .locals 2

    invoke-virtual {p2}, Lh2/i0$d;->a()V

    invoke-virtual {p2}, Lh2/i0$d;->c()I

    move-result v0

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Lx1/n;->e(II)Lx1/e0;

    move-result-object p1

    iput-object p1, p0, Lh2/r;->b:Lx1/e0;

    new-instance v0, Ls1/m1$b;

    invoke-direct {v0}, Ls1/m1$b;-><init>()V

    invoke-virtual {p2}, Lh2/i0$d;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ls1/m1$b;->S(Ljava/lang/String;)Ls1/m1$b;

    move-result-object p2

    const-string v0, "application/id3"

    invoke-virtual {p2, v0}, Ls1/m1$b;->e0(Ljava/lang/String;)Ls1/m1$b;

    move-result-object p2

    invoke-virtual {p2}, Ls1/m1$b;->E()Ls1/m1;

    move-result-object p2

    invoke-interface {p1, p2}, Lx1/e0;->e(Ls1/m1;)V

    return-void
.end method

.method public d()V
    .locals 8

    iget-object v0, p0, Lh2/r;->b:Lx1/e0;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lh2/r;->c:Z

    if-eqz v0, :cond_2

    iget v5, p0, Lh2/r;->e:I

    if-eqz v5, :cond_2

    iget v0, p0, Lh2/r;->f:I

    if-eq v0, v5, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lh2/r;->d:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lh2/r;->b:Lx1/e0;

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lx1/e0;->c(JIIILx1/e0$a;)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lh2/r;->c:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public e(JI)V
    .locals 2

    and-int/lit8 p3, p3, 0x4

    if-nez p3, :cond_0

    return-void

    :cond_0
    const/4 p3, 0x1

    iput-boolean p3, p0, Lh2/r;->c:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_1

    iput-wide p1, p0, Lh2/r;->d:J

    :cond_1
    const/4 p1, 0x0

    iput p1, p0, Lh2/r;->e:I

    iput p1, p0, Lh2/r;->f:I

    return-void
.end method
