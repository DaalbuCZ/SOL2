.class final Lz1/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz1/a;


# instance fields
.field public final a:Lb5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/q<",
            "Lz1/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:I


# direct methods
.method private constructor <init>(ILb5/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lb5/q<",
            "Lz1/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz1/f;->b:I

    iput-object p2, p0, Lz1/f;->a:Lb5/q;

    return-void
.end method

.method private static a(IILp3/a0;)Lz1/a;
    .locals 0

    sparse-switch p0, :sswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :sswitch_0
    invoke-static {p2}, Lz1/h;->a(Lp3/a0;)Lz1/h;

    move-result-object p0

    return-object p0

    :sswitch_1
    invoke-static {p2}, Lz1/d;->c(Lp3/a0;)Lz1/d;

    move-result-object p0

    return-object p0

    :sswitch_2
    invoke-static {p2}, Lz1/c;->b(Lp3/a0;)Lz1/c;

    move-result-object p0

    return-object p0

    :sswitch_3
    invoke-static {p1, p2}, Lz1/g;->d(ILp3/a0;)Lz1/a;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x66727473 -> :sswitch_3
        0x68697661 -> :sswitch_2
        0x68727473 -> :sswitch_1
        0x6e727473 -> :sswitch_0
    .end sparse-switch
.end method

.method public static c(ILp3/a0;)Lz1/f;
    .locals 7

    new-instance v0, Lb5/q$a;

    invoke-direct {v0}, Lb5/q$a;-><init>()V

    invoke-virtual {p1}, Lp3/a0;->f()I

    move-result v1

    const/4 v2, -0x2

    :goto_0
    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result v3

    const/16 v4, 0x8

    if-le v3, v4, :cond_3

    invoke-virtual {p1}, Lp3/a0;->p()I

    move-result v3

    invoke-virtual {p1}, Lp3/a0;->p()I

    move-result v4

    invoke-virtual {p1}, Lp3/a0;->e()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {p1, v5}, Lp3/a0;->N(I)V

    const v4, 0x5453494c

    if-ne v3, v4, :cond_0

    invoke-virtual {p1}, Lp3/a0;->p()I

    move-result v3

    invoke-static {v3, p1}, Lz1/f;->c(ILp3/a0;)Lz1/f;

    move-result-object v3

    goto :goto_1

    :cond_0
    invoke-static {v3, v2, p1}, Lz1/f;->a(IILp3/a0;)Lz1/a;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_2

    invoke-interface {v3}, Lz1/a;->getType()I

    move-result v4

    const v6, 0x68727473

    if-ne v4, v6, :cond_1

    move-object v2, v3

    check-cast v2, Lz1/d;

    invoke-virtual {v2}, Lz1/d;->b()I

    move-result v2

    :cond_1
    invoke-virtual {v0, v3}, Lb5/q$a;->f(Ljava/lang/Object;)Lb5/q$a;

    :cond_2
    invoke-virtual {p1, v5}, Lp3/a0;->O(I)V

    invoke-virtual {p1, v1}, Lp3/a0;->N(I)V

    goto :goto_0

    :cond_3
    new-instance p1, Lz1/f;

    invoke-virtual {v0}, Lb5/q$a;->h()Lb5/q;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lz1/f;-><init>(ILb5/q;)V

    return-object p1
.end method


# virtual methods
.method public b(Ljava/lang/Class;)Lz1/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lz1/a;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lz1/f;->a:Lb5/q;

    invoke-virtual {v0}, Lb5/q;->v()Lb5/s0;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz1/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lz1/f;->b:I

    return v0
.end method
