.class public abstract Lc4/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc4/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lc4/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lc4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/a<",
            "TO;>;"
        }
    .end annotation
.end field

.field private final d:Lc4/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TO;"
        }
    .end annotation
.end field

.field private final e:Ld4/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld4/b<",
            "TO;>;"
        }
    .end annotation
.end field

.field private final f:Landroid/os/Looper;

.field private final g:I

.field private final h:Lc4/f;
    .annotation runtime Lorg/checkerframework/checker/initialization/qual/NotOnlyInitialized;
    .end annotation
.end field

.field private final i:Ld4/k;

.field protected final j:Lcom/google/android/gms/common/api/internal/b;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lc4/a;Lc4/a$d;Lc4/e$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/Activity;",
            "Lc4/a<",
            "TO;>;TO;",
            "Lc4/e$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Le4/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    invoke-static {p3, v0}, Le4/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    invoke-static {p5, v0}, Le4/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lc4/e;->a:Landroid/content/Context;

    invoke-static {}, Li4/l;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    const-class v0, Landroid/content/Context;

    const-string v2, "getAttributionTag"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    :catch_0
    :cond_0
    iput-object v1, p0, Lc4/e;->b:Ljava/lang/String;

    iput-object p3, p0, Lc4/e;->c:Lc4/a;

    iput-object p4, p0, Lc4/e;->d:Lc4/a$d;

    iget-object p1, p5, Lc4/e$a;->b:Landroid/os/Looper;

    iput-object p1, p0, Lc4/e;->f:Landroid/os/Looper;

    invoke-static {p3, p4, v1}, Ld4/b;->a(Lc4/a;Lc4/a$d;Ljava/lang/String;)Ld4/b;

    move-result-object p1

    iput-object p1, p0, Lc4/e;->e:Ld4/b;

    new-instance p3, Ld4/o;

    invoke-direct {p3, p0}, Ld4/o;-><init>(Lc4/e;)V

    iput-object p3, p0, Lc4/e;->h:Lc4/f;

    iget-object p3, p0, Lc4/e;->a:Landroid/content/Context;

    invoke-static {p3}, Lcom/google/android/gms/common/api/internal/b;->x(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object p3

    iput-object p3, p0, Lc4/e;->j:Lcom/google/android/gms/common/api/internal/b;

    invoke-virtual {p3}, Lcom/google/android/gms/common/api/internal/b;->m()I

    move-result p4

    iput p4, p0, Lc4/e;->g:I

    iget-object p4, p5, Lc4/e$a;->a:Ld4/k;

    iput-object p4, p0, Lc4/e;->i:Ld4/k;

    if-eqz p2, :cond_1

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/common/api/internal/f;->u(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/b;Ld4/b;)V

    :cond_1
    invoke-virtual {p3, p0}, Lcom/google/android/gms/common/api/internal/b;->b(Lc4/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc4/a;Lc4/a$d;Lc4/e$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lc4/a<",
            "TO;>;TO;",
            "Lc4/e$a;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lc4/e;-><init>(Landroid/content/Context;Landroid/app/Activity;Lc4/a;Lc4/a$d;Lc4/e$a;)V

    return-void
.end method

.method private final i(ILcom/google/android/gms/common/api/internal/c;)Ly4/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lc4/a$b;",
            ">(I",
            "Lcom/google/android/gms/common/api/internal/c<",
            "TA;TTResult;>;)",
            "Ly4/i<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v6, Ly4/j;

    invoke-direct {v6}, Ly4/j;-><init>()V

    iget-object v0, p0, Lc4/e;->j:Lcom/google/android/gms/common/api/internal/b;

    iget-object v5, p0, Lc4/e;->i:Ld4/k;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, v6

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/common/api/internal/b;->D(Lc4/e;ILcom/google/android/gms/common/api/internal/c;Ly4/j;Ld4/k;)V

    invoke-virtual {v6}, Ly4/j;->a()Ly4/i;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method protected b()Le4/d$a;
    .locals 3

    new-instance v0, Le4/d$a;

    invoke-direct {v0}, Le4/d$a;-><init>()V

    iget-object v1, p0, Lc4/e;->d:Lc4/a$d;

    instance-of v2, v1, Lc4/a$d$b;

    if-eqz v2, :cond_0

    check-cast v1, Lc4/a$d$b;

    invoke-interface {v1}, Lc4/a$d$b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->k()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc4/e;->d:Lc4/a$d;

    instance-of v2, v1, Lc4/a$d$a;

    if-eqz v2, :cond_1

    check-cast v1, Lc4/a$d$a;

    invoke-interface {v1}, Lc4/a$d$a;->a()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Le4/d$a;->d(Landroid/accounts/Account;)Le4/d$a;

    iget-object v1, p0, Lc4/e;->d:Lc4/a$d;

    instance-of v2, v1, Lc4/a$d$b;

    if-eqz v2, :cond_3

    check-cast v1, Lc4/a$d$b;

    invoke-interface {v1}, Lc4/a$d$b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->G()Ljava/util/Set;

    move-result-object v1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, Le4/d$a;->c(Ljava/util/Collection;)Le4/d$a;

    iget-object v1, p0, Lc4/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le4/d$a;->e(Ljava/lang/String;)Le4/d$a;

    iget-object v1, p0, Lc4/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le4/d$a;->b(Ljava/lang/String;)Le4/d$a;

    return-object v0
.end method

.method public c(Lcom/google/android/gms/common/api/internal/c;)Ly4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lc4/a$b;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/c<",
            "TA;TTResult;>;)",
            "Ly4/i<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lc4/e;->i(ILcom/google/android/gms/common/api/internal/c;)Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ld4/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld4/b<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lc4/e;->e:Ld4/b;

    return-object v0
.end method

.method protected e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc4/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lc4/e;->g:I

    return v0
.end method

.method public final g(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/m;)Lc4/a$f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/common/api/internal/m<",
            "TO;>;)",
            "Lc4/a$f;"
        }
    .end annotation

    invoke-virtual {p0}, Lc4/e;->b()Le4/d$a;

    move-result-object v0

    invoke-virtual {v0}, Le4/d$a;->a()Le4/d;

    move-result-object v4

    iget-object v0, p0, Lc4/e;->c:Lc4/a;

    invoke-virtual {v0}, Lc4/a;->a()Lc4/a$a;

    move-result-object v0

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lc4/a$a;

    iget-object v2, p0, Lc4/e;->a:Landroid/content/Context;

    iget-object v5, p0, Lc4/e;->d:Lc4/a$d;

    move-object v3, p1

    move-object v6, p2

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, Lc4/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Le4/d;Ljava/lang/Object;Lc4/f$a;Lc4/f$b;)Lc4/a$f;

    move-result-object p1

    invoke-virtual {p0}, Lc4/e;->e()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of v0, p1, Le4/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le4/c;

    invoke-virtual {v0, p2}, Le4/c;->P(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    instance-of v0, p1, Ld4/g;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ld4/g;

    invoke-virtual {v0, p2}, Ld4/g;->r(Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final h(Landroid/content/Context;Landroid/os/Handler;)Ld4/z;
    .locals 2

    new-instance v0, Ld4/z;

    invoke-virtual {p0}, Lc4/e;->b()Le4/d$a;

    move-result-object v1

    invoke-virtual {v1}, Le4/d$a;->a()Le4/d;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Ld4/z;-><init>(Landroid/content/Context;Landroid/os/Handler;Le4/d;)V

    return-object v0
.end method
