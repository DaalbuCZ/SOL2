.class final Landroidx/window/layout/l$c;
.super Ls9/l;
.source ""

# interfaces
.implements Lr9/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/window/layout/l;->q(Ljava/lang/ClassLoader;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/l;",
        "Lr9/a<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic o:Ljava/lang/ClassLoader;


# direct methods
.method constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    iput-object p1, p0, Landroidx/window/layout/l$c;->o:Ljava/lang/ClassLoader;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ls9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 7

    sget-object v0, Landroidx/window/layout/l;->a:Landroidx/window/layout/l;

    iget-object v1, p0, Landroidx/window/layout/l$c;->o:Ljava/lang/ClassLoader;

    invoke-static {v0, v1}, Landroidx/window/layout/l;->h(Landroidx/window/layout/l;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Landroid/app/Activity;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Lj$/util/function/Consumer;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "addWindowLayoutInfoListener"

    invoke-virtual {v1, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v5, [Ljava/lang/Class;

    const-class v6, Lj$/util/function/Consumer;

    aput-object v6, v3, v4

    const-string v6, "removeWindowLayoutInfoListener"

    invoke-virtual {v1, v6, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const-string v3, "addListenerMethod"

    invoke-static {v2, v3}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Landroidx/window/layout/l;->e(Landroidx/window/layout/l;Ljava/lang/reflect/Method;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "removeListenerMethod"

    invoke-static {v1, v2}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Landroidx/window/layout/l;->e(Landroidx/window/layout/l;Ljava/lang/reflect/Method;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v4, v5

    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/window/layout/l$c;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
