.class public final Landroidx/lifecycle/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf0/c$c;


# instance fields
.field private final a:Lf0/c;

.field private b:Z

.field private c:Landroid/os/Bundle;

.field private final d:Lg9/g;


# direct methods
.method public constructor <init>(Lf0/c;Landroidx/lifecycle/f0;)V
    .locals 1

    const-string v0, "savedStateRegistry"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelStoreOwner"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/x;->a:Lf0/c;

    new-instance p1, Landroidx/lifecycle/x$a;

    invoke-direct {p1, p2}, Landroidx/lifecycle/x$a;-><init>(Landroidx/lifecycle/f0;)V

    invoke-static {p1}, Lg9/h;->a(Lr9/a;)Lg9/g;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/x;->d:Lg9/g;

    return-void
.end method

.method private final b()Landroidx/lifecycle/y;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/x;->d:Lg9/g;

    invoke-interface {v0}, Lg9/g;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/y;

    return-object v0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 5

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Landroidx/lifecycle/x;->c:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    invoke-direct {p0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/y;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/y;->e()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/v;

    invoke-virtual {v2}, Landroidx/lifecycle/v;->c()Lf0/c$c;

    move-result-object v2

    invoke-interface {v2}, Lf0/c$c;->a()Landroid/os/Bundle;

    move-result-object v2

    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    invoke-static {v2, v4}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/lifecycle/x;->b:Z

    return-object v0
.end method

.method public final c()V
    .locals 2

    iget-boolean v0, p0, Landroidx/lifecycle/x;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/x;->a:Lf0/c;

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Lf0/c;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Landroidx/lifecycle/x;->c:Landroid/os/Bundle;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/x;->b:Z

    invoke-direct {p0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/y;

    :cond_0
    return-void
.end method
