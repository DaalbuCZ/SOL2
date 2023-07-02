.class final Lz2/k0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:Lt3/a;

.field public d:Lz2/k0$a;


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2, p3}, Lz2/k0$a;->d(JI)V

    return-void
.end method


# virtual methods
.method public a()Lt3/a;
    .locals 1

    iget-object v0, p0, Lz2/k0$a;->c:Lt3/a;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt3/a;

    return-object v0
.end method

.method public b()Lz2/k0$a;
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lz2/k0$a;->c:Lt3/a;

    iget-object v1, p0, Lz2/k0$a;->d:Lz2/k0$a;

    iput-object v0, p0, Lz2/k0$a;->d:Lz2/k0$a;

    return-object v1
.end method

.method public c(Lt3/a;Lz2/k0$a;)V
    .locals 0

    iput-object p1, p0, Lz2/k0$a;->c:Lt3/a;

    iput-object p2, p0, Lz2/k0$a;->d:Lz2/k0$a;

    return-void
.end method

.method public d(JI)V
    .locals 2

    iget-object v0, p0, Lz2/k0$a;->c:Lt3/a;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu3/a;->f(Z)V

    iput-wide p1, p0, Lz2/k0$a;->a:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lz2/k0$a;->b:J

    return-void
.end method

.method public e(J)I
    .locals 2

    iget-wide v0, p0, Lz2/k0$a;->a:J

    sub-long/2addr p1, v0

    long-to-int p1, p1

    iget-object p2, p0, Lz2/k0$a;->c:Lt3/a;

    iget p2, p2, Lt3/a;->b:I

    add-int/2addr p1, p2

    return p1
.end method

.method public next()Lt3/b$a;
    .locals 2

    iget-object v0, p0, Lz2/k0$a;->d:Lz2/k0$a;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lz2/k0$a;->c:Lt3/a;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
