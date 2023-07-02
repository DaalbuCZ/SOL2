.class final Lba/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lba/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lba/g<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final a:Lba/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lba/a<",
            "TE;>;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lba/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lba/a<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/a$a;->a:Lba/a;

    sget-object p1, Lba/b;->d:Lkotlinx/coroutines/internal/e0;

    iput-object p1, p0, Lba/a$a;->b:Ljava/lang/Object;

    return-void
.end method

.method private final b(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lba/j;

    if-eqz v0, :cond_1

    check-cast p1, Lba/j;

    iget-object v0, p1, Lba/j;->q:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lba/j;->I()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/internal/d0;->k(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private final c(Lj9/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Lk9/b;->b(Lj9/d;)Lj9/d;

    move-result-object v0

    invoke-static {v0}, Lz9/n;->a(Lj9/d;)Lz9/l;

    move-result-object v0

    new-instance v1, Lba/a$b;

    invoke-direct {v1, p0, v0}, Lba/a$b;-><init>(Lba/a$a;Lz9/k;)V

    :cond_0
    iget-object v2, p0, Lba/a$a;->a:Lba/a;

    invoke-static {v2, v1}, Lba/a;->n(Lba/a;Lba/o;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lba/a$a;->a:Lba/a;

    invoke-static {v2, v0, v1}, Lba/a;->o(Lba/a;Lz9/k;Lba/o;)V

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lba/a$a;->a:Lba/a;

    invoke-virtual {v2}, Lba/a;->v()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Lba/a$a;->d(Ljava/lang/Object;)V

    instance-of v3, v2, Lba/j;

    if-eqz v3, :cond_3

    check-cast v2, Lba/j;

    iget-object v1, v2, Lba/j;->q:Ljava/lang/Throwable;

    if-nez v1, :cond_2

    sget-object v1, Lg9/m;->n:Lg9/m$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ll9/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_2
    sget-object v1, Lg9/m;->n:Lg9/m$a;

    invoke-virtual {v2}, Lba/j;->I()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v1}, Lg9/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lg9/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lj9/d;->k(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    sget-object v3, Lba/b;->d:Lkotlinx/coroutines/internal/e0;

    if-eq v2, v3, :cond_0

    const/4 v1, 0x1

    invoke-static {v1}, Ll9/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v3, p0, Lba/a$a;->a:Lba/a;

    iget-object v3, v3, Lba/c;->b:Lr9/l;

    if-eqz v3, :cond_4

    invoke-interface {v0}, Lj9/d;->b()Lj9/g;

    move-result-object v4

    invoke-static {v3, v2, v4}, Lkotlinx/coroutines/internal/y;->a(Lr9/l;Ljava/lang/Object;Lj9/g;)Lr9/l;

    move-result-object v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    invoke-interface {v0, v1, v2}, Lz9/k;->d(Ljava/lang/Object;Lr9/l;)V

    :goto_2
    invoke-virtual {v0}, Lz9/l;->A()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lk9/b;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-static {p1}, Ll9/h;->c(Lj9/d;)V

    :cond_5
    return-object v0
.end method


# virtual methods
.method public a(Lj9/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lba/a$a;->b:Ljava/lang/Object;

    sget-object v1, Lba/b;->d:Lkotlinx/coroutines/internal/e0;

    if-eq v0, v1, :cond_0

    :goto_0
    invoke-direct {p0, v0}, Lba/a$a;->b(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ll9/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lba/a$a;->a:Lba/a;

    invoke-virtual {v0}, Lba/a;->v()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lba/a$a;->b:Ljava/lang/Object;

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lba/a$a;->c(Lj9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lba/a$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, Lba/a$a;->b:Ljava/lang/Object;

    instance-of v1, v0, Lba/j;

    if-nez v1, :cond_1

    sget-object v1, Lba/b;->d:Lkotlinx/coroutines/internal/e0;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, Lba/a$a;->b:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\'hasNext\' should be called prior to \'next\' invocation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    check-cast v0, Lba/j;

    invoke-virtual {v0}, Lba/j;->I()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/internal/d0;->k(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0
.end method
