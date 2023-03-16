.class final Ls1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/l$a;
    }
.end annotation


# instance fields
.field private final n:Lp3/e0;

.field private final o:Ls1/l$a;

.field private p:Ls1/y2;

.field private q:Lp3/t;

.field private r:Z

.field private s:Z


# direct methods
.method public constructor <init>(Ls1/l$a;Lp3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/l;->o:Ls1/l$a;

    new-instance p1, Lp3/e0;

    invoke-direct {p1, p2}, Lp3/e0;-><init>(Lp3/d;)V

    iput-object p1, p0, Ls1/l;->n:Lp3/e0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls1/l;->r:Z

    return-void
.end method

.method private e(Z)Z
    .locals 1

    iget-object v0, p0, Ls1/l;->p:Ls1/y2;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ls1/y2;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ls1/l;->p:Ls1/y2;

    invoke-interface {v0}, Ls1/y2;->i()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    iget-object p1, p0, Ls1/l;->p:Ls1/y2;

    invoke-interface {p1}, Ls1/y2;->m()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private i(Z)V
    .locals 4

    invoke-direct {p0, p1}, Ls1/l;->e(Z)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls1/l;->r:Z

    iget-boolean p1, p0, Ls1/l;->s:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {p1}, Lp3/e0;->b()V

    :cond_0
    return-void

    :cond_1
    iget-object p1, p0, Ls1/l;->q:Lp3/t;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp3/t;

    invoke-interface {p1}, Lp3/t;->z()J

    move-result-wide v0

    iget-boolean v2, p0, Ls1/l;->r:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v2}, Lp3/e0;->z()J

    move-result-wide v2

    cmp-long v2, v0, v2

    if-gez v2, :cond_2

    iget-object p1, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {p1}, Lp3/e0;->c()V

    return-void

    :cond_2
    const/4 v2, 0x0

    iput-boolean v2, p0, Ls1/l;->r:Z

    iget-boolean v2, p0, Ls1/l;->s:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v2}, Lp3/e0;->b()V

    :cond_3
    iget-object v2, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v2, v0, v1}, Lp3/e0;->a(J)V

    invoke-interface {p1}, Lp3/t;->j()Ls1/o2;

    move-result-object p1

    iget-object v0, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v0}, Lp3/e0;->j()Ls1/o2;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls1/o2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v0, p1}, Lp3/e0;->d(Ls1/o2;)V

    iget-object v0, p0, Ls1/l;->o:Ls1/l$a;

    invoke-interface {v0, p1}, Ls1/l$a;->p(Ls1/o2;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public a(Ls1/y2;)V
    .locals 1

    iget-object v0, p0, Ls1/l;->p:Ls1/y2;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ls1/l;->q:Lp3/t;

    iput-object p1, p0, Ls1/l;->p:Ls1/y2;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls1/l;->r:Z

    :cond_0
    return-void
.end method

.method public b(Ls1/y2;)V
    .locals 2

    invoke-interface {p1}, Ls1/y2;->x()Lp3/t;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Ls1/l;->q:Lp3/t;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    iput-object v0, p0, Ls1/l;->q:Lp3/t;

    iput-object p1, p0, Ls1/l;->p:Ls1/y2;

    iget-object p1, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {p1}, Lp3/e0;->j()Ls1/o2;

    move-result-object p1

    invoke-interface {v0, p1}, Lp3/t;->d(Ls1/o2;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ls1/q;->i(Ljava/lang/RuntimeException;)Ls1/q;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public c(J)V
    .locals 1

    iget-object v0, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v0, p1, p2}, Lp3/e0;->a(J)V

    return-void
.end method

.method public d(Ls1/o2;)V
    .locals 1

    iget-object v0, p0, Ls1/l;->q:Lp3/t;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lp3/t;->d(Ls1/o2;)V

    iget-object p1, p0, Ls1/l;->q:Lp3/t;

    invoke-interface {p1}, Lp3/t;->j()Ls1/o2;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v0, p1}, Lp3/e0;->d(Ls1/o2;)V

    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls1/l;->s:Z

    iget-object v0, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v0}, Lp3/e0;->b()V

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls1/l;->s:Z

    iget-object v0, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v0}, Lp3/e0;->c()V

    return-void
.end method

.method public h(Z)J
    .locals 2

    invoke-direct {p0, p1}, Ls1/l;->i(Z)V

    invoke-virtual {p0}, Ls1/l;->z()J

    move-result-wide v0

    return-wide v0
.end method

.method public j()Ls1/o2;
    .locals 1

    iget-object v0, p0, Ls1/l;->q:Lp3/t;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp3/t;->j()Ls1/o2;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v0}, Lp3/e0;->j()Ls1/o2;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public z()J
    .locals 2

    iget-boolean v0, p0, Ls1/l;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/l;->n:Lp3/e0;

    invoke-virtual {v0}, Lp3/e0;->z()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls1/l;->q:Lp3/t;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp3/t;

    invoke-interface {v0}, Lp3/t;->z()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method
