.class public final Lv0/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc8/a;
.implements Ld8/a;


# instance fields
.field private final n:Lv0/n;

.field private o:Ll8/k;

.field private p:Ll8/o;

.field private q:Ld8/c;

.field private r:Lv0/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv0/n;

    invoke-direct {v0}, Lv0/n;-><init>()V

    iput-object v0, p0, Lv0/m;->n:Lv0/n;

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lv0/m;->q:Ld8/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lv0/m;->n:Lv0/n;

    invoke-interface {v0, v1}, Ld8/c;->h(Ll8/m;)V

    iget-object v0, p0, Lv0/m;->q:Ld8/c;

    iget-object v1, p0, Lv0/m;->n:Lv0/n;

    invoke-interface {v0, v1}, Ld8/c;->g(Ll8/p;)V

    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lv0/m;->p:Ll8/o;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lv0/m;->n:Lv0/n;

    invoke-interface {v0, v1}, Ll8/o;->b(Ll8/m;)Ll8/o;

    iget-object v0, p0, Lv0/m;->p:Ll8/o;

    iget-object v1, p0, Lv0/m;->n:Lv0/n;

    invoke-interface {v0, v1}, Ll8/o;->c(Ll8/p;)Ll8/o;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv0/m;->q:Ld8/c;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lv0/m;->n:Lv0/n;

    invoke-interface {v0, v1}, Ld8/c;->b(Ll8/m;)V

    iget-object v0, p0, Lv0/m;->q:Ld8/c;

    iget-object v1, p0, Lv0/m;->n:Lv0/n;

    invoke-interface {v0, v1}, Ld8/c;->c(Ll8/p;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private c(Landroid/content/Context;Ll8/c;)V
    .locals 3

    new-instance v0, Ll8/k;

    const-string v1, "flutter.baseflow.com/permissions/methods"

    invoke-direct {v0, p2, v1}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lv0/m;->o:Ll8/k;

    new-instance p2, Lv0/l;

    new-instance v0, Lv0/a;

    invoke-direct {v0}, Lv0/a;-><init>()V

    iget-object v1, p0, Lv0/m;->n:Lv0/n;

    new-instance v2, Lv0/p;

    invoke-direct {v2}, Lv0/p;-><init>()V

    invoke-direct {p2, p1, v0, v1, v2}, Lv0/l;-><init>(Landroid/content/Context;Lv0/a;Lv0/n;Lv0/p;)V

    iput-object p2, p0, Lv0/m;->r:Lv0/l;

    iget-object p1, p0, Lv0/m;->o:Ll8/k;

    invoke-virtual {p1, p2}, Ll8/k;->e(Ll8/k$c;)V

    return-void
.end method

.method private d(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lv0/m;->r:Lv0/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lv0/l;->i(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    iget-object v0, p0, Lv0/m;->o:Ll8/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll8/k;->e(Ll8/k$c;)V

    iput-object v1, p0, Lv0/m;->o:Ll8/k;

    iput-object v1, p0, Lv0/m;->r:Lv0/l;

    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lv0/m;->r:Lv0/l;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lv0/l;->i(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Ld8/c;)V
    .locals 1

    invoke-interface {p1}, Ld8/c;->e()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, v0}, Lv0/m;->d(Landroid/app/Activity;)V

    iput-object p1, p0, Lv0/m;->q:Ld8/c;

    invoke-direct {p0}, Lv0/m;->b()V

    return-void
.end method

.method public onAttachedToEngine(Lc8/a$b;)V
    .locals 1

    invoke-virtual {p1}, Lc8/a$b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lc8/a$b;->b()Ll8/c;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lv0/m;->c(Landroid/content/Context;Ll8/c;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 0

    invoke-direct {p0}, Lv0/m;->f()V

    invoke-direct {p0}, Lv0/m;->a()V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lv0/m;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lc8/a$b;)V
    .locals 0

    invoke-direct {p0}, Lv0/m;->e()V

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Ld8/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lv0/m;->onAttachedToActivity(Ld8/c;)V

    return-void
.end method
