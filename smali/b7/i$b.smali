.class public final Lb7/i$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lb7/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lb7/i;",
        "Lb7/i$b;",
        ">;",
        "Lb7/j;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lb7/i;->R()Lb7/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lb7/i$a;)V
    .locals 0

    invoke-direct {p0}, Lb7/i$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L(Lb7/c$b;)Lb7/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/i;

    invoke-virtual {p1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object p1

    check-cast p1, Lb7/c;

    invoke-static {v0, p1}, Lb7/i;->S(Lb7/i;Lb7/c;)V

    return-object p0
.end method

.method public M(Lb7/g;)Lb7/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/i;

    invoke-static {v0, p1}, Lb7/i;->T(Lb7/i;Lb7/g;)V

    return-object p0
.end method

.method public N(Lb7/h;)Lb7/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/i;

    invoke-static {v0, p1}, Lb7/i;->V(Lb7/i;Lb7/h;)V

    return-object p0
.end method

.method public O(Lb7/m;)Lb7/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/i;

    invoke-static {v0, p1}, Lb7/i;->U(Lb7/i;Lb7/m;)V

    return-object p0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/i;

    invoke-virtual {v0}, Lb7/i;->c()Z

    move-result v0

    return v0
.end method

.method public h()Lb7/g;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/i;

    invoke-virtual {v0}, Lb7/i;->h()Lb7/g;

    move-result-object v0

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/i;

    invoke-virtual {v0}, Lb7/i;->l()Z

    move-result v0

    return v0
.end method

.method public n()Lb7/m;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/i;

    invoke-virtual {v0}, Lb7/i;->n()Lb7/m;

    move-result-object v0

    return-object v0
.end method

.method public s()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/i;

    invoke-virtual {v0}, Lb7/i;->s()Z

    move-result v0

    return v0
.end method

.method public t()Lb7/h;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/i;

    invoke-virtual {v0}, Lb7/i;->t()Lb7/h;

    move-result-object v0

    return-object v0
.end method
