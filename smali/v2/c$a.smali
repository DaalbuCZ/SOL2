.class public final Lv2/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final u:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Lv2/c$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:J

.field public final o:I

.field public final p:[Landroid/net/Uri;

.field public final q:[I

.field public final r:[J

.field public final s:J

.field public final t:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lv2/b;->a:Lv2/b;

    sput-object v0, Lv2/c$a;->u:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 11

    const/4 v0, 0x0

    new-array v5, v0, [I

    new-array v6, v0, [Landroid/net/Uri;

    new-array v7, v0, [J

    const/4 v4, -0x1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v1 .. v10}, Lv2/c$a;-><init>(JI[I[Landroid/net/Uri;[JJZ)V

    return-void
.end method

.method private constructor <init>(JI[I[Landroid/net/Uri;[JJZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p4

    array-length v1, p5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    iput-wide p1, p0, Lv2/c$a;->n:J

    iput p3, p0, Lv2/c$a;->o:I

    iput-object p4, p0, Lv2/c$a;->q:[I

    iput-object p5, p0, Lv2/c$a;->p:[Landroid/net/Uri;

    iput-object p6, p0, Lv2/c$a;->r:[J

    iput-wide p7, p0, Lv2/c$a;->s:J

    iput-boolean p9, p0, Lv2/c$a;->t:Z

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lv2/c$a;
    .locals 0

    invoke-static {p0}, Lv2/c$a;->d(Landroid/os/Bundle;)Lv2/c$a;

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

.method private static d(Landroid/os/Bundle;)Lv2/c$a;
    .locals 12

    const/4 v0, 0x0

    invoke-static {v0}, Lv2/c$a;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    const/4 v1, 0x1

    invoke-static {v1}, Lv2/c$a;->h(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    const/4 v1, 0x2

    invoke-static {v1}, Lv2/c$a;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Lv2/c$a;->h(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v2

    const/4 v6, 0x4

    invoke-static {v6}, Lv2/c$a;->h(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Landroid/os/Bundle;->getLongArray(Ljava/lang/String;)[J

    move-result-object v6

    const/4 v7, 0x5

    invoke-static {v7}, Lv2/c$a;->h(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v9

    const/4 v7, 0x6

    invoke-static {v7}, Lv2/c$a;->h(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    new-instance p0, Lv2/c$a;

    if-nez v2, :cond_0

    new-array v2, v0, [I

    :cond_0
    move-object v7, v2

    if-nez v1, :cond_1

    new-array v1, v0, [Landroid/net/Uri;

    goto :goto_0

    :cond_1
    new-array v2, v0, [Landroid/net/Uri;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/net/Uri;

    :goto_0
    if-nez v6, :cond_2

    new-array v0, v0, [J

    move-object v8, v0

    goto :goto_1

    :cond_2
    move-object v8, v6

    :goto_1
    move-object v2, p0

    move-object v6, v7

    move-object v7, v1

    invoke-direct/range {v2 .. v11}, Lv2/c$a;-><init>(JI[I[Landroid/net/Uri;[JJZ)V

    return-object p0
.end method

.method private static h(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e()I
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lv2/c$a;->f(I)I

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

    const-class v2, Lv2/c$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lv2/c$a;

    iget-wide v2, p0, Lv2/c$a;->n:J

    iget-wide v4, p1, Lv2/c$a;->n:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lv2/c$a;->o:I

    iget v3, p1, Lv2/c$a;->o:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lv2/c$a;->p:[Landroid/net/Uri;

    iget-object v3, p1, Lv2/c$a;->p:[Landroid/net/Uri;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lv2/c$a;->q:[I

    iget-object v3, p1, Lv2/c$a;->q:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lv2/c$a;->r:[J

    iget-object v3, p1, Lv2/c$a;->r:[J

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lv2/c$a;->s:J

    iget-wide v4, p1, Lv2/c$a;->s:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lv2/c$a;->t:Z

    iget-boolean p1, p1, Lv2/c$a;->t:Z

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
    iget-object v1, p0, Lv2/c$a;->q:[I

    array-length v2, v1

    if-ge p1, v2, :cond_1

    iget-boolean v2, p0, Lv2/c$a;->t:Z

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

    iget v0, p0, Lv2/c$a;->o:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    iget v3, p0, Lv2/c$a;->o:I

    if-ge v2, v3, :cond_3

    iget-object v3, p0, Lv2/c$a;->q:[I

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

.method public hashCode()I
    .locals 6

    iget v0, p0, Lv2/c$a;->o:I

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lv2/c$a;->n:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv2/c$a;->p:[Landroid/net/Uri;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv2/c$a;->q:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv2/c$a;->r:[J

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lv2/c$a;->s:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lv2/c$a;->t:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public i()Z
    .locals 2

    iget v0, p0, Lv2/c$a;->o:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lv2/c$a;->e()I

    move-result v0

    iget v1, p0, Lv2/c$a;->o:I

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

.method public j(I)Lv2/c$a;
    .locals 11

    iget-object v0, p0, Lv2/c$a;->q:[I

    invoke-static {v0, p1}, Lv2/c$a;->c([II)[I

    move-result-object v5

    iget-object v0, p0, Lv2/c$a;->r:[J

    invoke-static {v0, p1}, Lv2/c$a;->b([JI)[J

    move-result-object v7

    iget-object v0, p0, Lv2/c$a;->p:[Landroid/net/Uri;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [Landroid/net/Uri;

    new-instance v0, Lv2/c$a;

    iget-wide v2, p0, Lv2/c$a;->n:J

    iget-wide v8, p0, Lv2/c$a;->s:J

    iget-boolean v10, p0, Lv2/c$a;->t:Z

    move-object v1, v0

    move v4, p1

    invoke-direct/range {v1 .. v10}, Lv2/c$a;-><init>(JI[I[Landroid/net/Uri;[JJZ)V

    return-object v0
.end method
