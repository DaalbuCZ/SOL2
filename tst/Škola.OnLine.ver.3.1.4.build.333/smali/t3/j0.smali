.class public final Lt3/j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/h0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt3/j0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt3/h0$e;"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Lt3/p;

.field public final c:I

.field private final d:Lt3/o0;

.field private final e:Lt3/j0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/j0$a<",
            "+TT;>;"
        }
    .end annotation
.end field

.field private volatile f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt3/l;Landroid/net/Uri;ILt3/j0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/l;",
            "Landroid/net/Uri;",
            "I",
            "Lt3/j0$a<",
            "+TT;>;)V"
        }
    .end annotation

    new-instance v0, Lt3/p$b;

    invoke-direct {v0}, Lt3/p$b;-><init>()V

    invoke-virtual {v0, p2}, Lt3/p$b;->i(Landroid/net/Uri;)Lt3/p$b;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lt3/p$b;->b(I)Lt3/p$b;

    move-result-object p2

    invoke-virtual {p2}, Lt3/p$b;->a()Lt3/p;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, Lt3/j0;-><init>(Lt3/l;Lt3/p;ILt3/j0$a;)V

    return-void
.end method

.method public constructor <init>(Lt3/l;Lt3/p;ILt3/j0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/l;",
            "Lt3/p;",
            "I",
            "Lt3/j0$a<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt3/o0;

    invoke-direct {v0, p1}, Lt3/o0;-><init>(Lt3/l;)V

    iput-object v0, p0, Lt3/j0;->d:Lt3/o0;

    iput-object p2, p0, Lt3/j0;->b:Lt3/p;

    iput p3, p0, Lt3/j0;->c:I

    iput-object p4, p0, Lt3/j0;->e:Lt3/j0$a;

    invoke-static {}, Lz2/n;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lt3/j0;->a:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lt3/j0;->d:Lt3/o0;

    invoke-virtual {v0}, Lt3/o0;->u()V

    new-instance v0, Lt3/n;

    iget-object v1, p0, Lt3/j0;->d:Lt3/o0;

    iget-object v2, p0, Lt3/j0;->b:Lt3/p;

    invoke-direct {v0, v1, v2}, Lt3/n;-><init>(Lt3/l;Lt3/p;)V

    :try_start_0
    invoke-virtual {v0}, Lt3/n;->b()V

    iget-object v1, p0, Lt3/j0;->d:Lt3/o0;

    invoke-virtual {v1}, Lt3/o0;->l()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    iget-object v2, p0, Lt3/j0;->e:Lt3/j0$a;

    invoke-interface {v2, v1, v0}, Lt3/j0$a;->a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lt3/j0;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lu3/n0;->n(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Lu3/n0;->n(Ljava/io/Closeable;)V

    throw v1
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lt3/j0;->d:Lt3/o0;

    invoke-virtual {v0}, Lt3/o0;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public d()Ljava/util/Map;
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

    iget-object v0, p0, Lt3/j0;->d:Lt3/o0;

    invoke-virtual {v0}, Lt3/o0;->t()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lt3/j0;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public f()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lt3/j0;->d:Lt3/o0;

    invoke-virtual {v0}, Lt3/o0;->s()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
