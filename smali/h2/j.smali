.class public final Lh2/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh2/i0$c;


# instance fields
.field private final a:I

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls1/m1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-static {}, Lb5/q;->J()Lb5/q;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lh2/j;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ls1/m1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh2/j;->a:I

    iput-object p2, p0, Lh2/j;->b:Ljava/util/List;

    return-void
.end method

.method private c(Lh2/i0$b;)Lh2/d0;
    .locals 1

    new-instance v0, Lh2/d0;

    invoke-direct {p0, p1}, Lh2/j;->e(Lh2/i0$b;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lh2/d0;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private d(Lh2/i0$b;)Lh2/k0;
    .locals 1

    new-instance v0, Lh2/k0;

    invoke-direct {p0, p1}, Lh2/j;->e(Lh2/i0$b;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lh2/k0;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private e(Lh2/i0$b;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh2/i0$b;",
            ")",
            "Ljava/util/List<",
            "Ls1/m1;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lh2/j;->f(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lh2/j;->b:Ljava/util/List;

    return-object p1

    :cond_0
    new-instance v0, Lp3/a0;

    iget-object p1, p1, Lh2/i0$b;->d:[B

    invoke-direct {v0, p1}, Lp3/a0;-><init>([B)V

    iget-object p1, p0, Lh2/j;->b:Ljava/util/List;

    :goto_0
    invoke-virtual {v0}, Lp3/a0;->a()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {v0}, Lp3/a0;->C()I

    move-result v1

    invoke-virtual {v0}, Lp3/a0;->C()I

    move-result v2

    invoke-virtual {v0}, Lp3/a0;->e()I

    move-result v3

    add-int/2addr v3, v2

    const/16 v2, 0x86

    if-ne v1, v2, :cond_5

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lp3/a0;->C()I

    move-result v1

    and-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x0

    move v4, v2

    :goto_1
    if-ge v4, v1, :cond_5

    const/4 v5, 0x3

    invoke-virtual {v0, v5}, Lp3/a0;->z(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lp3/a0;->C()I

    move-result v6

    and-int/lit16 v7, v6, 0x80

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    move v7, v8

    goto :goto_2

    :cond_1
    move v7, v2

    :goto_2
    if-eqz v7, :cond_2

    and-int/lit8 v6, v6, 0x3f

    const-string v9, "application/cea-708"

    goto :goto_3

    :cond_2
    const-string v9, "application/cea-608"

    move v6, v8

    :goto_3
    invoke-virtual {v0}, Lp3/a0;->C()I

    move-result v10

    int-to-byte v10, v10

    invoke-virtual {v0, v8}, Lp3/a0;->P(I)V

    const/4 v11, 0x0

    if-eqz v7, :cond_4

    and-int/lit8 v7, v10, 0x40

    if-eqz v7, :cond_3

    goto :goto_4

    :cond_3
    move v8, v2

    :goto_4
    invoke-static {v8}, Lp3/e;->b(Z)Ljava/util/List;

    move-result-object v11

    :cond_4
    new-instance v7, Ls1/m1$b;

    invoke-direct {v7}, Ls1/m1$b;-><init>()V

    invoke-virtual {v7, v9}, Ls1/m1$b;->e0(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v7

    invoke-virtual {v7, v5}, Ls1/m1$b;->V(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v5

    invoke-virtual {v5, v6}, Ls1/m1$b;->F(I)Ls1/m1$b;

    move-result-object v5

    invoke-virtual {v5, v11}, Ls1/m1$b;->T(Ljava/util/List;)Ls1/m1$b;

    move-result-object v5

    invoke-virtual {v5}, Ls1/m1$b;->E()Ls1/m1;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v0, v3}, Lp3/a0;->O(I)V

    goto :goto_0

    :cond_6
    return-object p1
.end method

.method private f(I)Z
    .locals 1

    iget v0, p0, Lh2/j;->a:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public a()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lh2/i0;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    return-object v0
.end method

.method public b(ILh2/i0$b;)Lh2/i0;
    .locals 4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_e

    const/4 v1, 0x3

    if-eq p1, v1, :cond_d

    const/4 v1, 0x4

    if-eq p1, v1, :cond_d

    const/16 v2, 0x15

    if-eq p1, v2, :cond_c

    const/16 v2, 0x1b

    const/4 v3, 0x0

    if-eq p1, v2, :cond_a

    const/16 v1, 0x24

    if-eq p1, v1, :cond_9

    const/16 v1, 0x59

    if-eq p1, v1, :cond_8

    const/16 v1, 0x8a

    if-eq p1, v1, :cond_7

    const/16 v1, 0xac

    if-eq p1, v1, :cond_6

    const/16 v1, 0x101

    if-eq p1, v1, :cond_5

    const/16 v1, 0x86

    if-eq p1, v1, :cond_3

    const/16 v1, 0x87

    if-eq p1, v1, :cond_2

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    return-object v3

    :pswitch_0
    const/16 p1, 0x40

    invoke-direct {p0, p1}, Lh2/j;->f(I)Z

    move-result p1

    if-nez p1, :cond_7

    return-object v3

    :pswitch_1
    invoke-direct {p0, v0}, Lh2/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lh2/w;

    new-instance p1, Lh2/s;

    iget-object p2, p2, Lh2/i0$b;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Lh2/s;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, p1}, Lh2/w;-><init>(Lh2/m;)V

    :goto_0
    return-object v3

    :pswitch_2
    new-instance p1, Lh2/w;

    new-instance v0, Lh2/o;

    invoke-direct {p0, p2}, Lh2/j;->d(Lh2/i0$b;)Lh2/k0;

    move-result-object p2

    invoke-direct {v0, p2}, Lh2/o;-><init>(Lh2/k0;)V

    invoke-direct {p1, v0}, Lh2/w;-><init>(Lh2/m;)V

    return-object p1

    :pswitch_3
    invoke-direct {p0, v0}, Lh2/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v3, Lh2/w;

    new-instance p1, Lh2/i;

    const/4 v0, 0x0

    iget-object p2, p2, Lh2/i0$b;->b:Ljava/lang/String;

    invoke-direct {p1, v0, p2}, Lh2/i;-><init>(ZLjava/lang/String;)V

    invoke-direct {v3, p1}, Lh2/w;-><init>(Lh2/m;)V

    :goto_1
    return-object v3

    :cond_2
    :pswitch_4
    new-instance p1, Lh2/w;

    new-instance v0, Lh2/c;

    iget-object p2, p2, Lh2/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lh2/c;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lh2/w;-><init>(Lh2/m;)V

    return-object p1

    :cond_3
    const/16 p1, 0x10

    invoke-direct {p0, p1}, Lh2/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    new-instance v3, Lh2/c0;

    new-instance p1, Lh2/v;

    const-string p2, "application/x-scte35"

    invoke-direct {p1, p2}, Lh2/v;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, p1}, Lh2/c0;-><init>(Lh2/b0;)V

    :goto_2
    return-object v3

    :cond_5
    new-instance p1, Lh2/c0;

    new-instance p2, Lh2/v;

    const-string v0, "application/vnd.dvb.ait"

    invoke-direct {p2, v0}, Lh2/v;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lh2/c0;-><init>(Lh2/b0;)V

    return-object p1

    :cond_6
    new-instance p1, Lh2/w;

    new-instance v0, Lh2/f;

    iget-object p2, p2, Lh2/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lh2/f;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lh2/w;-><init>(Lh2/m;)V

    return-object p1

    :cond_7
    new-instance p1, Lh2/w;

    new-instance v0, Lh2/k;

    iget-object p2, p2, Lh2/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lh2/k;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lh2/w;-><init>(Lh2/m;)V

    return-object p1

    :cond_8
    new-instance p1, Lh2/w;

    new-instance v0, Lh2/l;

    iget-object p2, p2, Lh2/i0$b;->c:Ljava/util/List;

    invoke-direct {v0, p2}, Lh2/l;-><init>(Ljava/util/List;)V

    invoke-direct {p1, v0}, Lh2/w;-><init>(Lh2/m;)V

    return-object p1

    :cond_9
    new-instance p1, Lh2/w;

    new-instance v0, Lh2/q;

    invoke-direct {p0, p2}, Lh2/j;->c(Lh2/i0$b;)Lh2/d0;

    move-result-object p2

    invoke-direct {v0, p2}, Lh2/q;-><init>(Lh2/d0;)V

    invoke-direct {p1, v0}, Lh2/w;-><init>(Lh2/m;)V

    return-object p1

    :cond_a
    invoke-direct {p0, v1}, Lh2/j;->f(I)Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_3

    :cond_b
    new-instance v3, Lh2/w;

    new-instance p1, Lh2/p;

    invoke-direct {p0, p2}, Lh2/j;->c(Lh2/i0$b;)Lh2/d0;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lh2/j;->f(I)Z

    move-result v0

    const/16 v1, 0x8

    invoke-direct {p0, v1}, Lh2/j;->f(I)Z

    move-result v1

    invoke-direct {p1, p2, v0, v1}, Lh2/p;-><init>(Lh2/d0;ZZ)V

    invoke-direct {v3, p1}, Lh2/w;-><init>(Lh2/m;)V

    :goto_3
    return-object v3

    :cond_c
    new-instance p1, Lh2/w;

    new-instance p2, Lh2/r;

    invoke-direct {p2}, Lh2/r;-><init>()V

    invoke-direct {p1, p2}, Lh2/w;-><init>(Lh2/m;)V

    return-object p1

    :cond_d
    new-instance p1, Lh2/w;

    new-instance v0, Lh2/t;

    iget-object p2, p2, Lh2/i0$b;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lh2/t;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lh2/w;-><init>(Lh2/m;)V

    return-object p1

    :cond_e
    :pswitch_5
    new-instance p1, Lh2/w;

    new-instance v0, Lh2/n;

    invoke-direct {p0, p2}, Lh2/j;->d(Lh2/i0$b;)Lh2/k0;

    move-result-object p2

    invoke-direct {v0, p2}, Lh2/n;-><init>(Lh2/k0;)V

    invoke-direct {p1, v0}, Lh2/w;-><init>(Lh2/m;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method
