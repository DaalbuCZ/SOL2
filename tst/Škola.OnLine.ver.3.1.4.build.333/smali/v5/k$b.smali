.class Lv5/k$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv5/k;->I(Lc6/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ly4/i<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/Throwable;

.field final synthetic c:Ljava/lang/Thread;

.field final synthetic d:Lc6/i;

.field final synthetic e:Z

.field final synthetic f:Lv5/k;


# direct methods
.method constructor <init>(Lv5/k;JLjava/lang/Throwable;Ljava/lang/Thread;Lc6/i;Z)V
    .locals 0

    iput-object p1, p0, Lv5/k$b;->f:Lv5/k;

    iput-wide p2, p0, Lv5/k$b;->a:J

    iput-object p4, p0, Lv5/k$b;->b:Ljava/lang/Throwable;

    iput-object p5, p0, Lv5/k$b;->c:Ljava/lang/Thread;

    iput-object p6, p0, Lv5/k$b;->d:Lc6/i;

    iput-boolean p7, p0, Lv5/k$b;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ly4/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lv5/k$b;->a:J

    invoke-static {v0, v1}, Lv5/k;->b(J)J

    move-result-wide v6

    iget-object v0, p0, Lv5/k$b;->f:Lv5/k;

    invoke-static {v0}, Lv5/k;->c(Lv5/k;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v2, "Tried to write a fatal exception while no session was open."

    invoke-virtual {v0, v2}, Ls5/f;->d(Ljava/lang/String;)V

    invoke-static {v1}, Ly4/l;->e(Ljava/lang/Object;)Ly4/i;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v2, p0, Lv5/k$b;->f:Lv5/k;

    invoke-static {v2}, Lv5/k;->g(Lv5/k;)Lv5/n;

    move-result-object v2

    invoke-virtual {v2}, Lv5/n;->a()Z

    iget-object v2, p0, Lv5/k$b;->f:Lv5/k;

    invoke-static {v2}, Lv5/k;->h(Lv5/k;)Lv5/e0;

    move-result-object v2

    iget-object v3, p0, Lv5/k$b;->b:Ljava/lang/Throwable;

    iget-object v4, p0, Lv5/k$b;->c:Ljava/lang/Thread;

    move-object v5, v0

    invoke-virtual/range {v2 .. v7}, Lv5/e0;->r(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    iget-object v2, p0, Lv5/k$b;->f:Lv5/k;

    iget-wide v3, p0, Lv5/k$b;->a:J

    invoke-static {v2, v3, v4}, Lv5/k;->i(Lv5/k;J)V

    iget-object v2, p0, Lv5/k$b;->f:Lv5/k;

    iget-object v3, p0, Lv5/k$b;->d:Lc6/i;

    invoke-virtual {v2, v3}, Lv5/k;->v(Lc6/i;)V

    iget-object v2, p0, Lv5/k$b;->f:Lv5/k;

    new-instance v3, Lv5/g;

    iget-object v4, p0, Lv5/k$b;->f:Lv5/k;

    invoke-static {v4}, Lv5/k;->j(Lv5/k;)Lv5/w;

    move-result-object v4

    invoke-direct {v3, v4}, Lv5/g;-><init>(Lv5/w;)V

    invoke-virtual {v3}, Lv5/g;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lv5/k;->k(Lv5/k;Ljava/lang/String;)V

    iget-object v2, p0, Lv5/k$b;->f:Lv5/k;

    invoke-static {v2}, Lv5/k;->l(Lv5/k;)Lv5/s;

    move-result-object v2

    invoke-virtual {v2}, Lv5/s;->d()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Ly4/l;->e(Ljava/lang/Object;)Ly4/i;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lv5/k$b;->f:Lv5/k;

    invoke-static {v1}, Lv5/k;->m(Lv5/k;)Lv5/i;

    move-result-object v1

    invoke-virtual {v1}, Lv5/i;->c()Ljava/util/concurrent/Executor;

    move-result-object v1

    iget-object v2, p0, Lv5/k$b;->d:Lc6/i;

    invoke-interface {v2}, Lc6/i;->a()Ly4/i;

    move-result-object v2

    new-instance v3, Lv5/k$b$a;

    invoke-direct {v3, p0, v1, v0}, Lv5/k$b$a;-><init>(Lv5/k$b;Ljava/util/concurrent/Executor;Ljava/lang/String;)V

    invoke-virtual {v2, v1, v3}, Ly4/i;->q(Ljava/util/concurrent/Executor;Ly4/h;)Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv5/k$b;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method
