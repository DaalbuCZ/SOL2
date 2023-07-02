.class public final Ls3/m$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field public static final u:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Ls3/m$e;",
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

    const/4 v0, 0x0

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/m$e;->r:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/m$e;->s:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/m$e;->t:Ljava/lang/String;

    sget-object v0, Ls3/o;->a:Ls3/o;

    sput-object v0, Ls3/m$e;->u:Lx1/h$a;

    return-void
.end method

.method public constructor <init>(I[II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls3/m$e;->n:I

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    iput-object p1, p0, Ls3/m$e;->o:[I

    array-length p2, p2

    iput p2, p0, Ls3/m$e;->p:I

    iput p3, p0, Ls3/m$e;->q:I

    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/m$e;
    .locals 0

    invoke-static {p0}, Ls3/m$e;->b(Landroid/os/Bundle;)Ls3/m$e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Landroid/os/Bundle;)Ls3/m$e;
    .locals 4

    sget-object v0, Ls3/m$e;->r:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sget-object v2, Ls3/m$e;->s:Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v2

    sget-object v3, Ls3/m$e;->t:Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ltz v0, :cond_0

    if-ltz p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lu3/a;->a(Z)V

    invoke-static {v2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ls3/m$e;

    invoke-direct {v1, v0, v2, p0}, Ls3/m$e;-><init>(I[II)V

    return-object v1
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

    const-class v2, Ls3/m$e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls3/m$e;

    iget v2, p0, Ls3/m$e;->n:I

    iget v3, p1, Ls3/m$e;->n:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ls3/m$e;->o:[I

    iget-object v3, p1, Ls3/m$e;->o:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ls3/m$e;->q:I

    iget p1, p1, Ls3/m$e;->q:I

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

    iget v0, p0, Ls3/m$e;->n:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/m$e;->o:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls3/m$e;->q:I

    add-int/2addr v0, v1

    return v0
.end method
