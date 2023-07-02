.class public Ll1/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll1/t;


# static fields
.field private static volatile e:Ll1/v;


# instance fields
.field private final a:Lv1/a;

.field private final b:Lv1/a;

.field private final c:Lr1/e;

.field private final d:Ls1/s;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lv1/a;Lv1/a;Lr1/e;Ls1/s;Ls1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/u;->a:Lv1/a;

    iput-object p2, p0, Ll1/u;->b:Lv1/a;

    iput-object p3, p0, Ll1/u;->c:Lr1/e;

    iput-object p4, p0, Ll1/u;->d:Ls1/s;

    invoke-virtual {p5}, Ls1/w;->c()V

    return-void
.end method

.method private b(Ll1/o;)Ll1/i;
    .locals 4

    invoke-static {}, Ll1/i;->a()Ll1/i$a;

    move-result-object v0

    iget-object v1, p0, Ll1/u;->a:Lv1/a;

    invoke-interface {v1}, Lv1/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll1/i$a;->i(J)Ll1/i$a;

    move-result-object v0

    iget-object v1, p0, Ll1/u;->b:Lv1/a;

    invoke-interface {v1}, Lv1/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll1/i$a;->k(J)Ll1/i$a;

    move-result-object v0

    invoke-virtual {p1}, Ll1/o;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll1/i$a;->j(Ljava/lang/String;)Ll1/i$a;

    move-result-object v0

    new-instance v1, Ll1/h;

    invoke-virtual {p1}, Ll1/o;->b()Lj1/b;

    move-result-object v2

    invoke-virtual {p1}, Ll1/o;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll1/h;-><init>(Lj1/b;[B)V

    invoke-virtual {v0, v1}, Ll1/i$a;->h(Ll1/h;)Ll1/i$a;

    move-result-object v0

    invoke-virtual {p1}, Ll1/o;->c()Lj1/c;

    move-result-object p1

    invoke-virtual {p1}, Lj1/c;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll1/i$a;->g(Ljava/lang/Integer;)Ll1/i$a;

    move-result-object p1

    invoke-virtual {p1}, Ll1/i$a;->d()Ll1/i;

    move-result-object p1

    return-object p1
.end method

.method public static c()Ll1/u;
    .locals 2

    sget-object v0, Ll1/u;->e:Ll1/v;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll1/v;->b()Ll1/u;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static d(Ll1/f;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/f;",
            ")",
            "Ljava/util/Set<",
            "Lj1/b;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Ll1/g;

    if-eqz v0, :cond_0

    check-cast p0, Ll1/g;

    invoke-interface {p0}, Ll1/g;->a()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    invoke-static {p0}, Lj1/b;->b(Ljava/lang/String;)Lj1/b;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Ll1/u;->e:Ll1/v;

    if-nez v0, :cond_1

    const-class v0, Ll1/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ll1/u;->e:Ll1/v;

    if-nez v1, :cond_0

    invoke-static {}, Ll1/e;->c()Ll1/v$a;

    move-result-object v1

    invoke-interface {v1, p0}, Ll1/v$a;->b(Landroid/content/Context;)Ll1/v$a;

    move-result-object p0

    invoke-interface {p0}, Ll1/v$a;->a()Ll1/v;

    move-result-object p0

    sput-object p0, Ll1/u;->e:Ll1/v;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ll1/o;Lj1/h;)V
    .locals 3

    iget-object v0, p0, Ll1/u;->c:Lr1/e;

    invoke-virtual {p1}, Ll1/o;->f()Ll1/p;

    move-result-object v1

    invoke-virtual {p1}, Ll1/o;->c()Lj1/c;

    move-result-object v2

    invoke-virtual {v2}, Lj1/c;->c()Lj1/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll1/p;->f(Lj1/d;)Ll1/p;

    move-result-object v1

    invoke-direct {p0, p1}, Ll1/u;->b(Ll1/o;)Ll1/i;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Lr1/e;->a(Ll1/p;Ll1/i;Lj1/h;)V

    return-void
.end method

.method public e()Ls1/s;
    .locals 1

    iget-object v0, p0, Ll1/u;->d:Ls1/s;

    return-object v0
.end method

.method public g(Ll1/f;)Lj1/g;
    .locals 4

    new-instance v0, Ll1/q;

    invoke-static {p1}, Ll1/u;->d(Ll1/f;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, Ll1/p;->a()Ll1/p$a;

    move-result-object v2

    invoke-interface {p1}, Ll1/f;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll1/p$a;->b(Ljava/lang/String;)Ll1/p$a;

    move-result-object v2

    invoke-interface {p1}, Ll1/f;->f()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Ll1/p$a;->c([B)Ll1/p$a;

    move-result-object p1

    invoke-virtual {p1}, Ll1/p$a;->a()Ll1/p;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Ll1/q;-><init>(Ljava/util/Set;Ll1/p;Ll1/t;)V

    return-object v0
.end method
