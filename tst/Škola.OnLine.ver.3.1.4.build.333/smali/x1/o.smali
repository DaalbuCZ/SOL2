.class public final Lx1/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# static fields
.field public static final q:Lx1/o;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field public static final u:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Lx1/o;",
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

    new-instance v0, Lx1/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lx1/o;-><init>(III)V

    sput-object v0, Lx1/o;->q:Lx1/o;

    invoke-static {v1}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/o;->r:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/o;->s:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/o;->t:Ljava/lang/String;

    sget-object v0, Lx1/n;->a:Lx1/n;

    sput-object v0, Lx1/o;->u:Lx1/h$a;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx1/o;->n:I

    iput p2, p0, Lx1/o;->o:I

    iput p3, p0, Lx1/o;->p:I

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lx1/o;
    .locals 0

    invoke-static {p0}, Lx1/o;->b(Landroid/os/Bundle;)Lx1/o;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Landroid/os/Bundle;)Lx1/o;
    .locals 4

    sget-object v0, Lx1/o;->r:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sget-object v2, Lx1/o;->s:Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    sget-object v3, Lx1/o;->t:Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    new-instance v1, Lx1/o;

    invoke-direct {v1, v0, v2, p0}, Lx1/o;-><init>(III)V

    return-object v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx1/o;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lx1/o;

    iget v1, p0, Lx1/o;->n:I

    iget v3, p1, Lx1/o;->n:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Lx1/o;->o:I

    iget v3, p1, Lx1/o;->o:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Lx1/o;->p:I

    iget p1, p1, Lx1/o;->p:I

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lx1/o;->n:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lx1/o;->o:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lx1/o;->p:I

    add-int/2addr v1, v0

    return v1
.end method
