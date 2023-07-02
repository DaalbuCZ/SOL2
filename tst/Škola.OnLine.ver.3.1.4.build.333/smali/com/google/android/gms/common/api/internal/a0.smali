.class final Lcom/google/android/gms/common/api/internal/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final n:Lcom/google/android/gms/common/api/internal/y;

.field final synthetic o:Lcom/google/android/gms/common/api/internal/b0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/b0;Lcom/google/android/gms/common/api/internal/y;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/a0;->n:Lcom/google/android/gms/common/api/internal/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    iget-boolean v0, v0, Lcom/google/android/gms/common/api/internal/b0;->o:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->n:Lcom/google/android/gms/common/api/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/y;->b()Lb4/b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/b;->x()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->n:Ld4/e;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, Lb4/b;->v()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/a0;->n:Lcom/google/android/gms/common/api/internal/y;

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/internal/y;->a()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v1, v0, v3, v4}, Lcom/google/android/gms/common/api/GoogleApiActivity;->a(Landroid/content/Context;Landroid/app/PendingIntent;IZ)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Ld4/e;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/b0;->r:Lb4/e;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, Lb4/b;->k()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lb4/e;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/b0;->r:Lb4/e;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v3

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    iget-object v4, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->n:Ld4/e;

    invoke-virtual {v0}, Lb4/b;->k()I

    move-result v5

    const/4 v6, 0x2

    iget-object v7, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    invoke-virtual/range {v2 .. v7}, Lb4/e;->v(Landroid/app/Activity;Ld4/e;IILandroid/content/DialogInterface$OnCancelListener;)Z

    return-void

    :cond_2
    invoke-virtual {v0}, Lb4/b;->k()I

    move-result v1

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/b0;->r:Lb4/e;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    invoke-virtual {v1, v0, v2}, Lb4/e;->q(Landroid/app/Activity;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/b0;->r:Lb4/e;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/common/api/internal/z;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/common/api/internal/z;-><init>(Lcom/google/android/gms/common/api/internal/a0;Landroid/app/Dialog;)V

    invoke-virtual {v2, v1, v3}, Lb4/e;->r(Landroid/content/Context;Ld4/p;)Ld4/q;

    return-void

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Lcom/google/android/gms/common/api/internal/b0;

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/a0;->n:Lcom/google/android/gms/common/api/internal/y;

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/y;->a()I

    move-result v2

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/common/api/internal/b0;->q(Lcom/google/android/gms/common/api/internal/b0;Lb4/b;I)V

    return-void
.end method
