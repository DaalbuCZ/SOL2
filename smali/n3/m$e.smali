.class public final Ln3/m$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final r:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ln3/m$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:I

.field public final o:[I

.field public final p:I

.field public final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ln3/o;->a:Ln3/o;

    sput-object v0, Ln3/m$e;->r:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(I[II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ln3/m$e;->n:I

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    iput-object p1, p0, Ln3/m$e;->o:[I

    array-length p2, p2

    iput p2, p0, Ln3/m$e;->p:I

    iput p3, p0, Ln3/m$e;->q:I

    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ln3/m$e;
    .locals 0

    invoke-static {p0}, Ln3/m$e;->c(Landroid/os/Bundle;)Ln3/m$e;

    move-result-object p0

    return-object p0
.end method

.method private static b(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Landroid/os/Bundle;)Ln3/m$e;
    .locals 6

    const/4 v0, 0x0

    invoke-static {v0}, Ln3/m$e;->b(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v3, 0x1

    invoke-static {v3}, Ln3/m$e;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v4

    const/4 v5, 0x2

    invoke-static {v5}, Ln3/m$e;->b(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ltz v1, :cond_0

    if-ltz p0, :cond_0

    move v0, v3

    :cond_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    invoke-static {v4}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ln3/m$e;

    invoke-direct {v0, v1, v4, p0}, Ln3/m$e;-><init>(I[II)V

    return-object v0
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

    const-class v2, Ln3/m$e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ln3/m$e;

    iget v2, p0, Ln3/m$e;->n:I

    iget v3, p1, Ln3/m$e;->n:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ln3/m$e;->o:[I

    iget-object v3, p1, Ln3/m$e;->o:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ln3/m$e;->q:I

    iget p1, p1, Ln3/m$e;->q:I

    if-ne v2, p1, :cond_2

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

    iget v0, p0, Ln3/m$e;->n:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ln3/m$e;->o:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ln3/m$e;->q:I

    add-int/2addr v0, v1

    return v0
.end method