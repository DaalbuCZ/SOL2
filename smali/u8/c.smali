.class public final Lu8/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc8/a;
.implements Ld8/a;


# instance fields
.field private n:Lu8/a;

.field private o:Lu8/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Ld8/c;)V
    .locals 1

    iget-object v0, p0, Lu8/c;->n:Lu8/a;

    if-nez v0, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "urlLauncher was never set."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lu8/c;->o:Lu8/b;

    invoke-interface {p1}, Ld8/c;->e()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu8/b;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public onAttachedToEngine(Lc8/a$b;)V
    .locals 3

    new-instance v0, Lu8/b;

    invoke-virtual {p1}, Lc8/a$b;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu8/b;-><init>(Landroid/content/Context;Landroid/app/Activity;)V

    iput-object v0, p0, Lu8/c;->o:Lu8/b;

    new-instance v1, Lu8/a;

    invoke-direct {v1, v0}, Lu8/a;-><init>(Lu8/b;)V

    iput-object v1, p0, Lu8/c;->n:Lu8/a;

    invoke-virtual {p1}, Lc8/a$b;->b()Ll8/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lu8/a;->e(Ll8/c;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    iget-object v0, p0, Lu8/c;->n:Lu8/a;

    if-nez v0, :cond_0

    const-string v0, "UrlLauncherPlugin"

    const-string v1, "urlLauncher was never set."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lu8/c;->o:Lu8/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lu8/b;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lu8/c;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lc8/a$b;)V
    .locals 1

    iget-object p1, p0, Lu8/c;->n:Lu8/a;

    if-nez p1, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "Already detached from the engine."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Lu8/a;->f()V

    const/4 p1, 0x0

    iput-object p1, p0, Lu8/c;->n:Lu8/a;

    iput-object p1, p0, Lu8/c;->o:Lu8/b;

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Ld8/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lu8/c;->onAttachedToActivity(Ld8/c;)V

    return-void
.end method
