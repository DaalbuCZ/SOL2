.class public final Ls1/q3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/q3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final s:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/q3$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:I

.field private final o:Lu2/t0;

.field private final p:Z

.field private final q:[I

.field private final r:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ls1/p3;->a:Ls1/p3;

    sput-object v0, Ls1/q3$a;->s:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(Lu2/t0;Z[I[Z)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lu2/t0;->n:I

    iput v0, p0, Ls1/q3$a;->n:I

    array-length v1, p3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    array-length v1, p4

    if-ne v0, v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v1}, Lp3/a;->a(Z)V

    iput-object p1, p0, Ls1/q3$a;->o:Lu2/t0;

    if-eqz p2, :cond_1

    if-le v0, v3, :cond_1

    move v2, v3

    :cond_1
    iput-boolean v2, p0, Ls1/q3$a;->p:Z

    invoke-virtual {p3}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Ls1/q3$a;->q:[I

    invoke-virtual {p4}, [Z->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Z

    iput-object p1, p0, Ls1/q3$a;->r:[Z

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/q3$a;
    .locals 0

    invoke-static {p0}, Ls1/q3$a;->g(Landroid/os/Bundle;)Ls1/q3$a;

    move-result-object p0

    return-object p0
.end method

.method private static f(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic g(Landroid/os/Bundle;)Ls1/q3$a;
    .locals 5

    sget-object v0, Lu2/t0;->s:Ls1/h$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ls1/q3$a;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {v2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    invoke-interface {v0, v2}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v0

    check-cast v0, Lu2/t0;

    const/4 v2, 0x1

    invoke-static {v2}, Ls1/q3$a;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v2

    iget v3, v0, Lu2/t0;->n:I

    new-array v3, v3, [I

    invoke-static {v2, v3}, La5/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    const/4 v3, 0x3

    invoke-static {v3}, Ls1/q3$a;->f(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroid/os/Bundle;->getBooleanArray(Ljava/lang/String;)[Z

    move-result-object v3

    iget v4, v0, Lu2/t0;->n:I

    new-array v4, v4, [Z

    invoke-static {v3, v4}, La5/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Z

    const/4 v4, 0x4

    invoke-static {v4}, Ls1/q3$a;->f(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    new-instance v1, Ls1/q3$a;

    invoke-direct {v1, v0, p0, v2, v3}, Ls1/q3$a;-><init>(Lu2/t0;Z[I[Z)V

    return-object v1
.end method


# virtual methods
.method public b(I)Ls1/m1;
    .locals 1

    iget-object v0, p0, Ls1/q3$a;->o:Lu2/t0;

    invoke-virtual {v0, p1}, Lu2/t0;->b(I)Ls1/m1;

    move-result-object p1

    return-object p1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Ls1/q3$a;->o:Lu2/t0;

    iget v0, v0, Lu2/t0;->p:I

    return v0
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Ls1/q3$a;->r:[Z

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ld5/a;->b([ZZ)Z

    move-result v0

    return v0
.end method

.method public e(I)Z
    .locals 1

    iget-object v0, p0, Ls1/q3$a;->r:[Z

    aget-boolean p1, v0, p1

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

    const-class v2, Ls1/q3$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls1/q3$a;

    iget-boolean v2, p0, Ls1/q3$a;->p:Z

    iget-boolean v3, p1, Ls1/q3$a;->p:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ls1/q3$a;->o:Lu2/t0;

    iget-object v3, p1, Ls1/q3$a;->o:Lu2/t0;

    invoke-virtual {v2, v3}, Lu2/t0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/q3$a;->q:[I

    iget-object v3, p1, Ls1/q3$a;->q:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/q3$a;->r:[Z

    iget-object p1, p1, Ls1/q3$a;->r:[Z

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Z[Z)Z

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
    .locals 2

    iget-object v0, p0, Ls1/q3$a;->o:Lu2/t0;

    invoke-virtual {v0}, Lu2/t0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls1/q3$a;->p:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/q3$a;->q:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/q3$a;->r:[Z

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
