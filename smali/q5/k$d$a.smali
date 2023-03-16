.class Lq5/k$d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/k$d;->b(Ljava/lang/Boolean;)Lt4/i;
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
.field final synthetic a:Ljava/lang/Boolean;

.field final synthetic b:Lq5/k$d;


# direct methods
.method constructor <init>(Lq5/k$d;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lq5/k$d$a;->b:Lq5/k$d;

    iput-object p2, p0, Lq5/k$d$a;->a:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq5/k$d$a;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v1, "Deleting cached crash reports..."

    invoke-virtual {v0, v1}, Ln5/f;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lq5/k$d$a;->b:Lq5/k$d;

    iget-object v0, v0, Lq5/k$d;->b:Lq5/k;

    invoke-virtual {v0}, Lq5/k;->L()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lq5/k;->d(Ljava/util/List;)V

    iget-object v0, p0, Lq5/k$d$a;->b:Lq5/k$d;

    iget-object v0, v0, Lq5/k$d;->b:Lq5/k;

    invoke-static {v0}, Lq5/k;->h(Lq5/k;)Lq5/e0;

    move-result-object v0

    invoke-virtual {v0}, Lq5/e0;->u()V

    iget-object v0, p0, Lq5/k$d$a;->b:Lq5/k$d;

    iget-object v0, v0, Lq5/k$d;->b:Lq5/k;

    iget-object v0, v0, Lq5/k;->q:Lt4/j;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt4/j;->e(Ljava/lang/Object;)Z

    invoke-static {v1}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v1, "Sending cached crash reports..."

    invoke-virtual {v0, v1}, Ln5/f;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lq5/k$d$a;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lq5/k$d$a;->b:Lq5/k$d;

    iget-object v1, v1, Lq5/k$d;->b:Lq5/k;

    invoke-static {v1}, Lq5/k;->l(Lq5/k;)Lq5/s;

    move-result-object v1

    invoke-virtual {v1, v0}, Lq5/s;->c(Z)V

    iget-object v0, p0, Lq5/k$d$a;->b:Lq5/k$d;

    iget-object v0, v0, Lq5/k$d;->b:Lq5/k;

    invoke-static {v0}, Lq5/k;->m(Lq5/k;)Lq5/i;

    move-result-object v0

    invoke-virtual {v0}, Lq5/i;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Lq5/k$d$a;->b:Lq5/k$d;

    iget-object v1, v1, Lq5/k$d;->a:Lt4/i;

    new-instance v2, Lq5/k$d$a$a;

    invoke-direct {v2, p0, v0}, Lq5/k$d$a$a;-><init>(Lq5/k$d$a;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v1, v0, v2}, Lt4/i;->q(Ljava/util/concurrent/Executor;Lt4/h;)Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq5/k$d$a;->a()Lt4/i;

    move-result-object v0

    return-object v0
.end method
