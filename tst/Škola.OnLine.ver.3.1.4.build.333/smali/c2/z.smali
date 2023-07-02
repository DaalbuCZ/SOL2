.class public final Lc2/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/b0;


# instance fields
.field private final a:[J

.field private final b:[J

.field private final c:J

.field private final d:Z


# direct methods
.method public constructor <init>([J[JJ)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    array-length v1, p2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, Lu3/a;->a(Z)V

    array-length v0, p2

    if-lez v0, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    iput-boolean v1, p0, Lc2/z;->d:Z

    if-eqz v1, :cond_2

    aget-wide v4, p2, v3

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-lez v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    new-array v4, v1, [J

    iput-object v4, p0, Lc2/z;->a:[J

    new-array v1, v1, [J

    iput-object v1, p0, Lc2/z;->b:[J

    invoke-static {p1, v3, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p2, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    :cond_2
    iput-object p1, p0, Lc2/z;->a:[J

    iput-object p2, p0, Lc2/z;->b:[J

    :goto_2
    iput-wide p3, p0, Lc2/z;->c:J

    return-void
.end method


# virtual methods
.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lc2/z;->d:Z

    return v0
.end method

.method public h(J)Lc2/b0$a;
    .locals 8

    iget-boolean v0, p0, Lc2/z;->d:Z

    if-nez v0, :cond_0

    new-instance p1, Lc2/b0$a;

    sget-object p2, Lc2/c0;->c:Lc2/c0;

    invoke-direct {p1, p2}, Lc2/b0$a;-><init>(Lc2/c0;)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lc2/z;->b:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1, v1}, Lu3/n0;->i([JJZZ)I

    move-result v0

    new-instance v2, Lc2/c0;

    iget-object v3, p0, Lc2/z;->b:[J

    aget-wide v4, v3, v0

    iget-object v3, p0, Lc2/z;->a:[J

    aget-wide v6, v3, v0

    invoke-direct {v2, v4, v5, v6, v7}, Lc2/c0;-><init>(JJ)V

    iget-wide v3, v2, Lc2/c0;->a:J

    cmp-long p1, v3, p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc2/z;->b:[J

    array-length p1, p1

    sub-int/2addr p1, v1

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lc2/c0;

    iget-object p2, p0, Lc2/z;->b:[J

    add-int/2addr v0, v1

    aget-wide v3, p2, v0

    iget-object p2, p0, Lc2/z;->a:[J

    aget-wide v0, p2, v0

    invoke-direct {p1, v3, v4, v0, v1}, Lc2/c0;-><init>(JJ)V

    new-instance p2, Lc2/b0$a;

    invoke-direct {p2, v2, p1}, Lc2/b0$a;-><init>(Lc2/c0;Lc2/c0;)V

    return-object p2

    :cond_2
    :goto_0
    new-instance p1, Lc2/b0$a;

    invoke-direct {p1, v2}, Lc2/b0$a;-><init>(Lc2/c0;)V

    return-object p1
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lc2/z;->c:J

    return-wide v0
.end method
