.class public Ly0/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ly0/s2;

.field private final b:Ly0/l1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly0/l1<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:Ly0/i2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly0/i2<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final d:Ly0/f2;

.field private final e:Ljava/util/concurrent/atomic/AtomicLong;

.field private final f:Ly0/k3;

.field private final g:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly0/s2;Ly0/i2;Ljava/lang/Object;Ly0/f2;Ly0/l1;Ljava/util/concurrent/atomic/AtomicLong;Ly0/k3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/s2;",
            "Ly0/i2<",
            "TT;>;TT;",
            "Ly0/f2;",
            "Ly0/l1<",
            "TT;>;",
            "Ljava/util/concurrent/atomic/AtomicLong;",
            "Ly0/k3;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/b0;->a:Ly0/s2;

    iput-object p2, p0, Ly0/b0;->c:Ly0/i2;

    iput-object p3, p0, Ly0/b0;->g:Ljava/lang/Object;

    iput-object p4, p0, Ly0/b0;->d:Ly0/f2;

    iput-object p5, p0, Ly0/b0;->b:Ly0/l1;

    iput-object p6, p0, Ly0/b0;->e:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p7, p0, Ly0/b0;->f:Ly0/k3;

    return-void
.end method

.method private b(Ljava/lang/String;)Ly0/n0;
    .locals 4

    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    new-instance v1, Ly0/n0$b;

    invoke-direct {v1}, Ly0/n0$b;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ly0/n0$b;->f(I)Ly0/n0$b;

    move-result-object v1

    sget-object v2, Ly0/n0$c;->q:Ly0/n0$c;

    invoke-virtual {v2}, Ly0/n0$c;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ly0/n0$b;->a(I)Ly0/n0$b;

    move-result-object v1

    iget-object v2, p0, Ly0/b0;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ly0/n0$b;->b(J)Ly0/n0$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Ly0/n0$b;->d(Ljava/util/Date;)Ly0/n0$b;

    move-result-object v0

    const-string v1, "bf_disk_error"

    invoke-virtual {v0, v1}, Ly0/n0$b;->h(Ljava/lang/String;)Ly0/n0$b;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ly0/n0$b;->g(Ljava/lang/String;)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Ly0/n0$b;->c(Ljava/lang/String;)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ly0/n0$b;->i(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Ly0/n0$b;->k(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Ly0/n0$b;->j(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p1

    invoke-virtual {p1}, Ly0/n0$b;->e()Ly0/n0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 5

    iget-object v0, p0, Ly0/b0;->b:Ly0/l1;

    iget-object v1, p0, Ly0/b0;->g:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ly0/l1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ly0/b0;->c:Ly0/i2;

    invoke-interface {v1}, Ly0/i2;->a()Ly0/z2;

    move-result-object v1

    invoke-virtual {v1, v0}, Ly0/z2;->e(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v1, "Bugfender couldn\'t store the log on disk due to an error."

    const-string v2, "Bugfender-SDK"

    invoke-static {v2, v1}, Ly0/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Ly0/b0;->f:Ly0/k3;

    invoke-virtual {v2}, Ly0/k3;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Ly0/b0;->b(Ljava/lang/String;)Ly0/n0;

    move-result-object v1

    new-instance v2, Ly0/r1;

    iget-object v3, p0, Ly0/b0;->a:Ly0/s2;

    iget-object v4, p0, Ly0/b0;->d:Ly0/f2;

    invoke-direct {v2, v3, v4, v1}, Ly0/r1;-><init>(Ly0/s2;Ly0/f2;Ly0/n0;)V

    invoke-virtual {v2}, Ly0/r1;->b()Ly0/n2;

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly0/b0;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
