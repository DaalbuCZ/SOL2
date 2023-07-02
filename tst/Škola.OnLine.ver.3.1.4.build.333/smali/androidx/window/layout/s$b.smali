.class final Landroidx/window/layout/s$b;
.super Ll9/k;
.source ""

# interfaces
.implements Lr9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/window/layout/s;->a(Landroid/app/Activity;)Lca/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll9/k;",
        "Lr9/p<",
        "Lca/c<",
        "-",
        "Landroidx/window/layout/v;",
        ">;",
        "Lj9/d<",
        "-",
        "Lg9/s;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Ll9/f;
    c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1"
    f = "WindowInfoTrackerImpl.kt"
    l = {
        0x36,
        0x37
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:I

.field private synthetic u:Ljava/lang/Object;

.field final synthetic v:Landroidx/window/layout/s;

.field final synthetic w:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroidx/window/layout/s;Landroid/app/Activity;Lj9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/window/layout/s;",
            "Landroid/app/Activity;",
            "Lj9/d<",
            "-",
            "Landroidx/window/layout/s$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/window/layout/s$b;->v:Landroidx/window/layout/s;

    iput-object p2, p0, Landroidx/window/layout/s$b;->w:Landroid/app/Activity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ll9/k;-><init>(ILj9/d;)V

    return-void
.end method

.method public static synthetic v(Lba/f;Landroidx/window/layout/v;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/window/layout/s$b;->x(Lba/f;Landroidx/window/layout/v;)V

    return-void
.end method

.method private static final x(Lba/f;Landroidx/window/layout/v;)V
    .locals 1

    const-string v0, "info"

    invoke-static {p1, v0}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lba/t;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lj9/d;)Lj9/d;
    .locals 3
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

    new-instance v0, Landroidx/window/layout/s$b;

    iget-object v1, p0, Landroidx/window/layout/s$b;->v:Landroidx/window/layout/s;

    iget-object v2, p0, Landroidx/window/layout/s$b;->w:Landroid/app/Activity;

    invoke-direct {v0, v1, v2, p2}, Landroidx/window/layout/s$b;-><init>(Landroidx/window/layout/s;Landroid/app/Activity;Lj9/d;)V

    iput-object p1, v0, Landroidx/window/layout/s$b;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lca/c;

    check-cast p2, Lj9/d;

    invoke-virtual {p0, p1, p2}, Landroidx/window/layout/s$b;->w(Lca/c;Lj9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lk9/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/window/layout/s$b;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/window/layout/s$b;->s:Ljava/lang/Object;

    check-cast v1, Lba/g;

    iget-object v4, p0, Landroidx/window/layout/s$b;->r:Ljava/lang/Object;

    check-cast v4, Landroidx/core/util/a;

    iget-object v5, p0, Landroidx/window/layout/s$b;->u:Ljava/lang/Object;

    check-cast v5, Lca/c;

    :try_start_0
    invoke-static {p1}, Lg9/n;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object p1, v5

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Landroidx/window/layout/s$b;->s:Ljava/lang/Object;

    check-cast v1, Lba/g;

    iget-object v4, p0, Landroidx/window/layout/s$b;->r:Ljava/lang/Object;

    check-cast v4, Landroidx/core/util/a;

    iget-object v5, p0, Landroidx/window/layout/s$b;->u:Ljava/lang/Object;

    check-cast v5, Lca/c;

    :try_start_1
    invoke-static {p1}, Lg9/n;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v6, v5

    move-object v5, p0

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lg9/n;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/window/layout/s$b;->u:Ljava/lang/Object;

    check-cast p1, Lca/c;

    const/16 v1, 0xa

    sget-object v4, Lba/e;->o:Lba/e;

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static {v1, v4, v6, v5, v6}, Lba/h;->b(ILba/e;Lr9/l;ILjava/lang/Object;)Lba/f;

    move-result-object v1

    new-instance v4, Landroidx/window/layout/t;

    invoke-direct {v4, v1}, Landroidx/window/layout/t;-><init>(Lba/f;)V

    iget-object v5, p0, Landroidx/window/layout/s$b;->v:Landroidx/window/layout/s;

    invoke-static {v5}, Landroidx/window/layout/s;->b(Landroidx/window/layout/s;)Landroidx/window/layout/p;

    move-result-object v5

    iget-object v6, p0, Landroidx/window/layout/s$b;->w:Landroid/app/Activity;

    sget-object v7, Landroidx/window/layout/u;->n:Landroidx/window/layout/u;

    invoke-interface {v5, v6, v7, v4}, Landroidx/window/layout/p;->b(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V

    :try_start_2
    invoke-interface {v1}, Lba/p;->iterator()Lba/g;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_0
    move-object v5, p0

    :goto_1
    :try_start_3
    iput-object p1, v5, Landroidx/window/layout/s$b;->u:Ljava/lang/Object;

    iput-object v4, v5, Landroidx/window/layout/s$b;->r:Ljava/lang/Object;

    iput-object v1, v5, Landroidx/window/layout/s$b;->s:Ljava/lang/Object;

    iput v3, v5, Landroidx/window/layout/s$b;->t:I

    invoke-interface {v1, v5}, Lba/g;->a(Lj9/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_3

    return-object v0

    :cond_3
    move-object v8, v6

    move-object v6, p1

    move-object p1, v8

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v1}, Lba/g;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/window/layout/v;

    iput-object v6, v5, Landroidx/window/layout/s$b;->u:Ljava/lang/Object;

    iput-object v4, v5, Landroidx/window/layout/s$b;->r:Ljava/lang/Object;

    iput-object v1, v5, Landroidx/window/layout/s$b;->s:Ljava/lang/Object;

    iput v2, v5, Landroidx/window/layout/s$b;->t:I

    invoke-interface {v6, p1, v5}, Lca/c;->a(Ljava/lang/Object;Lj9/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object p1, v6

    goto :goto_1

    :cond_5
    iget-object p1, v5, Landroidx/window/layout/s$b;->v:Landroidx/window/layout/s;

    invoke-static {p1}, Landroidx/window/layout/s;->b(Landroidx/window/layout/s;)Landroidx/window/layout/p;

    move-result-object p1

    invoke-interface {p1, v4}, Landroidx/window/layout/p;->a(Landroidx/core/util/a;)V

    sget-object p1, Lg9/s;->a:Lg9/s;

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v5, p0

    :goto_3
    iget-object v0, v5, Landroidx/window/layout/s$b;->v:Landroidx/window/layout/s;

    invoke-static {v0}, Landroidx/window/layout/s;->b(Landroidx/window/layout/s;)Landroidx/window/layout/p;

    move-result-object v0

    invoke-interface {v0, v4}, Landroidx/window/layout/p;->a(Landroidx/core/util/a;)V

    throw p1
.end method

.method public final w(Lca/c;Lj9/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca/c<",
            "-",
            "Landroidx/window/layout/v;",
            ">;",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/window/layout/s$b;->e(Ljava/lang/Object;Lj9/d;)Lj9/d;

    move-result-object p1

    check-cast p1, Landroidx/window/layout/s$b;

    sget-object p2, Lg9/s;->a:Lg9/s;

    invoke-virtual {p1, p2}, Landroidx/window/layout/s$b;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
