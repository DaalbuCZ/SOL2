.class Lc6/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc6/f;->o(Lc6/e;Ljava/util/concurrent/Executor;)Ly4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly4/h<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lc6/f;


# direct methods
.method constructor <init>(Lc6/f;)V
    .locals 0

    iput-object p1, p0, Lc6/f$a;->a:Lc6/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ly4/i;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lc6/f$a;->b(Ljava/lang/Void;)Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Void;)Ly4/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Void;",
            ")",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lc6/f$a;->a:Lc6/f;

    invoke-static {p1}, Lc6/f;->d(Lc6/f;)Lc6/k;

    move-result-object p1

    iget-object v0, p0, Lc6/f$a;->a:Lc6/f;

    invoke-static {v0}, Lc6/f;->c(Lc6/f;)Lc6/j;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lc6/k;->a(Lc6/j;Z)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lc6/f$a;->a:Lc6/f;

    invoke-static {v0}, Lc6/f;->e(Lc6/f;)Lc6/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc6/g;->b(Lorg/json/JSONObject;)Lc6/d;

    move-result-object v0

    iget-object v1, p0, Lc6/f$a;->a:Lc6/f;

    invoke-static {v1}, Lc6/f;->f(Lc6/f;)Lc6/a;

    move-result-object v1

    iget-wide v2, v0, Lc6/d;->c:J

    invoke-virtual {v1, v2, v3, p1}, Lc6/a;->c(JLorg/json/JSONObject;)V

    iget-object v1, p0, Lc6/f$a;->a:Lc6/f;

    const-string v2, "Loaded settings: "

    invoke-static {v1, p1, v2}, Lc6/f;->g(Lc6/f;Lorg/json/JSONObject;Ljava/lang/String;)V

    iget-object p1, p0, Lc6/f$a;->a:Lc6/f;

    invoke-static {p1}, Lc6/f;->c(Lc6/f;)Lc6/j;

    move-result-object v1

    iget-object v1, v1, Lc6/j;->f:Ljava/lang/String;

    invoke-static {p1, v1}, Lc6/f;->h(Lc6/f;Ljava/lang/String;)Z

    iget-object p1, p0, Lc6/f$a;->a:Lc6/f;

    invoke-static {p1}, Lc6/f;->i(Lc6/f;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p1, p0, Lc6/f$a;->a:Lc6/f;

    invoke-static {p1}, Lc6/f;->j(Lc6/f;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly4/j;

    invoke-virtual {p1, v0}, Ly4/j;->e(Ljava/lang/Object;)Z

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Ly4/l;->e(Ljava/lang/Object;)Ly4/i;

    move-result-object p1

    return-object p1
.end method
