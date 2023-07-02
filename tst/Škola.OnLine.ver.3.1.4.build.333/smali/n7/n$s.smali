.class Ln7/n$s;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk7/w<",
        "Lk7/k;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk7/w;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ls7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln7/n$s;->f(Ls7/a;)Lk7/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ls7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lk7/k;

    invoke-virtual {p0, p1, p2}, Ln7/n$s;->g(Ls7/c;Lk7/k;)V

    return-void
.end method

.method public f(Ls7/a;)Lk7/k;
    .locals 3

    instance-of v0, p1, Ln7/f;

    if-eqz v0, :cond_0

    check-cast p1, Ln7/f;

    invoke-virtual {p1}, Ln7/f;->m0()Lk7/k;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Ln7/n$z;->a:[I

    invoke-virtual {p1}, Ls7/a;->Z()Ls7/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    new-instance v0, Lk7/n;

    invoke-direct {v0}, Lk7/n;-><init>()V

    invoke-virtual {p1}, Ls7/a;->b()V

    :goto_0
    invoke-virtual {p1}, Ls7/a;->v()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ls7/a;->Q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Ln7/n$s;->f(Ls7/a;)Lk7/k;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lk7/n;->C(Ljava/lang/String;Lk7/k;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ls7/a;->n()V

    return-object v0

    :pswitch_1
    new-instance v0, Lk7/h;

    invoke-direct {v0}, Lk7/h;-><init>()V

    invoke-virtual {p1}, Ls7/a;->a()V

    :goto_1
    invoke-virtual {p1}, Ls7/a;->v()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1}, Ln7/n$s;->f(Ls7/a;)Lk7/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk7/h;->C(Lk7/k;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ls7/a;->l()V

    return-object v0

    :pswitch_2
    invoke-virtual {p1}, Ls7/a;->V()V

    sget-object p1, Lk7/m;->a:Lk7/m;

    return-object p1

    :pswitch_3
    new-instance v0, Lk7/p;

    invoke-virtual {p1}, Ls7/a;->X()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lk7/p;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lk7/p;

    invoke-virtual {p1}, Ls7/a;->F()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lk7/p;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :pswitch_5
    invoke-virtual {p1}, Ls7/a;->X()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lk7/p;

    new-instance v1, Lm7/g;

    invoke-direct {v1, p1}, Lm7/g;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lk7/p;-><init>(Ljava/lang/Number;)V

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

.method public g(Ls7/c;Lk7/k;)V
    .locals 2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lk7/k;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Lk7/k;->x()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lk7/k;->h()Lk7/p;

    move-result-object p2

    invoke-virtual {p2}, Lk7/p;->J()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lk7/p;->G()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls7/c;->b0(Ljava/lang/Number;)Ls7/c;

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p2}, Lk7/p;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lk7/p;->C()Z

    move-result p2

    invoke-virtual {p1, p2}, Ls7/c;->d0(Z)Ls7/c;

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p2}, Lk7/p;->k()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls7/c;->c0(Ljava/lang/String;)Ls7/c;

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p2}, Lk7/k;->l()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ls7/c;->c()Ls7/c;

    invoke-virtual {p2}, Lk7/k;->d()Lk7/h;

    move-result-object p2

    invoke-virtual {p2}, Lk7/h;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk7/k;

    invoke-virtual {p0, p1, v0}, Ln7/n$s;->g(Ls7/c;Lk7/k;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Ls7/c;->l()Ls7/c;

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Lk7/k;->v()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ls7/c;->e()Ls7/c;

    invoke-virtual {p2}, Lk7/k;->g()Lk7/n;

    move-result-object p2

    invoke-virtual {p2}, Lk7/n;->D()Ljava/util/Set;

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

    invoke-virtual {p1, v1}, Ls7/c;->x(Ljava/lang/String;)Ls7/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk7/k;

    invoke-virtual {p0, p1, v0}, Ln7/n$s;->g(Ls7/c;Lk7/k;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Ls7/c;->n()Ls7/c;

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
    invoke-virtual {p1}, Ls7/c;->F()Ls7/c;

    :goto_3
    return-void
.end method
