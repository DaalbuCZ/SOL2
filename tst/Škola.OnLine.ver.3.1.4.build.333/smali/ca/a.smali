.class public abstract Lca/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lca/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lca/b<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lca/c;Lj9/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca/c<",
            "-TT;>;",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public final b(Lca/c;Lj9/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca/c<",
            "-TT;>;",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lca/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lca/a$a;

    iget v1, v0, Lca/a$a;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lca/a$a;->t:I

    goto :goto_0

    :cond_0
    new-instance v0, Lca/a$a;

    invoke-direct {v0, p0, p2}, Lca/a$a;-><init>(Lca/a;Lj9/d;)V

    :goto_0
    iget-object p2, v0, Lca/a$a;->r:Ljava/lang/Object;

    invoke-static {}, Lk9/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lca/a$a;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lca/a$a;->q:Ljava/lang/Object;

    check-cast p1, Lda/c;

    :try_start_0
    invoke-static {p2}, Lg9/n;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lg9/n;->b(Ljava/lang/Object;)V

    new-instance p2, Lda/c;

    invoke-interface {v0}, Lj9/d;->b()Lj9/g;

    move-result-object v2

    invoke-direct {p2, p1, v2}, Lda/c;-><init>(Lca/c;Lj9/g;)V

    :try_start_1
    iput-object p2, v0, Lca/a$a;->q:Ljava/lang/Object;

    iput v3, v0, Lca/a$a;->t:I

    invoke-virtual {p0, p2, v0}, Lca/a;->a(Lca/c;Lj9/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    :goto_1
    invoke-virtual {p1}, Lda/c;->t()V

    sget-object p1, Lg9/s;->a:Lg9/s;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v4, p2

    move-object p2, p1

    move-object p1, v4

    :goto_2
    invoke-virtual {p1}, Lda/c;->t()V

    throw p2
.end method
