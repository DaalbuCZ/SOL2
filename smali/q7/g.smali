.class public final Lq7/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc8/a;
.implements Lq7/a$c;
.implements Ld8/a;


# instance fields
.field private n:Lq7/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lq7/a$b;)V
    .locals 1

    iget-object v0, p0, Lq7/g;->n:Lq7/f;

    invoke-static {v0}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lq7/f;->d(Lq7/a$b;)V

    return-void
.end method

.method public isEnabled()Lq7/a$a;
    .locals 1

    iget-object v0, p0, Lq7/g;->n:Lq7/f;

    invoke-static {v0}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lq7/f;->b()Lq7/a$a;

    move-result-object v0

    return-object v0
.end method

.method public onAttachedToActivity(Ld8/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq7/g;->n:Lq7/f;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ld8/c;->e()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq7/f;->c(Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method public onAttachedToEngine(Lc8/a$b;)V
    .locals 1

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc8/a$b;->b()Ll8/c;

    move-result-object p1

    invoke-static {p1, p0}, Lq7/d;->f(Ll8/c;Lq7/a$c;)V

    new-instance p1, Lq7/f;

    invoke-direct {p1}, Lq7/f;-><init>()V

    iput-object p1, p0, Lq7/g;->n:Lq7/f;

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    iget-object v0, p0, Lq7/g;->n:Lq7/f;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lq7/f;->c(Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lq7/g;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lc8/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc8/a$b;->b()Ll8/c;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lq7/d;->f(Ll8/c;Lq7/a$c;)V

    iput-object v0, p0, Lq7/g;->n:Lq7/f;

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Ld8/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lq7/g;->onAttachedToActivity(Ld8/c;)V

    return-void
.end method
