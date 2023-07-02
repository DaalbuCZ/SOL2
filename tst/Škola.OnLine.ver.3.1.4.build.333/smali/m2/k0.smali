.class final Lm2/k0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx1/n1;",
            ">;"
        }
    .end annotation
.end field

.field private final b:[Lc2/e0;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lx1/n1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/k0;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lc2/e0;

    iput-object p1, p0, Lm2/k0;->b:[Lc2/e0;

    return-void
.end method


# virtual methods
.method public a(JLu3/a0;)V
    .locals 4

    invoke-virtual {p3}, Lu3/a0;->a()I

    move-result v0

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3}, Lu3/a0;->n()I

    move-result v0

    invoke-virtual {p3}, Lu3/a0;->n()I

    move-result v1

    invoke-virtual {p3}, Lu3/a0;->E()I

    move-result v2

    const/16 v3, 0x1b2

    if-ne v0, v3, :cond_1

    const v0, 0x47413934

    if-ne v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v2, v0, :cond_1

    iget-object v0, p0, Lm2/k0;->b:[Lc2/e0;

    invoke-static {p1, p2, p3, v0}, Lc2/c;->b(JLu3/a0;[Lc2/e0;)V

    :cond_1
    return-void
.end method

.method public b(Lc2/n;Lm2/i0$d;)V
    .locals 8

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lm2/k0;->b:[Lc2/e0;

    array-length v2, v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p2}, Lm2/i0$d;->a()V

    invoke-virtual {p2}, Lm2/i0$d;->c()I

    move-result v2

    const/4 v3, 0x3

    invoke-interface {p1, v2, v3}, Lc2/n;->d(II)Lc2/e0;

    move-result-object v2

    iget-object v3, p0, Lm2/k0;->a:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx1/n1;

    iget-object v4, v3, Lx1/n1;->y:Ljava/lang/String;

    const-string v5, "application/cea-608"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "application/cea-708"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    move v5, v0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v5, 0x1

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid closed caption mime type provided: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lu3/a;->b(ZLjava/lang/Object;)V

    new-instance v5, Lx1/n1$b;

    invoke-direct {v5}, Lx1/n1$b;-><init>()V

    invoke-virtual {p2}, Lm2/i0$d;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lx1/n1$b;->U(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v5

    invoke-virtual {v5, v4}, Lx1/n1$b;->g0(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v4

    iget v5, v3, Lx1/n1;->q:I

    invoke-virtual {v4, v5}, Lx1/n1$b;->i0(I)Lx1/n1$b;

    move-result-object v4

    iget-object v5, v3, Lx1/n1;->p:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lx1/n1$b;->X(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v4

    iget v5, v3, Lx1/n1;->Q:I

    invoke-virtual {v4, v5}, Lx1/n1$b;->H(I)Lx1/n1$b;

    move-result-object v4

    iget-object v3, v3, Lx1/n1;->A:Ljava/util/List;

    invoke-virtual {v4, v3}, Lx1/n1$b;->V(Ljava/util/List;)Lx1/n1$b;

    move-result-object v3

    invoke-virtual {v3}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object v3

    invoke-interface {v2, v3}, Lc2/e0;->a(Lx1/n1;)V

    iget-object v3, p0, Lm2/k0;->b:[Lc2/e0;

    aput-object v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
