.class public final Lz2/v0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# static fields
.field public static final q:Lz2/v0;

.field private static final r:Ljava/lang/String;

.field public static final s:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Lz2/v0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:I

.field private final o:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Lz2/t0;",
            ">;"
        }
    .end annotation
.end field

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz2/v0;

    const/4 v1, 0x0

    new-array v2, v1, [Lz2/t0;

    invoke-direct {v0, v2}, Lz2/v0;-><init>([Lz2/t0;)V

    sput-object v0, Lz2/v0;->q:Lz2/v0;

    invoke-static {v1}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lz2/v0;->r:Ljava/lang/String;

    sget-object v0, Lz2/u0;->a:Lz2/u0;

    sput-object v0, Lz2/v0;->s:Lx1/h$a;

    return-void
.end method

.method public varargs constructor <init>([Lz2/t0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lg5/q;->G([Ljava/lang/Object;)Lg5/q;

    move-result-object v0

    iput-object v0, p0, Lz2/v0;->o:Lg5/q;

    array-length p1, p1

    iput p1, p0, Lz2/v0;->n:I

    invoke-direct {p0}, Lz2/v0;->e()V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lz2/v0;
    .locals 0

    invoke-static {p0}, Lz2/v0;->d(Landroid/os/Bundle;)Lz2/v0;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Landroid/os/Bundle;)Lz2/v0;
    .locals 3

    sget-object v0, Lz2/v0;->r:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    new-instance p0, Lz2/v0;

    new-array v0, v0, [Lz2/t0;

    invoke-direct {p0, v0}, Lz2/v0;-><init>([Lz2/t0;)V

    return-object p0

    :cond_0
    new-instance v1, Lz2/v0;

    sget-object v2, Lz2/t0;->u:Lx1/h$a;

    invoke-static {v2, p0}, Lu3/c;->b(Lx1/h$a;Ljava/util/List;)Lg5/q;

    move-result-object p0

    new-array v0, v0, [Lz2/t0;

    invoke-virtual {p0, v0}, Lg5/o;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lz2/t0;

    invoke-direct {v1, p0}, Lz2/v0;-><init>([Lz2/t0;)V

    return-object v1
.end method

.method private e()V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lz2/v0;->o:Lg5/q;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    move v2, v1

    :goto_1
    iget-object v3, p0, Lz2/v0;->o:Lg5/q;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lz2/v0;->o:Lg5/q;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz2/t0;

    iget-object v4, p0, Lz2/v0;->o:Lg5/q;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lz2/t0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v4, "Multiple identical TrackGroups added to one TrackGroupArray."

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const-string v4, "TrackGroupArray"

    const-string v5, ""

    invoke-static {v4, v5, v3}, Lu3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public b(I)Lz2/t0;
    .locals 1

    iget-object v0, p0, Lz2/v0;->o:Lg5/q;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/t0;

    return-object p1
.end method

.method public c(Lz2/t0;)I
    .locals 1

    iget-object v0, p0, Lz2/v0;->o:Lg5/q;

    invoke-virtual {v0, p1}, Lg5/q;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lz2/v0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lz2/v0;

    iget v2, p0, Lz2/v0;->n:I

    iget v3, p1, Lz2/v0;->n:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lz2/v0;->o:Lg5/q;

    iget-object p1, p1, Lz2/v0;->o:Lg5/q;

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
    .locals 1

    iget v0, p0, Lz2/v0;->p:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lz2/v0;->o:Lg5/q;

    invoke-virtual {v0}, Lg5/q;->hashCode()I

    move-result v0

    iput v0, p0, Lz2/v0;->p:I

    :cond_0
    iget v0, p0, Lz2/v0;->p:I

    return v0
.end method
