.class public final Ld4/z;
.super Lw4/d;
.source ""

# interfaces
.implements Lc4/f$a;
.implements Lc4/f$b;


# static fields
.field private static final h:Lc4/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a$a<",
            "+",
            "Lv4/f;",
            "Lv4/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Handler;

.field private final c:Lc4/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a$a<",
            "+",
            "Lv4/f;",
            "Lv4/a;",
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

.field private final e:Le4/d;

.field private f:Lv4/f;

.field private g:Ld4/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lv4/e;->c:Lc4/a$a;

    sput-object v0, Ld4/z;->h:Lc4/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Le4/d;)V
    .locals 1

    sget-object v0, Ld4/z;->h:Lc4/a$a;

    invoke-direct {p0}, Lw4/d;-><init>()V

    iput-object p1, p0, Ld4/z;->a:Landroid/content/Context;

    iput-object p2, p0, Ld4/z;->b:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, Le4/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le4/d;

    iput-object p1, p0, Ld4/z;->e:Le4/d;

    invoke-virtual {p3}, Le4/d;->e()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ld4/z;->d:Ljava/util/Set;

    iput-object v0, p0, Ld4/z;->c:Lc4/a$a;

    return-void
.end method

.method static bridge synthetic n0(Ld4/z;)Ld4/y;
    .locals 0

    iget-object p0, p0, Ld4/z;->g:Ld4/y;

    return-object p0
.end method

.method static bridge synthetic o0(Ld4/z;Lw4/l;)V
    .locals 3

    invoke-virtual {p1}, Lw4/l;->k()Lb4/b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/b;->C()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lw4/l;->s()Le4/k0;

    move-result-object p1

    invoke-static {p1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le4/k0;

    invoke-virtual {p1}, Le4/k0;->k()Lb4/b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/b;->C()Z

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
    iget-object p1, p0, Ld4/z;->g:Ld4/y;

    invoke-interface {p1, v0}, Ld4/y;->b(Lb4/b;)V

    :goto_0
    iget-object p0, p0, Ld4/z;->f:Lv4/f;

    invoke-interface {p0}, Lc4/a$f;->n()V

    return-void

    :cond_1
    iget-object v0, p0, Ld4/z;->g:Ld4/y;

    invoke-virtual {p1}, Le4/k0;->s()Le4/i;

    move-result-object p1

    iget-object v1, p0, Ld4/z;->d:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Ld4/y;->c(Le4/i;Ljava/util/Set;)V

    goto :goto_0
.end method


# virtual methods
.method public final U(Lw4/l;)V
    .locals 2

    iget-object v0, p0, Ld4/z;->b:Landroid/os/Handler;

    new-instance v1, Ld4/x;

    invoke-direct {v1, p0, p1}, Ld4/x;-><init>(Ld4/z;Lw4/l;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(I)V
    .locals 0

    iget-object p1, p0, Ld4/z;->f:Lv4/f;

    invoke-interface {p1}, Lc4/a$f;->n()V

    return-void
.end method

.method public final e(Lb4/b;)V
    .locals 1

    iget-object v0, p0, Ld4/z;->g:Ld4/y;

    invoke-interface {v0, p1}, Ld4/y;->b(Lb4/b;)V

    return-void
.end method

.method public final f(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Ld4/z;->f:Lv4/f;

    invoke-interface {p1, p0}, Lv4/f;->l(Lw4/f;)V

    return-void
.end method

.method public final p0(Ld4/y;)V
    .locals 9

    iget-object v0, p0, Ld4/z;->f:Lv4/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc4/a$f;->n()V

    :cond_0
    iget-object v0, p0, Ld4/z;->e:Le4/d;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Le4/d;->i(Ljava/lang/Integer;)V

    iget-object v2, p0, Ld4/z;->c:Lc4/a$a;

    iget-object v3, p0, Ld4/z;->a:Landroid/content/Context;

    iget-object v0, p0, Ld4/z;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Ld4/z;->e:Le4/d;

    invoke-virtual {v5}, Le4/d;->f()Lv4/a;

    move-result-object v6

    move-object v7, p0

    move-object v8, p0

    invoke-virtual/range {v2 .. v8}, Lc4/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Le4/d;Ljava/lang/Object;Lc4/f$a;Lc4/f$b;)Lc4/a$f;

    move-result-object v0

    iput-object v0, p0, Ld4/z;->f:Lv4/f;

    iput-object p1, p0, Ld4/z;->g:Ld4/y;

    iget-object p1, p0, Ld4/z;->d:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ld4/z;->f:Lv4/f;

    invoke-interface {p1}, Lv4/f;->p()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Ld4/z;->b:Landroid/os/Handler;

    new-instance v0, Ld4/w;

    invoke-direct {v0, p0}, Ld4/w;-><init>(Ld4/z;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final q0()V
    .locals 1

    iget-object v0, p0, Ld4/z;->f:Lv4/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc4/a$f;->n()V

    :cond_0
    return-void
.end method
