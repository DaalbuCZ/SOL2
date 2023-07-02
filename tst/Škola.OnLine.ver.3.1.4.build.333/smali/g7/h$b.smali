.class public final Lg7/h$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lg7/h;",
        "Lg7/h$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lg7/h;->R()Lg7/h;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lg7/h$a;)V
    .locals 0

    invoke-direct {p0}, Lg7/h$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L(Ljava/lang/Iterable;)Lg7/h$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lg7/k;",
            ">;)",
            "Lg7/h$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1}, Lg7/h;->c0(Lg7/h;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public M()Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0}, Lg7/h;->b0(Lg7/h;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-object p0
.end method

.method public N()Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0}, Lg7/h;->W(Lg7/h;)V

    return-object p0
.end method

.method public O()J
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-virtual {v0}, Lg7/h;->u0()J

    move-result-wide v0

    return-wide v0
.end method

.method public P()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-virtual {v0}, Lg7/h;->v0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public Q()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-virtual {v0}, Lg7/h;->w0()Z

    move-result v0

    return v0
.end method

.method public R()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-virtual {v0}, Lg7/h;->y0()Z

    move-result v0

    return v0
.end method

.method public S()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-virtual {v0}, Lg7/h;->C0()Z

    move-result v0

    return v0
.end method

.method public T(Ljava/util/Map;)Lg7/h$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lg7/h$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0}, Lg7/h;->b0(Lg7/h;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public U(J)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1, p2}, Lg7/h;->X(Lg7/h;J)V

    return-object p0
.end method

.method public V(Lg7/h$d;)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1}, Lg7/h;->d0(Lg7/h;Lg7/h$d;)V

    return-object p0
.end method

.method public W(I)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1}, Lg7/h;->U(Lg7/h;I)V

    return-object p0
.end method

.method public X(Lg7/h$e;)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1}, Lg7/h;->T(Lg7/h;Lg7/h$e;)V

    return-object p0
.end method

.method public Y(J)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1, p2}, Lg7/h;->e0(Lg7/h;J)V

    return-object p0
.end method

.method public Z(Ljava/lang/String;)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1}, Lg7/h;->V(Lg7/h;Ljava/lang/String;)V

    return-object p0
.end method

.method public a0(J)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1, p2}, Lg7/h;->f0(Lg7/h;J)V

    return-object p0
.end method

.method public b0(J)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1, p2}, Lg7/h;->Y(Lg7/h;J)V

    return-object p0
.end method

.method public c0(J)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1, p2}, Lg7/h;->a0(Lg7/h;J)V

    return-object p0
.end method

.method public d0(J)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1, p2}, Lg7/h;->Z(Lg7/h;J)V

    return-object p0
.end method

.method public e0(Ljava/lang/String;)Lg7/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/h;

    invoke-static {v0, p1}, Lg7/h;->S(Lg7/h;Ljava/lang/String;)V

    return-object p0
.end method
