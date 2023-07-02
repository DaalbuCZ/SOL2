.class public final La8/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;
.implements Lt8/k$c;
.implements Lt8/m;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Ll8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La8/e$a;
    }
.end annotation


# static fields
.field public static final t:La8/e$a;


# instance fields
.field private n:Lt8/k;

.field private o:La8/a;

.field private p:Lt8/k$d;

.field private q:Ljava/lang/Integer;

.field private r:Lz4/a;

.field private s:Lz4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La8/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La8/e$a;-><init>(Ls9/g;)V

    sput-object v0, La8/e;->t:La8/e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(La8/e;Lt8/k$d;Lz4/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, La8/e;->m(La8/e;Lt8/k$d;Lz4/a;)V

    return-void
.end method

.method public static synthetic c(La8/e;Landroid/app/Activity;Lz4/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, La8/e;->p(La8/e;Landroid/app/Activity;Lz4/a;)V

    return-void
.end method

.method public static synthetic d(Lt8/k$d;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, La8/e;->n(Lt8/k$d;Ljava/lang/Exception;)V

    return-void
.end method

.method public static final synthetic e(La8/e;)La8/a;
    .locals 0

    iget-object p0, p0, La8/e;->o:La8/a;

    return-object p0
.end method

.method public static final synthetic f(La8/e;)Lz4/a;
    .locals 0

    iget-object p0, p0, La8/e;->r:Lz4/a;

    return-object p0
.end method

.method public static final synthetic g(La8/e;)Lz4/b;
    .locals 0

    iget-object p0, p0, La8/e;->s:Lz4/b;

    return-object p0
.end method

.method public static final synthetic h(La8/e;)Lt8/k$d;
    .locals 0

    iget-object p0, p0, La8/e;->p:Lt8/k$d;

    return-object p0
.end method

.method public static final synthetic i(La8/e;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, La8/e;->q:Ljava/lang/Integer;

    return-void
.end method

.method public static final synthetic j(La8/e;Lt8/k$d;)V
    .locals 0

    iput-object p1, p0, La8/e;->p:Lt8/k$d;

    return-void
.end method

.method private final k(Lt8/k$d;Lr9/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/k$d;",
            "Lr9/a<",
            "Lg9/s;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, La8/e;->r:Lz4/a;

    const-string v1, "Call checkForUpdate first!"

    const-string v2, "REQUIRE_CHECK_FOR_UPDATE"

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, La8/e;->o:La8/a;

    if-nez v0, :cond_0

    move-object v0, v3

    goto :goto_0

    :cond_0
    invoke-interface {v0}, La8/a;->c()Landroid/app/Activity;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, La8/e;->s:Lz4/b;

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lr9/a;->f()Ljava/lang/Object;

    return-void

    :cond_1
    invoke-interface {p1, v2, v1, v3}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lg9/s;->a:Lg9/s;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    const-string p2, "REQUIRE_FOREGROUND_ACTIVITY"

    const-string v0, "in_app_update requires a foreground activity"

    invoke-interface {p1, p2, v0, v3}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lg9/s;->a:Lg9/s;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    invoke-interface {p1, v2, v1, v3}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lg9/s;->a:Lg9/s;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final l(Lt8/k$d;)V
    .locals 3

    iget-object v0, p0, La8/e;->o:La8/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, La8/a;->c()Landroid/app/Activity;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_5

    iget-object v0, p0, La8/e;->o:La8/a;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0, p0}, La8/a;->b(Lt8/m;)V

    :goto_1
    iget-object v0, p0, La8/e;->o:La8/a;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v0}, La8/a;->c()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :goto_2
    iget-object v0, p0, La8/e;->o:La8/a;

    invoke-static {v0}, Ls9/k;->b(Ljava/lang/Object;)V

    invoke-interface {v0}, La8/a;->c()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lz4/c;->a(Landroid/content/Context;)Lz4/b;

    move-result-object v0

    iput-object v0, p0, La8/e;->s:Lz4/b;

    invoke-static {v0}, Ls9/k;->b(Ljava/lang/Object;)V

    invoke-interface {v0}, Lz4/b;->d()Ly4/i;

    move-result-object v0

    const-string v1, "appUpdateManager!!.appUpdateInfo"

    invoke-static {v0, v1}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La8/d;

    invoke-direct {v1, p0, p1}, La8/d;-><init>(La8/e;Lt8/k$d;)V

    invoke-virtual {v0, v1}, Ly4/i;->g(Ly4/f;)Ly4/i;

    new-instance v1, La8/b;

    invoke-direct {v1, p1}, La8/b;-><init>(Lt8/k$d;)V

    invoke-virtual {v0, v1}, Ly4/i;->e(Ly4/e;)Ly4/i;

    return-void

    :cond_5
    const-string v0, "REQUIRE_FOREGROUND_ACTIVITY"

    const-string v2, "in_app_update requires a foreground activity"

    invoke-interface {p1, v0, v2, v1}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lg9/s;->a:Lg9/s;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final m(La8/e;Lt8/k$d;Lz4/a;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$result"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, La8/e;->r:Lz4/a;

    const/16 p0, 0x8

    new-array p0, p0, [Lg9/l;

    invoke-virtual {p2}, Lz4/a;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "updateAvailability"

    invoke-static {v1, v0}, Lg9/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg9/l;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p0, v1

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lz4/a;->d(I)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "immediateAllowed"

    invoke-static {v3, v2}, Lg9/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg9/l;

    move-result-object v2

    aput-object v2, p0, v0

    invoke-virtual {p2, v1}, Lz4/a;->d(I)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "flexibleAllowed"

    invoke-static {v1, v0}, Lg9/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg9/l;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, p0, v1

    invoke-virtual {p2}, Lz4/a;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "availableVersionCode"

    invoke-static {v1, v0}, Lg9/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg9/l;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, p0, v1

    invoke-virtual {p2}, Lz4/a;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "installStatus"

    invoke-static {v1, v0}, Lg9/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg9/l;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, p0, v1

    invoke-virtual {p2}, Lz4/a;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packageName"

    invoke-static {v1, v0}, Lg9/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg9/l;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, p0, v1

    invoke-virtual {p2}, Lz4/a;->b()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "clientVersionStalenessDays"

    invoke-static {v1, v0}, Lg9/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg9/l;

    move-result-object v0

    const/4 v1, 0x6

    aput-object v0, p0, v1

    invoke-virtual {p2}, Lz4/a;->h()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v0, "updatePriority"

    invoke-static {v0, p2}, Lg9/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg9/l;

    move-result-object p2

    const/4 v0, 0x7

    aput-object p2, p0, v0

    invoke-static {p0}, Lh9/x;->e([Lg9/l;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p0}, Lt8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private static final n(Lt8/k$d;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "$result"

    invoke-static {p0, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TASK_FAILURE"

    const/4 v1, 0x0

    invoke-interface {p0, v0, p1, v1}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final o(Lt8/k$d;)V
    .locals 1

    new-instance v0, La8/e$b;

    invoke-direct {v0, p0}, La8/e$b;-><init>(La8/e;)V

    invoke-direct {p0, p1, v0}, La8/e;->k(Lt8/k$d;Lr9/a;)V

    return-void
.end method

.method private static final p(La8/e;Landroid/app/Activity;Lz4/a;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$activity"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lz4/a;->g()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    iget-object v0, p0, La8/e;->q:Ljava/lang/Integer;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    :try_start_0
    iget-object p0, p0, La8/e;->s:Lz4/b;

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x4fc

    invoke-interface {p0, p2, v1, p1, v0}, Lz4/b;->a(Lz4/a;ILandroid/app/Activity;I)Z
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "in_app_update"

    const-string p2, "Could not start update flow"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_0
    return-void
.end method

.method private final q(Lt8/k$d;)V
    .locals 1

    new-instance v0, La8/e$e;

    invoke-direct {v0, p0, p1}, La8/e$e;-><init>(La8/e;Lt8/k$d;)V

    invoke-direct {p0, p1, v0}, La8/e;->k(Lt8/k$d;Lr9/a;)V

    return-void
.end method

.method private final r(Lt8/k$d;)V
    .locals 1

    new-instance v0, La8/e$f;

    invoke-direct {v0, p0, p1}, La8/e$f;-><init>(La8/e;Lt8/k$d;)V

    invoke-direct {p0, p1, v0}, La8/e;->k(Lt8/k$d;Lr9/a;)V

    return-void
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)Z
    .locals 3

    const/16 p3, 0x4fc

    if-ne p1, p3, :cond_d

    iget-object p1, p0, La8/e;->q:Ljava/lang/Integer;

    const-string p3, "IN_APP_UPDATE_FAILED"

    const-string v0, "USER_DENIED_UPDATE"

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v1, :cond_7

    const/4 p1, -0x1

    if-eq p2, p1, :cond_5

    if-eqz p2, :cond_3

    if-eq p2, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, La8/e;->p:Lt8/k$d;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const-string p2, "Some other error prevented either the user from providing consent or the update to proceed."

    invoke-interface {p1, p3, p2, v2}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, La8/e;->p:Lt8/k$d;

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2, v2}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    iget-object p1, p0, La8/e;->p:Lt8/k$d;

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    invoke-interface {p1, v2}, Lt8/k$d;->a(Ljava/lang/Object;)V

    :goto_0
    iput-object v2, p0, La8/e;->p:Lt8/k$d;

    return v1

    :cond_7
    :goto_1
    iget-object p1, p0, La8/e;->q:Ljava/lang/Integer;

    if-nez p1, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_d

    if-eqz p2, :cond_b

    if-eq p2, v1, :cond_9

    goto :goto_3

    :cond_9
    iget-object p1, p0, La8/e;->p:Lt8/k$d;

    if-nez p1, :cond_a

    goto :goto_2

    :cond_a
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p3, p2, v2}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_b
    iget-object p1, p0, La8/e;->p:Lt8/k$d;

    if-nez p1, :cond_c

    goto :goto_2

    :cond_c
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2, v2}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    iput-object v2, p0, La8/e;->p:Lt8/k$d;

    :goto_3
    return v1

    :cond_d
    :goto_4
    const/4 p1, 0x0

    return p1
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    invoke-static {p1, p2}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La8/e;->s:Lz4/b;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lz4/b;->d()Ly4/i;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, La8/c;

    invoke-direct {v1, p0, p1}, La8/c;-><init>(La8/e;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Ly4/i;->g(Ly4/f;)Ly4/i;

    :goto_0
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outState"

    invoke-static {p2, p1}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAttachedToActivity(Ll8/c;)V
    .locals 1

    const-string v0, "activityPluginBinding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La8/e$c;

    invoke-direct {v0, p1}, La8/e$c;-><init>(Ll8/c;)V

    iput-object v0, p0, La8/e;->o:La8/a;

    return-void
.end method

.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 2

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt8/k;

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    const-string v1, "in_app_update"

    invoke-direct {v0, p1, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, La8/e;->n:Lt8/k;

    invoke-virtual {v0, p0}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, La8/e;->o:La8/a;

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, La8/e;->o:La8/a;

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, La8/e;->n:Lt8/k;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "channel"

    invoke-static {p1}, Ls9/k;->o(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1, v0}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method

.method public onMethodCall(Lt8/j;Lt8/k$d;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lt8/j;->a:Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "completeFlexibleUpdate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2}, La8/e;->o(Lt8/k$d;)V

    goto :goto_1

    :sswitch_1
    const-string v0, "checkForUpdate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p2}, La8/e;->l(Lt8/k$d;)V

    goto :goto_1

    :sswitch_2
    const-string v0, "startFlexibleUpdate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p2}, La8/e;->r(Lt8/k$d;)V

    goto :goto_1

    :sswitch_3
    const-string v0, "performImmediateUpdate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-direct {p0, p2}, La8/e;->q(Lt8/k$d;)V

    goto :goto_1

    :cond_4
    :goto_0
    invoke-interface {p2}, Lt8/k$d;->c()V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6fa969c7 -> :sswitch_3
        -0x5bdc4e8a -> :sswitch_2
        -0x4e826536 -> :sswitch_1
        -0xb88a5f3 -> :sswitch_0
    .end sparse-switch
.end method

.method public onReattachedToActivityForConfigChanges(Ll8/c;)V
    .locals 1

    const-string v0, "activityPluginBinding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La8/e$d;

    invoke-direct {v0, p1}, La8/e$d;-><init>(Ll8/c;)V

    iput-object v0, p0, La8/e;->o:La8/a;

    return-void
.end method
