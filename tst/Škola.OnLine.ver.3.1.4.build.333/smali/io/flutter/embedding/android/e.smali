.class Lio/flutter/embedding/android/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/android/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/android/e$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/flutter/embedding/android/c<",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lio/flutter/embedding/android/e$c;

.field private b:Lio/flutter/embedding/engine/a;

.field c:Lio/flutter/embedding/android/k;

.field private d:Lio/flutter/plugin/platform/c;

.field e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Ljava/lang/Integer;

.field private final k:Lr8/b;


# direct methods
.method constructor <init>(Lio/flutter/embedding/android/e$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/flutter/embedding/android/e$a;

    invoke-direct {v0, p0}, Lio/flutter/embedding/android/e$a;-><init>(Lio/flutter/embedding/android/e;)V

    iput-object v0, p0, Lio/flutter/embedding/android/e;->k:Lr8/b;

    iput-object p1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/flutter/embedding/android/e;->h:Z

    return-void
.end method

.method static synthetic a(Lio/flutter/embedding/android/e;)Lio/flutter/embedding/android/e$c;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    return-object p0
.end method

.method static synthetic b(Lio/flutter/embedding/android/e;)Z
    .locals 0

    iget-boolean p0, p0, Lio/flutter/embedding/android/e;->g:Z

    return p0
.end method

.method static synthetic c(Lio/flutter/embedding/android/e;Z)Z
    .locals 0

    iput-boolean p1, p0, Lio/flutter/embedding/android/e;->g:Z

    return p1
.end method

.method static synthetic d(Lio/flutter/embedding/android/e;Z)Z
    .locals 0

    iput-boolean p1, p0, Lio/flutter/embedding/android/e;->h:Z

    return p1
.end method

.method private e(Lio/flutter/embedding/android/k;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->y()Lio/flutter/embedding/android/v;

    move-result-object v0

    sget-object v1, Lio/flutter/embedding/android/v;->n:Lio/flutter/embedding/android/v;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lio/flutter/embedding/android/e;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/android/e;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    new-instance v0, Lio/flutter/embedding/android/e$b;

    invoke-direct {v0, p0, p1}, Lio/flutter/embedding/android/e$b;-><init>(Lio/flutter/embedding/android/e;Lio/flutter/embedding/android/k;)V

    iput-object v0, p0, Lio/flutter/embedding/android/e;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/embedding/android/e;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private h()V
    .locals 4

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->o()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->h()Lg8/a;

    move-result-object v0

    invoke-virtual {v0}, Lg8/a;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->e()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/embedding/android/e;->n(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "/"

    :cond_2
    iget-object v1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v1}, Lio/flutter/embedding/android/e$c;->s()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Executing Dart entrypoint: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v3}, Lio/flutter/embedding/android/e$c;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", library uri: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, "\"\""

    goto :goto_0

    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", and sending initial route: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    const-string v3, "FlutterActivityAndFragmentDelegate"

    invoke-static {v3, v2}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v2}, Lio/flutter/embedding/engine/a;->l()Ls8/h;

    move-result-object v2

    invoke-virtual {v2, v0}, Ls8/h;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->v()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    invoke-static {}, Lf8/a;->e()Lf8/a;

    move-result-object v0

    invoke-virtual {v0}, Lf8/a;->c()Li8/f;

    move-result-object v0

    invoke-virtual {v0}, Li8/f;->i()Ljava/lang/String;

    move-result-object v0

    :cond_5
    if-nez v1, :cond_6

    new-instance v1, Lg8/a$c;

    iget-object v2, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v2}, Lio/flutter/embedding/android/e$c;->q()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lg8/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    new-instance v2, Lg8/a$c;

    iget-object v3, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v3}, Lio/flutter/embedding/android/e$c;->q()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lg8/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v2

    :goto_1
    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->h()Lg8/a;

    move-result-object v0

    iget-object v2, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v2}, Lio/flutter/embedding/android/e$c;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lg8/a;->k(Lg8/a$c;Ljava/util/List;)V

    return-void
