.class public final Lx6/a;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field private final n:Ljava/io/InputStream;

.field private final o:Lv6/h;

.field private final p:La7/l;

.field private q:J

.field private r:J

.field private s:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lv6/h;La7/l;)V
    .locals 2

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lx6/a;->q:J

    iput-wide v0, p0, Lx6/a;->s:J

    iput-object p3, p0, Lx6/a;->p:La7/l;

    iput-object p1, p0, Lx6/a;->n:Ljava/io/InputStream;

    iput-object p2, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {p2}, Lv6/h;->e()J

    move-result-wide p1

    iput-wide p1, p0, Lx6/a;->r:J

    return-void
.end method


# virtual methods
.method public available()I
    .locals 4

    :try_start_0
    iget-object v0, p0, Lx6/a;->n:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lx6/a;->o:Lv6/h;

    iget-object v2, p0, Lx6/a;->p:La7/l;

    invoke-virtual {v2}, La7/l;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lv6/h;->x(J)Lv6/h;

    iget-object v1, p0, Lx6/a;->o:Lv6/h;

    invoke-static {v1}, Lx6/e;->d(Lv6/h;)V

    throw v0
.end method

.method public close()V
    .locals 6

    iget-object v0, p0, Lx6/a;->p:La7/l;

    invoke-virtual {v0}, La7/l;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lx6/a;->s:J

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iput-wide v0, p0, Lx6/a;->s:J

    :cond_0
    :try_start_0
    iget-object v0, p0, Lx6/a;->n:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-wide v0, p0, Lx6/a;->q:J

    cmp-long v2, v0, v4

    if-eqz v2, :cond_1

    iget-object v2, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v2, v0, v1}, Lv6/h;->v(J)Lv6/h;

    :cond_1
    iget-wide v0, p0, Lx6/a;->r:J

    cmp-long v2, v0, v4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v2, v0, v1}, Lv6/h;->y(J)Lv6/h;

    :cond_2
    iget-object v0, p0, Lx6/a;->o:Lv6/h;

    iget-wide v1, p0, Lx6/a;->s:J

    invoke-virtual {v0, v1, v2}, Lv6/h;->x(J)Lv6/h;

    iget-object v0, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v0}, Lv6/h;->b()Lb7/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lx6/a;->o:Lv6/h;

    iget-object v2, p0, Lx6/a;->p:La7/l;

    invoke-virtual {v2}, La7/l;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lv6/h;->x(J)Lv6/h;

    iget-object v1, p0, Lx6/a;->o:Lv6/h;

    invoke-static {v1}, Lx6/e;->d(Lv6/h;)V

    throw v0
.end method

.method public mark(I)V
    .locals 1

    iget-object v0, p0, Lx6/a;->n:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    return-void
.end method

.method public markSupported()Z
    .locals 1

    iget-object v0, p0, Lx6/a;->n:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public read()I
    .locals 7

    :try_start_0
    iget-object v0, p0, Lx6/a;->n:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iget-object v1, p0, Lx6/a;->p:La7/l;

    invoke-virtual {v1}, La7/l;->c()J

    move-result-wide v1

    iget-wide v3, p0, Lx6/a;->r:J

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    iput-wide v1, p0, Lx6/a;->r:J

    :cond_0
    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    iget-wide v3, p0, Lx6/a;->s:J

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    iput-wide v1, p0, Lx6/a;->s:J

    iget-object v3, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v3, v1, v2}, Lv6/h;->x(J)Lv6/h;

    iget-object v1, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v1}, Lv6/h;->b()Lb7/h;

    goto :goto_0

    :cond_1
    iget-wide v1, p0, Lx6/a;->q:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lx6/a;->q:J

    iget-object v3, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v3, v1, v2}, Lv6/h;->v(J)Lv6/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lx6/a;->o:Lv6/h;

    iget-object v2, p0, Lx6/a;->p:La7/l;

    invoke-virtual {v2}, La7/l;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lv6/h;->x(J)Lv6/h;

    iget-object v1, p0, Lx6/a;->o:Lv6/h;

    invoke-static {v1}, Lx6/e;->d(Lv6/h;)V

    throw v0
