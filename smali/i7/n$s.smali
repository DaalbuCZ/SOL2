.class Li7/n$s;
.super Lf7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf7/w<",
        "Lf7/k;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf7/w;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ln7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Li7/n$s;->f(Ln7/a;)Lf7/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ln7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lf7/k;

    invoke-virtual {p0, p1, p2}, Li7/n$s;->g(Ln7/c;Lf7/k;)V

    return-void
.end method

.method public f(Ln7/a;)Lf7/k;
    .locals 3

    instance-of v0, p1, Li7/f;

    if-eqz v0, :cond_0

    check-cast p1, Li7/f;

    invoke-virtual {p1}, Li7/f;->m0()Lf7/k;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Li7/n$z;->a:[I

    invoke-virtual {p1}, Ln7/a;->Z()Ln7/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    new-instance v0, Lf7/n;

    invoke-direct {v0}, Lf7/n;-><init>()V

    invoke-virtual {p1}, Ln7/a;->b()V

    :goto_0
    invoke-virtual {p1}, Ln7/a;->r()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ln7/a;->O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Li7/n$s;->f(Ln7/a;)Lf7/k;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lf7/n;->C(Ljava/lang/String;Lf7/k;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ln7/a;->o()V

    return-object v0

    :pswitch_1
    new-instance v0, Lf7/h;

    invoke-direct {v0}, Lf7/h;-><init>()V

    invoke-virtual {p1}, Ln7/a;->a()V

    :goto_1
    invoke-virtual {p1}, Ln7/a;->r()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1}, Li7/n$s;->f(Ln7/a;)Lf7/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/h;->C(Lf7/k;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ln7/a;->k()V

    return-object v0

    :pswitch_2
    invoke-virtual {p1}, Ln7/a;->S()V

    sget-object p1, Lf7/m;->a:Lf7/m;

    return-object p1

    :pswitch_3
    new-instance v0, Lf7/p;

    invoke-virtual {p1}, Ln7/a;->X()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf7/p;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lf7/p;

    invoke-virtual {p1}, Ln7/a;->D()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lf7/p;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :pswitch_5
    invoke-virtual {p1}, Ln7/a;->X()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lf7/p;

    new-instance v1, Lh7/g;

    invoke-direct {v1, p1}, Lh7/g;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lf7/p;-><init>(Ljava/lang/Number;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Ln7/c;Lf7/k;)V
    .locals 2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lf7/k;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Lf7/k;->x()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lf7/k;->h()Lf7/p;

    move-result-object p2

    invoke-virtual {p2}, Lf7/p;->J()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lf7/p;->G()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln7/c;->b0(Ljava/lang/Number;)Ln7/c;

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p2}, Lf7/p;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lf7/p;->C()Z

    move-result p2

    invoke-virtual {p1, p2}, Ln7/c;->d0(Z)Ln7/c;

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p2}, Lf7/p;->k()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln7/c;->c0(Ljava/lang/String;)Ln7/c;

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p2}, Lf7/k;->l()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ln7/c;->c()Ln7/c;

    invoke-virtual {p2}, Lf7/k;->d()Lf7/h;

    move-result-object p2

    invoke-virtual {p2}, Lf7/h;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf7/k;

    invoke-virtual {p0, p1, v0}, Li7/n$s;->g(Ln7/c;Lf7/k;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Ln7/c;->k()Ln7/c;

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Lf7/k;->v()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ln7/c;->f()Ln7/c;

    invoke-virtual {p2}, Lf7/k;->g()Lf7/n;

    move-result-object p2

    invoke-virtual {p2}, Lf7/n;->D()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ln7/c;->y(Ljava/lang/String;)Ln7/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf7/k;

    invoke-virtual {p0, p1, v0}, Li7/n$s;->g(Ln7/c;Lf7/k;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Ln7/c;->o()Ln7/c;

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t write "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    invoke-virtual {p1}, Ln7/c;->D()Ln7/c;

    :goto_3
    return-void
.end method
