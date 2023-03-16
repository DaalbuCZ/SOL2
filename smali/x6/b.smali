.class public final Lx6/b;
.super Ljava/io/OutputStream;
.source ""


# instance fields
.field private final n:Ljava/io/OutputStream;

.field private final o:La7/l;

.field p:Lv6/h;

.field q:J


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lv6/h;La7/l;)V
    .locals 2

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lx6/b;->q:J

    iput-object p1, p0, Lx6/b;->n:Ljava/io/OutputStream;

    iput-object p2, p0, Lx6/b;->p:Lv6/h;

    iput-object p3, p0, Lx6/b;->o:La7/l;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    iget-wide v0, p0, Lx6/b;->q:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lx6/b;->p:Lv6/h;

    invoke-virtual {v2, v0, v1}, Lv6/h;->s(J)Lv6/h;

    :cond_0
    iget-object v0, p0, Lx6/b;->p:Lv6/h;

    iget-object v1, p0, Lx6/b;->o:La7/l;

    invoke-virtual {v1}, La7/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lv6/h;->w(J)Lv6/h;

    :try_start_0
    iget-object v0, p0, Lx6/b;->n:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lx6/b;->p:Lv6/h;

    iget-object v2, p0, Lx6/b;->o:La7/l;

    invoke-virtual {v2}, La7/l;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lv6/h;->x(J)Lv6/h;

    iget-object v1, p0, Lx6/b;->p:Lv6/h;

    invoke-static {v1}, Lx6/e;->d(Lv6/h;)V

    throw v0
.end method

.method public flush()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lx6/b;->n:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lx6/b;->p:Lv6/h;

    iget-object v2, p0, Lx6/b;->o:La7/l;

    invoke-virtual {v2}, La7/l;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lv6/h;->x(J)Lv6/h;

    iget-object v1, p0, Lx6/b;->p:Lv6/h;

    invoke-static {v1}, Lx6/e;->d(Lv6/h;)V

    throw v0
.end method

.method public write(I)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lx6/b;->n:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    iget-wide v0, p0, Lx6/b;->q:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lx6/b;->q:J

    iget-object p1, p0, Lx6/b;->p:Lv6/h;

    invoke-virtual {p1, v0, v1}, Lv6/h;->s(J)Lv6/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lx6/b;->p:Lv6/h;

    iget-object v1, p0, Lx6/b;->o:La7/l;

    invoke-virtual {v1}, La7/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lv6/h;->x(J)Lv6/h;

    iget-object v0, p0, Lx6/b;->p:Lv6/h;

    invoke-static {v0}, Lx6/e;->d(Lv6/h;)V

    throw p1
.end method

.method public write([B)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lx6/b;->n:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    iget-wide v0, p0, Lx6/b;->q:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lx6/b;->q:J

    iget-object p1, p0, Lx6/b;->p:Lv6/h;

    invoke-virtual {p1, v0, v1}, Lv6/h;->s(J)Lv6/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lx6/b;->p:Lv6/h;

    iget-object v1, p0, Lx6/b;->o:La7/l;

    invoke-virtual {v1}, La7/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lv6/h;->x(J)Lv6/h;

    iget-object v0, p0, Lx6/b;->p:Lv6/h;

    invoke-static {v0}, Lx6/e;->d(Lv6/h;)V

    throw p1
.end method

.method public write([BII)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/b;->n:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    iget-wide p1, p0, Lx6/b;->q:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lx6/b;->q:J

    iget-object p3, p0, Lx6/b;->p:Lv6/h;

    invoke-virtual {p3, p1, p2}, Lv6/h;->s(J)Lv6/h;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lx6/b;->p:Lv6/h;

    iget-object p3, p0, Lx6/b;->o:La7/l;

    invoke-virtual {p3}, La7/l;->c()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lv6/h;->x(J)Lv6/h;

    iget-object p2, p0, Lx6/b;->p:Lv6/h;

    invoke-static {p2}, Lx6/e;->d(Lv6/h;)V

    throw p1
.end method
