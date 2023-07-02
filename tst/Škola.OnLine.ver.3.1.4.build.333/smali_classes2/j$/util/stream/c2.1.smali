.class Lj$/util/stream/c2;
.super Lj$/util/stream/m2;


# instance fields
.field public final synthetic b:I

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lj$/util/stream/c;Lj$/util/stream/q2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lj$/util/stream/c2;->b:I

    iput-object p1, p0, Lj$/util/stream/c2;->c:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lj$/util/stream/m2;-><init>(Lj$/util/stream/q2;)V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lj$/util/stream/c2;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1
    :pswitch_0
    iget-object v0, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    iget-object v1, p0, Lj$/util/stream/c2;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/stream/x;

    iget-object v1, v1, Lj$/util/stream/x;->v:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/B;

    invoke-interface {v1, p1}, Lj$/util/function/B;->t(Ljava/lang/Object;)D

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lj$/util/stream/q2;->c(D)V

    return-void

    .line 2
    :pswitch_1
    iget-object v0, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    iget-object v1, p0, Lj$/util/stream/c2;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/stream/A;

    iget-object v1, v1, Lj$/util/stream/A;->v:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/D;

    invoke-interface {v1, p1}, Lj$/util/function/D;->g(Ljava/lang/Object;)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lj$/util/stream/q2;->e(J)V

    return-void

    .line 3
    :pswitch_2
    iget-object v0, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    iget-object v1, p0, Lj$/util/stream/c2;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/stream/z;

    iget-object v1, v1, Lj$/util/stream/z;->v:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/C;

    invoke-interface {v1, p1}, Lj$/util/function/C;->f(Ljava/lang/Object;)I

    move-result p1

    invoke-interface {v0, p1}, Lj$/util/stream/q2;->d(I)V

    return-void

    .line 4
    :pswitch_3
    iget-object v0, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    iget-object v1, p0, Lj$/util/stream/c2;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/stream/e2;

    iget-object v1, v1, Lj$/util/stream/e2;->v:Lj$/util/function/Function;

    invoke-interface {v1, p1}, Lj$/util/function/Function;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    .line 5
    :pswitch_4
    iget-object v0, p0, Lj$/util/stream/c2;->c:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/y;

    iget-object v0, v0, Lj$/util/stream/y;->v:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/Predicate;

    invoke-interface {v0, p1}, Lj$/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {v0, p1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void

    .line 6
    :pswitch_5
    iget-object v0, p0, Lj$/util/stream/c2;->c:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/y;

    iget-object v0, v0, Lj$/util/stream/y;->v:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/Consumer;

    invoke-interface {v0, p1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {v0, p1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    .line 7
    :goto_0
    iget-object v0, p0, Lj$/util/stream/c2;->c:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/e2;

    iget-object v0, v0, Lj$/util/stream/e2;->v:Lj$/util/function/Function;

    invoke-interface {v0, p1}, Lj$/util/function/Function;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/Stream;

    if-eqz p1, :cond_1

    :try_start_0
    invoke-interface {p1}, Lj$/util/stream/h;->sequential()Lj$/util/stream/h;

    move-result-object v0

    check-cast v0, Lj$/util/stream/Stream;

    iget-object v1, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {v0, v1}, Lj$/util/stream/Stream;->a(Lj$/util/function/Consumer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-interface {p1}, Lj$/util/stream/h;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0

    :cond_1
    :goto_2
    if-eqz p1, :cond_2

    invoke-interface {p1}, Lj$/util/stream/h;->close()V

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j(J)V
    .locals 3

    iget v0, p0, Lj$/util/stream/c2;->b:I

    const-wide/16 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1
    :sswitch_0
    iget-object p1, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {p1, v1, v2}, Lj$/util/stream/q2;->j(J)V

    return-void

    .line 2
    :sswitch_1
    iget-object p1, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {p1, v1, v2}, Lj$/util/stream/q2;->j(J)V

    return-void

    .line 3
    :goto_0
    iget-object v0, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {v0, p1, p2}, Lj$/util/stream/q2;->j(J)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x6 -> :sswitch_0
    .end sparse-switch
.end method
