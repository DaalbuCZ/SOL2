.class public final Ls1/f3;
.super Ls1/w2;
.source ""


# static fields
.field public static final q:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/f3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final o:I

.field private final p:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ls1/e3;->a:Ls1/e3;

    sput-object v0, Ls1/f3;->q:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ls1/w2;-><init>()V

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "maxStars must be a positive integer"

    invoke-static {v0, v1}, Lp3/a;->b(ZLjava/lang/Object;)V

    iput p1, p0, Ls1/f3;->o:I

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Ls1/f3;->p:F

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 4

    invoke-direct {p0}, Ls1/w2;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "maxStars must be a positive integer"

    invoke-static {v2, v3}, Lp3/a;->b(ZLjava/lang/Object;)V

    const/4 v2, 0x0

    cmpl-float v2, p2, v2

    if-ltz v2, :cond_1

    int-to-float v2, p1

    cmpg-float v2, p2, v2

    if-gtz v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const-string v1, "starRating is out of range [0, maxStars]"

    invoke-static {v0, v1}, Lp3/a;->b(ZLjava/lang/Object;)V

    iput p1, p0, Ls1/f3;->o:I

    iput p2, p0, Ls1/f3;->p:F

    return-void
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/os/Bundle;)Ls1/f3;
    .locals 0

    invoke-static {p0}, Ls1/f3;->e(Landroid/os/Bundle;)Ls1/f3;

    move-result-object p0

    return-object p0
.end method

.method private static e(Landroid/os/Bundle;)Ls1/f3;
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0}, Ls1/f3;->c(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    move v0, v2

    :cond_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    invoke-static {v2}, Ls1/f3;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3}, Ls1/f3;->c(I)Ljava/lang/String;

    move-result-object v1

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    cmpl-float v1, p0, v2

    if-nez v1, :cond_1

    new-instance p0, Ls1/f3;

    invoke-direct {p0, v0}, Ls1/f3;-><init>(I)V

    goto :goto_0

    :cond_1
    new-instance v1, Ls1/f3;

    invoke-direct {v1, v0, p0}, Ls1/f3;-><init>(IF)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ls1/f3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ls1/f3;

    iget v0, p0, Ls1/f3;->o:I

    iget v2, p1, Ls1/f3;->o:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Ls1/f3;->p:F

    iget p1, p1, Ls1/f3;->p:F

    cmpl-float p1, v0, p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Ls1/f3;->o:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Ls1/f3;->p:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, La5/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
