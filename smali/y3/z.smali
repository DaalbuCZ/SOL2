.class public final Ly3/z;
.super Lr4/d;
.source ""

# interfaces
.implements Lx3/f$a;
.implements Lx3/f$b;


# static fields
.field private static final h:Lx3/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a$a<",
            "+",
            "Lq4/f;",
            "Lq4/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Handler;

.field private final c:Lx3/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx3/a$a<",
            "+",
            "Lq4/f;",
            "Lq4/a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lz3/d;

.field private f:Lq4/f;

.field private g:Ly3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lq4/e;->c:Lx3/a$a;

    sput-object v0, Ly3/z;->h:Lx3/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lz3/d;)V
    .locals 1

    sget-object v0, Ly3/z;->h:Lx3/a$a;

    invoke-direct {p0}, Lr4/d;-><init>()V

    iput-object p1, p0, Ly3/z;->a:Landroid/content/Context;

    iput-object p2, p0, Ly3/z;->b:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, Lz3/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz3/d;

    iput-object p1, p0, Ly3/z;->e:Lz3/d;

    invoke-virtual {p3}, Lz3/d;->e()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ly3/z;->d:Ljava/util/Set;

    iput-object v0, p0, Ly3/z;->c:Lx3/a$a;

    return-void
.end method

.method static bridge synthetic n0(Ly3/z;)Ly3/y;
    .locals 0

    iget-object p0, p0, Ly3/z;->g:Ly3/y;

    return-object p0
.end method

.method static bridge synthetic o0(Ly3/z;Lr4/l;)V
    .locals 3

    invoke-virtual {p1}, Lr4/l;->k()Lw3/b;

    move-result-object v0

    invoke-virtual {v0}, Lw3/b;->C()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lr4/l;->s()Lz3/k0;

    move-result-object p1

    invoke-static {p1}, Lz3/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz3/k0;

    invoke-virtual {p1}, Lz3/k0;->k()Lw3/b;

    move-result-object v0

    invoke-virtual {v0}, Lw3/b;->C()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v2, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "SignInCoordinator"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object p1, p0, Ly3/z;->g:Ly3/y;

    invoke-interface {p1, v0}, Ly3/y;->b(Lw3/b;)V

    :goto_0
    iget-object p0, p0, Ly3/z;->f:Lq4/f;

    invoke-interface {p0}, Lx3/a$f;->m()V

    return-void

    :cond_1
    iget-object v0, p0, Ly3/z;->g:Ly3/y;

    invoke-virtual {p1}, Lz3/k0;->s()Lz3/i;

    move-result-object p1

    iget-object v1, p0, Ly3/z;->d:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Ly3/y;->c(Lz3/i;Ljava/util/Set;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    iget-object p1, p0, Ly3/z;->f:Lq4/f;

    invoke-interface {p1}, Lx3/a$f;->m()V

    return-void
.end method

.method public final e(Lw3/b;)V
    .locals 1

    iget-object v0, p0, Ly3/z;->g:Ly3/y;

    invoke-interface {v0, p1}, Ly3/y;->b(Lw3/b;)V

    return-void
.end method

.method public final f(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Ly3/z;->f:Lq4/f;

    invoke-interface {p1, p0}, Lq4/f;->b(Lr4/f;)V

    return-void
.end method

.method public final p0(Ly3/y;)V
    .locals 9

    iget-object v0, p0, Ly3/z;->f:Lq4/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx3/a$f;->m()V

    :cond_0
    iget-object v0, p0, Ly3/z;->e:Lz3/d;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz3/d;->i(Ljava/lang/Integer;)V

    iget-object v2, p0, Ly3/z;->c:Lx3/a$a;

    iget-object v3, p0, Ly3/z;->a:Landroid/content/Context;

    iget-object v0, p0, Ly3/z;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Ly3/z;->e:Lz3/d;

    invoke-virtual {v5}, Lz3/d;->f()Lq4/a;

    move-result-object v6

    move-object v7, p0

    move-object v8, p0

    invoke-virtual/range {v2 .. v8}, Lx3/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lz3/d;Ljava/lang/Object;Lx3/f$a;Lx3/f$b;)Lx3/a$f;

    move-result-object v0

    iput-object v0, p0, Ly3/z;->f:Lq4/f;

    iput-object p1, p0, Ly3/z;->g:Ly3/y;

    iget-object p1, p0, Ly3/z;->d:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ly3/z;->f:Lq4/f;

    invoke-interface {p1}, Lq4/f;->p()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Ly3/z;->b:Landroid/os/Handler;

    new-instance v0, Ly3/w;

    invoke-direct {v0, p0}, Ly3/w;-><init>(Ly3/z;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final q0()V
    .locals 1

    iget-object v0, p0, Ly3/z;->f:Lq4/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx3/a$f;->m()V

    :cond_0
    return-void
.end method

.method public final w(Lr4/l;)V
    .locals 2

    iget-object v0, p0, Ly3/z;->b:Landroid/os/Handler;

    new-instance v1, Ly3/x;

    invoke-direct {v1, p0, p1}, Ly3/x;-><init>(Ly3/z;Lr4/l;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
