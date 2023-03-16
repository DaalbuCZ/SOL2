.class public Lk8/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ll8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll8/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly7/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll8/a;

    sget-object v1, Ll8/t;->b:Ll8/t;

    const-string v2, "flutter/lifecycle"

    invoke-direct {v0, p1, v2, v1}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    iput-object v0, p0, Lk8/e;->a:Ll8/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "LifecycleChannel"

    const-string v1, "Sending AppLifecycleState.detached message."

    invoke-static {v0, v1}, Lx7/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lk8/e;->a:Ll8/a;

    const-string v1, "AppLifecycleState.detached"

    invoke-virtual {v0, v1}, Ll8/a;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "LifecycleChannel"

    const-string v1, "Sending AppLifecycleState.inactive message."

    invoke-static {v0, v1}, Lx7/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lk8/e;->a:Ll8/a;

    const-string v1, "AppLifecycleState.inactive"

    invoke-virtual {v0, v1}, Ll8/a;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "LifecycleChannel"

    const-string v1, "Sending AppLifecycleState.paused message."

    invoke-static {v0, v1}, Lx7/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lk8/e;->a:Ll8/a;

    const-string v1, "AppLifecycleState.paused"

    invoke-virtual {v0, v1}, Ll8/a;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public d()V
    .locals 2

    const-string v0, "LifecycleChannel"

    const-string v1, "Sending AppLifecycleState.resumed message."

    invoke-static {v0, v1}, Lx7/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lk8/e;->a:Ll8/a;

    const-string v1, "AppLifecycleState.resumed"

    invoke-virtual {v0, v1}, Ll8/a;->c(Ljava/lang/Object;)V

    return-void
.end method
