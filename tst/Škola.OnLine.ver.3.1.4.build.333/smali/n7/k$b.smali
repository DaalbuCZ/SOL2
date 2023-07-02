.class public final Ln7/k$b;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lk7/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lm7/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln7/k$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lm7/i;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/i<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln7/k$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lk7/w;-><init>()V

    iput-object p1, p0, Ln7/k$b;->a:Lm7/i;

    iput-object p2, p0, Ln7/k$b;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public c(Ls7/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ls7/a;->Z()Ls7/b;

    move-result-object v0

    sget-object v1, Ls7/b;->v:Ls7/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ls7/a;->V()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Ln7/k$b;->a:Lm7/i;

    invoke-interface {v0}, Lm7/i;->a()Ljava/lang/Object;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Ls7/a;->b()V

    :goto_0
    invoke-virtual {p1}, Ls7/a;->v()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Ls7/a;->Q()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ln7/k$b;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/k$c;

    if-eqz v1, :cond_2

    iget-boolean v2, v1, Ln7/k$c;->c:Z

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1, v0}, Ln7/k$c;->a(Ls7/a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p1}, Ls7/a;->j0()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ls7/a;->n()V

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance v0, Lk7/s;

    invoke-direct {v0, p1}, Lk7/s;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public e(Ls7/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/c;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ls7/c;->F()Ls7/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Ls7/c;->e()Ls7/c;

    :try_start_0
    iget-object v0, p0, Ln7/k$b;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/k$c;

    invoke-virtual {v1, p2}, Ln7/k$c;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v1, Ln7/k$c;->a:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ls7/c;->x(Ljava/lang/String;)Ls7/c;

    invoke-virtual {v1, p1, p2}, Ln7/k$c;->b(Ls7/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ls7/c;->n()Ls7/c;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method
