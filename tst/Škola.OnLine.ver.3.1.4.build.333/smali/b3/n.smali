.class public abstract Lb3/n;
.super Lb3/f;
.source ""


# instance fields
.field public final j:J


# direct methods
.method public constructor <init>(Lt3/l;Lt3/p;Lx1/n1;ILjava/lang/Object;JJJ)V
    .locals 11

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    invoke-direct/range {v0 .. v10}, Lb3/f;-><init>(Lt3/l;Lt3/p;ILx1/n1;ILjava/lang/Object;JJ)V

    invoke-static {p3}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-wide/from16 v1, p10

    iput-wide v1, v0, Lb3/n;->j:J

    return-void
.end method


# virtual methods
.method public g()J
    .locals 5

    iget-wide v0, p0, Lb3/n;->j:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    :cond_0
    return-wide v2
.end method

.method public abstract h()Z
.end method
