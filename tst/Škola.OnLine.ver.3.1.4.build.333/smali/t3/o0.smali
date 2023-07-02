.class public final Lt3/o0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/l;


# instance fields
.field private final a:Lt3/l;

.field private b:J

.field private c:Landroid/net/Uri;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt3/l;

    iput-object p1, p0, Lt3/o0;->a:Lt3/l;

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p1, p0, Lt3/o0;->c:Landroid/net/Uri;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lt3/o0;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public b([BII)I
    .locals 2

    iget-object v0, p0, Lt3/o0;->a:Lt3/l;

    invoke-interface {v0, p1, p2, p3}, Lt3/i;->b([BII)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    iget-wide p2, p0, Lt3/o0;->b:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lt3/o0;->b:J

    :cond_0
    return p1
.end method

.method public c(Lt3/p0;)V
    .locals 1

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lt3/o0;->a:Lt3/l;

    invoke-interface {v0, p1}, Lt3/l;->c(Lt3/p0;)V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lt3/o0;->a:Lt3/l;

    invoke-interface {v0}, Lt3/l;->close()V

    return-void
.end method

.method public f(Lt3/p;)J
    .locals 2

    iget-object v0, p1, Lt3/p;->a:Landroid/net/Uri;

    iput-object v0, p0, Lt3/o0;->c:Landroid/net/Uri;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lt3/o0;->d:Ljava/util/Map;

    iget-object v0, p0, Lt3/o0;->a:Lt3/l;

    invoke-interface {v0, p1}, Lt3/l;->f(Lt3/p;)J

    move-result-wide v0

    invoke-virtual {p0}, Lt3/o0;->l()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, Lt3/o0;->c:Landroid/net/Uri;

    invoke-virtual {p0}, Lt3/o0;->h()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lt3/o0;->d:Ljava/util/Map;

    return-wide v0
.end method

.method public h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lt3/o0;->a:Lt3/l;

    invoke-interface {v0}, Lt3/l;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lt3/o0;->a:Lt3/l;

    invoke-interface {v0}, Lt3/l;->l()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public r()J
    .locals 2

    iget-wide v0, p0, Lt3/o0;->b:J

    return-wide v0
.end method

.method public s()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lt3/o0;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public t()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lt3/o0;->d:Ljava/util/Map;

    return-object v0
.end method

.method public u()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lt3/o0;->b:J

    return-void
.end method