.end method

.method private i()V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private n(Landroid/content/Intent;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "#"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method A(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "FlutterActivityAndFragmentDelegate"

    const-string v1, "onSaveInstanceState. Giving framework and plugins an opportunity to save state."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls8/l;

    move-result-object v0

    invoke-virtual {v0}, Ls8/l;->h()[B

    move-result-object v0

    const-string v1, "framework"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->g()Ll8/b;

    move-result-object v1

    invoke-interface {v1, v0}, Ll8/b;->c(Landroid/os/Bundle;)V

    const-string v1, "plugins"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method B()V
    .locals 2

    const-string v0, "FlutterActivityAndFragmentDelegate"

    const-string v1, "onStart()"

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->h()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->j:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lio/flutter/embedding/android/k;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method C()V
    .locals 2

    const-string v0, "FlutterActivityAndFragmentDelegate"

    const-string v1, "onStop()"

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->i()Ls8/e;

    move-result-object v0

    invoke-virtual {v0}, Ls8/e;->c()V

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/embedding/android/e;->j:Ljava/lang/Integer;

    iget-object v0, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lio/flutter/embedding/android/k;->setVisibility(I)V

    return-void
.end method

.method D(I)V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lio/flutter/embedding/android/e;->h:Z

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    if-lt p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->h()Lg8/a;

    move-result-object v0

    invoke-virtual {v0}, Lg8/a;->o()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->t()Ls8/o;

    move-result-object v0

    invoke-virtual {v0}, Ls8/o;->a()V

    :cond_1
    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lr8/a;->n(I)V

    :cond_2
    return-void
.end method

.method E()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    const-string v1, "FlutterActivityAndFragmentDelegate"

    if-eqz v0, :cond_0

    const-string v0, "Forwarding onUserLeaveHint() to FlutterEngine."

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->g()Ll8/b;

    move-result-object v0

    invoke-interface {v0}, Ll8/b;->d()V

    goto :goto_0

    :cond_0
    const-string v0, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity."

    invoke-static {v1, v0}, Lf8/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method F()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    iput-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    iput-object v0, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    iput-object v0, p0, Lio/flutter/embedding/android/e;->d:Lio/flutter/plugin/platform/c;

    return-void
.end method

.method G()V
    .locals 5

    const-string v0, "FlutterActivityAndFragmentDelegate"

    const-string v1, "Setting up FlutterEngine."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v1}, Lio/flutter/embedding/android/e$c;->o()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-static {}, Lio/flutter/embedding/engine/b;->b()Lio/flutter/embedding/engine/b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/b;->a(Ljava/lang/String;)Lio/flutter/embedding/engine/a;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    iput-boolean v2, p0, Lio/flutter/embedding/android/e;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The requested cached FlutterEngine did not exist in the FlutterEngineCache: \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v1}, Lio/flutter/embedding/android/e$c;->b()Landroid/content/Context;

    move-result-object v3

    invoke-interface {v1, v3}, Lio/flutter/embedding/android/e$c;->A(Landroid/content/Context;)Lio/flutter/embedding/engine/a;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    if-eqz v1, :cond_2

    iput-boolean v2, p0, Lio/flutter/embedding/android/e;->f:Z

    return-void

    :cond_2
    const-string v1, "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/embedding/engine/a;

    iget-object v1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v1}, Lio/flutter/embedding/android/e$c;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v2}, Lio/flutter/embedding/android/e$c;->x()Lio/flutter/embedding/engine/e;

    move-result-object v2

    invoke-virtual {v2}, Lio/flutter/embedding/engine/e;->b()[Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v3}, Lio/flutter/embedding/android/e$c;->p()Z

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v4, v3}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;[Ljava/lang/String;ZZ)V

    iput-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    iput-boolean v4, p0, Lio/flutter/embedding/android/e;->f:Z

    return-void
.end method

