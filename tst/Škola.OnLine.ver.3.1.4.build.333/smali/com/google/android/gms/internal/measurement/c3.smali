.class final Lcom/google/android/gms/internal/measurement/c3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field final synthetic n:Lcom/google/android/gms/internal/measurement/d3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/d3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/c3;->n:Lcom/google/android/gms/internal/measurement/d3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c3;->n:Lcom/google/android/gms/internal/measurement/d3;

    new-instance v1, Lcom/google/android/gms/internal/measurement/u2;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/internal/measurement/u2;-><init>(Lcom/google/android/gms/internal/measurement/c3;Landroid/os/Bundle;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/d3;->J(Lcom/google/android/gms/internal/measurement/d3;Lcom/google/android/gms/internal/measurement/s2;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c3;->n:Lcom/google/android/gms/internal/measurement/d3;

    new-instance v1, Lcom/google/android/gms/internal/measurement/b3;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/b3;-><init>(Lcom/google/android/gms/internal/measurement/c3;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/d3;->J(Lcom/google/android/gms/internal/measurement/d3;Lcom/google/android/gms/internal/measurement/s2;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c3;->n:Lcom/google/android/gms/internal/measurement/d3;

    new-instance v1, Lcom/google/android/gms/internal/measurement/y2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/y2;-><init>(Lcom/google/android/gms/internal/measurement/c3;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/d3;->J(Lcom/google/android/gms/internal/measurement/d3;Lcom/google/android/gms/internal/measurement/s2;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c3;->n:Lcom/google/android/gms/internal/measurement/d3;

    new-instance v1, Lcom/google/android/gms/internal/measurement/w2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/w2;-><init>(Lcom/google/android/gms/internal/measurement/c3;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/d3;->J(Lcom/google/android/gms/internal/measurement/d3;Lcom/google/android/gms/internal/measurement/s2;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/b1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/b1;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/c3;->n:Lcom/google/android/gms/internal/measurement/d3;

    new-instance v2, Lcom/google/android/gms/internal/measurement/a3;

    invoke-direct {v2, p0, p1, v0}, Lcom/google/android/gms/internal/measurement/a3;-><init>(Lcom/google/android/gms/internal/measurement/c3;Landroid/app/Activity;Lcom/google/android/gms/internal/measurement/b1;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/d3;->J(Lcom/google/android/gms/internal/measurement/d3;Lcom/google/android/gms/internal/measurement/s2;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/b1;->e(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c3;->n:Lcom/google/android/gms/internal/measurement/d3;

    new-instance v1, Lcom/google/android/gms/internal/measurement/v2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/v2;-><init>(Lcom/google/android/gms/internal/measurement/c3;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/d3;->J(Lcom/google/android/gms/internal/measurement/d3;Lcom/google/android/gms/internal/measurement/s2;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c3;->n:Lcom/google/android/gms/internal/measurement/d3;

    new-instance v1, Lcom/google/android/gms/internal/measurement/z2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/measurement/z2;-><init>(Lcom/google/android/gms/internal/measurement/c3;Landroid/app/Activity;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/d3;->J(Lcom/google/android/gms/internal/measurement/d3;Lcom/google/android/gms/internal/measurement/s2;)V

    return-void
.end method
