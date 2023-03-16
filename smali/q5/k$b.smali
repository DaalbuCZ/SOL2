.class Lq5/k$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/k;->I(Lx5/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lt4/i<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/Throwable;

.field final synthetic c:Ljava/lang/Thread;

.field final synthetic d:Lx5/i;

.field final synthetic e:Z

.field final synthetic f:Lq5/k;


# direct methods
.method constructor <init>(Lq5/k;JLjava/lang/Throwable;Ljava/lang/Thread;Lx5/i;Z)V
    .locals 0

    iput-object p1, p0, Lq5/k$b;->f:Lq5/k;

    iput-wide p2, p0, Lq5/k$b;->a:J

    iput-object p4, p0, Lq5/k$b;->b:Ljava/lang/Throwable;

    iput-object p5, p0, Lq5/k$b;->c:Ljava/lang/Thread;

    iput-object p6, p0, Lq5/k$b;->d:Lx5/i;

    iput-boolean p7, p0, Lq5/k$b;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lt4/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lq5/k$b;->a:J

    invoke-static {v0, v1}, Lq5/k;->b(J)J

    move-result-wide v6

    iget-object v0, p0, Lq5/k$b;->f:Lq5/k;

    invoke-static {v0}, Lq5/k;->c(Lq5/k;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v2, "Tried to write a fatal exception while no session was open."

    invoke-virtual {v0, v2}, Ln5/f;->d(Ljava/lang/String;)V

    invoke-static {v1}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v2, p0, Lq5/k$b;->f:Lq5/k;

    invoke-static {v2}, Lq5/k;->g(Lq5/k;)Lq5/n;

    move-result-object v2

    invoke-virtual {v2}, Lq5/n;->a()Z

    iget-object v2, p0, Lq5/k$b;->f:Lq5/k;

    invoke-static {v2}, Lq5/k;->h(Lq5/k;)Lq5/e0;

    move-result-object v2

    iget-object v3, p0, Lq5/k$b;->b:Ljava/lang/Throwable;

    iget-object v4, p0, Lq5/k$b;->c:Ljava/lang/Thread;

    move-object v5, v0

    invoke-virtual/range {v2 .. v7}, Lq5/e0;->r(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    iget-object v2, p0, Lq5/k$b;->f:Lq5/k;

    iget-wide v3, p0, Lq5/k$b;->a:J

    invoke-static {v2, v3, v4}, Lq5/k;->i(Lq5/k;J)V

    iget-object v2, p0, Lq5/k$b;->f:Lq5/k;

    iget-object v3, p0, Lq5/k$b;->d:Lx5/i;

    invoke-virtual {v2, v3}, Lq5/k;->v(Lx5/i;)V

    iget-object v2, p0, Lq5/k$b;->f:Lq5/k;

    new-instance v3, Lq5/g;

    iget-object v4, p0, Lq5/k$b;->f:Lq5/k;

    invoke-static {v4}, Lq5/k;->j(Lq5/k;)Lq5/w;

    move-result-object v4

    invoke-direct {v3, v4}, Lq5/g;-><init>(Lq5/w;)V

    invoke-virtual {v3}, Lq5/g;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lq5/k;->k(Lq5/k;Ljava/lang/String;)V

    iget-object v2, p0, Lq5/k$b;->f:Lq5/k;

    invoke-static {v2}, Lq5/k;->l(Lq5/k;)Lq5/s;

    move-result-object v2

    invoke-virtual {v2}, Lq5/s;->d()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lq5/k$b;->f:Lq5/k;

    invoke-static {v1}, Lq5/k;->m(Lq5/k;)Lq5/i;

    move-result-object v1

    invoke-virtual {v1}, Lq5/i;->c()Ljava/util/concurrent/Executor;

    move-result-object v1

    iget-object v2, p0, Lq5/k$b;->d:Lx5/i;

    invoke-interface {v2}, Lx5/i;->a()Lt4/i;

    move-result-object v2

    new-instance v3, Lq5/k$b$a;

    invoke-direct {v3, p0, v1, v0}, Lq5/k$b$a;-><init>(Lq5/k$b;Ljava/util/concurrent/Executor;Ljava/lang/String;)V

    invoke-virtual {v2, v1, v3}, Lt4/i;->q(Ljava/util/concurrent/Executor;Lt4/h;)Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq5/k$b;->a()Lt4/i;

    move-result-object v0

    return-object v0
.end method
