.class public Lt7/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc8/a;


# instance fields
.field private n:Ll8/k;

.field private o:Ll8/d;

.field private p:Lt7/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ll8/c;Landroid/content/Context;)V
    .locals 2

    new-instance v0, Ll8/k;

    const-string v1, "dev.fluttercommunity.plus/connectivity"

    invoke-direct {v0, p1, v1}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lt7/f;->n:Ll8/k;

    new-instance v0, Ll8/d;

    const-string v1, "dev.fluttercommunity.plus/connectivity_status"

    invoke-direct {v0, p1, v1}, Ll8/d;-><init>(Ll8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lt7/f;->o:Ll8/d;

    const-string p1, "connectivity"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    new-instance v0, Lt7/a;

    invoke-direct {v0, p1}, Lt7/a;-><init>(Landroid/net/ConnectivityManager;)V

    new-instance p1, Lt7/e;

    invoke-direct {p1, v0}, Lt7/e;-><init>(Lt7/a;)V

    new-instance v1, Lt7/d;

    invoke-direct {v1, p2, v0}, Lt7/d;-><init>(Landroid/content/Context;Lt7/a;)V

    iput-object v1, p0, Lt7/f;->p:Lt7/d;

    iget-object p2, p0, Lt7/f;->n:Ll8/k;

    invoke-virtual {p2, p1}, Ll8/k;->e(Ll8/k$c;)V

    iget-object p1, p0, Lt7/f;->o:Ll8/d;

    iget-object p2, p0, Lt7/f;->p:Lt7/d;

    invoke-virtual {p1, p2}, Ll8/d;->d(Ll8/d$d;)V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lt7/f;->n:Ll8/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll8/k;->e(Ll8/k$c;)V

    iget-object v0, p0, Lt7/f;->o:Ll8/d;

    invoke-virtual {v0, v1}, Ll8/d;->d(Ll8/d$d;)V

    iget-object v0, p0, Lt7/f;->p:Lt7/d;

    invoke-virtual {v0, v1}, Lt7/d;->b(Ljava/lang/Object;)V

    iput-object v1, p0, Lt7/f;->n:Ll8/k;

    iput-object v1, p0, Lt7/f;->o:Ll8/d;

    iput-object v1, p0, Lt7/f;->p:Lt7/d;

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(Lc8/a$b;)V
    .locals 1

    invoke-virtual {p1}, Lc8/a$b;->b()Ll8/c;

    move-result-object v0

    invoke-virtual {p1}, Lc8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lt7/f;->a(Ll8/c;Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lc8/a$b;)V
    .locals 0

    invoke-direct {p0}, Lt7/f;->b()V

    return-void
.end method
