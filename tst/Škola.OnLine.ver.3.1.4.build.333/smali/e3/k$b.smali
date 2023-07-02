.class Le3/k$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le3/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic n:Le3/k;


# direct methods
.method private constructor <init>(Le3/k;)V
    .locals 0

    iput-object p1, p0, Le3/k$b;->n:Le3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Le3/k;Le3/k$a;)V
    .locals 0

    invoke-direct {p0, p1}, Le3/k$b;-><init>(Le3/k;)V

    return-void
.end method


# virtual methods
.method public a(Le3/p;)V
    .locals 1

    iget-object p1, p0, Le3/k$b;->n:Le3/k;

    invoke-static {p1}, Le3/k;->p(Le3/k;)Lz2/r$a;

    move-result-object p1

    iget-object v0, p0, Le3/k$b;->n:Le3/k;

    invoke-interface {p1, v0}, Lz2/o0$a;->k(Lz2/o0;)V

    return-void
.end method

.method public b()V
    .locals 11

    iget-object v0, p0, Le3/k$b;->n:Le3/k;

    invoke-static {v0}, Le3/k;->i(Le3/k;)I

    move-result v0

    if-lez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le3/k$b;->n:Le3/k;

    invoke-static {v0}, Le3/k;->k(Le3/k;)[Le3/p;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    invoke-virtual {v5}, Le3/p;->o()Lz2/v0;

    move-result-object v5

    iget v5, v5, Lz2/v0;->n:I

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-array v0, v4, [Lz2/t0;

    iget-object v1, p0, Le3/k$b;->n:Le3/k;

    invoke-static {v1}, Le3/k;->k(Le3/k;)[Le3/p;

    move-result-object v1

    array-length v3, v1

    move v4, v2

    move v5, v4

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v6, v1, v4

    invoke-virtual {v6}, Le3/p;->o()Lz2/v0;

    move-result-object v7

    iget v7, v7, Lz2/v0;->n:I

    move v8, v2

    :goto_2
    if-ge v8, v7, :cond_2

    add-int/lit8 v9, v5, 0x1

    invoke-virtual {v6}, Le3/p;->o()Lz2/v0;

    move-result-object v10

    invoke-virtual {v10, v8}, Lz2/v0;->b(I)Lz2/t0;

    move-result-object v10

    aput-object v10, v0, v5

    add-int/lit8 v8, v8, 0x1

    move v5, v9

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    iget-object v1, p0, Le3/k$b;->n:Le3/k;

    new-instance v2, Lz2/v0;

    invoke-direct {v2, v0}, Lz2/v0;-><init>([Lz2/t0;)V

    invoke-static {v1, v2}, Le3/k;->m(Le3/k;Lz2/v0;)Lz2/v0;

    iget-object v0, p0, Le3/k$b;->n:Le3/k;

    invoke-static {v0}, Le3/k;->p(Le3/k;)Lz2/r$a;

    move-result-object v0

    iget-object v1, p0, Le3/k$b;->n:Le3/k;

    invoke-interface {v0, v1}, Lz2/r$a;->d(Lz2/r;)V

    return-void
.end method

.method public bridge synthetic k(Lz2/o0;)V
    .locals 0

    check-cast p1, Le3/p;

    invoke-virtual {p0, p1}, Le3/k$b;->a(Le3/p;)V

    return-void
.end method

.method public m(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Le3/k$b;->n:Le3/k;

    invoke-static {v0}, Le3/k;->s(Le3/k;)Lf3/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lf3/l;->i(Landroid/net/Uri;)V

    return-void
.end method
