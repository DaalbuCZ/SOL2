.class public final Ls1/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# static fields
.field public static final q:Ls1/o;

.field public static final r:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/o;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:I

.field public final o:I

.field public final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls1/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Ls1/o;-><init>(III)V

    sput-object v0, Ls1/o;->q:Ls1/o;

    sget-object v0, Ls1/n;->a:Ls1/n;

    sput-object v0, Ls1/o;->r:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls1/o;->n:I

    iput p2, p0, Ls1/o;->o:I

    iput p3, p0, Ls1/o;->p:I

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/o;
    .locals 0

    invoke-static {p0}, Ls1/o;->c(Landroid/os/Bundle;)Ls1/o;

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

.method private static synthetic c(Landroid/os/Bundle;)Ls1/o;
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0}, Ls1/o;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v2}, Ls1/o;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x2

    invoke-static {v3}, Ls1/o;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    new-instance v0, Ls1/o;

    invoke-direct {v0, v1, v2, p0}, Ls1/o;-><init>(III)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls1/o;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls1/o;

    iget v1, p0, Ls1/o;->n:I

    iget v3, p1, Ls1/o;->n:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ls1/o;->o:I

    iget v3, p1, Ls1/o;->o:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ls1/o;->p:I

    iget p1, p1, Ls1/o;->p:I

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Ls1/o;->n:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Ls1/o;->o:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Ls1/o;->p:I

    add-int/2addr v1, v0

    return v1
.end method
