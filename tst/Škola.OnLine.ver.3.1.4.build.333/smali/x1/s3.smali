.class public final Lx1/s3;
.super Lx1/j3;
.source ""


# static fields
.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field public static final t:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Lx1/s3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final p:I

.field private final q:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/s3;->r:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/s3;->s:Ljava/lang/String;

    sget-object v0, Lx1/r3;->a:Lx1/r3;

    sput-object v0, Lx1/s3;->t:Lx1/h$a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Lx1/j3;-><init>()V

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "maxStars must be a positive integer"

    invoke-static {v0, v1}, Lu3/a;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lx1/s3;->p:I

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lx1/s3;->q:F

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 4

    invoke-direct {p0}, Lx1/j3;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "maxStars must be a positive integer"

    invoke-static {v2, v3}, Lu3/a;->b(ZLjava/lang/Object;)V

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

    invoke-static {v0, v1}, Lu3/a;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lx1/s3;->p:I

    iput p2, p0, Lx1/s3;->q:F

    return-void
.end method

.method public static synthetic c(Landroid/os/Bundle;)Lx1/s3;
    .locals 0

    invoke-static {p0}, Lx1/s3;->d(Landroid/os/Bundle;)Lx1/s3;

    move-result-object p0

    return-object p0
.end method

.method private static d(Landroid/os/Bundle;)Lx1/s3;
    .locals 3

    sget-object v0, Lx1/j3;->n:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu3/a;->a(Z)V

    sget-object v0, Lx1/s3;->r:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sget-object v1, Lx1/s3;->s:Ljava/lang/String;

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    cmpl-float v1, p0, v2

    if-nez v1, :cond_1

    new-instance p0, Lx1/s3;

    invoke-direct {p0, v0}, Lx1/s3;-><init>(I)V

    goto :goto_1

    :cond_1
    new-instance v1, Lx1/s3;

    invoke-direct {v1, v0, p0}, Lx1/s3;-><init>(IF)V

    move-object p0, v1

    :goto_1
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lx1/s3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lx1/s3;

    iget v0, p0, Lx1/s3;->p:I

    iget v2, p1, Lx1/s3;->p:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lx1/s3;->q:F

    iget p1, p1, Lx1/s3;->q:F

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

    iget v1, p0, Lx1/s3;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lx1/s3;->q:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lf5/j;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