.end method

.method public read([B)I
    .locals 6

    :try_start_0
    iget-object v0, p0, Lx6/a;->n:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p1

    iget-object v0, p0, Lx6/a;->p:La7/l;

    invoke-virtual {v0}, La7/l;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lx6/a;->r:J

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iput-wide v0, p0, Lx6/a;->r:J

    :cond_0
    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    iget-wide v2, p0, Lx6/a;->s:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    iput-wide v0, p0, Lx6/a;->s:J

    iget-object v2, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v2, v0, v1}, Lv6/h;->x(J)Lv6/h;

    iget-object v0, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v0}, Lv6/h;->b()Lb7/h;

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lx6/a;->q:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lx6/a;->q:J

    iget-object v2, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v2, v0, v1}, Lv6/h;->v(J)Lv6/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lx6/a;->o:Lv6/h;

    iget-object v1, p0, Lx6/a;->p:La7/l;

    invoke-virtual {v1}, La7/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lv6/h;->x(J)Lv6/h;

    iget-object v0, p0, Lx6/a;->o:Lv6/h;

    invoke-static {v0}, Lx6/e;->d(Lv6/h;)V

    throw p1
.end method

.method public read([BII)I
    .locals 4

    :try_start_0
    iget-object v0, p0, Lx6/a;->n:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    iget-object p2, p0, Lx6/a;->p:La7/l;

    invoke-virtual {p2}, La7/l;->c()J

    move-result-wide p2

    iget-wide v0, p0, Lx6/a;->r:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iput-wide p2, p0, Lx6/a;->r:J

    :cond_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    iget-wide v0, p0, Lx6/a;->s:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iput-wide p2, p0, Lx6/a;->s:J

    iget-object v0, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v0, p2, p3}, Lv6/h;->x(J)Lv6/h;

    iget-object p2, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {p2}, Lv6/h;->b()Lb7/h;

    goto :goto_0

    :cond_1
    iget-wide p2, p0, Lx6/a;->q:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lx6/a;->q:J

    iget-object v0, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v0, p2, p3}, Lv6/h;->v(J)Lv6/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lx6/a;->o:Lv6/h;

    iget-object p3, p0, Lx6/a;->p:La7/l;

    invoke-virtual {p3}, La7/l;->c()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lv6/h;->x(J)Lv6/h;

    iget-object p2, p0, Lx6/a;->o:Lv6/h;

    invoke-static {p2}, Lx6/e;->d(Lv6/h;)V

    throw p1
.end method

.method public reset()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lx6/a;->n:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lx6/a;->o:Lv6/h;

    iget-object v2, p0, Lx6/a;->p:La7/l;

    invoke-virtual {v2}, La7/l;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lv6/h;->x(J)Lv6/h;

    iget-object v1, p0, Lx6/a;->o:Lv6/h;

    invoke-static {v1}, Lx6/e;->d(Lv6/h;)V

    throw v0
.end method

.method public skip(J)J
    .locals 6

    :try_start_0
    iget-object v0, p0, Lx6/a;->n:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    iget-object v0, p0, Lx6/a;->p:La7/l;

    invoke-virtual {v0}, La7/l;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lx6/a;->r:J

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iput-wide v0, p0, Lx6/a;->r:J

    :cond_0
    cmp-long v2, p1, v4

    if-nez v2, :cond_1

    iget-wide v2, p0, Lx6/a;->s:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    iput-wide v0, p0, Lx6/a;->s:J

    iget-object v2, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v2, v0, v1}, Lv6/h;->x(J)Lv6/h;

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lx6/a;->q:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lx6/a;->q:J

    iget-object v2, p0, Lx6/a;->o:Lv6/h;

    invoke-virtual {v2, v0, v1}, Lv6/h;->v(J)Lv6/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lx6/a;->o:Lv6/h;

    iget-object v0, p0, Lx6/a;->p:La7/l;

    invoke-virtual {v0}, La7/l;->c()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lv6/h;->x(J)Lv6/h;

    iget-object p2, p0, Lx6/a;->o:Lv6/h;

    invoke-static {p2}, Lx6/e;->d(Lv6/h;)V

    throw p1
.end method
