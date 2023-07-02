.class final Ll2/h;
.super Ll2/i;
.source ""


# static fields
.field private static final o:[B

.field private static final p:[B


# instance fields
.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Ll2/h;->o:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Ll2/h;->p:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x48t
        0x65t
        0x61t
        0x64t
    .end array-data

    :array_1
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x54t
        0x61t
        0x67t
        0x73t
    .end array-data
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll2/i;-><init>()V

    return-void
.end method

.method private static n(Lu3/a0;[B)Z
    .locals 4

    invoke-virtual {p0}, Lu3/a0;->a()I

    move-result v0

    array-length v1, p1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Lu3/a0;->f()I

    move-result v0

    array-length v1, p1

    new-array v1, v1, [B

    array-length v3, p1

    invoke-virtual {p0, v1, v2, v3}, Lu3/a0;->j([BII)V

    invoke-virtual {p0, v0}, Lu3/a0;->R(I)V

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method

.method public static o(Lu3/a0;)Z
    .locals 1

    sget-object v0, Ll2/h;->o:[B

    invoke-static {p0, v0}, Ll2/h;->n(Lu3/a0;[B)Z

    move-result p0

    return p0
.end method


# virtual methods
.method protected f(Lu3/a0;)J
    .locals 2

    invoke-virtual {p1}, Lu3/a0;->e()[B

    move-result-object p1

    invoke-static {p1}, Lz1/i0;->e([B)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll2/i;->c(J)J

    move-result-wide v0

    return-wide v0
.end method

.method protected i(Lu3/a0;JLl2/i$b;)Z
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "#3.format"
        }
        result = false
    .end annotation

    sget-object p2, Ll2/h;->o:[B

    invoke-static {p1, p2}, Ll2/h;->n(Lu3/a0;[B)Z

    move-result p2

    const/4 p3, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lu3/a0;->e()[B

    move-result-object p2

    invoke-virtual {p1}, Lu3/a0;->g()I

    move-result p1

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    invoke-static {p1}, Lz1/i0;->c([B)I

    move-result p2

    invoke-static {p1}, Lz1/i0;->a([B)Ljava/util/List;

    move-result-object p1

    iget-object v0, p4, Ll2/i$b;->a:Lx1/n1;

    if-eqz v0, :cond_0

    return p3

    :cond_0
    new-instance v0, Lx1/n1$b;

    invoke-direct {v0}, Lx1/n1$b;-><init>()V

    const-string v1, "audio/opus"

    invoke-virtual {v0, v1}, Lx1/n1$b;->g0(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v0

    invoke-virtual {v0, p2}, Lx1/n1$b;->J(I)Lx1/n1$b;

    move-result-object p2

    const v0, 0xbb80

    invoke-virtual {p2, v0}, Lx1/n1$b;->h0(I)Lx1/n1$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lx1/n1$b;->V(Ljava/util/List;)Lx1/n1$b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object p1

    iput-object p1, p4, Ll2/i$b;->a:Lx1/n1;

    return p3

    :cond_1
    sget-object p2, Ll2/h;->p:[B

    invoke-static {p1, p2}, Ll2/h;->n(Lu3/a0;[B)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p4, Ll2/i$b;->a:Lx1/n1;

    invoke-static {v0}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Ll2/h;->n:Z

    if-eqz v0, :cond_2

    return p3

    :cond_2
    iput-boolean p3, p0, Ll2/h;->n:Z

    array-length p2, p2

    invoke-virtual {p1, p2}, Lu3/a0;->S(I)V

    invoke-static {p1, v1, v1}, Lc2/h0;->j(Lu3/a0;ZZ)Lc2/h0$b;

    move-result-object p1

    iget-object p1, p1, Lc2/h0$b;->b:[Ljava/lang/String;

    invoke-static {p1}, Lg5/q;->G([Ljava/lang/Object;)Lg5/q;

    move-result-object p1

    invoke-static {p1}, Lc2/h0;->c(Ljava/util/List;)Lp2/a;

    move-result-object p1

    if-nez p1, :cond_3

    return p3

    :cond_3
    iget-object p2, p4, Ll2/i$b;->a:Lx1/n1;

    invoke-virtual {p2}, Lx1/n1;->b()Lx1/n1$b;

    move-result-object p2

    iget-object v0, p4, Ll2/i$b;->a:Lx1/n1;

    iget-object v0, v0, Lx1/n1;->w:Lp2/a;

    invoke-virtual {p1, v0}, Lp2/a;->b(Lp2/a;)Lp2/a;

    move-result-object p1

    invoke-virtual {p2, p1}, Lx1/n1$b;->Z(Lp2/a;)Lx1/n1$b;

    move-result-object p1

    goto :goto_0

    :cond_4
    iget-object p1, p4, Ll2/i$b;->a:Lx1/n1;

    invoke-static {p1}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return v1
.end method

.method protected l(Z)V
    .locals 0

    invoke-super {p0, p1}, Ll2/i;->l(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll2/h;->n:Z

    :cond_0
    return-void
.end method
