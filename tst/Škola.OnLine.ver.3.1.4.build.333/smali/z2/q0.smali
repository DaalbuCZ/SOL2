.class public final Lz2/q0;
.super Lx1/y3;
.source ""


# static fields
.field private static final F:Ljava/lang/Object;

.field private static final G:Lx1/v1;


# instance fields
.field private final A:Z

.field private final B:Z

.field private final C:Ljava/lang/Object;

.field private final D:Lx1/v1;

.field private final E:Lx1/v1$g;

.field private final s:J

.field private final t:J

.field private final u:J

.field private final v:J

.field private final w:J

.field private final x:J

.field private final y:J

.field private final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz2/q0;->F:Ljava/lang/Object;

    new-instance v0, Lx1/v1$c;

    invoke-direct {v0}, Lx1/v1$c;-><init>()V

    const-string v1, "SinglePeriodTimeline"

    invoke-virtual {v0, v1}, Lx1/v1$c;->c(Ljava/lang/String;)Lx1/v1$c;

    move-result-object v0

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lx1/v1$c;->e(Landroid/net/Uri;)Lx1/v1$c;

    move-result-object v0

    invoke-virtual {v0}, Lx1/v1$c;->a()Lx1/v1;

    move-result-object v0

    sput-object v0, Lz2/q0;->G:Lx1/v1;

    return-void
.end method

.method public constructor <init>(JJJJJJJZZZLjava/lang/Object;Lx1/v1;Lx1/v1$g;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Lx1/y3;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Lz2/q0;->s:J

    move-wide v1, p3

    iput-wide v1, v0, Lz2/q0;->t:J

    move-wide v1, p5

    iput-wide v1, v0, Lz2/q0;->u:J

    move-wide v1, p7

    iput-wide v1, v0, Lz2/q0;->v:J

    move-wide v1, p9

    iput-wide v1, v0, Lz2/q0;->w:J

    move-wide v1, p11

    iput-wide v1, v0, Lz2/q0;->x:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, Lz2/q0;->y:J

    move/from16 v1, p15

    iput-boolean v1, v0, Lz2/q0;->z:Z

    move/from16 v1, p16

    iput-boolean v1, v0, Lz2/q0;->A:Z

    move/from16 v1, p17

    iput-boolean v1, v0, Lz2/q0;->B:Z

    move-object/from16 v1, p18

    iput-object v1, v0, Lz2/q0;->C:Ljava/lang/Object;

    invoke-static/range {p19 .. p19}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/v1;

    iput-object v1, v0, Lz2/q0;->D:Lx1/v1;

    move-object/from16 v1, p20

    iput-object v1, v0, Lz2/q0;->E:Lx1/v1$g;

    return-void
.end method

.method public constructor <init>(JJJJZZZLjava/lang/Object;Lx1/v1;)V
    .locals 21

    move-object/from16 v15, p13

    if-eqz p11, :cond_0

    iget-object v0, v15, Lx1/v1;->q:Lx1/v1$g;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v20, v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v17, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    move-wide/from16 v13, p7

    move/from16 v15, p9

    move/from16 v16, p10

    move-object/from16 v18, p12

    move-object/from16 v19, p13

    invoke-direct/range {v0 .. v20}, Lz2/q0;-><init>(JJJJJJJZZZLjava/lang/Object;Lx1/v1;Lx1/v1$g;)V

    return-void
.end method

.method public constructor <init>(JZZZLjava/lang/Object;Lx1/v1;)V
    .locals 14

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p1

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    invoke-direct/range {v0 .. v13}, Lz2/q0;-><init>(JJJJZZZLjava/lang/Object;Lx1/v1;)V

    return-void
.end method


# virtual methods
.method public f(Ljava/lang/Object;)I
    .locals 1

    sget-object v0, Lz2/q0;->F:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public k(ILx1/y3$b;Z)Lx1/y3$b;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lu3/a;->c(III)I

    if-eqz p3, :cond_0

    sget-object p1, Lz2/q0;->F:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    const/4 v1, 0x0

    const/4 v3, 0x0

    iget-wide v4, p0, Lz2/q0;->v:J

    iget-wide v6, p0, Lz2/q0;->x:J

    neg-long v6, v6

    move-object v0, p2

    invoke-virtual/range {v0 .. v7}, Lx1/y3$b;->u(Ljava/lang/Object;Ljava/lang/Object;IJJ)Lx1/y3$b;

    move-result-object p1

    return-object p1
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public q(I)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lu3/a;->c(III)I

    sget-object p1, Lz2/q0;->F:Ljava/lang/Object;

    return-object p1
.end method

.method public s(ILx1/y3$d;J)Lx1/y3$d;
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move/from16 v3, p1

    invoke-static {v3, v1, v2}, Lu3/a;->c(III)I

    iget-wide v1, v0, Lz2/q0;->y:J

    iget-boolean v14, v0, Lz2/q0;->A:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v14, :cond_1

    iget-boolean v5, v0, Lz2/q0;->B:Z

    if-nez v5, :cond_1

    const-wide/16 v5, 0x0

    cmp-long v5, p3, v5

    if-eqz v5, :cond_1

    iget-wide v5, v0, Lz2/q0;->w:J

    cmp-long v7, v5, v3

    if-nez v7, :cond_0

    :goto_0
    move-wide/from16 v16, v3

    goto :goto_1

    :cond_0
    add-long v1, v1, p3

    cmp-long v5, v1, v5

    if-lez v5, :cond_1

    goto :goto_0

    :cond_1
    move-wide/from16 v16, v1

    :goto_1
    sget-object v4, Lx1/y3$d;->E:Ljava/lang/Object;

    iget-object v5, v0, Lz2/q0;->D:Lx1/v1;

    iget-object v6, v0, Lz2/q0;->C:Ljava/lang/Object;

    iget-wide v7, v0, Lz2/q0;->s:J

    iget-wide v9, v0, Lz2/q0;->t:J

    iget-wide v11, v0, Lz2/q0;->u:J

    iget-boolean v13, v0, Lz2/q0;->z:Z

    iget-object v15, v0, Lz2/q0;->E:Lx1/v1$g;

    iget-wide v1, v0, Lz2/q0;->w:J

    move-wide/from16 v18, v1

    const/16 v20, 0x0

    const/16 v21, 0x0

    iget-wide v1, v0, Lz2/q0;->x:J

    move-wide/from16 v22, v1

    move-object/from16 v3, p2

    invoke-virtual/range {v3 .. v23}, Lx1/y3$d;->h(Ljava/lang/Object;Lx1/v1;Ljava/lang/Object;JJJZZLx1/v1$g;JJIIJ)Lx1/y3$d;

    move-result-object v1

    return-object v1
.end method

.method public t()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
