.class public final Ls3/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# static fields
.field private static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;

.field public static final r:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Ls3/y;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Lz2/t0;

.field public final o:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/y;->p:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/y;->q:Ljava/lang/String;

    sget-object v0, Ls3/x;->a:Ls3/x;

    sput-object v0, Ls3/y;->r:Lx1/h$a;

    return-void
.end method

.method public constructor <init>(Lz2/t0;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/t0;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p1, Lz2/t0;->n:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Ls3/y;->n:Lz2/t0;

    invoke-static {p2}, Lg5/q;->F(Ljava/util/Collection;)Lg5/q;

    move-result-object p1

    iput-object p1, p0, Ls3/y;->o:Lg5/q;

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/y;
    .locals 0

    invoke-static {p0}, Ls3/y;->c(Landroid/os/Bundle;)Ls3/y;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Landroid/os/Bundle;)Ls3/y;
    .locals 2

    sget-object v0, Ls3/y;->p:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    sget-object v1, Lz2/t0;->u:Lx1/h$a;

    invoke-interface {v1, v0}, Lx1/h$a;->a(Landroid/os/Bundle;)Lx1/h;

    move-result-object v0

    check-cast v0, Lz2/t0;

    sget-object v1, Ls3/y;->q:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p0

    invoke-static {p0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    new-instance v1, Ls3/y;

    invoke-static {p0}, Li5/e;->c([I)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Ls3/y;-><init>(Lz2/t0;Ljava/util/List;)V

    return-object v1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget-object v0, p0, Ls3/y;->n:Lz2/t0;

    iget v0, v0, Lz2/t0;->p:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls3/y;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls3/y;

    iget-object v2, p0, Ls3/y;->n:Lz2/t0;

    iget-object v3, p1, Ls3/y;->n:Lz2/t0;

    invoke-virtual {v2, v3}, Lz2/t0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls3/y;->o:Lg5/q;

    iget-object p1, p1, Ls3/y;->o:Lg5/q;

    invoke-virtual {v2, p1}, Lg5/q;->equals(Ljava/lang/Object;)Z

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
    .locals 2

    iget-object v0, p0, Ls3/y;->n:Lz2/t0;

    invoke-virtual {v0}, Lz2/t0;->hashCode()I

    move-result v0

    iget-object v1, p0, Ls3/y;->o:Lg5/q;

    invoke-virtual {v1}, Lg5/q;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method
