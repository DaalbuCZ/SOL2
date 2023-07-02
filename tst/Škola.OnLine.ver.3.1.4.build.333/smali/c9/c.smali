.class public final Lc9/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;
.implements Ll8/a;


# instance fields
.field private n:Lc9/a;

.field private o:Lc9/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Ll8/c;)V
    .locals 1

    iget-object v0, p0, Lc9/c;->n:Lc9/a;

    if-nez v0, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "urlLauncher was never set."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lc9/c;->o:Lc9/b;

    invoke-interface {p1}, Ll8/c;->e()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc9/b;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 3

    new-instance v0, Lc9/b;

    invoke-virtual {p1}, Lk8/a$b;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc9/b;-><init>(Landroid/content/Context;Landroid/app/Activity;)V

    iput-object v0, p0, Lc9/c;->o:Lc9/b;

    new-instance v1, Lc9/a;

    invoke-direct {v1, v0}, Lc9/a;-><init>(Lc9/b;)V

    iput-object v1, p0, Lc9/c;->n:Lc9/a;

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lc9/a;->e(Lt8/c;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    iget-object v0, p0, Lc9/c;->n:Lc9/a;

    if-nez v0, :cond_0

    const-string v0, "UrlLauncherPlugin"

    const-string v1, "urlLauncher was never set."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lc9/c;->o:Lc9/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc9/b;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lc9/c;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 1

    iget-object p1, p0, Lc9/c;->n:Lc9/a;

    if-nez p1, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "Already detached from the engine."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Lc9/a;->f()V

    const/4 p1, 0x0

    iput-object p1, p0, Lc9/c;->n:Lc9/a;

    iput-object p1, p0, Lc9/c;->o:Lc9/b;

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Ll8/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lc9/c;->onAttachedToActivity(Ll8/c;)V

    return-void
.end method
