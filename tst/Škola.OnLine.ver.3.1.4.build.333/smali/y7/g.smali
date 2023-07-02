.class public final Ly7/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;
.implements Ly7/a$c;
.implements Ll8/a;


# instance fields
.field private n:Ly7/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly7/a$b;)V
    .locals 1

    iget-object v0, p0, Ly7/g;->n:Ly7/f;

    invoke-static {v0}, Ls9/k;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Ls9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ly7/f;->d(Ly7/a$b;)V

    return-void
.end method

.method public isEnabled()Ly7/a$a;
    .locals 1

    iget-object v0, p0, Ly7/g;->n:Ly7/f;

    invoke-static {v0}, Ls9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly7/f;->b()Ly7/a$a;

    move-result-object v0

    return-object v0
.end method

.method public onAttachedToActivity(Ll8/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly7/g;->n:Ly7/f;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ll8/c;->e()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly7/f;->c(Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 1

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    invoke-static {p1, p0}, Ly7/d;->f(Lt8/c;Ly7/a$c;)V

    new-instance p1, Ly7/f;

    invoke-direct {p1}, Ly7/f;-><init>()V

    iput-object p1, p0, Ly7/g;->n:Ly7/f;

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    iget-object v0, p0, Ly7/g;->n:Ly7/f;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly7/f;->c(Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Ly7/g;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ly7/d;->f(Lt8/c;Ly7/a$c;)V

    iput-object v0, p0, Ly7/g;->n:Ly7/f;

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Ll8/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ly7/g;->onAttachedToActivity(Ll8/c;)V

    return-void
.end method
