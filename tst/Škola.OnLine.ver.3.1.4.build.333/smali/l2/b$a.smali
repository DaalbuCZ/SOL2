.class final Ll2/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll2/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:Lc2/v;

.field private b:Lc2/v$a;

.field private c:J

.field private d:J


# direct methods
.method public constructor <init>(Lc2/v;Lc2/v$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/b$a;->a:Lc2/v;

    iput-object p2, p0, Ll2/b$a;->b:Lc2/v$a;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Ll2/b$a;->c:J

    iput-wide p1, p0, Ll2/b$a;->d:J

    return-void
.end method


# virtual methods
.method public a()Lc2/b0;
    .locals 4

    iget-wide v0, p0, Ll2/b$a;->c:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu3/a;->f(Z)V

    new-instance v0, Lc2/u;

    iget-object v1, p0, Ll2/b$a;->a:Lc2/v;

    iget-wide v2, p0, Ll2/b$a;->c:J

    invoke-direct {v0, v1, v2, v3}, Lc2/u;-><init>(Lc2/v;J)V

    return-object v0
.end method

.method public b(Lc2/m;)J
    .locals 6

    iget-wide v0, p0, Ll2/b$a;->d:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    const-wide/16 v2, -0x1

    if-ltz p1, :cond_0

    const-wide/16 v4, 0x2

    add-long/2addr v0, v4

    neg-long v0, v0

    iput-wide v2, p0, Ll2/b$a;->d:J

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public c(J)V
    .locals 2

    iget-object v0, p0, Ll2/b$a;->b:Lc2/v$a;

    iget-object v0, v0, Lc2/v$a;->a:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1, v1}, Lu3/n0;->i([JJZZ)I

    move-result p1

    aget-wide p1, v0, p1

    iput-wide p1, p0, Ll2/b$a;->d:J

    return-void
.end method

.method public d(J)V
    .locals 0

    iput-wide p1, p0, Ll2/b$a;->c:J

    return-void
.end method
