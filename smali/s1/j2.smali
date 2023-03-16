.class public final Ls1/j2;
.super Ls1/w2;
.source ""


# static fields
.field public static final p:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/j2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final o:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ls1/i2;->a:Ls1/i2;

    sput-object v0, Ls1/j2;->p:Ls1/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ls1/w2;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Ls1/j2;->o:F

    return-void
.end method

.method public constructor <init>(F)V
    .locals 2

    invoke-direct {p0}, Ls1/w2;-><init>()V

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42c80000    # 100.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "percent must be in the range of [0, 100]"

    invoke-static {v0, v1}, Lp3/a;->b(ZLjava/lang/Object;)V

    iput p1, p0, Ls1/j2;->o:F

    return-void
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/os/Bundle;)Ls1/j2;
    .locals 0

    invoke-static {p0}, Ls1/j2;->e(Landroid/os/Bundle;)Ls1/j2;

    move-result-object p0

    return-object p0
.end method

.method private static e(Landroid/os/Bundle;)Ls1/j2;
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Ls1/j2;->c(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    move v0, v2

    :cond_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    invoke-static {v2}, Ls1/j2;->c(I)Ljava/lang/String;

    move-result-object v0

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    cmpl-float v0, p0, v1

    if-nez v0, :cond_1

    new-instance p0, Ls1/j2;

    invoke-direct {p0}, Ls1/j2;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Ls1/j2;

    invoke-direct {v0, p0}, Ls1/j2;-><init>(F)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ls1/j2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Ls1/j2;->o:F

    check-cast p1, Ls1/j2;

    iget p1, p1, Ls1/j2;->o:F

    cmpl-float p1, v0, p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Ls1/j2;->o:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, La5/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
