.class public Lcom/google/android/gms/common/api/internal/LifecycleCallback;
.super Ljava/lang/Object;
.source ""


# instance fields
.field protected final n:Ld4/e;


# direct methods
.method protected constructor <init>(Ld4/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->n:Ld4/e;

    return-void
.end method

.method public static c(Landroid/app/Activity;)Ld4/e;
    .locals 1

    new-instance v0, Ld4/d;

    invoke-direct {v0, p0}, Ld4/d;-><init>(Landroid/app/Activity;)V

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->d(Ld4/d;)Ld4/e;

    move-result-object p0

    return-object p0
.end method

.method protected static d(Ld4/d;)Ld4/e;
    .locals 1

    invoke-virtual {p0}, Ld4/d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ld4/d;->b()Landroidx/fragment/app/d;

    move-result-object p0

    invoke-static {p0}, Ld4/g0;->r1(Landroidx/fragment/app/d;)Ld4/g0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ld4/d;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ld4/d;->a()Landroid/app/Activity;

    move-result-object p0

    invoke-static {p0}, Ld4/e0;->f(Landroid/app/Activity;)Ld4/e0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can\'t get fragment for unexpected activity."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static getChimeraLifecycleFragmentImpl(Ld4/d;)Ld4/e;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Method not available in SDK."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public b()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->n:Ld4/e;

    invoke-interface {v0}, Ld4/e;->d()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public e(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public f(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public j()V
    .locals 0

    return-void
.end method

.method public k()V
    .locals 0

    return-void
.end method
