.class public final La3/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final A:Ljava/lang/String;

.field private static final B:Ljava/lang/String;

.field private static final C:Ljava/lang/String;

.field public static final D:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "La3/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final v:Ljava/lang/String;

.field private static final w:Ljava/lang/String;

.field private static final x:Ljava/lang/String;

.field private static final y:Ljava/lang/String;

.field private static final z:Ljava/lang/String;


# instance fields
.field public final n:J

.field public final o:I

.field public final p:I

.field public final q:[Landroid/net/Uri;

.field public final r:[I

.field public final s:[J

.field public final t:J

.field public final u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La3/c$a;->v:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La3/c$a;->w:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La3/c$a;->x:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La3/c$a;->y:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La3/c$a;->z:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La3/c$a;->A:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La3/c$a;->B:Ljava/lang/String;

    const/4 v0, 0x7

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La3/c$a;->C:Ljava/lang/String;

    sget-object v0, La3/b;->a:La3/b;

    sput-object v0, La3/c$a;->D:Lx1/h$a;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 12

    const/4 v0, 0x0

    new-array v6, v0, [I

    new-array v7, v0, [Landroid/net/Uri;

    new-array v8, v0, [J

    const/4 v4, -0x1

    const/4 v5, -0x1

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v1 .. v11}, La3/c$a;-><init>(JII[I[Landroid/net/Uri;[JJZ)V

    return-void
.end method

.method private constructor <init>(JII[I[Landroid/net/Uri;[JJZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p5

    array-length v1, p6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu3/a;->a(Z)V

    iput-wide p1, p0, La3/c$a;->n:J

    iput p3, p0, La3/c$a;->o:I

    iput p4, p0, La3/c$a;->p:I

    iput-object p5, p0, La3/c$a;->r:[I

    iput-object p6, p0, La3/c$a;->q:[Landroid/net/Uri;

    iput-object p7, p0, La3/c$a;->s:[J

    iput-wide p8, p0, La3/c$a;->t:J

    iput-boolean p10, p0, La3/c$a;->u:Z

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)La3/c$a;
    .locals 0

    invoke-static {p0}, La3/c$a;->d(Landroid/os/Bundle;)La3/c$a;

    move-result-object p0

    return-object p0
.end method

.method private static b([JI)[J
    .locals 3

    array-length v0, p0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {p0, v0, p1, v1, v2}, Ljava/util/Arrays;->fill([JIIJ)V

    return-object p0
.end method

.method private static c([II)[I
    .locals 2

    array-length v0, p0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {p0, v0, p1, v1}, Ljava/util/Arrays;->fill([IIII)V

    return-object p0
.end method

.method private static d(Landroid/os/Bundle;)La3/c$a;
    .locals 13

    sget-object v0, La3/c$a;->v:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    sget-object v0, La3/c$a;->w:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    sget-object v0, La3/c$a;->C:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    sget-object v0, La3/c$a;->x:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v1, La3/c$a;->y:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v1

    sget-object v6, La3/c$a;->z:Ljava/lang/String;

    invoke-virtual {p0, v6}, Landroid/os/Bundle;->getLongArray(Ljava/lang/String;)[J

    move-result-object v6

    sget-object v7, La3/c$a;->A:Ljava/lang/String;

    invoke-virtual {p0, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v9

    sget-object v7, La3/c$a;->B:Ljava/lang/String;

    invoke-virtual {p0, v7}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    new-instance p0, La3/c$a;

    const/4 v7, 0x0

    if-nez v1, :cond_0

    new-array v1, v7, [I

    :cond_0
    move-object v8, v1

    if-nez v0, :cond_1

    new-array v0, v7, [Landroid/net/Uri;

    goto :goto_0

    :cond_1
    new-array v1, v7, [Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/net/Uri;

    :goto_0
    if-nez v6, :cond_2

    new-array v1, v7, [J

    move-object v12, v1

    goto :goto_1

    :cond_2
    move-object v12, v6

    :goto_1
    move-object v1, p0

    move-object v6, v8

    move-object v7, v0

    move-object v8, v12

    invoke-direct/range {v1 .. v11}, La3/c$a;-><init>(JII[I[Landroid/net/Uri;[JJZ)V

    return-object p0
.end method


# virtual methods
.method public e()I
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, La3/c$a;->f(I)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, La3/c$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, La3/c$a;

    iget-wide v2, p0, La3/c$a;->n:J

    iget-wide v4, p1, La3/c$a;->n:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, La3/c$a;->o:I

    iget v3, p1, La3/c$a;->o:I

    if-ne v2, v3, :cond_2

    iget v2, p0, La3/c$a;->p:I

    iget v3, p1, La3/c$a;->p:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, La3/c$a;->q:[Landroid/net/Uri;

    iget-object v3, p1, La3/c$a;->q:[Landroid/net/Uri;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, La3/c$a;->r:[I

    iget-object v3, p1, La3/c$a;->r:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, La3/c$a;->s:[J

    iget-object v3, p1, La3/c$a;->s:[J

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, La3/c$a;->t:J

    iget-wide v4, p1, La3/c$a;->t:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, La3/c$a;->u:Z

    iget-boolean p1, p1, La3/c$a;->u:Z

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

.method public f(I)I
    .locals 3

    const/4 v0, 0x1

    add-int/2addr p1, v0

    :goto_0
    iget-object v1, p0, La3/c$a;->r:[I

    array-length v2, v1

    if-ge p1, v2, :cond_1

    iget-boolean v2, p0, La3/c$a;->u:Z

    if-nez v2, :cond_1

    aget v2, v1, p1

    if-eqz v2, :cond_1

    aget v1, v1, p1

    if-ne v1, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return p1
.end method

.method public g()Z
    .locals 5

    iget v0, p0, La3/c$a;->o:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    iget v3, p0, La3/c$a;->o:I

    if-ge v2, v3, :cond_3

    iget-object v3, p0, La3/c$a;->r:[I

    aget v4, v3, v2

    if-eqz v4, :cond_2

    aget v3, v3, v2

    if-ne v3, v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1

    :cond_3
    return v0
.end method

.method public h()Z
    .locals 2

    iget v0, p0, La3/c$a;->o:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, La3/c$a;->e()I

    move-result v0

    iget v1, p0, La3/c$a;->o:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public hashCode()I
    .locals 6

    iget v0, p0, La3/c$a;->o:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, La3/c$a;->p:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, La3/c$a;->n:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, La3/c$a;->q:[Landroid/net/Uri;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, La3/c$a;->r:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, La3/c$a;->s:[J

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, La3/c$a;->t:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, La3/c$a;->u:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public i(I)La3/c$a;
    .locals 12

    iget-object v0, p0, La3/c$a;->r:[I

    invoke-static {v0, p1}, La3/c$a;->c([II)[I

    move-result-object v6

    iget-object v0, p0, La3/c$a;->s:[J

    invoke-static {v0, p1}, La3/c$a;->b([JI)[J

    move-result-object v8

    iget-object v0, p0, La3/c$a;->q:[Landroid/net/Uri;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, [Landroid/net/Uri;

    new-instance v0, La3/c$a;

    iget-wide v2, p0, La3/c$a;->n:J

    iget v5, p0, La3/c$a;->p:I

    iget-wide v9, p0, La3/c$a;->t:J

    iget-boolean v11, p0, La3/c$a;->u:Z

    move-object v1, v0

    move v4, p1

    invoke-direct/range {v1 .. v11}, La3/c$a;-><init>(JII[I[Landroid/net/Uri;[JJZ)V

    return-object v0
.end method
