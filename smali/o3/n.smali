.class public final Lo3/n;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field private final n:Lo3/l;

.field private final o:Lo3/p;

.field private final p:[B

.field private q:Z

.field private r:Z

.field private s:J


# direct methods
.method public constructor <init>(Lo3/l;Lo3/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo3/n;->q:Z

    iput-boolean v0, p0, Lo3/n;->r:Z

    iput-object p1, p0, Lo3/n;->n:Lo3/l;

    iput-object p2, p0, Lo3/n;->o:Lo3/p;

    const/4 p1, 0x1

    new-array p1, p1, [B

    iput-object p1, p0, Lo3/n;->p:[B

    return-void
.end method

.method private a()V
    .locals 2

    iget-boolean v0, p0, Lo3/n;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo3/n;->n:Lo3/l;

    iget-object v1, p0, Lo3/n;->o:Lo3/p;

    invoke-interface {v0, v1}, Lo3/l;->n(Lo3/p;)J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo3/n;->q:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    invoke-direct {p0}, Lo3/n;->a()V

    return-void
.end method

.method public close()V
    .locals 1

    iget-boolean v0, p0, Lo3/n;->r:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo3/n;->n:Lo3/l;

    invoke-interface {v0}, Lo3/l;->close()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo3/n;->r:Z

    :cond_0
    return-void
.end method

.method public read()I
    .locals 2

    iget-object v0, p0, Lo3/n;->p:[B

    invoke-virtual {p0, v0}, Lo3/n;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo3/n;->p:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v1, v0, 0xff

    :goto_0
    return v1
.end method

.method public read([B)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lo3/n;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 2

    iget-boolean v0, p0, Lo3/n;->r:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp3/a;->f(Z)V

    invoke-direct {p0}, Lo3/n;->a()V

    iget-object v0, p0, Lo3/n;->n:Lo3/l;

    invoke-interface {v0, p1, p2, p3}, Lo3/i;->b([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-wide p2, p0, Lo3/n;->s:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lo3/n;->s:J

    return p1
.end method
