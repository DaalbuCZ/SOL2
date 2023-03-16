.class Lq5/k$d$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/k$d$a;->a()Lt4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt4/h<",
        "Lx5/d;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Executor;

.field final synthetic b:Lq5/k$d$a;


# direct methods
.method constructor <init>(Lq5/k$d$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lq5/k$d$a$a;->b:Lq5/k$d$a;

    iput-object p2, p0, Lq5/k$d$a$a;->a:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lt4/i;
    .locals 0

    check-cast p1, Lx5/d;

    invoke-virtual {p0, p1}, Lq5/k$d$a$a;->b(Lx5/d;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Lx5/d;)Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx5/d;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object p1

    const-string v1, "Received null app settings at app startup. Cannot send cached reports"

    invoke-virtual {p1, v1}, Ln5/f;->k(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lq5/k$d$a$a;->b:Lq5/k$d$a;

    iget-object p1, p1, Lq5/k$d$a;->b:Lq5/k$d;

    iget-object p1, p1, Lq5/k$d;->b:Lq5/k;

    invoke-static {p1}, Lq5/k;->n(Lq5/k;)Lt4/i;

    iget-object p1, p0, Lq5/k$d$a$a;->b:Lq5/k$d$a;

    iget-object p1, p1, Lq5/k$d$a;->b:Lq5/k$d;

    iget-object p1, p1, Lq5/k$d;->b:Lq5/k;

    invoke-static {p1}, Lq5/k;->h(Lq5/k;)Lq5/e0;

    move-result-object p1

    iget-object v1, p0, Lq5/k$d$a$a;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1}, Lq5/e0;->v(Ljava/util/concurrent/Executor;)Lt4/i;

    iget-object p1, p0, Lq5/k$d$a$a;->b:Lq5/k$d$a;

    iget-object p1, p1, Lq5/k$d$a;->b:Lq5/k$d;

    iget-object p1, p1, Lq5/k$d;->b:Lq5/k;

    iget-object p1, p1, Lq5/k;->q:Lt4/j;

    invoke-virtual {p1, v0}, Lt4/j;->e(Ljava/lang/Object;)Z

    goto :goto_0
.end method
