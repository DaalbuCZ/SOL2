.class public final Lw3/b;
.super Lx1/f;
.source ""


# instance fields
.field private final A:La2/g;

.field private final B:Lu3/a0;

.field private C:J

.field private D:Lw3/a;

.field private E:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lx1/f;-><init>(I)V

    new-instance v0, La2/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La2/g;-><init>(I)V

    iput-object v0, p0, Lw3/b;->A:La2/g;

    new-instance v0, Lu3/a0;

    invoke-direct {v0}, Lu3/a0;-><init>()V

    iput-object v0, p0, Lw3/b;->B:Lu3/a0;

    return-void
.end method

.method private T(Ljava/nio/ByteBuffer;)[F
    .locals 3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lw3/b;->B:Lu3/a0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lu3/a0;->P([BI)V

    iget-object v0, p0, Lw3/b;->B:Lu3/a0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int/lit8 p1, p1, 0x4

    invoke-virtual {v0, p1}, Lu3/a0;->R(I)V

    const/4 p1, 0x3

    new-array v0, p1, [F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    iget-object v2, p0, Lw3/b;->B:Lu3/a0;

    invoke-virtual {v2}, Lu3/a0;->r()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private U()V
    .locals 1

    iget-object v0, p0, Lw3/b;->D:Lw3/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lw3/a;->b()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected J()V
    .locals 0

    invoke-direct {p0}, Lw3/b;->U()V

    return-void
.end method

.method protected L(JZ)V
    .locals 0

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lw3/b;->E:J

    invoke-direct {p0}, Lw3/b;->U()V

    return-void
.end method

.method protected P([Lx1/n1;JJ)V
    .locals 0

    iput-wide p4, p0, Lw3/b;->C:J

    return-void
.end method

.method public a(Lx1/n1;)I
    .locals 1

    iget-object p1, p1, Lx1/n1;->y:Ljava/lang/String;

    const-string v0, "application/x-camera-motion"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lx1/m3;->a(I)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    invoke-virtual {p0}, Lx1/f;->l()Z

    move-result v0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "CameraMotionRenderer"

    return-object v0
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public n(JJ)V
    .locals 4

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lx1/f;->l()Z

    move-result p3

    if-nez p3, :cond_4

    iget-wide p3, p0, Lw3/b;->E:J

    const-wide/32 v0, 0x186a0

    add-long/2addr v0, p1

    cmp-long p3, p3, v0

    if-gez p3, :cond_4

    iget-object p3, p0, Lw3/b;->A:La2/g;

    invoke-virtual {p3}, La2/g;->n()V

    invoke-virtual {p0}, Lx1/f;->E()Lx1/o1;

    move-result-object p3

    iget-object p4, p0, Lw3/b;->A:La2/g;

    const/4 v0, 0x0

    invoke-virtual {p0, p3, p4, v0}, Lx1/f;->Q(Lx1/o1;La2/g;I)I

    move-result p3

    const/4 p4, -0x4

    if-ne p3, p4, :cond_4

    iget-object p3, p0, Lw3/b;->A:La2/g;

    invoke-virtual {p3}, La2/a;->t()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    iget-object p3, p0, Lw3/b;->A:La2/g;

    iget-wide v0, p3, La2/g;->r:J

    iput-wide v0, p0, Lw3/b;->E:J

    iget-object p4, p0, Lw3/b;->D:Lw3/a;

    if-eqz p4, :cond_0

    invoke-virtual {p3}, La2/a;->s()Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    iget-object p3, p0, Lw3/b;->A:La2/g;

    invoke-virtual {p3}, La2/g;->z()V

    iget-object p3, p0, Lw3/b;->A:La2/g;

    iget-object p3, p3, La2/g;->p:Ljava/nio/ByteBuffer;

    invoke-static {p3}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/nio/ByteBuffer;

    invoke-direct {p0, p3}, Lw3/b;->T(Ljava/nio/ByteBuffer;)[F

    move-result-object p3

    if-nez p3, :cond_3

    goto :goto_0

    :cond_3
    iget-object p4, p0, Lw3/b;->D:Lw3/a;

    invoke-static {p4}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lw3/a;

    iget-wide v0, p0, Lw3/b;->E:J

    iget-wide v2, p0, Lw3/b;->C:J

    sub-long/2addr v0, v2

    invoke-interface {p4, v0, v1, p3}, Lw3/a;->a(J[F)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public o(ILjava/lang/Object;)V
    .locals 1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    check-cast p2, Lw3/a;

    iput-object p2, p0, Lw3/b;->D:Lw3/a;

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Lx1/f;->o(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
