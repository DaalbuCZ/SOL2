.class public Ln1/w;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lo1/d;

.field private final c:Ln1/y;

.field private final d:Lp1/b;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lo1/d;Ln1/y;Lp1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/w;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ln1/w;->b:Lo1/d;

    iput-object p3, p0, Ln1/w;->c:Ln1/y;

    iput-object p4, p0, Ln1/w;->d:Lp1/b;

    return-void
.end method

.method public static synthetic a(Ln1/w;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Ln1/w;->d()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ln1/w;)V
    .locals 0

    invoke-direct {p0}, Ln1/w;->e()V

    return-void
.end method

.method private synthetic d()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ln1/w;->b:Lo1/d;

    invoke-interface {v0}, Lo1/d;->C()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/p;

    iget-object v2, p0, Ln1/w;->c:Ln1/y;

    const/4 v3, 0x1

    invoke-interface {v2, v1, v3}, Ln1/y;->b(Lg1/p;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic e()V
    .locals 2

    iget-object v0, p0, Ln1/w;->d:Lp1/b;

    new-instance v1, Ln1/v;

    invoke-direct {v1, p0}, Ln1/v;-><init>(Ln1/w;)V

    invoke-interface {v0, v1}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Ln1/w;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Ln1/u;

    invoke-direct {v1, p0}, Ln1/u;-><init>(Ln1/w;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
