.class Lx5/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx5/f;->p(Lx5/e;Ljava/util/concurrent/Executor;)Lt4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt4/h<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lx5/f;


# direct methods
.method constructor <init>(Lx5/f;)V
    .locals 0

    iput-object p1, p0, Lx5/f$a;->a:Lx5/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lt4/i;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lx5/f$a;->b(Ljava/lang/Void;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Void;)Lt4/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Void;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lx5/f$a;->a:Lx5/f;

    invoke-static {p1}, Lx5/f;->d(Lx5/f;)Lx5/k;

    move-result-object p1

    iget-object v0, p0, Lx5/f$a;->a:Lx5/f;

    invoke-static {v0}, Lx5/f;->c(Lx5/f;)Lx5/j;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lx5/k;->a(Lx5/j;Z)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lx5/f$a;->a:Lx5/f;

    invoke-static {v0}, Lx5/f;->e(Lx5/f;)Lx5/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx5/g;->b(Lorg/json/JSONObject;)Lx5/d;

    move-result-object v0

    iget-object v1, p0, Lx5/f$a;->a:Lx5/f;

    invoke-static {v1}, Lx5/f;->f(Lx5/f;)Lx5/a;

    move-result-object v1

    iget-wide v2, v0, Lx5/d;->c:J

    invoke-virtual {v1, v2, v3, p1}, Lx5/a;->c(JLorg/json/JSONObject;)V

    iget-object v1, p0, Lx5/f$a;->a:Lx5/f;

    const-string v2, "Loaded settings: "

    invoke-static {v1, p1, v2}, Lx5/f;->g(Lx5/f;Lorg/json/JSONObject;Ljava/lang/String;)V

    iget-object p1, p0, Lx5/f$a;->a:Lx5/f;

    invoke-static {p1}, Lx5/f;->c(Lx5/f;)Lx5/j;

    move-result-object v1

    iget-object v1, v1, Lx5/j;->f:Ljava/lang/String;

    invoke-static {p1, v1}, Lx5/f;->h(Lx5/f;Ljava/lang/String;)Z

    iget-object p1, p0, Lx5/f$a;->a:Lx5/f;

    invoke-static {p1}, Lx5/f;->i(Lx5/f;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p1, p0, Lx5/f$a;->a:Lx5/f;

    invoke-static {p1}, Lx5/f;->j(Lx5/f;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt4/j;

    invoke-virtual {p1, v0}, Lt4/j;->e(Ljava/lang/Object;)Z

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object p1

    return-object p1
.end method
