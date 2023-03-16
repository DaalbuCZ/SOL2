.class Lq5/k$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/k$b;->a()Lt4/i;
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

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lq5/k$b;


# direct methods
.method constructor <init>(Lq5/k$b;Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lq5/k$b$a;->c:Lq5/k$b;

    iput-object p2, p0, Lq5/k$b$a;->a:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lq5/k$b$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lt4/i;
    .locals 0

    check-cast p1, Lx5/d;

    invoke-virtual {p0, p1}, Lq5/k$b$a;->b(Lx5/d;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Lx5/d;)Lt4/i;
    .locals 5
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

    const-string v1, "Received null app settings, cannot send reports at crash time."

    invoke-virtual {p1, v1}, Ln5/f;->k(Ljava/lang/String;)V

    invoke-static {v0}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x2

    new-array p1, p1, [Lt4/i;

    const/4 v1, 0x0

    iget-object v2, p0, Lq5/k$b$a;->c:Lq5/k$b;

    iget-object v2, v2, Lq5/k$b;->f:Lq5/k;

    invoke-static {v2}, Lq5/k;->n(Lq5/k;)Lt4/i;

    move-result-object v2

    aput-object v2, p1, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lq5/k$b$a;->c:Lq5/k$b;

    iget-object v2, v2, Lq5/k$b;->f:Lq5/k;

    invoke-static {v2}, Lq5/k;->h(Lq5/k;)Lq5/e0;

    move-result-object v2

    iget-object v3, p0, Lq5/k$b$a;->a:Ljava/util/concurrent/Executor;

    iget-object v4, p0, Lq5/k$b$a;->c:Lq5/k$b;

    iget-boolean v4, v4, Lq5/k$b;->e:Z

    if-eqz v4, :cond_1

    iget-object v0, p0, Lq5/k$b$a;->b:Ljava/lang/String;

    :cond_1
    invoke-virtual {v2, v3, v0}, Lq5/e0;->w(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lt4/i;

    move-result-object v0

    aput-object v0, p1, v1

    invoke-static {p1}, Lt4/l;->g([Lt4/i;)Lt4/i;

    move-result-object p1

    return-object p1
.end method
