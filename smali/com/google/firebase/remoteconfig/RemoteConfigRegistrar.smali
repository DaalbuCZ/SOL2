.class public Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-rc"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lk5/f0;Lk5/e;)Lcom/google/firebase/remoteconfig/c;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->lambda$getComponents$0(Lk5/f0;Lk5/e;)Lcom/google/firebase/remoteconfig/c;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lk5/f0;Lk5/e;)Lcom/google/firebase/remoteconfig/c;
    .locals 8

    new-instance v7, Lcom/google/firebase/remoteconfig/c;

    const-class v0, Landroid/content/Context;

    invoke-interface {p1, v0}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    invoke-interface {p1, p0}, Lk5/e;->h(Lk5/f0;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Ljava/util/concurrent/Executor;

    const-class p0, Lf5/e;

    invoke-interface {p1, p0}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lf5/e;

    const-class p0, Lj6/e;

    invoke-interface {p1, p0}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lj6/e;

    const-class p0, Lcom/google/firebase/abt/component/a;

    invoke-interface {p1, p0}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/abt/component/a;

    const-string v0, "frc"

    invoke-virtual {p0, v0}, Lcom/google/firebase/abt/component/a;->b(Ljava/lang/String;)Lg5/c;

    move-result-object v5

    const-class p0, Li5/a;

    invoke-interface {p1, p0}, Lk5/e;->f(Ljava/lang/Class;)Li6/b;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/remoteconfig/c;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lf5/e;Lj6/e;Lg5/c;Li6/b;)V

    return-object v7
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk5/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lj5/b;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lk5/f0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lk5/f0;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lk5/c;

    const-class v2, Lcom/google/firebase/remoteconfig/c;

    invoke-static {v2}, Lk5/c;->c(Ljava/lang/Class;)Lk5/c$b;

    move-result-object v2

    const-string v3, "fire-rc"

    invoke-virtual {v2, v3}, Lk5/c$b;->h(Ljava/lang/String;)Lk5/c$b;

    move-result-object v2

    const-class v4, Landroid/content/Context;

    invoke-static {v4}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v4

    invoke-virtual {v2, v4}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v2

    invoke-static {v0}, Lk5/r;->k(Lk5/f0;)Lk5/r;

    move-result-object v4

    invoke-virtual {v2, v4}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v2

    const-class v4, Lf5/e;

    invoke-static {v4}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v4

    invoke-virtual {v2, v4}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v2

    const-class v4, Lj6/e;

    invoke-static {v4}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v4

    invoke-virtual {v2, v4}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v2

    const-class v4, Lcom/google/firebase/abt/component/a;

    invoke-static {v4}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v4

    invoke-virtual {v2, v4}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v2

    const-class v4, Li5/a;

    invoke-static {v4}, Lk5/r;->i(Ljava/lang/Class;)Lk5/r;

    move-result-object v4

    invoke-virtual {v2, v4}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v2

    new-instance v4, Ld7/n;

    invoke-direct {v4, v0}, Ld7/n;-><init>(Lk5/f0;)V

    invoke-virtual {v2, v4}, Lk5/c$b;->f(Lk5/h;)Lk5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lk5/c$b;->e()Lk5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lk5/c$b;->d()Lk5/c;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "21.2.1"

    invoke-static {v3, v0}, Lc7/h;->b(Ljava/lang/String;Ljava/lang/String;)Lk5/c;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
