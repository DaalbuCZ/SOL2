.class final Le2/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le2/a;


# instance fields
.field public final a:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Le2/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:I


# direct methods
.method private constructor <init>(ILg5/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lg5/q<",
            "Le2/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le2/f;->b:I

    iput-object p2, p0, Le2/f;->a:Lg5/q;

    return-void
.end method

.method private static a(IILu3/a0;)Le2/a;
    .locals 0

    sparse-switch p0, :sswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :sswitch_0
    invoke-static {p2}, Le2/h;->a(Lu3/a0;)Le2/h;

    move-result-object p0

    return-object p0

    :sswitch_1
    invoke-static {p2}, Le2/d;->c(Lu3/a0;)Le2/d;

    move-result-object p0

    return-object p0

    :sswitch_2
    invoke-static {p2}, Le2/c;->b(Lu3/a0;)Le2/c;

    move-result-object p0

    return-object p0

    :sswitch_3
    invoke-static {p1, p2}, Le2/g;->d(ILu3/a0;)Le2/a;

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

.method public static c(ILu3/a0;)Le2/f;
    .locals 7

    new-instance v0, Lg5/q$a;

    invoke-direct {v0}, Lg5/q$a;-><init>()V

    invoke-virtual {p1}, Lu3/a0;->g()I

    move-result v1

    const/4 v2, -0x2

    :goto_0
    invoke-virtual {p1}, Lu3/a0;->a()I

    move-result v3

    const/16 v4, 0x8

    if-le v3, v4, :cond_3

    invoke-virtual {p1}, Lu3/a0;->r()I

    move-result v3

    invoke-virtual {p1}, Lu3/a0;->r()I

    move-result v4

    invoke-virtual {p1}, Lu3/a0;->f()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {p1, v5}, Lu3/a0;->Q(I)V

    const v4, 0x5453494c

    if-ne v3, v4, :cond_0

    invoke-virtual {p1}, Lu3/a0;->r()I

    move-result v3

    invoke-static {v3, p1}, Le2/f;->c(ILu3/a0;)Le2/f;

    move-result-object v3

    goto :goto_1

    :cond_0
    invoke-static {v3, v2, p1}, Le2/f;->a(IILu3/a0;)Le2/a;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_2

    invoke-interface {v3}, Le2/a;->getType()I

    move-result v4

    const v6, 0x68727473

    if-ne v4, v6, :cond_1

    move-object v2, v3

    check-cast v2, Le2/d;

    invoke-virtual {v2}, Le2/d;->b()I

    move-result v2

    :cond_1
    invoke-virtual {v0, v3}, Lg5/q$a;->f(Ljava/lang/Object;)Lg5/q$a;

    :cond_2
    invoke-virtual {p1, v5}, Lu3/a0;->R(I)V

    invoke-virtual {p1, v1}, Lu3/a0;->Q(I)V

    goto :goto_0

    :cond_3
    new-instance p1, Le2/f;

    invoke-virtual {v0}, Lg5/q$a;->h()Lg5/q;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Le2/f;-><init>(ILg5/q;)V

    return-object p1
.end method


# virtual methods
.method public b(Ljava/lang/Class;)Le2/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Le2/a;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Le2/f;->a:Lg5/q;

    invoke-virtual {v0}, Lg5/q;->v()Lg5/s0;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le2/a;

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

    iget v0, p0, Le2/f;->b:I

    return v0
.end method
