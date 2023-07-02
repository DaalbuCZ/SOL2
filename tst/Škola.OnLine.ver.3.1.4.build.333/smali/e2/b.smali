.class public final Le2/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/b$c;,
        Le2/b$b;
    }
.end annotation


# instance fields
.field private final a:Lu3/a0;

.field private final b:Le2/b$c;

.field private c:I

.field private d:Lc2/n;

.field private e:Le2/c;

.field private f:J

.field private g:[Le2/e;

.field private h:J

.field private i:Le2/e;

.field private j:I

.field private k:J

.field private l:J

.field private m:I

.field private n:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lu3/a0;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lu3/a0;-><init>(I)V

    iput-object v0, p0, Le2/b;->a:Lu3/a0;

    new-instance v0, Le2/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le2/b$c;-><init>(Le2/b$a;)V

    iput-object v0, p0, Le2/b;->b:Le2/b$c;

    new-instance v0, Lc2/j;

    invoke-direct {v0}, Lc2/j;-><init>()V

    iput-object v0, p0, Le2/b;->d:Lc2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Le2/e;

    iput-object v0, p0, Le2/b;->g:[Le2/e;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Le2/b;->k:J

    iput-wide v0, p0, Le2/b;->l:J

    const/4 v0, -0x1

    iput v0, p0, Le2/b;->j:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Le2/b;->f:J

    return-void
.end method

.method static synthetic d(Le2/b;)[Le2/e;
    .locals 0

    iget-object p0, p0, Le2/b;->g:[Le2/e;

    return-object p0
.end method

.method private static e(Lc2/m;)V
    .locals 4

    invoke-interface {p0}, Lc2/m;->q()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lc2/m;->j(I)V

    :cond_0
    return-void
.end method

.method private f(I)Le2/e;
    .locals 5

    iget-object v0, p0, Le2/b;->g:[Le2/e;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Le2/e;->j(I)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private h(Lu3/a0;)V
    .locals 6

    const v0, 0x6c726468

    invoke-static {v0, p1}, Le2/f;->c(ILu3/a0;)Le2/f;

    move-result-object p1

    invoke-virtual {p1}, Le2/f;->getType()I

    move-result v1

    const/4 v2, 0x0

    if-ne v1, v0, :cond_4

    const-class v0, Le2/c;

    invoke-virtual {p1, v0}, Le2/f;->b(Ljava/lang/Class;)Le2/a;

    move-result-object v0

    check-cast v0, Le2/c;

    if-eqz v0, :cond_3

    iput-object v0, p0, Le2/b;->e:Le2/c;

    iget v1, v0, Le2/c;->c:I

    int-to-long v1, v1

    iget v0, v0, Le2/c;->a:I

    int-to-long v3, v0

    mul-long/2addr v1, v3

    iput-wide v1, p0, Le2/b;->f:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, Le2/f;->a:Lg5/q;

    invoke-virtual {p1}, Lg5/q;->v()Lg5/s0;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le2/a;

    invoke-interface {v3}, Le2/a;->getType()I

    move-result v4

    const v5, 0x6c727473

    if-ne v4, v5, :cond_0

    check-cast v3, Le2/f;

    add-int/lit8 v4, v2, 0x1

    invoke-direct {p0, v3, v2}, Le2/b;->l(Le2/f;I)Le2/e;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    move v2, v4

    goto :goto_0

    :cond_2
    new-array p1, v1, [Le2/e;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Le2/e;

    iput-object p1, p0, Le2/b;->g:[Le2/e;

    iget-object p1, p0, Le2/b;->d:Lc2/n;

    invoke-interface {p1}, Lc2/n;->i()V

    return-void

    :cond_3
    const-string p1, "AviHeader not found"

    invoke-static {p1, v2}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected header list type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le2/f;->getType()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1
.end method

.method private i(Lu3/a0;)V
    .locals 7

    invoke-direct {p0, p1}, Le2/b;->k(Lu3/a0;)J

    move-result-wide v0

    :goto_0
    invoke-virtual {p1}, Lu3/a0;->a()I

    move-result v2

    const/16 v3, 0x10

    if-lt v2, v3, :cond_2

    invoke-virtual {p1}, Lu3/a0;->r()I

    move-result v2

    invoke-virtual {p1}, Lu3/a0;->r()I

    move-result v4

    invoke-virtual {p1}, Lu3/a0;->r()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v5, v0

    invoke-virtual {p1}, Lu3/a0;->r()I

    invoke-direct {p0, v2}, Le2/b;->f(I)Le2/e;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    and-int/2addr v4, v3

    if-ne v4, v3, :cond_1

    invoke-virtual {v2, v5, v6}, Le2/e;->b(J)V

    :cond_1
    invoke-virtual {v2}, Le2/e;->k()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Le2/b;->g:[Le2/e;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    aget-object v2, p1, v1

    invoke-virtual {v2}, Le2/e;->c()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    iput-boolean p1, p0, Le2/b;->n:Z

    iget-object p1, p0, Le2/b;->d:Lc2/n;

    new-instance v0, Le2/b$b;

    iget-wide v1, p0, Le2/b;->f:J

    invoke-direct {v0, p0, v1, v2}, Le2/b$b;-><init>(Le2/b;J)V

    invoke-interface {p1, v0}, Lc2/n;->p(Lc2/b0;)V

    return-void
.end method

.method private k(Lu3/a0;)J
    .locals 7

    invoke-virtual {p1}, Lu3/a0;->a()I

    move-result v0

    const-wide/16 v1, 0x0

    const/16 v3, 0x10

    if-ge v0, v3, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {p1}, Lu3/a0;->f()I

    move-result v0

    const/16 v3, 0x8

    invoke-virtual {p1, v3}, Lu3/a0;->S(I)V

    invoke-virtual {p1}, Lu3/a0;->r()I

    move-result v3

    int-to-long v3, v3

    iget-wide v5, p0, Le2/b;->k:J

    cmp-long v3, v3, v5

    if-lez v3, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x8

    add-long/2addr v1, v5

    :goto_0
    invoke-virtual {p1, v0}, Lu3/a0;->R(I)V

    return-wide v1
.end method

.method private l(Le2/f;I)Le2/e;
    .locals 13

    const-class v0, Le2/d;

    invoke-virtual {p1, v0}, Le2/f;->b(Ljava/lang/Class;)Le2/a;

    move-result-object v0

    check-cast v0, Le2/d;

    const-class v1, Le2/g;

    invoke-virtual {p1, v1}, Le2/f;->b(Ljava/lang/Class;)Le2/a;

    move-result-object v1

    check-cast v1, Le2/g;

    const-string v2, "AviExtractor"

    const/4 v3, 0x0

    if-nez v0, :cond_0

    const-string p1, "Missing Stream Header"

    :goto_0
    invoke-static {v2, p1}, Lu3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_0
    if-nez v1, :cond_1

    const-string p1, "Missing Stream Format"

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Le2/d;->a()J

    move-result-wide v11

    iget-object v1, v1, Le2/g;->a:Lx1/n1;

    invoke-virtual {v1}, Lx1/n1;->b()Lx1/n1$b;

    move-result-object v2

    invoke-virtual {v2, p2}, Lx1/n1$b;->T(I)Lx1/n1$b;

    iget v4, v0, Le2/d;->f:I

    if-eqz v4, :cond_2

    invoke-virtual {v2, v4}, Lx1/n1$b;->Y(I)Lx1/n1$b;

    :cond_2
    const-class v4, Le2/h;

    invoke-virtual {p1, v4}, Le2/f;->b(Ljava/lang/Class;)Le2/a;

    move-result-object p1

    check-cast p1, Le2/h;

    if-eqz p1, :cond_3

    iget-object p1, p1, Le2/h;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lx1/n1$b;->W(Ljava/lang/String;)Lx1/n1$b;

    :cond_3
    iget-object p1, v1, Lx1/n1;->y:Ljava/lang/String;

    invoke-static {p1}, Lu3/v;->k(Ljava/lang/String;)I

    move-result v6

    const/4 p1, 0x1

    if-eq v6, p1, :cond_5

    const/4 p1, 0x2

    if-ne v6, p1, :cond_4

    goto :goto_1

    :cond_4
    return-object v3

    :cond_5
    :goto_1
    iget-object p1, p0, Le2/b;->d:Lc2/n;

    invoke-interface {p1, p2, v6}, Lc2/n;->d(II)Lc2/e0;

    move-result-object v10

    invoke-virtual {v2}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object p1

    invoke-interface {v10, p1}, Lc2/e0;->a(Lx1/n1;)V

    new-instance p1, Le2/e;

    iget v9, v0, Le2/d;->e:I

    move-object v4, p1

    move v5, p2

    move-wide v7, v11

    invoke-direct/range {v4 .. v10}, Le2/e;-><init>(IIJILc2/e0;)V

    iput-wide v11, p0, Le2/b;->f:J

    return-object p1
.end method

.method private m(Lc2/m;)I
    .locals 7

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v0

    iget-wide v2, p0, Le2/b;->l:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Le2/b;->i:Le2/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Le2/e;->m(Lc2/m;)Z

    move-result p1

    if-eqz p1, :cond_6

    const/4 p1, 0x0

    iput-object p1, p0, Le2/b;->i:Le2/e;

    goto :goto_1

    :cond_1
    invoke-static {p1}, Le2/b;->e(Lc2/m;)V

    iget-object v0, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    const/16 v2, 0xc

    invoke-interface {p1, v0, v1, v2}, Lc2/m;->o([BII)V

    iget-object v0, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {v0, v1}, Lu3/a0;->R(I)V

    iget-object v0, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->r()I

    move-result v0

    const v3, 0x5453494c

    const/16 v4, 0x8

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {v0, v4}, Lu3/a0;->R(I)V

    iget-object v0, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->r()I

    move-result v0

    const v3, 0x69766f6d

    if-ne v0, v3, :cond_2

    goto :goto_0

    :cond_2
    move v2, v4

    :goto_0
    invoke-interface {p1, v2}, Lc2/m;->j(I)V

    invoke-interface {p1}, Lc2/m;->i()V

    return v1

    :cond_3
    iget-object v2, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {v2}, Lu3/a0;->r()I

    move-result v2

    const v3, 0x4b4e554a    # 1.352225E7f

    if-ne v0, v3, :cond_4

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v3

    int-to-long v5, v2

    add-long/2addr v3, v5

    const-wide/16 v5, 0x8

    add-long/2addr v3, v5

    iput-wide v3, p0, Le2/b;->h:J

    return v1

    :cond_4
    invoke-interface {p1, v4}, Lc2/m;->j(I)V

    invoke-interface {p1}, Lc2/m;->i()V

    invoke-direct {p0, v0}, Le2/b;->f(I)Le2/e;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v3

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Le2/b;->h:J

    return v1

    :cond_5
    invoke-virtual {v0, v2}, Le2/e;->n(I)V

    iput-object v0, p0, Le2/b;->i:Le2/e;

    :cond_6
    :goto_1
    return v1
.end method

.method private n(Lc2/m;Lc2/a0;)Z
    .locals 8

    iget-wide v0, p0, Le2/b;->h:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v0

    iget-wide v4, p0, Le2/b;->h:J

    cmp-long v6, v4, v0

    if-ltz v6, :cond_1

    const-wide/32 v6, 0x40000

    add-long/2addr v6, v0

    cmp-long v6, v4, v6

    if-lez v6, :cond_0

    goto :goto_0

    :cond_0
    sub-long/2addr v4, v0

    long-to-int p2, v4

    invoke-interface {p1, p2}, Lc2/m;->j(I)V

    goto :goto_1

    :cond_1
    :goto_0
    iput-wide v4, p2, Lc2/a0;->a:J

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x0

    :goto_2
    iput-wide v2, p0, Le2/b;->h:J

    return p1
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 3

    const-wide/16 p3, -0x1

    iput-wide p3, p0, Le2/b;->h:J

    const/4 p3, 0x0

    iput-object p3, p0, Le2/b;->i:Le2/e;

    iget-object p3, p0, Le2/b;->g:[Le2/e;

    array-length p4, p3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p4, :cond_0

    aget-object v2, p3, v1

    invoke-virtual {v2, p1, p2}, Le2/e;->o(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-nez p1, :cond_2

    iget-object p1, p0, Le2/b;->g:[Le2/e;

    array-length p1, p1

    if-nez p1, :cond_1

    iput v0, p0, Le2/b;->c:I

    goto :goto_1

    :cond_1
    const/4 p1, 0x3

    iput p1, p0, Le2/b;->c:I

    :goto_1
    return-void

    :cond_2
    const/4 p1, 0x6

    iput p1, p0, Le2/b;->c:I

    return-void
.end method

.method public c(Lc2/n;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Le2/b;->c:I

    iput-object p1, p0, Le2/b;->d:Lc2/n;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Le2/b;->h:J

    return-void
.end method

.method public g(Lc2/m;Lc2/a0;)I
    .locals 12

    invoke-direct {p0, p1, p2}, Le2/b;->n(Lc2/m;Lc2/a0;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    iget p2, p0, Le2/b;->c:I

    const/4 v1, 0x0

    const/4 v2, 0x6

    const/4 v3, 0x4

    const/16 v4, 0xc

    const/4 v5, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :pswitch_0
    invoke-direct {p0, p1}, Le2/b;->m(Lc2/m;)I

    move-result p1

    return p1

    :pswitch_1
    new-instance p2, Lu3/a0;

    iget v0, p0, Le2/b;->m:I

    invoke-direct {p2, v0}, Lu3/a0;-><init>(I)V

    invoke-virtual {p2}, Lu3/a0;->e()[B

    move-result-object v0

    iget v1, p0, Le2/b;->m:I

    invoke-interface {p1, v0, v5, v1}, Lc2/m;->readFully([BII)V

    invoke-direct {p0, p2}, Le2/b;->i(Lu3/a0;)V

    iput v2, p0, Le2/b;->c:I

    iget-wide p1, p0, Le2/b;->k:J

    iput-wide p1, p0, Le2/b;->h:J

    return v5

    :pswitch_2
    iget-object p2, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p2}, Lu3/a0;->e()[B

    move-result-object p2

    const/16 v0, 0x8

    invoke-interface {p1, p2, v5, v0}, Lc2/m;->readFully([BII)V

    iget-object p2, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p2, v5}, Lu3/a0;->R(I)V

    iget-object p2, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p2}, Lu3/a0;->r()I

    move-result p2

    iget-object v0, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->r()I

    move-result v0

    const v1, 0x31786469

    if-ne p2, v1, :cond_1

    const/4 p1, 0x5

    iput p1, p0, Le2/b;->c:I

    iput v0, p0, Le2/b;->m:I

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide p1

    int-to-long v0, v0

    add-long/2addr p1, v0

    iput-wide p1, p0, Le2/b;->h:J

    :goto_0
    return v5

    :pswitch_3
    iget-wide v6, p0, Le2/b;->k:J

    const-wide/16 v8, -0x1

    cmp-long p2, v6, v8

    if-eqz p2, :cond_2

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v6

    iget-wide v8, p0, Le2/b;->k:J

    cmp-long p2, v6, v8

    if-eqz p2, :cond_2

    iput-wide v8, p0, Le2/b;->h:J

    return v5

    :cond_2
    iget-object p2, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p2}, Lu3/a0;->e()[B

    move-result-object p2

    invoke-interface {p1, p2, v5, v4}, Lc2/m;->o([BII)V

    invoke-interface {p1}, Lc2/m;->i()V

    iget-object p2, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p2, v5}, Lu3/a0;->R(I)V

    iget-object p2, p0, Le2/b;->b:Le2/b$c;

    iget-object v1, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p2, v1}, Le2/b$c;->a(Lu3/a0;)V

    iget-object p2, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p2}, Lu3/a0;->r()I

    move-result p2

    iget-object v1, p0, Le2/b;->b:Le2/b$c;

    iget v1, v1, Le2/b$c;->a:I

    const v6, 0x46464952

    if-ne v1, v6, :cond_3

    invoke-interface {p1, v4}, Lc2/m;->j(I)V

    return v5

    :cond_3
    const v4, 0x5453494c

    const-wide/16 v6, 0x8

    if-ne v1, v4, :cond_7

    const v1, 0x69766f6d

    if-eq p2, v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v8

    iput-wide v8, p0, Le2/b;->k:J

    iget-object p2, p0, Le2/b;->b:Le2/b$c;

    iget p2, p2, Le2/b$c;->b:I

    int-to-long v10, p2

    add-long/2addr v8, v10

    add-long/2addr v8, v6

    iput-wide v8, p0, Le2/b;->l:J

    iget-boolean p2, p0, Le2/b;->n:Z

    if-nez p2, :cond_6

    iget-object p2, p0, Le2/b;->e:Le2/c;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le2/c;

    invoke-virtual {p2}, Le2/c;->a()Z

    move-result p2

    if-eqz p2, :cond_5

    iput v3, p0, Le2/b;->c:I

    iget-wide p1, p0, Le2/b;->l:J

    iput-wide p1, p0, Le2/b;->h:J

    return v5

    :cond_5
    iget-object p2, p0, Le2/b;->d:Lc2/n;

    new-instance v1, Lc2/b0$b;

    iget-wide v3, p0, Le2/b;->f:J

    invoke-direct {v1, v3, v4}, Lc2/b0$b;-><init>(J)V

    invoke-interface {p2, v1}, Lc2/n;->p(Lc2/b0;)V

    iput-boolean v0, p0, Le2/b;->n:Z

    :cond_6
    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide p1

    const-wide/16 v0, 0xc

    add-long/2addr p1, v0

    iput-wide p1, p0, Le2/b;->h:J

    iput v2, p0, Le2/b;->c:I

    return v5

    :cond_7
    :goto_1
    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide p1

    iget-object v0, p0, Le2/b;->b:Le2/b$c;

    iget v0, v0, Le2/b$c;->b:I

    int-to-long v0, v0

    add-long/2addr p1, v0

    add-long/2addr p1, v6

    iput-wide p1, p0, Le2/b;->h:J

    return v5

    :pswitch_4
    iget p2, p0, Le2/b;->j:I

    sub-int/2addr p2, v3

    new-instance v0, Lu3/a0;

    invoke-direct {v0, p2}, Lu3/a0;-><init>(I)V

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v1

    invoke-interface {p1, v1, v5, p2}, Lc2/m;->readFully([BII)V

    invoke-direct {p0, v0}, Le2/b;->h(Lu3/a0;)V

    const/4 p1, 0x3

    iput p1, p0, Le2/b;->c:I

    return v5

    :pswitch_5
    iget-object p2, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p2}, Lu3/a0;->e()[B

    move-result-object p2

    invoke-interface {p1, p2, v5, v4}, Lc2/m;->readFully([BII)V

    iget-object p1, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p1, v5}, Lu3/a0;->R(I)V

    iget-object p1, p0, Le2/b;->b:Le2/b$c;

    iget-object p2, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p1, p2}, Le2/b$c;->b(Lu3/a0;)V

    iget-object p1, p0, Le2/b;->b:Le2/b$c;

    iget p2, p1, Le2/b$c;->c:I

    const v0, 0x6c726468

    if-ne p2, v0, :cond_8

    iget p1, p1, Le2/b$c;->b:I

    iput p1, p0, Le2/b;->j:I

    const/4 p1, 0x2

    iput p1, p0, Le2/b;->c:I

    return v5

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "hdrl expected, found: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Le2/b;->b:Le2/b$c;

    iget p2, p2, Le2/b$c;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :pswitch_6
    invoke-virtual {p0, p1}, Le2/b;->j(Lc2/m;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1, v4}, Lc2/m;->j(I)V

    iput v0, p0, Le2/b;->c:I

    return v5

    :cond_9
    const-string p1, "AVI Header List not found"

    invoke-static {p1, v1}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j(Lc2/m;)Z
    .locals 3

    iget-object v0, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-interface {p1, v0, v1, v2}, Lc2/m;->o([BII)V

    iget-object p1, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p1, v1}, Lu3/a0;->R(I)V

    iget-object p1, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->r()I

    move-result p1

    const v0, 0x46464952

    if-eq p1, v0, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Le2/b;->a:Lu3/a0;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lu3/a0;->S(I)V

    iget-object p1, p0, Le2/b;->a:Lu3/a0;

    invoke-virtual {p1}, Lu3/a0;->r()I

    move-result p1

    const v0, 0x20495641

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
