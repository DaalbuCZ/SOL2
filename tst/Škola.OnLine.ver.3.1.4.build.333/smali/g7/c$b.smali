.class public final Lg7/c$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lg7/c;",
        "Lg7/c$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lg7/c;->R()Lg7/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lg7/c$a;)V
    .locals 0

    invoke-direct {p0}, Lg7/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/c;

    invoke-virtual {v0}, Lg7/c;->b0()Z

    move-result v0

    return v0
.end method

.method public M(Ljava/util/Map;)Lg7/c$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lg7/c$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/c;

    invoke-static {v0}, Lg7/c;->U(Lg7/c;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public N(Lg7/a$b;)Lg7/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/c;

    invoke-virtual {p1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object p1

    check-cast p1, Lg7/a;

    invoke-static {v0, p1}, Lg7/c;->W(Lg7/c;Lg7/a;)V

    return-object p0
.end method

.method public O(Ljava/lang/String;)Lg7/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/c;

    invoke-static {v0, p1}, Lg7/c;->V(Lg7/c;Ljava/lang/String;)V

    return-object p0
.end method

.method public P(Lg7/d;)Lg7/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/c;

    invoke-static {v0, p1}, Lg7/c;->T(Lg7/c;Lg7/d;)V

    return-object p0
.end method

.method public Q(Ljava/lang/String;)Lg7/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/c;

    invoke-static {v0, p1}, Lg7/c;->S(Lg7/c;Ljava/lang/String;)V

    return-object p0
.end method
