.class public abstract Lb3/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/h0$e;


# instance fields
.field public final a:J

.field public final b:Lt3/p;

.field public final c:I

.field public final d:Lx1/n1;

.field public final e:I

.field public final f:Ljava/lang/Object;

.field public final g:J

.field public final h:J

.field protected final i:Lt3/o0;


# direct methods
.method public constructor <init>(Lt3/l;Lt3/p;ILx1/n1;ILjava/lang/Object;JJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt3/o0;

    invoke-direct {v0, p1}, Lt3/o0;-><init>(Lt3/l;)V

    iput-object v0, p0, Lb3/f;->i:Lt3/o0;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt3/p;

    iput-object p1, p0, Lb3/f;->b:Lt3/p;

    iput p3, p0, Lb3/f;->c:I

    iput-object p4, p0, Lb3/f;->d:Lx1/n1;

    iput p5, p0, Lb3/f;->e:I

    iput-object p6, p0, Lb3/f;->f:Ljava/lang/Object;

    iput-wide p7, p0, Lb3/f;->g:J

    iput-wide p9, p0, Lb3/f;->h:J

    invoke-static {}, Lz2/n;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lb3/f;->a:J

    return-void
.end method


# virtual methods
.method public final c()J
    .locals 2

    iget-object v0, p0, Lb3/f;->i:Lt3/o0;

    invoke-virtual {v0}, Lt3/o0;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()J
    .locals 4

    iget-wide v0, p0, Lb3/f;->h:J

    iget-wide v2, p0, Lb3/f;->g:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final e()Ljava/util/Map;
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

    iget-object v0, p0, Lb3/f;->i:Lt3/o0;

    invoke-virtual {v0}, Lt3/o0;->t()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final f()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lb3/f;->i:Lt3/o0;

    invoke-virtual {v0}, Lt3/o0;->s()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
