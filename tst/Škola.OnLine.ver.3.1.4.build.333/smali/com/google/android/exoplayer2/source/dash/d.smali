.class final Lcom/google/android/exoplayer2/source/dash/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/n0;


# instance fields
.field private final n:Lx1/n1;

.field private final o:Lr2/c;

.field private p:[J

.field private q:Z

.field private r:Ld3/f;

.field private s:Z

.field private t:I

.field private u:J


# direct methods
.method public constructor <init>(Ld3/f;Lx1/n1;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->n:Lx1/n1;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:Ld3/f;

    new-instance p2, Lr2/c;

    invoke-direct {p2}, Lr2/c;-><init>()V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->o:Lr2/c;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->u:J

    iget-object p2, p1, Ld3/f;->b:[J

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->p:[J

    invoke-virtual {p0, p1, p3}, Lcom/google/android/exoplayer2/source/dash/d;->e(Ld3/f;Z)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:Ld3/f;

    invoke-virtual {v0}, Ld3/f;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(J)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->p:[J

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, p2, v1, v2}, Lu3/n0;->e([JJZZ)I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->t:I

    iget-boolean v3, p0, Lcom/google/android/exoplayer2/source/dash/d;->q:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/d;->p:[J

    array-length v3, v3

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->u:J

    return-void
.end method

.method public d(J)I
    .locals 4

    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->t:I

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/d;->p:[J

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, p1, p2, v2, v3}, Lu3/n0;->e([JJZZ)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->t:I

    sub-int p2, p1, p2

    iput p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->t:I

    return p2
.end method

.method public e(Ld3/f;Z)V
    .locals 8

    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->t:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-wide v4, v1

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/d;->p:[J

    add-int/lit8 v0, v0, -0x1

    aget-wide v4, v3, v0

    :goto_0
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->q:Z

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:Ld3/f;

    iget-object p1, p1, Ld3/f;->b:[J

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->p:[J

    iget-wide v6, p0, Lcom/google/android/exoplayer2/source/dash/d;->u:J

    cmp-long p2, v6, v1

    if-eqz p2, :cond_1

    invoke-virtual {p0, v6, v7}, Lcom/google/android/exoplayer2/source/dash/d;->c(J)V

    goto :goto_1

    :cond_1
    cmp-long p2, v4, v1

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    invoke-static {p1, v4, v5, p2, p2}, Lu3/n0;->e([JJZZ)I

    move-result p1

    iput p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->t:I

    :cond_2
    :goto_1
    return-void
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public p(Lx1/o1;La2/g;I)I
    .locals 6

    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->t:I

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/d;->p:[J

    array-length v1, v1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, -0x4

    const/4 v4, 0x4

    if-eqz v1, :cond_1

    iget-boolean v5, p0, Lcom/google/android/exoplayer2/source/dash/d;->q:Z

    if-nez v5, :cond_1

    invoke-virtual {p2, v4}, La2/a;->w(I)V

    return v3

    :cond_1
    and-int/lit8 v5, p3, 0x2

    if-nez v5, :cond_6

    iget-boolean v5, p0, Lcom/google/android/exoplayer2/source/dash/d;->s:Z

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p1, -0x3

    return p1

    :cond_3
    and-int/lit8 p1, p3, 0x1

    if-nez p1, :cond_4

    add-int/lit8 p1, v0, 0x1

    iput p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->t:I

    :cond_4
    and-int/lit8 p1, p3, 0x4

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->o:Lr2/c;

    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:Ld3/f;

    iget-object p3, p3, Ld3/f;->a:[Lr2/a;

    aget-object p3, p3, v0

    invoke-virtual {p1, p3}, Lr2/c;->a(Lr2/a;)[B

    move-result-object p1

    array-length p3, p1

    invoke-virtual {p2, p3}, La2/g;->y(I)V

    iget-object p3, p2, La2/g;->p:Ljava/nio/ByteBuffer;

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :cond_5
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->p:[J

    aget-wide v0, p1, v0

    iput-wide v0, p2, La2/g;->r:J

    invoke-virtual {p2, v2}, La2/a;->w(I)V

    return v3

    :cond_6
    :goto_1
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->n:Lx1/n1;

    iput-object p2, p1, Lx1/o1;->b:Lx1/n1;

    iput-boolean v2, p0, Lcom/google/android/exoplayer2/source/dash/d;->s:Z

    const/4 p1, -0x5

    return p1
.end method
