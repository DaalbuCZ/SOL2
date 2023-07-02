.class final Lz2/h0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/r;
.implements Lc2/n;
.implements Lt3/h0$b;
.implements Lt3/h0$f;
.implements Lz2/m0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/h0$d;,
        Lz2/h0$e;,
        Lz2/h0$a;,
        Lz2/h0$c;,
        Lz2/h0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz2/r;",
        "Lc2/n;",
        "Lt3/h0$b<",
        "Lz2/h0$a;",
        ">;",
        "Lt3/h0$f;",
        "Lz2/m0$d;"
    }
.end annotation


# static fields
.field private static final Z:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final a0:Lx1/n1;


# instance fields
.field private final A:Ljava/lang/Runnable;

.field private final B:Ljava/lang/Runnable;

.field private final C:Landroid/os/Handler;

.field private D:Lz2/r$a;

.field private E:Lt2/b;

.field private F:[Lz2/m0;

.field private G:[Lz2/h0$d;

.field private H:Z

.field private I:Z

.field private J:Z

.field private K:Lz2/h0$e;

.field private L:Lc2/b0;

.field private M:J

.field private N:Z

.field private O:I

.field private P:Z

.field private Q:Z

.field private R:I

.field private S:Z

.field private T:J

.field private U:J

.field private V:Z

.field private W:I

.field private X:Z

.field private Y:Z

.field private final n:Landroid/net/Uri;

.field private final o:Lt3/l;

.field private final p:Lb2/y;

.field private final q:Lt3/g0;

.field private final r:Lz2/b0$a;

.field private final s:Lb2/w$a;

.field private final t:Lz2/h0$b;

.field private final u:Lt3/b;

.field private final v:Ljava/lang/String;

.field private final w:J

.field private final x:Lt3/h0;

.field private final y:Lz2/c0;

.field private final z:Lu3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lz2/h0;->L()Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lz2/h0;->Z:Ljava/util/Map;

    new-instance v0, Lx1/n1$b;

    invoke-direct {v0}, Lx1/n1$b;-><init>()V

    const-string v1, "icy"

    invoke-virtual {v0, v1}, Lx1/n1$b;->U(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v0

    const-string v1, "application/x-icy"

    invoke-virtual {v0, v1}, Lx1/n1$b;->g0(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v0

    invoke-virtual {v0}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object v0

    sput-object v0, Lz2/h0;->a0:Lx1/n1;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lt3/l;Lz2/c0;Lb2/y;Lb2/w$a;Lt3/g0;Lz2/b0$a;Lz2/h0$b;Lt3/b;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/h0;->n:Landroid/net/Uri;

    iput-object p2, p0, Lz2/h0;->o:Lt3/l;

    iput-object p4, p0, Lz2/h0;->p:Lb2/y;

    iput-object p5, p0, Lz2/h0;->s:Lb2/w$a;

    iput-object p6, p0, Lz2/h0;->q:Lt3/g0;

    iput-object p7, p0, Lz2/h0;->r:Lz2/b0$a;

    iput-object p8, p0, Lz2/h0;->t:Lz2/h0$b;

    iput-object p9, p0, Lz2/h0;->u:Lt3/b;

    iput-object p10, p0, Lz2/h0;->v:Ljava/lang/String;

    int-to-long p1, p11

    iput-wide p1, p0, Lz2/h0;->w:J

    new-instance p1, Lt3/h0;

    const-string p2, "ProgressiveMediaPeriod"

    invoke-direct {p1, p2}, Lt3/h0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lz2/h0;->x:Lt3/h0;

    iput-object p3, p0, Lz2/h0;->y:Lz2/c0;

    new-instance p1, Lu3/g;

    invoke-direct {p1}, Lu3/g;-><init>()V

    iput-object p1, p0, Lz2/h0;->z:Lu3/g;

    new-instance p1, Lz2/d0;

    invoke-direct {p1, p0}, Lz2/d0;-><init>(Lz2/h0;)V

    iput-object p1, p0, Lz2/h0;->A:Ljava/lang/Runnable;

    new-instance p1, Lz2/f0;

    invoke-direct {p1, p0}, Lz2/f0;-><init>(Lz2/h0;)V

    iput-object p1, p0, Lz2/h0;->B:Ljava/lang/Runnable;

    invoke-static {}, Lu3/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lz2/h0;->C:Landroid/os/Handler;

    const/4 p1, 0x0

    new-array p2, p1, [Lz2/h0$d;

    iput-object p2, p0, Lz2/h0;->G:[Lz2/h0$d;

    new-array p1, p1, [Lz2/m0;

    iput-object p1, p0, Lz2/h0;->F:[Lz2/m0;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lz2/h0;->U:J

    iput-wide p1, p0, Lz2/h0;->M:J

    const/4 p1, 0x1

    iput p1, p0, Lz2/h0;->O:I

    return-void
.end method

.method static synthetic A(Lz2/h0;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lz2/h0;->C:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic B(Lz2/h0;Z)J
    .locals 0

    invoke-direct {p0, p1}, Lz2/h0;->N(Z)J

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic C()Ljava/util/Map;
    .locals 1

    sget-object v0, Lz2/h0;->Z:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic D(Lz2/h0;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lz2/h0;->v:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic E(Lz2/h0;)V
    .locals 0

    invoke-direct {p0}, Lz2/h0;->Z()V

    return-void
.end method

.method static synthetic F(Lz2/h0;)Lt2/b;
    .locals 0

    iget-object p0, p0, Lz2/h0;->E:Lt2/b;

    return-object p0
.end method

.method static synthetic G(Lz2/h0;Lt2/b;)Lt2/b;
    .locals 0

    iput-object p1, p0, Lz2/h0;->E:Lt2/b;

    return-object p1
.end method

.method static synthetic H()Lx1/n1;
    .locals 1

    sget-object v0, Lz2/h0;->a0:Lx1/n1;

    return-object v0
.end method

.method static synthetic I(Lz2/h0;)J
    .locals 2

    iget-wide v0, p0, Lz2/h0;->w:J

    return-wide v0
.end method

.method private J()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "trackState",
            "seekMap"
        }
    .end annotation

    iget-boolean v0, p0, Lz2/h0;->I:Z

    invoke-static {v0}, Lu3/a;->f(Z)V

    iget-object v0, p0, Lz2/h0;->K:Lz2/h0$e;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/h0;->L:Lc2/b0;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private K(Lz2/h0$a;I)Z
    .locals 6

    iget-boolean v0, p0, Lz2/h0;->S:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lz2/h0;->L:Lc2/b0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc2/b0;->i()J

    move-result-wide v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean p2, p0, Lz2/h0;->I:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lz2/h0;->k0()Z

    move-result p2

    if-nez p2, :cond_1

    iput-boolean v1, p0, Lz2/h0;->V:Z

    return v0

    :cond_1
    iget-boolean p2, p0, Lz2/h0;->I:Z

    iput-boolean p2, p0, Lz2/h0;->Q:Z

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lz2/h0;->T:J

    iput v0, p0, Lz2/h0;->W:I

    iget-object p2, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v4, p2

    :goto_0
    if-ge v0, v4, :cond_2

    aget-object v5, p2, v0

    invoke-virtual {v5}, Lz2/m0;->V()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-static {p1, v2, v3, v2, v3}, Lz2/h0$a;->h(Lz2/h0$a;JJ)V

    return v1

    :cond_3
    :goto_1
    iput p2, p0, Lz2/h0;->W:I

    return v1
.end method

.method private static L()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Icy-MetaData"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private M()I
    .locals 5

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lz2/m0;->G()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method private N(Z)J
    .locals 5

    const-wide/high16 v0, -0x8000000000000000L

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v3, v3

    if-ge v2, v3, :cond_2

    if-nez p1, :cond_0

    iget-object v3, p0, Lz2/h0;->K:Lz2/h0$e;

    invoke-static {v3}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz2/h0$e;

    iget-object v3, v3, Lz2/h0$e;->c:[Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_1

    :cond_0
    iget-object v3, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lz2/m0;->z()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-wide v0
.end method

.method private P()Z
    .locals 4

    iget-wide v0, p0, Lz2/h0;->U:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic R()V
    .locals 1

    iget-boolean v0, p0, Lz2/h0;->Y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lz2/h0;->D:Lz2/r$a;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/r$a;

    invoke-interface {v0, p0}, Lz2/o0$a;->k(Lz2/o0;)V

    :cond_0
    return-void
.end method

.method private synthetic S()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/h0;->S:Z

    return-void
.end method

.method private synthetic T(Lc2/b0;)V
    .locals 0

    invoke-direct {p0, p1}, Lz2/h0;->h0(Lc2/b0;)V

    return-void
.end method

.method private U()V
    .locals 11

    iget-boolean v0, p0, Lz2/h0;->Y:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lz2/h0;->I:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lz2/h0;->H:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lz2/h0;->L:Lc2/b0;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lz2/m0;->F()Lx1/n1;

    move-result-object v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lz2/h0;->z:Lu3/g;

    invoke-virtual {v0}, Lu3/g;->c()Z

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v0, v0

    new-array v1, v0, [Lz2/t0;

    new-array v3, v0, [Z

    move v4, v2

    :goto_1
    const/4 v5, 0x1

    if-ge v4, v0, :cond_9

    iget-object v6, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object v6, v6, v4

    invoke-virtual {v6}, Lz2/m0;->F()Lx1/n1;

    move-result-object v6

    invoke-static {v6}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lx1/n1;

    iget-object v7, v6, Lx1/n1;->y:Ljava/lang/String;

    invoke-static {v7}, Lu3/v;->o(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-static {v7}, Lu3/v;->s(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    move v7, v2

    goto :goto_3

    :cond_4
    :goto_2
    move v7, v5

    :goto_3
    aput-boolean v7, v3, v4

    iget-boolean v9, p0, Lz2/h0;->J:Z

    or-int/2addr v7, v9

    iput-boolean v7, p0, Lz2/h0;->J:Z

    iget-object v7, p0, Lz2/h0;->E:Lt2/b;

    if-eqz v7, :cond_8

    if-nez v8, :cond_5

    iget-object v9, p0, Lz2/h0;->G:[Lz2/h0$d;

    aget-object v9, v9, v4

    iget-boolean v9, v9, Lz2/h0$d;->b:Z

    if-eqz v9, :cond_7

    :cond_5
    iget-object v9, v6, Lx1/n1;->w:Lp2/a;

    if-nez v9, :cond_6

    new-instance v9, Lp2/a;

    new-array v10, v5, [Lp2/a$b;

    aput-object v7, v10, v2

    invoke-direct {v9, v10}, Lp2/a;-><init>([Lp2/a$b;)V

    goto :goto_4

    :cond_6
    new-array v10, v5, [Lp2/a$b;

    aput-object v7, v10, v2

    invoke-virtual {v9, v10}, Lp2/a;->a([Lp2/a$b;)Lp2/a;

    move-result-object v9

    :goto_4
    invoke-virtual {v6}, Lx1/n1;->b()Lx1/n1$b;

    move-result-object v6

    invoke-virtual {v6, v9}, Lx1/n1$b;->Z(Lp2/a;)Lx1/n1$b;

    move-result-object v6

    invoke-virtual {v6}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object v6

    :cond_7
    if-eqz v8, :cond_8

    iget v8, v6, Lx1/n1;->s:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_8

    iget v8, v6, Lx1/n1;->t:I

    if-ne v8, v9, :cond_8

    iget v8, v7, Lt2/b;->n:I

    if-eq v8, v9, :cond_8

    invoke-virtual {v6}, Lx1/n1;->b()Lx1/n1$b;

    move-result-object v6

    iget v7, v7, Lt2/b;->n:I

    invoke-virtual {v6, v7}, Lx1/n1$b;->I(I)Lx1/n1$b;

    move-result-object v6

    invoke-virtual {v6}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object v6

    :cond_8
    iget-object v7, p0, Lz2/h0;->p:Lb2/y;

    invoke-interface {v7, v6}, Lb2/y;->f(Lx1/n1;)I

    move-result v7

    invoke-virtual {v6, v7}, Lx1/n1;->c(I)Lx1/n1;

    move-result-object v6

    new-instance v7, Lz2/t0;

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    new-array v5, v5, [Lx1/n1;

    aput-object v6, v5, v2

    invoke-direct {v7, v8, v5}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    aput-object v7, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_9
    new-instance v0, Lz2/h0$e;

    new-instance v2, Lz2/v0;

    invoke-direct {v2, v1}, Lz2/v0;-><init>([Lz2/t0;)V

    invoke-direct {v0, v2, v3}, Lz2/h0$e;-><init>(Lz2/v0;[Z)V

    iput-object v0, p0, Lz2/h0;->K:Lz2/h0$e;

    iput-boolean v5, p0, Lz2/h0;->I:Z

    iget-object v0, p0, Lz2/h0;->D:Lz2/r$a;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/r$a;

    invoke-interface {v0, p0}, Lz2/r$a;->d(Lz2/r;)V

    :cond_a
    :goto_5
    return-void
.end method

.method private V(I)V
    .locals 10

    invoke-direct {p0}, Lz2/h0;->J()V

    iget-object v0, p0, Lz2/h0;->K:Lz2/h0$e;

    iget-object v1, v0, Lz2/h0$e;->d:[Z

    aget-boolean v2, v1, p1

    if-nez v2, :cond_0

    iget-object v0, v0, Lz2/h0$e;->a:Lz2/v0;

    invoke-virtual {v0, p1}, Lz2/v0;->b(I)Lz2/t0;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lz2/t0;->b(I)Lx1/n1;

    move-result-object v5

    iget-object v3, p0, Lz2/h0;->r:Lz2/b0$a;

    iget-object v0, v5, Lx1/n1;->y:Ljava/lang/String;

    invoke-static {v0}, Lu3/v;->k(Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-wide v8, p0, Lz2/h0;->T:J

    invoke-virtual/range {v3 .. v9}, Lz2/b0$a;->i(ILx1/n1;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    aput-boolean v0, v1, p1

    :cond_0
    return-void
.end method

.method private W(I)V
    .locals 3

    invoke-direct {p0}, Lz2/h0;->J()V

    iget-object v0, p0, Lz2/h0;->K:Lz2/h0$e;

    iget-object v0, v0, Lz2/h0$e;->b:[Z

    iget-boolean v1, p0, Lz2/h0;->V:Z

    if-eqz v1, :cond_2

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz2/m0;->K(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lz2/h0;->U:J

    iput-boolean v0, p0, Lz2/h0;->V:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz2/h0;->Q:Z

    iput-wide v1, p0, Lz2/h0;->T:J

    iput v0, p0, Lz2/h0;->W:I

    iget-object p1, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_1

    aget-object v2, p1, v0

    invoke-virtual {v2}, Lz2/m0;->V()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lz2/h0;->D:Lz2/r$a;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/r$a;

    invoke-interface {p1, p0}, Lz2/o0$a;->k(Lz2/o0;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private Z()V
    .locals 2

    iget-object v0, p0, Lz2/h0;->C:Landroid/os/Handler;

    new-instance v1, Lz2/e0;

    invoke-direct {v1, p0}, Lz2/e0;-><init>(Lz2/h0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private d0(Lz2/h0$d;)Lc2/e0;
    .locals 4

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lz2/h0;->G:[Lz2/h0$d;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Lz2/h0$d;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object p1, p1, v1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lz2/h0;->u:Lt3/b;

    iget-object v2, p0, Lz2/h0;->p:Lb2/y;

    iget-object v3, p0, Lz2/h0;->s:Lb2/w$a;

    invoke-static {v1, v2, v3}, Lz2/m0;->k(Lt3/b;Lb2/y;Lb2/w$a;)Lz2/m0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lz2/m0;->d0(Lz2/m0$d;)V

    iget-object v2, p0, Lz2/h0;->G:[Lz2/h0$d;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lz2/h0$d;

    aput-object p1, v2, v0

    invoke-static {v2}, Lu3/n0;->k([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lz2/h0$d;

    iput-object p1, p0, Lz2/h0;->G:[Lz2/h0$d;

    iget-object p1, p0, Lz2/h0;->F:[Lz2/m0;

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lz2/m0;

    aput-object v1, p1, v0

    invoke-static {p1}, Lu3/n0;->k([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lz2/m0;

    iput-object p1, p0, Lz2/h0;->F:[Lz2/m0;

    return-object v1
.end method

.method private g0([ZJ)Z
    .locals 4

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object v3, v3, v2

    invoke-virtual {v3, p2, p3, v1}, Lz2/m0;->Z(JZ)Z

    move-result v3

    if-nez v3, :cond_1

    aget-boolean v3, p1, v2

    if-nez v3, :cond_0

    iget-boolean v3, p0, Lz2/h0;->J:Z

    if-nez v3, :cond_1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private h0(Lc2/b0;)V
    .locals 6

    iget-object v0, p0, Lz2/h0;->E:Lt2/b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Lc2/b0$b;

    invoke-direct {v0, v1, v2}, Lc2/b0$b;-><init>(J)V

    :goto_0
    iput-object v0, p0, Lz2/h0;->L:Lc2/b0;

    invoke-interface {p1}, Lc2/b0;->i()J

    move-result-wide v3

    iput-wide v3, p0, Lz2/h0;->M:J

    iget-boolean v0, p0, Lz2/h0;->S:Z

    const/4 v3, 0x1

    if-nez v0, :cond_1

    invoke-interface {p1}, Lc2/b0;->i()J

    move-result-wide v4

    cmp-long v0, v4, v1

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lz2/h0;->N:Z

    if-eqz v0, :cond_2

    const/4 v3, 0x7

    :cond_2
    iput v3, p0, Lz2/h0;->O:I

    iget-object v0, p0, Lz2/h0;->t:Lz2/h0$b;

    iget-wide v1, p0, Lz2/h0;->M:J

    invoke-interface {p1}, Lc2/b0;->f()Z

    move-result p1

    iget-boolean v3, p0, Lz2/h0;->N:Z

    invoke-interface {v0, v1, v2, p1, v3}, Lz2/h0$b;->o(JZZ)V

    iget-boolean p1, p0, Lz2/h0;->I:Z

    if-nez p1, :cond_3

    invoke-direct {p0}, Lz2/h0;->U()V

    :cond_3
    return-void
.end method

.method private j0()V
    .locals 26

    move-object/from16 v7, p0

    new-instance v8, Lz2/h0$a;

    iget-object v2, v7, Lz2/h0;->n:Landroid/net/Uri;

    iget-object v3, v7, Lz2/h0;->o:Lt3/l;

    iget-object v4, v7, Lz2/h0;->y:Lz2/c0;

    iget-object v6, v7, Lz2/h0;->z:Lu3/g;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v5, p0

    invoke-direct/range {v0 .. v6}, Lz2/h0$a;-><init>(Lz2/h0;Landroid/net/Uri;Lt3/l;Lz2/c0;Lc2/n;Lu3/g;)V

    iget-boolean v0, v7, Lz2/h0;->I:Z

    if-eqz v0, :cond_2

    invoke-direct/range {p0 .. p0}, Lz2/h0;->P()Z

    move-result v0

    invoke-static {v0}, Lu3/a;->f(Z)V

    iget-wide v0, v7, Lz2/h0;->M:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v4, v7, Lz2/h0;->U:J

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, v7, Lz2/h0;->X:Z

    iput-wide v2, v7, Lz2/h0;->U:J

    return-void

    :cond_0
    iget-object v0, v7, Lz2/h0;->L:Lc2/b0;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/b0;

    iget-wide v4, v7, Lz2/h0;->U:J

    invoke-interface {v0, v4, v5}, Lc2/b0;->h(J)Lc2/b0$a;

    move-result-object v0

    iget-object v0, v0, Lc2/b0$a;->a:Lc2/c0;

    iget-wide v0, v0, Lc2/c0;->b:J

    iget-wide v4, v7, Lz2/h0;->U:J

    invoke-static {v8, v0, v1, v4, v5}, Lz2/h0$a;->h(Lz2/h0$a;JJ)V

    iget-object v0, v7, Lz2/h0;->F:[Lz2/m0;

    array-length v1, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    aget-object v5, v0, v4

    iget-wide v9, v7, Lz2/h0;->U:J

    invoke-virtual {v5, v9, v10}, Lz2/m0;->b0(J)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iput-wide v2, v7, Lz2/h0;->U:J

    :cond_2
    invoke-direct/range {p0 .. p0}, Lz2/h0;->M()I

    move-result v0

    iput v0, v7, Lz2/h0;->W:I

    iget-object v0, v7, Lz2/h0;->x:Lt3/h0;

    iget-object v1, v7, Lz2/h0;->q:Lt3/g0;

    iget v2, v7, Lz2/h0;->O:I

    invoke-interface {v1, v2}, Lt3/g0;->d(I)I

    move-result v1

    invoke-virtual {v0, v8, v7, v1}, Lt3/h0;->n(Lt3/h0$e;Lt3/h0$b;I)J

    move-result-wide v13

    invoke-static {v8}, Lz2/h0$a;->f(Lz2/h0$a;)Lt3/p;

    move-result-object v12

    iget-object v15, v7, Lz2/h0;->r:Lz2/b0$a;

    new-instance v16, Lz2/n;

    invoke-static {v8}, Lz2/h0$a;->e(Lz2/h0$a;)J

    move-result-wide v10

    move-object/from16 v9, v16

    invoke-direct/range {v9 .. v14}, Lz2/n;-><init>(JLt3/p;J)V

    const/16 v17, 0x1

    const/16 v18, -0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static {v8}, Lz2/h0$a;->g(Lz2/h0$a;)J

    move-result-wide v22

    iget-wide v0, v7, Lz2/h0;->M:J

    move-wide/from16 v24, v0

    invoke-virtual/range {v15 .. v25}, Lz2/b0$a;->A(Lz2/n;IILx1/n1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method private k0()Z
    .locals 1

    iget-boolean v0, p0, Lz2/h0;->Q:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lz2/h0;->P()Z

    move-result v0

    if-eqz v0, :cond_0

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

.method public static synthetic v(Lz2/h0;)V
    .locals 0

    invoke-direct {p0}, Lz2/h0;->U()V

    return-void
.end method

.method public static synthetic w(Lz2/h0;)V
    .locals 0

    invoke-direct {p0}, Lz2/h0;->S()V

    return-void
.end method

.method public static synthetic x(Lz2/h0;Lc2/b0;)V
    .locals 0

    invoke-direct {p0, p1}, Lz2/h0;->T(Lc2/b0;)V

    return-void
.end method

.method public static synthetic y(Lz2/h0;)V
    .locals 0

    invoke-direct {p0}, Lz2/h0;->R()V

    return-void
.end method

.method static synthetic z(Lz2/h0;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lz2/h0;->B:Ljava/lang/Runnable;

    return-object p0
.end method


# virtual methods
.method O()Lc2/e0;
    .locals 3

    new-instance v0, Lz2/h0$d;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz2/h0$d;-><init>(IZ)V

    invoke-direct {p0, v0}, Lz2/h0;->d0(Lz2/h0$d;)Lc2/e0;

    move-result-object v0

    return-object v0
.end method

.method Q(I)Z
    .locals 1

    invoke-direct {p0}, Lz2/h0;->k0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Lz2/h0;->X:Z

    invoke-virtual {p1, v0}, Lz2/m0;->K(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method X()V
    .locals 3

    iget-object v0, p0, Lz2/h0;->x:Lt3/h0;

    iget-object v1, p0, Lz2/h0;->q:Lt3/g0;

    iget v2, p0, Lz2/h0;->O:I

    invoke-interface {v1, v2}, Lt3/g0;->d(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lt3/h0;->k(I)V

    return-void
.end method

.method Y(I)V
    .locals 1

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lz2/m0;->N()V

    invoke-virtual {p0}, Lz2/h0;->X()V

    return-void
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lz2/h0;->x:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/h0;->z:Lu3/g;

    invoke-virtual {v0}, Lu3/g;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a0(Lz2/h0$a;JJZ)V
    .locals 15

    move-object v0, p0

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->d(Lz2/h0$a;)Lt3/o0;

    move-result-object v1

    new-instance v14, Lz2/n;

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->e(Lz2/h0$a;)J

    move-result-wide v3

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->f(Lz2/h0$a;)Lt3/p;

    move-result-object v5

    invoke-virtual {v1}, Lt3/o0;->s()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v1}, Lt3/o0;->t()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v1}, Lt3/o0;->r()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v1, v0, Lz2/h0;->q:Lt3/g0;

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->e(Lz2/h0$a;)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Lt3/g0;->c(J)V

    iget-object v2, v0, Lz2/h0;->r:Lz2/b0$a;

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->g(Lz2/h0$a;)J

    move-result-wide v9

    iget-wide v11, v0, Lz2/h0;->M:J

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v14

    invoke-virtual/range {v2 .. v12}, Lz2/b0$a;->r(Lz2/n;IILx1/n1;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_1

    iget-object v1, v0, Lz2/h0;->F:[Lz2/m0;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-virtual {v4}, Lz2/m0;->V()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget v1, v0, Lz2/h0;->R:I

    if-lez v1, :cond_1

    iget-object v1, v0, Lz2/h0;->D:Lz2/r$a;

    invoke-static {v1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/r$a;

    invoke-interface {v1, p0}, Lz2/o0$a;->k(Lz2/o0;)V

    :cond_1
    return-void
.end method

.method public b(Lx1/n1;)V
    .locals 1

    iget-object p1, p0, Lz2/h0;->C:Landroid/os/Handler;

    iget-object v0, p0, Lz2/h0;->A:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b0(Lz2/h0$a;JJ)V
    .locals 16

    move-object/from16 v0, p0

    iget-wide v1, v0, Lz2/h0;->M:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, v0, Lz2/h0;->L:Lc2/b0;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lc2/b0;->f()Z

    move-result v1

    invoke-direct {v0, v2}, Lz2/h0;->N(Z)J

    move-result-wide v3

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v5, v3, v5

    if-nez v5, :cond_0

    const-wide/16 v3, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x2710

    add-long/2addr v3, v5

    :goto_0
    iput-wide v3, v0, Lz2/h0;->M:J

    iget-object v5, v0, Lz2/h0;->t:Lz2/h0$b;

    iget-boolean v6, v0, Lz2/h0;->N:Z

    invoke-interface {v5, v3, v4, v1, v6}, Lz2/h0$b;->o(JZZ)V

    :cond_1
    invoke-static/range {p1 .. p1}, Lz2/h0$a;->d(Lz2/h0$a;)Lt3/o0;

    move-result-object v1

    new-instance v15, Lz2/n;

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->e(Lz2/h0$a;)J

    move-result-wide v4

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->f(Lz2/h0$a;)Lt3/p;

    move-result-object v6

    invoke-virtual {v1}, Lt3/o0;->s()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v1}, Lt3/o0;->t()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v1}, Lt3/o0;->r()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v1, v0, Lz2/h0;->q:Lt3/g0;

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->e(Lz2/h0$a;)J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Lt3/g0;->c(J)V

    iget-object v3, v0, Lz2/h0;->r:Lz2/b0$a;

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->g(Lz2/h0$a;)J

    move-result-wide v10

    iget-wide v12, v0, Lz2/h0;->M:J

    move-object v4, v15

    invoke-virtual/range {v3 .. v13}, Lz2/b0$a;->u(Lz2/n;IILx1/n1;ILjava/lang/Object;JJ)V

    iput-boolean v2, v0, Lz2/h0;->X:Z

    iget-object v1, v0, Lz2/h0;->D:Lz2/r$a;

    invoke-static {v1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/r$a;

    invoke-interface {v1, v0}, Lz2/o0$a;->k(Lz2/o0;)V

    return-void
.end method

.method public c()J
    .locals 2

    invoke-virtual {p0}, Lz2/h0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public c0(Lz2/h0$a;JJLjava/io/IOException;I)Lt3/h0$c;
    .locals 25

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->d(Lz2/h0$a;)Lt3/o0;

    move-result-object v1

    new-instance v14, Lz2/n;

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->e(Lz2/h0$a;)J

    move-result-wide v3

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->f(Lz2/h0$a;)Lt3/p;

    move-result-object v5

    invoke-virtual {v1}, Lt3/o0;->s()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v1}, Lt3/o0;->t()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v1}, Lt3/o0;->r()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v1, Lz2/q;

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->g(Lz2/h0$a;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lu3/n0;->Y0(J)J

    move-result-wide v21

    iget-wide v2, v0, Lz2/h0;->M:J

    invoke-static {v2, v3}, Lu3/n0;->Y0(J)J

    move-result-wide v23

    const/16 v16, 0x1

    const/16 v17, -0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v15, v1

    invoke-direct/range {v15 .. v24}, Lz2/q;-><init>(IILx1/n1;ILjava/lang/Object;JJ)V

    iget-object v2, v0, Lz2/h0;->q:Lt3/g0;

    new-instance v3, Lt3/g0$c;

    move-object/from16 v13, p6

    move/from16 v4, p7

    invoke-direct {v3, v14, v1, v13, v4}, Lt3/g0$c;-><init>(Lz2/n;Lz2/q;Ljava/io/IOException;I)V

    invoke-interface {v2, v3}, Lt3/g0;->a(Lt3/g0$c;)J

    move-result-wide v1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    const/4 v4, 0x1

    if-nez v3, :cond_0

    sget-object v1, Lt3/h0;->g:Lt3/h0$c;

    move-object/from16 v15, p1

    goto :goto_1

    :cond_0
    invoke-direct/range {p0 .. p0}, Lz2/h0;->M()I

    move-result v3

    iget v5, v0, Lz2/h0;->W:I

    if-le v3, v5, :cond_1

    move-object/from16 v15, p1

    move v5, v4

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    move-object/from16 v15, p1

    :goto_0
    invoke-direct {v0, v15, v3}, Lz2/h0;->K(Lz2/h0$a;I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v5, v1, v2}, Lt3/h0;->h(ZJ)Lt3/h0$c;

    move-result-object v1

    goto :goto_1

    :cond_2
    sget-object v1, Lt3/h0;->f:Lt3/h0$c;

    :goto_1
    invoke-virtual {v1}, Lt3/h0$c;->c()Z

    move-result v2

    xor-int/lit8 v16, v2, 0x1

    iget-object v2, v0, Lz2/h0;->r:Lz2/b0$a;

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->g(Lz2/h0$a;)J

    move-result-wide v9

    iget-wide v11, v0, Lz2/h0;->M:J

    move-object v3, v14

    move-object/from16 v13, p6

    move/from16 v14, v16

    invoke-virtual/range {v2 .. v14}, Lz2/b0$a;->w(Lz2/n;IILx1/n1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v16, :cond_3

    iget-object v2, v0, Lz2/h0;->q:Lt3/g0;

    invoke-static/range {p1 .. p1}, Lz2/h0$a;->e(Lz2/h0$a;)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Lt3/g0;->c(J)V

    :cond_3
    return-object v1
.end method

.method public d(II)Lc2/e0;
    .locals 1

    new-instance p2, Lz2/h0$d;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lz2/h0$d;-><init>(IZ)V

    invoke-direct {p0, p2}, Lz2/h0;->d0(Lz2/h0$d;)Lc2/e0;

    move-result-object p1

    return-object p1
.end method

.method public e(JLx1/q3;)J
    .locals 9

    invoke-direct {p0}, Lz2/h0;->J()V

    iget-object v0, p0, Lz2/h0;->L:Lc2/b0;

    invoke-interface {v0}, Lc2/b0;->f()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    iget-object v0, p0, Lz2/h0;->L:Lc2/b0;

    invoke-interface {v0, p1, p2}, Lc2/b0;->h(J)Lc2/b0$a;

    move-result-object v0

    iget-object v1, v0, Lc2/b0$a;->a:Lc2/c0;

    iget-wide v5, v1, Lc2/c0;->a:J

    iget-object v0, v0, Lc2/b0$a;->b:Lc2/c0;

    iget-wide v7, v0, Lc2/c0;->a:J

    move-object v2, p3

    move-wide v3, p1

    invoke-virtual/range {v2 .. v8}, Lx1/q3;->a(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method e0(ILx1/o1;La2/g;I)I
    .locals 3

    invoke-direct {p0}, Lz2/h0;->k0()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1}, Lz2/h0;->V(I)V

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object v0, v0, p1

    iget-boolean v2, p0, Lz2/h0;->X:Z

    invoke-virtual {v0, p2, p3, p4, v2}, Lz2/m0;->S(Lx1/o1;La2/g;IZ)I

    move-result p2

    if-ne p2, v1, :cond_1

    invoke-direct {p0, p1}, Lz2/h0;->W(I)V

    :cond_1
    return p2
.end method

.method public f()J
    .locals 11

    invoke-direct {p0}, Lz2/h0;->J()V

    iget-boolean v0, p0, Lz2/h0;->X:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-nez v0, :cond_7

    iget v0, p0, Lz2/h0;->R:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lz2/h0;->P()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lz2/h0;->U:J

    return-wide v0

    :cond_1
    iget-boolean v0, p0, Lz2/h0;->J:Z

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v0, :cond_3

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v0, v0

    move v6, v3

    move-wide v7, v4

    :goto_0
    if-ge v6, v0, :cond_4

    iget-object v9, p0, Lz2/h0;->K:Lz2/h0$e;

    iget-object v10, v9, Lz2/h0$e;->b:[Z

    aget-boolean v10, v10, v6

    if-eqz v10, :cond_2

    iget-object v9, v9, Lz2/h0$e;->c:[Z

    aget-boolean v9, v9, v6

    if-eqz v9, :cond_2

    iget-object v9, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object v9, v9, v6

    invoke-virtual {v9}, Lz2/m0;->J()Z

    move-result v9

    if-nez v9, :cond_2

    iget-object v9, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object v9, v9, v6

    invoke-virtual {v9}, Lz2/m0;->z()J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move-wide v7, v4

    :cond_4
    cmp-long v0, v7, v4

    if-nez v0, :cond_5

    invoke-direct {p0, v3}, Lz2/h0;->N(Z)J

    move-result-wide v7

    :cond_5
    cmp-long v0, v7, v1

    if-nez v0, :cond_6

    iget-wide v7, p0, Lz2/h0;->T:J

    :cond_6
    return-wide v7

    :cond_7
    :goto_1
    return-wide v1
.end method

.method public f0()V
    .locals 4

    iget-boolean v0, p0, Lz2/h0;->I:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lz2/m0;->R()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz2/h0;->x:Lt3/h0;

    invoke-virtual {v0, p0}, Lt3/h0;->m(Lt3/h0$f;)V

    iget-object v0, p0, Lz2/h0;->C:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lz2/h0;->D:Lz2/r$a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/h0;->Y:Z

    return-void
.end method

.method public g(J)Z
    .locals 0

    iget-boolean p1, p0, Lz2/h0;->X:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lz2/h0;->x:Lt3/h0;

    invoke-virtual {p1}, Lt3/h0;->i()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lz2/h0;->V:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lz2/h0;->I:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lz2/h0;->R:I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lz2/h0;->z:Lu3/g;

    invoke-virtual {p1}, Lu3/g;->e()Z

    move-result p1

    iget-object p2, p0, Lz2/h0;->x:Lt3/h0;

    invoke-virtual {p2}, Lt3/h0;->j()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-direct {p0}, Lz2/h0;->j0()V

    const/4 p1, 0x1

    :cond_1
    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public h(J)V
    .locals 0

    return-void
.end method

.method public i()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/h0;->H:Z

    iget-object v0, p0, Lz2/h0;->C:Landroid/os/Handler;

    iget-object v1, p0, Lz2/h0;->A:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method i0(IJ)I
    .locals 2

    invoke-direct {p0}, Lz2/h0;->k0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lz2/h0;->V(I)V

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object v0, v0, p1

    iget-boolean v1, p0, Lz2/h0;->X:Z

    invoke-virtual {v0, p2, p3, v1}, Lz2/m0;->E(JZ)I

    move-result p2

    invoke-virtual {v0, p2}, Lz2/m0;->e0(I)V

    if-nez p2, :cond_1

    invoke-direct {p0, p1}, Lz2/h0;->W(I)V

    :cond_1
    return p2
.end method

.method public j([Ls3/t;[Z[Lz2/n0;[ZJ)J
    .locals 8

    invoke-direct {p0}, Lz2/h0;->J()V

    iget-object v0, p0, Lz2/h0;->K:Lz2/h0$e;

    iget-object v1, v0, Lz2/h0$e;->a:Lz2/v0;

    iget-object v0, v0, Lz2/h0$e;->c:[Z

    iget v2, p0, Lz2/h0;->R:I

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    array-length v5, p1

    const/4 v6, 0x1

    if-ge v4, v5, :cond_2

    aget-object v5, p3, v4

    if-eqz v5, :cond_1

    aget-object v5, p1, v4

    if-eqz v5, :cond_0

    aget-boolean v5, p2, v4

    if-nez v5, :cond_1

    :cond_0
    aget-object v5, p3, v4

    check-cast v5, Lz2/h0$c;

    invoke-static {v5}, Lz2/h0$c;->a(Lz2/h0$c;)I

    move-result v5

    aget-boolean v7, v0, v5

    invoke-static {v7}, Lu3/a;->f(Z)V

    iget v7, p0, Lz2/h0;->R:I

    sub-int/2addr v7, v6

    iput v7, p0, Lz2/h0;->R:I

    aput-boolean v3, v0, v5

    const/4 v5, 0x0

    aput-object v5, p3, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lz2/h0;->P:Z

    if-eqz p2, :cond_3

    if-nez v2, :cond_4

    goto :goto_1

    :cond_3
    const-wide/16 v4, 0x0

    cmp-long p2, p5, v4

    if-eqz p2, :cond_4

    :goto_1
    move p2, v6

    goto :goto_2

    :cond_4
    move p2, v3

    :goto_2
    move v2, v3

    :goto_3
    array-length v4, p1

    if-ge v2, v4, :cond_9

    aget-object v4, p3, v2

    if-nez v4, :cond_8

    aget-object v4, p1, v2

    if-eqz v4, :cond_8

    aget-object v4, p1, v2

    invoke-interface {v4}, Ls3/w;->length()I

    move-result v5

    if-ne v5, v6, :cond_5

    move v5, v6

    goto :goto_4

    :cond_5
    move v5, v3

    :goto_4
    invoke-static {v5}, Lu3/a;->f(Z)V

    invoke-interface {v4, v3}, Ls3/w;->c(I)I

    move-result v5

    if-nez v5, :cond_6

    move v5, v6

    goto :goto_5

    :cond_6
    move v5, v3

    :goto_5
    invoke-static {v5}, Lu3/a;->f(Z)V

    invoke-interface {v4}, Ls3/w;->d()Lz2/t0;

    move-result-object v4

    invoke-virtual {v1, v4}, Lz2/v0;->c(Lz2/t0;)I

    move-result v4

    aget-boolean v5, v0, v4

    xor-int/2addr v5, v6

    invoke-static {v5}, Lu3/a;->f(Z)V

    iget v5, p0, Lz2/h0;->R:I

    add-int/2addr v5, v6

    iput v5, p0, Lz2/h0;->R:I

    aput-boolean v6, v0, v4

    new-instance v5, Lz2/h0$c;

    invoke-direct {v5, p0, v4}, Lz2/h0$c;-><init>(Lz2/h0;I)V

    aput-object v5, p3, v2

    aput-boolean v6, p4, v2

    if-nez p2, :cond_8

    iget-object p2, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object p2, p2, v4

    invoke-virtual {p2, p5, p6, v6}, Lz2/m0;->Z(JZ)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {p2}, Lz2/m0;->C()I

    move-result p2

    if-eqz p2, :cond_7

    move p2, v6

    goto :goto_6

    :cond_7
    move p2, v3

    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    iget p1, p0, Lz2/h0;->R:I

    if-nez p1, :cond_c

    iput-boolean v3, p0, Lz2/h0;->V:Z

    iput-boolean v3, p0, Lz2/h0;->Q:Z

    iget-object p1, p0, Lz2/h0;->x:Lt3/h0;

    invoke-virtual {p1}, Lt3/h0;->j()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lz2/h0;->F:[Lz2/m0;

    array-length p2, p1

    :goto_7
    if-ge v3, p2, :cond_a

    aget-object p3, p1, v3

    invoke-virtual {p3}, Lz2/m0;->r()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_a
    iget-object p1, p0, Lz2/h0;->x:Lt3/h0;

    invoke-virtual {p1}, Lt3/h0;->f()V

    goto :goto_a

    :cond_b
    iget-object p1, p0, Lz2/h0;->F:[Lz2/m0;

    array-length p2, p1

    :goto_8
    if-ge v3, p2, :cond_e

    aget-object p3, p1, v3

    invoke-virtual {p3}, Lz2/m0;->V()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_c
    if-eqz p2, :cond_e

    invoke-virtual {p0, p5, p6}, Lz2/h0;->t(J)J

    move-result-wide p5

    :goto_9
    array-length p1, p3

    if-ge v3, p1, :cond_e

    aget-object p1, p3, v3

    if-eqz p1, :cond_d

    aput-boolean v6, p4, v3

    :cond_d
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_e
    :goto_a
    iput-boolean v6, p0, Lz2/h0;->P:Z

    return-wide p5
.end method

.method public k()V
    .locals 4

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lz2/m0;->T()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz2/h0;->y:Lz2/c0;

    invoke-interface {v0}, Lz2/c0;->a()V

    return-void
.end method

.method public l()J
    .locals 2

    iget-boolean v0, p0, Lz2/h0;->Q:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lz2/h0;->X:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lz2/h0;->M()I

    move-result v0

    iget v1, p0, Lz2/h0;->W:I

    if-le v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lz2/h0;->Q:Z

    iget-wide v0, p0, Lz2/h0;->T:J

    return-wide v0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public bridge synthetic m(Lt3/h0$e;JJLjava/io/IOException;I)Lt3/h0$c;
    .locals 0

    check-cast p1, Lz2/h0$a;

    invoke-virtual/range {p0 .. p7}, Lz2/h0;->c0(Lz2/h0$a;JJLjava/io/IOException;I)Lt3/h0$c;

    move-result-object p1

    return-object p1
.end method

.method public n(Lz2/r$a;J)V
    .locals 0

    iput-object p1, p0, Lz2/h0;->D:Lz2/r$a;

    iget-object p1, p0, Lz2/h0;->z:Lu3/g;

    invoke-virtual {p1}, Lu3/g;->e()Z

    invoke-direct {p0}, Lz2/h0;->j0()V

    return-void
.end method

.method public o()Lz2/v0;
    .locals 1

    invoke-direct {p0}, Lz2/h0;->J()V

    iget-object v0, p0, Lz2/h0;->K:Lz2/h0$e;

    iget-object v0, v0, Lz2/h0$e;->a:Lz2/v0;

    return-object v0
.end method

.method public p(Lc2/b0;)V
    .locals 2

    iget-object v0, p0, Lz2/h0;->C:Landroid/os/Handler;

    new-instance v1, Lz2/g0;

    invoke-direct {v1, p0, p1}, Lz2/g0;-><init>(Lz2/h0;Lc2/b0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public q()V
    .locals 2

    invoke-virtual {p0}, Lz2/h0;->X()V

    iget-boolean v0, p0, Lz2/h0;->X:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lz2/h0;->I:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const-string v1, "Loading finished before preparation is complete."

    invoke-static {v1, v0}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public r(JZ)V
    .locals 5

    invoke-direct {p0}, Lz2/h0;->J()V

    invoke-direct {p0}, Lz2/h0;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz2/h0;->K:Lz2/h0$e;

    iget-object v0, v0, Lz2/h0$e;->c:[Z

    iget-object v1, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p0, Lz2/h0;->F:[Lz2/m0;

    aget-object v3, v3, v2

    aget-boolean v4, v0, v2

    invoke-virtual {v3, p1, p2, p3, v4}, Lz2/m0;->q(JZZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic s(Lt3/h0$e;JJ)V
    .locals 0

    check-cast p1, Lz2/h0$a;

    invoke-virtual/range {p0 .. p5}, Lz2/h0;->b0(Lz2/h0$a;JJ)V

    return-void
.end method

.method public t(J)J
    .locals 4

    invoke-direct {p0}, Lz2/h0;->J()V

    iget-object v0, p0, Lz2/h0;->K:Lz2/h0$e;

    iget-object v0, v0, Lz2/h0$e;->b:[Z

    iget-object v1, p0, Lz2/h0;->L:Lc2/b0;

    invoke-interface {v1}, Lc2/b0;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lz2/h0;->Q:Z

    iput-wide p1, p0, Lz2/h0;->T:J

    invoke-direct {p0}, Lz2/h0;->P()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-wide p1, p0, Lz2/h0;->U:J

    return-wide p1

    :cond_1
    iget v2, p0, Lz2/h0;->O:I

    const/4 v3, 0x7

    if-eq v2, v3, :cond_2

    invoke-direct {p0, v0, p1, p2}, Lz2/h0;->g0([ZJ)Z

    move-result v0

    if-eqz v0, :cond_2

    return-wide p1

    :cond_2
    iput-boolean v1, p0, Lz2/h0;->V:Z

    iput-wide p1, p0, Lz2/h0;->U:J

    iput-boolean v1, p0, Lz2/h0;->X:Z

    iget-object v0, p0, Lz2/h0;->x:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v2, v0

    :goto_1
    if-ge v1, v2, :cond_3

    aget-object v3, v0, v1

    invoke-virtual {v3}, Lz2/m0;->r()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lz2/h0;->x:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->f()V

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lz2/h0;->x:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->g()V

    iget-object v0, p0, Lz2/h0;->F:[Lz2/m0;

    array-length v2, v0

    :goto_2
    if-ge v1, v2, :cond_5

    aget-object v3, v0, v1

    invoke-virtual {v3}, Lz2/m0;->V()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    return-wide p1
.end method

.method public bridge synthetic u(Lt3/h0$e;JJZ)V
    .locals 0

    check-cast p1, Lz2/h0$a;

    invoke-virtual/range {p0 .. p6}, Lz2/h0;->a0(Lz2/h0$a;JJZ)V

    return-void
.end method
