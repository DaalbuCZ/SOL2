.class public abstract Ls1/l3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/l3$c;,
        Ls1/l3$b;,
        Ls1/l3$d;
    }
.end annotation


# static fields
.field public static final n:Ls1/l3;

.field public static final o:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/l3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/l3$a;

    invoke-direct {v0}, Ls1/l3$a;-><init>()V

    sput-object v0, Ls1/l3;->n:Ls1/l3;

    sget-object v0, Ls1/k3;->a:Ls1/k3;

    sput-object v0, Ls1/l3;->o:Ls1/h$a;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/l3;
    .locals 0

    invoke-static {p0}, Ls1/l3;->b(Landroid/os/Bundle;)Ls1/l3;

    move-result-object p0

    return-object p0
.end method

.method private static b(Landroid/os/Bundle;)Ls1/l3;
    .locals 3

    sget-object v0, Ls1/l3$d;->H:Ls1/h$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ls1/l3;->w(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lp3/b;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v0, v1}, Ls1/l3;->c(Ls1/h$a;Landroid/os/IBinder;)Lb5/q;

    move-result-object v0

    sget-object v1, Ls1/l3$b;->u:Ls1/h$a;

    const/4 v2, 0x1

    invoke-static {v2}, Ls1/l3;->w(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lp3/b;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v1, v2}, Ls1/l3;->c(Ls1/h$a;Landroid/os/IBinder;)Lb5/q;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, Ls1/l3;->w(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p0

    new-instance v2, Ls1/l3$c;

    if-nez p0, :cond_0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    invoke-static {p0}, Ls1/l3;->d(I)[I

    move-result-object p0

    :cond_0
    invoke-direct {v2, v0, v1, p0}, Ls1/l3$c;-><init>(Lb5/q;Lb5/q;[I)V

    return-object v2
.end method

.method private static c(Ls1/h$a;Landroid/os/IBinder;)Lb5/q;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ls1/h;",
            ">(",
            "Ls1/h$a<",
            "TT;>;",
            "Landroid/os/IBinder;",
            ")",
            "Lb5/q<",
            "TT;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-static {}, Lb5/q;->J()Lb5/q;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lb5/q$a;

    invoke-direct {v0}, Lb5/q$a;-><init>()V

    invoke-static {p1}, Ls1/g;->a(Landroid/os/IBinder;)Lb5/q;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    invoke-interface {p0, v2}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb5/q$a;->f(Ljava/lang/Object;)Lb5/q$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lb5/q$a;->h()Lb5/q;

    move-result-object p0

    return-object p0
.end method

.method private static d(I)[I
    .locals 2

    new-array v0, p0, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    aput v1, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static w(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e(Z)I
    .locals 0

    invoke-virtual {p0}, Ls1/l3;->u()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 9

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls1/l3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls1/l3;

    invoke-virtual {p1}, Ls1/l3;->t()I

    move-result v1

    invoke-virtual {p0}, Ls1/l3;->t()I

    move-result v3

    if-ne v1, v3, :cond_b

    invoke-virtual {p1}, Ls1/l3;->m()I

    move-result v1

    invoke-virtual {p0}, Ls1/l3;->m()I

    move-result v3

    if-eq v1, v3, :cond_2

    goto/16 :goto_3

    :cond_2
    new-instance v1, Ls1/l3$d;

    invoke-direct {v1}, Ls1/l3$d;-><init>()V

    new-instance v3, Ls1/l3$b;

    invoke-direct {v3}, Ls1/l3$b;-><init>()V

    new-instance v4, Ls1/l3$d;

    invoke-direct {v4}, Ls1/l3$d;-><init>()V

    new-instance v5, Ls1/l3$b;

    invoke-direct {v5}, Ls1/l3$b;-><init>()V

    move v6, v2

    :goto_0
    invoke-virtual {p0}, Ls1/l3;->t()I

    move-result v7

    if-ge v6, v7, :cond_4

    invoke-virtual {p0, v6, v1}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v7

    invoke-virtual {p1, v6, v4}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v8

    invoke-virtual {v7, v8}, Ls1/l3$d;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    return v2

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    move v1, v2

    :goto_1
    invoke-virtual {p0}, Ls1/l3;->m()I

    move-result v4

    if-ge v1, v4, :cond_6

    invoke-virtual {p0, v1, v3, v0}, Ls1/l3;->k(ILs1/l3$b;Z)Ls1/l3$b;

    move-result-object v4

    invoke-virtual {p1, v1, v5, v0}, Ls1/l3;->k(ILs1/l3$b;Z)Ls1/l3$b;

    move-result-object v6

    invoke-virtual {v4, v6}, Ls1/l3$b;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    return v2

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {p0, v0}, Ls1/l3;->e(Z)I

    move-result v1

    invoke-virtual {p1, v0}, Ls1/l3;->e(Z)I

    move-result v3

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    invoke-virtual {p0, v0}, Ls1/l3;->g(Z)I

    move-result v3

    invoke-virtual {p1, v0}, Ls1/l3;->g(Z)I

    move-result v4

    if-eq v3, v4, :cond_8

    return v2

    :cond_8
    :goto_2
    if-eq v1, v3, :cond_a

    invoke-virtual {p0, v1, v2, v0}, Ls1/l3;->i(IIZ)I

    move-result v4

    invoke-virtual {p1, v1, v2, v0}, Ls1/l3;->i(IIZ)I

    move-result v1

    if-eq v4, v1, :cond_9

    return v2

    :cond_9
    move v1, v4

    goto :goto_2

    :cond_a
    return v0

    :cond_b
    :goto_3
    return v2
.end method

.method public abstract f(Ljava/lang/Object;)I
.end method

.method public g(Z)I
    .locals 0

    invoke-virtual {p0}, Ls1/l3;->u()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls1/l3;->t()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    return p1
.end method

.method public final h(ILs1/l3$b;Ls1/l3$d;IZ)I
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls1/l3;->j(ILs1/l3$b;)Ls1/l3$b;

    move-result-object p2

    iget p2, p2, Ls1/l3$b;->p:I

    invoke-virtual {p0, p2, p3}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v0

    iget v0, v0, Ls1/l3$d;->C:I

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, p2, p4, p5}, Ls1/l3;->i(IIZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    invoke-virtual {p0, p1, p3}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object p1

    iget p1, p1, Ls1/l3$d;->B:I

    return p1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 6

    new-instance v0, Ls1/l3$d;

    invoke-direct {v0}, Ls1/l3$d;-><init>()V

    new-instance v1, Ls1/l3$b;

    invoke-direct {v1}, Ls1/l3$b;-><init>()V

    invoke-virtual {p0}, Ls1/l3;->t()I

    move-result v2

    const/16 v3, 0xd9

    add-int/2addr v3, v2

    const/4 v2, 0x0

    move v4, v2

    :goto_0
    invoke-virtual {p0}, Ls1/l3;->t()I

    move-result v5

    mul-int/lit8 v3, v3, 0x1f

    if-ge v4, v5, :cond_0

    invoke-virtual {p0, v4, v0}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v5

    invoke-virtual {v5}, Ls1/l3$d;->hashCode()I

    move-result v5

    add-int/2addr v3, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls1/l3;->m()I

    move-result v0

    add-int/2addr v3, v0

    move v0, v2

    :goto_1
    invoke-virtual {p0}, Ls1/l3;->m()I

    move-result v4

    const/4 v5, 0x1

    if-ge v0, v4, :cond_1

    mul-int/lit8 v3, v3, 0x1f

    invoke-virtual {p0, v0, v1, v5}, Ls1/l3;->k(ILs1/l3$b;Z)Ls1/l3$b;

    move-result-object v4

    invoke-virtual {v4}, Ls1/l3$b;->hashCode()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v5}, Ls1/l3;->e(Z)I

    move-result v0

    :goto_2
    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    mul-int/lit8 v3, v3, 0x1f

    add-int/2addr v3, v0

    invoke-virtual {p0, v0, v2, v5}, Ls1/l3;->i(IIZ)I

    move-result v0

    goto :goto_2

    :cond_2
    return v3
.end method

.method public i(IIZ)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    if-eq p2, v0, :cond_2

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    invoke-virtual {p0, p3}, Ls1/l3;->g(Z)I

    move-result p2

    if-ne p1, p2, :cond_0

    invoke-virtual {p0, p3}, Ls1/l3;->e(Z)I

    move-result p1

    goto :goto_0

    :cond_0
    add-int/2addr p1, v0

    :goto_0
    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    return p1

    :cond_3
    invoke-virtual {p0, p3}, Ls1/l3;->g(Z)I

    move-result p2

    if-ne p1, p2, :cond_4

    const/4 p1, -0x1

    goto :goto_1

    :cond_4
    add-int/2addr p1, v0

    :goto_1
    return p1
.end method

.method public final j(ILs1/l3$b;)Ls1/l3$b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Ls1/l3;->k(ILs1/l3$b;Z)Ls1/l3$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract k(ILs1/l3$b;Z)Ls1/l3$b;
.end method

.method public l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;
    .locals 1

    invoke-virtual {p0, p1}, Ls1/l3;->f(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Ls1/l3;->k(ILs1/l3$b;Z)Ls1/l3$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract m()I
.end method

.method public final n(Ls1/l3$d;Ls1/l3$b;IJ)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls1/l3$d;",
            "Ls1/l3$b;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-wide/16 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v7}, Ls1/l3;->o(Ls1/l3$d;Ls1/l3$b;IJJ)Landroid/util/Pair;

    move-result-object p1

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Pair;

    return-object p1
.end method

.method public final o(Ls1/l3$d;Ls1/l3$b;IJJ)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls1/l3$d;",
            "Ls1/l3$b;",
            "IJJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ls1/l3;->t()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p3, v1, v0}, Lp3/a;->c(III)I

    invoke-virtual {p0, p3, p1, p6, p7}, Ls1/l3;->s(ILs1/l3$d;J)Ls1/l3$d;

    const-wide p6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p4, p6

    if-nez p3, :cond_0

    invoke-virtual {p1}, Ls1/l3$d;->e()J

    move-result-wide p4

    cmp-long p3, p4, p6

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget p3, p1, Ls1/l3$d;->B:I

    invoke-virtual {p0, p3, p2}, Ls1/l3;->j(ILs1/l3$b;)Ls1/l3$b;

    :goto_0
    iget v0, p1, Ls1/l3$d;->C:I

    if-ge p3, v0, :cond_1

    iget-wide v0, p2, Ls1/l3$b;->r:J

    cmp-long v0, v0, p4

    if-eqz v0, :cond_1

    add-int/lit8 v0, p3, 0x1

    invoke-virtual {p0, v0, p2}, Ls1/l3;->j(ILs1/l3$b;)Ls1/l3$b;

    move-result-object v1

    iget-wide v1, v1, Ls1/l3$b;->r:J

    cmp-long v1, v1, p4

    if-gtz v1, :cond_1

    move p3, v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {p0, p3, p2, p1}, Ls1/l3;->k(ILs1/l3$b;Z)Ls1/l3$b;

    iget-wide v0, p2, Ls1/l3$b;->r:J

    sub-long/2addr p4, v0

    iget-wide v0, p2, Ls1/l3$b;->q:J

    cmp-long p1, v0, p6

    if-eqz p1, :cond_2

    const-wide/16 p6, 0x1

    sub-long/2addr v0, p6

    invoke-static {p4, p5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p4

    :cond_2
    const-wide/16 p6, 0x0

    invoke-static {p6, p7, p4, p5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p3

    iget-object p1, p2, Ls1/l3$b;->o:Ljava/lang/Object;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public p(IIZ)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    if-eq p2, v0, :cond_2

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    invoke-virtual {p0, p3}, Ls1/l3;->e(Z)I

    move-result p2

    if-ne p1, p2, :cond_0

    invoke-virtual {p0, p3}, Ls1/l3;->g(Z)I

    move-result p1

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v0

    :goto_0
    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    return p1

    :cond_3
    invoke-virtual {p0, p3}, Ls1/l3;->e(Z)I

    move-result p2

    if-ne p1, p2, :cond_4

    const/4 p1, -0x1

    goto :goto_1

    :cond_4
    sub-int/2addr p1, v0

    :goto_1
    return p1
.end method

.method public abstract q(I)Ljava/lang/Object;
.end method

.method public final r(ILs1/l3$d;)Ls1/l3$d;
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Ls1/l3;->s(ILs1/l3$d;J)Ls1/l3$d;

    move-result-object p1

    return-object p1
.end method

.method public abstract s(ILs1/l3$d;J)Ls1/l3$d;
.end method

.method public abstract t()I
.end method

.method public final u()Z
    .locals 1

    invoke-virtual {p0}, Ls1/l3;->t()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final v(ILs1/l3$b;Ls1/l3$d;IZ)Z
    .locals 0

    invoke-virtual/range {p0 .. p5}, Ls1/l3;->h(ILs1/l3$b;Ls1/l3$d;IZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
