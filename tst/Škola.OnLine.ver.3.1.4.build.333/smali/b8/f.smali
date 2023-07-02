.class public Lb8/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;


# instance fields
.field private n:Lt8/k;

.field private o:Lt8/d;

.field private p:Lb8/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lt8/c;Landroid/content/Context;)V
    .locals 2

    new-instance v0, Lt8/k;

    const-string v1, "dev.fluttercommunity.plus/connectivity"

    invoke-direct {v0, p1, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lb8/f;->n:Lt8/k;

    new-instance v0, Lt8/d;

    const-string v1, "dev.fluttercommunity.plus/connectivity_status"

    invoke-direct {v0, p1, v1}, Lt8/d;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lb8/f;->o:Lt8/d;

    const-string p1, "connectivity"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    new-instance v0, Lb8/a;

    invoke-direct {v0, p1}, Lb8/a;-><init>(Landroid/net/ConnectivityManager;)V

    new-instance p1, Lb8/e;

    invoke-direct {p1, v0}, Lb8/e;-><init>(Lb8/a;)V

    new-instance v1, Lb8/d;

    invoke-direct {v1, p2, v0}, Lb8/d;-><init>(Landroid/content/Context;Lb8/a;)V

    iput-object v1, p0, Lb8/f;->p:Lb8/d;

    iget-object p2, p0, Lb8/f;->n:Lt8/k;

    invoke-virtual {p2, p1}, Lt8/k;->e(Lt8/k$c;)V

    iget-object p1, p0, Lb8/f;->o:Lt8/d;

    iget-object p2, p0, Lb8/f;->p:Lb8/d;

    invoke-virtual {p1, p2}, Lt8/d;->d(Lt8/d$d;)V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lb8/f;->n:Lt8/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt8/k;->e(Lt8/k$c;)V

    iget-object v0, p0, Lb8/f;->o:Lt8/d;

    invoke-virtual {v0, v1}, Lt8/d;->d(Lt8/d$d;)V

    iget-object v0, p0, Lb8/f;->p:Lb8/d;

    invoke-virtual {v0, v1}, Lb8/d;->b(Ljava/lang/Object;)V

    iput-object v1, p0, Lb8/f;->n:Lt8/k;

    iput-object v1, p0, Lb8/f;->o:Lt8/d;

    iput-object v1, p0, Lb8/f;->p:Lb8/d;

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 1

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object v0

    invoke-virtual {p1}, Lk8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lb8/f;->a(Lt8/c;Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 0

    invoke-direct {p0}, Lb8/f;->b()V

    return-void
.end method
