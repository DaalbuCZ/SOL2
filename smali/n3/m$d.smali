.class public final Ln3/m$d;
.super Ln3/a0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln3/m$d$a;
    }
.end annotation


# static fields
.field public static final f0:Ln3/m$d;

.field public static final g0:Ln3/m$d;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final h0:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ln3/m$d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final Q:Z

.field public final R:Z

.field public final S:Z

.field public final T:Z

.field public final U:Z

.field public final V:Z

.field public final W:Z

.field public final X:Z

.field public final Y:Z

.field public final Z:Z

.field public final a0:Z

.field public final b0:Z

.field public final c0:Z

.field private final d0:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lu2/v0;",
            "Ln3/m$e;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e0:Landroid/util/SparseBooleanArray;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln3/m$d$a;

    invoke-direct {v0}, Ln3/m$d$a;-><init>()V

    invoke-virtual {v0}, Ln3/m$d$a;->X()Ln3/m$d;

    move-result-object v0

    sput-object v0, Ln3/m$d;->f0:Ln3/m$d;

    sput-object v0, Ln3/m$d;->g0:Ln3/m$d;

    sget-object v0, Ln3/n;->a:Ln3/n;

    sput-object v0, Ln3/m$d;->h0:Ls1/h$a;

    return-void
.end method

.method private constructor <init>(Ln3/m$d$a;)V
    .locals 1

    invoke-direct {p0, p1}, Ln3/a0;-><init>(Ln3/a0$a;)V

    invoke-static {p1}, Ln3/m$d$a;->Q(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->Q:Z

    invoke-static {p1}, Ln3/m$d$a;->R(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->R:Z

    invoke-static {p1}, Ln3/m$d$a;->S(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->S:Z

    invoke-static {p1}, Ln3/m$d$a;->T(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->T:Z

    invoke-static {p1}, Ln3/m$d$a;->U(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->U:Z

    invoke-static {p1}, Ln3/m$d$a;->V(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->V:Z

    invoke-static {p1}, Ln3/m$d$a;->W(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->W:Z

    invoke-static {p1}, Ln3/m$d$a;->I(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->X:Z

    invoke-static {p1}, Ln3/m$d$a;->J(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->Y:Z

    invoke-static {p1}, Ln3/m$d$a;->K(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->Z:Z

    invoke-static {p1}, Ln3/m$d$a;->L(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->a0:Z

    invoke-static {p1}, Ln3/m$d$a;->M(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->b0:Z

    invoke-static {p1}, Ln3/m$d$a;->N(Ln3/m$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/m$d;->c0:Z

    invoke-static {p1}, Ln3/m$d$a;->O(Ln3/m$d$a;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p0, Ln3/m$d;->d0:Landroid/util/SparseArray;

    invoke-static {p1}, Ln3/m$d$a;->P(Ln3/m$d$a;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    iput-object p1, p0, Ln3/m$d;->e0:Landroid/util/SparseBooleanArray;

    return-void
.end method

.method synthetic constructor <init>(Ln3/m$d$a;Ln3/m$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ln3/m$d;-><init>(Ln3/m$d$a;)V

    return-void
.end method

.method public static synthetic c(Landroid/os/Bundle;)Ln3/m$d;
    .locals 0

    invoke-static {p0}, Ln3/m$d;->n(Landroid/os/Bundle;)Ln3/m$d;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Ln3/m$d;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Ln3/m$d;->d0:Landroid/util/SparseArray;

    return-object p0
.end method

.method static synthetic e(Ln3/m$d;)Landroid/util/SparseBooleanArray;
    .locals 0

    iget-object p0, p0, Ln3/m$d;->e0:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method private static f(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)Z
    .locals 4

    invoke-virtual {p0}, Landroid/util/SparseBooleanArray;->size()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v1, v0, :cond_0

    return v2

    :cond_0
    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/util/SparseBooleanArray;->indexOfKey(I)I

    move-result v3

    if-gez v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private static g(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lu2/v0;",
            "Ln3/m$e;",
            ">;>;",
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lu2/v0;",
            "Ln3/m$e;",
            ">;>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v1, v0, :cond_0

    return v2

    :cond_0
    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v3

    if-ltz v3, :cond_2

    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-static {v4, v3}, Ln3/m$d;->h(Ljava/util/Map;Ljava/util/Map;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v2

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method private static h(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lu2/v0;",
            "Ln3/m$e;",
            ">;",
            "Ljava/util/Map<",
            "Lu2/v0;",
            "Ln3/m$e;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v1, v0, :cond_0

    return v2

    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/v0;

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_2
    return v2

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static j(Landroid/content/Context;)Ln3/m$d;
    .locals 1

    new-instance v0, Ln3/m$d$a;

    invoke-direct {v0, p0}, Ln3/m$d$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Ln3/m$d$a;->X()Ln3/m$d;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic n(Landroid/os/Bundle;)Ln3/m$d;
    .locals 2

    new-instance v0, Ln3/m$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln3/m$d$a;-><init>(Landroid/os/Bundle;Ln3/m$a;)V

    invoke-virtual {v0}, Ln3/m$d$a;->X()Ln3/m$d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ln3/m$d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Ln3/m$d;

    invoke-super {p0, p1}, Ln3/a0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->Q:Z

    iget-boolean v3, p1, Ln3/m$d;->Q:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->R:Z

    iget-boolean v3, p1, Ln3/m$d;->R:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->S:Z

    iget-boolean v3, p1, Ln3/m$d;->S:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->T:Z

    iget-boolean v3, p1, Ln3/m$d;->T:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->U:Z

    iget-boolean v3, p1, Ln3/m$d;->U:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->V:Z

    iget-boolean v3, p1, Ln3/m$d;->V:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->W:Z

    iget-boolean v3, p1, Ln3/m$d;->W:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->X:Z

    iget-boolean v3, p1, Ln3/m$d;->X:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->Y:Z

    iget-boolean v3, p1, Ln3/m$d;->Y:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->Z:Z

    iget-boolean v3, p1, Ln3/m$d;->Z:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->a0:Z

    iget-boolean v3, p1, Ln3/m$d;->a0:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->b0:Z

    iget-boolean v3, p1, Ln3/m$d;->b0:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/m$d;->c0:Z

    iget-boolean v3, p1, Ln3/m$d;->c0:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ln3/m$d;->e0:Landroid/util/SparseBooleanArray;

    iget-object v3, p1, Ln3/m$d;->e0:Landroid/util/SparseBooleanArray;

    invoke-static {v2, v3}, Ln3/m$d;->f(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ln3/m$d;->d0:Landroid/util/SparseArray;

    iget-object p1, p1, Ln3/m$d;->d0:Landroid/util/SparseArray;

    invoke-static {v2, p1}, Ln3/m$d;->g(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    invoke-super {p0}, Ln3/a0;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->Q:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->R:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->S:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->T:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->U:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->V:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->W:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->X:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->Y:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->Z:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->a0:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/m$d;->b0:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Ln3/m$d;->c0:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public i()Ln3/m$d$a;
    .locals 2

    new-instance v0, Ln3/m$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln3/m$d$a;-><init>(Ln3/m$d;Ln3/m$a;)V

    return-object v0
.end method

.method public k(I)Z
    .locals 1

    iget-object v0, p0, Ln3/m$d;->e0:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    return p1
.end method

.method public l(ILu2/v0;)Ln3/m$e;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Ln3/m$d;->d0:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln3/m$e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public m(ILu2/v0;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Ln3/m$d;->d0:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
