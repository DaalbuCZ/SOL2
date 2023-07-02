.class public abstract Ll9/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj9/d;
.implements Ll9/e;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj9/d<",
        "Ljava/lang/Object;",
        ">;",
        "Ll9/e;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private final n:Lj9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/a;->n:Lj9/d;

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/Object;Lj9/d;)Lj9/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lj9/d<",
            "*>;)",
            "Lj9/d<",
            "Lg9/s;",
            ">;"
        }
    .end annotation

    const-string p1, "completion"

    invoke-static {p2, p1}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "create(Any?;Continuation) has not been overridden"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j()Ll9/e;
    .locals 2

    iget-object v0, p0, Ll9/a;->n:Lj9/d;

    instance-of v1, v0, Ll9/e;

    if-eqz v1, :cond_0

    check-cast v0, Ll9/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 3

    move-object v0, p0

    :goto_0
    invoke-static {v0}, Ll9/h;->b(Lj9/d;)V

    check-cast v0, Ll9/a;

    iget-object v1, v0, Ll9/a;->n:Lj9/d;

    invoke-static {v1}, Ls9/k;->b(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {v0, p1}, Ll9/a;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lk9/b;->c()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_0

    return-void

    :cond_0
    sget-object v2, Lg9/m;->n:Lg9/m$a;

    invoke-static {p1}, Lg9/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    sget-object v2, Lg9/m;->n:Lg9/m$a;

    invoke-static {p1}, Lg9/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lg9/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-virtual {v0}, Ll9/a;->t()V

    instance-of v0, v1, Ll9/a;

    if-eqz v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-interface {v1, p1}, Lj9/d;->k(Ljava/lang/Object;)V

    return-void
.end method

.method public final n()Lj9/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj9/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll9/a;->n:Lj9/d;

    return-object v0
.end method

.method protected abstract p(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public q()Ljava/lang/StackTraceElement;
    .locals 1

    invoke-static {p0}, Ll9/g;->d(Ll9/a;)Ljava/lang/StackTraceElement;

    move-result-object v0

    return-object v0
.end method

.method protected t()V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Continuation at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll9/a;->q()Ljava/lang/StackTraceElement;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
