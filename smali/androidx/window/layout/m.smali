.class public final Landroidx/window/layout/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/window/layout/m$a;
    }
.end annotation


# static fields
.field public static final b:Landroidx/window/layout/m$a;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final a:Li0/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/window/layout/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/window/layout/m$a;-><init>(Lk9/g;)V

    sput-object v0, Landroidx/window/layout/m;->b:Landroidx/window/layout/m$a;

    const-class v0, Landroidx/window/layout/m;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/window/layout/m;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Landroidx/window/layout/m;-><init>(Li0/f$b;ILk9/g;)V

    return-void
.end method

.method public constructor <init>(Li0/f$b;)V
    .locals 1

    const-string v0, "verificationMode"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/window/layout/m;->a:Li0/f$b;

    return-void
.end method

.method public synthetic constructor <init>(Li0/f$b;ILk9/g;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Li0/f$b;->p:Li0/f$b;

    :cond_0
    invoke-direct {p0, p1}, Landroidx/window/layout/m;-><init>(Li0/f$b;)V

    return-void
.end method

.method private final b(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDisplayFeature;)Z
    .locals 3

    invoke-static {p1, p2}, Lk9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    if-nez p2, :cond_2

    return v0

    :cond_2
    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    move-result v1

    invoke-virtual {p2}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    move-result v2

    if-eq v1, v2, :cond_3

    return v0

    :cond_3
    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p2}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    move-result-object p2

    invoke-static {p1, p2}, Lk9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final c(Ljava/util/List;Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/window/sidecar/SidecarDisplayFeature;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/window/sidecar/SidecarDisplayFeature;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p1, p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    if-nez p2, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_5

    add-int/lit8 v4, v3, 0x1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/window/sidecar/SidecarDisplayFeature;

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/window/sidecar/SidecarDisplayFeature;

    invoke-direct {p0, v5, v3}, Landroidx/window/layout/m;->b(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDisplayFeature;)Z

    move-result v3

    if-nez v3, :cond_4

    return v1

    :cond_4
    move v3, v4

    goto :goto_0

    :cond_5
    return v0
.end method


# virtual methods
.method public final a(Landroidx/window/sidecar/SidecarDeviceState;Landroidx/window/sidecar/SidecarDeviceState;)Z
    .locals 3

    invoke-static {p1, p2}, Lk9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    if-nez p2, :cond_2

    return v0

    :cond_2
    sget-object v2, Landroidx/window/layout/m;->b:Landroidx/window/layout/m$a;

    invoke-virtual {v2, p1}, Landroidx/window/layout/m$a;->b(Landroidx/window/sidecar/SidecarDeviceState;)I

    move-result p1

    invoke-virtual {v2, p2}, Landroidx/window/layout/m$a;->b(Landroidx/window/sidecar/SidecarDeviceState;)I

    move-result p2

    if-ne p1, p2, :cond_3

    goto :goto_0

    :cond_3
    move v1, v0

    :goto_0
    return v1
.end method

.method public final d(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Z
    .locals 1

    invoke-static {p1, p2}, Lk9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    if-nez p2, :cond_2

    return v0

    :cond_2
    sget-object v0, Landroidx/window/layout/m;->b:Landroidx/window/layout/m$a;

    invoke-virtual {v0, p1}, Landroidx/window/layout/m$a;->c(Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p2}, Landroidx/window/layout/m$a;->c(Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Landroidx/window/layout/m;->c(Ljava/util/List;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public final e(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/v;
    .locals 2

    const-string v0, "state"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    new-instance p1, Landroidx/window/layout/v;

    invoke-static {}, Lz8/h;->d()Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/window/layout/v;-><init>(Ljava/util/List;)V

    return-object p1

    :cond_0
    new-instance v0, Landroidx/window/sidecar/SidecarDeviceState;

    invoke-direct {v0}, Landroidx/window/sidecar/SidecarDeviceState;-><init>()V

    sget-object v1, Landroidx/window/layout/m;->b:Landroidx/window/layout/m$a;

    invoke-virtual {v1, p2}, Landroidx/window/layout/m$a;->b(Landroidx/window/sidecar/SidecarDeviceState;)I

    move-result p2

    invoke-virtual {v1, v0, p2}, Landroidx/window/layout/m$a;->d(Landroidx/window/sidecar/SidecarDeviceState;I)V

    invoke-virtual {v1, p1}, Landroidx/window/layout/m$a;->c(Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Landroidx/window/layout/m;->f(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Landroidx/window/layout/v;

    invoke-direct {p2, p1}, Landroidx/window/layout/v;-><init>(Ljava/util/List;)V

    return-object p2
.end method

.method public final f(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/window/sidecar/SidecarDisplayFeature;",
            ">;",
            "Landroidx/window/sidecar/SidecarDeviceState;",
            ")",
            "Ljava/util/List<",
            "Landroidx/window/layout/e;",
            ">;"
        }
    .end annotation

    const-string v0, "sidecarDisplayFeatures"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceState"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/window/sidecar/SidecarDisplayFeature;

    invoke-virtual {p0, v1, p2}, Landroidx/window/layout/m;->g(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/e;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final g(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/e;
    .locals 8

    const-string v0, "feature"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceState"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li0/f;->a:Li0/f$a;

    sget-object v3, Landroidx/window/layout/m;->c:Ljava/lang/String;

    const-string v0, "TAG"

    invoke-static {v3, v0}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Landroidx/window/layout/m;->a:Li0/f$b;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Li0/f$a;->b(Li0/f$a;Ljava/lang/Object;Ljava/lang/String;Li0/f$b;Li0/e;ILjava/lang/Object;)Li0/f;

    move-result-object v0

    sget-object v1, Landroidx/window/layout/m$b;->o:Landroidx/window/layout/m$b;

    const-string v2, "Type must be either TYPE_FOLD or TYPE_HINGE"

    invoke-virtual {v0, v2, v1}, Li0/f;->c(Ljava/lang/String;Lj9/l;)Li0/f;

    move-result-object v0

    sget-object v1, Landroidx/window/layout/m$c;->o:Landroidx/window/layout/m$c;

    const-string v2, "Feature bounds must not be 0"

    invoke-virtual {v0, v2, v1}, Li0/f;->c(Ljava/lang/String;Lj9/l;)Li0/f;

    move-result-object v0

    sget-object v1, Landroidx/window/layout/m$d;->o:Landroidx/window/layout/m$d;

    const-string v2, "TYPE_FOLD must have 0 area"

    invoke-virtual {v0, v2, v1}, Li0/f;->c(Ljava/lang/String;Lj9/l;)Li0/f;

    move-result-object v0

    sget-object v1, Landroidx/window/layout/m$e;->o:Landroidx/window/layout/m$e;

    const-string v2, "Feature be pinned to either left or top"

    invoke-virtual {v0, v2, v1}, Li0/f;->c(Ljava/lang/String;Lj9/l;)Li0/f;

    move-result-object v0

    invoke-virtual {v0}, Li0/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/window/sidecar/SidecarDisplayFeature;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Landroidx/window/sidecar/SidecarDisplayFeature;->getType()I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    return-object v1

    :cond_1
    sget-object v0, Landroidx/window/layout/k$b;->b:Landroidx/window/layout/k$b$a;

    invoke-virtual {v0}, Landroidx/window/layout/k$b$a;->b()Landroidx/window/layout/k$b;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v0, Landroidx/window/layout/k$b;->b:Landroidx/window/layout/k$b$a;

    invoke-virtual {v0}, Landroidx/window/layout/k$b$a;->a()Landroidx/window/layout/k$b;

    move-result-object v0

    :goto_0
    sget-object v4, Landroidx/window/layout/m;->b:Landroidx/window/layout/m$a;

    invoke-virtual {v4, p2}, Landroidx/window/layout/m$a;->b(Landroidx/window/sidecar/SidecarDeviceState;)I

    move-result p2

    if-eqz p2, :cond_5

    if-eq p2, v3, :cond_5

    if-eq p2, v2, :cond_4

    const/4 v2, 0x3

    if-eq p2, v2, :cond_3

    const/4 v2, 0x4

    if-eq p2, v2, :cond_5

    :cond_3
    sget-object p2, Landroidx/window/layout/j$b;->c:Landroidx/window/layout/j$b;

    goto :goto_1

    :cond_4
    sget-object p2, Landroidx/window/layout/j$b;->d:Landroidx/window/layout/j$b;

    :goto_1
    new-instance v1, Landroidx/window/layout/k;

    new-instance v2, Li0/b;

    invoke-virtual {p1}, Landroidx/window/sidecar/SidecarDisplayFeature;->getRect()Landroid/graphics/Rect;

    move-result-object p1

    const-string v3, "feature.rect"

    invoke-static {p1, v3}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1}, Li0/b;-><init>(Landroid/graphics/Rect;)V

    invoke-direct {v1, v2, v0, p2}, Landroidx/window/layout/k;-><init>(Li0/b;Landroidx/window/layout/k$b;Landroidx/window/layout/j$b;)V

    :cond_5
    return-object v1
.end method