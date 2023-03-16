.class Lj$/util/stream/q;
.super Lj$/util/stream/m2;


# instance fields
.field public final synthetic b:I

.field c:Ljava/lang/Object;

.field final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj$/util/stream/A;Lj$/util/stream/q2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj$/util/stream/q;->b:I

    .line 8
    iput-object p1, p0, Lj$/util/stream/q;->d:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lj$/util/stream/m2;-><init>(Lj$/util/stream/q2;)V

    iget-object p1, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    new-instance p2, Lj$/util/stream/n0;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lj$/util/stream/n0;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Lj$/util/stream/q;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj$/util/stream/r;Lj$/util/stream/q2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lj$/util/stream/q;->b:I

    .line 1
    iput-object p1, p0, Lj$/util/stream/q;->d:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lj$/util/stream/m2;-><init>(Lj$/util/stream/q2;)V

    return-void
.end method

.method public constructor <init>(Lj$/util/stream/x;Lj$/util/stream/q2;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lj$/util/stream/q;->b:I

    .line 2
    iput-object p1, p0, Lj$/util/stream/q;->d:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lj$/util/stream/m2;-><init>(Lj$/util/stream/q2;)V

    iget-object p1, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance p2, Lj$/util/stream/v;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lj$/util/stream/v;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Lj$/util/stream/q;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj$/util/stream/z;Lj$/util/stream/q2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lj$/util/stream/q;->b:I

    .line 5
    iput-object p1, p0, Lj$/util/stream/q;->d:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lj$/util/stream/m2;-><init>(Lj$/util/stream/q2;)V

    iget-object p1, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    .line 6
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    new-instance p2, Lj$/util/stream/c0;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lj$/util/stream/c0;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Lj$/util/stream/q;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lj$/util/stream/q;->b:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 1
    :pswitch_0
    iget-object v0, p0, Lj$/util/stream/q;->d:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/z;

    iget-object v0, v0, Lj$/util/stream/z;->v:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/Function;

    invoke-interface {v0, p1}, Lj$/util/function/Function;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/l0;

    if-eqz p1, :cond_0

    :try_start_0
    invoke-interface {p1}, Lj$/util/stream/l0;->sequential()Lj$/util/stream/l0;

    move-result-object v0

    iget-object v1, p0, Lj$/util/stream/q;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/m;

    invoke-interface {v0, v1}, Lj$/util/stream/l0;->i(Lj$/util/function/m;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0

    :cond_0
    :goto_1
    if-eqz p1, :cond_1

    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V

    :cond_1
    return-void

    .line 2
    :pswitch_1
    iget-object v0, p0, Lj$/util/stream/q;->d:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/A;

    iget-object v0, v0, Lj$/util/stream/A;->v:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/Function;

    invoke-interface {v0, p1}, Lj$/util/function/Function;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/u0;

    if-eqz p1, :cond_2

    :try_start_2
    invoke-interface {p1}, Lj$/util/stream/u0;->sequential()Lj$/util/stream/u0;

    move-result-object v0

    iget-object v1, p0, Lj$/util/stream/q;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/r;

    invoke-interface {v0, v1}, Lj$/util/stream/u0;->c(Lj$/util/function/r;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    :try_start_3
    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0

    :cond_2
    :goto_3
    if-eqz p1, :cond_3

    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V

    :cond_3
    return-void

    .line 3
    :pswitch_2
    iget-object v0, p0, Lj$/util/stream/q;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lj$/util/stream/q;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {v0, p1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_4
    return-void

    .line 4
    :goto_4
    iget-object v0, p0, Lj$/util/stream/q;->d:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/x;

    iget-object v0, v0, Lj$/util/stream/x;->v:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/Function;

    invoke-interface {v0, p1}, Lj$/util/function/Function;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/H;

    if-eqz p1, :cond_5

    :try_start_4
    invoke-interface {p1}, Lj$/util/stream/H;->sequential()Lj$/util/stream/H;

    move-result-object v0

    iget-object v1, p0, Lj$/util/stream/q;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/h;

    invoke-interface {v0, v1}, Lj$/util/stream/H;->f(Lj$/util/function/h;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception v0

    :try_start_5
    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v0

    :cond_5
    :goto_6
    if-eqz p1, :cond_6

    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V

    :cond_6
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h()V
    .locals 1

    iget v0, p0, Lj$/util/stream/q;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lj$/util/stream/q;->c:Ljava/lang/Object;

    iget-object v0, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {v0}, Lj$/util/stream/q2;->h()V

    return-void

    .line 2
    :goto_0
    iget-object v0, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {v0}, Lj$/util/stream/q2;->h()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public j(J)V
    .locals 2

    iget p1, p0, Lj$/util/stream/q;->b:I

    const-wide/16 v0, -0x1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1
    :pswitch_0
    iget-object p1, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {p1, v0, v1}, Lj$/util/stream/q2;->j(J)V

    return-void

    .line 2
    :pswitch_1
    iget-object p1, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {p1, v0, v1}, Lj$/util/stream/q2;->j(J)V

    return-void

    .line 3
    :pswitch_2
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lj$/util/stream/q;->c:Ljava/lang/Object;

    iget-object p1, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {p1, v0, v1}, Lj$/util/stream/q2;->j(J)V

    return-void

    .line 4
    :goto_0
    iget-object p1, p0, Lj$/util/stream/m2;->a:Lj$/util/stream/q2;

    invoke-interface {p1, v0, v1}, Lj$/util/stream/q2;->j(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
