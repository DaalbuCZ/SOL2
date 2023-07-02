.class public Lio/flutter/embedding/android/k;
.super Landroid/widget/FrameLayout;
.source ""

# interfaces
.implements Lv8/a$c;
.implements Lio/flutter/embedding/android/s$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/android/k$f;,
        Lio/flutter/embedding/android/k$g;
    }
.end annotation


# instance fields
.field private A:Lio/flutter/embedding/android/s;

.field private B:Lio/flutter/embedding/android/a;

.field private C:Lio/flutter/view/c;

.field private D:Landroid/view/textservice/TextServicesManager;

.field private E:Lio/flutter/embedding/android/z;

.field private final F:Lr8/a$g;

.field private final G:Lio/flutter/view/c$k;

.field private final H:Landroid/database/ContentObserver;

.field private final I:Lr8/b;

.field private final J:Landroidx/core/util/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/a<",
            "Landroidx/window/layout/v;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lio/flutter/embedding/android/h;

.field private o:Lio/flutter/embedding/android/i;

.field private p:Lio/flutter/embedding/android/g;

.field q:Lr8/c;

.field private r:Lr8/c;

.field private final s:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lr8/b;",
            ">;"
        }
    .end annotation
.end field

.field private t:Z

.field private u:Lio/flutter/embedding/engine/a;

.field private final v:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/flutter/embedding/android/k$f;",
            ">;"
        }
    .end annotation
.end field

.field private w:Lv8/a;

.field private x:Lio/flutter/plugin/editing/f;

.field private y:Lio/flutter/plugin/editing/d;

.field private z:Lu8/a;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lio/flutter/embedding/android/h;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->s:Ljava/util/Set;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->v:Ljava/util/Set;

    new-instance p1, Lr8/a$g;

    invoke-direct {p1}, Lr8/a$g;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    new-instance p1, Lio/flutter/embedding/android/k$a;

    invoke-direct {p1, p0}, Lio/flutter/embedding/android/k$a;-><init>(Lio/flutter/embedding/android/k;)V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->G:Lio/flutter/view/c$k;

    new-instance p1, Lio/flutter/embedding/android/k$b;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p1, p0, p2}, Lio/flutter/embedding/android/k$b;-><init>(Lio/flutter/embedding/android/k;Landroid/os/Handler;)V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->H:Landroid/database/ContentObserver;

    new-instance p1, Lio/flutter/embedding/android/k$c;

    invoke-direct {p1, p0}, Lio/flutter/embedding/android/k$c;-><init>(Lio/flutter/embedding/android/k;)V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->I:Lr8/b;

    new-instance p1, Lio/flutter/embedding/android/k$d;

    invoke-direct {p1, p0}, Lio/flutter/embedding/android/k$d;-><init>(Lio/flutter/embedding/android/k;)V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->J:Landroidx/core/util/a;

    iput-object p3, p0, Lio/flutter/embedding/android/k;->n:Lio/flutter/embedding/android/h;

    iput-object p3, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    invoke-direct {p0}, Lio/flutter/embedding/android/k;->v()V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lio/flutter/embedding/android/i;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->s:Ljava/util/Set;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->v:Ljava/util/Set;

    new-instance p1, Lr8/a$g;

    invoke-direct {p1}, Lr8/a$g;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    new-instance p1, Lio/flutter/embedding/android/k$a;

    invoke-direct {p1, p0}, Lio/flutter/embedding/android/k$a;-><init>(Lio/flutter/embedding/android/k;)V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->G:Lio/flutter/view/c$k;

    new-instance p1, Lio/flutter/embedding/android/k$b;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p1, p0, p2}, Lio/flutter/embedding/android/k$b;-><init>(Lio/flutter/embedding/android/k;Landroid/os/Handler;)V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->H:Landroid/database/ContentObserver;

    new-instance p1, Lio/flutter/embedding/android/k$c;

    invoke-direct {p1, p0}, Lio/flutter/embedding/android/k$c;-><init>(Lio/flutter/embedding/android/k;)V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->I:Lr8/b;

    new-instance p1, Lio/flutter/embedding/android/k$d;

    invoke-direct {p1, p0}, Lio/flutter/embedding/android/k$d;-><init>(Lio/flutter/embedding/android/k;)V

    iput-object p1, p0, Lio/flutter/embedding/android/k;->J:Landroidx/core/util/a;

    iput-object p3, p0, Lio/flutter/embedding/android/k;->o:Lio/flutter/embedding/android/i;

    iput-object p3, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    invoke-direct {p0}, Lio/flutter/embedding/android/k;->v()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/android/h;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lio/flutter/embedding/android/k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lio/flutter/embedding/android/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/android/i;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lio/flutter/embedding/android/k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lio/flutter/embedding/android/i;)V

    return-void
