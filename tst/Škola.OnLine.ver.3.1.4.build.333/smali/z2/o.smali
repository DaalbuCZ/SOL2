.class public final Lz2/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/r;
.implements Lz2/r$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/o$a;
    }
.end annotation


# instance fields
.field public final n:Lz2/u$b;

.field private final o:J

.field private final p:Lt3/b;

.field private q:Lz2/u;

.field private r:Lz2/r;

.field private s:Lz2/r$a;

.field private t:Lz2/o$a;

.field private u:Z

.field private v:J


# direct methods
.method public constructor <init>(Lz2/u$b;Lt3/b;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/o;->n:Lz2/u$b;

    iput-object p2, p0, Lz2/o;->p:Lt3/b;

    iput-wide p3, p0, Lz2/o;->o:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lz2/o;->v:J

    return-void
.end method

.method private u(J)J
    .locals 4

    iget-wide v0, p0, Lz2/o;->v:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    move-wide p1, v0

    :cond_0
    return-wide p1
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz2/r;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/r;

    invoke-interface {v0}, Lz2/r;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Lz2/r;)V
    .locals 1

    iget-object p1, p0, Lz2/o;->s:Lz2/r$a;

    invoke-static {p1}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/r$a;

    invoke-interface {p1, p0}, Lz2/r$a;->d(Lz2/r;)V

    iget-object p1, p0, Lz2/o;->t:Lz2/o$a;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lz2/o;->n:Lz2/u$b;

    invoke-interface {p1, v0}, Lz2/o$a;->b(Lz2/u$b;)V

    :cond_0
    return-void
.end method

.method public e(JLx1/q3;)J
    .locals 1

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/r;

    invoke-interface {v0, p1, p2, p3}, Lz2/r;->e(JLx1/q3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/r;

    invoke-interface {v0}, Lz2/r;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)Z
    .locals 1

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lz2/r;->g(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public h(J)V
    .locals 1

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/r;

    invoke-interface {v0, p1, p2}, Lz2/r;->h(J)V

    return-void
.end method

.method public i(Lz2/u$b;)V
    .locals 4

    iget-wide v0, p0, Lz2/o;->o:J

    invoke-direct {p0, v0, v1}, Lz2/o;->u(J)J

    move-result-wide v0

    iget-object v2, p0, Lz2/o;->q:Lz2/u;

    invoke-static {v2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz2/u;

    iget-object v3, p0, Lz2/o;->p:Lt3/b;

    invoke-interface {v2, p1, v3, v0, v1}, Lz2/u;->j(Lz2/u$b;Lt3/b;J)Lz2/r;

    move-result-object p1

    iput-object p1, p0, Lz2/o;->r:Lz2/r;

    iget-object v2, p0, Lz2/o;->s:Lz2/r$a;

    if-eqz v2, :cond_0

    invoke-interface {p1, p0, v0, v1}, Lz2/r;->n(Lz2/r$a;J)V

    :cond_0
    return-void
.end method

.method public j([Ls3/t;[Z[Lz2/n0;[ZJ)J
    .locals 13

    move-object v0, p0

    iget-wide v1, v0, Lz2/o;->v:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, v0, Lz2/o;->o:J

    cmp-long v5, p5, v5

    if-nez v5, :cond_0

    iput-wide v3, v0, Lz2/o;->v:J

    move-wide v11, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v11, p5

    :goto_0
    iget-object v1, v0, Lz2/o;->r:Lz2/r;

    invoke-static {v1}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lz2/r;

    move-object v7, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    invoke-interface/range {v6 .. v12}, Lz2/r;->j([Ls3/t;[Z[Lz2/n0;[ZJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public bridge synthetic k(Lz2/o0;)V
    .locals 0

    check-cast p1, Lz2/r;

    invoke-virtual {p0, p1}, Lz2/o;->v(Lz2/r;)V

    return-void
.end method

.method public l()J
    .locals 2

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/r;

    invoke-interface {v0}, Lz2/r;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method public n(Lz2/r$a;J)V
    .locals 0

    iput-object p1, p0, Lz2/o;->s:Lz2/r$a;

    iget-object p1, p0, Lz2/o;->r:Lz2/r;

    if-eqz p1, :cond_0

    iget-wide p2, p0, Lz2/o;->o:J

    invoke-direct {p0, p2, p3}, Lz2/o;->u(J)J

    move-result-wide p2

    invoke-interface {p1, p0, p2, p3}, Lz2/r;->n(Lz2/r$a;J)V

    :cond_0
    return-void
.end method

.method public o()Lz2/v0;
    .locals 1

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/r;

    invoke-interface {v0}, Lz2/r;->o()Lz2/v0;

    move-result-object v0

    return-object v0
.end method

.method public p()J
    .locals 2

    iget-wide v0, p0, Lz2/o;->v:J

    return-wide v0
.end method

.method public q()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz2/r;->q()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz2/o;->q:Lz2/u;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lz2/u;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lz2/o;->t:Lz2/o$a;

    if-eqz v1, :cond_2

    iget-boolean v2, p0, Lz2/o;->u:Z

    if-nez v2, :cond_1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lz2/o;->u:Z

    iget-object v2, p0, Lz2/o;->n:Lz2/u$b;

    invoke-interface {v1, v2, v0}, Lz2/o$a;->a(Lz2/u$b;Ljava/io/IOException;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    throw v0
.end method

.method public r(JZ)V
    .locals 1

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/r;

    invoke-interface {v0, p1, p2, p3}, Lz2/r;->r(JZ)V

    return-void
.end method

.method public s()J
    .locals 2

    iget-wide v0, p0, Lz2/o;->o:J

    return-wide v0
.end method

.method public t(J)J
    .locals 1

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/r;

    invoke-interface {v0, p1, p2}, Lz2/r;->t(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public v(Lz2/r;)V
    .locals 0

    iget-object p1, p0, Lz2/o;->s:Lz2/r$a;

    invoke-static {p1}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/r$a;

    invoke-interface {p1, p0}, Lz2/o0$a;->k(Lz2/o0;)V

    return-void
.end method

.method public w(J)V
    .locals 0

    iput-wide p1, p0, Lz2/o;->v:J

    return-void
.end method

.method public x()V
    .locals 2

    iget-object v0, p0, Lz2/o;->r:Lz2/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->q:Lz2/u;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/u;

    iget-object v1, p0, Lz2/o;->r:Lz2/r;

    invoke-interface {v0, v1}, Lz2/u;->b(Lz2/r;)V

    :cond_0
    return-void
.end method

.method public y(Lz2/u;)V
    .locals 1

    iget-object v0, p0, Lz2/o;->q:Lz2/u;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu3/a;->f(Z)V

    iput-object p1, p0, Lz2/o;->q:Lz2/u;

    return-void
.end method
