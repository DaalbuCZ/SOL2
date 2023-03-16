.class public Ly0/d1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ly0/n2<",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Ly0/f2;

.field private final b:Ly0/j3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly0/j3<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ly0/c3;


# direct methods
.method public constructor <init>(Ly0/f2;Ly0/j3;Ly0/c3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/f2;",
            "Ly0/j3<",
            "Ljava/lang/String;",
            ">;",
            "Ly0/c3;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/d1;->a:Ly0/f2;

    iput-object p2, p0, Ly0/d1;->b:Ly0/j3;

    iput-object p3, p0, Ly0/d1;->c:Ly0/c3;

    return-void
.end method


# virtual methods
.method public a()Ly0/n2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly0/n2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly0/d1;->b:Ly0/j3;

    invoke-interface {v0}, Ly0/j3;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_0
    iget-object v3, p0, Ly0/d1;->a:Ly0/f2;

    iget-object v4, p0, Ly0/d1;->c:Ly0/c3;

    invoke-virtual {v4}, Ly0/c3;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Ly0/d1;->c:Ly0/c3;

    invoke-virtual {v5}, Ly0/c3;->l()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ly0/q;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-direct {v6, v2, v7}, Ly0/q;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v3, v4, v5, v6}, Ly0/f2;->c(Ljava/lang/String;Ljava/lang/String;Ly0/q;)V

    iget-object v3, p0, Ly0/d1;->b:Ly0/j3;

    invoke-interface {v3, v2}, Ly0/j3;->g(Ljava/lang/String;)Z
    :try_end_0
    .catch Ly0/v0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ly0/n2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Ly0/n2;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1

    :cond_0
    new-instance v0, Ly0/n2;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Ly0/n2;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly0/d1;->a()Ly0/n2;

    move-result-object v0

    return-object v0
.end method