.end method

.method private A(ZZ)V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v0

    invoke-virtual {v0}, Lr8/a;->l()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V

    return-void
.end method

.method private D()V
    .locals 2

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->w()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "FlutterView"

    const-string v1, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine."

    invoke-static {v0, v1}, Lf8/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, v0, Lr8/a$g;->a:F

    iget-object v0, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, v0, Lr8/a$g;->p:I

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    invoke-virtual {v0, v1}, Lr8/a;->t(Lr8/a$g;)V

    return-void
.end method

.method public static synthetic d(Landroid/view/textservice/SpellCheckerInfo;)Z
    .locals 0

    invoke-static {p0}, Lio/flutter/embedding/android/k;->x(Landroid/view/textservice/SpellCheckerInfo;)Z

    move-result p0

    return p0
.end method

.method static synthetic e(Lio/flutter/embedding/android/k;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/embedding/android/k;->A(ZZ)V

    return-void
.end method

.method static synthetic f(Lio/flutter/embedding/android/k;)Lio/flutter/embedding/engine/a;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    return-object p0
.end method

.method static synthetic g(Lio/flutter/embedding/android/k;Z)Z
    .locals 0

    iput-boolean p1, p0, Lio/flutter/embedding/android/k;->t:Z

    return p1
.end method

.method static synthetic h(Lio/flutter/embedding/android/k;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/android/k;->s:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic i(Lio/flutter/embedding/android/k;)Lio/flutter/embedding/android/g;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    return-object p0
.end method

.method private o()Lio/flutter/embedding/android/k$g;
    .locals 3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const-string v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_4

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lio/flutter/embedding/android/k$g;->p:Lio/flutter/embedding/android/k$g;

    return-object v0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    sget-object v0, Lio/flutter/embedding/android/k$g;->o:Lio/flutter/embedding/android/k$g;

    goto :goto_0

    :cond_1
    sget-object v0, Lio/flutter/embedding/android/k$g;->p:Lio/flutter/embedding/android/k$g;

    :goto_0
    return-object v0

    :cond_2
    if-eqz v0, :cond_3

    if-ne v0, v2, :cond_4

    :cond_3
    sget-object v0, Lio/flutter/embedding/android/k$g;->q:Lio/flutter/embedding/android/k$g;

    return-object v0

    :cond_4
    sget-object v0, Lio/flutter/embedding/android/k$g;->n:Lio/flutter/embedding/android/k$g;

    return-object v0
.end method

.method private t(Landroid/view/WindowInsets;)I
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x14
    .end annotation

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v1

    int-to-double v1, v1

    int-to-double v3, v0

    const-wide v5, 0x3fc70a3d70a3d70aL    # 0.18

    mul-double/2addr v3, v5

    cmpg-double v0, v1, v3

    if-gez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result p1

    return p1
.end method

.method private v()V
    .locals 2

    const-string v0, "FlutterView"

    const-string v1, "Initializing FlutterView"

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/embedding/android/k;->n:Lio/flutter/embedding/android/h;

    if-eqz v1, :cond_0

    const-string v1, "Internally using a FlutterSurfaceView."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->n:Lio/flutter/embedding/android/h;

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lio/flutter/embedding/android/k;->o:Lio/flutter/embedding/android/i;

    if-eqz v1, :cond_1

    const-string v1, "Internally using a FlutterTextureView."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->o:Lio/flutter/embedding/android/i;

    goto :goto_0

    :cond_1
    const-string v1, "Internally using a FlutterImageView."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    goto :goto_0

    :goto_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setFocusable(Z)V

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setFocusableInTouchMode(Z)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setImportantForAutofill(I)V

    :cond_2
    return-void
.end method

.method private static synthetic x(Landroid/view/textservice/SpellCheckerInfo;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/textservice/SpellCheckerInfo;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "com.google.android.inputmethod.latin"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public B(Ljava/lang/Runnable;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    const-string v1, "FlutterView"

    if-nez v0, :cond_0

    const-string p1, "Tried to revert the image view, but no image view is used."

    invoke-static {v1, p1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, p0, Lio/flutter/embedding/android/k;->r:Lr8/c;

    if-nez v2, :cond_1

    const-string p1, "Tried to revert the image view, but no previous surface was used."

    invoke-static {v1, p1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iput-object v2, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    const/4 v1, 0x0

    iput-object v1, p0, Lio/flutter/embedding/android/k;->r:Lr8/c;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lio/flutter/embedding/android/g;->f()V

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_2
    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    invoke-virtual {v0}, Lio/flutter/embedding/android/g;->f()V

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_3
    iget-object v1, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    invoke-interface {v1, v0}, Lr8/c;->g(Lr8/a;)V

    new-instance v1, Lio/flutter/embedding/android/k$e;

    invoke-direct {v1, p0, v0, p1}, Lio/flutter/embedding/android/k$e;-><init>(Lio/flutter/embedding/android/k;Lr8/a;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lr8/a;->g(Lr8/b;)V

    return-void
.end method

.method C()V
    .locals 6

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x20

    if-ne v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    sget-object v0, Ls8/m$b;->p:Ls8/m$b;

    goto :goto_1

    :cond_1
    sget-object v0, Ls8/m$b;->o:Ls8/m$b;

    :goto_1
    iget-object v3, p0, Lio/flutter/embedding/android/k;->D:Landroid/view/textservice/TextServicesManager;

    if-eqz v3, :cond_3

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1f

    if-lt v4, v5, :cond_2

    invoke-virtual {v3}, Landroid/view/textservice/TextServicesManager;->getEnabledSpellCheckerInfos()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lj$/util/Collection$-EL;->stream(Ljava/util/Collection;)Lj$/util/stream/Stream;

    move-result-object v3

    sget-object v4, Lio/flutter/embedding/android/j;->a:Lio/flutter/embedding/android/j;

    invoke-interface {v3, v4}, Lj$/util/stream/Stream;->anyMatch(Lj$/util/function/Predicate;)Z

    move-result v3

    iget-object v4, p0, Lio/flutter/embedding/android/k;->D:Landroid/view/textservice/TextServicesManager;

    invoke-virtual {v4}, Landroid/view/textservice/TextServicesManager;->isSpellCheckerEnabled()Z

    move-result v4

    if-eqz v4, :cond_3

    if-eqz v3, :cond_3

    :cond_2
    move v3, v2

    goto :goto_2

    :cond_3
    move v3, v1

    :goto_2
    iget-object v4, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v4}, Lio/flutter/embedding/engine/a;->r()Ls8/m;

    move-result-object v4

    invoke-virtual {v4}, Ls8/m;->a()Ls8/m$a;

    move-result-object v4

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    iget v5, v5, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {v4, v5}, Ls8/m$a;->e(F)Ls8/m$a;

    move-result-object v4

    invoke-virtual {v4, v3}, Ls8/m$a;->c(Z)Ls8/m$a;

    move-result-object v3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const-string v5, "show_password"

    invoke-static {v4, v5, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v4

    if-ne v4, v2, :cond_4

    move v1, v2

    :cond_4
    invoke-virtual {v3, v1}, Ls8/m$a;->b(Z)Ls8/m$a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ls8/m$a;->f(Z)Ls8/m$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ls8/m$a;->d(Ls8/m$b;)Ls8/m$a;

    move-result-object v0

    invoke-virtual {v0}, Ls8/m$a;->a()V

    return-void
.end method

.method public a(Landroid/view/KeyEvent;)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    return-void
.end method

.method public autofill(Landroid/util/SparseArray;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/view/autofill/AutofillValue;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/embedding/android/k;->x:Lio/flutter/plugin/editing/f;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/editing/f;->j(Landroid/util/SparseArray;)V

    return-void
.end method

.method public b(I)Landroid/view/PointerIcon;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->x:Lio/flutter/plugin/editing/f;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/editing/f;->r(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public checkInputConnectionProxy(Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->n()Lio/flutter/plugin/platform/q;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/q;->F(Landroid/view/View;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->checkInputConnectionProxy(Landroid/view/View;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->handleUpEvent(Landroid/view/KeyEvent;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/flutter/embedding/android/k;->A:Lio/flutter/embedding/android/s;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/android/s;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :cond_4
    :goto_1
    return v1
.end method

.method protected fitSystemWindows(Landroid/graphics/Rect;)Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iput v1, v0, Lr8/a$g;->d:I

    iget v1, p1, Landroid/graphics/Rect;->right:I

    iput v1, v0, Lr8/a$g;->e:I

    const/4 v1, 0x0

    iput v1, v0, Lr8/a$g;->f:I

    iget v2, p1, Landroid/graphics/Rect;->left:I

    iput v2, v0, Lr8/a$g;->g:I

    iput v1, v0, Lr8/a$g;->h:I

    iput v1, v0, Lr8/a$g;->i:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    iput p1, v0, Lr8/a$g;->j:I

    iput v1, v0, Lr8/a$g;->k:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v0, v0, Lr8/a$g;->d:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", Left: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v1, v1, Lr8/a$g;->g:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", Right: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v2, v2, Lr8/a$g;->e:I

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\nKeyboard insets: Bottom: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v2, v2, Lr8/a$g;->j:I

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v0, v0, Lr8/a$g;->k:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v0, v0, Lr8/a$g;->i:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FlutterView"

    invoke-static {v0, p1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/k;->D()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->fitSystemWindows(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public getAccessibilityNodeProvider()Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->C:Lio/flutter/view/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/view/c;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/k;->C:Lio/flutter/view/c;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAttachedFlutterEngine()Lio/flutter/embedding/engine/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    return-object v0
.end method

.method public getBinaryMessenger()Lt8/c;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->h()Lg8/a;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentImageSurface()Lio/flutter/embedding/android/g;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    return-object v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/embedding/android/g;->a()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k(Lio/flutter/embedding/android/k$f;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->v:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public l(Lr8/b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->s:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public m(Lio/flutter/embedding/android/g;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/flutter/embedding/android/g;->g(Lr8/a;)V

    :cond_0
    return-void
.end method

.method public n(Lio/flutter/embedding/engine/a;)V
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Attaching to a FlutterEngine: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterView"

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    if-ne p1, v0, :cond_0

    const-string p1, "Already attached to this engine. Doing nothing."

    invoke-static {v1, p1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "Currently attached to a different engine. Detaching and then attaching to new engine."

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->s()V

    :cond_1
    iput-object p1, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v0

    invoke-virtual {v0}, Lr8/a;->k()Z

    move-result v2

    iput-boolean v2, p0, Lio/flutter/embedding/android/k;->t:Z

    iget-object v2, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    invoke-interface {v2, v0}, Lr8/c;->g(Lr8/a;)V

    iget-object v2, p0, Lio/flutter/embedding/android/k;->I:Lr8/b;

    invoke-virtual {v0, v2}, Lr8/a;->g(Lr8/b;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v0, v2, :cond_2

    new-instance v0, Lv8/a;

    iget-object v2, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v2}, Lio/flutter/embedding/engine/a;->k()Ls8/g;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lv8/a;-><init>(Lv8/a$c;Ls8/g;)V

    iput-object v0, p0, Lio/flutter/embedding/android/k;->w:Lv8/a;

    :cond_2
    new-instance v0, Lio/flutter/plugin/editing/f;

    iget-object v2, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v2}, Lio/flutter/embedding/engine/a;->u()Ls8/p;

    move-result-object v2

    iget-object v3, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v3}, Lio/flutter/embedding/engine/a;->n()Lio/flutter/plugin/platform/q;

    move-result-object v3

    invoke-direct {v0, p0, v2, v3}, Lio/flutter/plugin/editing/f;-><init>(Landroid/view/View;Ls8/p;Lio/flutter/plugin/platform/q;)V

    iput-object v0, p0, Lio/flutter/embedding/android/k;->x:Lio/flutter/plugin/editing/f;

    :try_start_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "textservices"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/textservice/TextServicesManager;

    iput-object v0, p0, Lio/flutter/embedding/android/k;->D:Landroid/view/textservice/TextServicesManager;

    new-instance v2, Lio/flutter/plugin/editing/d;

    iget-object v3, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v3}, Lio/flutter/embedding/engine/a;->s()Ls8/n;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lio/flutter/plugin/editing/d;-><init>(Landroid/view/textservice/TextServicesManager;Ls8/n;)V

    iput-object v2, p0, Lio/flutter/embedding/android/k;->y:Lio/flutter/plugin/editing/d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "TextServicesManager not supported by device, spell check disabled."

    invoke-static {v1, v0}, Lf8/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->j()Lu8/a;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/embedding/android/k;->z:Lu8/a;

    new-instance v0, Lio/flutter/embedding/android/s;

    invoke-direct {v0, p0}, Lio/flutter/embedding/android/s;-><init>(Lio/flutter/embedding/android/s$e;)V

    iput-object v0, p0, Lio/flutter/embedding/android/k;->A:Lio/flutter/embedding/android/s;

    new-instance v0, Lio/flutter/embedding/android/a;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/embedding/android/a;-><init>(Lr8/a;Z)V

    iput-object v0, p0, Lio/flutter/embedding/android/k;->B:Lio/flutter/embedding/android/a;

    new-instance v0, Lio/flutter/view/c;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/a;->f()Ls8/a;

    move-result-object v5

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "accessibility"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    iget-object v1, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->n()Lio/flutter/plugin/platform/q;

    move-result-object v8

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lio/flutter/view/c;-><init>(Landroid/view/View;Ls8/a;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/plugin/platform/k;)V

    iput-object v0, p0, Lio/flutter/embedding/android/k;->C:Lio/flutter/view/c;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->G:Lio/flutter/view/c$k;

    invoke-virtual {v0, v1}, Lio/flutter/view/c;->Y(Lio/flutter/view/c$k;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->C:Lio/flutter/view/c;

    invoke-virtual {v0}, Lio/flutter/view/c;->D()Z

    move-result v0

    iget-object v1, p0, Lio/flutter/embedding/android/k;->C:Lio/flutter/view/c;

    invoke-virtual {v1}, Lio/flutter/view/c;->E()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lio/flutter/embedding/android/k;->A(ZZ)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->n()Lio/flutter/plugin/platform/q;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/android/k;->C:Lio/flutter/view/c;

    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/q;->a(Lio/flutter/view/c;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->n()Lio/flutter/plugin/platform/q;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/q;->D(Lr8/a;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->x:Lio/flutter/plugin/editing/f;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/f;->q()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->C()V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "show_password"

    invoke-static {v1}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v3, p0, Lio/flutter/embedding/android/k;->H:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/k;->D()V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/a;->n()Lio/flutter/plugin/platform/q;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/flutter/plugin/platform/q;->E(Lio/flutter/embedding/android/k;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->v:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/android/k$f;

    invoke-interface {v1, p1}, Lio/flutter/embedding/android/k$f;->b(Lio/flutter/embedding/engine/a;)V

    goto :goto_1

    :cond_3
    iget-boolean p1, p0, Lio/flutter/embedding/android/k;->t:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/flutter/embedding/android/k;->I:Lr8/b;

    invoke-interface {p1}, Lr8/b;->g()V

    :cond_4
    return-void
.end method

.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi",
            "NewApi"
        }
    .end annotation

    .annotation build Landroid/annotation/TargetApi;
        value = 0x14
    .end annotation

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v2

    iget-object v3, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v4, v2, Landroid/graphics/Insets;->top:I

    iput v4, v3, Lr8/a$g;->l:I

    iget v4, v2, Landroid/graphics/Insets;->right:I

    iput v4, v3, Lr8/a$g;->m:I

    iget v4, v2, Landroid/graphics/Insets;->bottom:I

    iput v4, v3, Lr8/a$g;->n:I

    iget v2, v2, Landroid/graphics/Insets;->left:I

    iput v2, v3, Lr8/a$g;->o:I

    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWindowSystemUiVisibility()I

    move-result v2

    and-int/lit8 v2, v2, 0x4

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWindowSystemUiVisibility()I

    move-result v5

    and-int/lit8 v5, v5, 0x2

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    const/16 v5, 0x1e

    if-lt v1, v5, :cond_5

    if-eqz v3, :cond_3

    invoke-static {}, Landroid/view/WindowInsets$Type;->navigationBars()I

    move-result v1

    or-int/2addr v4, v1

    :cond_3
    if-eqz v2, :cond_4

    invoke-static {}, Landroid/view/WindowInsets$Type;->statusBars()I

    move-result v1

    or-int/2addr v4, v1

    :cond_4
    invoke-virtual {p1, v4}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v3, v1, Landroid/graphics/Insets;->top:I

    iput v3, v2, Lr8/a$g;->d:I

    iget v3, v1, Landroid/graphics/Insets;->right:I

    iput v3, v2, Lr8/a$g;->e:I

    iget v3, v1, Landroid/graphics/Insets;->bottom:I

    iput v3, v2, Lr8/a$g;->f:I

    iget v1, v1, Landroid/graphics/Insets;->left:I

    iput v1, v2, Lr8/a$g;->g:I

    invoke-static {}, Landroid/view/WindowInsets$Type;->ime()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v3, v1, Landroid/graphics/Insets;->top:I

    iput v3, v2, Lr8/a$g;->h:I

    iget v3, v1, Landroid/graphics/Insets;->right:I

    iput v3, v2, Lr8/a$g;->i:I

    iget v3, v1, Landroid/graphics/Insets;->bottom:I

    iput v3, v2, Lr8/a$g;->j:I

    iget v1, v1, Landroid/graphics/Insets;->left:I

    iput v1, v2, Lr8/a$g;->k:I

    invoke-static {}, Landroid/view/WindowInsets$Type;->systemGestures()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v3, v1, Landroid/graphics/Insets;->top:I

    iput v3, v2, Lr8/a$g;->l:I

    iget v3, v1, Landroid/graphics/Insets;->right:I

    iput v3, v2, Lr8/a$g;->m:I

    iget v3, v1, Landroid/graphics/Insets;->bottom:I

    iput v3, v2, Lr8/a$g;->n:I

    iget v1, v1, Landroid/graphics/Insets;->left:I

    iput v1, v2, Lr8/a$g;->o:I

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getWaterfallInsets()Landroid/graphics/Insets;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v3, v2, Lr8/a$g;->d:I

    iget v4, v1, Landroid/graphics/Insets;->top:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v2, Lr8/a$g;->d:I

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v3, v2, Lr8/a$g;->e:I

    iget v4, v1, Landroid/graphics/Insets;->right:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v2, Lr8/a$g;->e:I

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v3, v2, Lr8/a$g;->f:I

    iget v4, v1, Landroid/graphics/Insets;->bottom:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v2, Lr8/a$g;->f:I

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v3, v2, Lr8/a$g;->g:I

    iget v1, v1, Landroid/graphics/Insets;->left:I

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, v2, Lr8/a$g;->g:I

    goto :goto_8

    :cond_5
    sget-object v1, Lio/flutter/embedding/android/k$g;->n:Lio/flutter/embedding/android/k$g;

    if-nez v3, :cond_6

    invoke-direct {p0}, Lio/flutter/embedding/android/k;->o()Lio/flutter/embedding/android/k$g;

    move-result-object v1

    :cond_6
    iget-object v5, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    if-eqz v2, :cond_7

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v2

    goto :goto_2

    :cond_7
    move v2, v4

    :goto_2
    iput v2, v5, Lr8/a$g;->d:I

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    sget-object v5, Lio/flutter/embedding/android/k$g;->p:Lio/flutter/embedding/android/k$g;

    if-eq v1, v5, :cond_9

    sget-object v5, Lio/flutter/embedding/android/k$g;->q:Lio/flutter/embedding/android/k$g;

    if-ne v1, v5, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v5

    goto :goto_4

    :cond_9
    :goto_3
    move v5, v4

    :goto_4
    iput v5, v2, Lr8/a$g;->e:I

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    if-eqz v3, :cond_a

    invoke-direct {p0, p1}, Lio/flutter/embedding/android/k;->t(Landroid/view/WindowInsets;)I

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v3

    goto :goto_5

    :cond_a
    move v3, v4

    :goto_5
    iput v3, v2, Lr8/a$g;->f:I

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    sget-object v3, Lio/flutter/embedding/android/k$g;->o:Lio/flutter/embedding/android/k$g;

    if-eq v1, v3, :cond_c

    sget-object v3, Lio/flutter/embedding/android/k$g;->q:Lio/flutter/embedding/android/k$g;

    if-ne v1, v3, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v1

    goto :goto_7

    :cond_c
    :goto_6
    move v1, v4

    :goto_7
    iput v1, v2, Lr8/a$g;->g:I

    iget-object v1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iput v4, v1, Lr8/a$g;->h:I

    iput v4, v1, Lr8/a$g;->i:I

    invoke-direct {p0, p1}, Lio/flutter/embedding/android/k;->t(Landroid/view/WindowInsets;)I

    move-result p1

    iput p1, v1, Lr8/a$g;->j:I

    iget-object p1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iput v4, p1, Lr8/a$g;->k:I

    :cond_d
    :goto_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v1, v1, Lr8/a$g;->d:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", Left: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v2, v2, Lr8/a$g;->g:I

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", Right: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v3, v3, Lr8/a$g;->e:I

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "\nKeyboard insets: Bottom: "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v3, v3, Lr8/a$g;->j:I

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v1, v1, Lr8/a$g;->k:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v1, v1, Lr8/a$g;->i:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "System Gesture Insets - Left: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v1, v1, Lr8/a$g;->o:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", Top: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v1, v1, Lr8/a$g;->l:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v1, v1, Lr8/a$g;->m:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", Bottom: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iget v1, v1, Lr8/a$g;->j:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "FlutterView"

    invoke-static {v1, p1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/android/k;->D()V

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->r()Lio/flutter/embedding/android/z;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/embedding/android/k;->E:Lio/flutter/embedding/android/z;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le9/h;->e(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/android/k;->E:Lio/flutter/embedding/android/z;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroidx/core/content/a;->i(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v2

    iget-object v3, p0, Lio/flutter/embedding/android/k;->J:Landroidx/core/util/a;

    invoke-virtual {v1, v0, v2, v3}, Lio/flutter/embedding/android/z;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V

    :cond_0
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    if-eqz v0, :cond_0

    const-string v0, "FlutterView"

    const-string v1, "Configuration changed. Sending locales and user settings to Flutter."

    invoke-static {v0, v1}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->z:Lu8/a;

    invoke-virtual {v0, p1}, Lu8/a;->d(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->C()V

    :cond_0
    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->w()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/k;->x:Lio/flutter/plugin/editing/f;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->A:Lio/flutter/embedding/android/s;

    invoke-virtual {v0, p0, v1, p1}, Lio/flutter/plugin/editing/f;->o(Landroid/view/View;Lio/flutter/embedding/android/s;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/android/k;->E:Lio/flutter/embedding/android/z;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/embedding/android/k;->J:Landroidx/core/util/a;

    invoke-virtual {v0, v1}, Lio/flutter/embedding/android/z;->b(Landroidx/core/util/a;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/embedding/android/k;->E:Lio/flutter/embedding/android/z;

    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->w()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/android/k;->B:Lio/flutter/embedding/android/a;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/android/a;->e(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    :goto_1
    return v1
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->w()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/k;->C:Lio/flutter/view/c;

    invoke-virtual {v0, p1}, Lio/flutter/view/c;->J(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->x:Lio/flutter/plugin/editing/f;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugin/editing/f;->z(Landroid/view/ViewStructure;I)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Size changed. Sending Flutter new viewport metrics. FlutterView was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " x "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ", it is now "

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "FlutterView"

    invoke-static {p4, p3}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iput p1, p3, Lr8/a$g;->b:I

    iput p2, p3, Lr8/a$g;->c:I

    invoke-direct {p0}, Lio/flutter/embedding/android/k;->D()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->w()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->requestUnbufferedDispatch(Landroid/view/MotionEvent;)V

    :cond_1
    iget-object v0, p0, Lio/flutter/embedding/android/k;->B:Lio/flutter/embedding/android/a;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/android/a;->f(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public p()V
    .locals 3

    iget-object v0, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    invoke-interface {v0}, Lr8/c;->e()V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->q()Lio/flutter/embedding/android/g;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lio/flutter/embedding/android/g;->j(II)V

    :goto_0
    iget-object v0, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    iput-object v0, p0, Lio/flutter/embedding/android/k;->r:Lr8/c;

    iget-object v0, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    iput-object v0, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lr8/c;->g(Lr8/a;)V

    :cond_1
    return-void
.end method

.method public q()Lio/flutter/embedding/android/g;
    .locals 5

    new-instance v0, Lio/flutter/embedding/android/g;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v3

    sget-object v4, Lio/flutter/embedding/android/g$b;->n:Lio/flutter/embedding/android/g$b;

    invoke-direct {v0, v1, v2, v3, v4}, Lio/flutter/embedding/android/g;-><init>(Landroid/content/Context;IILio/flutter/embedding/android/g$b;)V

    return-object v0
.end method

.method protected r()Lio/flutter/embedding/android/z;
    .locals 4

    :try_start_0
    new-instance v0, Lio/flutter/embedding/android/z;

    new-instance v1, Lo0/a;

    sget-object v2, Landroidx/window/layout/q;->a:Landroidx/window/layout/q$a;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/window/layout/q$a;->a(Landroid/content/Context;)Landroidx/window/layout/q;

    move-result-object v2

    invoke-direct {v1, v2}, Lo0/a;-><init>(Landroidx/window/layout/q;)V

    invoke-direct {v0, v1}, Lio/flutter/embedding/android/z;-><init>(Lo0/a;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public s()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Detaching from a FlutterEngine: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterView"

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/flutter/embedding/android/k;->w()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "FlutterView not attached to an engine. Not detaching."

    invoke-static {v1, v0}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/android/k;->v:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/android/k$f;

    invoke-interface {v1}, Lio/flutter/embedding/android/k$f;->a()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/android/k;->H:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->n()Lio/flutter/plugin/platform/q;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugin/platform/q;->K()V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->n()Lio/flutter/plugin/platform/q;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugin/platform/q;->d()V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->C:Lio/flutter/view/c;

    invoke-virtual {v0}, Lio/flutter/view/c;->Q()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/embedding/android/k;->C:Lio/flutter/view/c;

    iget-object v1, p0, Lio/flutter/embedding/android/k;->x:Lio/flutter/plugin/editing/f;

    invoke-virtual {v1}, Lio/flutter/plugin/editing/f;->q()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    iget-object v1, p0, Lio/flutter/embedding/android/k;->x:Lio/flutter/plugin/editing/f;

    invoke-virtual {v1}, Lio/flutter/plugin/editing/f;->p()V

    iget-object v1, p0, Lio/flutter/embedding/android/k;->A:Lio/flutter/embedding/android/s;

    invoke-virtual {v1}, Lio/flutter/embedding/android/s;->c()V

    iget-object v1, p0, Lio/flutter/embedding/android/k;->y:Lio/flutter/plugin/editing/d;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/flutter/plugin/editing/d;->b()V

    :cond_2
    iget-object v1, p0, Lio/flutter/embedding/android/k;->w:Lv8/a;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lv8/a;->c()V

    :cond_3
    iget-object v1, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v1

    const/4 v2, 0x0

    iput-boolean v2, p0, Lio/flutter/embedding/android/k;->t:Z

    iget-object v3, p0, Lio/flutter/embedding/android/k;->I:Lr8/b;

    invoke-virtual {v1, v3}, Lr8/a;->q(Lr8/b;)V

    invoke-virtual {v1}, Lr8/a;->v()V

    invoke-virtual {v1, v2}, Lr8/a;->s(Z)V

    iget-object v1, p0, Lio/flutter/embedding/android/k;->r:Lr8/c;

    if-eqz v1, :cond_4

    iget-object v2, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    iget-object v3, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    if-ne v2, v3, :cond_4

    iput-object v1, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    :cond_4
    iget-object v1, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    invoke-interface {v1}, Lr8/c;->f()V

    iget-object v1, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lio/flutter/embedding/android/g;->c()V

    iget-object v1, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    iput-object v0, p0, Lio/flutter/embedding/android/k;->p:Lio/flutter/embedding/android/g;

    :cond_5
    iput-object v0, p0, Lio/flutter/embedding/android/k;->r:Lr8/c;

    iput-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    iget-object v0, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    instance-of v1, v0, Lio/flutter/embedding/android/h;

    if-eqz v1, :cond_0

    check-cast v0, Lio/flutter/embedding/android/h;

    invoke-virtual {v0, p1}, Landroid/view/SurfaceView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method protected setWindowInfoListenerDisplayFeatures(Landroidx/window/layout/v;)V
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1c
    .end annotation

    invoke-virtual {p1}, Landroidx/window/layout/v;->a()Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "FlutterView"

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/window/layout/e;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WindowInfoTracker Display Feature reported with bounds = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Landroidx/window/layout/e;->a()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " and type = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v2, v1, Landroidx/window/layout/j;

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Landroidx/window/layout/j;

    invoke-interface {v2}, Landroidx/window/layout/j;->g()Landroidx/window/layout/j$a;

    move-result-object v3

    sget-object v4, Landroidx/window/layout/j$a;->d:Landroidx/window/layout/j$a;

    if-ne v3, v4, :cond_0

    sget-object v3, Lr8/a$d;->q:Lr8/a$d;

    goto :goto_1

    :cond_0
    sget-object v3, Lr8/a$d;->p:Lr8/a$d;

    :goto_1
    invoke-interface {v2}, Landroidx/window/layout/j;->f()Landroidx/window/layout/j$b;

    move-result-object v4

    sget-object v5, Landroidx/window/layout/j$b;->c:Landroidx/window/layout/j$b;

    if-ne v4, v5, :cond_1

    sget-object v2, Lr8/a$c;->p:Lr8/a$c;

    goto :goto_2

    :cond_1
    invoke-interface {v2}, Landroidx/window/layout/j;->f()Landroidx/window/layout/j$b;

    move-result-object v2

    sget-object v4, Landroidx/window/layout/j$b;->d:Landroidx/window/layout/j$b;

    if-ne v2, v4, :cond_2

    sget-object v2, Lr8/a$c;->q:Lr8/a$c;

    goto :goto_2

    :cond_2
    sget-object v2, Lr8/a$c;->o:Lr8/a$c;

    :goto_2
    new-instance v4, Lr8/a$b;

    invoke-interface {v1}, Landroidx/window/layout/e;->a()Landroid/graphics/Rect;

    move-result-object v1

    invoke-direct {v4, v1, v3, v2}, Lr8/a$b;-><init>(Landroid/graphics/Rect;Lr8/a$d;Lr8/a$c;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v2, Lr8/a$b;

    invoke-interface {v1}, Landroidx/window/layout/e;->a()Landroid/graphics/Rect;

    move-result-object v1

    sget-object v3, Lr8/a$d;->o:Lr8/a$d;

    sget-object v4, Lr8/a$c;->o:Lr8/a$c;

    invoke-direct {v2, v1, v3, v4}, Lr8/a$b;-><init>(Landroid/graphics/Rect;Lr8/a$d;Lr8/a$c;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt p1, v1, :cond_5

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getBoundingRects()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DisplayCutout area reported with bounds = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lf8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lr8/a$b;

    sget-object v4, Lr8/a$d;->r:Lr8/a$d;

    invoke-direct {v3, v1, v4}, Lr8/a$b;-><init>(Landroid/graphics/Rect;Lr8/a$d;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lio/flutter/embedding/android/k;->F:Lr8/a$g;

    iput-object v0, p1, Lr8/a$g;->q:Ljava/util/List;

    invoke-direct {p0}, Lio/flutter/embedding/android/k;->D()V

    return-void
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/embedding/android/k;->t:Z

    return v0
.end method

.method public w()Z
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/android/k;->u:Lio/flutter/embedding/engine/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->p()Lr8/a;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/android/k;->q:Lr8/c;

    invoke-interface {v1}, Lr8/c;->getAttachedRenderer()Lr8/a;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public y(Lio/flutter/embedding/android/k$f;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->v:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public z(Lr8/b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/android/k;->s:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
