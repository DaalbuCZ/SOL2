.class Lv5/k$d$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv5/k$d$a;->a()Ly4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly4/h<",
        "Lc6/d;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Executor;

.field final synthetic b:Lv5/k$d$a;


# direct methods
.method constructor <init>(Lv5/k$d$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lv5/k$d$a$a;->b:Lv5/k$d$a;

    iput-object p2, p0, Lv5/k$d$a$a;->a:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ly4/i;
    .locals 0

    check-cast p1, Lc6/d;

    invoke-virtual {p0, p1}, Lv5/k$d$a$a;->b(Lc6/d;)Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Lc6/d;)Ly4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc6/d;",
            ")",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string v1, "Received null app settings at app startup. Cannot send cached reports"

    invoke-virtual {p1, v1}, Ls5/f;->k(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Ly4/l;->e(Ljava/lang/Object;)Ly4/i;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lv5/k$d$a$a;->b:Lv5/k$d$a;

    iget-object p1, p1, Lv5/k$d$a;->b:Lv5/k$d;

    iget-object p1, p1, Lv5/k$d;->b:Lv5/k;

    invoke-static {p1}, Lv5/k;->n(Lv5/k;)Ly4/i;

    iget-object p1, p0, Lv5/k$d$a$a;->b:Lv5/k$d$a;

    iget-object p1, p1, Lv5/k$d$a;->b:Lv5/k$d;

    iget-object p1, p1, Lv5/k$d;->b:Lv5/k;

    invoke-static {p1}, Lv5/k;->h(Lv5/k;)Lv5/e0;

    move-result-object p1

    iget-object v1, p0, Lv5/k$d$a$a;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1}, Lv5/e0;->v(Ljava/util/concurrent/Executor;)Ly4/i;

    iget-object p1, p0, Lv5/k$d$a$a;->b:Lv5/k$d$a;

    iget-object p1, p1, Lv5/k$d$a;->b:Lv5/k$d;

    iget-object p1, p1, Lv5/k$d;->b:Lv5/k;

    iget-object p1, p1, Lv5/k;->q:Ly4/j;

    invoke-virtual {p1, v0}, Ly4/j;->e(Ljava/lang/Object;)Z

    goto :goto_0
.end method
