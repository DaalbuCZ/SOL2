.class final Lj0/a$a;
.super Ld9/k;
.source ""

# interfaces
.implements Lj9/p;


# annotations
.annotation runtime Ld9/f;
    c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1"
    f = "WindowInfoTrackerCallbackAdapter.kt"
    l = {
        0x60
    }
    m = "invokeSuspend"
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj0/a;->b(Ljava/util/concurrent/Executor;Landroidx/core/util/a;Lu9/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld9/k;",
        "Lj9/p<",
        "Lr9/j0;",
        "Lb9/d<",
        "-",
        "Ly8/s;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field r:I

.field final synthetic s:Lu9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/b<",
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
.method constructor <init>(Lu9/b;Landroidx/core/util/a;Lb9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu9/b<",
            "+TT;>;",
            "Landroidx/core/util/a<",
            "TT;>;",
            "Lb9/d<",
            "-",
            "Lj0/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj0/a$a;->s:Lu9/b;

    iput-object p2, p0, Lj0/a$a;->t:Landroidx/core/util/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ld9/k;-><init>(ILb9/d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr9/j0;

    check-cast p2, Lb9/d;

    invoke-virtual {p0, p1, p2}, Lj0/a$a;->v(Lr9/j0;Lb9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final o(Ljava/lang/Object;Lb9/d;)Lb9/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lb9/d<",
            "*>;)",
            "Lb9/d<",
            "Ly8/s;",
            ">;"
        }
    .end annotation

    new-instance p1, Lj0/a$a;

    iget-object v0, p0, Lj0/a$a;->s:Lu9/b;

    iget-object v1, p0, Lj0/a$a;->t:Landroidx/core/util/a;

    invoke-direct {p1, v0, v1, p2}, Lj0/a$a;-><init>(Lu9/b;Landroidx/core/util/a;Lb9/d;)V

    return-object p1
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lc9/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lj0/a$a;->r:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ly8/n;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ly8/n;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lj0/a$a;->s:Lu9/b;

    iget-object v1, p0, Lj0/a$a;->t:Landroidx/core/util/a;

    new-instance v3, Lj0/a$a$a;

    invoke-direct {v3, v1}, Lj0/a$a$a;-><init>(Landroidx/core/util/a;)V

    iput v2, p0, Lj0/a$a;->r:I

    invoke-interface {p1, v3, p0}, Lu9/b;->a(Lu9/c;Lb9/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ly8/s;->a:Ly8/s;

    return-object p1
.end method

.method public final v(Lr9/j0;Lb9/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/j0;",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lj0/a$a;->o(Ljava/lang/Object;Lb9/d;)Lb9/d;

    move-result-object p1

    check-cast p1, Lj0/a$a;

    sget-object p2, Ly8/s;->a:Ly8/s;

    invoke-virtual {p1, p2}, Lj0/a$a;->r(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
