.class public final Landroidx/window/layout/l;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Landroidx/window/layout/l;

.field private static final b:Ly8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/window/layout/l;

    invoke-direct {v0}, Landroidx/window/layout/l;-><init>()V

    sput-object v0, Landroidx/window/layout/l;->a:Landroidx/window/layout/l;

    sget-object v0, Landroidx/window/layout/l$e;->o:Landroidx/window/layout/l$e;

    invoke-static {v0}, Ly8/h;->a(Lj9/a;)Ly8/g;

    move-result-object v0

    sput-object v0, Landroidx/window/layout/l;->b:Ly8/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Landroidx/window/layout/l;Ljava/lang/ClassLoader;)Z
    .locals 0

    invoke-direct {p0, p1}, Landroidx/window/layout/l;->i(Ljava/lang/ClassLoader;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Landroidx/window/layout/l;Ljava/lang/reflect/Method;Ljava/lang/Class;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/window/layout/l;->j(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Landroidx/window/layout/l;Ljava/lang/reflect/Method;Lo9/b;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/window/layout/l;->k(Ljava/lang/reflect/Method;Lo9/b;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Landroidx/window/layout/l;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/window/layout/l;->l(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Landroidx/window/layout/l;Ljava/lang/reflect/Method;)Z
    .locals 0

    invoke-direct {p0, p1}, Landroidx/window/layout/l;->o(Ljava/lang/reflect/Method;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic f(Landroidx/window/layout/l;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/window/layout/l;->t(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Landroidx/window/layout/l;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/window/layout/l;->u(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Landroidx/window/layout/l;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/window/layout/l;->v(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method private final i(Ljava/lang/ClassLoader;)Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x18

    if-lt v0, v2, :cond_0

    invoke-direct {p0, p1}, Landroidx/window/layout/l;->r(Ljava/lang/ClassLoader;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Landroidx/window/layout/l;->p(Ljava/lang/ClassLoader;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Landroidx/window/layout/l;->q(Ljava/lang/ClassLoader;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Landroidx/window/layout/l;->n(Ljava/lang/ClassLoader;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private final j(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/Class;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final k(Ljava/lang/reflect/Method;Lo9/b;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Lo9/b<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p2}, Li9/a;->a(Lo9/b;)Ljava/lang/Class;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Landroidx/window/layout/l;->j(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method private final l(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-string v0, "androidx.window.extensions.layout.FoldingFeature"

    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method private final n(Ljava/lang/ClassLoader;)Z
    .locals 1

    new-instance v0, Landroidx/window/layout/l$a;

    invoke-direct {v0, p1}, Landroidx/window/layout/l$a;-><init>(Ljava/lang/ClassLoader;)V

    invoke-direct {p0, v0}, Landroidx/window/layout/l;->s(Lj9/a;)Z

    move-result p1

    return p1
.end method

.method private final o(Ljava/lang/reflect/Method;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result p1

    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result p1

    return p1
.end method

.method private final p(Ljava/lang/ClassLoader;)Z
    .locals 1

    new-instance v0, Landroidx/window/layout/l$b;

    invoke-direct {v0, p1}, Landroidx/window/layout/l$b;-><init>(Ljava/lang/ClassLoader;)V

    invoke-direct {p0, v0}, Landroidx/window/layout/l;->s(Lj9/a;)Z

    move-result p1

    return p1
.end method

.method private final q(Ljava/lang/ClassLoader;)Z
    .locals 1

    new-instance v0, Landroidx/window/layout/l$c;

    invoke-direct {v0, p1}, Landroidx/window/layout/l$c;-><init>(Ljava/lang/ClassLoader;)V

    invoke-direct {p0, v0}, Landroidx/window/layout/l;->s(Lj9/a;)Z

    move-result p1

    return p1
.end method

.method private final r(Ljava/lang/ClassLoader;)Z
    .locals 1

    new-instance v0, Landroidx/window/layout/l$d;

    invoke-direct {v0, p1}, Landroidx/window/layout/l$d;-><init>(Ljava/lang/ClassLoader;)V

    invoke-direct {p0, v0}, Landroidx/window/layout/l;->s(Lj9/a;)Z

    move-result p1

    return p1
.end method

.method private final s(Lj9/a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/a<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Lj9/a;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return v0
.end method

.method private final t(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-string v0, "androidx.window.extensions.WindowExtensions"

    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method private final u(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-string v0, "androidx.window.extensions.WindowExtensionsProvider"

    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method private final v(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-string v0, "androidx.window.extensions.layout.WindowLayoutComponent"

    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final m()Landroidx/window/extensions/layout/WindowLayoutComponent;
    .locals 1

    sget-object v0, Landroidx/window/layout/l;->b:Ly8/g;

    invoke-interface {v0}, Ly8/g;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/window/extensions/layout/WindowLayoutComponent;

    return-object v0
.end method
