.class public Lg1/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg1/t;


# static fields
.field private static volatile e:Lg1/v;


# instance fields
.field private final a:Lq1/a;

.field private final b:Lq1/a;

.field private final c:Lm1/e;

.field private final d:Ln1/s;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lq1/a;Lq1/a;Lm1/e;Ln1/s;Ln1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/u;->a:Lq1/a;

    iput-object p2, p0, Lg1/u;->b:Lq1/a;

    iput-object p3, p0, Lg1/u;->c:Lm1/e;

    iput-object p4, p0, Lg1/u;->d:Ln1/s;

    invoke-virtual {p5}, Ln1/w;->c()V

    return-void
.end method

.method private b(Lg1/o;)Lg1/i;
    .locals 4

    invoke-static {}, Lg1/i;->a()Lg1/i$a;

    move-result-object v0

    iget-object v1, p0, Lg1/u;->a:Lq1/a;

    invoke-interface {v1}, Lq1/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg1/i$a;->i(J)Lg1/i$a;

    move-result-object v0

    iget-object v1, p0, Lg1/u;->b:Lq1/a;

    invoke-interface {v1}, Lq1/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg1/i$a;->k(J)Lg1/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lg1/o;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg1/i$a;->j(Ljava/lang/String;)Lg1/i$a;

    move-result-object v0

    new-instance v1, Lg1/h;

    invoke-virtual {p1}, Lg1/o;->b()Le1/b;

    move-result-object v2

    invoke-virtual {p1}, Lg1/o;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lg1/h;-><init>(Le1/b;[B)V

    invoke-virtual {v0, v1}, Lg1/i$a;->h(Lg1/h;)Lg1/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lg1/o;->c()Le1/c;

    move-result-object p1

    invoke-virtual {p1}, Le1/c;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg1/i$a;->g(Ljava/lang/Integer;)Lg1/i$a;

    move-result-object p1

    invoke-virtual {p1}, Lg1/i$a;->d()Lg1/i;

    move-result-object p1

    return-object p1
.end method

.method public static c()Lg1/u;
    .locals 2

    sget-object v0, Lg1/u;->e:Lg1/v;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg1/v;->b()Lg1/u;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static d(Lg1/f;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/f;",
            ")",
            "Ljava/util/Set<",
            "Le1/b;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lg1/g;

    if-eqz v0, :cond_0

    check-cast p0, Lg1/g;

    invoke-interface {p0}, Lg1/g;->a()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    invoke-static {p0}, Le1/b;->b(Ljava/lang/String;)Le1/b;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lg1/u;->e:Lg1/v;

    if-nez v0, :cond_1

    const-class v0, Lg1/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg1/u;->e:Lg1/v;

    if-nez v1, :cond_0

    invoke-static {}, Lg1/e;->c()Lg1/v$a;

    move-result-object v1

    invoke-interface {v1, p0}, Lg1/v$a;->b(Landroid/content/Context;)Lg1/v$a;

    move-result-object p0

    invoke-interface {p0}, Lg1/v$a;->a()Lg1/v;

    move-result-object p0

    sput-object p0, Lg1/u;->e:Lg1/v;

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
.method public a(Lg1/o;Le1/h;)V
    .locals 3

    iget-object v0, p0, Lg1/u;->c:Lm1/e;

    invoke-virtual {p1}, Lg1/o;->f()Lg1/p;

    move-result-object v1

    invoke-virtual {p1}, Lg1/o;->c()Le1/c;

    move-result-object v2

    invoke-virtual {v2}, Le1/c;->c()Le1/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg1/p;->f(Le1/d;)Lg1/p;

    move-result-object v1

    invoke-direct {p0, p1}, Lg1/u;->b(Lg1/o;)Lg1/i;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Lm1/e;->a(Lg1/p;Lg1/i;Le1/h;)V

    return-void
.end method

.method public e()Ln1/s;
    .locals 1

    iget-object v0, p0, Lg1/u;->d:Ln1/s;

    return-object v0
.end method

.method public g(Lg1/f;)Le1/g;
    .locals 4

    new-instance v0, Lg1/q;

    invoke-static {p1}, Lg1/u;->d(Lg1/f;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, Lg1/p;->a()Lg1/p$a;

    move-result-object v2

    invoke-interface {p1}, Lg1/f;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lg1/p$a;->b(Ljava/lang/String;)Lg1/p$a;

    move-result-object v2

    invoke-interface {p1}, Lg1/f;->f()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Lg1/p$a;->c([B)Lg1/p$a;

    move-result-object p1

    invoke-virtual {p1}, Lg1/p$a;->a()Lg1/p;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Lg1/q;-><init>(Ljava/util/Set;Lg1/p;Lg1/t;)V

    return-object v0
.end method
