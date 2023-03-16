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

.method public static synthetic a(Lk5/e;)Lr6/e;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->providesFirebasePerformance(Lk5/e;)Lr6/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lk5/f0;Lk5/e;)Lr6/b;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->lambda$getComponents$0(Lk5/f0;Lk5/e;)Lr6/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lk5/f0;Lk5/e;)Lr6/b;
    .locals 3

    new-instance v0, Lr6/b;

    const-class v1, Lf5/e;

    invoke-interface {p1, v1}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf5/e;

    const-class v2, Lf5/m;

    invoke-interface {p1, v2}, Lk5/e;->f(Ljava/lang/Class;)Li6/b;

    move-result-object v2

    invoke-interface {v2}, Li6/b;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf5/m;

    invoke-interface {p1, p0}, Lk5/e;->h(Lk5/f0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, p0}, Lr6/b;-><init>(Lf5/e;Lf5/m;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method private static providesFirebasePerformance(Lk5/e;)Lr6/e;
    .locals 6

    const-class v0, Lr6/b;

    invoke-interface {p0, v0}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    invoke-static {}, Ls6/a;->b()Ls6/a$b;

    move-result-object v0

    new-instance v1, Lt6/a;

    const-class v2, Lf5/e;

    invoke-interface {p0, v2}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf5/e;

    const-class v3, Lj6/e;

    invoke-interface {p0, v3}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj6/e;

    const-class v4, Lcom/google/firebase/remoteconfig/c;

    invoke-interface {p0, v4}, Lk5/e;->f(Ljava/lang/Class;)Li6/b;

    move-result-object v4

    const-class v5, Le1/g;

    invoke-interface {p0, v5}, Lk5/e;->f(Ljava/lang/Class;)Li6/b;

    move-result-object p0

    invoke-direct {v1, v2, v3, v4, p0}, Lt6/a;-><init>(Lf5/e;Lj6/e;Li6/b;Li6/b;)V

    invoke-virtual {v0, v1}, Ls6/a$b;->b(Lt6/a;)Ls6/a$b;

    move-result-object p0

    invoke-virtual {p0}, Ls6/a$b;->a()Ls6/b;

    move-result-object p0

    invoke-interface {p0}, Ls6/b;->a()Lr6/e;

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
            "Lk5/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lr6/b;

    const-class v1, Lf5/e;

    const-class v2, Lj5/d;

    const-class v3, Ljava/util/concurrent/Executor;

    invoke-static {v2, v3}, Lk5/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lk5/f0;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lk5/c;

    const-class v4, Lr6/e;

    invoke-static {v4}, Lk5/c;->c(Ljava/lang/Class;)Lk5/c$b;

    move-result-object v4

    const-string v5, "fire-perf"

    invoke-virtual {v4, v5}, Lk5/c$b;->h(Ljava/lang/String;)Lk5/c$b;

    move-result-object v4

    invoke-static {v1}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v6

    invoke-virtual {v4, v6}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v4

    const-class v6, Lcom/google/firebase/remoteconfig/c;

    invoke-static {v6}, Lk5/r;->l(Ljava/lang/Class;)Lk5/r;

    move-result-object v6

    invoke-virtual {v4, v6}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v4

    const-class v6, Lj6/e;

    invoke-static {v6}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v6

    invoke-virtual {v4, v6}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v4

    const-class v6, Le1/g;

    invoke-static {v6}, Lk5/r;->l(Ljava/lang/Class;)Lk5/r;

    move-result-object v6

    invoke-virtual {v4, v6}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v4

    invoke-static {v0}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v6

    invoke-virtual {v4, v6}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v4

    sget-object v6, Lr6/d;->a:Lr6/d;

    invoke-virtual {v4, v6}, Lk5/c$b;->f(Lk5/h;)Lk5/c$b;

    move-result-object v4

    invoke-virtual {v4}, Lk5/c$b;->d()Lk5/c;

    move-result-object v4

    const/4 v6, 0x0

    aput-object v4, v3, v6

    invoke-static {v0}, Lk5/c;->c(Ljava/lang/Class;)Lk5/c$b;

    move-result-object v0

    const-string v4, "fire-perf-early"

    invoke-virtual {v0, v4}, Lk5/c$b;->h(Ljava/lang/String;)Lk5/c$b;

    move-result-object v0

    invoke-static {v1}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v0

    const-class v1, Lf5/m;

    invoke-static {v1}, Lk5/r;->i(Ljava/lang/Class;)Lk5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v0

    invoke-static {v2}, Lk5/r;->k(Lk5/f0;)Lk5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lk5/c$b;->e()Lk5/c$b;

    move-result-object v0

    new-instance v1, Lr6/c;

    invoke-direct {v1, v2}, Lr6/c;-><init>(Lk5/f0;)V

    invoke-virtual {v0, v1}, Lk5/c$b;->f(Lk5/h;)Lk5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lk5/c$b;->d()Lk5/c;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v0, "20.3.1"

    invoke-static {v5, v0}, Lc7/h;->b(Ljava/lang/String;Ljava/lang/String;)Lk5/c;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v3, v1

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
