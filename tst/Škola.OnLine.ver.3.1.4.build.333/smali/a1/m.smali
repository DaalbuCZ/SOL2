.class public final La1/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;
.implements Ll8/a;


# instance fields
.field private final n:La1/n;

.field private o:Lt8/k;

.field private p:Lt8/o;

.field private q:Ll8/c;

.field private r:La1/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La1/n;

    invoke-direct {v0}, La1/n;-><init>()V

    iput-object v0, p0, La1/m;->n:La1/n;

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, La1/m;->q:Ll8/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, La1/m;->n:La1/n;

    invoke-interface {v0, v1}, Ll8/c;->d(Lt8/m;)V

    iget-object v0, p0, La1/m;->q:Ll8/c;

    iget-object v1, p0, La1/m;->n:La1/n;

    invoke-interface {v0, v1}, Ll8/c;->g(Lt8/p;)V

    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, La1/m;->p:Lt8/o;

    if-eqz v0, :cond_0

    iget-object v1, p0, La1/m;->n:La1/n;

    invoke-interface {v0, v1}, Lt8/o;->b(Lt8/m;)Lt8/o;

    iget-object v0, p0, La1/m;->p:Lt8/o;

    iget-object v1, p0, La1/m;->n:La1/n;

    invoke-interface {v0, v1}, Lt8/o;->c(Lt8/p;)Lt8/o;

    goto :goto_0

    :cond_0
    iget-object v0, p0, La1/m;->q:Ll8/c;

    if-eqz v0, :cond_1

    iget-object v1, p0, La1/m;->n:La1/n;

    invoke-interface {v0, v1}, Ll8/c;->b(Lt8/m;)V

    iget-object v0, p0, La1/m;->q:Ll8/c;

    iget-object v1, p0, La1/m;->n:La1/n;

    invoke-interface {v0, v1}, Ll8/c;->c(Lt8/p;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private c(Landroid/content/Context;Lt8/c;)V
    .locals 3

    new-instance v0, Lt8/k;

    const-string v1, "flutter.baseflow.com/permissions/methods"

    invoke-direct {v0, p2, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, La1/m;->o:Lt8/k;

    new-instance p2, La1/l;

    new-instance v0, La1/a;

    invoke-direct {v0}, La1/a;-><init>()V

    iget-object v1, p0, La1/m;->n:La1/n;

    new-instance v2, La1/p;

    invoke-direct {v2}, La1/p;-><init>()V

    invoke-direct {p2, p1, v0, v1, v2}, La1/l;-><init>(Landroid/content/Context;La1/a;La1/n;La1/p;)V

    iput-object p2, p0, La1/m;->r:La1/l;

    iget-object p1, p0, La1/m;->o:Lt8/k;

    invoke-virtual {p1, p2}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method

.method private d(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, La1/m;->r:La1/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La1/l;->i(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    iget-object v0, p0, La1/m;->o:Lt8/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt8/k;->e(Lt8/k$c;)V

    iput-object v1, p0, La1/m;->o:Lt8/k;

    iput-object v1, p0, La1/m;->r:La1/l;

    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, La1/m;->r:La1/l;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La1/l;->i(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Ll8/c;)V
    .locals 1

    invoke-interface {p1}, Ll8/c;->e()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, v0}, La1/m;->d(Landroid/app/Activity;)V

    iput-object p1, p0, La1/m;->q:Ll8/c;

    invoke-direct {p0}, La1/m;->b()V

    return-void
.end method

.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 1

    invoke-virtual {p1}, Lk8/a$b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    invoke-direct {p0, v0, p1}, La1/m;->c(Landroid/content/Context;Lt8/c;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 0

    invoke-direct {p0}, La1/m;->f()V

    invoke-direct {p0}, La1/m;->a()V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, La1/m;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 0

    invoke-direct {p0}, La1/m;->e()V

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Ll8/c;)V
    .locals 0

    invoke-virtual {p0, p1}, La1/m;->onAttachedToActivity(Ll8/c;)V

    return-void
.end method