.method H()V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/e;->d:Lio/flutter/plugin/platform/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/plugin/platform/c;->A()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->m()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->f()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The internal FlutterEngine created by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public bridge synthetic g()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/embedding/android/e;->j()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public j()Landroid/app/Activity;
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->e()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "FlutterActivityAndFragmentDelegate\'s getAppComponent should only be queried after onAttach, when the host\'s activity should always be non-null"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method k()Lio/flutter/embedding/engine/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    return-object v0
.end method

.method l()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/embedding/android/e;->i:Z

    return v0
.end method

.method m()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/embedding/android/e;->f:Z

    return v0
.end method

.method o(IILandroid/content/Intent;)V
    .locals 3

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    const-string v1, "FlutterActivityAndFragmentDelegate"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\nresultCode: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\ndata: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->g()Ll8/b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ll8/b;->a(IILandroid/content/Intent;)Z

    goto :goto_0

    :cond_0
    const-string p1, "onActivityResult() invoked before FlutterFragment was attached to an Activity."

    invoke-static {v1, p1}, Lf8/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method p(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object p1, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lio/flutter/embedding/android/e;->G()V

    :cond_0
    iget-object p1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {p1}, Lio/flutter/embedding/android/e$c;->l()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "FlutterActivityAndFragmentDelegate"

    const-string v0, "Attaching FlutterEngine to the Activity that owns this delegate."

    invoke-static {p1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/a;->g()Ll8/b;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->a()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-interface {p1, p0, v0}, Ll8/b;->e(Lio/flutter/embedding/android/c;Landroidx/lifecycle/f;)V

    :cond_1
    iget-object p1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {p1}, Lio/flutter/embedding/android/e$c;->e()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-interface {p1, v0, v1}, Lio/flutter/embedding/android/e$c;->t(Landroid/app/Activity;Lio/flutter/embedding/engine/a;)Lio/flutter/plugin/platform/c;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/embedding/android/e;->d:Lio/flutter/plugin/platform/c;

    iget-object p1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-interface {p1, v0}, Lio/flutter/embedding/android/e$c;->D(Lio/flutter/embedding/engine/a;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/flutter/embedding/android/e;->i:Z

    return-void
.end method

.method q()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    const-string v1, "FlutterActivityAndFragmentDelegate"

    if-eqz v0, :cond_0

    const-string v0, "Forwarding onBackPressed() to FlutterEngine."

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->l()Ls8/h;

    move-result-object v0

    invoke-virtual {v0}, Ls8/h;->a()V

    goto :goto_0

    :cond_0
    const-string v0, "Invoked onBackPressed() before FlutterFragment was attached to an Activity."

    invoke-static {v1, v0}, Lf8/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method r(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;IZ)Landroid/view/View;
    .locals 4

    const-string p1, "FlutterActivityAndFragmentDelegate"

    const-string p2, "Creating FlutterView."

    invoke-static {p1, p2}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object p2, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {p2}, Lio/flutter/embedding/android/e$c;->y()Lio/flutter/embedding/android/v;

    move-result-object p2

    sget-object p3, Lio/flutter/embedding/android/v;->n:Lio/flutter/embedding/android/v;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, p3, :cond_1

    new-instance p2, Lio/flutter/embedding/android/h;

    iget-object p3, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {p3}, Lio/flutter/embedding/android/e$c;->b()Landroid/content/Context;

    move-result-object p3

    iget-object v2, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v2}, Lio/flutter/embedding/android/e$c;->B()Lio/flutter/embedding/android/y;

    move-result-object v2

    sget-object v3, Lio/flutter/embedding/android/y;->o:Lio/flutter/embedding/android/y;

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-direct {p2, p3, v0}, Lio/flutter/embedding/android/h;-><init>(Landroid/content/Context;Z)V

    iget-object p3, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {p3, p2}, Lio/flutter/embedding/android/e$c;->u(Lio/flutter/embedding/android/h;)V

    new-instance p3, Lio/flutter/embedding/android/k;

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0, p2}, Lio/flutter/embedding/android/k;-><init>(Landroid/content/Context;Lio/flutter/embedding/android/h;)V

    goto :goto_2

    :cond_1
    new-instance p2, Lio/flutter/embedding/android/i;

    iget-object p3, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {p3}, Lio/flutter/embedding/android/e$c;->b()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Lio/flutter/embedding/android/i;-><init>(Landroid/content/Context;)V

    iget-object p3, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {p3}, Lio/flutter/embedding/android/e$c;->B()Lio/flutter/embedding/android/y;

    move-result-object p3

    sget-object v2, Lio/flutter/embedding/android/y;->n:Lio/flutter/embedding/android/y;

    if-ne p3, v2, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    invoke-virtual {p2, v0}, Landroid/view/TextureView;->setOpaque(Z)V

    iget-object p3, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {p3, p2}, Lio/flutter/embedding/android/e$c;->C(Lio/flutter/embedding/android/i;)V

    new-instance p3, Lio/flutter/embedding/android/k;

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0, p2}, Lio/flutter/embedding/android/k;-><init>(Landroid/content/Context;Lio/flutter/embedding/android/i;)V

    :goto_2
    iput-object p3, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    iget-object p2, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    iget-object p3, p0, Lio/flutter/embedding/android/e;->k:Lr8/b;

    invoke-virtual {p2, p3}, Lio/flutter/embedding/android/k;->l(Lr8/b;)V

    const-string p2, "Attaching FlutterEngine to FlutterView."

    invoke-static {p1, p2}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    iget-object p3, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {p2, p3}, Lio/flutter/embedding/android/k;->n(Lio/flutter/embedding/engine/a;)V

    iget-object p2, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    invoke-virtual {p2, p4}, Landroid/widget/FrameLayout;->setId(I)V

    iget-object p2, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {p2}, Lio/flutter/embedding/android/e$c;->z()Lio/flutter/embedding/android/x;

    move-result-object p2

    if-eqz p2, :cond_3

    const-string p3, "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps."

    invoke-static {p1, p3}, Lf8/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lio/flutter/embedding/android/FlutterSplashView;

    iget-object p3, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {p3}, Lio/flutter/embedding/android/e$c;->b()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p1, p3}, Lio/flutter/embedding/android/FlutterSplashView;-><init>(Landroid/content/Context;)V

    const p3, 0x1d063b02

    invoke-static {p3}, Le9/h;->d(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/widget/FrameLayout;->setId(I)V

    iget-object p3, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    invoke-virtual {p1, p3, p2}, Lio/flutter/embedding/android/FlutterSplashView;->g(Lio/flutter/embedding/android/k;Lio/flutter/embedding/android/x;)V

    return-object p1

    :cond_3
    if-eqz p5, :cond_4

    iget-object p1, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    invoke-direct {p0, p1}, Lio/flutter/embedding/android/e;->e(Lio/flutter/embedding/android/k;)V

    :cond_4
    iget-object p1, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    return-object p1
.end method

.method s()V
    .locals 2

    const-string v0, "FlutterActivityAndFragmentDelegate"

    const-string v1, "onDestroyView()"

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/android/e;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/embedding/android/e;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    invoke-virtual {v0}, Lio/flutter/embedding/android/k;->s()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->c:Lio/flutter/embedding/android/k;

    iget-object v1, p0, Lio/flutter/embedding/android/e;->k:Lr8/b;

    invoke-virtual {v0, v1}, Lio/flutter/embedding/android/k;->z(Lr8/b;)V

    return-void
.end method

.method t()V
    .locals 3

    const-string v0, "FlutterActivityAndFragmentDelegate"

    const-string v1, "onDetach()"

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    iget-object v2, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-interface {v1, v2}, Lio/flutter/embedding/android/e$c;->r(Lio/flutter/embedding/engine/a;)V

    iget-object v1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v1}, Lio/flutter/embedding/android/e$c;->l()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Detaching FlutterEngine from the Activity that owns this Fragment."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->e()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->g()Ll8/b;

    move-result-object v0

    invoke-interface {v0}, Ll8/b;->f()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->g()Ll8/b;

    move-result-object v0

    invoke-interface {v0}, Ll8/b;->h()V

    :cond_1
    :goto_0
    iget-object v0, p0, Lio/flutter/embedding/android/e;->d:Lio/flutter/plugin/platform/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/flutter/plugin/platform/c;->o()V

    iput-object v1, p0, Lio/flutter/embedding/android/e;->d:Lio/flutter/plugin/platform/c;

    :cond_2
    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->i()Ls8/e;

    move-result-object v0

    invoke-virtual {v0}, Ls8/e;->a()V

    :cond_3
    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->m()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->e()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->o()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lio/flutter/embedding/engine/b;->b()Lio/flutter/embedding/engine/b;

    move-result-object v0

    iget-object v2, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v2}, Lio/flutter/embedding/android/e$c;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/flutter/embedding/engine/b;->d(Ljava/lang/String;)V

    :cond_4
    iput-object v1, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/embedding/android/e;->i:Z

    return-void
