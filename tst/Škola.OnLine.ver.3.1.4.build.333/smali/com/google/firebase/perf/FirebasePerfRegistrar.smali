.class public Lcom/google/firebase/perf/FirebasePerfRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final EARLY_LIBRARY_NAME:Ljava/lang/String; = "fire-perf-early"

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-perf"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp5/e;)Lw6/e;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->providesFirebasePerformance(Lp5/e;)Lw6/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp5/f0;Lp5/e;)Lw6/b;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->lambda$getComponents$0(Lp5/f0;Lp5/e;)Lw6/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lp5/f0;Lp5/e;)Lw6/b;
    .locals 3

    new-instance v0, Lw6/b;

    const-class v1, Lk5/e;

    invoke-interface {p1, v1}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk5/e;

    const-class v2, Lk5/m;

    invoke-interface {p1, v2}, Lp5/e;->g(Ljava/lang/Class;)Ln6/b;

    move-result-object v2

    invoke-interface {v2}, Ln6/b;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk5/m;

    invoke-interface {p1, p0}, Lp5/e;->c(Lp5/f0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, p0}, Lw6/b;-><init>(Lk5/e;Lk5/m;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method private static providesFirebasePerformance(Lp5/e;)Lw6/e;
    .locals 6

    const-class v0, Lw6/b;

    invoke-interface {p0, v0}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    invoke-static {}, Lx6/a;->b()Lx6/a$b;

    move-result-object v0

    new-instance v1, Ly6/a;

    const-class v2, Lk5/e;

    invoke-interface {p0, v2}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk5/e;

    const-class v3, Lo6/e;

    invoke-interface {p0, v3}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo6/e;

    const-class v4, Lcom/google/firebase/remoteconfig/c;

    invoke-interface {p0, v4}, Lp5/e;->g(Ljava/lang/Class;)Ln6/b;

    move-result-object v4

    const-class v5, Lj1/g;

    invoke-interface {p0, v5}, Lp5/e;->g(Ljava/lang/Class;)Ln6/b;

    move-result-object p0

    invoke-direct {v1, v2, v3, v4, p0}, Ly6/a;-><init>(Lk5/e;Lo6/e;Ln6/b;Ln6/b;)V

    invoke-virtual {v0, v1}, Lx6/a$b;->b(Ly6/a;)Lx6/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lx6/a$b;->a()Lx6/b;

    move-result-object p0

    invoke-interface {p0}, Lx6/b;->a()Lw6/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp5/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lw6/b;

    const-class v1, Lk5/e;

    const-class v2, Lo5/d;

    const-class v3, Ljava/util/concurrent/Executor;

    invoke-static {v2, v3}, Lp5/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp5/f0;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lp5/c;

    const-class v4, Lw6/e;

    invoke-static {v4}, Lp5/c;->c(Ljava/lang/Class;)Lp5/c$b;

    move-result-object v4

    const-string v5, "fire-perf"

    invoke-virtual {v4, v5}, Lp5/c$b;->h(Ljava/lang/String;)Lp5/c$b;

    move-result-object v4

    invoke-static {v1}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v6

    invoke-virtual {v4, v6}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v4

    const-class v6, Lcom/google/firebase/remoteconfig/c;

    invoke-static {v6}, Lp5/r;->l(Ljava/lang/Class;)Lp5/r;

    move-result-object v6

    invoke-virtual {v4, v6}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v4

    const-class v6, Lo6/e;

    invoke-static {v6}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v6

    invoke-virtual {v4, v6}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v4

    const-class v6, Lj1/g;

    invoke-static {v6}, Lp5/r;->l(Ljava/lang/Class;)Lp5/r;

    move-result-object v6

    invoke-virtual {v4, v6}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v4

    invoke-static {v0}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v6

    invoke-virtual {v4, v6}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v4

    sget-object v6, Lw6/d;->a:Lw6/d;

    invoke-virtual {v4, v6}, Lp5/c$b;->f(Lp5/h;)Lp5/c$b;

    move-result-object v4

    invoke-virtual {v4}, Lp5/c$b;->d()Lp5/c;

    move-result-object v4

    const/4 v6, 0x0

    aput-object v4, v3, v6

    invoke-static {v0}, Lp5/c;->c(Ljava/lang/Class;)Lp5/c$b;

    move-result-object v0

    const-string v4, "fire-perf-early"

    invoke-virtual {v0, v4}, Lp5/c$b;->h(Ljava/lang/String;)Lp5/c$b;

    move-result-object v0

    invoke-static {v1}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v0

    const-class v1, Lk5/m;

    invoke-static {v1}, Lp5/r;->i(Ljava/lang/Class;)Lp5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v0

    invoke-static {v2}, Lp5/r;->k(Lp5/f0;)Lp5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lp5/c$b;->e()Lp5/c$b;

    move-result-object v0

    new-instance v1, Lw6/c;

    invoke-direct {v1, v2}, Lw6/c;-><init>(Lp5/f0;)V

    invoke-virtual {v0, v1}, Lp5/c$b;->f(Lp5/h;)Lp5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lp5/c$b;->d()Lp5/c;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v0, "20.3.1"

    invoke-static {v5, v0}, Lh7/h;->b(Ljava/lang/String;Ljava/lang/String;)Lp5/c;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v3, v1

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
