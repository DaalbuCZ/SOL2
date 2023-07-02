.class public Lio/flutter/embedding/engine/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/a$b;
    }
.end annotation


# instance fields
.field private final a:Lio/flutter/embedding/engine/FlutterJNI;

.field private final b:Lr8/a;

.field private final c:Lg8/a;

.field private final d:Lio/flutter/embedding/engine/c;

.field private final e:Lu8/a;

.field private final f:Ls8/a;

.field private final g:Ls8/b;

.field private final h:Ls8/e;

.field private final i:Ls8/f;

.field private final j:Ls8/g;

.field private final k:Ls8/h;

.field private final l:Ls8/l;

.field private final m:Ls8/i;

.field private final n:Ls8/m;

.field private final o:Ls8/n;

.field private final p:Ls8/o;

.field private final q:Ls8/p;

.field private final r:Lio/flutter/plugin/platform/q;

.field private final s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/flutter/embedding/engine/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Lio/flutter/embedding/engine/a$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Li8/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;Z)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Li8/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZ)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Li8/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZ)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->s:Ljava/util/Set;

    new-instance v0, Lio/flutter/embedding/engine/a$a;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/a$a;-><init>(Lio/flutter/embedding/engine/a;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/embedding/engine/a$b;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    :goto_0
    invoke-static {}, Lf8/a;->e()Lf8/a;

    move-result-object v1

    if-nez p3, :cond_0

    invoke-virtual {v1}, Lf8/a;->d()Lio/flutter/embedding/engine/FlutterJNI$c;

    move-result-object p3

    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI$c;->a()Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    new-instance v2, Lg8/a;

    invoke-direct {v2, p3, v0}, Lg8/a;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;)V

    iput-object v2, p0, Lio/flutter/embedding/engine/a;->c:Lg8/a;

    invoke-virtual {v2}, Lg8/a;->p()V

    invoke-static {}, Lf8/a;->e()Lf8/a;

    move-result-object v0

    invoke-virtual {v0}, Lf8/a;->a()Lh8/a;

    move-result-object v0

    new-instance v3, Ls8/a;

    invoke-direct {v3, v2, p3}, Ls8/a;-><init>(Lg8/a;Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->f:Ls8/a;

    new-instance v3, Ls8/b;

    invoke-direct {v3, v2}, Ls8/b;-><init>(Lg8/a;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->g:Ls8/b;

    new-instance v4, Ls8/e;

    invoke-direct {v4, v2}, Ls8/e;-><init>(Lg8/a;)V

    iput-object v4, p0, Lio/flutter/embedding/engine/a;->h:Ls8/e;

    new-instance v4, Ls8/f;

    invoke-direct {v4, v2}, Ls8/f;-><init>(Lg8/a;)V

    iput-object v4, p0, Lio/flutter/embedding/engine/a;->i:Ls8/f;

    new-instance v5, Ls8/g;

    invoke-direct {v5, v2}, Ls8/g;-><init>(Lg8/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->j:Ls8/g;

    new-instance v5, Ls8/h;

    invoke-direct {v5, v2}, Ls8/h;-><init>(Lg8/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->k:Ls8/h;

    new-instance v5, Ls8/i;

    invoke-direct {v5, v2}, Ls8/i;-><init>(Lg8/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->m:Ls8/i;

    new-instance v5, Ls8/l;

    invoke-direct {v5, v2, p7}, Ls8/l;-><init>(Lg8/a;Z)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->l:Ls8/l;

    new-instance p7, Ls8/m;

    invoke-direct {p7, v2}, Ls8/m;-><init>(Lg8/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->n:Ls8/m;

    new-instance p7, Ls8/n;

    invoke-direct {p7, v2}, Ls8/n;-><init>(Lg8/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->o:Ls8/n;

    new-instance p7, Ls8/o;

    invoke-direct {p7, v2}, Ls8/o;-><init>(Lg8/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->p:Ls8/o;

    new-instance p7, Ls8/p;

    invoke-direct {p7, v2}, Ls8/p;-><init>(Lg8/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->q:Ls8/p;

    if-eqz v0, :cond_1

    invoke-interface {v0, v3}, Lh8/a;->f(Ls8/b;)V

    :cond_1
    new-instance p7, Lu8/a;

    invoke-direct {p7, p1, v4}, Lu8/a;-><init>(Landroid/content/Context;Ls8/f;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->e:Lu8/a;

    if-nez p2, :cond_2

    invoke-virtual {v1}, Lf8/a;->c()Li8/f;

    move-result-object p2

    :cond_2
    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Li8/f;->q(Landroid/content/Context;)V

    invoke-virtual {p2, p1, p5}, Li8/f;->g(Landroid/content/Context;[Ljava/lang/String;)V

    :cond_3
    iget-object p5, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/embedding/engine/a$b;

    invoke-virtual {p3, p5}, Lio/flutter/embedding/engine/FlutterJNI;->addEngineLifecycleListener(Lio/flutter/embedding/engine/a$b;)V

    invoke-virtual {p3, p4}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController(Lio/flutter/plugin/platform/q;)V

    invoke-virtual {p3, p7}, Lio/flutter/embedding/engine/FlutterJNI;->setLocalizationPlugin(Lu8/a;)V

    invoke-virtual {v1}, Lf8/a;->a()Lh8/a;

    move-result-object p5

    invoke-virtual {p3, p5}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lh8/a;)V

    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result p5

    if-nez p5, :cond_4

    invoke-direct {p0}, Lio/flutter/embedding/engine/a;->d()V

    :cond_4
    new-instance p5, Lr8/a;

    invoke-direct {p5, p3}, Lr8/a;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object p5, p0, Lio/flutter/embedding/engine/a;->b:Lr8/a;

    iput-object p4, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/q;

    invoke-virtual {p4}, Lio/flutter/plugin/platform/q;->V()V

    new-instance p3, Lio/flutter/embedding/engine/c;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p3, p4, p0, p2}, Lio/flutter/embedding/engine/c;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/a;Li8/f;)V

    iput-object p3, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p7, p1}, Lu8/a;->d(Landroid/content/res/Configuration;)V

    if-eqz p6, :cond_5

    invoke-virtual {p2}, Li8/f;->f()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {p0}, Lq8/a;->a(Lio/flutter/embedding/engine/a;)V

    :cond_5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Li8/f;Lio/flutter/embedding/engine/FlutterJNI;[Ljava/lang/String;Z)V
    .locals 7

    new-instance v4, Lio/flutter/plugin/platform/q;

    invoke-direct {v4}, Lio/flutter/plugin/platform/q;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Li8/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Li8/f;Lio/flutter/embedding/engine/FlutterJNI;[Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;Z)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Li8/f;Lio/flutter/embedding/engine/FlutterJNI;[Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;ZZ)V
    .locals 8

    new-instance v4, Lio/flutter/plugin/platform/q;

    invoke-direct {v4}, Lio/flutter/plugin/platform/q;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Li8/f;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZ)V

    return-void
.end method

.method static synthetic a(Lio/flutter/embedding/engine/a;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->s:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic b(Lio/flutter/embedding/engine/a;)Lio/flutter/plugin/platform/q;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/q;

    return-object p0
.end method

.method static synthetic c(Lio/flutter/embedding/engine/a;)Ls8/l;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->l:Ls8/l;

    return-object p0
.end method

.method private d()V
    .locals 2

    const-string v0, "FlutterEngine"

    const-string v1, "Attaching to JNI."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->attachToNative()V

    invoke-direct {p0}, Lio/flutter/embedding/engine/a;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "FlutterEngine failed to attach to its native Object reference."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private v()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public e()V
    .locals 2

    const-string v0, "FlutterEngine"

    const-string v1, "Destroying."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->s:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/a$b;

    invoke-interface {v1}, Lio/flutter/embedding/engine/a$b;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/c;->j()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/q;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/q;->X()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->c:Lg8/a;

    invoke-virtual {v0}, Lg8/a;->q()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iget-object v1, p0, Lio/flutter/embedding/engine/a;->t:Lio/flutter/embedding/engine/a$b;

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->removeEngineLifecycleListener(Lio/flutter/embedding/engine/a$b;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lh8/a;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->detachFromNativeAndReleaseResources()V

    invoke-static {}, Lf8/a;->e()Lf8/a;

    move-result-object v0

    invoke-virtual {v0}, Lf8/a;->a()Lh8/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lf8/a;->e()Lf8/a;

    move-result-object v0

    invoke-virtual {v0}, Lf8/a;->a()Lh8/a;

    move-result-object v0

    invoke-interface {v0}, Lh8/a;->d()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->g:Ls8/b;

    invoke-virtual {v0, v1}, Ls8/b;->c(Lh8/a;)V

    :cond_1
    return-void
.end method

.method public f()Ls8/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->f:Ls8/a;

    return-object v0
.end method

.method public g()Ll8/b;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    return-object v0
.end method

.method public h()Lg8/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->c:Lg8/a;

    return-object v0
.end method

.method public i()Ls8/e;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->h:Ls8/e;

    return-object v0
.end method

.method public j()Lu8/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->e:Lu8/a;

    return-object v0
.end method

.method public k()Ls8/g;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->j:Ls8/g;

    return-object v0
.end method

.method public l()Ls8/h;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->k:Ls8/h;

    return-object v0
.end method

.method public m()Ls8/i;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->m:Ls8/i;

    return-object v0
.end method

.method public n()Lio/flutter/plugin/platform/q;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->r:Lio/flutter/plugin/platform/q;

    return-object v0
.end method

.method public o()Lk8/b;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    return-object v0
.end method

.method public p()Lr8/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->b:Lr8/a;

    return-object v0
.end method

.method public q()Ls8/l;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->l:Ls8/l;

    return-object v0
.end method

.method public r()Ls8/m;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->n:Ls8/m;

    return-object v0
.end method

.method public s()Ls8/n;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->o:Ls8/n;

    return-object v0
.end method

.method public t()Ls8/o;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->p:Ls8/o;

    return-object v0
.end method

.method public u()Ls8/p;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->q:Ls8/p;

    return-object v0
.end method
