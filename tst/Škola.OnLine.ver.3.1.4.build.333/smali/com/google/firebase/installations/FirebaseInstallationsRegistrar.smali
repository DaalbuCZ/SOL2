.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp5/e;)Lo6/e;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Lp5/e;)Lo6/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lp5/e;)Lo6/e;
    .locals 6

    new-instance v0, Lcom/google/firebase/installations/c;

    const-class v1, Lk5/e;

    invoke-interface {p0, v1}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk5/e;

    const-class v2, Ll6/i;

    invoke-interface {p0, v2}, Lp5/e;->g(Ljava/lang/Class;)Ln6/b;

    move-result-object v2

    const-class v3, Lo5/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Lp5/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp5/f0;

    move-result-object v3

    invoke-interface {p0, v3}, Lp5/e;->c(Lp5/f0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    const-class v4, Lo5/b;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, Lp5/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp5/f0;

    move-result-object v4

    invoke-interface {p0, v4}, Lp5/e;->c(Lp5/f0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p0}, Lq5/i;->b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/installations/c;-><init>(Lk5/e;Ln6/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp5/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Lp5/c;

    const-class v1, Lo6/e;

    invoke-static {v1}, Lp5/c;->c(Ljava/lang/Class;)Lp5/c$b;

    move-result-object v1

    const-string v2, "fire-installations"

    invoke-virtual {v1, v2}, Lp5/c$b;->h(Ljava/lang/String;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lk5/e;

    invoke-static {v3}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Ll6/i;

    invoke-static {v3}, Lp5/r;->i(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lo5/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Lp5/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp5/f0;

    move-result-object v3

    invoke-static {v3}, Lp5/r;->k(Lp5/f0;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lo5/b;

    const-class v4, Ljava/util/concurrent/Executor;

    invoke-static {v3, v4}, Lp5/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp5/f0;

    move-result-object v3

    invoke-static {v3}, Lp5/r;->k(Lp5/f0;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    sget-object v3, Lo6/f;->a:Lo6/f;

    invoke-virtual {v1, v3}, Lp5/c$b;->f(Lp5/h;)Lp5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lp5/c$b;->d()Lp5/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    invoke-static {}, Ll6/h;->a()Lp5/c;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "17.1.2"

    invoke-static {v2, v1}, Lh7/h;->b(Ljava/lang/String;Ljava/lang/String;)Lp5/c;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
