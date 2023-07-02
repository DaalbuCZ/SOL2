.class final Lo0/a$a;
.super Ll9/k;
.source ""

# interfaces
.implements Lr9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo0/a;->b(Ljava/util/concurrent/Executor;Landroidx/core/util/a;Lca/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll9/k;",
        "Lr9/p<",
        "Lz9/j0;",
        "Lj9/d<",
        "-",
        "Lg9/s;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Ll9/f;
    c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1"
    f = "WindowInfoTrackerCallbackAdapter.kt"
    l = {
        0x60
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field r:I

.field final synthetic s:Lca/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lca/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic t:Landroidx/core/util/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/a<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lca/b;Landroidx/core/util/a;Lj9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca/b<",
            "+TT;>;",
            "Landroidx/core/util/a<",
            "TT;>;",
            "Lj9/d<",
            "-",
            "Lo0/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo0/a$a;->s:Lca/b;

    iput-object p2, p0, Lo0/a$a;->t:Landroidx/core/util/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ll9/k;-><init>(ILj9/d;)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lj9/d;)Lj9/d;
    .locals 2
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

    new-instance p1, Lo0/a$a;

    iget-object v0, p0, Lo0/a$a;->s:Lca/b;

    iget-object v1, p0, Lo0/a$a;->t:Landroidx/core/util/a;

    invoke-direct {p1, v0, v1, p2}, Lo0/a$a;-><init>(Lca/b;Landroidx/core/util/a;Lj9/d;)V

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz9/j0;

    check-cast p2, Lj9/d;

    invoke-virtual {p0, p1, p2}, Lo0/a$a;->v(Lz9/j0;Lj9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lk9/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo0/a$a;->r:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lg9/n;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lg9/n;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo0/a$a;->s:Lca/b;

    iget-object v1, p0, Lo0/a$a;->t:Landroidx/core/util/a;

    new-instance v3, Lo0/a$a$a;

    invoke-direct {v3, v1}, Lo0/a$a$a;-><init>(Landroidx/core/util/a;)V

    iput v2, p0, Lo0/a$a;->r:I

    invoke-interface {p1, v3, p0}, Lca/b;->b(Lca/c;Lj9/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lg9/s;->a:Lg9/s;

    return-object p1
.end method

.method public final v(Lz9/j0;Lj9/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz9/j0;",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lo0/a$a;->e(Ljava/lang/Object;Lj9/d;)Lj9/d;

    move-result-object p1

    check-cast p1, Lo0/a$a;

    sget-object p2, Lg9/s;->a:Lg9/s;

    invoke-virtual {p1, p2}, Lo0/a$a;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