.end method

.method u(Landroid/content/Intent;)V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    const-string v1, "FlutterActivityAndFragmentDelegate"

    if-eqz v0, :cond_0

    const-string v0, "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message."

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->g()Ll8/b;

    move-result-object v0

    invoke-interface {v0, p1}, Ll8/b;->onNewIntent(Landroid/content/Intent;)V

    invoke-direct {p0, p1}, Lio/flutter/embedding/android/e;->n(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->l()Ls8/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls8/h;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "onNewIntent() invoked before FlutterFragment was attached to an Activity."

    invoke-static {v1, p1}, Lf8/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method v()V
    .locals 2

    const-string v0, "FlutterActivityAndFragmentDelegate"

    const-string v1, "onPause()"

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->i()Ls8/e;

    move-result-object v0

    invoke-virtual {v0}, Ls8/e;->b()V

    :cond_0
    return-void
.end method

.method w()V
    .locals 2

    const-string v0, "FlutterActivityAndFragmentDelegate"

    const-string v1, "onPostResume()"

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v1, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lio/flutter/embedding/android/e;->H()V

    goto :goto_0

    :cond_0
    const-string v1, "onPostResume() invoked before FlutterFragment was attached to an Activity."

    invoke-static {v0, v1}, Lf8/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method x(I[Ljava/lang/String;[I)V
    .locals 3

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    const-string v1, "FlutterActivityAndFragmentDelegate"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\npermissions: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\ngrantResults: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->g()Ll8/b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ll8/b;->onRequestPermissionsResult(I[Ljava/lang/String;[I)Z

    goto :goto_0

    :cond_0
    const-string p1, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity."

    invoke-static {v1, p1}, Lf8/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method y(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "FlutterActivityAndFragmentDelegate"

    const-string v1, "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v0, "plugins"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "framework"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p1

    move-object v2, v0

    move-object v0, p1

    move-object p1, v2

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v1}, Lio/flutter/embedding/android/e$c;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->q()Ls8/l;

    move-result-object v1

    invoke-virtual {v1, v0}, Ls8/l;->j([B)V

    :cond_1
    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->g()Ll8/b;

    move-result-object v0

    invoke-interface {v0, p1}, Ll8/b;->b(Landroid/os/Bundle;)V

    :cond_2
    return-void
.end method

.method z()V
    .locals 2

    const-string v0, "FlutterActivityAndFragmentDelegate"

    const-string v1, "onResume()"

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/e;->i()V

    iget-object v0, p0, Lio/flutter/embedding/android/e;->a:Lio/flutter/embedding/android/e$c;

    invoke-interface {v0}, Lio/flutter/embedding/android/e$c;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/e;->b:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->i()Ls8/e;

    move-result-object v0

    invoke-virtual {v0}, Ls8/e;->d()V

    :cond_0
    return-void
.end method
