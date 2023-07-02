.class public final Lv3/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# static fields
.field public static final r:Lv3/z;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field private static final u:Ljava/lang/String;

.field private static final v:Ljava/lang/String;

.field public static final w:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Lv3/z;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv3/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lv3/z;-><init>(II)V

    sput-object v0, Lv3/z;->r:Lv3/z;

    invoke-static {v1}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/z;->s:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/z;->t:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/z;->u:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/z;->v:Ljava/lang/String;

    sget-object v0, Lv3/y;->a:Lv3/y;

    sput-object v0, Lv3/z;->w:Lx1/h$a;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p0, p1, p2, v0, v1}, Lv3/z;-><init>(IIIF)V

    return-void
.end method

.method public constructor <init>(IIIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv3/z;->n:I

    iput p2, p0, Lv3/z;->o:I

    iput p3, p0, Lv3/z;->p:I

    iput p4, p0, Lv3/z;->q:F

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lv3/z;
    .locals 0

    invoke-static {p0}, Lv3/z;->b(Landroid/os/Bundle;)Lv3/z;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Landroid/os/Bundle;)Lv3/z;
    .locals 5

    sget-object v0, Lv3/z;->s:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sget-object v2, Lv3/z;->t:Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    sget-object v3, Lv3/z;->u:Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    sget-object v3, Lv3/z;->v:Ljava/lang/String;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {p0, v3, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    new-instance v3, Lv3/z;

    invoke-direct {v3, v0, v2, v1, p0}, Lv3/z;-><init>(IIIF)V

    return-object v3
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv3/z;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lv3/z;

    iget v1, p0, Lv3/z;->n:I

    iget v3, p1, Lv3/z;->n:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lv3/z;->o:I

    iget v3, p1, Lv3/z;->o:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lv3/z;->p:I

    iget v3, p1, Lv3/z;->p:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lv3/z;->q:F

    iget p1, p1, Lv3/z;->q:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lv3/z;->n:I

    const/16 v1, 0xd9

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lv3/z;->o:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lv3/z;->p:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lv3/z;->q:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method
