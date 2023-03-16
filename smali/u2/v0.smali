.class public final Lu2/v0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# static fields
.field public static final q:Lu2/v0;

.field public static final r:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Lu2/v0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:I

.field private final o:Lb5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/q<",
            "Lu2/t0;",
            ">;"
        }
    .end annotation
.end field

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu2/v0;

    const/4 v1, 0x0

    new-array v1, v1, [Lu2/t0;

    invoke-direct {v0, v1}, Lu2/v0;-><init>([Lu2/t0;)V

    sput-object v0, Lu2/v0;->q:Lu2/v0;

    sget-object v0, Lu2/u0;->a:Lu2/u0;

    sput-object v0, Lu2/v0;->r:Ls1/h$a;

    return-void
.end method

.method public varargs constructor <init>([Lu2/t0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lb5/q;->G([Ljava/lang/Object;)Lb5/q;

    move-result-object v0

    iput-object v0, p0, Lu2/v0;->o:Lb5/q;

    array-length p1, p1

    iput p1, p0, Lu2/v0;->n:I

    invoke-direct {p0}, Lu2/v0;->f()V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lu2/v0;
    .locals 0

    invoke-static {p0}, Lu2/v0;->e(Landroid/os/Bundle;)Lu2/v0;

    move-result-object p0

    return-object p0
.end method

.method private static d(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic e(Landroid/os/Bundle;)Lu2/v0;
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Lu2/v0;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-nez p0, :cond_0

    new-instance p0, Lu2/v0;

    new-array v0, v0, [Lu2/t0;

    invoke-direct {p0, v0}, Lu2/v0;-><init>([Lu2/t0;)V

    return-object p0

    :cond_0
    new-instance v1, Lu2/v0;

    sget-object v2, Lu2/t0;->s:Ls1/h$a;

    invoke-static {v2, p0}, Lp3/c;->b(Ls1/h$a;Ljava/util/List;)Lb5/q;

    move-result-object p0

    new-array v0, v0, [Lu2/t0;

    invoke-virtual {p0, v0}, Lb5/o;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lu2/t0;

    invoke-direct {v1, p0}, Lu2/v0;-><init>([Lu2/t0;)V

    return-object v1
.end method

.method private f()V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lu2/v0;->o:Lb5/q;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    move v2, v1

    :goto_1
    iget-object v3, p0, Lu2/v0;->o:Lb5/q;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lu2/v0;->o:Lb5/q;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu2/t0;

    iget-object v4, p0, Lu2/v0;->o:Lb5/q;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lu2/t0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v4, "Multiple identical TrackGroups added to one TrackGroupArray."

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const-string v4, "TrackGroupArray"

    const-string v5, ""

    invoke-static {v4, v5, v3}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

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
.method public b(I)Lu2/t0;
    .locals 1

    iget-object v0, p0, Lu2/v0;->o:Lb5/q;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu2/t0;

    return-object p1
.end method

.method public c(Lu2/t0;)I
    .locals 1

    iget-object v0, p0, Lu2/v0;->o:Lb5/q;

    invoke-virtual {v0, p1}, Lb5/q;->indexOf(Ljava/lang/Object;)I

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

    const-class v2, Lu2/v0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lu2/v0;

    iget v2, p0, Lu2/v0;->n:I

    iget v3, p1, Lu2/v0;->n:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lu2/v0;->o:Lb5/q;

    iget-object p1, p1, Lu2/v0;->o:Lb5/q;

    invoke-virtual {v2, p1}, Lb5/q;->equals(Ljava/lang/Object;)Z

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

    iget v0, p0, Lu2/v0;->p:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lu2/v0;->o:Lb5/q;

    invoke-virtual {v0}, Lb5/q;->hashCode()I

    move-result v0

    iput v0, p0, Lu2/v0;->p:I

    :cond_0
    iget v0, p0, Lu2/v0;->p:I

    return v0
.end method
